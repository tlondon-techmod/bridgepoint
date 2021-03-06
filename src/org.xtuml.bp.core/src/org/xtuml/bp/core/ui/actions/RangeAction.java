package org.xtuml.bp.core.ui.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.PlatformUI;
import org.xtuml.bp.core.CorePlugin;
import org.xtuml.bp.core.Modeleventnotification_c;
import org.xtuml.bp.core.Ooaofooa;
import org.xtuml.bp.core.Range_c;
import org.xtuml.bp.core.UserDataType_c;
import org.xtuml.bp.core.common.BaseModelDelta;
import org.xtuml.bp.core.common.ModelElement;
import org.xtuml.bp.core.common.NonRootModelElement;
import org.xtuml.bp.core.common.Transaction;
import org.xtuml.bp.core.common.TransactionException;
import org.xtuml.bp.core.common.TransactionManager;
import org.xtuml.bp.core.ui.RangeValueInputValidator;
import org.xtuml.bp.core.ui.Selection;
import org.xtuml.bp.core.util.UIUtil;

public class RangeAction implements IActionDelegate {

	private String type;

	public RangeAction(String type) {
		this.type = type;
	}
	
	@Override
	public void run(IAction action) {
		UserDataType_c first = (UserDataType_c) Selection.getInstance().getSelectedNonRootModelElements()[0];
		// handle clear
		if(type.equals("Clear")) { //$NON-NLS-1$
			handleClear();
			return;
		}
		// use blank for multiple selection
		String initialValue = "";
		String typeString = "ranges";
		if(Selection.getInstance().getSelectedNonRootModelElements().length == 1) {
			typeString = "range";
			Range_c firstRange = Range_c.getOneS_RANGEOnR57(first);
			if(firstRange != null) {
				String initialMin = firstRange.getMin();
				String initialMax = firstRange.getMax();
				if(type.equals("Min")) { //$NON-NLS-1$
					initialValue = initialMin;
				} else if(type.equals("Max")) { //$NON-NLS-1$
					initialValue = initialMax;
				}
			}
		}
		boolean okPressed = UIUtil.inputDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell(),
				"Set type range", "Enter a " + type + " value for the selected type " + typeString + ".", initialValue,
				new RangeValueInputValidator() );
		if (okPressed & !UIUtil.inputDialogResult.equals(initialValue)) {
			String value = UIUtil.inputDialogResult;
			try {
				Transaction transaction = TransactionManager.getSingleton().startTransaction("Set range",
						new ModelElement[] { Ooaofooa.getDefaultInstance() });
				NonRootModelElement[] selectedNonRootModelElements = Selection.getInstance()
						.getSelectedNonRootModelElements();
				for (NonRootModelElement selected : selectedNonRootModelElements) {
					// selection guaranteed to be UserDataType
					UserDataType_c udt = (UserDataType_c) selected;
					Range_c range = Range_c.getOneS_RANGEOnR57(udt);
					if (range == null) {
						// create a range now
						range = new Range_c(udt.getModelRoot());
						Ooaofooa.getDefaultInstance()
								.fireModelElementCreated(new BaseModelDelta(Modeleventnotification_c.DELTA_NEW, range));
						range.relateAcrossR57To(udt);
					}
					if (type.equals("Min")) { //$NON-NLS-1$
						range.setMin(value);
					} else {
						range.setMax(value);
					}
				}
				TransactionManager.getSingleton().endTransaction(transaction);
			} catch (TransactionException e) {
				CorePlugin.logError("Unable to start Set range transaction.", e);
			}
		}
	}

	private void handleClear() {
		try {
			Transaction transaction = TransactionManager.getSingleton().startTransaction("Clear range",
					new ModelElement[] { Ooaofooa.getDefaultInstance() });
			NonRootModelElement[] selectedNonRootModelElements = Selection.getInstance()
					.getSelectedNonRootModelElements();
			for (NonRootModelElement selected : selectedNonRootModelElements) {
				// selection guaranteed to be UserDataType
				UserDataType_c udt = (UserDataType_c) selected;
				Range_c range = Range_c.getOneS_RANGEOnR57(udt);
				if(range != null) {
					range.unrelateAcrossR57From(udt);
					range.delete();
				}
			}
			TransactionManager.getSingleton().endTransaction(transaction);
		} catch (TransactionException e) {
			CorePlugin.logError("Unable to start Clear range transaction.", e);
		}		
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		// nothing to do
	}

}

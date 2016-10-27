/**
 * generated by Xtext 2.9.2
 */
package org.xtuml.bp.xtext.masl.masl.structure.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtuml.bp.xtext.masl.masl.structure.AbstractFeature;
import org.xtuml.bp.xtext.masl.masl.structure.Pragma;
import org.xtuml.bp.xtext.masl.masl.structure.Pragmatized;
import org.xtuml.bp.xtext.masl.masl.structure.StructurePackage;
import org.xtuml.bp.xtext.masl.masl.structure.TerminatorDefinition;
import org.xtuml.bp.xtext.masl.masl.structure.TerminatorFunctionDeclaration;
import org.xtuml.bp.xtext.masl.masl.structure.TerminatorServiceDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Terminator Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.structure.impl.TerminatorDefinitionImpl#getPragmas <em>Pragmas</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.structure.impl.TerminatorDefinitionImpl#getServices <em>Services</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.structure.impl.TerminatorDefinitionImpl#getFunctions <em>Functions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TerminatorDefinitionImpl extends AbstractNamedImpl implements TerminatorDefinition {
	/**
	 * The cached value of the '{@link #getPragmas() <em>Pragmas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPragmas()
	 * @generated
	 * @ordered
	 */
	protected EList<Pragma> pragmas;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<TerminatorServiceDeclaration> services;

	/**
	 * The cached value of the '{@link #getFunctions() <em>Functions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<TerminatorFunctionDeclaration> functions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminatorDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.TERMINATOR_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pragma> getPragmas() {
		if (pragmas == null) {
			pragmas = new EObjectContainmentEList<Pragma>(Pragma.class, this, StructurePackage.TERMINATOR_DEFINITION__PRAGMAS);
		}
		return pragmas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TerminatorServiceDeclaration> getServices() {
		if (services == null) {
			services = new EObjectContainmentEList<TerminatorServiceDeclaration>(TerminatorServiceDeclaration.class, this, StructurePackage.TERMINATOR_DEFINITION__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TerminatorFunctionDeclaration> getFunctions() {
		if (functions == null) {
			functions = new EObjectContainmentEList<TerminatorFunctionDeclaration>(TerminatorFunctionDeclaration.class, this, StructurePackage.TERMINATOR_DEFINITION__FUNCTIONS);
		}
		return functions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurePackage.TERMINATOR_DEFINITION__PRAGMAS:
				return ((InternalEList<?>)getPragmas()).basicRemove(otherEnd, msgs);
			case StructurePackage.TERMINATOR_DEFINITION__SERVICES:
				return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
			case StructurePackage.TERMINATOR_DEFINITION__FUNCTIONS:
				return ((InternalEList<?>)getFunctions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StructurePackage.TERMINATOR_DEFINITION__PRAGMAS:
				return getPragmas();
			case StructurePackage.TERMINATOR_DEFINITION__SERVICES:
				return getServices();
			case StructurePackage.TERMINATOR_DEFINITION__FUNCTIONS:
				return getFunctions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StructurePackage.TERMINATOR_DEFINITION__PRAGMAS:
				getPragmas().clear();
				getPragmas().addAll((Collection<? extends Pragma>)newValue);
				return;
			case StructurePackage.TERMINATOR_DEFINITION__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends TerminatorServiceDeclaration>)newValue);
				return;
			case StructurePackage.TERMINATOR_DEFINITION__FUNCTIONS:
				getFunctions().clear();
				getFunctions().addAll((Collection<? extends TerminatorFunctionDeclaration>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StructurePackage.TERMINATOR_DEFINITION__PRAGMAS:
				getPragmas().clear();
				return;
			case StructurePackage.TERMINATOR_DEFINITION__SERVICES:
				getServices().clear();
				return;
			case StructurePackage.TERMINATOR_DEFINITION__FUNCTIONS:
				getFunctions().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StructurePackage.TERMINATOR_DEFINITION__PRAGMAS:
				return pragmas != null && !pragmas.isEmpty();
			case StructurePackage.TERMINATOR_DEFINITION__SERVICES:
				return services != null && !services.isEmpty();
			case StructurePackage.TERMINATOR_DEFINITION__FUNCTIONS:
				return functions != null && !functions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Pragmatized.class) {
			switch (derivedFeatureID) {
				case StructurePackage.TERMINATOR_DEFINITION__PRAGMAS: return StructurePackage.PRAGMATIZED__PRAGMAS;
				default: return -1;
			}
		}
		if (baseClass == AbstractFeature.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Pragmatized.class) {
			switch (baseFeatureID) {
				case StructurePackage.PRAGMATIZED__PRAGMAS: return StructurePackage.TERMINATOR_DEFINITION__PRAGMAS;
				default: return -1;
			}
		}
		if (baseClass == AbstractFeature.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //TerminatorDefinitionImpl
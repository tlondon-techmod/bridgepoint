/**
 * generated by Xtext 2.9.2
 */
package org.xtuml.bp.xtext.masl.masl.structure.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtuml.bp.xtext.masl.masl.behavior.CodeBlock;

import org.xtuml.bp.xtext.masl.masl.structure.DomainDefinition;
import org.xtuml.bp.xtext.masl.masl.structure.DomainServiceDefinition;
import org.xtuml.bp.xtext.masl.masl.structure.Parameter;
import org.xtuml.bp.xtext.masl.masl.structure.Parameterized;
import org.xtuml.bp.xtext.masl.masl.structure.StructurePackage;
import org.xtuml.bp.xtext.masl.masl.structure.Visibility;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Service Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.structure.impl.DomainServiceDefinitionImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.structure.impl.DomainServiceDefinitionImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.structure.impl.DomainServiceDefinitionImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.structure.impl.DomainServiceDefinitionImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainServiceDefinitionImpl extends AbstractTopLevelElementImpl implements DomainServiceDefinition {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final Visibility VISIBILITY_EDEFAULT = Visibility.PUBLIC;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected Visibility visibility = VISIBILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected DomainDefinition domain;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected CodeBlock body;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainServiceDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.DOMAIN_SERVICE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, StructurePackage.DOMAIN_SERVICE_DEFINITION__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visibility getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(Visibility newVisibility) {
		Visibility oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.DOMAIN_SERVICE_DEFINITION__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainDefinition getDomain() {
		if (domain != null && domain.eIsProxy()) {
			InternalEObject oldDomain = (InternalEObject)domain;
			domain = (DomainDefinition)eResolveProxy(oldDomain);
			if (domain != oldDomain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.DOMAIN_SERVICE_DEFINITION__DOMAIN, oldDomain, domain));
			}
		}
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainDefinition basicGetDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(DomainDefinition newDomain) {
		DomainDefinition oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.DOMAIN_SERVICE_DEFINITION__DOMAIN, oldDomain, domain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeBlock getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(CodeBlock newBody, NotificationChain msgs) {
		CodeBlock oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StructurePackage.DOMAIN_SERVICE_DEFINITION__BODY, oldBody, newBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(CodeBlock newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StructurePackage.DOMAIN_SERVICE_DEFINITION__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StructurePackage.DOMAIN_SERVICE_DEFINITION__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.DOMAIN_SERVICE_DEFINITION__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurePackage.DOMAIN_SERVICE_DEFINITION__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case StructurePackage.DOMAIN_SERVICE_DEFINITION__BODY:
				return basicSetBody(null, msgs);
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
			case StructurePackage.DOMAIN_SERVICE_DEFINITION__PARAMETERS:
				return getParameters();
			case StructurePackage.DOMAIN_SERVICE_DEFINITION__VISIBILITY:
				return getVisibility();
			case StructurePackage.DOMAIN_SERVICE_DEFINITION__DOMAIN:
				if (resolve) return getDomain();
				return basicGetDomain();
			case StructurePackage.DOMAIN_SERVICE_DEFINITION__BODY:
				return getBody();
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
			case StructurePackage.DOMAIN_SERVICE_DEFINITION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case StructurePackage.DOMAIN_SERVICE_DEFINITION__VISIBILITY:
				setVisibility((Visibility)newValue);
				return;
			case StructurePackage.DOMAIN_SERVICE_DEFINITION__DOMAIN:
				setDomain((DomainDefinition)newValue);
				return;
			case StructurePackage.DOMAIN_SERVICE_DEFINITION__BODY:
				setBody((CodeBlock)newValue);
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
			case StructurePackage.DOMAIN_SERVICE_DEFINITION__PARAMETERS:
				getParameters().clear();
				return;
			case StructurePackage.DOMAIN_SERVICE_DEFINITION__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case StructurePackage.DOMAIN_SERVICE_DEFINITION__DOMAIN:
				setDomain((DomainDefinition)null);
				return;
			case StructurePackage.DOMAIN_SERVICE_DEFINITION__BODY:
				setBody((CodeBlock)null);
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
			case StructurePackage.DOMAIN_SERVICE_DEFINITION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case StructurePackage.DOMAIN_SERVICE_DEFINITION__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case StructurePackage.DOMAIN_SERVICE_DEFINITION__DOMAIN:
				return domain != null;
			case StructurePackage.DOMAIN_SERVICE_DEFINITION__BODY:
				return body != null;
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
		if (baseClass == Parameterized.class) {
			switch (derivedFeatureID) {
				case StructurePackage.DOMAIN_SERVICE_DEFINITION__PARAMETERS: return StructurePackage.PARAMETERIZED__PARAMETERS;
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
		if (baseClass == Parameterized.class) {
			switch (baseFeatureID) {
				case StructurePackage.PARAMETERIZED__PARAMETERS: return StructurePackage.DOMAIN_SERVICE_DEFINITION__PARAMETERS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (visibility: ");
		result.append(visibility);
		result.append(')');
		return result.toString();
	}

} //DomainServiceDefinitionImpl
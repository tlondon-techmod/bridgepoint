/**
 * generated by Xtext 2.9.2
 */
package org.xtuml.bp.xtext.masl.masl.types;

import org.xtuml.bp.xtext.masl.masl.behavior.Expression;

import org.xtuml.bp.xtext.masl.masl.structure.RangeTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.types.ArrayTypeReference#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.types.ArrayTypeReference#getIndexType <em>Index Type</em>}</li>
 * </ul>
 *
 * @see org.xtuml.bp.xtext.masl.masl.types.TypesPackage#getArrayTypeReference()
 * @model
 * @generated
 */
public interface ArrayTypeReference extends AbstractCollectionTypeReference {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see org.xtuml.bp.xtext.masl.masl.types.TypesPackage#getArrayTypeReference_Expression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link org.xtuml.bp.xtext.masl.masl.types.ArrayTypeReference#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Index Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Type</em>' containment reference.
	 * @see #setIndexType(RangeTypeReference)
	 * @see org.xtuml.bp.xtext.masl.masl.types.TypesPackage#getArrayTypeReference_IndexType()
	 * @model containment="true"
	 * @generated
	 */
	RangeTypeReference getIndexType();

	/**
	 * Sets the value of the '{@link org.xtuml.bp.xtext.masl.masl.types.ArrayTypeReference#getIndexType <em>Index Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index Type</em>' containment reference.
	 * @see #getIndexType()
	 * @generated
	 */
	void setIndexType(RangeTypeReference value);

} // ArrayTypeReference

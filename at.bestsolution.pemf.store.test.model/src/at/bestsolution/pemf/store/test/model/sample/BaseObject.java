/**
 */
package at.bestsolution.pemf.store.test.model.sample;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.pemf.store.test.model.sample.BaseObject#getSid <em>Sid</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.pemf.store.test.model.sample.SamplePackage#getBaseObject()
 * @model abstract="true"
 * @generated
 */
public interface BaseObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sid</em>' attribute.
	 * @see #setSid(int)
	 * @see at.bestsolution.pemf.store.test.model.sample.SamplePackage#getBaseObject_Sid()
	 * @model id="true"
	 * @generated
	 */
	int getSid();

	/**
	 * Sets the value of the '{@link at.bestsolution.pemf.store.test.model.sample.BaseObject#getSid <em>Sid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sid</em>' attribute.
	 * @see #getSid()
	 * @generated
	 */
	void setSid(int value);

} // BaseObject

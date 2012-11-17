/**
 */
package at.bestsolution.pemf.store.test.model.sample.impl;

import at.bestsolution.pemf.store.test.model.sample.BaseObject;
import at.bestsolution.pemf.store.test.model.sample.SamplePackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EStoreEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.pemf.store.test.model.sample.impl.BaseObjectImpl#getSid <em>Sid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BaseObjectImpl extends EStoreEObjectImpl implements BaseObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SamplePackage.Literals.BASE_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSid() {
		return (Integer)eGet(SamplePackage.Literals.BASE_OBJECT__SID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSid(int newSid) {
		eSet(SamplePackage.Literals.BASE_OBJECT__SID, newSid);
	}

} //BaseObjectImpl

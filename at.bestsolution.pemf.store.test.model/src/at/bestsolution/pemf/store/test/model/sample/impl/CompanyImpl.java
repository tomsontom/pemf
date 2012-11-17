/**
 */
package at.bestsolution.pemf.store.test.model.sample.impl;

import at.bestsolution.pemf.store.test.model.sample.Company;
import at.bestsolution.pemf.store.test.model.sample.Country;
import at.bestsolution.pemf.store.test.model.sample.SamplePackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EStoreEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Company</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.pemf.store.test.model.sample.impl.CompanyImpl#getName <em>Name</em>}</li>
 *   <li>{@link at.bestsolution.pemf.store.test.model.sample.impl.CompanyImpl#getCountries <em>Countries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompanyImpl extends BaseObjectImpl implements Company {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompanyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SamplePackage.Literals.COMPANY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(SamplePackage.Literals.COMPANY__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(SamplePackage.Literals.COMPANY__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Country> getCountries() {
		return (EList<Country>)eGet(SamplePackage.Literals.COMPANY__COUNTRIES, true);
	}

} //CompanyImpl

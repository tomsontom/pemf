package at.bestsolution.pemf.store.test.app;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.osgi.framework.ServiceReference;

import at.bestsolution.pemf.store.PKey;
import at.bestsolution.pemf.store.PEntityStore;
import at.bestsolution.pemf.store.PQuery;
import at.bestsolution.pemf.store.PTransaction;
import at.bestsolution.pemf.store.test.model.sample.Company;
import at.bestsolution.pemf.store.test.model.sample.Country;
import at.bestsolution.pemf.store.test.model.sample.SamplePackage;

/**
 * This class controls all aspects of the application's execution
 */
public class Application implements IApplication {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Object start(IApplicationContext context) throws Exception {
		ServiceReference<PEntityStore> ref = Activator.getContext().getServiceReference(PEntityStore.class);
		PEntityStore<EObject> service = Activator.getContext().getService(ref);

		PTransaction<EObject> transaction = service.openTransaction();
		
		Country c1 = transaction.loadEntity(new PKey(SamplePackage.Literals.COUNTRY, 1));
		try {
			System.err.println("Country: " + c1.getCompany());	
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
//		System.err.println("Test loadEntity(Key)");
//		System.err.println("=====================================");
//		PTransaction<EObject> transaction = service.openTransaction();
//		
//		Company c1 = transaction.loadEntity(new PKey(SamplePackage.Literals.COMPANY, 1));
//		System.err.println("Instance: " + c1);
//		System.err.println("Sid: " + c1.getSid());
//		System.err.println("Name: " + c1.getName());
//		System.err.println("Countries: " + c1.getCountries());
//		
//		Company c2 = transaction.loadEntity(new PKey(SamplePackage.Literals.COMPANY, 1));
//		System.err.println("Instance: " + c2);
//		
//		System.err.println(c1 == c2);
//		
//		c1.setName("Hello World");
//		
//		System.err.println("c1:" + c1.getName() + ", c2: " + c2.getName());
//		
//		PTransaction<EObject> transaction2 = service.openTransaction();
//		
//		Company c3 = transaction2.loadEntity(new PKey(SamplePackage.Literals.COMPANY, 1));
//		System.err.println("Instance: " + c3);
//		System.err.println(c3.getName());
//		
//		System.err.println();
//		System.err.println();
//		System.err.println("Test loadEntities(Query)");
//		System.err.println("=====================================");
//		List<Company> l = transaction2.loadEntities(new PQuery(SamplePackage.Literals.COMPANY).getCriteria().equal(SamplePackage.Literals.BASE_OBJECT__SID, 2).getQuery());
//		for( Company c : l ) {
//			System.err.println(c);
//			for( Country country: c.getCountries() ) {
//				System.err.println(country + " => " + country.getCompany());
//			}
//		}
//		 l = transaction2.loadEntities(new PQuery(SamplePackage.Literals.COMPANY).getCriteria().equal(SamplePackage.Literals.BASE_OBJECT__SID, 2).getQuery());
//		for( Company c : l ) {
//			System.err.println(c);
//		}
//		
		return IApplication.EXIT_OK;
	}

	public void stop() {
	}
}

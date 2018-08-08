package ca.mcgill.ecse.fairtracks.manipulations;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

public class lowerBoundArranger {
	public static void main(String[] args) throws IOException {
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		//Resource mm = rs.getResources().get(0);
		Resource mm = rs.getResource(URI.createFileURI("../ca.mcgill.ecse.fairtracks/model/generated/FairtracksDsl.ecore"), true);
		rs.getResources().get(0).load(null);
		EPackage ep =  (EPackage) mm.getContents().get(0);
		rs.getPackageRegistry().put("http://www.mcgill.ca/ecse/fairtracks/FairtracksDsl", ep);
		EcoreFactory factory = EcoreFactory.eINSTANCE;
		EClass abc = factory.createEClass();
		ep.getEClassifiers().add(abc);
		mm.save(null);
	}
}

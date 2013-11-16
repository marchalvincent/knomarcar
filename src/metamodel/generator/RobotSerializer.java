package metamodel.generator;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import metamodel.MetamodelPackage;
import metamodel.Robot;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class RobotSerializer {

	public static Robot load(File f) {
		ResourceSet rs = new ResourceSetImpl();
		Resource.Factory.Registry registry = rs.getResourceFactoryRegistry();
		Map<String, Object> m = registry.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());
		rs.getPackageRegistry().put(MetamodelPackage.eNS_URI,
				MetamodelPackage.eINSTANCE);
		URI uri = URI.createFileURI(f.getAbsolutePath());
		Resource resource = rs.getResource(uri, true);
		if (resource.isLoaded() && resource.getContents().size() > 0) {
			return (Robot) resource.getContents().get(0);
		}
		return null;
	}

	public static void save(Robot stage, File f) {
		ResourceSet rs = new ResourceSetImpl();
		Resource.Factory.Registry registry = rs.getResourceFactoryRegistry();
		Map<String, Object> m = registry.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());
		m.put("ecore", new EcoreResourceFactoryImpl());
		rs.getPackageRegistry().put(MetamodelPackage.eNS_URI,
				MetamodelPackage.eINSTANCE);
		Resource packageResource = rs.createResource(URI
				.createFileURI("Turtle.ecore"));
		packageResource.getContents().add(MetamodelPackage.eINSTANCE);
		try {
			packageResource.load(null);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		URI uri = URI.createFileURI(f.getAbsolutePath());
		Resource resource = rs.createResource(uri);
		resource.getContents().add(stage);
		try {
			HashMap<String, Boolean> options = new HashMap<String, Boolean>();
			options.put(XMIResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
			resource.save(options);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

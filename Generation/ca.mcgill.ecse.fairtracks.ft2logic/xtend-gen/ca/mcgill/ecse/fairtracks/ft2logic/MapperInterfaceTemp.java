package ca.mcgill.ecse.fairtracks.ft2logic;

import ca.mcgill.ecse.fairtracks.FairtracksDslStandaloneSetup;
import ca.mcgill.ecse.fairtracks.fairtracksDsl.FairtracksDslPackage;
import ca.mcgill.ecse.fairtracks.fairtracksDsl.Fairtracksmodel;
import ca.mcgill.ecse.fairtracks.ft2logic.Ft2Logic;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem;
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace;
import java.io.File;
import java.util.Collections;
import java.util.Map;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class MapperInterfaceTemp {
  public static void main(final String[] args) {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("outputModels/");
      final FileSystemWorkspace workspace = new FileSystemWorkspace(_builder.toString(), "");
      workspace.initAndClear();
      FairtracksDslPackage.eINSTANCE.getClass();
      FairtracksDslStandaloneSetup.doSetup();
      final Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
      final Map<String, Object> map = reg.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      map.put("xmi", _xMIResourceFactoryImpl);
      XMIResourceFactoryImpl _xMIResourceFactoryImpl_1 = new XMIResourceFactoryImpl();
      map.put("logicproblem", _xMIResourceFactoryImpl_1);
      final ResourceSetImpl resSet = new ResourceSetImpl();
      final Resource modelRes = resSet.getResource(URI.createFileURI((("inputs" + File.separator) + "model.xmi")), true);
      EObject _get = modelRes.getContents().get(0);
      final Fairtracksmodel model = ((Fairtracksmodel) _get);
      final long transformationStart = System.currentTimeMillis();
      final Ft2Logic mapper = new Ft2Logic();
      final LogicProblem logicProblem = mapper.transformModel(model);
      final URI logProbURI = URI.createFileURI((("outputModels" + File.separator) + "logProb.logicproblem"));
      final Resource logProbRes = resSet.createResource(logProbURI);
      logProbRes.getContents().add(logicProblem);
      logProbRes.save(Collections.EMPTY_MAP);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}

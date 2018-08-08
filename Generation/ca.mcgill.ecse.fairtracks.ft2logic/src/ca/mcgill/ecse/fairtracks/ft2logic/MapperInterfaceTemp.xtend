package ca.mcgill.ecse.fairtracks.ft2logic

import ca.mcgill.ecse.fairtracks.FairtracksDslStandaloneSetup
import ca.mcgill.ecse.fairtracks.fairtracksDsl.FairtracksDslPackage
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace
import java.io.PrintWriter
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import com.google.common.collect.Collections2
import java.util.Collections
import java.io.File
import ca.mcgill.ecse.fairtracks.fairtracksDsl.Fairtracksmodel

class MapperInterfaceTemp {

	def static void main(String[] args) {

		val workspace = new FileSystemWorkspace('''outputModels/''', "")
		workspace.initAndClear

		FairtracksDslPackage.eINSTANCE.class
//		val tmp = new FairtracksDslStandaloneSetupGenerated
		FairtracksDslStandaloneSetup::doSetup()

		val reg = Resource.Factory.Registry.INSTANCE
		val map = reg.extensionToFactoryMap
		map.put("xmi", new XMIResourceFactoryImpl)
		map.put("logicproblem", new XMIResourceFactoryImpl)

		val resSet = new ResourceSetImpl()
		val modelRes = resSet.getResource(URI.createFileURI("inputs" + File.separator + "model.xmi"), true)
		val model = modelRes.getContents().get(0) as Fairtracksmodel

		// Start: FT -> Logic mapping
		val transformationStart = System.currentTimeMillis

		val Ft2Logic mapper = new Ft2Logic

		val logicProblem = mapper.transformModel(model) // <- TODO
//		val logicProblem = model

//		// Write the result
//		val out = new PrintWriter("prob.logicproblem")
//		out.println(logicProblem)
//		out.close()

		// Save result as logicProblem
		val logProbURI = URI.createFileURI("outputModels" + File.separator + "logProb.logicproblem")
		val logProbRes = resSet.createResource(logProbURI)
		logProbRes.contents.add(logicProblem)
		logProbRes.save(Collections.EMPTY_MAP)

	}
}

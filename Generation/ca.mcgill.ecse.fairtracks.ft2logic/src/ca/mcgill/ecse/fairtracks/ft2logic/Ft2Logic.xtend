package ca.mcgill.ecse.fairtracks.ft2logic

import ca.mcgill.ecse.fairtracks.fairtracksDsl.Fairtracksmodel
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguageFactory
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicproblemFactory
import org.eclipse.xtend.lib.annotations.Delegate

class Ft2Logic implements FTDistanceMapper, FTObstacleMapper, FTPlayerMapper, FTZiplineMapper, FTZoneMapper {
	@Delegate protected val FTDistanceMapper distanceMapper
	@Delegate protected val FTObstacleMapper obstacleMapper
	@Delegate protected val FTPlayerMapper playerMapper
	@Delegate protected val FTZiplineMapper ziplineMapper
	@Delegate protected val FTZoneMapper zoneMapper
	
	
	val protected extension LogiclanguageFactory logicFactiory = LogiclanguageFactory.eINSTANCE
	val protected extension LogicproblemFactory problemFactory = LogicproblemFactory.eINSTANCE
//	val protected advancedConstructs = new LogicProblemBuilder_AdvancedConstructs(this)

//val extension LogicProblemBuilder builder = new LogicProblemBuilder
	
	def transformModel(Fairtracksmodel model) {
		
		
		
		var result = createLogicProblem
		
		
		
		var player1 = createIntTypeReference
		
		var p1 = createConstantDefinition => [
			it.type = createIntTypeReference
		]
		
		result.constants.add(p1)
		return result
	}
	
}
//package ca.mcgill.ecse.faitracks.queries.validation;
//
//import java.util.Iterator;
//
//import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
//import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
//import org.eclipse.viatra.query.runtime.api.ViatraQueryEngineOptions;
//import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
//import org.eclipse.viatra.query.runtime.emf.EMFScope;
//import org.eclipse.viatra.query.runtime.localsearch.matcher.integration.LocalSearchHints;
//import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
//
//import ca.mcgill.ecse.fairtracks.fairtracksDsl.FTPlayer;
//import ca.mcgill.ecse.fairtracks.queries.FairtracksQueries;
//
//public class validationRules {
//
//	public static void validationrule1(FTPlayer player) {
//
//		QueryEvaluationHint hint = LocalSearchHints.getDefault().build();
//		ViatraQueryEngineOptions options = ViatraQueryEngineOptions.defineOptions().withDefaultHint(hint)
//				.withDefaultBackend(hint.getQueryBackendFactory()).build();
//		ViatraQueryEngine queryEngine = ViatraQueryEngine.on(new EMFScope(player.eResource()), options);
//
//		for (IQuerySpecification<?> m : FairtracksQueries.instance().getSpecifications()) {
////			type type = (type) iterator.next();
//			if(m.getMatcher(queryEngine).hasMatch()) {
////				Error e = Error;
//			}
//			
//		}
//		
//
//	}
//}

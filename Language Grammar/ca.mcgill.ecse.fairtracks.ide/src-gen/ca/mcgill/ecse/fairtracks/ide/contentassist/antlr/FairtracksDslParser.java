/*
 * generated by Xtext 2.12.0
 */
package ca.mcgill.ecse.fairtracks.ide.contentassist.antlr;

import ca.mcgill.ecse.fairtracks.ide.contentassist.antlr.internal.InternalFairtracksDslParser;
import ca.mcgill.ecse.fairtracks.services.FairtracksDslGrammarAccess;
import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class FairtracksDslParser extends AbstractContentAssistParser {

	@Inject
	private FairtracksDslGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalFairtracksDslParser createParser() {
		InternalFairtracksDslParser result = new InternalFairtracksDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getFTStaticObjectAccess().getAlternatives(), "rule__FTStaticObject__Alternatives");
					put(grammarAccess.getFTObjectWithDistanceAccess().getAlternatives(), "rule__FTObjectWithDistance__Alternatives");
					put(grammarAccess.getFTObservationAccess().getAlternatives(), "rule__FTObservation__Alternatives");
					put(grammarAccess.getFTPickUpColorAccess().getAlternatives(), "rule__FTPickUpColor__Alternatives");
					put(grammarAccess.getFTRoleAccess().getAlternatives(), "rule__FTRole__Alternatives");
					put(grammarAccess.getFTZoneTypeAccess().getAlternatives(), "rule__FTZoneType__Alternatives");
					put(grammarAccess.getFTDistanceValueAccess().getAlternatives(), "rule__FTDistanceValue__Alternatives");
					put(grammarAccess.getFTSizeAccess().getAlternatives(), "rule__FTSize__Alternatives");
					put(grammarAccess.getFairtracksmodelAccess().getGroup(), "rule__Fairtracksmodel__Group__0");
					put(grammarAccess.getFTPlayerAccess().getGroup(), "rule__FTPlayer__Group__0");
					put(grammarAccess.getFTPlayerAccess().getGroup_15(), "rule__FTPlayer__Group_15__0");
					put(grammarAccess.getFTPlayerAccess().getGroup_16(), "rule__FTPlayer__Group_16__0");
					put(grammarAccess.getFTPlayerAccess().getGroup_17(), "rule__FTPlayer__Group_17__0");
					put(grammarAccess.getFTPlayerAccess().getGroup_17_3(), "rule__FTPlayer__Group_17_3__0");
					put(grammarAccess.getFTPlayerAccess().getGroup_18(), "rule__FTPlayer__Group_18__0");
					put(grammarAccess.getFTPlayerAccess().getGroup_19(), "rule__FTPlayer__Group_19__0");
					put(grammarAccess.getFTZoneAccess().getGroup(), "rule__FTZone__Group__0");
					put(grammarAccess.getFTZoneAccess().getGroup_15(), "rule__FTZone__Group_15__0");
					put(grammarAccess.getFTZoneAccess().getGroup_15_3(), "rule__FTZone__Group_15_3__0");
					put(grammarAccess.getFTZoneAccess().getGroup_16(), "rule__FTZone__Group_16__0");
					put(grammarAccess.getFTZoneAccess().getGroup_16_3(), "rule__FTZone__Group_16_3__0");
					put(grammarAccess.getFTZoneAccess().getGroup_17(), "rule__FTZone__Group_17__0");
					put(grammarAccess.getFTZoneAccess().getGroup_17_3(), "rule__FTZone__Group_17_3__0");
					put(grammarAccess.getFTZoneAccess().getGroup_18(), "rule__FTZone__Group_18__0");
					put(grammarAccess.getFTZoneAccess().getGroup_18_3(), "rule__FTZone__Group_18_3__0");
					put(grammarAccess.getFTZoneAccess().getGroup_19(), "rule__FTZone__Group_19__0");
					put(grammarAccess.getFTZoneAccess().getGroup_20(), "rule__FTZone__Group_20__0");
					put(grammarAccess.getFTObstacleAccess().getGroup(), "rule__FTObstacle__Group__0");
					put(grammarAccess.getFTObstacleAccess().getGroup_11(), "rule__FTObstacle__Group_11__0");
					put(grammarAccess.getFTObstacleAccess().getGroup_16(), "rule__FTObstacle__Group_16__0");
					put(grammarAccess.getFTObstacleAccess().getGroup_17(), "rule__FTObstacle__Group_17__0");
					put(grammarAccess.getFTObstacleAccess().getGroup_17_3(), "rule__FTObstacle__Group_17_3__0");
					put(grammarAccess.getFTObstacleAccess().getGroup_18(), "rule__FTObstacle__Group_18__0");
					put(grammarAccess.getFTObstacleAccess().getGroup_19(), "rule__FTObstacle__Group_19__0");
					put(grammarAccess.getFTZiplineAccess().getGroup(), "rule__FTZipline__Group__0");
					put(grammarAccess.getFTZiplineAccess().getGroup_19(), "rule__FTZipline__Group_19__0");
					put(grammarAccess.getFTRealCoordinatesAccess().getGroup(), "rule__FTRealCoordinates__Group__0");
					put(grammarAccess.getFTDistanceAccess().getGroup(), "rule__FTDistance__Group__0");
					put(grammarAccess.getFTTrajectoryAccess().getGroup(), "rule__FTTrajectory__Group__0");
					put(grammarAccess.getFTStateAccess().getGroup(), "rule__FTState__Group__0");
					put(grammarAccess.getFTStateAccess().getGroup_16(), "rule__FTState__Group_16__0");
					put(grammarAccess.getFTDistanceObsAccess().getGroup(), "rule__FTDistanceObs__Group__0");
					put(grammarAccess.getFTHangingObsAccess().getGroup(), "rule__FTHangingObs__Group__0");
					put(grammarAccess.getFTPickUpObsAccess().getGroup(), "rule__FTPickUpObs__Group__0");
					put(grammarAccess.getFTZoneObsAccess().getGroup(), "rule__FTZoneObs__Group__0");
					put(grammarAccess.getFairtracksmodelAccess().getStaticObjectsAssignment_0(), "rule__Fairtracksmodel__StaticObjectsAssignment_0");
					put(grammarAccess.getFairtracksmodelAccess().getInitialDistancesAssignment_1(), "rule__Fairtracksmodel__InitialDistancesAssignment_1");
					put(grammarAccess.getFTPlayerAccess().getNameAssignment_5(), "rule__FTPlayer__NameAssignment_5");
					put(grammarAccess.getFTPlayerAccess().getSizeAssignment_9(), "rule__FTPlayer__SizeAssignment_9");
					put(grammarAccess.getFTPlayerAccess().getRoleAssignment_13(), "rule__FTPlayer__RoleAssignment_13");
					put(grammarAccess.getFTPlayerAccess().getInitiallyInsideAssignment_15_2(), "rule__FTPlayer__InitiallyInsideAssignment_15_2");
					put(grammarAccess.getFTPlayerAccess().getCanPickUpObjectAssignment_16_0(), "rule__FTPlayer__CanPickUpObjectAssignment_16_0");
					put(grammarAccess.getFTPlayerAccess().getPickUpColorAssignment_17_2(), "rule__FTPlayer__PickUpColorAssignment_17_2");
					put(grammarAccess.getFTPlayerAccess().getPickUpColorAssignment_17_3_1(), "rule__FTPlayer__PickUpColorAssignment_17_3_1");
					put(grammarAccess.getFTPlayerAccess().getDistanceClassAssignment_18_2(), "rule__FTPlayer__DistanceClassAssignment_18_2");
					put(grammarAccess.getFTPlayerAccess().getCoordinatesAssignment_19_4(), "rule__FTPlayer__CoordinatesAssignment_19_4");
					put(grammarAccess.getFTPickUpColorClassAccess().getColorAssignment(), "rule__FTPickUpColorClass__ColorAssignment");
					put(grammarAccess.getFTZoneAccess().getNameAssignment_5(), "rule__FTZone__NameAssignment_5");
					put(grammarAccess.getFTZoneAccess().getSizeAssignment_9(), "rule__FTZone__SizeAssignment_9");
					put(grammarAccess.getFTZoneAccess().getTypeAssignment_13(), "rule__FTZone__TypeAssignment_13");
					put(grammarAccess.getFTZoneAccess().getContainsAssignment_15_2(), "rule__FTZone__ContainsAssignment_15_2");
					put(grammarAccess.getFTZoneAccess().getContainsAssignment_15_3_1(), "rule__FTZone__ContainsAssignment_15_3_1");
					put(grammarAccess.getFTZoneAccess().getPartiallyOverlapsAssignment_16_2(), "rule__FTZone__PartiallyOverlapsAssignment_16_2");
					put(grammarAccess.getFTZoneAccess().getPartiallyOverlapsAssignment_16_3_1(), "rule__FTZone__PartiallyOverlapsAssignment_16_3_1");
					put(grammarAccess.getFTZoneAccess().getIsAdjacentToAssignment_17_2(), "rule__FTZone__IsAdjacentToAssignment_17_2");
					put(grammarAccess.getFTZoneAccess().getIsAdjacentToAssignment_17_3_1(), "rule__FTZone__IsAdjacentToAssignment_17_3_1");
					put(grammarAccess.getFTZoneAccess().getDisallowedPlayersAssignment_18_2(), "rule__FTZone__DisallowedPlayersAssignment_18_2");
					put(grammarAccess.getFTZoneAccess().getDisallowedPlayersAssignment_18_3_1(), "rule__FTZone__DisallowedPlayersAssignment_18_3_1");
					put(grammarAccess.getFTZoneAccess().getDistanceClassAssignment_19_2(), "rule__FTZone__DistanceClassAssignment_19_2");
					put(grammarAccess.getFTZoneAccess().getCoordinatesAssignment_20_4(), "rule__FTZone__CoordinatesAssignment_20_4");
					put(grammarAccess.getFTObstacleAccess().getNameAssignment_5(), "rule__FTObstacle__NameAssignment_5");
					put(grammarAccess.getFTObstacleAccess().getSizeAssignment_9(), "rule__FTObstacle__SizeAssignment_9");
					put(grammarAccess.getFTObstacleAccess().getIsMoveableAssignment_11_0(), "rule__FTObstacle__IsMoveableAssignment_11_0");
					put(grammarAccess.getFTObstacleAccess().getColorAssignment_14(), "rule__FTObstacle__ColorAssignment_14");
					put(grammarAccess.getFTObstacleAccess().getInitiallyInsideAssignment_16_2(), "rule__FTObstacle__InitiallyInsideAssignment_16_2");
					put(grammarAccess.getFTObstacleAccess().getDisallowedZonesAssignment_17_2(), "rule__FTObstacle__DisallowedZonesAssignment_17_2");
					put(grammarAccess.getFTObstacleAccess().getDisallowedZonesAssignment_17_3_1(), "rule__FTObstacle__DisallowedZonesAssignment_17_3_1");
					put(grammarAccess.getFTObstacleAccess().getDistanceClassAssignment_18_2(), "rule__FTObstacle__DistanceClassAssignment_18_2");
					put(grammarAccess.getFTObstacleAccess().getCoordinatesAssignment_19_4(), "rule__FTObstacle__CoordinatesAssignment_19_4");
					put(grammarAccess.getFTZiplineAccess().getNameAssignment_5(), "rule__FTZipline__NameAssignment_5");
					put(grammarAccess.getFTZiplineAccess().getSizeAssignment_9(), "rule__FTZipline__SizeAssignment_9");
					put(grammarAccess.getFTZiplineAccess().getStartZoneAssignment_14(), "rule__FTZipline__StartZoneAssignment_14");
					put(grammarAccess.getFTZiplineAccess().getEndZoneAssignment_16(), "rule__FTZipline__EndZoneAssignment_16");
					put(grammarAccess.getFTZiplineAccess().getCoordinatesAssignment_19_4(), "rule__FTZipline__CoordinatesAssignment_19_4");
					put(grammarAccess.getFTRealCoordinatesAccess().getPosXAssignment_3(), "rule__FTRealCoordinates__PosXAssignment_3");
					put(grammarAccess.getFTRealCoordinatesAccess().getPosYAssignment_5(), "rule__FTRealCoordinates__PosYAssignment_5");
					put(grammarAccess.getFTRealCoordinatesAccess().getSizeXAssignment_11(), "rule__FTRealCoordinates__SizeXAssignment_11");
					put(grammarAccess.getFTRealCoordinatesAccess().getSizeYAssignment_13(), "rule__FTRealCoordinates__SizeYAssignment_13");
					put(grammarAccess.getFTDistanceAccess().getDistanceAssignment_1(), "rule__FTDistance__DistanceAssignment_1");
					put(grammarAccess.getFTDistanceAccess().getToObjectAssignment_3(), "rule__FTDistance__ToObjectAssignment_3");
					put(grammarAccess.getFTTrajectoryAccess().getPlayerAssignment_5(), "rule__FTTrajectory__PlayerAssignment_5");
					put(grammarAccess.getFTTrajectoryAccess().getStatesAssignment_10(), "rule__FTTrajectory__StatesAssignment_10");
					put(grammarAccess.getFTStateAccess().getNameAssignment_5(), "rule__FTState__NameAssignment_5");
					put(grammarAccess.getFTStateAccess().getPosXAssignment_10(), "rule__FTState__PosXAssignment_10");
					put(grammarAccess.getFTStateAccess().getPosYAssignment_12(), "rule__FTState__PosYAssignment_12");
					put(grammarAccess.getFTStateAccess().getObservationsAssignment_15(), "rule__FTState__ObservationsAssignment_15");
					put(grammarAccess.getFTStateAccess().getNextStateAssignment_16_2(), "rule__FTState__NextStateAssignment_16_2");
					put(grammarAccess.getFTDistanceObsAccess().getDistanceAssignment_2(), "rule__FTDistanceObs__DistanceAssignment_2");
					put(grammarAccess.getFTDistanceObsAccess().getObjectAssignment_3(), "rule__FTDistanceObs__ObjectAssignment_3");
					put(grammarAccess.getFTHangingObsAccess().getObjectAssignment_2(), "rule__FTHangingObs__ObjectAssignment_2");
					put(grammarAccess.getFTPickUpObsAccess().getObjectAssignment_2(), "rule__FTPickUpObs__ObjectAssignment_2");
					put(grammarAccess.getFTZoneObsAccess().getObjectAssignment_2(), "rule__FTZoneObs__ObjectAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public FairtracksDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(FairtracksDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}

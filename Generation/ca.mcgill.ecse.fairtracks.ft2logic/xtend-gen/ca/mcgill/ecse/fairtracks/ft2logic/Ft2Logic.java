package ca.mcgill.ecse.fairtracks.ft2logic;

import ca.mcgill.ecse.fairtracks.fairtracksDsl.Fairtracksmodel;
import ca.mcgill.ecse.fairtracks.ft2logic.FTDistanceMapper;
import ca.mcgill.ecse.fairtracks.ft2logic.FTObstacleMapper;
import ca.mcgill.ecse.fairtracks.ft2logic.FTPlayerMapper;
import ca.mcgill.ecse.fairtracks.ft2logic.FTZiplineMapper;
import ca.mcgill.ecse.fairtracks.ft2logic.FTZoneMapper;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ConstantDefinition;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.IntTypeReference;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguageFactory;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicproblemFactory;
import org.eclipse.xtend.lib.annotations.Delegate;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class Ft2Logic extends FTDistanceMapper implements FTObstacleMapper, FTPlayerMapper, FTZiplineMapper, FTZoneMapper {
  @Delegate
  protected final FTDistanceMapper distanceMapper;
  
  @Delegate
  protected final FTObstacleMapper obstacleMapper;
  
  @Delegate
  protected final FTPlayerMapper playerMapper;
  
  @Delegate
  protected final FTZiplineMapper ziplineMapper;
  
  @Delegate
  protected final FTZoneMapper zoneMapper;
  
  @Extension
  protected final LogiclanguageFactory logicFactiory = LogiclanguageFactory.eINSTANCE;
  
  @Extension
  protected final LogicproblemFactory problemFactory = LogicproblemFactory.eINSTANCE;
  
  public LogicProblem transformModel(final Fairtracksmodel model) {
    LogicProblem result = this.problemFactory.createLogicProblem();
    IntTypeReference player1 = this.logicFactiory.createIntTypeReference();
    ConstantDefinition _createConstantDefinition = this.logicFactiory.createConstantDefinition();
    final Procedure1<ConstantDefinition> _function = (ConstantDefinition it) -> {
      it.setType(this.logicFactiory.createIntTypeReference());
    };
    ConstantDefinition p1 = ObjectExtensions.<ConstantDefinition>operator_doubleArrow(_createConstantDefinition, _function);
    result.getConstants().add(p1);
    return result;
  }
}

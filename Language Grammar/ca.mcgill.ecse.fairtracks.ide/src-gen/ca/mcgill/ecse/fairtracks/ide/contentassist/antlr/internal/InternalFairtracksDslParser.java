package ca.mcgill.ecse.fairtracks.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import ca.mcgill.ecse.fairtracks.services.FairtracksDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFairtracksDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Red'", "'Blue'", "'Yellow'", "'White'", "'Other'", "'Attack'", "'Defense'", "'Background'", "'Green'", "'Passage'", "'Ball'", "'Search'", "'Start'", "'Zipline'", "'VeryFarFrom'", "'FarFrom'", "'CloseTo'", "'DangerouslyCloseTo'", "'Point'", "'Small'", "'Medium'", "'Big'", "'Player'", "'='", "'{'", "'name'", "':'", "';'", "'size'", "'role'", "'}'", "'inside'", "'pickUpColor'", "','", "'distance'", "'Real'", "'Coordinates'", "'['", "']'", "'Zone'", "'zoneType'", "'contains'", "'partiallyOverlaps'", "'isAdjacentTo'", "'disallowedPlayers'", "'Obstacle'", "'color'", "'disallowedZones'", "'length'", "'extremities'", "'Position'", "'('", "')'", "'Size'", "'is'", "'object'", "'State'", "'position'", "'nextState'", "'distanceIs'", "'hangingFrom'", "'pickedUp'", "'inZone'", "'canPickUp'", "'isMoveable'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalFairtracksDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFairtracksDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFairtracksDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalFairtracksDsl.g"; }


    	private FairtracksDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(FairtracksDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleFairtracksmodel"
    // InternalFairtracksDsl.g:53:1: entryRuleFairtracksmodel : ruleFairtracksmodel EOF ;
    public final void entryRuleFairtracksmodel() throws RecognitionException {
        try {
            // InternalFairtracksDsl.g:54:1: ( ruleFairtracksmodel EOF )
            // InternalFairtracksDsl.g:55:1: ruleFairtracksmodel EOF
            {
             before(grammarAccess.getFairtracksmodelRule()); 
            pushFollow(FOLLOW_1);
            ruleFairtracksmodel();

            state._fsp--;

             after(grammarAccess.getFairtracksmodelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFairtracksmodel"


    // $ANTLR start "ruleFairtracksmodel"
    // InternalFairtracksDsl.g:62:1: ruleFairtracksmodel : ( ( rule__Fairtracksmodel__Group__0 ) ) ;
    public final void ruleFairtracksmodel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:66:2: ( ( ( rule__Fairtracksmodel__Group__0 ) ) )
            // InternalFairtracksDsl.g:67:2: ( ( rule__Fairtracksmodel__Group__0 ) )
            {
            // InternalFairtracksDsl.g:67:2: ( ( rule__Fairtracksmodel__Group__0 ) )
            // InternalFairtracksDsl.g:68:3: ( rule__Fairtracksmodel__Group__0 )
            {
             before(grammarAccess.getFairtracksmodelAccess().getGroup()); 
            // InternalFairtracksDsl.g:69:3: ( rule__Fairtracksmodel__Group__0 )
            // InternalFairtracksDsl.g:69:4: rule__Fairtracksmodel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Fairtracksmodel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFairtracksmodelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFairtracksmodel"


    // $ANTLR start "entryRuleFTStaticObject"
    // InternalFairtracksDsl.g:78:1: entryRuleFTStaticObject : ruleFTStaticObject EOF ;
    public final void entryRuleFTStaticObject() throws RecognitionException {
        try {
            // InternalFairtracksDsl.g:79:1: ( ruleFTStaticObject EOF )
            // InternalFairtracksDsl.g:80:1: ruleFTStaticObject EOF
            {
             before(grammarAccess.getFTStaticObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleFTStaticObject();

            state._fsp--;

             after(grammarAccess.getFTStaticObjectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFTStaticObject"


    // $ANTLR start "ruleFTStaticObject"
    // InternalFairtracksDsl.g:87:1: ruleFTStaticObject : ( ( rule__FTStaticObject__Alternatives ) ) ;
    public final void ruleFTStaticObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:91:2: ( ( ( rule__FTStaticObject__Alternatives ) ) )
            // InternalFairtracksDsl.g:92:2: ( ( rule__FTStaticObject__Alternatives ) )
            {
            // InternalFairtracksDsl.g:92:2: ( ( rule__FTStaticObject__Alternatives ) )
            // InternalFairtracksDsl.g:93:3: ( rule__FTStaticObject__Alternatives )
            {
             before(grammarAccess.getFTStaticObjectAccess().getAlternatives()); 
            // InternalFairtracksDsl.g:94:3: ( rule__FTStaticObject__Alternatives )
            // InternalFairtracksDsl.g:94:4: rule__FTStaticObject__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FTStaticObject__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFTStaticObjectAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFTStaticObject"


    // $ANTLR start "entryRuleFTObjectWithDistance"
    // InternalFairtracksDsl.g:103:1: entryRuleFTObjectWithDistance : ruleFTObjectWithDistance EOF ;
    public final void entryRuleFTObjectWithDistance() throws RecognitionException {
        try {
            // InternalFairtracksDsl.g:104:1: ( ruleFTObjectWithDistance EOF )
            // InternalFairtracksDsl.g:105:1: ruleFTObjectWithDistance EOF
            {
             before(grammarAccess.getFTObjectWithDistanceRule()); 
            pushFollow(FOLLOW_1);
            ruleFTObjectWithDistance();

            state._fsp--;

             after(grammarAccess.getFTObjectWithDistanceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFTObjectWithDistance"


    // $ANTLR start "ruleFTObjectWithDistance"
    // InternalFairtracksDsl.g:112:1: ruleFTObjectWithDistance : ( ( rule__FTObjectWithDistance__Alternatives ) ) ;
    public final void ruleFTObjectWithDistance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:116:2: ( ( ( rule__FTObjectWithDistance__Alternatives ) ) )
            // InternalFairtracksDsl.g:117:2: ( ( rule__FTObjectWithDistance__Alternatives ) )
            {
            // InternalFairtracksDsl.g:117:2: ( ( rule__FTObjectWithDistance__Alternatives ) )
            // InternalFairtracksDsl.g:118:3: ( rule__FTObjectWithDistance__Alternatives )
            {
             before(grammarAccess.getFTObjectWithDistanceAccess().getAlternatives()); 
            // InternalFairtracksDsl.g:119:3: ( rule__FTObjectWithDistance__Alternatives )
            // InternalFairtracksDsl.g:119:4: rule__FTObjectWithDistance__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FTObjectWithDistance__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFTObjectWithDistanceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFTObjectWithDistance"


    // $ANTLR start "entryRuleFTPlayer"
    // InternalFairtracksDsl.g:128:1: entryRuleFTPlayer : ruleFTPlayer EOF ;
    public final void entryRuleFTPlayer() throws RecognitionException {
        try {
            // InternalFairtracksDsl.g:129:1: ( ruleFTPlayer EOF )
            // InternalFairtracksDsl.g:130:1: ruleFTPlayer EOF
            {
             before(grammarAccess.getFTPlayerRule()); 
            pushFollow(FOLLOW_1);
            ruleFTPlayer();

            state._fsp--;

             after(grammarAccess.getFTPlayerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFTPlayer"


    // $ANTLR start "ruleFTPlayer"
    // InternalFairtracksDsl.g:137:1: ruleFTPlayer : ( ( rule__FTPlayer__Group__0 ) ) ;
    public final void ruleFTPlayer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:141:2: ( ( ( rule__FTPlayer__Group__0 ) ) )
            // InternalFairtracksDsl.g:142:2: ( ( rule__FTPlayer__Group__0 ) )
            {
            // InternalFairtracksDsl.g:142:2: ( ( rule__FTPlayer__Group__0 ) )
            // InternalFairtracksDsl.g:143:3: ( rule__FTPlayer__Group__0 )
            {
             before(grammarAccess.getFTPlayerAccess().getGroup()); 
            // InternalFairtracksDsl.g:144:3: ( rule__FTPlayer__Group__0 )
            // InternalFairtracksDsl.g:144:4: rule__FTPlayer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FTPlayer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFTPlayerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFTPlayer"


    // $ANTLR start "entryRuleFTPickUpColorClass"
    // InternalFairtracksDsl.g:153:1: entryRuleFTPickUpColorClass : ruleFTPickUpColorClass EOF ;
    public final void entryRuleFTPickUpColorClass() throws RecognitionException {
        try {
            // InternalFairtracksDsl.g:154:1: ( ruleFTPickUpColorClass EOF )
            // InternalFairtracksDsl.g:155:1: ruleFTPickUpColorClass EOF
            {
             before(grammarAccess.getFTPickUpColorClassRule()); 
            pushFollow(FOLLOW_1);
            ruleFTPickUpColorClass();

            state._fsp--;

             after(grammarAccess.getFTPickUpColorClassRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFTPickUpColorClass"


    // $ANTLR start "ruleFTPickUpColorClass"
    // InternalFairtracksDsl.g:162:1: ruleFTPickUpColorClass : ( ( rule__FTPickUpColorClass__ColorAssignment ) ) ;
    public final void ruleFTPickUpColorClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:166:2: ( ( ( rule__FTPickUpColorClass__ColorAssignment ) ) )
            // InternalFairtracksDsl.g:167:2: ( ( rule__FTPickUpColorClass__ColorAssignment ) )
            {
            // InternalFairtracksDsl.g:167:2: ( ( rule__FTPickUpColorClass__ColorAssignment ) )
            // InternalFairtracksDsl.g:168:3: ( rule__FTPickUpColorClass__ColorAssignment )
            {
             before(grammarAccess.getFTPickUpColorClassAccess().getColorAssignment()); 
            // InternalFairtracksDsl.g:169:3: ( rule__FTPickUpColorClass__ColorAssignment )
            // InternalFairtracksDsl.g:169:4: rule__FTPickUpColorClass__ColorAssignment
            {
            pushFollow(FOLLOW_2);
            rule__FTPickUpColorClass__ColorAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFTPickUpColorClassAccess().getColorAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFTPickUpColorClass"


    // $ANTLR start "entryRuleFTZone"
    // InternalFairtracksDsl.g:178:1: entryRuleFTZone : ruleFTZone EOF ;
    public final void entryRuleFTZone() throws RecognitionException {
        try {
            // InternalFairtracksDsl.g:179:1: ( ruleFTZone EOF )
            // InternalFairtracksDsl.g:180:1: ruleFTZone EOF
            {
             before(grammarAccess.getFTZoneRule()); 
            pushFollow(FOLLOW_1);
            ruleFTZone();

            state._fsp--;

             after(grammarAccess.getFTZoneRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFTZone"


    // $ANTLR start "ruleFTZone"
    // InternalFairtracksDsl.g:187:1: ruleFTZone : ( ( rule__FTZone__Group__0 ) ) ;
    public final void ruleFTZone() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:191:2: ( ( ( rule__FTZone__Group__0 ) ) )
            // InternalFairtracksDsl.g:192:2: ( ( rule__FTZone__Group__0 ) )
            {
            // InternalFairtracksDsl.g:192:2: ( ( rule__FTZone__Group__0 ) )
            // InternalFairtracksDsl.g:193:3: ( rule__FTZone__Group__0 )
            {
             before(grammarAccess.getFTZoneAccess().getGroup()); 
            // InternalFairtracksDsl.g:194:3: ( rule__FTZone__Group__0 )
            // InternalFairtracksDsl.g:194:4: rule__FTZone__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FTZone__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFTZoneAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFTZone"


    // $ANTLR start "entryRuleFTObstacle"
    // InternalFairtracksDsl.g:203:1: entryRuleFTObstacle : ruleFTObstacle EOF ;
    public final void entryRuleFTObstacle() throws RecognitionException {
        try {
            // InternalFairtracksDsl.g:204:1: ( ruleFTObstacle EOF )
            // InternalFairtracksDsl.g:205:1: ruleFTObstacle EOF
            {
             before(grammarAccess.getFTObstacleRule()); 
            pushFollow(FOLLOW_1);
            ruleFTObstacle();

            state._fsp--;

             after(grammarAccess.getFTObstacleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFTObstacle"


    // $ANTLR start "ruleFTObstacle"
    // InternalFairtracksDsl.g:212:1: ruleFTObstacle : ( ( rule__FTObstacle__Group__0 ) ) ;
    public final void ruleFTObstacle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:216:2: ( ( ( rule__FTObstacle__Group__0 ) ) )
            // InternalFairtracksDsl.g:217:2: ( ( rule__FTObstacle__Group__0 ) )
            {
            // InternalFairtracksDsl.g:217:2: ( ( rule__FTObstacle__Group__0 ) )
            // InternalFairtracksDsl.g:218:3: ( rule__FTObstacle__Group__0 )
            {
             before(grammarAccess.getFTObstacleAccess().getGroup()); 
            // InternalFairtracksDsl.g:219:3: ( rule__FTObstacle__Group__0 )
            // InternalFairtracksDsl.g:219:4: rule__FTObstacle__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FTObstacle__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFTObstacleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFTObstacle"


    // $ANTLR start "entryRuleFTZipline"
    // InternalFairtracksDsl.g:228:1: entryRuleFTZipline : ruleFTZipline EOF ;
    public final void entryRuleFTZipline() throws RecognitionException {
        try {
            // InternalFairtracksDsl.g:229:1: ( ruleFTZipline EOF )
            // InternalFairtracksDsl.g:230:1: ruleFTZipline EOF
            {
             before(grammarAccess.getFTZiplineRule()); 
            pushFollow(FOLLOW_1);
            ruleFTZipline();

            state._fsp--;

             after(grammarAccess.getFTZiplineRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFTZipline"


    // $ANTLR start "ruleFTZipline"
    // InternalFairtracksDsl.g:237:1: ruleFTZipline : ( ( rule__FTZipline__Group__0 ) ) ;
    public final void ruleFTZipline() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:241:2: ( ( ( rule__FTZipline__Group__0 ) ) )
            // InternalFairtracksDsl.g:242:2: ( ( rule__FTZipline__Group__0 ) )
            {
            // InternalFairtracksDsl.g:242:2: ( ( rule__FTZipline__Group__0 ) )
            // InternalFairtracksDsl.g:243:3: ( rule__FTZipline__Group__0 )
            {
             before(grammarAccess.getFTZiplineAccess().getGroup()); 
            // InternalFairtracksDsl.g:244:3: ( rule__FTZipline__Group__0 )
            // InternalFairtracksDsl.g:244:4: rule__FTZipline__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FTZipline__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFTZiplineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFTZipline"


    // $ANTLR start "entryRuleFTRealCoordinates"
    // InternalFairtracksDsl.g:253:1: entryRuleFTRealCoordinates : ruleFTRealCoordinates EOF ;
    public final void entryRuleFTRealCoordinates() throws RecognitionException {
        try {
            // InternalFairtracksDsl.g:254:1: ( ruleFTRealCoordinates EOF )
            // InternalFairtracksDsl.g:255:1: ruleFTRealCoordinates EOF
            {
             before(grammarAccess.getFTRealCoordinatesRule()); 
            pushFollow(FOLLOW_1);
            ruleFTRealCoordinates();

            state._fsp--;

             after(grammarAccess.getFTRealCoordinatesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFTRealCoordinates"


    // $ANTLR start "ruleFTRealCoordinates"
    // InternalFairtracksDsl.g:262:1: ruleFTRealCoordinates : ( ( rule__FTRealCoordinates__Group__0 ) ) ;
    public final void ruleFTRealCoordinates() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:266:2: ( ( ( rule__FTRealCoordinates__Group__0 ) ) )
            // InternalFairtracksDsl.g:267:2: ( ( rule__FTRealCoordinates__Group__0 ) )
            {
            // InternalFairtracksDsl.g:267:2: ( ( rule__FTRealCoordinates__Group__0 ) )
            // InternalFairtracksDsl.g:268:3: ( rule__FTRealCoordinates__Group__0 )
            {
             before(grammarAccess.getFTRealCoordinatesAccess().getGroup()); 
            // InternalFairtracksDsl.g:269:3: ( rule__FTRealCoordinates__Group__0 )
            // InternalFairtracksDsl.g:269:4: rule__FTRealCoordinates__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FTRealCoordinates__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFTRealCoordinatesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFTRealCoordinates"


    // $ANTLR start "entryRuleFTDistance"
    // InternalFairtracksDsl.g:278:1: entryRuleFTDistance : ruleFTDistance EOF ;
    public final void entryRuleFTDistance() throws RecognitionException {
        try {
            // InternalFairtracksDsl.g:279:1: ( ruleFTDistance EOF )
            // InternalFairtracksDsl.g:280:1: ruleFTDistance EOF
            {
             before(grammarAccess.getFTDistanceRule()); 
            pushFollow(FOLLOW_1);
            ruleFTDistance();

            state._fsp--;

             after(grammarAccess.getFTDistanceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFTDistance"


    // $ANTLR start "ruleFTDistance"
    // InternalFairtracksDsl.g:287:1: ruleFTDistance : ( ( rule__FTDistance__Group__0 ) ) ;
    public final void ruleFTDistance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:291:2: ( ( ( rule__FTDistance__Group__0 ) ) )
            // InternalFairtracksDsl.g:292:2: ( ( rule__FTDistance__Group__0 ) )
            {
            // InternalFairtracksDsl.g:292:2: ( ( rule__FTDistance__Group__0 ) )
            // InternalFairtracksDsl.g:293:3: ( rule__FTDistance__Group__0 )
            {
             before(grammarAccess.getFTDistanceAccess().getGroup()); 
            // InternalFairtracksDsl.g:294:3: ( rule__FTDistance__Group__0 )
            // InternalFairtracksDsl.g:294:4: rule__FTDistance__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FTDistance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFTDistanceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFTDistance"


    // $ANTLR start "entryRuleFTState"
    // InternalFairtracksDsl.g:303:1: entryRuleFTState : ruleFTState EOF ;
    public final void entryRuleFTState() throws RecognitionException {
        try {
            // InternalFairtracksDsl.g:304:1: ( ruleFTState EOF )
            // InternalFairtracksDsl.g:305:1: ruleFTState EOF
            {
             before(grammarAccess.getFTStateRule()); 
            pushFollow(FOLLOW_1);
            ruleFTState();

            state._fsp--;

             after(grammarAccess.getFTStateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFTState"


    // $ANTLR start "ruleFTState"
    // InternalFairtracksDsl.g:312:1: ruleFTState : ( ( rule__FTState__Group__0 ) ) ;
    public final void ruleFTState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:316:2: ( ( ( rule__FTState__Group__0 ) ) )
            // InternalFairtracksDsl.g:317:2: ( ( rule__FTState__Group__0 ) )
            {
            // InternalFairtracksDsl.g:317:2: ( ( rule__FTState__Group__0 ) )
            // InternalFairtracksDsl.g:318:3: ( rule__FTState__Group__0 )
            {
             before(grammarAccess.getFTStateAccess().getGroup()); 
            // InternalFairtracksDsl.g:319:3: ( rule__FTState__Group__0 )
            // InternalFairtracksDsl.g:319:4: rule__FTState__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FTState__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFTStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFTState"


    // $ANTLR start "entryRuleFTObservation"
    // InternalFairtracksDsl.g:328:1: entryRuleFTObservation : ruleFTObservation EOF ;
    public final void entryRuleFTObservation() throws RecognitionException {
        try {
            // InternalFairtracksDsl.g:329:1: ( ruleFTObservation EOF )
            // InternalFairtracksDsl.g:330:1: ruleFTObservation EOF
            {
             before(grammarAccess.getFTObservationRule()); 
            pushFollow(FOLLOW_1);
            ruleFTObservation();

            state._fsp--;

             after(grammarAccess.getFTObservationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFTObservation"


    // $ANTLR start "ruleFTObservation"
    // InternalFairtracksDsl.g:337:1: ruleFTObservation : ( ( rule__FTObservation__Alternatives ) ) ;
    public final void ruleFTObservation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:341:2: ( ( ( rule__FTObservation__Alternatives ) ) )
            // InternalFairtracksDsl.g:342:2: ( ( rule__FTObservation__Alternatives ) )
            {
            // InternalFairtracksDsl.g:342:2: ( ( rule__FTObservation__Alternatives ) )
            // InternalFairtracksDsl.g:343:3: ( rule__FTObservation__Alternatives )
            {
             before(grammarAccess.getFTObservationAccess().getAlternatives()); 
            // InternalFairtracksDsl.g:344:3: ( rule__FTObservation__Alternatives )
            // InternalFairtracksDsl.g:344:4: rule__FTObservation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FTObservation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFTObservationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFTObservation"


    // $ANTLR start "entryRuleFTDistanceObs"
    // InternalFairtracksDsl.g:353:1: entryRuleFTDistanceObs : ruleFTDistanceObs EOF ;
    public final void entryRuleFTDistanceObs() throws RecognitionException {
        try {
            // InternalFairtracksDsl.g:354:1: ( ruleFTDistanceObs EOF )
            // InternalFairtracksDsl.g:355:1: ruleFTDistanceObs EOF
            {
             before(grammarAccess.getFTDistanceObsRule()); 
            pushFollow(FOLLOW_1);
            ruleFTDistanceObs();

            state._fsp--;

             after(grammarAccess.getFTDistanceObsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFTDistanceObs"


    // $ANTLR start "ruleFTDistanceObs"
    // InternalFairtracksDsl.g:362:1: ruleFTDistanceObs : ( ( rule__FTDistanceObs__Group__0 ) ) ;
    public final void ruleFTDistanceObs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:366:2: ( ( ( rule__FTDistanceObs__Group__0 ) ) )
            // InternalFairtracksDsl.g:367:2: ( ( rule__FTDistanceObs__Group__0 ) )
            {
            // InternalFairtracksDsl.g:367:2: ( ( rule__FTDistanceObs__Group__0 ) )
            // InternalFairtracksDsl.g:368:3: ( rule__FTDistanceObs__Group__0 )
            {
             before(grammarAccess.getFTDistanceObsAccess().getGroup()); 
            // InternalFairtracksDsl.g:369:3: ( rule__FTDistanceObs__Group__0 )
            // InternalFairtracksDsl.g:369:4: rule__FTDistanceObs__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FTDistanceObs__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFTDistanceObsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFTDistanceObs"


    // $ANTLR start "entryRuleFTHangingObs"
    // InternalFairtracksDsl.g:378:1: entryRuleFTHangingObs : ruleFTHangingObs EOF ;
    public final void entryRuleFTHangingObs() throws RecognitionException {
        try {
            // InternalFairtracksDsl.g:379:1: ( ruleFTHangingObs EOF )
            // InternalFairtracksDsl.g:380:1: ruleFTHangingObs EOF
            {
             before(grammarAccess.getFTHangingObsRule()); 
            pushFollow(FOLLOW_1);
            ruleFTHangingObs();

            state._fsp--;

             after(grammarAccess.getFTHangingObsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFTHangingObs"


    // $ANTLR start "ruleFTHangingObs"
    // InternalFairtracksDsl.g:387:1: ruleFTHangingObs : ( ( rule__FTHangingObs__Group__0 ) ) ;
    public final void ruleFTHangingObs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:391:2: ( ( ( rule__FTHangingObs__Group__0 ) ) )
            // InternalFairtracksDsl.g:392:2: ( ( rule__FTHangingObs__Group__0 ) )
            {
            // InternalFairtracksDsl.g:392:2: ( ( rule__FTHangingObs__Group__0 ) )
            // InternalFairtracksDsl.g:393:3: ( rule__FTHangingObs__Group__0 )
            {
             before(grammarAccess.getFTHangingObsAccess().getGroup()); 
            // InternalFairtracksDsl.g:394:3: ( rule__FTHangingObs__Group__0 )
            // InternalFairtracksDsl.g:394:4: rule__FTHangingObs__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FTHangingObs__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFTHangingObsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFTHangingObs"


    // $ANTLR start "entryRuleFTPickUpObs"
    // InternalFairtracksDsl.g:403:1: entryRuleFTPickUpObs : ruleFTPickUpObs EOF ;
    public final void entryRuleFTPickUpObs() throws RecognitionException {
        try {
            // InternalFairtracksDsl.g:404:1: ( ruleFTPickUpObs EOF )
            // InternalFairtracksDsl.g:405:1: ruleFTPickUpObs EOF
            {
             before(grammarAccess.getFTPickUpObsRule()); 
            pushFollow(FOLLOW_1);
            ruleFTPickUpObs();

            state._fsp--;

             after(grammarAccess.getFTPickUpObsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFTPickUpObs"


    // $ANTLR start "ruleFTPickUpObs"
    // InternalFairtracksDsl.g:412:1: ruleFTPickUpObs : ( ( rule__FTPickUpObs__Group__0 ) ) ;
    public final void ruleFTPickUpObs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:416:2: ( ( ( rule__FTPickUpObs__Group__0 ) ) )
            // InternalFairtracksDsl.g:417:2: ( ( rule__FTPickUpObs__Group__0 ) )
            {
            // InternalFairtracksDsl.g:417:2: ( ( rule__FTPickUpObs__Group__0 ) )
            // InternalFairtracksDsl.g:418:3: ( rule__FTPickUpObs__Group__0 )
            {
             before(grammarAccess.getFTPickUpObsAccess().getGroup()); 
            // InternalFairtracksDsl.g:419:3: ( rule__FTPickUpObs__Group__0 )
            // InternalFairtracksDsl.g:419:4: rule__FTPickUpObs__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FTPickUpObs__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFTPickUpObsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFTPickUpObs"


    // $ANTLR start "entryRuleFTZoneObs"
    // InternalFairtracksDsl.g:428:1: entryRuleFTZoneObs : ruleFTZoneObs EOF ;
    public final void entryRuleFTZoneObs() throws RecognitionException {
        try {
            // InternalFairtracksDsl.g:429:1: ( ruleFTZoneObs EOF )
            // InternalFairtracksDsl.g:430:1: ruleFTZoneObs EOF
            {
             before(grammarAccess.getFTZoneObsRule()); 
            pushFollow(FOLLOW_1);
            ruleFTZoneObs();

            state._fsp--;

             after(grammarAccess.getFTZoneObsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFTZoneObs"


    // $ANTLR start "ruleFTZoneObs"
    // InternalFairtracksDsl.g:437:1: ruleFTZoneObs : ( ( rule__FTZoneObs__Group__0 ) ) ;
    public final void ruleFTZoneObs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:441:2: ( ( ( rule__FTZoneObs__Group__0 ) ) )
            // InternalFairtracksDsl.g:442:2: ( ( rule__FTZoneObs__Group__0 ) )
            {
            // InternalFairtracksDsl.g:442:2: ( ( rule__FTZoneObs__Group__0 ) )
            // InternalFairtracksDsl.g:443:3: ( rule__FTZoneObs__Group__0 )
            {
             before(grammarAccess.getFTZoneObsAccess().getGroup()); 
            // InternalFairtracksDsl.g:444:3: ( rule__FTZoneObs__Group__0 )
            // InternalFairtracksDsl.g:444:4: rule__FTZoneObs__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FTZoneObs__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFTZoneObsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFTZoneObs"


    // $ANTLR start "ruleFTPickUpColor"
    // InternalFairtracksDsl.g:453:1: ruleFTPickUpColor : ( ( rule__FTPickUpColor__Alternatives ) ) ;
    public final void ruleFTPickUpColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:457:1: ( ( ( rule__FTPickUpColor__Alternatives ) ) )
            // InternalFairtracksDsl.g:458:2: ( ( rule__FTPickUpColor__Alternatives ) )
            {
            // InternalFairtracksDsl.g:458:2: ( ( rule__FTPickUpColor__Alternatives ) )
            // InternalFairtracksDsl.g:459:3: ( rule__FTPickUpColor__Alternatives )
            {
             before(grammarAccess.getFTPickUpColorAccess().getAlternatives()); 
            // InternalFairtracksDsl.g:460:3: ( rule__FTPickUpColor__Alternatives )
            // InternalFairtracksDsl.g:460:4: rule__FTPickUpColor__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FTPickUpColor__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFTPickUpColorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFTPickUpColor"


    // $ANTLR start "ruleFTRole"
    // InternalFairtracksDsl.g:469:1: ruleFTRole : ( ( rule__FTRole__Alternatives ) ) ;
    public final void ruleFTRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:473:1: ( ( ( rule__FTRole__Alternatives ) ) )
            // InternalFairtracksDsl.g:474:2: ( ( rule__FTRole__Alternatives ) )
            {
            // InternalFairtracksDsl.g:474:2: ( ( rule__FTRole__Alternatives ) )
            // InternalFairtracksDsl.g:475:3: ( rule__FTRole__Alternatives )
            {
             before(grammarAccess.getFTRoleAccess().getAlternatives()); 
            // InternalFairtracksDsl.g:476:3: ( rule__FTRole__Alternatives )
            // InternalFairtracksDsl.g:476:4: rule__FTRole__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FTRole__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFTRoleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFTRole"


    // $ANTLR start "ruleFTZoneType"
    // InternalFairtracksDsl.g:485:1: ruleFTZoneType : ( ( rule__FTZoneType__Alternatives ) ) ;
    public final void ruleFTZoneType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:489:1: ( ( ( rule__FTZoneType__Alternatives ) ) )
            // InternalFairtracksDsl.g:490:2: ( ( rule__FTZoneType__Alternatives ) )
            {
            // InternalFairtracksDsl.g:490:2: ( ( rule__FTZoneType__Alternatives ) )
            // InternalFairtracksDsl.g:491:3: ( rule__FTZoneType__Alternatives )
            {
             before(grammarAccess.getFTZoneTypeAccess().getAlternatives()); 
            // InternalFairtracksDsl.g:492:3: ( rule__FTZoneType__Alternatives )
            // InternalFairtracksDsl.g:492:4: rule__FTZoneType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FTZoneType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFTZoneTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFTZoneType"


    // $ANTLR start "ruleFTDistanceValue"
    // InternalFairtracksDsl.g:501:1: ruleFTDistanceValue : ( ( rule__FTDistanceValue__Alternatives ) ) ;
    public final void ruleFTDistanceValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:505:1: ( ( ( rule__FTDistanceValue__Alternatives ) ) )
            // InternalFairtracksDsl.g:506:2: ( ( rule__FTDistanceValue__Alternatives ) )
            {
            // InternalFairtracksDsl.g:506:2: ( ( rule__FTDistanceValue__Alternatives ) )
            // InternalFairtracksDsl.g:507:3: ( rule__FTDistanceValue__Alternatives )
            {
             before(grammarAccess.getFTDistanceValueAccess().getAlternatives()); 
            // InternalFairtracksDsl.g:508:3: ( rule__FTDistanceValue__Alternatives )
            // InternalFairtracksDsl.g:508:4: rule__FTDistanceValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FTDistanceValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFTDistanceValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFTDistanceValue"


    // $ANTLR start "ruleFTSize"
    // InternalFairtracksDsl.g:517:1: ruleFTSize : ( ( rule__FTSize__Alternatives ) ) ;
    public final void ruleFTSize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:521:1: ( ( ( rule__FTSize__Alternatives ) ) )
            // InternalFairtracksDsl.g:522:2: ( ( rule__FTSize__Alternatives ) )
            {
            // InternalFairtracksDsl.g:522:2: ( ( rule__FTSize__Alternatives ) )
            // InternalFairtracksDsl.g:523:3: ( rule__FTSize__Alternatives )
            {
             before(grammarAccess.getFTSizeAccess().getAlternatives()); 
            // InternalFairtracksDsl.g:524:3: ( rule__FTSize__Alternatives )
            // InternalFairtracksDsl.g:524:4: rule__FTSize__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FTSize__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFTSizeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFTSize"


    // $ANTLR start "rule__FTStaticObject__Alternatives"
    // InternalFairtracksDsl.g:532:1: rule__FTStaticObject__Alternatives : ( ( ruleFTObjectWithDistance ) | ( ruleFTZipline ) );
    public final void rule__FTStaticObject__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:536:1: ( ( ruleFTObjectWithDistance ) | ( ruleFTZipline ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==33||LA1_0==50||LA1_0==56) ) {
                alt1=1;
            }
            else if ( (LA1_0==24) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalFairtracksDsl.g:537:2: ( ruleFTObjectWithDistance )
                    {
                    // InternalFairtracksDsl.g:537:2: ( ruleFTObjectWithDistance )
                    // InternalFairtracksDsl.g:538:3: ruleFTObjectWithDistance
                    {
                     before(grammarAccess.getFTStaticObjectAccess().getFTObjectWithDistanceParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFTObjectWithDistance();

                    state._fsp--;

                     after(grammarAccess.getFTStaticObjectAccess().getFTObjectWithDistanceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFairtracksDsl.g:543:2: ( ruleFTZipline )
                    {
                    // InternalFairtracksDsl.g:543:2: ( ruleFTZipline )
                    // InternalFairtracksDsl.g:544:3: ruleFTZipline
                    {
                     before(grammarAccess.getFTStaticObjectAccess().getFTZiplineParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFTZipline();

                    state._fsp--;

                     after(grammarAccess.getFTStaticObjectAccess().getFTZiplineParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTStaticObject__Alternatives"


    // $ANTLR start "rule__FTObjectWithDistance__Alternatives"
    // InternalFairtracksDsl.g:553:1: rule__FTObjectWithDistance__Alternatives : ( ( ruleFTPlayer ) | ( ruleFTZone ) | ( ruleFTObstacle ) );
    public final void rule__FTObjectWithDistance__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:557:1: ( ( ruleFTPlayer ) | ( ruleFTZone ) | ( ruleFTObstacle ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt2=1;
                }
                break;
            case 50:
                {
                alt2=2;
                }
                break;
            case 56:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalFairtracksDsl.g:558:2: ( ruleFTPlayer )
                    {
                    // InternalFairtracksDsl.g:558:2: ( ruleFTPlayer )
                    // InternalFairtracksDsl.g:559:3: ruleFTPlayer
                    {
                     before(grammarAccess.getFTObjectWithDistanceAccess().getFTPlayerParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFTPlayer();

                    state._fsp--;

                     after(grammarAccess.getFTObjectWithDistanceAccess().getFTPlayerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFairtracksDsl.g:564:2: ( ruleFTZone )
                    {
                    // InternalFairtracksDsl.g:564:2: ( ruleFTZone )
                    // InternalFairtracksDsl.g:565:3: ruleFTZone
                    {
                     before(grammarAccess.getFTObjectWithDistanceAccess().getFTZoneParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFTZone();

                    state._fsp--;

                     after(grammarAccess.getFTObjectWithDistanceAccess().getFTZoneParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFairtracksDsl.g:570:2: ( ruleFTObstacle )
                    {
                    // InternalFairtracksDsl.g:570:2: ( ruleFTObstacle )
                    // InternalFairtracksDsl.g:571:3: ruleFTObstacle
                    {
                     before(grammarAccess.getFTObjectWithDistanceAccess().getFTObstacleParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFTObstacle();

                    state._fsp--;

                     after(grammarAccess.getFTObjectWithDistanceAccess().getFTObstacleParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObjectWithDistance__Alternatives"


    // $ANTLR start "rule__FTObservation__Alternatives"
    // InternalFairtracksDsl.g:580:1: rule__FTObservation__Alternatives : ( ( ruleFTDistanceObs ) | ( ruleFTHangingObs ) | ( ruleFTPickUpObs ) | ( ruleFTZoneObs ) );
    public final void rule__FTObservation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:584:1: ( ( ruleFTDistanceObs ) | ( ruleFTHangingObs ) | ( ruleFTPickUpObs ) | ( ruleFTZoneObs ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt3=1;
                }
                break;
            case 71:
                {
                alt3=2;
                }
                break;
            case 72:
                {
                alt3=3;
                }
                break;
            case 73:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalFairtracksDsl.g:585:2: ( ruleFTDistanceObs )
                    {
                    // InternalFairtracksDsl.g:585:2: ( ruleFTDistanceObs )
                    // InternalFairtracksDsl.g:586:3: ruleFTDistanceObs
                    {
                     before(grammarAccess.getFTObservationAccess().getFTDistanceObsParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFTDistanceObs();

                    state._fsp--;

                     after(grammarAccess.getFTObservationAccess().getFTDistanceObsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFairtracksDsl.g:591:2: ( ruleFTHangingObs )
                    {
                    // InternalFairtracksDsl.g:591:2: ( ruleFTHangingObs )
                    // InternalFairtracksDsl.g:592:3: ruleFTHangingObs
                    {
                     before(grammarAccess.getFTObservationAccess().getFTHangingObsParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFTHangingObs();

                    state._fsp--;

                     after(grammarAccess.getFTObservationAccess().getFTHangingObsParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFairtracksDsl.g:597:2: ( ruleFTPickUpObs )
                    {
                    // InternalFairtracksDsl.g:597:2: ( ruleFTPickUpObs )
                    // InternalFairtracksDsl.g:598:3: ruleFTPickUpObs
                    {
                     before(grammarAccess.getFTObservationAccess().getFTPickUpObsParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFTPickUpObs();

                    state._fsp--;

                     after(grammarAccess.getFTObservationAccess().getFTPickUpObsParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalFairtracksDsl.g:603:2: ( ruleFTZoneObs )
                    {
                    // InternalFairtracksDsl.g:603:2: ( ruleFTZoneObs )
                    // InternalFairtracksDsl.g:604:3: ruleFTZoneObs
                    {
                     before(grammarAccess.getFTObservationAccess().getFTZoneObsParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleFTZoneObs();

                    state._fsp--;

                     after(grammarAccess.getFTObservationAccess().getFTZoneObsParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObservation__Alternatives"


    // $ANTLR start "rule__FTPickUpColor__Alternatives"
    // InternalFairtracksDsl.g:613:1: rule__FTPickUpColor__Alternatives : ( ( ( 'Red' ) ) | ( ( 'Blue' ) ) | ( ( 'Yellow' ) ) | ( ( 'White' ) ) | ( ( 'Other' ) ) );
    public final void rule__FTPickUpColor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:617:1: ( ( ( 'Red' ) ) | ( ( 'Blue' ) ) | ( ( 'Yellow' ) ) | ( ( 'White' ) ) | ( ( 'Other' ) ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            case 14:
                {
                alt4=4;
                }
                break;
            case 15:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalFairtracksDsl.g:618:2: ( ( 'Red' ) )
                    {
                    // InternalFairtracksDsl.g:618:2: ( ( 'Red' ) )
                    // InternalFairtracksDsl.g:619:3: ( 'Red' )
                    {
                     before(grammarAccess.getFTPickUpColorAccess().getRedEnumLiteralDeclaration_0()); 
                    // InternalFairtracksDsl.g:620:3: ( 'Red' )
                    // InternalFairtracksDsl.g:620:4: 'Red'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getFTPickUpColorAccess().getRedEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFairtracksDsl.g:624:2: ( ( 'Blue' ) )
                    {
                    // InternalFairtracksDsl.g:624:2: ( ( 'Blue' ) )
                    // InternalFairtracksDsl.g:625:3: ( 'Blue' )
                    {
                     before(grammarAccess.getFTPickUpColorAccess().getBlueEnumLiteralDeclaration_1()); 
                    // InternalFairtracksDsl.g:626:3: ( 'Blue' )
                    // InternalFairtracksDsl.g:626:4: 'Blue'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getFTPickUpColorAccess().getBlueEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFairtracksDsl.g:630:2: ( ( 'Yellow' ) )
                    {
                    // InternalFairtracksDsl.g:630:2: ( ( 'Yellow' ) )
                    // InternalFairtracksDsl.g:631:3: ( 'Yellow' )
                    {
                     before(grammarAccess.getFTPickUpColorAccess().getYellowEnumLiteralDeclaration_2()); 
                    // InternalFairtracksDsl.g:632:3: ( 'Yellow' )
                    // InternalFairtracksDsl.g:632:4: 'Yellow'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getFTPickUpColorAccess().getYellowEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalFairtracksDsl.g:636:2: ( ( 'White' ) )
                    {
                    // InternalFairtracksDsl.g:636:2: ( ( 'White' ) )
                    // InternalFairtracksDsl.g:637:3: ( 'White' )
                    {
                     before(grammarAccess.getFTPickUpColorAccess().getWhiteEnumLiteralDeclaration_3()); 
                    // InternalFairtracksDsl.g:638:3: ( 'White' )
                    // InternalFairtracksDsl.g:638:4: 'White'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getFTPickUpColorAccess().getWhiteEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalFairtracksDsl.g:642:2: ( ( 'Other' ) )
                    {
                    // InternalFairtracksDsl.g:642:2: ( ( 'Other' ) )
                    // InternalFairtracksDsl.g:643:3: ( 'Other' )
                    {
                     before(grammarAccess.getFTPickUpColorAccess().getOtherEnumLiteralDeclaration_4()); 
                    // InternalFairtracksDsl.g:644:3: ( 'Other' )
                    // InternalFairtracksDsl.g:644:4: 'Other'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getFTPickUpColorAccess().getOtherEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPickUpColor__Alternatives"


    // $ANTLR start "rule__FTRole__Alternatives"
    // InternalFairtracksDsl.g:652:1: rule__FTRole__Alternatives : ( ( ( 'Attack' ) ) | ( ( 'Defense' ) ) );
    public final void rule__FTRole__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:656:1: ( ( ( 'Attack' ) ) | ( ( 'Defense' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            else if ( (LA5_0==17) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalFairtracksDsl.g:657:2: ( ( 'Attack' ) )
                    {
                    // InternalFairtracksDsl.g:657:2: ( ( 'Attack' ) )
                    // InternalFairtracksDsl.g:658:3: ( 'Attack' )
                    {
                     before(grammarAccess.getFTRoleAccess().getAttackEnumLiteralDeclaration_0()); 
                    // InternalFairtracksDsl.g:659:3: ( 'Attack' )
                    // InternalFairtracksDsl.g:659:4: 'Attack'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getFTRoleAccess().getAttackEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFairtracksDsl.g:663:2: ( ( 'Defense' ) )
                    {
                    // InternalFairtracksDsl.g:663:2: ( ( 'Defense' ) )
                    // InternalFairtracksDsl.g:664:3: ( 'Defense' )
                    {
                     before(grammarAccess.getFTRoleAccess().getDefenseEnumLiteralDeclaration_1()); 
                    // InternalFairtracksDsl.g:665:3: ( 'Defense' )
                    // InternalFairtracksDsl.g:665:4: 'Defense'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getFTRoleAccess().getDefenseEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTRole__Alternatives"


    // $ANTLR start "rule__FTZoneType__Alternatives"
    // InternalFairtracksDsl.g:673:1: rule__FTZoneType__Alternatives : ( ( ( 'Background' ) ) | ( ( 'Green' ) ) | ( ( 'Red' ) ) | ( ( 'Passage' ) ) | ( ( 'Ball' ) ) | ( ( 'Search' ) ) | ( ( 'Start' ) ) | ( ( 'Zipline' ) ) );
    public final void rule__FTZoneType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:677:1: ( ( ( 'Background' ) ) | ( ( 'Green' ) ) | ( ( 'Red' ) ) | ( ( 'Passage' ) ) | ( ( 'Ball' ) ) | ( ( 'Search' ) ) | ( ( 'Start' ) ) | ( ( 'Zipline' ) ) )
            int alt6=8;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt6=1;
                }
                break;
            case 19:
                {
                alt6=2;
                }
                break;
            case 11:
                {
                alt6=3;
                }
                break;
            case 20:
                {
                alt6=4;
                }
                break;
            case 21:
                {
                alt6=5;
                }
                break;
            case 22:
                {
                alt6=6;
                }
                break;
            case 23:
                {
                alt6=7;
                }
                break;
            case 24:
                {
                alt6=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalFairtracksDsl.g:678:2: ( ( 'Background' ) )
                    {
                    // InternalFairtracksDsl.g:678:2: ( ( 'Background' ) )
                    // InternalFairtracksDsl.g:679:3: ( 'Background' )
                    {
                     before(grammarAccess.getFTZoneTypeAccess().getBackgroundEnumLiteralDeclaration_0()); 
                    // InternalFairtracksDsl.g:680:3: ( 'Background' )
                    // InternalFairtracksDsl.g:680:4: 'Background'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getFTZoneTypeAccess().getBackgroundEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFairtracksDsl.g:684:2: ( ( 'Green' ) )
                    {
                    // InternalFairtracksDsl.g:684:2: ( ( 'Green' ) )
                    // InternalFairtracksDsl.g:685:3: ( 'Green' )
                    {
                     before(grammarAccess.getFTZoneTypeAccess().getGreenEnumLiteralDeclaration_1()); 
                    // InternalFairtracksDsl.g:686:3: ( 'Green' )
                    // InternalFairtracksDsl.g:686:4: 'Green'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getFTZoneTypeAccess().getGreenEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFairtracksDsl.g:690:2: ( ( 'Red' ) )
                    {
                    // InternalFairtracksDsl.g:690:2: ( ( 'Red' ) )
                    // InternalFairtracksDsl.g:691:3: ( 'Red' )
                    {
                     before(grammarAccess.getFTZoneTypeAccess().getRedEnumLiteralDeclaration_2()); 
                    // InternalFairtracksDsl.g:692:3: ( 'Red' )
                    // InternalFairtracksDsl.g:692:4: 'Red'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getFTZoneTypeAccess().getRedEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalFairtracksDsl.g:696:2: ( ( 'Passage' ) )
                    {
                    // InternalFairtracksDsl.g:696:2: ( ( 'Passage' ) )
                    // InternalFairtracksDsl.g:697:3: ( 'Passage' )
                    {
                     before(grammarAccess.getFTZoneTypeAccess().getPassageEnumLiteralDeclaration_3()); 
                    // InternalFairtracksDsl.g:698:3: ( 'Passage' )
                    // InternalFairtracksDsl.g:698:4: 'Passage'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getFTZoneTypeAccess().getPassageEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalFairtracksDsl.g:702:2: ( ( 'Ball' ) )
                    {
                    // InternalFairtracksDsl.g:702:2: ( ( 'Ball' ) )
                    // InternalFairtracksDsl.g:703:3: ( 'Ball' )
                    {
                     before(grammarAccess.getFTZoneTypeAccess().getBallEnumLiteralDeclaration_4()); 
                    // InternalFairtracksDsl.g:704:3: ( 'Ball' )
                    // InternalFairtracksDsl.g:704:4: 'Ball'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getFTZoneTypeAccess().getBallEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalFairtracksDsl.g:708:2: ( ( 'Search' ) )
                    {
                    // InternalFairtracksDsl.g:708:2: ( ( 'Search' ) )
                    // InternalFairtracksDsl.g:709:3: ( 'Search' )
                    {
                     before(grammarAccess.getFTZoneTypeAccess().getSearchEnumLiteralDeclaration_5()); 
                    // InternalFairtracksDsl.g:710:3: ( 'Search' )
                    // InternalFairtracksDsl.g:710:4: 'Search'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getFTZoneTypeAccess().getSearchEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalFairtracksDsl.g:714:2: ( ( 'Start' ) )
                    {
                    // InternalFairtracksDsl.g:714:2: ( ( 'Start' ) )
                    // InternalFairtracksDsl.g:715:3: ( 'Start' )
                    {
                     before(grammarAccess.getFTZoneTypeAccess().getStartEnumLiteralDeclaration_6()); 
                    // InternalFairtracksDsl.g:716:3: ( 'Start' )
                    // InternalFairtracksDsl.g:716:4: 'Start'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getFTZoneTypeAccess().getStartEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalFairtracksDsl.g:720:2: ( ( 'Zipline' ) )
                    {
                    // InternalFairtracksDsl.g:720:2: ( ( 'Zipline' ) )
                    // InternalFairtracksDsl.g:721:3: ( 'Zipline' )
                    {
                     before(grammarAccess.getFTZoneTypeAccess().getZiplineEnumLiteralDeclaration_7()); 
                    // InternalFairtracksDsl.g:722:3: ( 'Zipline' )
                    // InternalFairtracksDsl.g:722:4: 'Zipline'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getFTZoneTypeAccess().getZiplineEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZoneType__Alternatives"


    // $ANTLR start "rule__FTDistanceValue__Alternatives"
    // InternalFairtracksDsl.g:730:1: rule__FTDistanceValue__Alternatives : ( ( ( 'VeryFarFrom' ) ) | ( ( 'FarFrom' ) ) | ( ( 'CloseTo' ) ) | ( ( 'DangerouslyCloseTo' ) ) );
    public final void rule__FTDistanceValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:734:1: ( ( ( 'VeryFarFrom' ) ) | ( ( 'FarFrom' ) ) | ( ( 'CloseTo' ) ) | ( ( 'DangerouslyCloseTo' ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt7=1;
                }
                break;
            case 26:
                {
                alt7=2;
                }
                break;
            case 27:
                {
                alt7=3;
                }
                break;
            case 28:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalFairtracksDsl.g:735:2: ( ( 'VeryFarFrom' ) )
                    {
                    // InternalFairtracksDsl.g:735:2: ( ( 'VeryFarFrom' ) )
                    // InternalFairtracksDsl.g:736:3: ( 'VeryFarFrom' )
                    {
                     before(grammarAccess.getFTDistanceValueAccess().getVeryFarFromEnumLiteralDeclaration_0()); 
                    // InternalFairtracksDsl.g:737:3: ( 'VeryFarFrom' )
                    // InternalFairtracksDsl.g:737:4: 'VeryFarFrom'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getFTDistanceValueAccess().getVeryFarFromEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFairtracksDsl.g:741:2: ( ( 'FarFrom' ) )
                    {
                    // InternalFairtracksDsl.g:741:2: ( ( 'FarFrom' ) )
                    // InternalFairtracksDsl.g:742:3: ( 'FarFrom' )
                    {
                     before(grammarAccess.getFTDistanceValueAccess().getFarFromEnumLiteralDeclaration_1()); 
                    // InternalFairtracksDsl.g:743:3: ( 'FarFrom' )
                    // InternalFairtracksDsl.g:743:4: 'FarFrom'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getFTDistanceValueAccess().getFarFromEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFairtracksDsl.g:747:2: ( ( 'CloseTo' ) )
                    {
                    // InternalFairtracksDsl.g:747:2: ( ( 'CloseTo' ) )
                    // InternalFairtracksDsl.g:748:3: ( 'CloseTo' )
                    {
                     before(grammarAccess.getFTDistanceValueAccess().getCloseToEnumLiteralDeclaration_2()); 
                    // InternalFairtracksDsl.g:749:3: ( 'CloseTo' )
                    // InternalFairtracksDsl.g:749:4: 'CloseTo'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getFTDistanceValueAccess().getCloseToEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalFairtracksDsl.g:753:2: ( ( 'DangerouslyCloseTo' ) )
                    {
                    // InternalFairtracksDsl.g:753:2: ( ( 'DangerouslyCloseTo' ) )
                    // InternalFairtracksDsl.g:754:3: ( 'DangerouslyCloseTo' )
                    {
                     before(grammarAccess.getFTDistanceValueAccess().getDangerouslyCloseToEnumLiteralDeclaration_3()); 
                    // InternalFairtracksDsl.g:755:3: ( 'DangerouslyCloseTo' )
                    // InternalFairtracksDsl.g:755:4: 'DangerouslyCloseTo'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getFTDistanceValueAccess().getDangerouslyCloseToEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTDistanceValue__Alternatives"


    // $ANTLR start "rule__FTSize__Alternatives"
    // InternalFairtracksDsl.g:763:1: rule__FTSize__Alternatives : ( ( ( 'Point' ) ) | ( ( 'Small' ) ) | ( ( 'Medium' ) ) | ( ( 'Big' ) ) );
    public final void rule__FTSize__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:767:1: ( ( ( 'Point' ) ) | ( ( 'Small' ) ) | ( ( 'Medium' ) ) | ( ( 'Big' ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt8=1;
                }
                break;
            case 30:
                {
                alt8=2;
                }
                break;
            case 31:
                {
                alt8=3;
                }
                break;
            case 32:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalFairtracksDsl.g:768:2: ( ( 'Point' ) )
                    {
                    // InternalFairtracksDsl.g:768:2: ( ( 'Point' ) )
                    // InternalFairtracksDsl.g:769:3: ( 'Point' )
                    {
                     before(grammarAccess.getFTSizeAccess().getPointEnumLiteralDeclaration_0()); 
                    // InternalFairtracksDsl.g:770:3: ( 'Point' )
                    // InternalFairtracksDsl.g:770:4: 'Point'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getFTSizeAccess().getPointEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFairtracksDsl.g:774:2: ( ( 'Small' ) )
                    {
                    // InternalFairtracksDsl.g:774:2: ( ( 'Small' ) )
                    // InternalFairtracksDsl.g:775:3: ( 'Small' )
                    {
                     before(grammarAccess.getFTSizeAccess().getSmallEnumLiteralDeclaration_1()); 
                    // InternalFairtracksDsl.g:776:3: ( 'Small' )
                    // InternalFairtracksDsl.g:776:4: 'Small'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getFTSizeAccess().getSmallEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFairtracksDsl.g:780:2: ( ( 'Medium' ) )
                    {
                    // InternalFairtracksDsl.g:780:2: ( ( 'Medium' ) )
                    // InternalFairtracksDsl.g:781:3: ( 'Medium' )
                    {
                     before(grammarAccess.getFTSizeAccess().getMediumEnumLiteralDeclaration_2()); 
                    // InternalFairtracksDsl.g:782:3: ( 'Medium' )
                    // InternalFairtracksDsl.g:782:4: 'Medium'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getFTSizeAccess().getMediumEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalFairtracksDsl.g:786:2: ( ( 'Big' ) )
                    {
                    // InternalFairtracksDsl.g:786:2: ( ( 'Big' ) )
                    // InternalFairtracksDsl.g:787:3: ( 'Big' )
                    {
                     before(grammarAccess.getFTSizeAccess().getBigEnumLiteralDeclaration_3()); 
                    // InternalFairtracksDsl.g:788:3: ( 'Big' )
                    // InternalFairtracksDsl.g:788:4: 'Big'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getFTSizeAccess().getBigEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTSize__Alternatives"


    // $ANTLR start "rule__Fairtracksmodel__Group__0"
    // InternalFairtracksDsl.g:796:1: rule__Fairtracksmodel__Group__0 : rule__Fairtracksmodel__Group__0__Impl rule__Fairtracksmodel__Group__1 ;
    public final void rule__Fairtracksmodel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:800:1: ( rule__Fairtracksmodel__Group__0__Impl rule__Fairtracksmodel__Group__1 )
            // InternalFairtracksDsl.g:801:2: rule__Fairtracksmodel__Group__0__Impl rule__Fairtracksmodel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Fairtracksmodel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fairtracksmodel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fairtracksmodel__Group__0"


    // $ANTLR start "rule__Fairtracksmodel__Group__0__Impl"
    // InternalFairtracksDsl.g:808:1: rule__Fairtracksmodel__Group__0__Impl : ( ( rule__Fairtracksmodel__StaticObjectsAssignment_0 )* ) ;
    public final void rule__Fairtracksmodel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:812:1: ( ( ( rule__Fairtracksmodel__StaticObjectsAssignment_0 )* ) )
            // InternalFairtracksDsl.g:813:1: ( ( rule__Fairtracksmodel__StaticObjectsAssignment_0 )* )
            {
            // InternalFairtracksDsl.g:813:1: ( ( rule__Fairtracksmodel__StaticObjectsAssignment_0 )* )
            // InternalFairtracksDsl.g:814:2: ( rule__Fairtracksmodel__StaticObjectsAssignment_0 )*
            {
             before(grammarAccess.getFairtracksmodelAccess().getStaticObjectsAssignment_0()); 
            // InternalFairtracksDsl.g:815:2: ( rule__Fairtracksmodel__StaticObjectsAssignment_0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==24||LA9_0==33||LA9_0==50||LA9_0==56) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalFairtracksDsl.g:815:3: rule__Fairtracksmodel__StaticObjectsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Fairtracksmodel__StaticObjectsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getFairtracksmodelAccess().getStaticObjectsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fairtracksmodel__Group__0__Impl"


    // $ANTLR start "rule__Fairtracksmodel__Group__1"
    // InternalFairtracksDsl.g:823:1: rule__Fairtracksmodel__Group__1 : rule__Fairtracksmodel__Group__1__Impl ;
    public final void rule__Fairtracksmodel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:827:1: ( rule__Fairtracksmodel__Group__1__Impl )
            // InternalFairtracksDsl.g:828:2: rule__Fairtracksmodel__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fairtracksmodel__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fairtracksmodel__Group__1"


    // $ANTLR start "rule__Fairtracksmodel__Group__1__Impl"
    // InternalFairtracksDsl.g:834:1: rule__Fairtracksmodel__Group__1__Impl : ( ( rule__Fairtracksmodel__InitialDistancesAssignment_1 )* ) ;
    public final void rule__Fairtracksmodel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:838:1: ( ( ( rule__Fairtracksmodel__InitialDistancesAssignment_1 )* ) )
            // InternalFairtracksDsl.g:839:1: ( ( rule__Fairtracksmodel__InitialDistancesAssignment_1 )* )
            {
            // InternalFairtracksDsl.g:839:1: ( ( rule__Fairtracksmodel__InitialDistancesAssignment_1 )* )
            // InternalFairtracksDsl.g:840:2: ( rule__Fairtracksmodel__InitialDistancesAssignment_1 )*
            {
             before(grammarAccess.getFairtracksmodelAccess().getInitialDistancesAssignment_1()); 
            // InternalFairtracksDsl.g:841:2: ( rule__Fairtracksmodel__InitialDistancesAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==65) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalFairtracksDsl.g:841:3: rule__Fairtracksmodel__InitialDistancesAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Fairtracksmodel__InitialDistancesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getFairtracksmodelAccess().getInitialDistancesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fairtracksmodel__Group__1__Impl"


    // $ANTLR start "rule__FTPlayer__Group__0"
    // InternalFairtracksDsl.g:850:1: rule__FTPlayer__Group__0 : rule__FTPlayer__Group__0__Impl rule__FTPlayer__Group__1 ;
    public final void rule__FTPlayer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:854:1: ( rule__FTPlayer__Group__0__Impl rule__FTPlayer__Group__1 )
            // InternalFairtracksDsl.g:855:2: rule__FTPlayer__Group__0__Impl rule__FTPlayer__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__FTPlayer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTPlayer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group__0"


    // $ANTLR start "rule__FTPlayer__Group__0__Impl"
    // InternalFairtracksDsl.g:862:1: rule__FTPlayer__Group__0__Impl : ( 'Player' ) ;
    public final void rule__FTPlayer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:866:1: ( ( 'Player' ) )
            // InternalFairtracksDsl.g:867:1: ( 'Player' )
            {
            // InternalFairtracksDsl.g:867:1: ( 'Player' )
            // InternalFairtracksDsl.g:868:2: 'Player'
            {
             before(grammarAccess.getFTPlayerAccess().getPlayerKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getFTPlayerAccess().getPlayerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group__0__Impl"


    // $ANTLR start "rule__FTPlayer__Group__1"
    // InternalFairtracksDsl.g:877:1: rule__FTPlayer__Group__1 : rule__FTPlayer__Group__1__Impl rule__FTPlayer__Group__2 ;
    public final void rule__FTPlayer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:881:1: ( rule__FTPlayer__Group__1__Impl rule__FTPlayer__Group__2 )
            // InternalFairtracksDsl.g:882:2: rule__FTPlayer__Group__1__Impl rule__FTPlayer__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__FTPlayer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTPlayer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group__1"


    // $ANTLR start "rule__FTPlayer__Group__1__Impl"
    // InternalFairtracksDsl.g:889:1: rule__FTPlayer__Group__1__Impl : ( '=' ) ;
    public final void rule__FTPlayer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:893:1: ( ( '=' ) )
            // InternalFairtracksDsl.g:894:1: ( '=' )
            {
            // InternalFairtracksDsl.g:894:1: ( '=' )
            // InternalFairtracksDsl.g:895:2: '='
            {
             before(grammarAccess.getFTPlayerAccess().getEqualsSignKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getFTPlayerAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group__1__Impl"


    // $ANTLR start "rule__FTPlayer__Group__2"
    // InternalFairtracksDsl.g:904:1: rule__FTPlayer__Group__2 : rule__FTPlayer__Group__2__Impl rule__FTPlayer__Group__3 ;
    public final void rule__FTPlayer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:908:1: ( rule__FTPlayer__Group__2__Impl rule__FTPlayer__Group__3 )
            // InternalFairtracksDsl.g:909:2: rule__FTPlayer__Group__2__Impl rule__FTPlayer__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__FTPlayer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTPlayer__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group__2"


    // $ANTLR start "rule__FTPlayer__Group__2__Impl"
    // InternalFairtracksDsl.g:916:1: rule__FTPlayer__Group__2__Impl : ( '{' ) ;
    public final void rule__FTPlayer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:920:1: ( ( '{' ) )
            // InternalFairtracksDsl.g:921:1: ( '{' )
            {
            // InternalFairtracksDsl.g:921:1: ( '{' )
            // InternalFairtracksDsl.g:922:2: '{'
            {
             before(grammarAccess.getFTPlayerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getFTPlayerAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group__2__Impl"


    // $ANTLR start "rule__FTPlayer__Group__3"
    // InternalFairtracksDsl.g:931:1: rule__FTPlayer__Group__3 : rule__FTPlayer__Group__3__Impl rule__FTPlayer__Group__4 ;
    public final void rule__FTPlayer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:935:1: ( rule__FTPlayer__Group__3__Impl rule__FTPlayer__Group__4 )
            // InternalFairtracksDsl.g:936:2: rule__FTPlayer__Group__3__Impl rule__FTPlayer__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__FTPlayer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTPlayer__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group__3"


    // $ANTLR start "rule__FTPlayer__Group__3__Impl"
    // InternalFairtracksDsl.g:943:1: rule__FTPlayer__Group__3__Impl : ( 'name' ) ;
    public final void rule__FTPlayer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:947:1: ( ( 'name' ) )
            // InternalFairtracksDsl.g:948:1: ( 'name' )
            {
            // InternalFairtracksDsl.g:948:1: ( 'name' )
            // InternalFairtracksDsl.g:949:2: 'name'
            {
             before(grammarAccess.getFTPlayerAccess().getNameKeyword_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getFTPlayerAccess().getNameKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group__3__Impl"


    // $ANTLR start "rule__FTPlayer__Group__4"
    // InternalFairtracksDsl.g:958:1: rule__FTPlayer__Group__4 : rule__FTPlayer__Group__4__Impl rule__FTPlayer__Group__5 ;
    public final void rule__FTPlayer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:962:1: ( rule__FTPlayer__Group__4__Impl rule__FTPlayer__Group__5 )
            // InternalFairtracksDsl.g:963:2: rule__FTPlayer__Group__4__Impl rule__FTPlayer__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__FTPlayer__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTPlayer__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group__4"


    // $ANTLR start "rule__FTPlayer__Group__4__Impl"
    // InternalFairtracksDsl.g:970:1: rule__FTPlayer__Group__4__Impl : ( ':' ) ;
    public final void rule__FTPlayer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:974:1: ( ( ':' ) )
            // InternalFairtracksDsl.g:975:1: ( ':' )
            {
            // InternalFairtracksDsl.g:975:1: ( ':' )
            // InternalFairtracksDsl.g:976:2: ':'
            {
             before(grammarAccess.getFTPlayerAccess().getColonKeyword_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getFTPlayerAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group__4__Impl"


    // $ANTLR start "rule__FTPlayer__Group__5"
    // InternalFairtracksDsl.g:985:1: rule__FTPlayer__Group__5 : rule__FTPlayer__Group__5__Impl rule__FTPlayer__Group__6 ;
    public final void rule__FTPlayer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:989:1: ( rule__FTPlayer__Group__5__Impl rule__FTPlayer__Group__6 )
            // InternalFairtracksDsl.g:990:2: rule__FTPlayer__Group__5__Impl rule__FTPlayer__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__FTPlayer__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTPlayer__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group__5"


    // $ANTLR start "rule__FTPlayer__Group__5__Impl"
    // InternalFairtracksDsl.g:997:1: rule__FTPlayer__Group__5__Impl : ( ( rule__FTPlayer__NameAssignment_5 ) ) ;
    public final void rule__FTPlayer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1001:1: ( ( ( rule__FTPlayer__NameAssignment_5 ) ) )
            // InternalFairtracksDsl.g:1002:1: ( ( rule__FTPlayer__NameAssignment_5 ) )
            {
            // InternalFairtracksDsl.g:1002:1: ( ( rule__FTPlayer__NameAssignment_5 ) )
            // InternalFairtracksDsl.g:1003:2: ( rule__FTPlayer__NameAssignment_5 )
            {
             before(grammarAccess.getFTPlayerAccess().getNameAssignment_5()); 
            // InternalFairtracksDsl.g:1004:2: ( rule__FTPlayer__NameAssignment_5 )
            // InternalFairtracksDsl.g:1004:3: rule__FTPlayer__NameAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__FTPlayer__NameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getFTPlayerAccess().getNameAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group__5__Impl"


    // $ANTLR start "rule__FTPlayer__Group__6"
    // InternalFairtracksDsl.g:1012:1: rule__FTPlayer__Group__6 : rule__FTPlayer__Group__6__Impl rule__FTPlayer__Group__7 ;
    public final void rule__FTPlayer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1016:1: ( rule__FTPlayer__Group__6__Impl rule__FTPlayer__Group__7 )
            // InternalFairtracksDsl.g:1017:2: rule__FTPlayer__Group__6__Impl rule__FTPlayer__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__FTPlayer__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTPlayer__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group__6"


    // $ANTLR start "rule__FTPlayer__Group__6__Impl"
    // InternalFairtracksDsl.g:1024:1: rule__FTPlayer__Group__6__Impl : ( ';' ) ;
    public final void rule__FTPlayer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1028:1: ( ( ';' ) )
            // InternalFairtracksDsl.g:1029:1: ( ';' )
            {
            // InternalFairtracksDsl.g:1029:1: ( ';' )
            // InternalFairtracksDsl.g:1030:2: ';'
            {
             before(grammarAccess.getFTPlayerAccess().getSemicolonKeyword_6()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getFTPlayerAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group__6__Impl"


    // $ANTLR start "rule__FTPlayer__Group__7"
    // InternalFairtracksDsl.g:1039:1: rule__FTPlayer__Group__7 : rule__FTPlayer__Group__7__Impl rule__FTPlayer__Group__8 ;
    public final void rule__FTPlayer__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1043:1: ( rule__FTPlayer__Group__7__Impl rule__FTPlayer__Group__8 )
            // InternalFairtracksDsl.g:1044:2: rule__FTPlayer__Group__7__Impl rule__FTPlayer__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__FTPlayer__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTPlayer__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group__7"


    // $ANTLR start "rule__FTPlayer__Group__7__Impl"
    // InternalFairtracksDsl.g:1051:1: rule__FTPlayer__Group__7__Impl : ( 'size' ) ;
    public final void rule__FTPlayer__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1055:1: ( ( 'size' ) )
            // InternalFairtracksDsl.g:1056:1: ( 'size' )
            {
            // InternalFairtracksDsl.g:1056:1: ( 'size' )
            // InternalFairtracksDsl.g:1057:2: 'size'
            {
             before(grammarAccess.getFTPlayerAccess().getSizeKeyword_7()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getFTPlayerAccess().getSizeKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group__7__Impl"


    // $ANTLR start "rule__FTPlayer__Group__8"
    // InternalFairtracksDsl.g:1066:1: rule__FTPlayer__Group__8 : rule__FTPlayer__Group__8__Impl rule__FTPlayer__Group__9 ;
    public final void rule__FTPlayer__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1070:1: ( rule__FTPlayer__Group__8__Impl rule__FTPlayer__Group__9 )
            // InternalFairtracksDsl.g:1071:2: rule__FTPlayer__Group__8__Impl rule__FTPlayer__Group__9
            {
            pushFollow(FOLLOW_13);
            rule__FTPlayer__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTPlayer__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group__8"


    // $ANTLR start "rule__FTPlayer__Group__8__Impl"
    // InternalFairtracksDsl.g:1078:1: rule__FTPlayer__Group__8__Impl : ( ':' ) ;
    public final void rule__FTPlayer__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1082:1: ( ( ':' ) )
            // InternalFairtracksDsl.g:1083:1: ( ':' )
            {
            // InternalFairtracksDsl.g:1083:1: ( ':' )
            // InternalFairtracksDsl.g:1084:2: ':'
            {
             before(grammarAccess.getFTPlayerAccess().getColonKeyword_8()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getFTPlayerAccess().getColonKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group__8__Impl"


    // $ANTLR start "rule__FTPlayer__Group__9"
    // InternalFairtracksDsl.g:1093:1: rule__FTPlayer__Group__9 : rule__FTPlayer__Group__9__Impl rule__FTPlayer__Group__10 ;
    public final void rule__FTPlayer__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1097:1: ( rule__FTPlayer__Group__9__Impl rule__FTPlayer__Group__10 )
            // InternalFairtracksDsl.g:1098:2: rule__FTPlayer__Group__9__Impl rule__FTPlayer__Group__10
            {
            pushFollow(FOLLOW_11);
            rule__FTPlayer__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTPlayer__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group__9"


    // $ANTLR start "rule__FTPlayer__Group__9__Impl"
    // InternalFairtracksDsl.g:1105:1: rule__FTPlayer__Group__9__Impl : ( ( rule__FTPlayer__SizeAssignment_9 ) ) ;
    public final void rule__FTPlayer__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1109:1: ( ( ( rule__FTPlayer__SizeAssignment_9 ) ) )
            // InternalFairtracksDsl.g:1110:1: ( ( rule__FTPlayer__SizeAssignment_9 ) )
            {
            // InternalFairtracksDsl.g:1110:1: ( ( rule__FTPlayer__SizeAssignment_9 ) )
            // InternalFairtracksDsl.g:1111:2: ( rule__FTPlayer__SizeAssignment_9 )
            {
             before(grammarAccess.getFTPlayerAccess().getSizeAssignment_9()); 
            // InternalFairtracksDsl.g:1112:2: ( rule__FTPlayer__SizeAssignment_9 )
            // InternalFairtracksDsl.g:1112:3: rule__FTPlayer__SizeAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__FTPlayer__SizeAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getFTPlayerAccess().getSizeAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group__9__Impl"


    // $ANTLR start "rule__FTPlayer__Group__10"
    // InternalFairtracksDsl.g:1120:1: rule__FTPlayer__Group__10 : rule__FTPlayer__Group__10__Impl rule__FTPlayer__Group__11 ;
    public final void rule__FTPlayer__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1124:1: ( rule__FTPlayer__Group__10__Impl rule__FTPlayer__Group__11 )
            // InternalFairtracksDsl.g:1125:2: rule__FTPlayer__Group__10__Impl rule__FTPlayer__Group__11
            {
            pushFollow(FOLLOW_14);
            rule__FTPlayer__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTPlayer__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group__10"


    // $ANTLR start "rule__FTPlayer__Group__10__Impl"
    // InternalFairtracksDsl.g:1132:1: rule__FTPlayer__Group__10__Impl : ( ';' ) ;
    public final void rule__FTPlayer__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1136:1: ( ( ';' ) )
            // InternalFairtracksDsl.g:1137:1: ( ';' )
            {
            // InternalFairtracksDsl.g:1137:1: ( ';' )
            // InternalFairtracksDsl.g:1138:2: ';'
            {
             before(grammarAccess.getFTPlayerAccess().getSemicolonKeyword_10()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getFTPlayerAccess().getSemicolonKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group__10__Impl"


    // $ANTLR start "rule__FTPlayer__Group__11"
    // InternalFairtracksDsl.g:1147:1: rule__FTPlayer__Group__11 : rule__FTPlayer__Group__11__Impl rule__FTPlayer__Group__12 ;
    public final void rule__FTPlayer__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1151:1: ( rule__FTPlayer__Group__11__Impl rule__FTPlayer__Group__12 )
            // InternalFairtracksDsl.g:1152:2: rule__FTPlayer__Group__11__Impl rule__FTPlayer__Group__12
            {
            pushFollow(FOLLOW_9);
            rule__FTPlayer__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTPlayer__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group__11"


    // $ANTLR start "rule__FTPlayer__Group__11__Impl"
    // InternalFairtracksDsl.g:1159:1: rule__FTPlayer__Group__11__Impl : ( 'role' ) ;
    public final void rule__FTPlayer__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1163:1: ( ( 'role' ) )
            // InternalFairtracksDsl.g:1164:1: ( 'role' )
            {
            // InternalFairtracksDsl.g:1164:1: ( 'role' )
            // InternalFairtracksDsl.g:1165:2: 'role'
            {
             before(grammarAccess.getFTPlayerAccess().getRoleKeyword_11()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getFTPlayerAccess().getRoleKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group__11__Impl"


    // $ANTLR start "rule__FTPlayer__Group__12"
    // InternalFairtracksDsl.g:1174:1: rule__FTPlayer__Group__12 : rule__FTPlayer__Group__12__Impl rule__FTPlayer__Group__13 ;
    public final void rule__FTPlayer__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1178:1: ( rule__FTPlayer__Group__12__Impl rule__FTPlayer__Group__13 )
            // InternalFairtracksDsl.g:1179:2: rule__FTPlayer__Group__12__Impl rule__FTPlayer__Group__13
            {
            pushFollow(FOLLOW_15);
            rule__FTPlayer__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTPlayer__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group__12"


    // $ANTLR start "rule__FTPlayer__Group__12__Impl"
    // InternalFairtracksDsl.g:1186:1: rule__FTPlayer__Group__12__Impl : ( ':' ) ;
    public final void rule__FTPlayer__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1190:1: ( ( ':' ) )
            // InternalFairtracksDsl.g:1191:1: ( ':' )
            {
            // InternalFairtracksDsl.g:1191:1: ( ':' )
            // InternalFairtracksDsl.g:1192:2: ':'
            {
             before(grammarAccess.getFTPlayerAccess().getColonKeyword_12()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getFTPlayerAccess().getColonKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group__12__Impl"


    // $ANTLR start "rule__FTPlayer__Group__13"
    // InternalFairtracksDsl.g:1201:1: rule__FTPlayer__Group__13 : rule__FTPlayer__Group__13__Impl rule__FTPlayer__Group__14 ;
    public final void rule__FTPlayer__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1205:1: ( rule__FTPlayer__Group__13__Impl rule__FTPlayer__Group__14 )
            // InternalFairtracksDsl.g:1206:2: rule__FTPlayer__Group__13__Impl rule__FTPlayer__Group__14
            {
            pushFollow(FOLLOW_11);
            rule__FTPlayer__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTPlayer__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group__13"


    // $ANTLR start "rule__FTPlayer__Group__13__Impl"
    // InternalFairtracksDsl.g:1213:1: rule__FTPlayer__Group__13__Impl : ( ( rule__FTPlayer__RoleAssignment_13 ) ) ;
    public final void rule__FTPlayer__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1217:1: ( ( ( rule__FTPlayer__RoleAssignment_13 ) ) )
            // InternalFairtracksDsl.g:1218:1: ( ( rule__FTPlayer__RoleAssignment_13 ) )
            {
            // InternalFairtracksDsl.g:1218:1: ( ( rule__FTPlayer__RoleAssignment_13 ) )
            // InternalFairtracksDsl.g:1219:2: ( rule__FTPlayer__RoleAssignment_13 )
            {
             before(grammarAccess.getFTPlayerAccess().getRoleAssignment_13()); 
            // InternalFairtracksDsl.g:1220:2: ( rule__FTPlayer__RoleAssignment_13 )
            // InternalFairtracksDsl.g:1220:3: rule__FTPlayer__RoleAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__FTPlayer__RoleAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getFTPlayerAccess().getRoleAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group__13__Impl"


    // $ANTLR start "rule__FTPlayer__Group__14"
    // InternalFairtracksDsl.g:1228:1: rule__FTPlayer__Group__14 : rule__FTPlayer__Group__14__Impl rule__FTPlayer__Group__15 ;
    public final void rule__FTPlayer__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1232:1: ( rule__FTPlayer__Group__14__Impl rule__FTPlayer__Group__15 )
            // InternalFairtracksDsl.g:1233:2: rule__FTPlayer__Group__14__Impl rule__FTPlayer__Group__15
            {
            pushFollow(FOLLOW_16);
            rule__FTPlayer__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTPlayer__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group__14"


    // $ANTLR start "rule__FTPlayer__Group__14__Impl"
    // InternalFairtracksDsl.g:1240:1: rule__FTPlayer__Group__14__Impl : ( ';' ) ;
    public final void rule__FTPlayer__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1244:1: ( ( ';' ) )
            // InternalFairtracksDsl.g:1245:1: ( ';' )
            {
            // InternalFairtracksDsl.g:1245:1: ( ';' )
            // InternalFairtracksDsl.g:1246:2: ';'
            {
             before(grammarAccess.getFTPlayerAccess().getSemicolonKeyword_14()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getFTPlayerAccess().getSemicolonKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group__14__Impl"


    // $ANTLR start "rule__FTPlayer__Group__15"
    // InternalFairtracksDsl.g:1255:1: rule__FTPlayer__Group__15 : rule__FTPlayer__Group__15__Impl rule__FTPlayer__Group__16 ;
    public final void rule__FTPlayer__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1259:1: ( rule__FTPlayer__Group__15__Impl rule__FTPlayer__Group__16 )
            // InternalFairtracksDsl.g:1260:2: rule__FTPlayer__Group__15__Impl rule__FTPlayer__Group__16
            {
            pushFollow(FOLLOW_16);
            rule__FTPlayer__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTPlayer__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group__15"


    // $ANTLR start "rule__FTPlayer__Group__15__Impl"
    // InternalFairtracksDsl.g:1267:1: rule__FTPlayer__Group__15__Impl : ( ( rule__FTPlayer__Group_15__0 )? ) ;
    public final void rule__FTPlayer__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1271:1: ( ( ( rule__FTPlayer__Group_15__0 )? ) )
            // InternalFairtracksDsl.g:1272:1: ( ( rule__FTPlayer__Group_15__0 )? )
            {
            // InternalFairtracksDsl.g:1272:1: ( ( rule__FTPlayer__Group_15__0 )? )
            // InternalFairtracksDsl.g:1273:2: ( rule__FTPlayer__Group_15__0 )?
            {
             before(grammarAccess.getFTPlayerAccess().getGroup_15()); 
            // InternalFairtracksDsl.g:1274:2: ( rule__FTPlayer__Group_15__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==42) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalFairtracksDsl.g:1274:3: rule__FTPlayer__Group_15__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FTPlayer__Group_15__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFTPlayerAccess().getGroup_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group__15__Impl"


    // $ANTLR start "rule__FTPlayer__Group__16"
    // InternalFairtracksDsl.g:1282:1: rule__FTPlayer__Group__16 : rule__FTPlayer__Group__16__Impl rule__FTPlayer__Group__17 ;
    public final void rule__FTPlayer__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1286:1: ( rule__FTPlayer__Group__16__Impl rule__FTPlayer__Group__17 )
            // InternalFairtracksDsl.g:1287:2: rule__FTPlayer__Group__16__Impl rule__FTPlayer__Group__17
            {
            pushFollow(FOLLOW_16);
            rule__FTPlayer__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTPlayer__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group__16"


    // $ANTLR start "rule__FTPlayer__Group__16__Impl"
    // InternalFairtracksDsl.g:1294:1: rule__FTPlayer__Group__16__Impl : ( ( rule__FTPlayer__Group_16__0 )? ) ;
    public final void rule__FTPlayer__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1298:1: ( ( ( rule__FTPlayer__Group_16__0 )? ) )
            // InternalFairtracksDsl.g:1299:1: ( ( rule__FTPlayer__Group_16__0 )? )
            {
            // InternalFairtracksDsl.g:1299:1: ( ( rule__FTPlayer__Group_16__0 )? )
            // InternalFairtracksDsl.g:1300:2: ( rule__FTPlayer__Group_16__0 )?
            {
             before(grammarAccess.getFTPlayerAccess().getGroup_16()); 
            // InternalFairtracksDsl.g:1301:2: ( rule__FTPlayer__Group_16__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==74) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalFairtracksDsl.g:1301:3: rule__FTPlayer__Group_16__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FTPlayer__Group_16__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFTPlayerAccess().getGroup_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group__16__Impl"


    // $ANTLR start "rule__FTPlayer__Group__17"
    // InternalFairtracksDsl.g:1309:1: rule__FTPlayer__Group__17 : rule__FTPlayer__Group__17__Impl rule__FTPlayer__Group__18 ;
    public final void rule__FTPlayer__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1313:1: ( rule__FTPlayer__Group__17__Impl rule__FTPlayer__Group__18 )
            // InternalFairtracksDsl.g:1314:2: rule__FTPlayer__Group__17__Impl rule__FTPlayer__Group__18
            {
            pushFollow(FOLLOW_16);
            rule__FTPlayer__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTPlayer__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group__17"


    // $ANTLR start "rule__FTPlayer__Group__17__Impl"
    // InternalFairtracksDsl.g:1321:1: rule__FTPlayer__Group__17__Impl : ( ( rule__FTPlayer__Group_17__0 )? ) ;
    public final void rule__FTPlayer__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1325:1: ( ( ( rule__FTPlayer__Group_17__0 )? ) )
            // InternalFairtracksDsl.g:1326:1: ( ( rule__FTPlayer__Group_17__0 )? )
            {
            // InternalFairtracksDsl.g:1326:1: ( ( rule__FTPlayer__Group_17__0 )? )
            // InternalFairtracksDsl.g:1327:2: ( rule__FTPlayer__Group_17__0 )?
            {
             before(grammarAccess.getFTPlayerAccess().getGroup_17()); 
            // InternalFairtracksDsl.g:1328:2: ( rule__FTPlayer__Group_17__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==43) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalFairtracksDsl.g:1328:3: rule__FTPlayer__Group_17__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FTPlayer__Group_17__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFTPlayerAccess().getGroup_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group__17__Impl"


    // $ANTLR start "rule__FTPlayer__Group__18"
    // InternalFairtracksDsl.g:1336:1: rule__FTPlayer__Group__18 : rule__FTPlayer__Group__18__Impl rule__FTPlayer__Group__19 ;
    public final void rule__FTPlayer__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1340:1: ( rule__FTPlayer__Group__18__Impl rule__FTPlayer__Group__19 )
            // InternalFairtracksDsl.g:1341:2: rule__FTPlayer__Group__18__Impl rule__FTPlayer__Group__19
            {
            pushFollow(FOLLOW_16);
            rule__FTPlayer__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTPlayer__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group__18"


    // $ANTLR start "rule__FTPlayer__Group__18__Impl"
    // InternalFairtracksDsl.g:1348:1: rule__FTPlayer__Group__18__Impl : ( ( rule__FTPlayer__Group_18__0 )* ) ;
    public final void rule__FTPlayer__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1352:1: ( ( ( rule__FTPlayer__Group_18__0 )* ) )
            // InternalFairtracksDsl.g:1353:1: ( ( rule__FTPlayer__Group_18__0 )* )
            {
            // InternalFairtracksDsl.g:1353:1: ( ( rule__FTPlayer__Group_18__0 )* )
            // InternalFairtracksDsl.g:1354:2: ( rule__FTPlayer__Group_18__0 )*
            {
             before(grammarAccess.getFTPlayerAccess().getGroup_18()); 
            // InternalFairtracksDsl.g:1355:2: ( rule__FTPlayer__Group_18__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==45) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalFairtracksDsl.g:1355:3: rule__FTPlayer__Group_18__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__FTPlayer__Group_18__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getFTPlayerAccess().getGroup_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group__18__Impl"


    // $ANTLR start "rule__FTPlayer__Group__19"
    // InternalFairtracksDsl.g:1363:1: rule__FTPlayer__Group__19 : rule__FTPlayer__Group__19__Impl rule__FTPlayer__Group__20 ;
    public final void rule__FTPlayer__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1367:1: ( rule__FTPlayer__Group__19__Impl rule__FTPlayer__Group__20 )
            // InternalFairtracksDsl.g:1368:2: rule__FTPlayer__Group__19__Impl rule__FTPlayer__Group__20
            {
            pushFollow(FOLLOW_16);
            rule__FTPlayer__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTPlayer__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group__19"


    // $ANTLR start "rule__FTPlayer__Group__19__Impl"
    // InternalFairtracksDsl.g:1375:1: rule__FTPlayer__Group__19__Impl : ( ( rule__FTPlayer__Group_19__0 )? ) ;
    public final void rule__FTPlayer__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1379:1: ( ( ( rule__FTPlayer__Group_19__0 )? ) )
            // InternalFairtracksDsl.g:1380:1: ( ( rule__FTPlayer__Group_19__0 )? )
            {
            // InternalFairtracksDsl.g:1380:1: ( ( rule__FTPlayer__Group_19__0 )? )
            // InternalFairtracksDsl.g:1381:2: ( rule__FTPlayer__Group_19__0 )?
            {
             before(grammarAccess.getFTPlayerAccess().getGroup_19()); 
            // InternalFairtracksDsl.g:1382:2: ( rule__FTPlayer__Group_19__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==46) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalFairtracksDsl.g:1382:3: rule__FTPlayer__Group_19__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FTPlayer__Group_19__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFTPlayerAccess().getGroup_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group__19__Impl"


    // $ANTLR start "rule__FTPlayer__Group__20"
    // InternalFairtracksDsl.g:1390:1: rule__FTPlayer__Group__20 : rule__FTPlayer__Group__20__Impl ;
    public final void rule__FTPlayer__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1394:1: ( rule__FTPlayer__Group__20__Impl )
            // InternalFairtracksDsl.g:1395:2: rule__FTPlayer__Group__20__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FTPlayer__Group__20__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group__20"


    // $ANTLR start "rule__FTPlayer__Group__20__Impl"
    // InternalFairtracksDsl.g:1401:1: rule__FTPlayer__Group__20__Impl : ( '}' ) ;
    public final void rule__FTPlayer__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1405:1: ( ( '}' ) )
            // InternalFairtracksDsl.g:1406:1: ( '}' )
            {
            // InternalFairtracksDsl.g:1406:1: ( '}' )
            // InternalFairtracksDsl.g:1407:2: '}'
            {
             before(grammarAccess.getFTPlayerAccess().getRightCurlyBracketKeyword_20()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getFTPlayerAccess().getRightCurlyBracketKeyword_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group__20__Impl"


    // $ANTLR start "rule__FTPlayer__Group_15__0"
    // InternalFairtracksDsl.g:1417:1: rule__FTPlayer__Group_15__0 : rule__FTPlayer__Group_15__0__Impl rule__FTPlayer__Group_15__1 ;
    public final void rule__FTPlayer__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1421:1: ( rule__FTPlayer__Group_15__0__Impl rule__FTPlayer__Group_15__1 )
            // InternalFairtracksDsl.g:1422:2: rule__FTPlayer__Group_15__0__Impl rule__FTPlayer__Group_15__1
            {
            pushFollow(FOLLOW_9);
            rule__FTPlayer__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTPlayer__Group_15__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group_15__0"


    // $ANTLR start "rule__FTPlayer__Group_15__0__Impl"
    // InternalFairtracksDsl.g:1429:1: rule__FTPlayer__Group_15__0__Impl : ( 'inside' ) ;
    public final void rule__FTPlayer__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1433:1: ( ( 'inside' ) )
            // InternalFairtracksDsl.g:1434:1: ( 'inside' )
            {
            // InternalFairtracksDsl.g:1434:1: ( 'inside' )
            // InternalFairtracksDsl.g:1435:2: 'inside'
            {
             before(grammarAccess.getFTPlayerAccess().getInsideKeyword_15_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getFTPlayerAccess().getInsideKeyword_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group_15__0__Impl"


    // $ANTLR start "rule__FTPlayer__Group_15__1"
    // InternalFairtracksDsl.g:1444:1: rule__FTPlayer__Group_15__1 : rule__FTPlayer__Group_15__1__Impl rule__FTPlayer__Group_15__2 ;
    public final void rule__FTPlayer__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1448:1: ( rule__FTPlayer__Group_15__1__Impl rule__FTPlayer__Group_15__2 )
            // InternalFairtracksDsl.g:1449:2: rule__FTPlayer__Group_15__1__Impl rule__FTPlayer__Group_15__2
            {
            pushFollow(FOLLOW_10);
            rule__FTPlayer__Group_15__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTPlayer__Group_15__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group_15__1"


    // $ANTLR start "rule__FTPlayer__Group_15__1__Impl"
    // InternalFairtracksDsl.g:1456:1: rule__FTPlayer__Group_15__1__Impl : ( ':' ) ;
    public final void rule__FTPlayer__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1460:1: ( ( ':' ) )
            // InternalFairtracksDsl.g:1461:1: ( ':' )
            {
            // InternalFairtracksDsl.g:1461:1: ( ':' )
            // InternalFairtracksDsl.g:1462:2: ':'
            {
             before(grammarAccess.getFTPlayerAccess().getColonKeyword_15_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getFTPlayerAccess().getColonKeyword_15_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group_15__1__Impl"


    // $ANTLR start "rule__FTPlayer__Group_15__2"
    // InternalFairtracksDsl.g:1471:1: rule__FTPlayer__Group_15__2 : rule__FTPlayer__Group_15__2__Impl rule__FTPlayer__Group_15__3 ;
    public final void rule__FTPlayer__Group_15__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1475:1: ( rule__FTPlayer__Group_15__2__Impl rule__FTPlayer__Group_15__3 )
            // InternalFairtracksDsl.g:1476:2: rule__FTPlayer__Group_15__2__Impl rule__FTPlayer__Group_15__3
            {
            pushFollow(FOLLOW_11);
            rule__FTPlayer__Group_15__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTPlayer__Group_15__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group_15__2"


    // $ANTLR start "rule__FTPlayer__Group_15__2__Impl"
    // InternalFairtracksDsl.g:1483:1: rule__FTPlayer__Group_15__2__Impl : ( ( rule__FTPlayer__InitiallyInsideAssignment_15_2 ) ) ;
    public final void rule__FTPlayer__Group_15__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1487:1: ( ( ( rule__FTPlayer__InitiallyInsideAssignment_15_2 ) ) )
            // InternalFairtracksDsl.g:1488:1: ( ( rule__FTPlayer__InitiallyInsideAssignment_15_2 ) )
            {
            // InternalFairtracksDsl.g:1488:1: ( ( rule__FTPlayer__InitiallyInsideAssignment_15_2 ) )
            // InternalFairtracksDsl.g:1489:2: ( rule__FTPlayer__InitiallyInsideAssignment_15_2 )
            {
             before(grammarAccess.getFTPlayerAccess().getInitiallyInsideAssignment_15_2()); 
            // InternalFairtracksDsl.g:1490:2: ( rule__FTPlayer__InitiallyInsideAssignment_15_2 )
            // InternalFairtracksDsl.g:1490:3: rule__FTPlayer__InitiallyInsideAssignment_15_2
            {
            pushFollow(FOLLOW_2);
            rule__FTPlayer__InitiallyInsideAssignment_15_2();

            state._fsp--;


            }

             after(grammarAccess.getFTPlayerAccess().getInitiallyInsideAssignment_15_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group_15__2__Impl"


    // $ANTLR start "rule__FTPlayer__Group_15__3"
    // InternalFairtracksDsl.g:1498:1: rule__FTPlayer__Group_15__3 : rule__FTPlayer__Group_15__3__Impl ;
    public final void rule__FTPlayer__Group_15__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1502:1: ( rule__FTPlayer__Group_15__3__Impl )
            // InternalFairtracksDsl.g:1503:2: rule__FTPlayer__Group_15__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FTPlayer__Group_15__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group_15__3"


    // $ANTLR start "rule__FTPlayer__Group_15__3__Impl"
    // InternalFairtracksDsl.g:1509:1: rule__FTPlayer__Group_15__3__Impl : ( ';' ) ;
    public final void rule__FTPlayer__Group_15__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1513:1: ( ( ';' ) )
            // InternalFairtracksDsl.g:1514:1: ( ';' )
            {
            // InternalFairtracksDsl.g:1514:1: ( ';' )
            // InternalFairtracksDsl.g:1515:2: ';'
            {
             before(grammarAccess.getFTPlayerAccess().getSemicolonKeyword_15_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getFTPlayerAccess().getSemicolonKeyword_15_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group_15__3__Impl"


    // $ANTLR start "rule__FTPlayer__Group_16__0"
    // InternalFairtracksDsl.g:1525:1: rule__FTPlayer__Group_16__0 : rule__FTPlayer__Group_16__0__Impl rule__FTPlayer__Group_16__1 ;
    public final void rule__FTPlayer__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1529:1: ( rule__FTPlayer__Group_16__0__Impl rule__FTPlayer__Group_16__1 )
            // InternalFairtracksDsl.g:1530:2: rule__FTPlayer__Group_16__0__Impl rule__FTPlayer__Group_16__1
            {
            pushFollow(FOLLOW_11);
            rule__FTPlayer__Group_16__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTPlayer__Group_16__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group_16__0"


    // $ANTLR start "rule__FTPlayer__Group_16__0__Impl"
    // InternalFairtracksDsl.g:1537:1: rule__FTPlayer__Group_16__0__Impl : ( ( rule__FTPlayer__CanPickUpObjectAssignment_16_0 ) ) ;
    public final void rule__FTPlayer__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1541:1: ( ( ( rule__FTPlayer__CanPickUpObjectAssignment_16_0 ) ) )
            // InternalFairtracksDsl.g:1542:1: ( ( rule__FTPlayer__CanPickUpObjectAssignment_16_0 ) )
            {
            // InternalFairtracksDsl.g:1542:1: ( ( rule__FTPlayer__CanPickUpObjectAssignment_16_0 ) )
            // InternalFairtracksDsl.g:1543:2: ( rule__FTPlayer__CanPickUpObjectAssignment_16_0 )
            {
             before(grammarAccess.getFTPlayerAccess().getCanPickUpObjectAssignment_16_0()); 
            // InternalFairtracksDsl.g:1544:2: ( rule__FTPlayer__CanPickUpObjectAssignment_16_0 )
            // InternalFairtracksDsl.g:1544:3: rule__FTPlayer__CanPickUpObjectAssignment_16_0
            {
            pushFollow(FOLLOW_2);
            rule__FTPlayer__CanPickUpObjectAssignment_16_0();

            state._fsp--;


            }

             after(grammarAccess.getFTPlayerAccess().getCanPickUpObjectAssignment_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group_16__0__Impl"


    // $ANTLR start "rule__FTPlayer__Group_16__1"
    // InternalFairtracksDsl.g:1552:1: rule__FTPlayer__Group_16__1 : rule__FTPlayer__Group_16__1__Impl ;
    public final void rule__FTPlayer__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1556:1: ( rule__FTPlayer__Group_16__1__Impl )
            // InternalFairtracksDsl.g:1557:2: rule__FTPlayer__Group_16__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FTPlayer__Group_16__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group_16__1"


    // $ANTLR start "rule__FTPlayer__Group_16__1__Impl"
    // InternalFairtracksDsl.g:1563:1: rule__FTPlayer__Group_16__1__Impl : ( ';' ) ;
    public final void rule__FTPlayer__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1567:1: ( ( ';' ) )
            // InternalFairtracksDsl.g:1568:1: ( ';' )
            {
            // InternalFairtracksDsl.g:1568:1: ( ';' )
            // InternalFairtracksDsl.g:1569:2: ';'
            {
             before(grammarAccess.getFTPlayerAccess().getSemicolonKeyword_16_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getFTPlayerAccess().getSemicolonKeyword_16_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group_16__1__Impl"


    // $ANTLR start "rule__FTPlayer__Group_17__0"
    // InternalFairtracksDsl.g:1579:1: rule__FTPlayer__Group_17__0 : rule__FTPlayer__Group_17__0__Impl rule__FTPlayer__Group_17__1 ;
    public final void rule__FTPlayer__Group_17__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1583:1: ( rule__FTPlayer__Group_17__0__Impl rule__FTPlayer__Group_17__1 )
            // InternalFairtracksDsl.g:1584:2: rule__FTPlayer__Group_17__0__Impl rule__FTPlayer__Group_17__1
            {
            pushFollow(FOLLOW_9);
            rule__FTPlayer__Group_17__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTPlayer__Group_17__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group_17__0"


    // $ANTLR start "rule__FTPlayer__Group_17__0__Impl"
    // InternalFairtracksDsl.g:1591:1: rule__FTPlayer__Group_17__0__Impl : ( 'pickUpColor' ) ;
    public final void rule__FTPlayer__Group_17__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1595:1: ( ( 'pickUpColor' ) )
            // InternalFairtracksDsl.g:1596:1: ( 'pickUpColor' )
            {
            // InternalFairtracksDsl.g:1596:1: ( 'pickUpColor' )
            // InternalFairtracksDsl.g:1597:2: 'pickUpColor'
            {
             before(grammarAccess.getFTPlayerAccess().getPickUpColorKeyword_17_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getFTPlayerAccess().getPickUpColorKeyword_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group_17__0__Impl"


    // $ANTLR start "rule__FTPlayer__Group_17__1"
    // InternalFairtracksDsl.g:1606:1: rule__FTPlayer__Group_17__1 : rule__FTPlayer__Group_17__1__Impl rule__FTPlayer__Group_17__2 ;
    public final void rule__FTPlayer__Group_17__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1610:1: ( rule__FTPlayer__Group_17__1__Impl rule__FTPlayer__Group_17__2 )
            // InternalFairtracksDsl.g:1611:2: rule__FTPlayer__Group_17__1__Impl rule__FTPlayer__Group_17__2
            {
            pushFollow(FOLLOW_18);
            rule__FTPlayer__Group_17__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTPlayer__Group_17__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group_17__1"


    // $ANTLR start "rule__FTPlayer__Group_17__1__Impl"
    // InternalFairtracksDsl.g:1618:1: rule__FTPlayer__Group_17__1__Impl : ( ':' ) ;
    public final void rule__FTPlayer__Group_17__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1622:1: ( ( ':' ) )
            // InternalFairtracksDsl.g:1623:1: ( ':' )
            {
            // InternalFairtracksDsl.g:1623:1: ( ':' )
            // InternalFairtracksDsl.g:1624:2: ':'
            {
             before(grammarAccess.getFTPlayerAccess().getColonKeyword_17_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getFTPlayerAccess().getColonKeyword_17_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group_17__1__Impl"


    // $ANTLR start "rule__FTPlayer__Group_17__2"
    // InternalFairtracksDsl.g:1633:1: rule__FTPlayer__Group_17__2 : rule__FTPlayer__Group_17__2__Impl rule__FTPlayer__Group_17__3 ;
    public final void rule__FTPlayer__Group_17__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1637:1: ( rule__FTPlayer__Group_17__2__Impl rule__FTPlayer__Group_17__3 )
            // InternalFairtracksDsl.g:1638:2: rule__FTPlayer__Group_17__2__Impl rule__FTPlayer__Group_17__3
            {
            pushFollow(FOLLOW_19);
            rule__FTPlayer__Group_17__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTPlayer__Group_17__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group_17__2"


    // $ANTLR start "rule__FTPlayer__Group_17__2__Impl"
    // InternalFairtracksDsl.g:1645:1: rule__FTPlayer__Group_17__2__Impl : ( ( rule__FTPlayer__PickUpColorAssignment_17_2 ) ) ;
    public final void rule__FTPlayer__Group_17__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1649:1: ( ( ( rule__FTPlayer__PickUpColorAssignment_17_2 ) ) )
            // InternalFairtracksDsl.g:1650:1: ( ( rule__FTPlayer__PickUpColorAssignment_17_2 ) )
            {
            // InternalFairtracksDsl.g:1650:1: ( ( rule__FTPlayer__PickUpColorAssignment_17_2 ) )
            // InternalFairtracksDsl.g:1651:2: ( rule__FTPlayer__PickUpColorAssignment_17_2 )
            {
             before(grammarAccess.getFTPlayerAccess().getPickUpColorAssignment_17_2()); 
            // InternalFairtracksDsl.g:1652:2: ( rule__FTPlayer__PickUpColorAssignment_17_2 )
            // InternalFairtracksDsl.g:1652:3: rule__FTPlayer__PickUpColorAssignment_17_2
            {
            pushFollow(FOLLOW_2);
            rule__FTPlayer__PickUpColorAssignment_17_2();

            state._fsp--;


            }

             after(grammarAccess.getFTPlayerAccess().getPickUpColorAssignment_17_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group_17__2__Impl"


    // $ANTLR start "rule__FTPlayer__Group_17__3"
    // InternalFairtracksDsl.g:1660:1: rule__FTPlayer__Group_17__3 : rule__FTPlayer__Group_17__3__Impl rule__FTPlayer__Group_17__4 ;
    public final void rule__FTPlayer__Group_17__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1664:1: ( rule__FTPlayer__Group_17__3__Impl rule__FTPlayer__Group_17__4 )
            // InternalFairtracksDsl.g:1665:2: rule__FTPlayer__Group_17__3__Impl rule__FTPlayer__Group_17__4
            {
            pushFollow(FOLLOW_19);
            rule__FTPlayer__Group_17__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTPlayer__Group_17__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group_17__3"


    // $ANTLR start "rule__FTPlayer__Group_17__3__Impl"
    // InternalFairtracksDsl.g:1672:1: rule__FTPlayer__Group_17__3__Impl : ( ( rule__FTPlayer__Group_17_3__0 )* ) ;
    public final void rule__FTPlayer__Group_17__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1676:1: ( ( ( rule__FTPlayer__Group_17_3__0 )* ) )
            // InternalFairtracksDsl.g:1677:1: ( ( rule__FTPlayer__Group_17_3__0 )* )
            {
            // InternalFairtracksDsl.g:1677:1: ( ( rule__FTPlayer__Group_17_3__0 )* )
            // InternalFairtracksDsl.g:1678:2: ( rule__FTPlayer__Group_17_3__0 )*
            {
             before(grammarAccess.getFTPlayerAccess().getGroup_17_3()); 
            // InternalFairtracksDsl.g:1679:2: ( rule__FTPlayer__Group_17_3__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==44) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalFairtracksDsl.g:1679:3: rule__FTPlayer__Group_17_3__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__FTPlayer__Group_17_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getFTPlayerAccess().getGroup_17_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group_17__3__Impl"


    // $ANTLR start "rule__FTPlayer__Group_17__4"
    // InternalFairtracksDsl.g:1687:1: rule__FTPlayer__Group_17__4 : rule__FTPlayer__Group_17__4__Impl ;
    public final void rule__FTPlayer__Group_17__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1691:1: ( rule__FTPlayer__Group_17__4__Impl )
            // InternalFairtracksDsl.g:1692:2: rule__FTPlayer__Group_17__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FTPlayer__Group_17__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group_17__4"


    // $ANTLR start "rule__FTPlayer__Group_17__4__Impl"
    // InternalFairtracksDsl.g:1698:1: rule__FTPlayer__Group_17__4__Impl : ( ';' ) ;
    public final void rule__FTPlayer__Group_17__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1702:1: ( ( ';' ) )
            // InternalFairtracksDsl.g:1703:1: ( ';' )
            {
            // InternalFairtracksDsl.g:1703:1: ( ';' )
            // InternalFairtracksDsl.g:1704:2: ';'
            {
             before(grammarAccess.getFTPlayerAccess().getSemicolonKeyword_17_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getFTPlayerAccess().getSemicolonKeyword_17_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group_17__4__Impl"


    // $ANTLR start "rule__FTPlayer__Group_17_3__0"
    // InternalFairtracksDsl.g:1714:1: rule__FTPlayer__Group_17_3__0 : rule__FTPlayer__Group_17_3__0__Impl rule__FTPlayer__Group_17_3__1 ;
    public final void rule__FTPlayer__Group_17_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1718:1: ( rule__FTPlayer__Group_17_3__0__Impl rule__FTPlayer__Group_17_3__1 )
            // InternalFairtracksDsl.g:1719:2: rule__FTPlayer__Group_17_3__0__Impl rule__FTPlayer__Group_17_3__1
            {
            pushFollow(FOLLOW_18);
            rule__FTPlayer__Group_17_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTPlayer__Group_17_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group_17_3__0"


    // $ANTLR start "rule__FTPlayer__Group_17_3__0__Impl"
    // InternalFairtracksDsl.g:1726:1: rule__FTPlayer__Group_17_3__0__Impl : ( ',' ) ;
    public final void rule__FTPlayer__Group_17_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1730:1: ( ( ',' ) )
            // InternalFairtracksDsl.g:1731:1: ( ',' )
            {
            // InternalFairtracksDsl.g:1731:1: ( ',' )
            // InternalFairtracksDsl.g:1732:2: ','
            {
             before(grammarAccess.getFTPlayerAccess().getCommaKeyword_17_3_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getFTPlayerAccess().getCommaKeyword_17_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group_17_3__0__Impl"


    // $ANTLR start "rule__FTPlayer__Group_17_3__1"
    // InternalFairtracksDsl.g:1741:1: rule__FTPlayer__Group_17_3__1 : rule__FTPlayer__Group_17_3__1__Impl ;
    public final void rule__FTPlayer__Group_17_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1745:1: ( rule__FTPlayer__Group_17_3__1__Impl )
            // InternalFairtracksDsl.g:1746:2: rule__FTPlayer__Group_17_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FTPlayer__Group_17_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group_17_3__1"


    // $ANTLR start "rule__FTPlayer__Group_17_3__1__Impl"
    // InternalFairtracksDsl.g:1752:1: rule__FTPlayer__Group_17_3__1__Impl : ( ( rule__FTPlayer__PickUpColorAssignment_17_3_1 ) ) ;
    public final void rule__FTPlayer__Group_17_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1756:1: ( ( ( rule__FTPlayer__PickUpColorAssignment_17_3_1 ) ) )
            // InternalFairtracksDsl.g:1757:1: ( ( rule__FTPlayer__PickUpColorAssignment_17_3_1 ) )
            {
            // InternalFairtracksDsl.g:1757:1: ( ( rule__FTPlayer__PickUpColorAssignment_17_3_1 ) )
            // InternalFairtracksDsl.g:1758:2: ( rule__FTPlayer__PickUpColorAssignment_17_3_1 )
            {
             before(grammarAccess.getFTPlayerAccess().getPickUpColorAssignment_17_3_1()); 
            // InternalFairtracksDsl.g:1759:2: ( rule__FTPlayer__PickUpColorAssignment_17_3_1 )
            // InternalFairtracksDsl.g:1759:3: rule__FTPlayer__PickUpColorAssignment_17_3_1
            {
            pushFollow(FOLLOW_2);
            rule__FTPlayer__PickUpColorAssignment_17_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFTPlayerAccess().getPickUpColorAssignment_17_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group_17_3__1__Impl"


    // $ANTLR start "rule__FTPlayer__Group_18__0"
    // InternalFairtracksDsl.g:1768:1: rule__FTPlayer__Group_18__0 : rule__FTPlayer__Group_18__0__Impl rule__FTPlayer__Group_18__1 ;
    public final void rule__FTPlayer__Group_18__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1772:1: ( rule__FTPlayer__Group_18__0__Impl rule__FTPlayer__Group_18__1 )
            // InternalFairtracksDsl.g:1773:2: rule__FTPlayer__Group_18__0__Impl rule__FTPlayer__Group_18__1
            {
            pushFollow(FOLLOW_9);
            rule__FTPlayer__Group_18__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTPlayer__Group_18__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group_18__0"


    // $ANTLR start "rule__FTPlayer__Group_18__0__Impl"
    // InternalFairtracksDsl.g:1780:1: rule__FTPlayer__Group_18__0__Impl : ( 'distance' ) ;
    public final void rule__FTPlayer__Group_18__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1784:1: ( ( 'distance' ) )
            // InternalFairtracksDsl.g:1785:1: ( 'distance' )
            {
            // InternalFairtracksDsl.g:1785:1: ( 'distance' )
            // InternalFairtracksDsl.g:1786:2: 'distance'
            {
             before(grammarAccess.getFTPlayerAccess().getDistanceKeyword_18_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getFTPlayerAccess().getDistanceKeyword_18_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group_18__0__Impl"


    // $ANTLR start "rule__FTPlayer__Group_18__1"
    // InternalFairtracksDsl.g:1795:1: rule__FTPlayer__Group_18__1 : rule__FTPlayer__Group_18__1__Impl rule__FTPlayer__Group_18__2 ;
    public final void rule__FTPlayer__Group_18__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1799:1: ( rule__FTPlayer__Group_18__1__Impl rule__FTPlayer__Group_18__2 )
            // InternalFairtracksDsl.g:1800:2: rule__FTPlayer__Group_18__1__Impl rule__FTPlayer__Group_18__2
            {
            pushFollow(FOLLOW_3);
            rule__FTPlayer__Group_18__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTPlayer__Group_18__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group_18__1"


    // $ANTLR start "rule__FTPlayer__Group_18__1__Impl"
    // InternalFairtracksDsl.g:1807:1: rule__FTPlayer__Group_18__1__Impl : ( ':' ) ;
    public final void rule__FTPlayer__Group_18__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1811:1: ( ( ':' ) )
            // InternalFairtracksDsl.g:1812:1: ( ':' )
            {
            // InternalFairtracksDsl.g:1812:1: ( ':' )
            // InternalFairtracksDsl.g:1813:2: ':'
            {
             before(grammarAccess.getFTPlayerAccess().getColonKeyword_18_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getFTPlayerAccess().getColonKeyword_18_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group_18__1__Impl"


    // $ANTLR start "rule__FTPlayer__Group_18__2"
    // InternalFairtracksDsl.g:1822:1: rule__FTPlayer__Group_18__2 : rule__FTPlayer__Group_18__2__Impl rule__FTPlayer__Group_18__3 ;
    public final void rule__FTPlayer__Group_18__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1826:1: ( rule__FTPlayer__Group_18__2__Impl rule__FTPlayer__Group_18__3 )
            // InternalFairtracksDsl.g:1827:2: rule__FTPlayer__Group_18__2__Impl rule__FTPlayer__Group_18__3
            {
            pushFollow(FOLLOW_11);
            rule__FTPlayer__Group_18__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTPlayer__Group_18__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group_18__2"


    // $ANTLR start "rule__FTPlayer__Group_18__2__Impl"
    // InternalFairtracksDsl.g:1834:1: rule__FTPlayer__Group_18__2__Impl : ( ( rule__FTPlayer__DistanceClassAssignment_18_2 ) ) ;
    public final void rule__FTPlayer__Group_18__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1838:1: ( ( ( rule__FTPlayer__DistanceClassAssignment_18_2 ) ) )
            // InternalFairtracksDsl.g:1839:1: ( ( rule__FTPlayer__DistanceClassAssignment_18_2 ) )
            {
            // InternalFairtracksDsl.g:1839:1: ( ( rule__FTPlayer__DistanceClassAssignment_18_2 ) )
            // InternalFairtracksDsl.g:1840:2: ( rule__FTPlayer__DistanceClassAssignment_18_2 )
            {
             before(grammarAccess.getFTPlayerAccess().getDistanceClassAssignment_18_2()); 
            // InternalFairtracksDsl.g:1841:2: ( rule__FTPlayer__DistanceClassAssignment_18_2 )
            // InternalFairtracksDsl.g:1841:3: rule__FTPlayer__DistanceClassAssignment_18_2
            {
            pushFollow(FOLLOW_2);
            rule__FTPlayer__DistanceClassAssignment_18_2();

            state._fsp--;


            }

             after(grammarAccess.getFTPlayerAccess().getDistanceClassAssignment_18_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group_18__2__Impl"


    // $ANTLR start "rule__FTPlayer__Group_18__3"
    // InternalFairtracksDsl.g:1849:1: rule__FTPlayer__Group_18__3 : rule__FTPlayer__Group_18__3__Impl ;
    public final void rule__FTPlayer__Group_18__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1853:1: ( rule__FTPlayer__Group_18__3__Impl )
            // InternalFairtracksDsl.g:1854:2: rule__FTPlayer__Group_18__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FTPlayer__Group_18__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group_18__3"


    // $ANTLR start "rule__FTPlayer__Group_18__3__Impl"
    // InternalFairtracksDsl.g:1860:1: rule__FTPlayer__Group_18__3__Impl : ( ';' ) ;
    public final void rule__FTPlayer__Group_18__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1864:1: ( ( ';' ) )
            // InternalFairtracksDsl.g:1865:1: ( ';' )
            {
            // InternalFairtracksDsl.g:1865:1: ( ';' )
            // InternalFairtracksDsl.g:1866:2: ';'
            {
             before(grammarAccess.getFTPlayerAccess().getSemicolonKeyword_18_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getFTPlayerAccess().getSemicolonKeyword_18_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group_18__3__Impl"


    // $ANTLR start "rule__FTPlayer__Group_19__0"
    // InternalFairtracksDsl.g:1876:1: rule__FTPlayer__Group_19__0 : rule__FTPlayer__Group_19__0__Impl rule__FTPlayer__Group_19__1 ;
    public final void rule__FTPlayer__Group_19__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1880:1: ( rule__FTPlayer__Group_19__0__Impl rule__FTPlayer__Group_19__1 )
            // InternalFairtracksDsl.g:1881:2: rule__FTPlayer__Group_19__0__Impl rule__FTPlayer__Group_19__1
            {
            pushFollow(FOLLOW_21);
            rule__FTPlayer__Group_19__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTPlayer__Group_19__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group_19__0"


    // $ANTLR start "rule__FTPlayer__Group_19__0__Impl"
    // InternalFairtracksDsl.g:1888:1: rule__FTPlayer__Group_19__0__Impl : ( 'Real' ) ;
    public final void rule__FTPlayer__Group_19__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1892:1: ( ( 'Real' ) )
            // InternalFairtracksDsl.g:1893:1: ( 'Real' )
            {
            // InternalFairtracksDsl.g:1893:1: ( 'Real' )
            // InternalFairtracksDsl.g:1894:2: 'Real'
            {
             before(grammarAccess.getFTPlayerAccess().getRealKeyword_19_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getFTPlayerAccess().getRealKeyword_19_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group_19__0__Impl"


    // $ANTLR start "rule__FTPlayer__Group_19__1"
    // InternalFairtracksDsl.g:1903:1: rule__FTPlayer__Group_19__1 : rule__FTPlayer__Group_19__1__Impl rule__FTPlayer__Group_19__2 ;
    public final void rule__FTPlayer__Group_19__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1907:1: ( rule__FTPlayer__Group_19__1__Impl rule__FTPlayer__Group_19__2 )
            // InternalFairtracksDsl.g:1908:2: rule__FTPlayer__Group_19__1__Impl rule__FTPlayer__Group_19__2
            {
            pushFollow(FOLLOW_9);
            rule__FTPlayer__Group_19__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTPlayer__Group_19__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group_19__1"


    // $ANTLR start "rule__FTPlayer__Group_19__1__Impl"
    // InternalFairtracksDsl.g:1915:1: rule__FTPlayer__Group_19__1__Impl : ( 'Coordinates' ) ;
    public final void rule__FTPlayer__Group_19__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1919:1: ( ( 'Coordinates' ) )
            // InternalFairtracksDsl.g:1920:1: ( 'Coordinates' )
            {
            // InternalFairtracksDsl.g:1920:1: ( 'Coordinates' )
            // InternalFairtracksDsl.g:1921:2: 'Coordinates'
            {
             before(grammarAccess.getFTPlayerAccess().getCoordinatesKeyword_19_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getFTPlayerAccess().getCoordinatesKeyword_19_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group_19__1__Impl"


    // $ANTLR start "rule__FTPlayer__Group_19__2"
    // InternalFairtracksDsl.g:1930:1: rule__FTPlayer__Group_19__2 : rule__FTPlayer__Group_19__2__Impl rule__FTPlayer__Group_19__3 ;
    public final void rule__FTPlayer__Group_19__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1934:1: ( rule__FTPlayer__Group_19__2__Impl rule__FTPlayer__Group_19__3 )
            // InternalFairtracksDsl.g:1935:2: rule__FTPlayer__Group_19__2__Impl rule__FTPlayer__Group_19__3
            {
            pushFollow(FOLLOW_22);
            rule__FTPlayer__Group_19__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTPlayer__Group_19__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group_19__2"


    // $ANTLR start "rule__FTPlayer__Group_19__2__Impl"
    // InternalFairtracksDsl.g:1942:1: rule__FTPlayer__Group_19__2__Impl : ( ':' ) ;
    public final void rule__FTPlayer__Group_19__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1946:1: ( ( ':' ) )
            // InternalFairtracksDsl.g:1947:1: ( ':' )
            {
            // InternalFairtracksDsl.g:1947:1: ( ':' )
            // InternalFairtracksDsl.g:1948:2: ':'
            {
             before(grammarAccess.getFTPlayerAccess().getColonKeyword_19_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getFTPlayerAccess().getColonKeyword_19_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group_19__2__Impl"


    // $ANTLR start "rule__FTPlayer__Group_19__3"
    // InternalFairtracksDsl.g:1957:1: rule__FTPlayer__Group_19__3 : rule__FTPlayer__Group_19__3__Impl rule__FTPlayer__Group_19__4 ;
    public final void rule__FTPlayer__Group_19__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1961:1: ( rule__FTPlayer__Group_19__3__Impl rule__FTPlayer__Group_19__4 )
            // InternalFairtracksDsl.g:1962:2: rule__FTPlayer__Group_19__3__Impl rule__FTPlayer__Group_19__4
            {
            pushFollow(FOLLOW_23);
            rule__FTPlayer__Group_19__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTPlayer__Group_19__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group_19__3"


    // $ANTLR start "rule__FTPlayer__Group_19__3__Impl"
    // InternalFairtracksDsl.g:1969:1: rule__FTPlayer__Group_19__3__Impl : ( '[' ) ;
    public final void rule__FTPlayer__Group_19__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1973:1: ( ( '[' ) )
            // InternalFairtracksDsl.g:1974:1: ( '[' )
            {
            // InternalFairtracksDsl.g:1974:1: ( '[' )
            // InternalFairtracksDsl.g:1975:2: '['
            {
             before(grammarAccess.getFTPlayerAccess().getLeftSquareBracketKeyword_19_3()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getFTPlayerAccess().getLeftSquareBracketKeyword_19_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group_19__3__Impl"


    // $ANTLR start "rule__FTPlayer__Group_19__4"
    // InternalFairtracksDsl.g:1984:1: rule__FTPlayer__Group_19__4 : rule__FTPlayer__Group_19__4__Impl rule__FTPlayer__Group_19__5 ;
    public final void rule__FTPlayer__Group_19__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:1988:1: ( rule__FTPlayer__Group_19__4__Impl rule__FTPlayer__Group_19__5 )
            // InternalFairtracksDsl.g:1989:2: rule__FTPlayer__Group_19__4__Impl rule__FTPlayer__Group_19__5
            {
            pushFollow(FOLLOW_24);
            rule__FTPlayer__Group_19__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTPlayer__Group_19__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group_19__4"


    // $ANTLR start "rule__FTPlayer__Group_19__4__Impl"
    // InternalFairtracksDsl.g:1996:1: rule__FTPlayer__Group_19__4__Impl : ( ( rule__FTPlayer__CoordinatesAssignment_19_4 ) ) ;
    public final void rule__FTPlayer__Group_19__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2000:1: ( ( ( rule__FTPlayer__CoordinatesAssignment_19_4 ) ) )
            // InternalFairtracksDsl.g:2001:1: ( ( rule__FTPlayer__CoordinatesAssignment_19_4 ) )
            {
            // InternalFairtracksDsl.g:2001:1: ( ( rule__FTPlayer__CoordinatesAssignment_19_4 ) )
            // InternalFairtracksDsl.g:2002:2: ( rule__FTPlayer__CoordinatesAssignment_19_4 )
            {
             before(grammarAccess.getFTPlayerAccess().getCoordinatesAssignment_19_4()); 
            // InternalFairtracksDsl.g:2003:2: ( rule__FTPlayer__CoordinatesAssignment_19_4 )
            // InternalFairtracksDsl.g:2003:3: rule__FTPlayer__CoordinatesAssignment_19_4
            {
            pushFollow(FOLLOW_2);
            rule__FTPlayer__CoordinatesAssignment_19_4();

            state._fsp--;


            }

             after(grammarAccess.getFTPlayerAccess().getCoordinatesAssignment_19_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group_19__4__Impl"


    // $ANTLR start "rule__FTPlayer__Group_19__5"
    // InternalFairtracksDsl.g:2011:1: rule__FTPlayer__Group_19__5 : rule__FTPlayer__Group_19__5__Impl ;
    public final void rule__FTPlayer__Group_19__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2015:1: ( rule__FTPlayer__Group_19__5__Impl )
            // InternalFairtracksDsl.g:2016:2: rule__FTPlayer__Group_19__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FTPlayer__Group_19__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group_19__5"


    // $ANTLR start "rule__FTPlayer__Group_19__5__Impl"
    // InternalFairtracksDsl.g:2022:1: rule__FTPlayer__Group_19__5__Impl : ( ']' ) ;
    public final void rule__FTPlayer__Group_19__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2026:1: ( ( ']' ) )
            // InternalFairtracksDsl.g:2027:1: ( ']' )
            {
            // InternalFairtracksDsl.g:2027:1: ( ']' )
            // InternalFairtracksDsl.g:2028:2: ']'
            {
             before(grammarAccess.getFTPlayerAccess().getRightSquareBracketKeyword_19_5()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getFTPlayerAccess().getRightSquareBracketKeyword_19_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__Group_19__5__Impl"


    // $ANTLR start "rule__FTZone__Group__0"
    // InternalFairtracksDsl.g:2038:1: rule__FTZone__Group__0 : rule__FTZone__Group__0__Impl rule__FTZone__Group__1 ;
    public final void rule__FTZone__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2042:1: ( rule__FTZone__Group__0__Impl rule__FTZone__Group__1 )
            // InternalFairtracksDsl.g:2043:2: rule__FTZone__Group__0__Impl rule__FTZone__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__FTZone__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZone__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group__0"


    // $ANTLR start "rule__FTZone__Group__0__Impl"
    // InternalFairtracksDsl.g:2050:1: rule__FTZone__Group__0__Impl : ( 'Zone' ) ;
    public final void rule__FTZone__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2054:1: ( ( 'Zone' ) )
            // InternalFairtracksDsl.g:2055:1: ( 'Zone' )
            {
            // InternalFairtracksDsl.g:2055:1: ( 'Zone' )
            // InternalFairtracksDsl.g:2056:2: 'Zone'
            {
             before(grammarAccess.getFTZoneAccess().getZoneKeyword_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getFTZoneAccess().getZoneKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group__0__Impl"


    // $ANTLR start "rule__FTZone__Group__1"
    // InternalFairtracksDsl.g:2065:1: rule__FTZone__Group__1 : rule__FTZone__Group__1__Impl rule__FTZone__Group__2 ;
    public final void rule__FTZone__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2069:1: ( rule__FTZone__Group__1__Impl rule__FTZone__Group__2 )
            // InternalFairtracksDsl.g:2070:2: rule__FTZone__Group__1__Impl rule__FTZone__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__FTZone__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZone__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group__1"


    // $ANTLR start "rule__FTZone__Group__1__Impl"
    // InternalFairtracksDsl.g:2077:1: rule__FTZone__Group__1__Impl : ( '=' ) ;
    public final void rule__FTZone__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2081:1: ( ( '=' ) )
            // InternalFairtracksDsl.g:2082:1: ( '=' )
            {
            // InternalFairtracksDsl.g:2082:1: ( '=' )
            // InternalFairtracksDsl.g:2083:2: '='
            {
             before(grammarAccess.getFTZoneAccess().getEqualsSignKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getFTZoneAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group__1__Impl"


    // $ANTLR start "rule__FTZone__Group__2"
    // InternalFairtracksDsl.g:2092:1: rule__FTZone__Group__2 : rule__FTZone__Group__2__Impl rule__FTZone__Group__3 ;
    public final void rule__FTZone__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2096:1: ( rule__FTZone__Group__2__Impl rule__FTZone__Group__3 )
            // InternalFairtracksDsl.g:2097:2: rule__FTZone__Group__2__Impl rule__FTZone__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__FTZone__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZone__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group__2"


    // $ANTLR start "rule__FTZone__Group__2__Impl"
    // InternalFairtracksDsl.g:2104:1: rule__FTZone__Group__2__Impl : ( '{' ) ;
    public final void rule__FTZone__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2108:1: ( ( '{' ) )
            // InternalFairtracksDsl.g:2109:1: ( '{' )
            {
            // InternalFairtracksDsl.g:2109:1: ( '{' )
            // InternalFairtracksDsl.g:2110:2: '{'
            {
             before(grammarAccess.getFTZoneAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getFTZoneAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group__2__Impl"


    // $ANTLR start "rule__FTZone__Group__3"
    // InternalFairtracksDsl.g:2119:1: rule__FTZone__Group__3 : rule__FTZone__Group__3__Impl rule__FTZone__Group__4 ;
    public final void rule__FTZone__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2123:1: ( rule__FTZone__Group__3__Impl rule__FTZone__Group__4 )
            // InternalFairtracksDsl.g:2124:2: rule__FTZone__Group__3__Impl rule__FTZone__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__FTZone__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZone__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group__3"


    // $ANTLR start "rule__FTZone__Group__3__Impl"
    // InternalFairtracksDsl.g:2131:1: rule__FTZone__Group__3__Impl : ( 'name' ) ;
    public final void rule__FTZone__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2135:1: ( ( 'name' ) )
            // InternalFairtracksDsl.g:2136:1: ( 'name' )
            {
            // InternalFairtracksDsl.g:2136:1: ( 'name' )
            // InternalFairtracksDsl.g:2137:2: 'name'
            {
             before(grammarAccess.getFTZoneAccess().getNameKeyword_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getFTZoneAccess().getNameKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group__3__Impl"


    // $ANTLR start "rule__FTZone__Group__4"
    // InternalFairtracksDsl.g:2146:1: rule__FTZone__Group__4 : rule__FTZone__Group__4__Impl rule__FTZone__Group__5 ;
    public final void rule__FTZone__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2150:1: ( rule__FTZone__Group__4__Impl rule__FTZone__Group__5 )
            // InternalFairtracksDsl.g:2151:2: rule__FTZone__Group__4__Impl rule__FTZone__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__FTZone__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZone__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group__4"


    // $ANTLR start "rule__FTZone__Group__4__Impl"
    // InternalFairtracksDsl.g:2158:1: rule__FTZone__Group__4__Impl : ( ':' ) ;
    public final void rule__FTZone__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2162:1: ( ( ':' ) )
            // InternalFairtracksDsl.g:2163:1: ( ':' )
            {
            // InternalFairtracksDsl.g:2163:1: ( ':' )
            // InternalFairtracksDsl.g:2164:2: ':'
            {
             before(grammarAccess.getFTZoneAccess().getColonKeyword_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getFTZoneAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group__4__Impl"


    // $ANTLR start "rule__FTZone__Group__5"
    // InternalFairtracksDsl.g:2173:1: rule__FTZone__Group__5 : rule__FTZone__Group__5__Impl rule__FTZone__Group__6 ;
    public final void rule__FTZone__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2177:1: ( rule__FTZone__Group__5__Impl rule__FTZone__Group__6 )
            // InternalFairtracksDsl.g:2178:2: rule__FTZone__Group__5__Impl rule__FTZone__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__FTZone__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZone__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group__5"


    // $ANTLR start "rule__FTZone__Group__5__Impl"
    // InternalFairtracksDsl.g:2185:1: rule__FTZone__Group__5__Impl : ( ( rule__FTZone__NameAssignment_5 ) ) ;
    public final void rule__FTZone__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2189:1: ( ( ( rule__FTZone__NameAssignment_5 ) ) )
            // InternalFairtracksDsl.g:2190:1: ( ( rule__FTZone__NameAssignment_5 ) )
            {
            // InternalFairtracksDsl.g:2190:1: ( ( rule__FTZone__NameAssignment_5 ) )
            // InternalFairtracksDsl.g:2191:2: ( rule__FTZone__NameAssignment_5 )
            {
             before(grammarAccess.getFTZoneAccess().getNameAssignment_5()); 
            // InternalFairtracksDsl.g:2192:2: ( rule__FTZone__NameAssignment_5 )
            // InternalFairtracksDsl.g:2192:3: rule__FTZone__NameAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__FTZone__NameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getFTZoneAccess().getNameAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group__5__Impl"


    // $ANTLR start "rule__FTZone__Group__6"
    // InternalFairtracksDsl.g:2200:1: rule__FTZone__Group__6 : rule__FTZone__Group__6__Impl rule__FTZone__Group__7 ;
    public final void rule__FTZone__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2204:1: ( rule__FTZone__Group__6__Impl rule__FTZone__Group__7 )
            // InternalFairtracksDsl.g:2205:2: rule__FTZone__Group__6__Impl rule__FTZone__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__FTZone__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZone__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group__6"


    // $ANTLR start "rule__FTZone__Group__6__Impl"
    // InternalFairtracksDsl.g:2212:1: rule__FTZone__Group__6__Impl : ( ';' ) ;
    public final void rule__FTZone__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2216:1: ( ( ';' ) )
            // InternalFairtracksDsl.g:2217:1: ( ';' )
            {
            // InternalFairtracksDsl.g:2217:1: ( ';' )
            // InternalFairtracksDsl.g:2218:2: ';'
            {
             before(grammarAccess.getFTZoneAccess().getSemicolonKeyword_6()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getFTZoneAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group__6__Impl"


    // $ANTLR start "rule__FTZone__Group__7"
    // InternalFairtracksDsl.g:2227:1: rule__FTZone__Group__7 : rule__FTZone__Group__7__Impl rule__FTZone__Group__8 ;
    public final void rule__FTZone__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2231:1: ( rule__FTZone__Group__7__Impl rule__FTZone__Group__8 )
            // InternalFairtracksDsl.g:2232:2: rule__FTZone__Group__7__Impl rule__FTZone__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__FTZone__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZone__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group__7"


    // $ANTLR start "rule__FTZone__Group__7__Impl"
    // InternalFairtracksDsl.g:2239:1: rule__FTZone__Group__7__Impl : ( 'size' ) ;
    public final void rule__FTZone__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2243:1: ( ( 'size' ) )
            // InternalFairtracksDsl.g:2244:1: ( 'size' )
            {
            // InternalFairtracksDsl.g:2244:1: ( 'size' )
            // InternalFairtracksDsl.g:2245:2: 'size'
            {
             before(grammarAccess.getFTZoneAccess().getSizeKeyword_7()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getFTZoneAccess().getSizeKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group__7__Impl"


    // $ANTLR start "rule__FTZone__Group__8"
    // InternalFairtracksDsl.g:2254:1: rule__FTZone__Group__8 : rule__FTZone__Group__8__Impl rule__FTZone__Group__9 ;
    public final void rule__FTZone__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2258:1: ( rule__FTZone__Group__8__Impl rule__FTZone__Group__9 )
            // InternalFairtracksDsl.g:2259:2: rule__FTZone__Group__8__Impl rule__FTZone__Group__9
            {
            pushFollow(FOLLOW_13);
            rule__FTZone__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZone__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group__8"


    // $ANTLR start "rule__FTZone__Group__8__Impl"
    // InternalFairtracksDsl.g:2266:1: rule__FTZone__Group__8__Impl : ( ':' ) ;
    public final void rule__FTZone__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2270:1: ( ( ':' ) )
            // InternalFairtracksDsl.g:2271:1: ( ':' )
            {
            // InternalFairtracksDsl.g:2271:1: ( ':' )
            // InternalFairtracksDsl.g:2272:2: ':'
            {
             before(grammarAccess.getFTZoneAccess().getColonKeyword_8()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getFTZoneAccess().getColonKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group__8__Impl"


    // $ANTLR start "rule__FTZone__Group__9"
    // InternalFairtracksDsl.g:2281:1: rule__FTZone__Group__9 : rule__FTZone__Group__9__Impl rule__FTZone__Group__10 ;
    public final void rule__FTZone__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2285:1: ( rule__FTZone__Group__9__Impl rule__FTZone__Group__10 )
            // InternalFairtracksDsl.g:2286:2: rule__FTZone__Group__9__Impl rule__FTZone__Group__10
            {
            pushFollow(FOLLOW_11);
            rule__FTZone__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZone__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group__9"


    // $ANTLR start "rule__FTZone__Group__9__Impl"
    // InternalFairtracksDsl.g:2293:1: rule__FTZone__Group__9__Impl : ( ( rule__FTZone__SizeAssignment_9 ) ) ;
    public final void rule__FTZone__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2297:1: ( ( ( rule__FTZone__SizeAssignment_9 ) ) )
            // InternalFairtracksDsl.g:2298:1: ( ( rule__FTZone__SizeAssignment_9 ) )
            {
            // InternalFairtracksDsl.g:2298:1: ( ( rule__FTZone__SizeAssignment_9 ) )
            // InternalFairtracksDsl.g:2299:2: ( rule__FTZone__SizeAssignment_9 )
            {
             before(grammarAccess.getFTZoneAccess().getSizeAssignment_9()); 
            // InternalFairtracksDsl.g:2300:2: ( rule__FTZone__SizeAssignment_9 )
            // InternalFairtracksDsl.g:2300:3: rule__FTZone__SizeAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__FTZone__SizeAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getFTZoneAccess().getSizeAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group__9__Impl"


    // $ANTLR start "rule__FTZone__Group__10"
    // InternalFairtracksDsl.g:2308:1: rule__FTZone__Group__10 : rule__FTZone__Group__10__Impl rule__FTZone__Group__11 ;
    public final void rule__FTZone__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2312:1: ( rule__FTZone__Group__10__Impl rule__FTZone__Group__11 )
            // InternalFairtracksDsl.g:2313:2: rule__FTZone__Group__10__Impl rule__FTZone__Group__11
            {
            pushFollow(FOLLOW_25);
            rule__FTZone__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZone__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group__10"


    // $ANTLR start "rule__FTZone__Group__10__Impl"
    // InternalFairtracksDsl.g:2320:1: rule__FTZone__Group__10__Impl : ( ';' ) ;
    public final void rule__FTZone__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2324:1: ( ( ';' ) )
            // InternalFairtracksDsl.g:2325:1: ( ';' )
            {
            // InternalFairtracksDsl.g:2325:1: ( ';' )
            // InternalFairtracksDsl.g:2326:2: ';'
            {
             before(grammarAccess.getFTZoneAccess().getSemicolonKeyword_10()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getFTZoneAccess().getSemicolonKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group__10__Impl"


    // $ANTLR start "rule__FTZone__Group__11"
    // InternalFairtracksDsl.g:2335:1: rule__FTZone__Group__11 : rule__FTZone__Group__11__Impl rule__FTZone__Group__12 ;
    public final void rule__FTZone__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2339:1: ( rule__FTZone__Group__11__Impl rule__FTZone__Group__12 )
            // InternalFairtracksDsl.g:2340:2: rule__FTZone__Group__11__Impl rule__FTZone__Group__12
            {
            pushFollow(FOLLOW_9);
            rule__FTZone__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZone__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group__11"


    // $ANTLR start "rule__FTZone__Group__11__Impl"
    // InternalFairtracksDsl.g:2347:1: rule__FTZone__Group__11__Impl : ( 'zoneType' ) ;
    public final void rule__FTZone__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2351:1: ( ( 'zoneType' ) )
            // InternalFairtracksDsl.g:2352:1: ( 'zoneType' )
            {
            // InternalFairtracksDsl.g:2352:1: ( 'zoneType' )
            // InternalFairtracksDsl.g:2353:2: 'zoneType'
            {
             before(grammarAccess.getFTZoneAccess().getZoneTypeKeyword_11()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getFTZoneAccess().getZoneTypeKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group__11__Impl"


    // $ANTLR start "rule__FTZone__Group__12"
    // InternalFairtracksDsl.g:2362:1: rule__FTZone__Group__12 : rule__FTZone__Group__12__Impl rule__FTZone__Group__13 ;
    public final void rule__FTZone__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2366:1: ( rule__FTZone__Group__12__Impl rule__FTZone__Group__13 )
            // InternalFairtracksDsl.g:2367:2: rule__FTZone__Group__12__Impl rule__FTZone__Group__13
            {
            pushFollow(FOLLOW_26);
            rule__FTZone__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZone__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group__12"


    // $ANTLR start "rule__FTZone__Group__12__Impl"
    // InternalFairtracksDsl.g:2374:1: rule__FTZone__Group__12__Impl : ( ':' ) ;
    public final void rule__FTZone__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2378:1: ( ( ':' ) )
            // InternalFairtracksDsl.g:2379:1: ( ':' )
            {
            // InternalFairtracksDsl.g:2379:1: ( ':' )
            // InternalFairtracksDsl.g:2380:2: ':'
            {
             before(grammarAccess.getFTZoneAccess().getColonKeyword_12()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getFTZoneAccess().getColonKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group__12__Impl"


    // $ANTLR start "rule__FTZone__Group__13"
    // InternalFairtracksDsl.g:2389:1: rule__FTZone__Group__13 : rule__FTZone__Group__13__Impl rule__FTZone__Group__14 ;
    public final void rule__FTZone__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2393:1: ( rule__FTZone__Group__13__Impl rule__FTZone__Group__14 )
            // InternalFairtracksDsl.g:2394:2: rule__FTZone__Group__13__Impl rule__FTZone__Group__14
            {
            pushFollow(FOLLOW_11);
            rule__FTZone__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZone__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group__13"


    // $ANTLR start "rule__FTZone__Group__13__Impl"
    // InternalFairtracksDsl.g:2401:1: rule__FTZone__Group__13__Impl : ( ( rule__FTZone__TypeAssignment_13 ) ) ;
    public final void rule__FTZone__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2405:1: ( ( ( rule__FTZone__TypeAssignment_13 ) ) )
            // InternalFairtracksDsl.g:2406:1: ( ( rule__FTZone__TypeAssignment_13 ) )
            {
            // InternalFairtracksDsl.g:2406:1: ( ( rule__FTZone__TypeAssignment_13 ) )
            // InternalFairtracksDsl.g:2407:2: ( rule__FTZone__TypeAssignment_13 )
            {
             before(grammarAccess.getFTZoneAccess().getTypeAssignment_13()); 
            // InternalFairtracksDsl.g:2408:2: ( rule__FTZone__TypeAssignment_13 )
            // InternalFairtracksDsl.g:2408:3: rule__FTZone__TypeAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__FTZone__TypeAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getFTZoneAccess().getTypeAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group__13__Impl"


    // $ANTLR start "rule__FTZone__Group__14"
    // InternalFairtracksDsl.g:2416:1: rule__FTZone__Group__14 : rule__FTZone__Group__14__Impl rule__FTZone__Group__15 ;
    public final void rule__FTZone__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2420:1: ( rule__FTZone__Group__14__Impl rule__FTZone__Group__15 )
            // InternalFairtracksDsl.g:2421:2: rule__FTZone__Group__14__Impl rule__FTZone__Group__15
            {
            pushFollow(FOLLOW_27);
            rule__FTZone__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZone__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group__14"


    // $ANTLR start "rule__FTZone__Group__14__Impl"
    // InternalFairtracksDsl.g:2428:1: rule__FTZone__Group__14__Impl : ( ';' ) ;
    public final void rule__FTZone__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2432:1: ( ( ';' ) )
            // InternalFairtracksDsl.g:2433:1: ( ';' )
            {
            // InternalFairtracksDsl.g:2433:1: ( ';' )
            // InternalFairtracksDsl.g:2434:2: ';'
            {
             before(grammarAccess.getFTZoneAccess().getSemicolonKeyword_14()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getFTZoneAccess().getSemicolonKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group__14__Impl"


    // $ANTLR start "rule__FTZone__Group__15"
    // InternalFairtracksDsl.g:2443:1: rule__FTZone__Group__15 : rule__FTZone__Group__15__Impl rule__FTZone__Group__16 ;
    public final void rule__FTZone__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2447:1: ( rule__FTZone__Group__15__Impl rule__FTZone__Group__16 )
            // InternalFairtracksDsl.g:2448:2: rule__FTZone__Group__15__Impl rule__FTZone__Group__16
            {
            pushFollow(FOLLOW_27);
            rule__FTZone__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZone__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group__15"


    // $ANTLR start "rule__FTZone__Group__15__Impl"
    // InternalFairtracksDsl.g:2455:1: rule__FTZone__Group__15__Impl : ( ( rule__FTZone__Group_15__0 )? ) ;
    public final void rule__FTZone__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2459:1: ( ( ( rule__FTZone__Group_15__0 )? ) )
            // InternalFairtracksDsl.g:2460:1: ( ( rule__FTZone__Group_15__0 )? )
            {
            // InternalFairtracksDsl.g:2460:1: ( ( rule__FTZone__Group_15__0 )? )
            // InternalFairtracksDsl.g:2461:2: ( rule__FTZone__Group_15__0 )?
            {
             before(grammarAccess.getFTZoneAccess().getGroup_15()); 
            // InternalFairtracksDsl.g:2462:2: ( rule__FTZone__Group_15__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==52) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalFairtracksDsl.g:2462:3: rule__FTZone__Group_15__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FTZone__Group_15__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFTZoneAccess().getGroup_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group__15__Impl"


    // $ANTLR start "rule__FTZone__Group__16"
    // InternalFairtracksDsl.g:2470:1: rule__FTZone__Group__16 : rule__FTZone__Group__16__Impl rule__FTZone__Group__17 ;
    public final void rule__FTZone__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2474:1: ( rule__FTZone__Group__16__Impl rule__FTZone__Group__17 )
            // InternalFairtracksDsl.g:2475:2: rule__FTZone__Group__16__Impl rule__FTZone__Group__17
            {
            pushFollow(FOLLOW_27);
            rule__FTZone__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZone__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group__16"


    // $ANTLR start "rule__FTZone__Group__16__Impl"
    // InternalFairtracksDsl.g:2482:1: rule__FTZone__Group__16__Impl : ( ( rule__FTZone__Group_16__0 )? ) ;
    public final void rule__FTZone__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2486:1: ( ( ( rule__FTZone__Group_16__0 )? ) )
            // InternalFairtracksDsl.g:2487:1: ( ( rule__FTZone__Group_16__0 )? )
            {
            // InternalFairtracksDsl.g:2487:1: ( ( rule__FTZone__Group_16__0 )? )
            // InternalFairtracksDsl.g:2488:2: ( rule__FTZone__Group_16__0 )?
            {
             before(grammarAccess.getFTZoneAccess().getGroup_16()); 
            // InternalFairtracksDsl.g:2489:2: ( rule__FTZone__Group_16__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==53) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalFairtracksDsl.g:2489:3: rule__FTZone__Group_16__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FTZone__Group_16__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFTZoneAccess().getGroup_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group__16__Impl"


    // $ANTLR start "rule__FTZone__Group__17"
    // InternalFairtracksDsl.g:2497:1: rule__FTZone__Group__17 : rule__FTZone__Group__17__Impl rule__FTZone__Group__18 ;
    public final void rule__FTZone__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2501:1: ( rule__FTZone__Group__17__Impl rule__FTZone__Group__18 )
            // InternalFairtracksDsl.g:2502:2: rule__FTZone__Group__17__Impl rule__FTZone__Group__18
            {
            pushFollow(FOLLOW_27);
            rule__FTZone__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZone__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group__17"


    // $ANTLR start "rule__FTZone__Group__17__Impl"
    // InternalFairtracksDsl.g:2509:1: rule__FTZone__Group__17__Impl : ( ( rule__FTZone__Group_17__0 )? ) ;
    public final void rule__FTZone__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2513:1: ( ( ( rule__FTZone__Group_17__0 )? ) )
            // InternalFairtracksDsl.g:2514:1: ( ( rule__FTZone__Group_17__0 )? )
            {
            // InternalFairtracksDsl.g:2514:1: ( ( rule__FTZone__Group_17__0 )? )
            // InternalFairtracksDsl.g:2515:2: ( rule__FTZone__Group_17__0 )?
            {
             before(grammarAccess.getFTZoneAccess().getGroup_17()); 
            // InternalFairtracksDsl.g:2516:2: ( rule__FTZone__Group_17__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==54) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalFairtracksDsl.g:2516:3: rule__FTZone__Group_17__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FTZone__Group_17__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFTZoneAccess().getGroup_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group__17__Impl"


    // $ANTLR start "rule__FTZone__Group__18"
    // InternalFairtracksDsl.g:2524:1: rule__FTZone__Group__18 : rule__FTZone__Group__18__Impl rule__FTZone__Group__19 ;
    public final void rule__FTZone__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2528:1: ( rule__FTZone__Group__18__Impl rule__FTZone__Group__19 )
            // InternalFairtracksDsl.g:2529:2: rule__FTZone__Group__18__Impl rule__FTZone__Group__19
            {
            pushFollow(FOLLOW_27);
            rule__FTZone__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZone__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group__18"


    // $ANTLR start "rule__FTZone__Group__18__Impl"
    // InternalFairtracksDsl.g:2536:1: rule__FTZone__Group__18__Impl : ( ( rule__FTZone__Group_18__0 )? ) ;
    public final void rule__FTZone__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2540:1: ( ( ( rule__FTZone__Group_18__0 )? ) )
            // InternalFairtracksDsl.g:2541:1: ( ( rule__FTZone__Group_18__0 )? )
            {
            // InternalFairtracksDsl.g:2541:1: ( ( rule__FTZone__Group_18__0 )? )
            // InternalFairtracksDsl.g:2542:2: ( rule__FTZone__Group_18__0 )?
            {
             before(grammarAccess.getFTZoneAccess().getGroup_18()); 
            // InternalFairtracksDsl.g:2543:2: ( rule__FTZone__Group_18__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==55) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalFairtracksDsl.g:2543:3: rule__FTZone__Group_18__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FTZone__Group_18__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFTZoneAccess().getGroup_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group__18__Impl"


    // $ANTLR start "rule__FTZone__Group__19"
    // InternalFairtracksDsl.g:2551:1: rule__FTZone__Group__19 : rule__FTZone__Group__19__Impl rule__FTZone__Group__20 ;
    public final void rule__FTZone__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2555:1: ( rule__FTZone__Group__19__Impl rule__FTZone__Group__20 )
            // InternalFairtracksDsl.g:2556:2: rule__FTZone__Group__19__Impl rule__FTZone__Group__20
            {
            pushFollow(FOLLOW_27);
            rule__FTZone__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZone__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group__19"


    // $ANTLR start "rule__FTZone__Group__19__Impl"
    // InternalFairtracksDsl.g:2563:1: rule__FTZone__Group__19__Impl : ( ( rule__FTZone__Group_19__0 )* ) ;
    public final void rule__FTZone__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2567:1: ( ( ( rule__FTZone__Group_19__0 )* ) )
            // InternalFairtracksDsl.g:2568:1: ( ( rule__FTZone__Group_19__0 )* )
            {
            // InternalFairtracksDsl.g:2568:1: ( ( rule__FTZone__Group_19__0 )* )
            // InternalFairtracksDsl.g:2569:2: ( rule__FTZone__Group_19__0 )*
            {
             before(grammarAccess.getFTZoneAccess().getGroup_19()); 
            // InternalFairtracksDsl.g:2570:2: ( rule__FTZone__Group_19__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==45) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalFairtracksDsl.g:2570:3: rule__FTZone__Group_19__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__FTZone__Group_19__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getFTZoneAccess().getGroup_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group__19__Impl"


    // $ANTLR start "rule__FTZone__Group__20"
    // InternalFairtracksDsl.g:2578:1: rule__FTZone__Group__20 : rule__FTZone__Group__20__Impl rule__FTZone__Group__21 ;
    public final void rule__FTZone__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2582:1: ( rule__FTZone__Group__20__Impl rule__FTZone__Group__21 )
            // InternalFairtracksDsl.g:2583:2: rule__FTZone__Group__20__Impl rule__FTZone__Group__21
            {
            pushFollow(FOLLOW_27);
            rule__FTZone__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZone__Group__21();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group__20"


    // $ANTLR start "rule__FTZone__Group__20__Impl"
    // InternalFairtracksDsl.g:2590:1: rule__FTZone__Group__20__Impl : ( ( rule__FTZone__Group_20__0 )? ) ;
    public final void rule__FTZone__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2594:1: ( ( ( rule__FTZone__Group_20__0 )? ) )
            // InternalFairtracksDsl.g:2595:1: ( ( rule__FTZone__Group_20__0 )? )
            {
            // InternalFairtracksDsl.g:2595:1: ( ( rule__FTZone__Group_20__0 )? )
            // InternalFairtracksDsl.g:2596:2: ( rule__FTZone__Group_20__0 )?
            {
             before(grammarAccess.getFTZoneAccess().getGroup_20()); 
            // InternalFairtracksDsl.g:2597:2: ( rule__FTZone__Group_20__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==46) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalFairtracksDsl.g:2597:3: rule__FTZone__Group_20__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FTZone__Group_20__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFTZoneAccess().getGroup_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group__20__Impl"


    // $ANTLR start "rule__FTZone__Group__21"
    // InternalFairtracksDsl.g:2605:1: rule__FTZone__Group__21 : rule__FTZone__Group__21__Impl ;
    public final void rule__FTZone__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2609:1: ( rule__FTZone__Group__21__Impl )
            // InternalFairtracksDsl.g:2610:2: rule__FTZone__Group__21__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FTZone__Group__21__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group__21"


    // $ANTLR start "rule__FTZone__Group__21__Impl"
    // InternalFairtracksDsl.g:2616:1: rule__FTZone__Group__21__Impl : ( '}' ) ;
    public final void rule__FTZone__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2620:1: ( ( '}' ) )
            // InternalFairtracksDsl.g:2621:1: ( '}' )
            {
            // InternalFairtracksDsl.g:2621:1: ( '}' )
            // InternalFairtracksDsl.g:2622:2: '}'
            {
             before(grammarAccess.getFTZoneAccess().getRightCurlyBracketKeyword_21()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getFTZoneAccess().getRightCurlyBracketKeyword_21()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group__21__Impl"


    // $ANTLR start "rule__FTZone__Group_15__0"
    // InternalFairtracksDsl.g:2632:1: rule__FTZone__Group_15__0 : rule__FTZone__Group_15__0__Impl rule__FTZone__Group_15__1 ;
    public final void rule__FTZone__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2636:1: ( rule__FTZone__Group_15__0__Impl rule__FTZone__Group_15__1 )
            // InternalFairtracksDsl.g:2637:2: rule__FTZone__Group_15__0__Impl rule__FTZone__Group_15__1
            {
            pushFollow(FOLLOW_9);
            rule__FTZone__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZone__Group_15__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_15__0"


    // $ANTLR start "rule__FTZone__Group_15__0__Impl"
    // InternalFairtracksDsl.g:2644:1: rule__FTZone__Group_15__0__Impl : ( 'contains' ) ;
    public final void rule__FTZone__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2648:1: ( ( 'contains' ) )
            // InternalFairtracksDsl.g:2649:1: ( 'contains' )
            {
            // InternalFairtracksDsl.g:2649:1: ( 'contains' )
            // InternalFairtracksDsl.g:2650:2: 'contains'
            {
             before(grammarAccess.getFTZoneAccess().getContainsKeyword_15_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getFTZoneAccess().getContainsKeyword_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_15__0__Impl"


    // $ANTLR start "rule__FTZone__Group_15__1"
    // InternalFairtracksDsl.g:2659:1: rule__FTZone__Group_15__1 : rule__FTZone__Group_15__1__Impl rule__FTZone__Group_15__2 ;
    public final void rule__FTZone__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2663:1: ( rule__FTZone__Group_15__1__Impl rule__FTZone__Group_15__2 )
            // InternalFairtracksDsl.g:2664:2: rule__FTZone__Group_15__1__Impl rule__FTZone__Group_15__2
            {
            pushFollow(FOLLOW_10);
            rule__FTZone__Group_15__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZone__Group_15__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_15__1"


    // $ANTLR start "rule__FTZone__Group_15__1__Impl"
    // InternalFairtracksDsl.g:2671:1: rule__FTZone__Group_15__1__Impl : ( ':' ) ;
    public final void rule__FTZone__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2675:1: ( ( ':' ) )
            // InternalFairtracksDsl.g:2676:1: ( ':' )
            {
            // InternalFairtracksDsl.g:2676:1: ( ':' )
            // InternalFairtracksDsl.g:2677:2: ':'
            {
             before(grammarAccess.getFTZoneAccess().getColonKeyword_15_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getFTZoneAccess().getColonKeyword_15_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_15__1__Impl"


    // $ANTLR start "rule__FTZone__Group_15__2"
    // InternalFairtracksDsl.g:2686:1: rule__FTZone__Group_15__2 : rule__FTZone__Group_15__2__Impl rule__FTZone__Group_15__3 ;
    public final void rule__FTZone__Group_15__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2690:1: ( rule__FTZone__Group_15__2__Impl rule__FTZone__Group_15__3 )
            // InternalFairtracksDsl.g:2691:2: rule__FTZone__Group_15__2__Impl rule__FTZone__Group_15__3
            {
            pushFollow(FOLLOW_19);
            rule__FTZone__Group_15__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZone__Group_15__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_15__2"


    // $ANTLR start "rule__FTZone__Group_15__2__Impl"
    // InternalFairtracksDsl.g:2698:1: rule__FTZone__Group_15__2__Impl : ( ( rule__FTZone__ContainsAssignment_15_2 ) ) ;
    public final void rule__FTZone__Group_15__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2702:1: ( ( ( rule__FTZone__ContainsAssignment_15_2 ) ) )
            // InternalFairtracksDsl.g:2703:1: ( ( rule__FTZone__ContainsAssignment_15_2 ) )
            {
            // InternalFairtracksDsl.g:2703:1: ( ( rule__FTZone__ContainsAssignment_15_2 ) )
            // InternalFairtracksDsl.g:2704:2: ( rule__FTZone__ContainsAssignment_15_2 )
            {
             before(grammarAccess.getFTZoneAccess().getContainsAssignment_15_2()); 
            // InternalFairtracksDsl.g:2705:2: ( rule__FTZone__ContainsAssignment_15_2 )
            // InternalFairtracksDsl.g:2705:3: rule__FTZone__ContainsAssignment_15_2
            {
            pushFollow(FOLLOW_2);
            rule__FTZone__ContainsAssignment_15_2();

            state._fsp--;


            }

             after(grammarAccess.getFTZoneAccess().getContainsAssignment_15_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_15__2__Impl"


    // $ANTLR start "rule__FTZone__Group_15__3"
    // InternalFairtracksDsl.g:2713:1: rule__FTZone__Group_15__3 : rule__FTZone__Group_15__3__Impl rule__FTZone__Group_15__4 ;
    public final void rule__FTZone__Group_15__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2717:1: ( rule__FTZone__Group_15__3__Impl rule__FTZone__Group_15__4 )
            // InternalFairtracksDsl.g:2718:2: rule__FTZone__Group_15__3__Impl rule__FTZone__Group_15__4
            {
            pushFollow(FOLLOW_19);
            rule__FTZone__Group_15__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZone__Group_15__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_15__3"


    // $ANTLR start "rule__FTZone__Group_15__3__Impl"
    // InternalFairtracksDsl.g:2725:1: rule__FTZone__Group_15__3__Impl : ( ( rule__FTZone__Group_15_3__0 )* ) ;
    public final void rule__FTZone__Group_15__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2729:1: ( ( ( rule__FTZone__Group_15_3__0 )* ) )
            // InternalFairtracksDsl.g:2730:1: ( ( rule__FTZone__Group_15_3__0 )* )
            {
            // InternalFairtracksDsl.g:2730:1: ( ( rule__FTZone__Group_15_3__0 )* )
            // InternalFairtracksDsl.g:2731:2: ( rule__FTZone__Group_15_3__0 )*
            {
             before(grammarAccess.getFTZoneAccess().getGroup_15_3()); 
            // InternalFairtracksDsl.g:2732:2: ( rule__FTZone__Group_15_3__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==44) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalFairtracksDsl.g:2732:3: rule__FTZone__Group_15_3__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__FTZone__Group_15_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getFTZoneAccess().getGroup_15_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_15__3__Impl"


    // $ANTLR start "rule__FTZone__Group_15__4"
    // InternalFairtracksDsl.g:2740:1: rule__FTZone__Group_15__4 : rule__FTZone__Group_15__4__Impl ;
    public final void rule__FTZone__Group_15__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2744:1: ( rule__FTZone__Group_15__4__Impl )
            // InternalFairtracksDsl.g:2745:2: rule__FTZone__Group_15__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FTZone__Group_15__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_15__4"


    // $ANTLR start "rule__FTZone__Group_15__4__Impl"
    // InternalFairtracksDsl.g:2751:1: rule__FTZone__Group_15__4__Impl : ( ';' ) ;
    public final void rule__FTZone__Group_15__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2755:1: ( ( ';' ) )
            // InternalFairtracksDsl.g:2756:1: ( ';' )
            {
            // InternalFairtracksDsl.g:2756:1: ( ';' )
            // InternalFairtracksDsl.g:2757:2: ';'
            {
             before(grammarAccess.getFTZoneAccess().getSemicolonKeyword_15_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getFTZoneAccess().getSemicolonKeyword_15_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_15__4__Impl"


    // $ANTLR start "rule__FTZone__Group_15_3__0"
    // InternalFairtracksDsl.g:2767:1: rule__FTZone__Group_15_3__0 : rule__FTZone__Group_15_3__0__Impl rule__FTZone__Group_15_3__1 ;
    public final void rule__FTZone__Group_15_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2771:1: ( rule__FTZone__Group_15_3__0__Impl rule__FTZone__Group_15_3__1 )
            // InternalFairtracksDsl.g:2772:2: rule__FTZone__Group_15_3__0__Impl rule__FTZone__Group_15_3__1
            {
            pushFollow(FOLLOW_10);
            rule__FTZone__Group_15_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZone__Group_15_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_15_3__0"


    // $ANTLR start "rule__FTZone__Group_15_3__0__Impl"
    // InternalFairtracksDsl.g:2779:1: rule__FTZone__Group_15_3__0__Impl : ( ',' ) ;
    public final void rule__FTZone__Group_15_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2783:1: ( ( ',' ) )
            // InternalFairtracksDsl.g:2784:1: ( ',' )
            {
            // InternalFairtracksDsl.g:2784:1: ( ',' )
            // InternalFairtracksDsl.g:2785:2: ','
            {
             before(grammarAccess.getFTZoneAccess().getCommaKeyword_15_3_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getFTZoneAccess().getCommaKeyword_15_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_15_3__0__Impl"


    // $ANTLR start "rule__FTZone__Group_15_3__1"
    // InternalFairtracksDsl.g:2794:1: rule__FTZone__Group_15_3__1 : rule__FTZone__Group_15_3__1__Impl ;
    public final void rule__FTZone__Group_15_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2798:1: ( rule__FTZone__Group_15_3__1__Impl )
            // InternalFairtracksDsl.g:2799:2: rule__FTZone__Group_15_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FTZone__Group_15_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_15_3__1"


    // $ANTLR start "rule__FTZone__Group_15_3__1__Impl"
    // InternalFairtracksDsl.g:2805:1: rule__FTZone__Group_15_3__1__Impl : ( ( rule__FTZone__ContainsAssignment_15_3_1 ) ) ;
    public final void rule__FTZone__Group_15_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2809:1: ( ( ( rule__FTZone__ContainsAssignment_15_3_1 ) ) )
            // InternalFairtracksDsl.g:2810:1: ( ( rule__FTZone__ContainsAssignment_15_3_1 ) )
            {
            // InternalFairtracksDsl.g:2810:1: ( ( rule__FTZone__ContainsAssignment_15_3_1 ) )
            // InternalFairtracksDsl.g:2811:2: ( rule__FTZone__ContainsAssignment_15_3_1 )
            {
             before(grammarAccess.getFTZoneAccess().getContainsAssignment_15_3_1()); 
            // InternalFairtracksDsl.g:2812:2: ( rule__FTZone__ContainsAssignment_15_3_1 )
            // InternalFairtracksDsl.g:2812:3: rule__FTZone__ContainsAssignment_15_3_1
            {
            pushFollow(FOLLOW_2);
            rule__FTZone__ContainsAssignment_15_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFTZoneAccess().getContainsAssignment_15_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_15_3__1__Impl"


    // $ANTLR start "rule__FTZone__Group_16__0"
    // InternalFairtracksDsl.g:2821:1: rule__FTZone__Group_16__0 : rule__FTZone__Group_16__0__Impl rule__FTZone__Group_16__1 ;
    public final void rule__FTZone__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2825:1: ( rule__FTZone__Group_16__0__Impl rule__FTZone__Group_16__1 )
            // InternalFairtracksDsl.g:2826:2: rule__FTZone__Group_16__0__Impl rule__FTZone__Group_16__1
            {
            pushFollow(FOLLOW_9);
            rule__FTZone__Group_16__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZone__Group_16__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_16__0"


    // $ANTLR start "rule__FTZone__Group_16__0__Impl"
    // InternalFairtracksDsl.g:2833:1: rule__FTZone__Group_16__0__Impl : ( 'partiallyOverlaps' ) ;
    public final void rule__FTZone__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2837:1: ( ( 'partiallyOverlaps' ) )
            // InternalFairtracksDsl.g:2838:1: ( 'partiallyOverlaps' )
            {
            // InternalFairtracksDsl.g:2838:1: ( 'partiallyOverlaps' )
            // InternalFairtracksDsl.g:2839:2: 'partiallyOverlaps'
            {
             before(grammarAccess.getFTZoneAccess().getPartiallyOverlapsKeyword_16_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getFTZoneAccess().getPartiallyOverlapsKeyword_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_16__0__Impl"


    // $ANTLR start "rule__FTZone__Group_16__1"
    // InternalFairtracksDsl.g:2848:1: rule__FTZone__Group_16__1 : rule__FTZone__Group_16__1__Impl rule__FTZone__Group_16__2 ;
    public final void rule__FTZone__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2852:1: ( rule__FTZone__Group_16__1__Impl rule__FTZone__Group_16__2 )
            // InternalFairtracksDsl.g:2853:2: rule__FTZone__Group_16__1__Impl rule__FTZone__Group_16__2
            {
            pushFollow(FOLLOW_10);
            rule__FTZone__Group_16__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZone__Group_16__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_16__1"


    // $ANTLR start "rule__FTZone__Group_16__1__Impl"
    // InternalFairtracksDsl.g:2860:1: rule__FTZone__Group_16__1__Impl : ( ':' ) ;
    public final void rule__FTZone__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2864:1: ( ( ':' ) )
            // InternalFairtracksDsl.g:2865:1: ( ':' )
            {
            // InternalFairtracksDsl.g:2865:1: ( ':' )
            // InternalFairtracksDsl.g:2866:2: ':'
            {
             before(grammarAccess.getFTZoneAccess().getColonKeyword_16_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getFTZoneAccess().getColonKeyword_16_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_16__1__Impl"


    // $ANTLR start "rule__FTZone__Group_16__2"
    // InternalFairtracksDsl.g:2875:1: rule__FTZone__Group_16__2 : rule__FTZone__Group_16__2__Impl rule__FTZone__Group_16__3 ;
    public final void rule__FTZone__Group_16__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2879:1: ( rule__FTZone__Group_16__2__Impl rule__FTZone__Group_16__3 )
            // InternalFairtracksDsl.g:2880:2: rule__FTZone__Group_16__2__Impl rule__FTZone__Group_16__3
            {
            pushFollow(FOLLOW_19);
            rule__FTZone__Group_16__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZone__Group_16__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_16__2"


    // $ANTLR start "rule__FTZone__Group_16__2__Impl"
    // InternalFairtracksDsl.g:2887:1: rule__FTZone__Group_16__2__Impl : ( ( rule__FTZone__PartiallyOverlapsAssignment_16_2 ) ) ;
    public final void rule__FTZone__Group_16__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2891:1: ( ( ( rule__FTZone__PartiallyOverlapsAssignment_16_2 ) ) )
            // InternalFairtracksDsl.g:2892:1: ( ( rule__FTZone__PartiallyOverlapsAssignment_16_2 ) )
            {
            // InternalFairtracksDsl.g:2892:1: ( ( rule__FTZone__PartiallyOverlapsAssignment_16_2 ) )
            // InternalFairtracksDsl.g:2893:2: ( rule__FTZone__PartiallyOverlapsAssignment_16_2 )
            {
             before(grammarAccess.getFTZoneAccess().getPartiallyOverlapsAssignment_16_2()); 
            // InternalFairtracksDsl.g:2894:2: ( rule__FTZone__PartiallyOverlapsAssignment_16_2 )
            // InternalFairtracksDsl.g:2894:3: rule__FTZone__PartiallyOverlapsAssignment_16_2
            {
            pushFollow(FOLLOW_2);
            rule__FTZone__PartiallyOverlapsAssignment_16_2();

            state._fsp--;


            }

             after(grammarAccess.getFTZoneAccess().getPartiallyOverlapsAssignment_16_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_16__2__Impl"


    // $ANTLR start "rule__FTZone__Group_16__3"
    // InternalFairtracksDsl.g:2902:1: rule__FTZone__Group_16__3 : rule__FTZone__Group_16__3__Impl rule__FTZone__Group_16__4 ;
    public final void rule__FTZone__Group_16__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2906:1: ( rule__FTZone__Group_16__3__Impl rule__FTZone__Group_16__4 )
            // InternalFairtracksDsl.g:2907:2: rule__FTZone__Group_16__3__Impl rule__FTZone__Group_16__4
            {
            pushFollow(FOLLOW_19);
            rule__FTZone__Group_16__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZone__Group_16__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_16__3"


    // $ANTLR start "rule__FTZone__Group_16__3__Impl"
    // InternalFairtracksDsl.g:2914:1: rule__FTZone__Group_16__3__Impl : ( ( rule__FTZone__Group_16_3__0 )* ) ;
    public final void rule__FTZone__Group_16__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2918:1: ( ( ( rule__FTZone__Group_16_3__0 )* ) )
            // InternalFairtracksDsl.g:2919:1: ( ( rule__FTZone__Group_16_3__0 )* )
            {
            // InternalFairtracksDsl.g:2919:1: ( ( rule__FTZone__Group_16_3__0 )* )
            // InternalFairtracksDsl.g:2920:2: ( rule__FTZone__Group_16_3__0 )*
            {
             before(grammarAccess.getFTZoneAccess().getGroup_16_3()); 
            // InternalFairtracksDsl.g:2921:2: ( rule__FTZone__Group_16_3__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==44) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalFairtracksDsl.g:2921:3: rule__FTZone__Group_16_3__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__FTZone__Group_16_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getFTZoneAccess().getGroup_16_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_16__3__Impl"


    // $ANTLR start "rule__FTZone__Group_16__4"
    // InternalFairtracksDsl.g:2929:1: rule__FTZone__Group_16__4 : rule__FTZone__Group_16__4__Impl ;
    public final void rule__FTZone__Group_16__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2933:1: ( rule__FTZone__Group_16__4__Impl )
            // InternalFairtracksDsl.g:2934:2: rule__FTZone__Group_16__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FTZone__Group_16__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_16__4"


    // $ANTLR start "rule__FTZone__Group_16__4__Impl"
    // InternalFairtracksDsl.g:2940:1: rule__FTZone__Group_16__4__Impl : ( ';' ) ;
    public final void rule__FTZone__Group_16__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2944:1: ( ( ';' ) )
            // InternalFairtracksDsl.g:2945:1: ( ';' )
            {
            // InternalFairtracksDsl.g:2945:1: ( ';' )
            // InternalFairtracksDsl.g:2946:2: ';'
            {
             before(grammarAccess.getFTZoneAccess().getSemicolonKeyword_16_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getFTZoneAccess().getSemicolonKeyword_16_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_16__4__Impl"


    // $ANTLR start "rule__FTZone__Group_16_3__0"
    // InternalFairtracksDsl.g:2956:1: rule__FTZone__Group_16_3__0 : rule__FTZone__Group_16_3__0__Impl rule__FTZone__Group_16_3__1 ;
    public final void rule__FTZone__Group_16_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2960:1: ( rule__FTZone__Group_16_3__0__Impl rule__FTZone__Group_16_3__1 )
            // InternalFairtracksDsl.g:2961:2: rule__FTZone__Group_16_3__0__Impl rule__FTZone__Group_16_3__1
            {
            pushFollow(FOLLOW_10);
            rule__FTZone__Group_16_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZone__Group_16_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_16_3__0"


    // $ANTLR start "rule__FTZone__Group_16_3__0__Impl"
    // InternalFairtracksDsl.g:2968:1: rule__FTZone__Group_16_3__0__Impl : ( ',' ) ;
    public final void rule__FTZone__Group_16_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2972:1: ( ( ',' ) )
            // InternalFairtracksDsl.g:2973:1: ( ',' )
            {
            // InternalFairtracksDsl.g:2973:1: ( ',' )
            // InternalFairtracksDsl.g:2974:2: ','
            {
             before(grammarAccess.getFTZoneAccess().getCommaKeyword_16_3_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getFTZoneAccess().getCommaKeyword_16_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_16_3__0__Impl"


    // $ANTLR start "rule__FTZone__Group_16_3__1"
    // InternalFairtracksDsl.g:2983:1: rule__FTZone__Group_16_3__1 : rule__FTZone__Group_16_3__1__Impl ;
    public final void rule__FTZone__Group_16_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2987:1: ( rule__FTZone__Group_16_3__1__Impl )
            // InternalFairtracksDsl.g:2988:2: rule__FTZone__Group_16_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FTZone__Group_16_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_16_3__1"


    // $ANTLR start "rule__FTZone__Group_16_3__1__Impl"
    // InternalFairtracksDsl.g:2994:1: rule__FTZone__Group_16_3__1__Impl : ( ( rule__FTZone__PartiallyOverlapsAssignment_16_3_1 ) ) ;
    public final void rule__FTZone__Group_16_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:2998:1: ( ( ( rule__FTZone__PartiallyOverlapsAssignment_16_3_1 ) ) )
            // InternalFairtracksDsl.g:2999:1: ( ( rule__FTZone__PartiallyOverlapsAssignment_16_3_1 ) )
            {
            // InternalFairtracksDsl.g:2999:1: ( ( rule__FTZone__PartiallyOverlapsAssignment_16_3_1 ) )
            // InternalFairtracksDsl.g:3000:2: ( rule__FTZone__PartiallyOverlapsAssignment_16_3_1 )
            {
             before(grammarAccess.getFTZoneAccess().getPartiallyOverlapsAssignment_16_3_1()); 
            // InternalFairtracksDsl.g:3001:2: ( rule__FTZone__PartiallyOverlapsAssignment_16_3_1 )
            // InternalFairtracksDsl.g:3001:3: rule__FTZone__PartiallyOverlapsAssignment_16_3_1
            {
            pushFollow(FOLLOW_2);
            rule__FTZone__PartiallyOverlapsAssignment_16_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFTZoneAccess().getPartiallyOverlapsAssignment_16_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_16_3__1__Impl"


    // $ANTLR start "rule__FTZone__Group_17__0"
    // InternalFairtracksDsl.g:3010:1: rule__FTZone__Group_17__0 : rule__FTZone__Group_17__0__Impl rule__FTZone__Group_17__1 ;
    public final void rule__FTZone__Group_17__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3014:1: ( rule__FTZone__Group_17__0__Impl rule__FTZone__Group_17__1 )
            // InternalFairtracksDsl.g:3015:2: rule__FTZone__Group_17__0__Impl rule__FTZone__Group_17__1
            {
            pushFollow(FOLLOW_9);
            rule__FTZone__Group_17__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZone__Group_17__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_17__0"


    // $ANTLR start "rule__FTZone__Group_17__0__Impl"
    // InternalFairtracksDsl.g:3022:1: rule__FTZone__Group_17__0__Impl : ( 'isAdjacentTo' ) ;
    public final void rule__FTZone__Group_17__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3026:1: ( ( 'isAdjacentTo' ) )
            // InternalFairtracksDsl.g:3027:1: ( 'isAdjacentTo' )
            {
            // InternalFairtracksDsl.g:3027:1: ( 'isAdjacentTo' )
            // InternalFairtracksDsl.g:3028:2: 'isAdjacentTo'
            {
             before(grammarAccess.getFTZoneAccess().getIsAdjacentToKeyword_17_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getFTZoneAccess().getIsAdjacentToKeyword_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_17__0__Impl"


    // $ANTLR start "rule__FTZone__Group_17__1"
    // InternalFairtracksDsl.g:3037:1: rule__FTZone__Group_17__1 : rule__FTZone__Group_17__1__Impl rule__FTZone__Group_17__2 ;
    public final void rule__FTZone__Group_17__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3041:1: ( rule__FTZone__Group_17__1__Impl rule__FTZone__Group_17__2 )
            // InternalFairtracksDsl.g:3042:2: rule__FTZone__Group_17__1__Impl rule__FTZone__Group_17__2
            {
            pushFollow(FOLLOW_10);
            rule__FTZone__Group_17__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZone__Group_17__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_17__1"


    // $ANTLR start "rule__FTZone__Group_17__1__Impl"
    // InternalFairtracksDsl.g:3049:1: rule__FTZone__Group_17__1__Impl : ( ':' ) ;
    public final void rule__FTZone__Group_17__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3053:1: ( ( ':' ) )
            // InternalFairtracksDsl.g:3054:1: ( ':' )
            {
            // InternalFairtracksDsl.g:3054:1: ( ':' )
            // InternalFairtracksDsl.g:3055:2: ':'
            {
             before(grammarAccess.getFTZoneAccess().getColonKeyword_17_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getFTZoneAccess().getColonKeyword_17_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_17__1__Impl"


    // $ANTLR start "rule__FTZone__Group_17__2"
    // InternalFairtracksDsl.g:3064:1: rule__FTZone__Group_17__2 : rule__FTZone__Group_17__2__Impl rule__FTZone__Group_17__3 ;
    public final void rule__FTZone__Group_17__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3068:1: ( rule__FTZone__Group_17__2__Impl rule__FTZone__Group_17__3 )
            // InternalFairtracksDsl.g:3069:2: rule__FTZone__Group_17__2__Impl rule__FTZone__Group_17__3
            {
            pushFollow(FOLLOW_19);
            rule__FTZone__Group_17__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZone__Group_17__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_17__2"


    // $ANTLR start "rule__FTZone__Group_17__2__Impl"
    // InternalFairtracksDsl.g:3076:1: rule__FTZone__Group_17__2__Impl : ( ( rule__FTZone__IsAdjacentToAssignment_17_2 ) ) ;
    public final void rule__FTZone__Group_17__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3080:1: ( ( ( rule__FTZone__IsAdjacentToAssignment_17_2 ) ) )
            // InternalFairtracksDsl.g:3081:1: ( ( rule__FTZone__IsAdjacentToAssignment_17_2 ) )
            {
            // InternalFairtracksDsl.g:3081:1: ( ( rule__FTZone__IsAdjacentToAssignment_17_2 ) )
            // InternalFairtracksDsl.g:3082:2: ( rule__FTZone__IsAdjacentToAssignment_17_2 )
            {
             before(grammarAccess.getFTZoneAccess().getIsAdjacentToAssignment_17_2()); 
            // InternalFairtracksDsl.g:3083:2: ( rule__FTZone__IsAdjacentToAssignment_17_2 )
            // InternalFairtracksDsl.g:3083:3: rule__FTZone__IsAdjacentToAssignment_17_2
            {
            pushFollow(FOLLOW_2);
            rule__FTZone__IsAdjacentToAssignment_17_2();

            state._fsp--;


            }

             after(grammarAccess.getFTZoneAccess().getIsAdjacentToAssignment_17_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_17__2__Impl"


    // $ANTLR start "rule__FTZone__Group_17__3"
    // InternalFairtracksDsl.g:3091:1: rule__FTZone__Group_17__3 : rule__FTZone__Group_17__3__Impl rule__FTZone__Group_17__4 ;
    public final void rule__FTZone__Group_17__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3095:1: ( rule__FTZone__Group_17__3__Impl rule__FTZone__Group_17__4 )
            // InternalFairtracksDsl.g:3096:2: rule__FTZone__Group_17__3__Impl rule__FTZone__Group_17__4
            {
            pushFollow(FOLLOW_19);
            rule__FTZone__Group_17__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZone__Group_17__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_17__3"


    // $ANTLR start "rule__FTZone__Group_17__3__Impl"
    // InternalFairtracksDsl.g:3103:1: rule__FTZone__Group_17__3__Impl : ( ( rule__FTZone__Group_17_3__0 )* ) ;
    public final void rule__FTZone__Group_17__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3107:1: ( ( ( rule__FTZone__Group_17_3__0 )* ) )
            // InternalFairtracksDsl.g:3108:1: ( ( rule__FTZone__Group_17_3__0 )* )
            {
            // InternalFairtracksDsl.g:3108:1: ( ( rule__FTZone__Group_17_3__0 )* )
            // InternalFairtracksDsl.g:3109:2: ( rule__FTZone__Group_17_3__0 )*
            {
             before(grammarAccess.getFTZoneAccess().getGroup_17_3()); 
            // InternalFairtracksDsl.g:3110:2: ( rule__FTZone__Group_17_3__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==44) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalFairtracksDsl.g:3110:3: rule__FTZone__Group_17_3__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__FTZone__Group_17_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getFTZoneAccess().getGroup_17_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_17__3__Impl"


    // $ANTLR start "rule__FTZone__Group_17__4"
    // InternalFairtracksDsl.g:3118:1: rule__FTZone__Group_17__4 : rule__FTZone__Group_17__4__Impl ;
    public final void rule__FTZone__Group_17__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3122:1: ( rule__FTZone__Group_17__4__Impl )
            // InternalFairtracksDsl.g:3123:2: rule__FTZone__Group_17__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FTZone__Group_17__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_17__4"


    // $ANTLR start "rule__FTZone__Group_17__4__Impl"
    // InternalFairtracksDsl.g:3129:1: rule__FTZone__Group_17__4__Impl : ( ';' ) ;
    public final void rule__FTZone__Group_17__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3133:1: ( ( ';' ) )
            // InternalFairtracksDsl.g:3134:1: ( ';' )
            {
            // InternalFairtracksDsl.g:3134:1: ( ';' )
            // InternalFairtracksDsl.g:3135:2: ';'
            {
             before(grammarAccess.getFTZoneAccess().getSemicolonKeyword_17_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getFTZoneAccess().getSemicolonKeyword_17_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_17__4__Impl"


    // $ANTLR start "rule__FTZone__Group_17_3__0"
    // InternalFairtracksDsl.g:3145:1: rule__FTZone__Group_17_3__0 : rule__FTZone__Group_17_3__0__Impl rule__FTZone__Group_17_3__1 ;
    public final void rule__FTZone__Group_17_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3149:1: ( rule__FTZone__Group_17_3__0__Impl rule__FTZone__Group_17_3__1 )
            // InternalFairtracksDsl.g:3150:2: rule__FTZone__Group_17_3__0__Impl rule__FTZone__Group_17_3__1
            {
            pushFollow(FOLLOW_10);
            rule__FTZone__Group_17_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZone__Group_17_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_17_3__0"


    // $ANTLR start "rule__FTZone__Group_17_3__0__Impl"
    // InternalFairtracksDsl.g:3157:1: rule__FTZone__Group_17_3__0__Impl : ( ',' ) ;
    public final void rule__FTZone__Group_17_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3161:1: ( ( ',' ) )
            // InternalFairtracksDsl.g:3162:1: ( ',' )
            {
            // InternalFairtracksDsl.g:3162:1: ( ',' )
            // InternalFairtracksDsl.g:3163:2: ','
            {
             before(grammarAccess.getFTZoneAccess().getCommaKeyword_17_3_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getFTZoneAccess().getCommaKeyword_17_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_17_3__0__Impl"


    // $ANTLR start "rule__FTZone__Group_17_3__1"
    // InternalFairtracksDsl.g:3172:1: rule__FTZone__Group_17_3__1 : rule__FTZone__Group_17_3__1__Impl ;
    public final void rule__FTZone__Group_17_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3176:1: ( rule__FTZone__Group_17_3__1__Impl )
            // InternalFairtracksDsl.g:3177:2: rule__FTZone__Group_17_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FTZone__Group_17_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_17_3__1"


    // $ANTLR start "rule__FTZone__Group_17_3__1__Impl"
    // InternalFairtracksDsl.g:3183:1: rule__FTZone__Group_17_3__1__Impl : ( ( rule__FTZone__IsAdjacentToAssignment_17_3_1 ) ) ;
    public final void rule__FTZone__Group_17_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3187:1: ( ( ( rule__FTZone__IsAdjacentToAssignment_17_3_1 ) ) )
            // InternalFairtracksDsl.g:3188:1: ( ( rule__FTZone__IsAdjacentToAssignment_17_3_1 ) )
            {
            // InternalFairtracksDsl.g:3188:1: ( ( rule__FTZone__IsAdjacentToAssignment_17_3_1 ) )
            // InternalFairtracksDsl.g:3189:2: ( rule__FTZone__IsAdjacentToAssignment_17_3_1 )
            {
             before(grammarAccess.getFTZoneAccess().getIsAdjacentToAssignment_17_3_1()); 
            // InternalFairtracksDsl.g:3190:2: ( rule__FTZone__IsAdjacentToAssignment_17_3_1 )
            // InternalFairtracksDsl.g:3190:3: rule__FTZone__IsAdjacentToAssignment_17_3_1
            {
            pushFollow(FOLLOW_2);
            rule__FTZone__IsAdjacentToAssignment_17_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFTZoneAccess().getIsAdjacentToAssignment_17_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_17_3__1__Impl"


    // $ANTLR start "rule__FTZone__Group_18__0"
    // InternalFairtracksDsl.g:3199:1: rule__FTZone__Group_18__0 : rule__FTZone__Group_18__0__Impl rule__FTZone__Group_18__1 ;
    public final void rule__FTZone__Group_18__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3203:1: ( rule__FTZone__Group_18__0__Impl rule__FTZone__Group_18__1 )
            // InternalFairtracksDsl.g:3204:2: rule__FTZone__Group_18__0__Impl rule__FTZone__Group_18__1
            {
            pushFollow(FOLLOW_9);
            rule__FTZone__Group_18__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZone__Group_18__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_18__0"


    // $ANTLR start "rule__FTZone__Group_18__0__Impl"
    // InternalFairtracksDsl.g:3211:1: rule__FTZone__Group_18__0__Impl : ( 'disallowedPlayers' ) ;
    public final void rule__FTZone__Group_18__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3215:1: ( ( 'disallowedPlayers' ) )
            // InternalFairtracksDsl.g:3216:1: ( 'disallowedPlayers' )
            {
            // InternalFairtracksDsl.g:3216:1: ( 'disallowedPlayers' )
            // InternalFairtracksDsl.g:3217:2: 'disallowedPlayers'
            {
             before(grammarAccess.getFTZoneAccess().getDisallowedPlayersKeyword_18_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getFTZoneAccess().getDisallowedPlayersKeyword_18_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_18__0__Impl"


    // $ANTLR start "rule__FTZone__Group_18__1"
    // InternalFairtracksDsl.g:3226:1: rule__FTZone__Group_18__1 : rule__FTZone__Group_18__1__Impl rule__FTZone__Group_18__2 ;
    public final void rule__FTZone__Group_18__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3230:1: ( rule__FTZone__Group_18__1__Impl rule__FTZone__Group_18__2 )
            // InternalFairtracksDsl.g:3231:2: rule__FTZone__Group_18__1__Impl rule__FTZone__Group_18__2
            {
            pushFollow(FOLLOW_10);
            rule__FTZone__Group_18__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZone__Group_18__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_18__1"


    // $ANTLR start "rule__FTZone__Group_18__1__Impl"
    // InternalFairtracksDsl.g:3238:1: rule__FTZone__Group_18__1__Impl : ( ':' ) ;
    public final void rule__FTZone__Group_18__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3242:1: ( ( ':' ) )
            // InternalFairtracksDsl.g:3243:1: ( ':' )
            {
            // InternalFairtracksDsl.g:3243:1: ( ':' )
            // InternalFairtracksDsl.g:3244:2: ':'
            {
             before(grammarAccess.getFTZoneAccess().getColonKeyword_18_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getFTZoneAccess().getColonKeyword_18_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_18__1__Impl"


    // $ANTLR start "rule__FTZone__Group_18__2"
    // InternalFairtracksDsl.g:3253:1: rule__FTZone__Group_18__2 : rule__FTZone__Group_18__2__Impl rule__FTZone__Group_18__3 ;
    public final void rule__FTZone__Group_18__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3257:1: ( rule__FTZone__Group_18__2__Impl rule__FTZone__Group_18__3 )
            // InternalFairtracksDsl.g:3258:2: rule__FTZone__Group_18__2__Impl rule__FTZone__Group_18__3
            {
            pushFollow(FOLLOW_19);
            rule__FTZone__Group_18__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZone__Group_18__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_18__2"


    // $ANTLR start "rule__FTZone__Group_18__2__Impl"
    // InternalFairtracksDsl.g:3265:1: rule__FTZone__Group_18__2__Impl : ( ( rule__FTZone__DisallowedPlayersAssignment_18_2 ) ) ;
    public final void rule__FTZone__Group_18__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3269:1: ( ( ( rule__FTZone__DisallowedPlayersAssignment_18_2 ) ) )
            // InternalFairtracksDsl.g:3270:1: ( ( rule__FTZone__DisallowedPlayersAssignment_18_2 ) )
            {
            // InternalFairtracksDsl.g:3270:1: ( ( rule__FTZone__DisallowedPlayersAssignment_18_2 ) )
            // InternalFairtracksDsl.g:3271:2: ( rule__FTZone__DisallowedPlayersAssignment_18_2 )
            {
             before(grammarAccess.getFTZoneAccess().getDisallowedPlayersAssignment_18_2()); 
            // InternalFairtracksDsl.g:3272:2: ( rule__FTZone__DisallowedPlayersAssignment_18_2 )
            // InternalFairtracksDsl.g:3272:3: rule__FTZone__DisallowedPlayersAssignment_18_2
            {
            pushFollow(FOLLOW_2);
            rule__FTZone__DisallowedPlayersAssignment_18_2();

            state._fsp--;


            }

             after(grammarAccess.getFTZoneAccess().getDisallowedPlayersAssignment_18_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_18__2__Impl"


    // $ANTLR start "rule__FTZone__Group_18__3"
    // InternalFairtracksDsl.g:3280:1: rule__FTZone__Group_18__3 : rule__FTZone__Group_18__3__Impl rule__FTZone__Group_18__4 ;
    public final void rule__FTZone__Group_18__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3284:1: ( rule__FTZone__Group_18__3__Impl rule__FTZone__Group_18__4 )
            // InternalFairtracksDsl.g:3285:2: rule__FTZone__Group_18__3__Impl rule__FTZone__Group_18__4
            {
            pushFollow(FOLLOW_19);
            rule__FTZone__Group_18__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZone__Group_18__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_18__3"


    // $ANTLR start "rule__FTZone__Group_18__3__Impl"
    // InternalFairtracksDsl.g:3292:1: rule__FTZone__Group_18__3__Impl : ( ( rule__FTZone__Group_18_3__0 )* ) ;
    public final void rule__FTZone__Group_18__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3296:1: ( ( ( rule__FTZone__Group_18_3__0 )* ) )
            // InternalFairtracksDsl.g:3297:1: ( ( rule__FTZone__Group_18_3__0 )* )
            {
            // InternalFairtracksDsl.g:3297:1: ( ( rule__FTZone__Group_18_3__0 )* )
            // InternalFairtracksDsl.g:3298:2: ( rule__FTZone__Group_18_3__0 )*
            {
             before(grammarAccess.getFTZoneAccess().getGroup_18_3()); 
            // InternalFairtracksDsl.g:3299:2: ( rule__FTZone__Group_18_3__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==44) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalFairtracksDsl.g:3299:3: rule__FTZone__Group_18_3__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__FTZone__Group_18_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getFTZoneAccess().getGroup_18_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_18__3__Impl"


    // $ANTLR start "rule__FTZone__Group_18__4"
    // InternalFairtracksDsl.g:3307:1: rule__FTZone__Group_18__4 : rule__FTZone__Group_18__4__Impl ;
    public final void rule__FTZone__Group_18__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3311:1: ( rule__FTZone__Group_18__4__Impl )
            // InternalFairtracksDsl.g:3312:2: rule__FTZone__Group_18__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FTZone__Group_18__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_18__4"


    // $ANTLR start "rule__FTZone__Group_18__4__Impl"
    // InternalFairtracksDsl.g:3318:1: rule__FTZone__Group_18__4__Impl : ( ';' ) ;
    public final void rule__FTZone__Group_18__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3322:1: ( ( ';' ) )
            // InternalFairtracksDsl.g:3323:1: ( ';' )
            {
            // InternalFairtracksDsl.g:3323:1: ( ';' )
            // InternalFairtracksDsl.g:3324:2: ';'
            {
             before(grammarAccess.getFTZoneAccess().getSemicolonKeyword_18_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getFTZoneAccess().getSemicolonKeyword_18_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_18__4__Impl"


    // $ANTLR start "rule__FTZone__Group_18_3__0"
    // InternalFairtracksDsl.g:3334:1: rule__FTZone__Group_18_3__0 : rule__FTZone__Group_18_3__0__Impl rule__FTZone__Group_18_3__1 ;
    public final void rule__FTZone__Group_18_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3338:1: ( rule__FTZone__Group_18_3__0__Impl rule__FTZone__Group_18_3__1 )
            // InternalFairtracksDsl.g:3339:2: rule__FTZone__Group_18_3__0__Impl rule__FTZone__Group_18_3__1
            {
            pushFollow(FOLLOW_10);
            rule__FTZone__Group_18_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZone__Group_18_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_18_3__0"


    // $ANTLR start "rule__FTZone__Group_18_3__0__Impl"
    // InternalFairtracksDsl.g:3346:1: rule__FTZone__Group_18_3__0__Impl : ( ',' ) ;
    public final void rule__FTZone__Group_18_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3350:1: ( ( ',' ) )
            // InternalFairtracksDsl.g:3351:1: ( ',' )
            {
            // InternalFairtracksDsl.g:3351:1: ( ',' )
            // InternalFairtracksDsl.g:3352:2: ','
            {
             before(grammarAccess.getFTZoneAccess().getCommaKeyword_18_3_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getFTZoneAccess().getCommaKeyword_18_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_18_3__0__Impl"


    // $ANTLR start "rule__FTZone__Group_18_3__1"
    // InternalFairtracksDsl.g:3361:1: rule__FTZone__Group_18_3__1 : rule__FTZone__Group_18_3__1__Impl ;
    public final void rule__FTZone__Group_18_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3365:1: ( rule__FTZone__Group_18_3__1__Impl )
            // InternalFairtracksDsl.g:3366:2: rule__FTZone__Group_18_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FTZone__Group_18_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_18_3__1"


    // $ANTLR start "rule__FTZone__Group_18_3__1__Impl"
    // InternalFairtracksDsl.g:3372:1: rule__FTZone__Group_18_3__1__Impl : ( ( rule__FTZone__DisallowedPlayersAssignment_18_3_1 ) ) ;
    public final void rule__FTZone__Group_18_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3376:1: ( ( ( rule__FTZone__DisallowedPlayersAssignment_18_3_1 ) ) )
            // InternalFairtracksDsl.g:3377:1: ( ( rule__FTZone__DisallowedPlayersAssignment_18_3_1 ) )
            {
            // InternalFairtracksDsl.g:3377:1: ( ( rule__FTZone__DisallowedPlayersAssignment_18_3_1 ) )
            // InternalFairtracksDsl.g:3378:2: ( rule__FTZone__DisallowedPlayersAssignment_18_3_1 )
            {
             before(grammarAccess.getFTZoneAccess().getDisallowedPlayersAssignment_18_3_1()); 
            // InternalFairtracksDsl.g:3379:2: ( rule__FTZone__DisallowedPlayersAssignment_18_3_1 )
            // InternalFairtracksDsl.g:3379:3: rule__FTZone__DisallowedPlayersAssignment_18_3_1
            {
            pushFollow(FOLLOW_2);
            rule__FTZone__DisallowedPlayersAssignment_18_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFTZoneAccess().getDisallowedPlayersAssignment_18_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_18_3__1__Impl"


    // $ANTLR start "rule__FTZone__Group_19__0"
    // InternalFairtracksDsl.g:3388:1: rule__FTZone__Group_19__0 : rule__FTZone__Group_19__0__Impl rule__FTZone__Group_19__1 ;
    public final void rule__FTZone__Group_19__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3392:1: ( rule__FTZone__Group_19__0__Impl rule__FTZone__Group_19__1 )
            // InternalFairtracksDsl.g:3393:2: rule__FTZone__Group_19__0__Impl rule__FTZone__Group_19__1
            {
            pushFollow(FOLLOW_9);
            rule__FTZone__Group_19__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZone__Group_19__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_19__0"


    // $ANTLR start "rule__FTZone__Group_19__0__Impl"
    // InternalFairtracksDsl.g:3400:1: rule__FTZone__Group_19__0__Impl : ( 'distance' ) ;
    public final void rule__FTZone__Group_19__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3404:1: ( ( 'distance' ) )
            // InternalFairtracksDsl.g:3405:1: ( 'distance' )
            {
            // InternalFairtracksDsl.g:3405:1: ( 'distance' )
            // InternalFairtracksDsl.g:3406:2: 'distance'
            {
             before(grammarAccess.getFTZoneAccess().getDistanceKeyword_19_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getFTZoneAccess().getDistanceKeyword_19_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_19__0__Impl"


    // $ANTLR start "rule__FTZone__Group_19__1"
    // InternalFairtracksDsl.g:3415:1: rule__FTZone__Group_19__1 : rule__FTZone__Group_19__1__Impl rule__FTZone__Group_19__2 ;
    public final void rule__FTZone__Group_19__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3419:1: ( rule__FTZone__Group_19__1__Impl rule__FTZone__Group_19__2 )
            // InternalFairtracksDsl.g:3420:2: rule__FTZone__Group_19__1__Impl rule__FTZone__Group_19__2
            {
            pushFollow(FOLLOW_3);
            rule__FTZone__Group_19__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZone__Group_19__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_19__1"


    // $ANTLR start "rule__FTZone__Group_19__1__Impl"
    // InternalFairtracksDsl.g:3427:1: rule__FTZone__Group_19__1__Impl : ( ':' ) ;
    public final void rule__FTZone__Group_19__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3431:1: ( ( ':' ) )
            // InternalFairtracksDsl.g:3432:1: ( ':' )
            {
            // InternalFairtracksDsl.g:3432:1: ( ':' )
            // InternalFairtracksDsl.g:3433:2: ':'
            {
             before(grammarAccess.getFTZoneAccess().getColonKeyword_19_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getFTZoneAccess().getColonKeyword_19_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_19__1__Impl"


    // $ANTLR start "rule__FTZone__Group_19__2"
    // InternalFairtracksDsl.g:3442:1: rule__FTZone__Group_19__2 : rule__FTZone__Group_19__2__Impl rule__FTZone__Group_19__3 ;
    public final void rule__FTZone__Group_19__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3446:1: ( rule__FTZone__Group_19__2__Impl rule__FTZone__Group_19__3 )
            // InternalFairtracksDsl.g:3447:2: rule__FTZone__Group_19__2__Impl rule__FTZone__Group_19__3
            {
            pushFollow(FOLLOW_11);
            rule__FTZone__Group_19__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZone__Group_19__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_19__2"


    // $ANTLR start "rule__FTZone__Group_19__2__Impl"
    // InternalFairtracksDsl.g:3454:1: rule__FTZone__Group_19__2__Impl : ( ( rule__FTZone__DistanceClassAssignment_19_2 ) ) ;
    public final void rule__FTZone__Group_19__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3458:1: ( ( ( rule__FTZone__DistanceClassAssignment_19_2 ) ) )
            // InternalFairtracksDsl.g:3459:1: ( ( rule__FTZone__DistanceClassAssignment_19_2 ) )
            {
            // InternalFairtracksDsl.g:3459:1: ( ( rule__FTZone__DistanceClassAssignment_19_2 ) )
            // InternalFairtracksDsl.g:3460:2: ( rule__FTZone__DistanceClassAssignment_19_2 )
            {
             before(grammarAccess.getFTZoneAccess().getDistanceClassAssignment_19_2()); 
            // InternalFairtracksDsl.g:3461:2: ( rule__FTZone__DistanceClassAssignment_19_2 )
            // InternalFairtracksDsl.g:3461:3: rule__FTZone__DistanceClassAssignment_19_2
            {
            pushFollow(FOLLOW_2);
            rule__FTZone__DistanceClassAssignment_19_2();

            state._fsp--;


            }

             after(grammarAccess.getFTZoneAccess().getDistanceClassAssignment_19_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_19__2__Impl"


    // $ANTLR start "rule__FTZone__Group_19__3"
    // InternalFairtracksDsl.g:3469:1: rule__FTZone__Group_19__3 : rule__FTZone__Group_19__3__Impl ;
    public final void rule__FTZone__Group_19__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3473:1: ( rule__FTZone__Group_19__3__Impl )
            // InternalFairtracksDsl.g:3474:2: rule__FTZone__Group_19__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FTZone__Group_19__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_19__3"


    // $ANTLR start "rule__FTZone__Group_19__3__Impl"
    // InternalFairtracksDsl.g:3480:1: rule__FTZone__Group_19__3__Impl : ( ';' ) ;
    public final void rule__FTZone__Group_19__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3484:1: ( ( ';' ) )
            // InternalFairtracksDsl.g:3485:1: ( ';' )
            {
            // InternalFairtracksDsl.g:3485:1: ( ';' )
            // InternalFairtracksDsl.g:3486:2: ';'
            {
             before(grammarAccess.getFTZoneAccess().getSemicolonKeyword_19_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getFTZoneAccess().getSemicolonKeyword_19_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_19__3__Impl"


    // $ANTLR start "rule__FTZone__Group_20__0"
    // InternalFairtracksDsl.g:3496:1: rule__FTZone__Group_20__0 : rule__FTZone__Group_20__0__Impl rule__FTZone__Group_20__1 ;
    public final void rule__FTZone__Group_20__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3500:1: ( rule__FTZone__Group_20__0__Impl rule__FTZone__Group_20__1 )
            // InternalFairtracksDsl.g:3501:2: rule__FTZone__Group_20__0__Impl rule__FTZone__Group_20__1
            {
            pushFollow(FOLLOW_21);
            rule__FTZone__Group_20__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZone__Group_20__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_20__0"


    // $ANTLR start "rule__FTZone__Group_20__0__Impl"
    // InternalFairtracksDsl.g:3508:1: rule__FTZone__Group_20__0__Impl : ( 'Real' ) ;
    public final void rule__FTZone__Group_20__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3512:1: ( ( 'Real' ) )
            // InternalFairtracksDsl.g:3513:1: ( 'Real' )
            {
            // InternalFairtracksDsl.g:3513:1: ( 'Real' )
            // InternalFairtracksDsl.g:3514:2: 'Real'
            {
             before(grammarAccess.getFTZoneAccess().getRealKeyword_20_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getFTZoneAccess().getRealKeyword_20_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_20__0__Impl"


    // $ANTLR start "rule__FTZone__Group_20__1"
    // InternalFairtracksDsl.g:3523:1: rule__FTZone__Group_20__1 : rule__FTZone__Group_20__1__Impl rule__FTZone__Group_20__2 ;
    public final void rule__FTZone__Group_20__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3527:1: ( rule__FTZone__Group_20__1__Impl rule__FTZone__Group_20__2 )
            // InternalFairtracksDsl.g:3528:2: rule__FTZone__Group_20__1__Impl rule__FTZone__Group_20__2
            {
            pushFollow(FOLLOW_9);
            rule__FTZone__Group_20__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZone__Group_20__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_20__1"


    // $ANTLR start "rule__FTZone__Group_20__1__Impl"
    // InternalFairtracksDsl.g:3535:1: rule__FTZone__Group_20__1__Impl : ( 'Coordinates' ) ;
    public final void rule__FTZone__Group_20__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3539:1: ( ( 'Coordinates' ) )
            // InternalFairtracksDsl.g:3540:1: ( 'Coordinates' )
            {
            // InternalFairtracksDsl.g:3540:1: ( 'Coordinates' )
            // InternalFairtracksDsl.g:3541:2: 'Coordinates'
            {
             before(grammarAccess.getFTZoneAccess().getCoordinatesKeyword_20_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getFTZoneAccess().getCoordinatesKeyword_20_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_20__1__Impl"


    // $ANTLR start "rule__FTZone__Group_20__2"
    // InternalFairtracksDsl.g:3550:1: rule__FTZone__Group_20__2 : rule__FTZone__Group_20__2__Impl rule__FTZone__Group_20__3 ;
    public final void rule__FTZone__Group_20__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3554:1: ( rule__FTZone__Group_20__2__Impl rule__FTZone__Group_20__3 )
            // InternalFairtracksDsl.g:3555:2: rule__FTZone__Group_20__2__Impl rule__FTZone__Group_20__3
            {
            pushFollow(FOLLOW_22);
            rule__FTZone__Group_20__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZone__Group_20__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_20__2"


    // $ANTLR start "rule__FTZone__Group_20__2__Impl"
    // InternalFairtracksDsl.g:3562:1: rule__FTZone__Group_20__2__Impl : ( ':' ) ;
    public final void rule__FTZone__Group_20__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3566:1: ( ( ':' ) )
            // InternalFairtracksDsl.g:3567:1: ( ':' )
            {
            // InternalFairtracksDsl.g:3567:1: ( ':' )
            // InternalFairtracksDsl.g:3568:2: ':'
            {
             before(grammarAccess.getFTZoneAccess().getColonKeyword_20_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getFTZoneAccess().getColonKeyword_20_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_20__2__Impl"


    // $ANTLR start "rule__FTZone__Group_20__3"
    // InternalFairtracksDsl.g:3577:1: rule__FTZone__Group_20__3 : rule__FTZone__Group_20__3__Impl rule__FTZone__Group_20__4 ;
    public final void rule__FTZone__Group_20__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3581:1: ( rule__FTZone__Group_20__3__Impl rule__FTZone__Group_20__4 )
            // InternalFairtracksDsl.g:3582:2: rule__FTZone__Group_20__3__Impl rule__FTZone__Group_20__4
            {
            pushFollow(FOLLOW_23);
            rule__FTZone__Group_20__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZone__Group_20__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_20__3"


    // $ANTLR start "rule__FTZone__Group_20__3__Impl"
    // InternalFairtracksDsl.g:3589:1: rule__FTZone__Group_20__3__Impl : ( '[' ) ;
    public final void rule__FTZone__Group_20__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3593:1: ( ( '[' ) )
            // InternalFairtracksDsl.g:3594:1: ( '[' )
            {
            // InternalFairtracksDsl.g:3594:1: ( '[' )
            // InternalFairtracksDsl.g:3595:2: '['
            {
             before(grammarAccess.getFTZoneAccess().getLeftSquareBracketKeyword_20_3()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getFTZoneAccess().getLeftSquareBracketKeyword_20_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_20__3__Impl"


    // $ANTLR start "rule__FTZone__Group_20__4"
    // InternalFairtracksDsl.g:3604:1: rule__FTZone__Group_20__4 : rule__FTZone__Group_20__4__Impl rule__FTZone__Group_20__5 ;
    public final void rule__FTZone__Group_20__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3608:1: ( rule__FTZone__Group_20__4__Impl rule__FTZone__Group_20__5 )
            // InternalFairtracksDsl.g:3609:2: rule__FTZone__Group_20__4__Impl rule__FTZone__Group_20__5
            {
            pushFollow(FOLLOW_24);
            rule__FTZone__Group_20__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZone__Group_20__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_20__4"


    // $ANTLR start "rule__FTZone__Group_20__4__Impl"
    // InternalFairtracksDsl.g:3616:1: rule__FTZone__Group_20__4__Impl : ( ( rule__FTZone__CoordinatesAssignment_20_4 ) ) ;
    public final void rule__FTZone__Group_20__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3620:1: ( ( ( rule__FTZone__CoordinatesAssignment_20_4 ) ) )
            // InternalFairtracksDsl.g:3621:1: ( ( rule__FTZone__CoordinatesAssignment_20_4 ) )
            {
            // InternalFairtracksDsl.g:3621:1: ( ( rule__FTZone__CoordinatesAssignment_20_4 ) )
            // InternalFairtracksDsl.g:3622:2: ( rule__FTZone__CoordinatesAssignment_20_4 )
            {
             before(grammarAccess.getFTZoneAccess().getCoordinatesAssignment_20_4()); 
            // InternalFairtracksDsl.g:3623:2: ( rule__FTZone__CoordinatesAssignment_20_4 )
            // InternalFairtracksDsl.g:3623:3: rule__FTZone__CoordinatesAssignment_20_4
            {
            pushFollow(FOLLOW_2);
            rule__FTZone__CoordinatesAssignment_20_4();

            state._fsp--;


            }

             after(grammarAccess.getFTZoneAccess().getCoordinatesAssignment_20_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_20__4__Impl"


    // $ANTLR start "rule__FTZone__Group_20__5"
    // InternalFairtracksDsl.g:3631:1: rule__FTZone__Group_20__5 : rule__FTZone__Group_20__5__Impl ;
    public final void rule__FTZone__Group_20__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3635:1: ( rule__FTZone__Group_20__5__Impl )
            // InternalFairtracksDsl.g:3636:2: rule__FTZone__Group_20__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FTZone__Group_20__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_20__5"


    // $ANTLR start "rule__FTZone__Group_20__5__Impl"
    // InternalFairtracksDsl.g:3642:1: rule__FTZone__Group_20__5__Impl : ( ']' ) ;
    public final void rule__FTZone__Group_20__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3646:1: ( ( ']' ) )
            // InternalFairtracksDsl.g:3647:1: ( ']' )
            {
            // InternalFairtracksDsl.g:3647:1: ( ']' )
            // InternalFairtracksDsl.g:3648:2: ']'
            {
             before(grammarAccess.getFTZoneAccess().getRightSquareBracketKeyword_20_5()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getFTZoneAccess().getRightSquareBracketKeyword_20_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__Group_20__5__Impl"


    // $ANTLR start "rule__FTObstacle__Group__0"
    // InternalFairtracksDsl.g:3658:1: rule__FTObstacle__Group__0 : rule__FTObstacle__Group__0__Impl rule__FTObstacle__Group__1 ;
    public final void rule__FTObstacle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3662:1: ( rule__FTObstacle__Group__0__Impl rule__FTObstacle__Group__1 )
            // InternalFairtracksDsl.g:3663:2: rule__FTObstacle__Group__0__Impl rule__FTObstacle__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__FTObstacle__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTObstacle__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group__0"


    // $ANTLR start "rule__FTObstacle__Group__0__Impl"
    // InternalFairtracksDsl.g:3670:1: rule__FTObstacle__Group__0__Impl : ( 'Obstacle' ) ;
    public final void rule__FTObstacle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3674:1: ( ( 'Obstacle' ) )
            // InternalFairtracksDsl.g:3675:1: ( 'Obstacle' )
            {
            // InternalFairtracksDsl.g:3675:1: ( 'Obstacle' )
            // InternalFairtracksDsl.g:3676:2: 'Obstacle'
            {
             before(grammarAccess.getFTObstacleAccess().getObstacleKeyword_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getFTObstacleAccess().getObstacleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group__0__Impl"


    // $ANTLR start "rule__FTObstacle__Group__1"
    // InternalFairtracksDsl.g:3685:1: rule__FTObstacle__Group__1 : rule__FTObstacle__Group__1__Impl rule__FTObstacle__Group__2 ;
    public final void rule__FTObstacle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3689:1: ( rule__FTObstacle__Group__1__Impl rule__FTObstacle__Group__2 )
            // InternalFairtracksDsl.g:3690:2: rule__FTObstacle__Group__1__Impl rule__FTObstacle__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__FTObstacle__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTObstacle__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group__1"


    // $ANTLR start "rule__FTObstacle__Group__1__Impl"
    // InternalFairtracksDsl.g:3697:1: rule__FTObstacle__Group__1__Impl : ( '=' ) ;
    public final void rule__FTObstacle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3701:1: ( ( '=' ) )
            // InternalFairtracksDsl.g:3702:1: ( '=' )
            {
            // InternalFairtracksDsl.g:3702:1: ( '=' )
            // InternalFairtracksDsl.g:3703:2: '='
            {
             before(grammarAccess.getFTObstacleAccess().getEqualsSignKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getFTObstacleAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group__1__Impl"


    // $ANTLR start "rule__FTObstacle__Group__2"
    // InternalFairtracksDsl.g:3712:1: rule__FTObstacle__Group__2 : rule__FTObstacle__Group__2__Impl rule__FTObstacle__Group__3 ;
    public final void rule__FTObstacle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3716:1: ( rule__FTObstacle__Group__2__Impl rule__FTObstacle__Group__3 )
            // InternalFairtracksDsl.g:3717:2: rule__FTObstacle__Group__2__Impl rule__FTObstacle__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__FTObstacle__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTObstacle__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group__2"


    // $ANTLR start "rule__FTObstacle__Group__2__Impl"
    // InternalFairtracksDsl.g:3724:1: rule__FTObstacle__Group__2__Impl : ( '{' ) ;
    public final void rule__FTObstacle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3728:1: ( ( '{' ) )
            // InternalFairtracksDsl.g:3729:1: ( '{' )
            {
            // InternalFairtracksDsl.g:3729:1: ( '{' )
            // InternalFairtracksDsl.g:3730:2: '{'
            {
             before(grammarAccess.getFTObstacleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getFTObstacleAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group__2__Impl"


    // $ANTLR start "rule__FTObstacle__Group__3"
    // InternalFairtracksDsl.g:3739:1: rule__FTObstacle__Group__3 : rule__FTObstacle__Group__3__Impl rule__FTObstacle__Group__4 ;
    public final void rule__FTObstacle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3743:1: ( rule__FTObstacle__Group__3__Impl rule__FTObstacle__Group__4 )
            // InternalFairtracksDsl.g:3744:2: rule__FTObstacle__Group__3__Impl rule__FTObstacle__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__FTObstacle__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTObstacle__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group__3"


    // $ANTLR start "rule__FTObstacle__Group__3__Impl"
    // InternalFairtracksDsl.g:3751:1: rule__FTObstacle__Group__3__Impl : ( 'name' ) ;
    public final void rule__FTObstacle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3755:1: ( ( 'name' ) )
            // InternalFairtracksDsl.g:3756:1: ( 'name' )
            {
            // InternalFairtracksDsl.g:3756:1: ( 'name' )
            // InternalFairtracksDsl.g:3757:2: 'name'
            {
             before(grammarAccess.getFTObstacleAccess().getNameKeyword_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getFTObstacleAccess().getNameKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group__3__Impl"


    // $ANTLR start "rule__FTObstacle__Group__4"
    // InternalFairtracksDsl.g:3766:1: rule__FTObstacle__Group__4 : rule__FTObstacle__Group__4__Impl rule__FTObstacle__Group__5 ;
    public final void rule__FTObstacle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3770:1: ( rule__FTObstacle__Group__4__Impl rule__FTObstacle__Group__5 )
            // InternalFairtracksDsl.g:3771:2: rule__FTObstacle__Group__4__Impl rule__FTObstacle__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__FTObstacle__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTObstacle__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group__4"


    // $ANTLR start "rule__FTObstacle__Group__4__Impl"
    // InternalFairtracksDsl.g:3778:1: rule__FTObstacle__Group__4__Impl : ( ':' ) ;
    public final void rule__FTObstacle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3782:1: ( ( ':' ) )
            // InternalFairtracksDsl.g:3783:1: ( ':' )
            {
            // InternalFairtracksDsl.g:3783:1: ( ':' )
            // InternalFairtracksDsl.g:3784:2: ':'
            {
             before(grammarAccess.getFTObstacleAccess().getColonKeyword_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getFTObstacleAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group__4__Impl"


    // $ANTLR start "rule__FTObstacle__Group__5"
    // InternalFairtracksDsl.g:3793:1: rule__FTObstacle__Group__5 : rule__FTObstacle__Group__5__Impl rule__FTObstacle__Group__6 ;
    public final void rule__FTObstacle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3797:1: ( rule__FTObstacle__Group__5__Impl rule__FTObstacle__Group__6 )
            // InternalFairtracksDsl.g:3798:2: rule__FTObstacle__Group__5__Impl rule__FTObstacle__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__FTObstacle__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTObstacle__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group__5"


    // $ANTLR start "rule__FTObstacle__Group__5__Impl"
    // InternalFairtracksDsl.g:3805:1: rule__FTObstacle__Group__5__Impl : ( ( rule__FTObstacle__NameAssignment_5 ) ) ;
    public final void rule__FTObstacle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3809:1: ( ( ( rule__FTObstacle__NameAssignment_5 ) ) )
            // InternalFairtracksDsl.g:3810:1: ( ( rule__FTObstacle__NameAssignment_5 ) )
            {
            // InternalFairtracksDsl.g:3810:1: ( ( rule__FTObstacle__NameAssignment_5 ) )
            // InternalFairtracksDsl.g:3811:2: ( rule__FTObstacle__NameAssignment_5 )
            {
             before(grammarAccess.getFTObstacleAccess().getNameAssignment_5()); 
            // InternalFairtracksDsl.g:3812:2: ( rule__FTObstacle__NameAssignment_5 )
            // InternalFairtracksDsl.g:3812:3: rule__FTObstacle__NameAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__FTObstacle__NameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getFTObstacleAccess().getNameAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group__5__Impl"


    // $ANTLR start "rule__FTObstacle__Group__6"
    // InternalFairtracksDsl.g:3820:1: rule__FTObstacle__Group__6 : rule__FTObstacle__Group__6__Impl rule__FTObstacle__Group__7 ;
    public final void rule__FTObstacle__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3824:1: ( rule__FTObstacle__Group__6__Impl rule__FTObstacle__Group__7 )
            // InternalFairtracksDsl.g:3825:2: rule__FTObstacle__Group__6__Impl rule__FTObstacle__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__FTObstacle__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTObstacle__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group__6"


    // $ANTLR start "rule__FTObstacle__Group__6__Impl"
    // InternalFairtracksDsl.g:3832:1: rule__FTObstacle__Group__6__Impl : ( ';' ) ;
    public final void rule__FTObstacle__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3836:1: ( ( ';' ) )
            // InternalFairtracksDsl.g:3837:1: ( ';' )
            {
            // InternalFairtracksDsl.g:3837:1: ( ';' )
            // InternalFairtracksDsl.g:3838:2: ';'
            {
             before(grammarAccess.getFTObstacleAccess().getSemicolonKeyword_6()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getFTObstacleAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group__6__Impl"


    // $ANTLR start "rule__FTObstacle__Group__7"
    // InternalFairtracksDsl.g:3847:1: rule__FTObstacle__Group__7 : rule__FTObstacle__Group__7__Impl rule__FTObstacle__Group__8 ;
    public final void rule__FTObstacle__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3851:1: ( rule__FTObstacle__Group__7__Impl rule__FTObstacle__Group__8 )
            // InternalFairtracksDsl.g:3852:2: rule__FTObstacle__Group__7__Impl rule__FTObstacle__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__FTObstacle__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTObstacle__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group__7"


    // $ANTLR start "rule__FTObstacle__Group__7__Impl"
    // InternalFairtracksDsl.g:3859:1: rule__FTObstacle__Group__7__Impl : ( 'size' ) ;
    public final void rule__FTObstacle__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3863:1: ( ( 'size' ) )
            // InternalFairtracksDsl.g:3864:1: ( 'size' )
            {
            // InternalFairtracksDsl.g:3864:1: ( 'size' )
            // InternalFairtracksDsl.g:3865:2: 'size'
            {
             before(grammarAccess.getFTObstacleAccess().getSizeKeyword_7()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getFTObstacleAccess().getSizeKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group__7__Impl"


    // $ANTLR start "rule__FTObstacle__Group__8"
    // InternalFairtracksDsl.g:3874:1: rule__FTObstacle__Group__8 : rule__FTObstacle__Group__8__Impl rule__FTObstacle__Group__9 ;
    public final void rule__FTObstacle__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3878:1: ( rule__FTObstacle__Group__8__Impl rule__FTObstacle__Group__9 )
            // InternalFairtracksDsl.g:3879:2: rule__FTObstacle__Group__8__Impl rule__FTObstacle__Group__9
            {
            pushFollow(FOLLOW_13);
            rule__FTObstacle__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTObstacle__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group__8"


    // $ANTLR start "rule__FTObstacle__Group__8__Impl"
    // InternalFairtracksDsl.g:3886:1: rule__FTObstacle__Group__8__Impl : ( ':' ) ;
    public final void rule__FTObstacle__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3890:1: ( ( ':' ) )
            // InternalFairtracksDsl.g:3891:1: ( ':' )
            {
            // InternalFairtracksDsl.g:3891:1: ( ':' )
            // InternalFairtracksDsl.g:3892:2: ':'
            {
             before(grammarAccess.getFTObstacleAccess().getColonKeyword_8()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getFTObstacleAccess().getColonKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group__8__Impl"


    // $ANTLR start "rule__FTObstacle__Group__9"
    // InternalFairtracksDsl.g:3901:1: rule__FTObstacle__Group__9 : rule__FTObstacle__Group__9__Impl rule__FTObstacle__Group__10 ;
    public final void rule__FTObstacle__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3905:1: ( rule__FTObstacle__Group__9__Impl rule__FTObstacle__Group__10 )
            // InternalFairtracksDsl.g:3906:2: rule__FTObstacle__Group__9__Impl rule__FTObstacle__Group__10
            {
            pushFollow(FOLLOW_11);
            rule__FTObstacle__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTObstacle__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group__9"


    // $ANTLR start "rule__FTObstacle__Group__9__Impl"
    // InternalFairtracksDsl.g:3913:1: rule__FTObstacle__Group__9__Impl : ( ( rule__FTObstacle__SizeAssignment_9 ) ) ;
    public final void rule__FTObstacle__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3917:1: ( ( ( rule__FTObstacle__SizeAssignment_9 ) ) )
            // InternalFairtracksDsl.g:3918:1: ( ( rule__FTObstacle__SizeAssignment_9 ) )
            {
            // InternalFairtracksDsl.g:3918:1: ( ( rule__FTObstacle__SizeAssignment_9 ) )
            // InternalFairtracksDsl.g:3919:2: ( rule__FTObstacle__SizeAssignment_9 )
            {
             before(grammarAccess.getFTObstacleAccess().getSizeAssignment_9()); 
            // InternalFairtracksDsl.g:3920:2: ( rule__FTObstacle__SizeAssignment_9 )
            // InternalFairtracksDsl.g:3920:3: rule__FTObstacle__SizeAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__FTObstacle__SizeAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getFTObstacleAccess().getSizeAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group__9__Impl"


    // $ANTLR start "rule__FTObstacle__Group__10"
    // InternalFairtracksDsl.g:3928:1: rule__FTObstacle__Group__10 : rule__FTObstacle__Group__10__Impl rule__FTObstacle__Group__11 ;
    public final void rule__FTObstacle__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3932:1: ( rule__FTObstacle__Group__10__Impl rule__FTObstacle__Group__11 )
            // InternalFairtracksDsl.g:3933:2: rule__FTObstacle__Group__10__Impl rule__FTObstacle__Group__11
            {
            pushFollow(FOLLOW_28);
            rule__FTObstacle__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTObstacle__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group__10"


    // $ANTLR start "rule__FTObstacle__Group__10__Impl"
    // InternalFairtracksDsl.g:3940:1: rule__FTObstacle__Group__10__Impl : ( ';' ) ;
    public final void rule__FTObstacle__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3944:1: ( ( ';' ) )
            // InternalFairtracksDsl.g:3945:1: ( ';' )
            {
            // InternalFairtracksDsl.g:3945:1: ( ';' )
            // InternalFairtracksDsl.g:3946:2: ';'
            {
             before(grammarAccess.getFTObstacleAccess().getSemicolonKeyword_10()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getFTObstacleAccess().getSemicolonKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group__10__Impl"


    // $ANTLR start "rule__FTObstacle__Group__11"
    // InternalFairtracksDsl.g:3955:1: rule__FTObstacle__Group__11 : rule__FTObstacle__Group__11__Impl rule__FTObstacle__Group__12 ;
    public final void rule__FTObstacle__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3959:1: ( rule__FTObstacle__Group__11__Impl rule__FTObstacle__Group__12 )
            // InternalFairtracksDsl.g:3960:2: rule__FTObstacle__Group__11__Impl rule__FTObstacle__Group__12
            {
            pushFollow(FOLLOW_28);
            rule__FTObstacle__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTObstacle__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group__11"


    // $ANTLR start "rule__FTObstacle__Group__11__Impl"
    // InternalFairtracksDsl.g:3967:1: rule__FTObstacle__Group__11__Impl : ( ( rule__FTObstacle__Group_11__0 )? ) ;
    public final void rule__FTObstacle__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3971:1: ( ( ( rule__FTObstacle__Group_11__0 )? ) )
            // InternalFairtracksDsl.g:3972:1: ( ( rule__FTObstacle__Group_11__0 )? )
            {
            // InternalFairtracksDsl.g:3972:1: ( ( rule__FTObstacle__Group_11__0 )? )
            // InternalFairtracksDsl.g:3973:2: ( rule__FTObstacle__Group_11__0 )?
            {
             before(grammarAccess.getFTObstacleAccess().getGroup_11()); 
            // InternalFairtracksDsl.g:3974:2: ( rule__FTObstacle__Group_11__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==75) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalFairtracksDsl.g:3974:3: rule__FTObstacle__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FTObstacle__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFTObstacleAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group__11__Impl"


    // $ANTLR start "rule__FTObstacle__Group__12"
    // InternalFairtracksDsl.g:3982:1: rule__FTObstacle__Group__12 : rule__FTObstacle__Group__12__Impl rule__FTObstacle__Group__13 ;
    public final void rule__FTObstacle__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3986:1: ( rule__FTObstacle__Group__12__Impl rule__FTObstacle__Group__13 )
            // InternalFairtracksDsl.g:3987:2: rule__FTObstacle__Group__12__Impl rule__FTObstacle__Group__13
            {
            pushFollow(FOLLOW_9);
            rule__FTObstacle__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTObstacle__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group__12"


    // $ANTLR start "rule__FTObstacle__Group__12__Impl"
    // InternalFairtracksDsl.g:3994:1: rule__FTObstacle__Group__12__Impl : ( 'color' ) ;
    public final void rule__FTObstacle__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:3998:1: ( ( 'color' ) )
            // InternalFairtracksDsl.g:3999:1: ( 'color' )
            {
            // InternalFairtracksDsl.g:3999:1: ( 'color' )
            // InternalFairtracksDsl.g:4000:2: 'color'
            {
             before(grammarAccess.getFTObstacleAccess().getColorKeyword_12()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getFTObstacleAccess().getColorKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group__12__Impl"


    // $ANTLR start "rule__FTObstacle__Group__13"
    // InternalFairtracksDsl.g:4009:1: rule__FTObstacle__Group__13 : rule__FTObstacle__Group__13__Impl rule__FTObstacle__Group__14 ;
    public final void rule__FTObstacle__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4013:1: ( rule__FTObstacle__Group__13__Impl rule__FTObstacle__Group__14 )
            // InternalFairtracksDsl.g:4014:2: rule__FTObstacle__Group__13__Impl rule__FTObstacle__Group__14
            {
            pushFollow(FOLLOW_18);
            rule__FTObstacle__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTObstacle__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group__13"


    // $ANTLR start "rule__FTObstacle__Group__13__Impl"
    // InternalFairtracksDsl.g:4021:1: rule__FTObstacle__Group__13__Impl : ( ':' ) ;
    public final void rule__FTObstacle__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4025:1: ( ( ':' ) )
            // InternalFairtracksDsl.g:4026:1: ( ':' )
            {
            // InternalFairtracksDsl.g:4026:1: ( ':' )
            // InternalFairtracksDsl.g:4027:2: ':'
            {
             before(grammarAccess.getFTObstacleAccess().getColonKeyword_13()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getFTObstacleAccess().getColonKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group__13__Impl"


    // $ANTLR start "rule__FTObstacle__Group__14"
    // InternalFairtracksDsl.g:4036:1: rule__FTObstacle__Group__14 : rule__FTObstacle__Group__14__Impl rule__FTObstacle__Group__15 ;
    public final void rule__FTObstacle__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4040:1: ( rule__FTObstacle__Group__14__Impl rule__FTObstacle__Group__15 )
            // InternalFairtracksDsl.g:4041:2: rule__FTObstacle__Group__14__Impl rule__FTObstacle__Group__15
            {
            pushFollow(FOLLOW_11);
            rule__FTObstacle__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTObstacle__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group__14"


    // $ANTLR start "rule__FTObstacle__Group__14__Impl"
    // InternalFairtracksDsl.g:4048:1: rule__FTObstacle__Group__14__Impl : ( ( rule__FTObstacle__ColorAssignment_14 ) ) ;
    public final void rule__FTObstacle__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4052:1: ( ( ( rule__FTObstacle__ColorAssignment_14 ) ) )
            // InternalFairtracksDsl.g:4053:1: ( ( rule__FTObstacle__ColorAssignment_14 ) )
            {
            // InternalFairtracksDsl.g:4053:1: ( ( rule__FTObstacle__ColorAssignment_14 ) )
            // InternalFairtracksDsl.g:4054:2: ( rule__FTObstacle__ColorAssignment_14 )
            {
             before(grammarAccess.getFTObstacleAccess().getColorAssignment_14()); 
            // InternalFairtracksDsl.g:4055:2: ( rule__FTObstacle__ColorAssignment_14 )
            // InternalFairtracksDsl.g:4055:3: rule__FTObstacle__ColorAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__FTObstacle__ColorAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getFTObstacleAccess().getColorAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group__14__Impl"


    // $ANTLR start "rule__FTObstacle__Group__15"
    // InternalFairtracksDsl.g:4063:1: rule__FTObstacle__Group__15 : rule__FTObstacle__Group__15__Impl rule__FTObstacle__Group__16 ;
    public final void rule__FTObstacle__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4067:1: ( rule__FTObstacle__Group__15__Impl rule__FTObstacle__Group__16 )
            // InternalFairtracksDsl.g:4068:2: rule__FTObstacle__Group__15__Impl rule__FTObstacle__Group__16
            {
            pushFollow(FOLLOW_29);
            rule__FTObstacle__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTObstacle__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group__15"


    // $ANTLR start "rule__FTObstacle__Group__15__Impl"
    // InternalFairtracksDsl.g:4075:1: rule__FTObstacle__Group__15__Impl : ( ';' ) ;
    public final void rule__FTObstacle__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4079:1: ( ( ';' ) )
            // InternalFairtracksDsl.g:4080:1: ( ';' )
            {
            // InternalFairtracksDsl.g:4080:1: ( ';' )
            // InternalFairtracksDsl.g:4081:2: ';'
            {
             before(grammarAccess.getFTObstacleAccess().getSemicolonKeyword_15()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getFTObstacleAccess().getSemicolonKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group__15__Impl"


    // $ANTLR start "rule__FTObstacle__Group__16"
    // InternalFairtracksDsl.g:4090:1: rule__FTObstacle__Group__16 : rule__FTObstacle__Group__16__Impl rule__FTObstacle__Group__17 ;
    public final void rule__FTObstacle__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4094:1: ( rule__FTObstacle__Group__16__Impl rule__FTObstacle__Group__17 )
            // InternalFairtracksDsl.g:4095:2: rule__FTObstacle__Group__16__Impl rule__FTObstacle__Group__17
            {
            pushFollow(FOLLOW_29);
            rule__FTObstacle__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTObstacle__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group__16"


    // $ANTLR start "rule__FTObstacle__Group__16__Impl"
    // InternalFairtracksDsl.g:4102:1: rule__FTObstacle__Group__16__Impl : ( ( rule__FTObstacle__Group_16__0 )? ) ;
    public final void rule__FTObstacle__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4106:1: ( ( ( rule__FTObstacle__Group_16__0 )? ) )
            // InternalFairtracksDsl.g:4107:1: ( ( rule__FTObstacle__Group_16__0 )? )
            {
            // InternalFairtracksDsl.g:4107:1: ( ( rule__FTObstacle__Group_16__0 )? )
            // InternalFairtracksDsl.g:4108:2: ( rule__FTObstacle__Group_16__0 )?
            {
             before(grammarAccess.getFTObstacleAccess().getGroup_16()); 
            // InternalFairtracksDsl.g:4109:2: ( rule__FTObstacle__Group_16__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==42) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalFairtracksDsl.g:4109:3: rule__FTObstacle__Group_16__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FTObstacle__Group_16__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFTObstacleAccess().getGroup_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group__16__Impl"


    // $ANTLR start "rule__FTObstacle__Group__17"
    // InternalFairtracksDsl.g:4117:1: rule__FTObstacle__Group__17 : rule__FTObstacle__Group__17__Impl rule__FTObstacle__Group__18 ;
    public final void rule__FTObstacle__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4121:1: ( rule__FTObstacle__Group__17__Impl rule__FTObstacle__Group__18 )
            // InternalFairtracksDsl.g:4122:2: rule__FTObstacle__Group__17__Impl rule__FTObstacle__Group__18
            {
            pushFollow(FOLLOW_29);
            rule__FTObstacle__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTObstacle__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group__17"


    // $ANTLR start "rule__FTObstacle__Group__17__Impl"
    // InternalFairtracksDsl.g:4129:1: rule__FTObstacle__Group__17__Impl : ( ( rule__FTObstacle__Group_17__0 )? ) ;
    public final void rule__FTObstacle__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4133:1: ( ( ( rule__FTObstacle__Group_17__0 )? ) )
            // InternalFairtracksDsl.g:4134:1: ( ( rule__FTObstacle__Group_17__0 )? )
            {
            // InternalFairtracksDsl.g:4134:1: ( ( rule__FTObstacle__Group_17__0 )? )
            // InternalFairtracksDsl.g:4135:2: ( rule__FTObstacle__Group_17__0 )?
            {
             before(grammarAccess.getFTObstacleAccess().getGroup_17()); 
            // InternalFairtracksDsl.g:4136:2: ( rule__FTObstacle__Group_17__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==58) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalFairtracksDsl.g:4136:3: rule__FTObstacle__Group_17__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FTObstacle__Group_17__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFTObstacleAccess().getGroup_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group__17__Impl"


    // $ANTLR start "rule__FTObstacle__Group__18"
    // InternalFairtracksDsl.g:4144:1: rule__FTObstacle__Group__18 : rule__FTObstacle__Group__18__Impl rule__FTObstacle__Group__19 ;
    public final void rule__FTObstacle__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4148:1: ( rule__FTObstacle__Group__18__Impl rule__FTObstacle__Group__19 )
            // InternalFairtracksDsl.g:4149:2: rule__FTObstacle__Group__18__Impl rule__FTObstacle__Group__19
            {
            pushFollow(FOLLOW_29);
            rule__FTObstacle__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTObstacle__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group__18"


    // $ANTLR start "rule__FTObstacle__Group__18__Impl"
    // InternalFairtracksDsl.g:4156:1: rule__FTObstacle__Group__18__Impl : ( ( rule__FTObstacle__Group_18__0 )* ) ;
    public final void rule__FTObstacle__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4160:1: ( ( ( rule__FTObstacle__Group_18__0 )* ) )
            // InternalFairtracksDsl.g:4161:1: ( ( rule__FTObstacle__Group_18__0 )* )
            {
            // InternalFairtracksDsl.g:4161:1: ( ( rule__FTObstacle__Group_18__0 )* )
            // InternalFairtracksDsl.g:4162:2: ( rule__FTObstacle__Group_18__0 )*
            {
             before(grammarAccess.getFTObstacleAccess().getGroup_18()); 
            // InternalFairtracksDsl.g:4163:2: ( rule__FTObstacle__Group_18__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==45) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalFairtracksDsl.g:4163:3: rule__FTObstacle__Group_18__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__FTObstacle__Group_18__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getFTObstacleAccess().getGroup_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group__18__Impl"


    // $ANTLR start "rule__FTObstacle__Group__19"
    // InternalFairtracksDsl.g:4171:1: rule__FTObstacle__Group__19 : rule__FTObstacle__Group__19__Impl rule__FTObstacle__Group__20 ;
    public final void rule__FTObstacle__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4175:1: ( rule__FTObstacle__Group__19__Impl rule__FTObstacle__Group__20 )
            // InternalFairtracksDsl.g:4176:2: rule__FTObstacle__Group__19__Impl rule__FTObstacle__Group__20
            {
            pushFollow(FOLLOW_29);
            rule__FTObstacle__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTObstacle__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group__19"


    // $ANTLR start "rule__FTObstacle__Group__19__Impl"
    // InternalFairtracksDsl.g:4183:1: rule__FTObstacle__Group__19__Impl : ( ( rule__FTObstacle__Group_19__0 )? ) ;
    public final void rule__FTObstacle__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4187:1: ( ( ( rule__FTObstacle__Group_19__0 )? ) )
            // InternalFairtracksDsl.g:4188:1: ( ( rule__FTObstacle__Group_19__0 )? )
            {
            // InternalFairtracksDsl.g:4188:1: ( ( rule__FTObstacle__Group_19__0 )? )
            // InternalFairtracksDsl.g:4189:2: ( rule__FTObstacle__Group_19__0 )?
            {
             before(grammarAccess.getFTObstacleAccess().getGroup_19()); 
            // InternalFairtracksDsl.g:4190:2: ( rule__FTObstacle__Group_19__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==46) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalFairtracksDsl.g:4190:3: rule__FTObstacle__Group_19__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FTObstacle__Group_19__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFTObstacleAccess().getGroup_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group__19__Impl"


    // $ANTLR start "rule__FTObstacle__Group__20"
    // InternalFairtracksDsl.g:4198:1: rule__FTObstacle__Group__20 : rule__FTObstacle__Group__20__Impl ;
    public final void rule__FTObstacle__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4202:1: ( rule__FTObstacle__Group__20__Impl )
            // InternalFairtracksDsl.g:4203:2: rule__FTObstacle__Group__20__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FTObstacle__Group__20__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group__20"


    // $ANTLR start "rule__FTObstacle__Group__20__Impl"
    // InternalFairtracksDsl.g:4209:1: rule__FTObstacle__Group__20__Impl : ( '}' ) ;
    public final void rule__FTObstacle__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4213:1: ( ( '}' ) )
            // InternalFairtracksDsl.g:4214:1: ( '}' )
            {
            // InternalFairtracksDsl.g:4214:1: ( '}' )
            // InternalFairtracksDsl.g:4215:2: '}'
            {
             before(grammarAccess.getFTObstacleAccess().getRightCurlyBracketKeyword_20()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getFTObstacleAccess().getRightCurlyBracketKeyword_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group__20__Impl"


    // $ANTLR start "rule__FTObstacle__Group_11__0"
    // InternalFairtracksDsl.g:4225:1: rule__FTObstacle__Group_11__0 : rule__FTObstacle__Group_11__0__Impl rule__FTObstacle__Group_11__1 ;
    public final void rule__FTObstacle__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4229:1: ( rule__FTObstacle__Group_11__0__Impl rule__FTObstacle__Group_11__1 )
            // InternalFairtracksDsl.g:4230:2: rule__FTObstacle__Group_11__0__Impl rule__FTObstacle__Group_11__1
            {
            pushFollow(FOLLOW_11);
            rule__FTObstacle__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTObstacle__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group_11__0"


    // $ANTLR start "rule__FTObstacle__Group_11__0__Impl"
    // InternalFairtracksDsl.g:4237:1: rule__FTObstacle__Group_11__0__Impl : ( ( rule__FTObstacle__IsMoveableAssignment_11_0 ) ) ;
    public final void rule__FTObstacle__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4241:1: ( ( ( rule__FTObstacle__IsMoveableAssignment_11_0 ) ) )
            // InternalFairtracksDsl.g:4242:1: ( ( rule__FTObstacle__IsMoveableAssignment_11_0 ) )
            {
            // InternalFairtracksDsl.g:4242:1: ( ( rule__FTObstacle__IsMoveableAssignment_11_0 ) )
            // InternalFairtracksDsl.g:4243:2: ( rule__FTObstacle__IsMoveableAssignment_11_0 )
            {
             before(grammarAccess.getFTObstacleAccess().getIsMoveableAssignment_11_0()); 
            // InternalFairtracksDsl.g:4244:2: ( rule__FTObstacle__IsMoveableAssignment_11_0 )
            // InternalFairtracksDsl.g:4244:3: rule__FTObstacle__IsMoveableAssignment_11_0
            {
            pushFollow(FOLLOW_2);
            rule__FTObstacle__IsMoveableAssignment_11_0();

            state._fsp--;


            }

             after(grammarAccess.getFTObstacleAccess().getIsMoveableAssignment_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group_11__0__Impl"


    // $ANTLR start "rule__FTObstacle__Group_11__1"
    // InternalFairtracksDsl.g:4252:1: rule__FTObstacle__Group_11__1 : rule__FTObstacle__Group_11__1__Impl ;
    public final void rule__FTObstacle__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4256:1: ( rule__FTObstacle__Group_11__1__Impl )
            // InternalFairtracksDsl.g:4257:2: rule__FTObstacle__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FTObstacle__Group_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group_11__1"


    // $ANTLR start "rule__FTObstacle__Group_11__1__Impl"
    // InternalFairtracksDsl.g:4263:1: rule__FTObstacle__Group_11__1__Impl : ( ';' ) ;
    public final void rule__FTObstacle__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4267:1: ( ( ';' ) )
            // InternalFairtracksDsl.g:4268:1: ( ';' )
            {
            // InternalFairtracksDsl.g:4268:1: ( ';' )
            // InternalFairtracksDsl.g:4269:2: ';'
            {
             before(grammarAccess.getFTObstacleAccess().getSemicolonKeyword_11_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getFTObstacleAccess().getSemicolonKeyword_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group_11__1__Impl"


    // $ANTLR start "rule__FTObstacle__Group_16__0"
    // InternalFairtracksDsl.g:4279:1: rule__FTObstacle__Group_16__0 : rule__FTObstacle__Group_16__0__Impl rule__FTObstacle__Group_16__1 ;
    public final void rule__FTObstacle__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4283:1: ( rule__FTObstacle__Group_16__0__Impl rule__FTObstacle__Group_16__1 )
            // InternalFairtracksDsl.g:4284:2: rule__FTObstacle__Group_16__0__Impl rule__FTObstacle__Group_16__1
            {
            pushFollow(FOLLOW_9);
            rule__FTObstacle__Group_16__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTObstacle__Group_16__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group_16__0"


    // $ANTLR start "rule__FTObstacle__Group_16__0__Impl"
    // InternalFairtracksDsl.g:4291:1: rule__FTObstacle__Group_16__0__Impl : ( 'inside' ) ;
    public final void rule__FTObstacle__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4295:1: ( ( 'inside' ) )
            // InternalFairtracksDsl.g:4296:1: ( 'inside' )
            {
            // InternalFairtracksDsl.g:4296:1: ( 'inside' )
            // InternalFairtracksDsl.g:4297:2: 'inside'
            {
             before(grammarAccess.getFTObstacleAccess().getInsideKeyword_16_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getFTObstacleAccess().getInsideKeyword_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group_16__0__Impl"


    // $ANTLR start "rule__FTObstacle__Group_16__1"
    // InternalFairtracksDsl.g:4306:1: rule__FTObstacle__Group_16__1 : rule__FTObstacle__Group_16__1__Impl rule__FTObstacle__Group_16__2 ;
    public final void rule__FTObstacle__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4310:1: ( rule__FTObstacle__Group_16__1__Impl rule__FTObstacle__Group_16__2 )
            // InternalFairtracksDsl.g:4311:2: rule__FTObstacle__Group_16__1__Impl rule__FTObstacle__Group_16__2
            {
            pushFollow(FOLLOW_10);
            rule__FTObstacle__Group_16__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTObstacle__Group_16__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group_16__1"


    // $ANTLR start "rule__FTObstacle__Group_16__1__Impl"
    // InternalFairtracksDsl.g:4318:1: rule__FTObstacle__Group_16__1__Impl : ( ':' ) ;
    public final void rule__FTObstacle__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4322:1: ( ( ':' ) )
            // InternalFairtracksDsl.g:4323:1: ( ':' )
            {
            // InternalFairtracksDsl.g:4323:1: ( ':' )
            // InternalFairtracksDsl.g:4324:2: ':'
            {
             before(grammarAccess.getFTObstacleAccess().getColonKeyword_16_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getFTObstacleAccess().getColonKeyword_16_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group_16__1__Impl"


    // $ANTLR start "rule__FTObstacle__Group_16__2"
    // InternalFairtracksDsl.g:4333:1: rule__FTObstacle__Group_16__2 : rule__FTObstacle__Group_16__2__Impl rule__FTObstacle__Group_16__3 ;
    public final void rule__FTObstacle__Group_16__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4337:1: ( rule__FTObstacle__Group_16__2__Impl rule__FTObstacle__Group_16__3 )
            // InternalFairtracksDsl.g:4338:2: rule__FTObstacle__Group_16__2__Impl rule__FTObstacle__Group_16__3
            {
            pushFollow(FOLLOW_11);
            rule__FTObstacle__Group_16__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTObstacle__Group_16__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group_16__2"


    // $ANTLR start "rule__FTObstacle__Group_16__2__Impl"
    // InternalFairtracksDsl.g:4345:1: rule__FTObstacle__Group_16__2__Impl : ( ( rule__FTObstacle__InitiallyInsideAssignment_16_2 ) ) ;
    public final void rule__FTObstacle__Group_16__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4349:1: ( ( ( rule__FTObstacle__InitiallyInsideAssignment_16_2 ) ) )
            // InternalFairtracksDsl.g:4350:1: ( ( rule__FTObstacle__InitiallyInsideAssignment_16_2 ) )
            {
            // InternalFairtracksDsl.g:4350:1: ( ( rule__FTObstacle__InitiallyInsideAssignment_16_2 ) )
            // InternalFairtracksDsl.g:4351:2: ( rule__FTObstacle__InitiallyInsideAssignment_16_2 )
            {
             before(grammarAccess.getFTObstacleAccess().getInitiallyInsideAssignment_16_2()); 
            // InternalFairtracksDsl.g:4352:2: ( rule__FTObstacle__InitiallyInsideAssignment_16_2 )
            // InternalFairtracksDsl.g:4352:3: rule__FTObstacle__InitiallyInsideAssignment_16_2
            {
            pushFollow(FOLLOW_2);
            rule__FTObstacle__InitiallyInsideAssignment_16_2();

            state._fsp--;


            }

             after(grammarAccess.getFTObstacleAccess().getInitiallyInsideAssignment_16_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group_16__2__Impl"


    // $ANTLR start "rule__FTObstacle__Group_16__3"
    // InternalFairtracksDsl.g:4360:1: rule__FTObstacle__Group_16__3 : rule__FTObstacle__Group_16__3__Impl ;
    public final void rule__FTObstacle__Group_16__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4364:1: ( rule__FTObstacle__Group_16__3__Impl )
            // InternalFairtracksDsl.g:4365:2: rule__FTObstacle__Group_16__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FTObstacle__Group_16__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group_16__3"


    // $ANTLR start "rule__FTObstacle__Group_16__3__Impl"
    // InternalFairtracksDsl.g:4371:1: rule__FTObstacle__Group_16__3__Impl : ( ';' ) ;
    public final void rule__FTObstacle__Group_16__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4375:1: ( ( ';' ) )
            // InternalFairtracksDsl.g:4376:1: ( ';' )
            {
            // InternalFairtracksDsl.g:4376:1: ( ';' )
            // InternalFairtracksDsl.g:4377:2: ';'
            {
             before(grammarAccess.getFTObstacleAccess().getSemicolonKeyword_16_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getFTObstacleAccess().getSemicolonKeyword_16_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group_16__3__Impl"


    // $ANTLR start "rule__FTObstacle__Group_17__0"
    // InternalFairtracksDsl.g:4387:1: rule__FTObstacle__Group_17__0 : rule__FTObstacle__Group_17__0__Impl rule__FTObstacle__Group_17__1 ;
    public final void rule__FTObstacle__Group_17__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4391:1: ( rule__FTObstacle__Group_17__0__Impl rule__FTObstacle__Group_17__1 )
            // InternalFairtracksDsl.g:4392:2: rule__FTObstacle__Group_17__0__Impl rule__FTObstacle__Group_17__1
            {
            pushFollow(FOLLOW_9);
            rule__FTObstacle__Group_17__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTObstacle__Group_17__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group_17__0"


    // $ANTLR start "rule__FTObstacle__Group_17__0__Impl"
    // InternalFairtracksDsl.g:4399:1: rule__FTObstacle__Group_17__0__Impl : ( 'disallowedZones' ) ;
    public final void rule__FTObstacle__Group_17__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4403:1: ( ( 'disallowedZones' ) )
            // InternalFairtracksDsl.g:4404:1: ( 'disallowedZones' )
            {
            // InternalFairtracksDsl.g:4404:1: ( 'disallowedZones' )
            // InternalFairtracksDsl.g:4405:2: 'disallowedZones'
            {
             before(grammarAccess.getFTObstacleAccess().getDisallowedZonesKeyword_17_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getFTObstacleAccess().getDisallowedZonesKeyword_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group_17__0__Impl"


    // $ANTLR start "rule__FTObstacle__Group_17__1"
    // InternalFairtracksDsl.g:4414:1: rule__FTObstacle__Group_17__1 : rule__FTObstacle__Group_17__1__Impl rule__FTObstacle__Group_17__2 ;
    public final void rule__FTObstacle__Group_17__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4418:1: ( rule__FTObstacle__Group_17__1__Impl rule__FTObstacle__Group_17__2 )
            // InternalFairtracksDsl.g:4419:2: rule__FTObstacle__Group_17__1__Impl rule__FTObstacle__Group_17__2
            {
            pushFollow(FOLLOW_10);
            rule__FTObstacle__Group_17__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTObstacle__Group_17__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group_17__1"


    // $ANTLR start "rule__FTObstacle__Group_17__1__Impl"
    // InternalFairtracksDsl.g:4426:1: rule__FTObstacle__Group_17__1__Impl : ( ':' ) ;
    public final void rule__FTObstacle__Group_17__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4430:1: ( ( ':' ) )
            // InternalFairtracksDsl.g:4431:1: ( ':' )
            {
            // InternalFairtracksDsl.g:4431:1: ( ':' )
            // InternalFairtracksDsl.g:4432:2: ':'
            {
             before(grammarAccess.getFTObstacleAccess().getColonKeyword_17_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getFTObstacleAccess().getColonKeyword_17_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group_17__1__Impl"


    // $ANTLR start "rule__FTObstacle__Group_17__2"
    // InternalFairtracksDsl.g:4441:1: rule__FTObstacle__Group_17__2 : rule__FTObstacle__Group_17__2__Impl rule__FTObstacle__Group_17__3 ;
    public final void rule__FTObstacle__Group_17__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4445:1: ( rule__FTObstacle__Group_17__2__Impl rule__FTObstacle__Group_17__3 )
            // InternalFairtracksDsl.g:4446:2: rule__FTObstacle__Group_17__2__Impl rule__FTObstacle__Group_17__3
            {
            pushFollow(FOLLOW_19);
            rule__FTObstacle__Group_17__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTObstacle__Group_17__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group_17__2"


    // $ANTLR start "rule__FTObstacle__Group_17__2__Impl"
    // InternalFairtracksDsl.g:4453:1: rule__FTObstacle__Group_17__2__Impl : ( ( rule__FTObstacle__DisallowedZonesAssignment_17_2 ) ) ;
    public final void rule__FTObstacle__Group_17__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4457:1: ( ( ( rule__FTObstacle__DisallowedZonesAssignment_17_2 ) ) )
            // InternalFairtracksDsl.g:4458:1: ( ( rule__FTObstacle__DisallowedZonesAssignment_17_2 ) )
            {
            // InternalFairtracksDsl.g:4458:1: ( ( rule__FTObstacle__DisallowedZonesAssignment_17_2 ) )
            // InternalFairtracksDsl.g:4459:2: ( rule__FTObstacle__DisallowedZonesAssignment_17_2 )
            {
             before(grammarAccess.getFTObstacleAccess().getDisallowedZonesAssignment_17_2()); 
            // InternalFairtracksDsl.g:4460:2: ( rule__FTObstacle__DisallowedZonesAssignment_17_2 )
            // InternalFairtracksDsl.g:4460:3: rule__FTObstacle__DisallowedZonesAssignment_17_2
            {
            pushFollow(FOLLOW_2);
            rule__FTObstacle__DisallowedZonesAssignment_17_2();

            state._fsp--;


            }

             after(grammarAccess.getFTObstacleAccess().getDisallowedZonesAssignment_17_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group_17__2__Impl"


    // $ANTLR start "rule__FTObstacle__Group_17__3"
    // InternalFairtracksDsl.g:4468:1: rule__FTObstacle__Group_17__3 : rule__FTObstacle__Group_17__3__Impl rule__FTObstacle__Group_17__4 ;
    public final void rule__FTObstacle__Group_17__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4472:1: ( rule__FTObstacle__Group_17__3__Impl rule__FTObstacle__Group_17__4 )
            // InternalFairtracksDsl.g:4473:2: rule__FTObstacle__Group_17__3__Impl rule__FTObstacle__Group_17__4
            {
            pushFollow(FOLLOW_19);
            rule__FTObstacle__Group_17__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTObstacle__Group_17__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group_17__3"


    // $ANTLR start "rule__FTObstacle__Group_17__3__Impl"
    // InternalFairtracksDsl.g:4480:1: rule__FTObstacle__Group_17__3__Impl : ( ( rule__FTObstacle__Group_17_3__0 )* ) ;
    public final void rule__FTObstacle__Group_17__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4484:1: ( ( ( rule__FTObstacle__Group_17_3__0 )* ) )
            // InternalFairtracksDsl.g:4485:1: ( ( rule__FTObstacle__Group_17_3__0 )* )
            {
            // InternalFairtracksDsl.g:4485:1: ( ( rule__FTObstacle__Group_17_3__0 )* )
            // InternalFairtracksDsl.g:4486:2: ( rule__FTObstacle__Group_17_3__0 )*
            {
             before(grammarAccess.getFTObstacleAccess().getGroup_17_3()); 
            // InternalFairtracksDsl.g:4487:2: ( rule__FTObstacle__Group_17_3__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==44) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalFairtracksDsl.g:4487:3: rule__FTObstacle__Group_17_3__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__FTObstacle__Group_17_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getFTObstacleAccess().getGroup_17_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group_17__3__Impl"


    // $ANTLR start "rule__FTObstacle__Group_17__4"
    // InternalFairtracksDsl.g:4495:1: rule__FTObstacle__Group_17__4 : rule__FTObstacle__Group_17__4__Impl ;
    public final void rule__FTObstacle__Group_17__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4499:1: ( rule__FTObstacle__Group_17__4__Impl )
            // InternalFairtracksDsl.g:4500:2: rule__FTObstacle__Group_17__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FTObstacle__Group_17__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group_17__4"


    // $ANTLR start "rule__FTObstacle__Group_17__4__Impl"
    // InternalFairtracksDsl.g:4506:1: rule__FTObstacle__Group_17__4__Impl : ( ';' ) ;
    public final void rule__FTObstacle__Group_17__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4510:1: ( ( ';' ) )
            // InternalFairtracksDsl.g:4511:1: ( ';' )
            {
            // InternalFairtracksDsl.g:4511:1: ( ';' )
            // InternalFairtracksDsl.g:4512:2: ';'
            {
             before(grammarAccess.getFTObstacleAccess().getSemicolonKeyword_17_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getFTObstacleAccess().getSemicolonKeyword_17_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group_17__4__Impl"


    // $ANTLR start "rule__FTObstacle__Group_17_3__0"
    // InternalFairtracksDsl.g:4522:1: rule__FTObstacle__Group_17_3__0 : rule__FTObstacle__Group_17_3__0__Impl rule__FTObstacle__Group_17_3__1 ;
    public final void rule__FTObstacle__Group_17_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4526:1: ( rule__FTObstacle__Group_17_3__0__Impl rule__FTObstacle__Group_17_3__1 )
            // InternalFairtracksDsl.g:4527:2: rule__FTObstacle__Group_17_3__0__Impl rule__FTObstacle__Group_17_3__1
            {
            pushFollow(FOLLOW_10);
            rule__FTObstacle__Group_17_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTObstacle__Group_17_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group_17_3__0"


    // $ANTLR start "rule__FTObstacle__Group_17_3__0__Impl"
    // InternalFairtracksDsl.g:4534:1: rule__FTObstacle__Group_17_3__0__Impl : ( ',' ) ;
    public final void rule__FTObstacle__Group_17_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4538:1: ( ( ',' ) )
            // InternalFairtracksDsl.g:4539:1: ( ',' )
            {
            // InternalFairtracksDsl.g:4539:1: ( ',' )
            // InternalFairtracksDsl.g:4540:2: ','
            {
             before(grammarAccess.getFTObstacleAccess().getCommaKeyword_17_3_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getFTObstacleAccess().getCommaKeyword_17_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group_17_3__0__Impl"


    // $ANTLR start "rule__FTObstacle__Group_17_3__1"
    // InternalFairtracksDsl.g:4549:1: rule__FTObstacle__Group_17_3__1 : rule__FTObstacle__Group_17_3__1__Impl ;
    public final void rule__FTObstacle__Group_17_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4553:1: ( rule__FTObstacle__Group_17_3__1__Impl )
            // InternalFairtracksDsl.g:4554:2: rule__FTObstacle__Group_17_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FTObstacle__Group_17_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group_17_3__1"


    // $ANTLR start "rule__FTObstacle__Group_17_3__1__Impl"
    // InternalFairtracksDsl.g:4560:1: rule__FTObstacle__Group_17_3__1__Impl : ( ( rule__FTObstacle__DisallowedZonesAssignment_17_3_1 ) ) ;
    public final void rule__FTObstacle__Group_17_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4564:1: ( ( ( rule__FTObstacle__DisallowedZonesAssignment_17_3_1 ) ) )
            // InternalFairtracksDsl.g:4565:1: ( ( rule__FTObstacle__DisallowedZonesAssignment_17_3_1 ) )
            {
            // InternalFairtracksDsl.g:4565:1: ( ( rule__FTObstacle__DisallowedZonesAssignment_17_3_1 ) )
            // InternalFairtracksDsl.g:4566:2: ( rule__FTObstacle__DisallowedZonesAssignment_17_3_1 )
            {
             before(grammarAccess.getFTObstacleAccess().getDisallowedZonesAssignment_17_3_1()); 
            // InternalFairtracksDsl.g:4567:2: ( rule__FTObstacle__DisallowedZonesAssignment_17_3_1 )
            // InternalFairtracksDsl.g:4567:3: rule__FTObstacle__DisallowedZonesAssignment_17_3_1
            {
            pushFollow(FOLLOW_2);
            rule__FTObstacle__DisallowedZonesAssignment_17_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFTObstacleAccess().getDisallowedZonesAssignment_17_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group_17_3__1__Impl"


    // $ANTLR start "rule__FTObstacle__Group_18__0"
    // InternalFairtracksDsl.g:4576:1: rule__FTObstacle__Group_18__0 : rule__FTObstacle__Group_18__0__Impl rule__FTObstacle__Group_18__1 ;
    public final void rule__FTObstacle__Group_18__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4580:1: ( rule__FTObstacle__Group_18__0__Impl rule__FTObstacle__Group_18__1 )
            // InternalFairtracksDsl.g:4581:2: rule__FTObstacle__Group_18__0__Impl rule__FTObstacle__Group_18__1
            {
            pushFollow(FOLLOW_9);
            rule__FTObstacle__Group_18__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTObstacle__Group_18__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group_18__0"


    // $ANTLR start "rule__FTObstacle__Group_18__0__Impl"
    // InternalFairtracksDsl.g:4588:1: rule__FTObstacle__Group_18__0__Impl : ( 'distance' ) ;
    public final void rule__FTObstacle__Group_18__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4592:1: ( ( 'distance' ) )
            // InternalFairtracksDsl.g:4593:1: ( 'distance' )
            {
            // InternalFairtracksDsl.g:4593:1: ( 'distance' )
            // InternalFairtracksDsl.g:4594:2: 'distance'
            {
             before(grammarAccess.getFTObstacleAccess().getDistanceKeyword_18_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getFTObstacleAccess().getDistanceKeyword_18_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group_18__0__Impl"


    // $ANTLR start "rule__FTObstacle__Group_18__1"
    // InternalFairtracksDsl.g:4603:1: rule__FTObstacle__Group_18__1 : rule__FTObstacle__Group_18__1__Impl rule__FTObstacle__Group_18__2 ;
    public final void rule__FTObstacle__Group_18__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4607:1: ( rule__FTObstacle__Group_18__1__Impl rule__FTObstacle__Group_18__2 )
            // InternalFairtracksDsl.g:4608:2: rule__FTObstacle__Group_18__1__Impl rule__FTObstacle__Group_18__2
            {
            pushFollow(FOLLOW_3);
            rule__FTObstacle__Group_18__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTObstacle__Group_18__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group_18__1"


    // $ANTLR start "rule__FTObstacle__Group_18__1__Impl"
    // InternalFairtracksDsl.g:4615:1: rule__FTObstacle__Group_18__1__Impl : ( ':' ) ;
    public final void rule__FTObstacle__Group_18__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4619:1: ( ( ':' ) )
            // InternalFairtracksDsl.g:4620:1: ( ':' )
            {
            // InternalFairtracksDsl.g:4620:1: ( ':' )
            // InternalFairtracksDsl.g:4621:2: ':'
            {
             before(grammarAccess.getFTObstacleAccess().getColonKeyword_18_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getFTObstacleAccess().getColonKeyword_18_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group_18__1__Impl"


    // $ANTLR start "rule__FTObstacle__Group_18__2"
    // InternalFairtracksDsl.g:4630:1: rule__FTObstacle__Group_18__2 : rule__FTObstacle__Group_18__2__Impl rule__FTObstacle__Group_18__3 ;
    public final void rule__FTObstacle__Group_18__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4634:1: ( rule__FTObstacle__Group_18__2__Impl rule__FTObstacle__Group_18__3 )
            // InternalFairtracksDsl.g:4635:2: rule__FTObstacle__Group_18__2__Impl rule__FTObstacle__Group_18__3
            {
            pushFollow(FOLLOW_11);
            rule__FTObstacle__Group_18__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTObstacle__Group_18__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group_18__2"


    // $ANTLR start "rule__FTObstacle__Group_18__2__Impl"
    // InternalFairtracksDsl.g:4642:1: rule__FTObstacle__Group_18__2__Impl : ( ( rule__FTObstacle__DistanceClassAssignment_18_2 ) ) ;
    public final void rule__FTObstacle__Group_18__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4646:1: ( ( ( rule__FTObstacle__DistanceClassAssignment_18_2 ) ) )
            // InternalFairtracksDsl.g:4647:1: ( ( rule__FTObstacle__DistanceClassAssignment_18_2 ) )
            {
            // InternalFairtracksDsl.g:4647:1: ( ( rule__FTObstacle__DistanceClassAssignment_18_2 ) )
            // InternalFairtracksDsl.g:4648:2: ( rule__FTObstacle__DistanceClassAssignment_18_2 )
            {
             before(grammarAccess.getFTObstacleAccess().getDistanceClassAssignment_18_2()); 
            // InternalFairtracksDsl.g:4649:2: ( rule__FTObstacle__DistanceClassAssignment_18_2 )
            // InternalFairtracksDsl.g:4649:3: rule__FTObstacle__DistanceClassAssignment_18_2
            {
            pushFollow(FOLLOW_2);
            rule__FTObstacle__DistanceClassAssignment_18_2();

            state._fsp--;


            }

             after(grammarAccess.getFTObstacleAccess().getDistanceClassAssignment_18_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group_18__2__Impl"


    // $ANTLR start "rule__FTObstacle__Group_18__3"
    // InternalFairtracksDsl.g:4657:1: rule__FTObstacle__Group_18__3 : rule__FTObstacle__Group_18__3__Impl ;
    public final void rule__FTObstacle__Group_18__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4661:1: ( rule__FTObstacle__Group_18__3__Impl )
            // InternalFairtracksDsl.g:4662:2: rule__FTObstacle__Group_18__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FTObstacle__Group_18__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group_18__3"


    // $ANTLR start "rule__FTObstacle__Group_18__3__Impl"
    // InternalFairtracksDsl.g:4668:1: rule__FTObstacle__Group_18__3__Impl : ( ';' ) ;
    public final void rule__FTObstacle__Group_18__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4672:1: ( ( ';' ) )
            // InternalFairtracksDsl.g:4673:1: ( ';' )
            {
            // InternalFairtracksDsl.g:4673:1: ( ';' )
            // InternalFairtracksDsl.g:4674:2: ';'
            {
             before(grammarAccess.getFTObstacleAccess().getSemicolonKeyword_18_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getFTObstacleAccess().getSemicolonKeyword_18_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group_18__3__Impl"


    // $ANTLR start "rule__FTObstacle__Group_19__0"
    // InternalFairtracksDsl.g:4684:1: rule__FTObstacle__Group_19__0 : rule__FTObstacle__Group_19__0__Impl rule__FTObstacle__Group_19__1 ;
    public final void rule__FTObstacle__Group_19__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4688:1: ( rule__FTObstacle__Group_19__0__Impl rule__FTObstacle__Group_19__1 )
            // InternalFairtracksDsl.g:4689:2: rule__FTObstacle__Group_19__0__Impl rule__FTObstacle__Group_19__1
            {
            pushFollow(FOLLOW_21);
            rule__FTObstacle__Group_19__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTObstacle__Group_19__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group_19__0"


    // $ANTLR start "rule__FTObstacle__Group_19__0__Impl"
    // InternalFairtracksDsl.g:4696:1: rule__FTObstacle__Group_19__0__Impl : ( 'Real' ) ;
    public final void rule__FTObstacle__Group_19__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4700:1: ( ( 'Real' ) )
            // InternalFairtracksDsl.g:4701:1: ( 'Real' )
            {
            // InternalFairtracksDsl.g:4701:1: ( 'Real' )
            // InternalFairtracksDsl.g:4702:2: 'Real'
            {
             before(grammarAccess.getFTObstacleAccess().getRealKeyword_19_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getFTObstacleAccess().getRealKeyword_19_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group_19__0__Impl"


    // $ANTLR start "rule__FTObstacle__Group_19__1"
    // InternalFairtracksDsl.g:4711:1: rule__FTObstacle__Group_19__1 : rule__FTObstacle__Group_19__1__Impl rule__FTObstacle__Group_19__2 ;
    public final void rule__FTObstacle__Group_19__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4715:1: ( rule__FTObstacle__Group_19__1__Impl rule__FTObstacle__Group_19__2 )
            // InternalFairtracksDsl.g:4716:2: rule__FTObstacle__Group_19__1__Impl rule__FTObstacle__Group_19__2
            {
            pushFollow(FOLLOW_9);
            rule__FTObstacle__Group_19__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTObstacle__Group_19__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group_19__1"


    // $ANTLR start "rule__FTObstacle__Group_19__1__Impl"
    // InternalFairtracksDsl.g:4723:1: rule__FTObstacle__Group_19__1__Impl : ( 'Coordinates' ) ;
    public final void rule__FTObstacle__Group_19__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4727:1: ( ( 'Coordinates' ) )
            // InternalFairtracksDsl.g:4728:1: ( 'Coordinates' )
            {
            // InternalFairtracksDsl.g:4728:1: ( 'Coordinates' )
            // InternalFairtracksDsl.g:4729:2: 'Coordinates'
            {
             before(grammarAccess.getFTObstacleAccess().getCoordinatesKeyword_19_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getFTObstacleAccess().getCoordinatesKeyword_19_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group_19__1__Impl"


    // $ANTLR start "rule__FTObstacle__Group_19__2"
    // InternalFairtracksDsl.g:4738:1: rule__FTObstacle__Group_19__2 : rule__FTObstacle__Group_19__2__Impl rule__FTObstacle__Group_19__3 ;
    public final void rule__FTObstacle__Group_19__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4742:1: ( rule__FTObstacle__Group_19__2__Impl rule__FTObstacle__Group_19__3 )
            // InternalFairtracksDsl.g:4743:2: rule__FTObstacle__Group_19__2__Impl rule__FTObstacle__Group_19__3
            {
            pushFollow(FOLLOW_22);
            rule__FTObstacle__Group_19__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTObstacle__Group_19__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group_19__2"


    // $ANTLR start "rule__FTObstacle__Group_19__2__Impl"
    // InternalFairtracksDsl.g:4750:1: rule__FTObstacle__Group_19__2__Impl : ( ':' ) ;
    public final void rule__FTObstacle__Group_19__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4754:1: ( ( ':' ) )
            // InternalFairtracksDsl.g:4755:1: ( ':' )
            {
            // InternalFairtracksDsl.g:4755:1: ( ':' )
            // InternalFairtracksDsl.g:4756:2: ':'
            {
             before(grammarAccess.getFTObstacleAccess().getColonKeyword_19_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getFTObstacleAccess().getColonKeyword_19_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group_19__2__Impl"


    // $ANTLR start "rule__FTObstacle__Group_19__3"
    // InternalFairtracksDsl.g:4765:1: rule__FTObstacle__Group_19__3 : rule__FTObstacle__Group_19__3__Impl rule__FTObstacle__Group_19__4 ;
    public final void rule__FTObstacle__Group_19__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4769:1: ( rule__FTObstacle__Group_19__3__Impl rule__FTObstacle__Group_19__4 )
            // InternalFairtracksDsl.g:4770:2: rule__FTObstacle__Group_19__3__Impl rule__FTObstacle__Group_19__4
            {
            pushFollow(FOLLOW_23);
            rule__FTObstacle__Group_19__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTObstacle__Group_19__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group_19__3"


    // $ANTLR start "rule__FTObstacle__Group_19__3__Impl"
    // InternalFairtracksDsl.g:4777:1: rule__FTObstacle__Group_19__3__Impl : ( '[' ) ;
    public final void rule__FTObstacle__Group_19__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4781:1: ( ( '[' ) )
            // InternalFairtracksDsl.g:4782:1: ( '[' )
            {
            // InternalFairtracksDsl.g:4782:1: ( '[' )
            // InternalFairtracksDsl.g:4783:2: '['
            {
             before(grammarAccess.getFTObstacleAccess().getLeftSquareBracketKeyword_19_3()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getFTObstacleAccess().getLeftSquareBracketKeyword_19_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group_19__3__Impl"


    // $ANTLR start "rule__FTObstacle__Group_19__4"
    // InternalFairtracksDsl.g:4792:1: rule__FTObstacle__Group_19__4 : rule__FTObstacle__Group_19__4__Impl rule__FTObstacle__Group_19__5 ;
    public final void rule__FTObstacle__Group_19__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4796:1: ( rule__FTObstacle__Group_19__4__Impl rule__FTObstacle__Group_19__5 )
            // InternalFairtracksDsl.g:4797:2: rule__FTObstacle__Group_19__4__Impl rule__FTObstacle__Group_19__5
            {
            pushFollow(FOLLOW_24);
            rule__FTObstacle__Group_19__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTObstacle__Group_19__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group_19__4"


    // $ANTLR start "rule__FTObstacle__Group_19__4__Impl"
    // InternalFairtracksDsl.g:4804:1: rule__FTObstacle__Group_19__4__Impl : ( ( rule__FTObstacle__CoordinatesAssignment_19_4 ) ) ;
    public final void rule__FTObstacle__Group_19__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4808:1: ( ( ( rule__FTObstacle__CoordinatesAssignment_19_4 ) ) )
            // InternalFairtracksDsl.g:4809:1: ( ( rule__FTObstacle__CoordinatesAssignment_19_4 ) )
            {
            // InternalFairtracksDsl.g:4809:1: ( ( rule__FTObstacle__CoordinatesAssignment_19_4 ) )
            // InternalFairtracksDsl.g:4810:2: ( rule__FTObstacle__CoordinatesAssignment_19_4 )
            {
             before(grammarAccess.getFTObstacleAccess().getCoordinatesAssignment_19_4()); 
            // InternalFairtracksDsl.g:4811:2: ( rule__FTObstacle__CoordinatesAssignment_19_4 )
            // InternalFairtracksDsl.g:4811:3: rule__FTObstacle__CoordinatesAssignment_19_4
            {
            pushFollow(FOLLOW_2);
            rule__FTObstacle__CoordinatesAssignment_19_4();

            state._fsp--;


            }

             after(grammarAccess.getFTObstacleAccess().getCoordinatesAssignment_19_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group_19__4__Impl"


    // $ANTLR start "rule__FTObstacle__Group_19__5"
    // InternalFairtracksDsl.g:4819:1: rule__FTObstacle__Group_19__5 : rule__FTObstacle__Group_19__5__Impl ;
    public final void rule__FTObstacle__Group_19__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4823:1: ( rule__FTObstacle__Group_19__5__Impl )
            // InternalFairtracksDsl.g:4824:2: rule__FTObstacle__Group_19__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FTObstacle__Group_19__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group_19__5"


    // $ANTLR start "rule__FTObstacle__Group_19__5__Impl"
    // InternalFairtracksDsl.g:4830:1: rule__FTObstacle__Group_19__5__Impl : ( ']' ) ;
    public final void rule__FTObstacle__Group_19__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4834:1: ( ( ']' ) )
            // InternalFairtracksDsl.g:4835:1: ( ']' )
            {
            // InternalFairtracksDsl.g:4835:1: ( ']' )
            // InternalFairtracksDsl.g:4836:2: ']'
            {
             before(grammarAccess.getFTObstacleAccess().getRightSquareBracketKeyword_19_5()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getFTObstacleAccess().getRightSquareBracketKeyword_19_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__Group_19__5__Impl"


    // $ANTLR start "rule__FTZipline__Group__0"
    // InternalFairtracksDsl.g:4846:1: rule__FTZipline__Group__0 : rule__FTZipline__Group__0__Impl rule__FTZipline__Group__1 ;
    public final void rule__FTZipline__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4850:1: ( rule__FTZipline__Group__0__Impl rule__FTZipline__Group__1 )
            // InternalFairtracksDsl.g:4851:2: rule__FTZipline__Group__0__Impl rule__FTZipline__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__FTZipline__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZipline__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZipline__Group__0"


    // $ANTLR start "rule__FTZipline__Group__0__Impl"
    // InternalFairtracksDsl.g:4858:1: rule__FTZipline__Group__0__Impl : ( 'Zipline' ) ;
    public final void rule__FTZipline__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4862:1: ( ( 'Zipline' ) )
            // InternalFairtracksDsl.g:4863:1: ( 'Zipline' )
            {
            // InternalFairtracksDsl.g:4863:1: ( 'Zipline' )
            // InternalFairtracksDsl.g:4864:2: 'Zipline'
            {
             before(grammarAccess.getFTZiplineAccess().getZiplineKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFTZiplineAccess().getZiplineKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZipline__Group__0__Impl"


    // $ANTLR start "rule__FTZipline__Group__1"
    // InternalFairtracksDsl.g:4873:1: rule__FTZipline__Group__1 : rule__FTZipline__Group__1__Impl rule__FTZipline__Group__2 ;
    public final void rule__FTZipline__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4877:1: ( rule__FTZipline__Group__1__Impl rule__FTZipline__Group__2 )
            // InternalFairtracksDsl.g:4878:2: rule__FTZipline__Group__1__Impl rule__FTZipline__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__FTZipline__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZipline__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZipline__Group__1"


    // $ANTLR start "rule__FTZipline__Group__1__Impl"
    // InternalFairtracksDsl.g:4885:1: rule__FTZipline__Group__1__Impl : ( '=' ) ;
    public final void rule__FTZipline__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4889:1: ( ( '=' ) )
            // InternalFairtracksDsl.g:4890:1: ( '=' )
            {
            // InternalFairtracksDsl.g:4890:1: ( '=' )
            // InternalFairtracksDsl.g:4891:2: '='
            {
             before(grammarAccess.getFTZiplineAccess().getEqualsSignKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getFTZiplineAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZipline__Group__1__Impl"


    // $ANTLR start "rule__FTZipline__Group__2"
    // InternalFairtracksDsl.g:4900:1: rule__FTZipline__Group__2 : rule__FTZipline__Group__2__Impl rule__FTZipline__Group__3 ;
    public final void rule__FTZipline__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4904:1: ( rule__FTZipline__Group__2__Impl rule__FTZipline__Group__3 )
            // InternalFairtracksDsl.g:4905:2: rule__FTZipline__Group__2__Impl rule__FTZipline__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__FTZipline__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZipline__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZipline__Group__2"


    // $ANTLR start "rule__FTZipline__Group__2__Impl"
    // InternalFairtracksDsl.g:4912:1: rule__FTZipline__Group__2__Impl : ( '{' ) ;
    public final void rule__FTZipline__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4916:1: ( ( '{' ) )
            // InternalFairtracksDsl.g:4917:1: ( '{' )
            {
            // InternalFairtracksDsl.g:4917:1: ( '{' )
            // InternalFairtracksDsl.g:4918:2: '{'
            {
             before(grammarAccess.getFTZiplineAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getFTZiplineAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZipline__Group__2__Impl"


    // $ANTLR start "rule__FTZipline__Group__3"
    // InternalFairtracksDsl.g:4927:1: rule__FTZipline__Group__3 : rule__FTZipline__Group__3__Impl rule__FTZipline__Group__4 ;
    public final void rule__FTZipline__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4931:1: ( rule__FTZipline__Group__3__Impl rule__FTZipline__Group__4 )
            // InternalFairtracksDsl.g:4932:2: rule__FTZipline__Group__3__Impl rule__FTZipline__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__FTZipline__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZipline__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZipline__Group__3"


    // $ANTLR start "rule__FTZipline__Group__3__Impl"
    // InternalFairtracksDsl.g:4939:1: rule__FTZipline__Group__3__Impl : ( 'name' ) ;
    public final void rule__FTZipline__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4943:1: ( ( 'name' ) )
            // InternalFairtracksDsl.g:4944:1: ( 'name' )
            {
            // InternalFairtracksDsl.g:4944:1: ( 'name' )
            // InternalFairtracksDsl.g:4945:2: 'name'
            {
             before(grammarAccess.getFTZiplineAccess().getNameKeyword_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getFTZiplineAccess().getNameKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZipline__Group__3__Impl"


    // $ANTLR start "rule__FTZipline__Group__4"
    // InternalFairtracksDsl.g:4954:1: rule__FTZipline__Group__4 : rule__FTZipline__Group__4__Impl rule__FTZipline__Group__5 ;
    public final void rule__FTZipline__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4958:1: ( rule__FTZipline__Group__4__Impl rule__FTZipline__Group__5 )
            // InternalFairtracksDsl.g:4959:2: rule__FTZipline__Group__4__Impl rule__FTZipline__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__FTZipline__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZipline__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZipline__Group__4"


    // $ANTLR start "rule__FTZipline__Group__4__Impl"
    // InternalFairtracksDsl.g:4966:1: rule__FTZipline__Group__4__Impl : ( ':' ) ;
    public final void rule__FTZipline__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4970:1: ( ( ':' ) )
            // InternalFairtracksDsl.g:4971:1: ( ':' )
            {
            // InternalFairtracksDsl.g:4971:1: ( ':' )
            // InternalFairtracksDsl.g:4972:2: ':'
            {
             before(grammarAccess.getFTZiplineAccess().getColonKeyword_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getFTZiplineAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZipline__Group__4__Impl"


    // $ANTLR start "rule__FTZipline__Group__5"
    // InternalFairtracksDsl.g:4981:1: rule__FTZipline__Group__5 : rule__FTZipline__Group__5__Impl rule__FTZipline__Group__6 ;
    public final void rule__FTZipline__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4985:1: ( rule__FTZipline__Group__5__Impl rule__FTZipline__Group__6 )
            // InternalFairtracksDsl.g:4986:2: rule__FTZipline__Group__5__Impl rule__FTZipline__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__FTZipline__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZipline__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZipline__Group__5"


    // $ANTLR start "rule__FTZipline__Group__5__Impl"
    // InternalFairtracksDsl.g:4993:1: rule__FTZipline__Group__5__Impl : ( ( rule__FTZipline__NameAssignment_5 ) ) ;
    public final void rule__FTZipline__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:4997:1: ( ( ( rule__FTZipline__NameAssignment_5 ) ) )
            // InternalFairtracksDsl.g:4998:1: ( ( rule__FTZipline__NameAssignment_5 ) )
            {
            // InternalFairtracksDsl.g:4998:1: ( ( rule__FTZipline__NameAssignment_5 ) )
            // InternalFairtracksDsl.g:4999:2: ( rule__FTZipline__NameAssignment_5 )
            {
             before(grammarAccess.getFTZiplineAccess().getNameAssignment_5()); 
            // InternalFairtracksDsl.g:5000:2: ( rule__FTZipline__NameAssignment_5 )
            // InternalFairtracksDsl.g:5000:3: rule__FTZipline__NameAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__FTZipline__NameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getFTZiplineAccess().getNameAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZipline__Group__5__Impl"


    // $ANTLR start "rule__FTZipline__Group__6"
    // InternalFairtracksDsl.g:5008:1: rule__FTZipline__Group__6 : rule__FTZipline__Group__6__Impl rule__FTZipline__Group__7 ;
    public final void rule__FTZipline__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5012:1: ( rule__FTZipline__Group__6__Impl rule__FTZipline__Group__7 )
            // InternalFairtracksDsl.g:5013:2: rule__FTZipline__Group__6__Impl rule__FTZipline__Group__7
            {
            pushFollow(FOLLOW_30);
            rule__FTZipline__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZipline__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZipline__Group__6"


    // $ANTLR start "rule__FTZipline__Group__6__Impl"
    // InternalFairtracksDsl.g:5020:1: rule__FTZipline__Group__6__Impl : ( ';' ) ;
    public final void rule__FTZipline__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5024:1: ( ( ';' ) )
            // InternalFairtracksDsl.g:5025:1: ( ';' )
            {
            // InternalFairtracksDsl.g:5025:1: ( ';' )
            // InternalFairtracksDsl.g:5026:2: ';'
            {
             before(grammarAccess.getFTZiplineAccess().getSemicolonKeyword_6()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getFTZiplineAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZipline__Group__6__Impl"


    // $ANTLR start "rule__FTZipline__Group__7"
    // InternalFairtracksDsl.g:5035:1: rule__FTZipline__Group__7 : rule__FTZipline__Group__7__Impl rule__FTZipline__Group__8 ;
    public final void rule__FTZipline__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5039:1: ( rule__FTZipline__Group__7__Impl rule__FTZipline__Group__8 )
            // InternalFairtracksDsl.g:5040:2: rule__FTZipline__Group__7__Impl rule__FTZipline__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__FTZipline__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZipline__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZipline__Group__7"


    // $ANTLR start "rule__FTZipline__Group__7__Impl"
    // InternalFairtracksDsl.g:5047:1: rule__FTZipline__Group__7__Impl : ( 'length' ) ;
    public final void rule__FTZipline__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5051:1: ( ( 'length' ) )
            // InternalFairtracksDsl.g:5052:1: ( 'length' )
            {
            // InternalFairtracksDsl.g:5052:1: ( 'length' )
            // InternalFairtracksDsl.g:5053:2: 'length'
            {
             before(grammarAccess.getFTZiplineAccess().getLengthKeyword_7()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getFTZiplineAccess().getLengthKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZipline__Group__7__Impl"


    // $ANTLR start "rule__FTZipline__Group__8"
    // InternalFairtracksDsl.g:5062:1: rule__FTZipline__Group__8 : rule__FTZipline__Group__8__Impl rule__FTZipline__Group__9 ;
    public final void rule__FTZipline__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5066:1: ( rule__FTZipline__Group__8__Impl rule__FTZipline__Group__9 )
            // InternalFairtracksDsl.g:5067:2: rule__FTZipline__Group__8__Impl rule__FTZipline__Group__9
            {
            pushFollow(FOLLOW_13);
            rule__FTZipline__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZipline__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZipline__Group__8"


    // $ANTLR start "rule__FTZipline__Group__8__Impl"
    // InternalFairtracksDsl.g:5074:1: rule__FTZipline__Group__8__Impl : ( ':' ) ;
    public final void rule__FTZipline__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5078:1: ( ( ':' ) )
            // InternalFairtracksDsl.g:5079:1: ( ':' )
            {
            // InternalFairtracksDsl.g:5079:1: ( ':' )
            // InternalFairtracksDsl.g:5080:2: ':'
            {
             before(grammarAccess.getFTZiplineAccess().getColonKeyword_8()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getFTZiplineAccess().getColonKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZipline__Group__8__Impl"


    // $ANTLR start "rule__FTZipline__Group__9"
    // InternalFairtracksDsl.g:5089:1: rule__FTZipline__Group__9 : rule__FTZipline__Group__9__Impl rule__FTZipline__Group__10 ;
    public final void rule__FTZipline__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5093:1: ( rule__FTZipline__Group__9__Impl rule__FTZipline__Group__10 )
            // InternalFairtracksDsl.g:5094:2: rule__FTZipline__Group__9__Impl rule__FTZipline__Group__10
            {
            pushFollow(FOLLOW_11);
            rule__FTZipline__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZipline__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZipline__Group__9"


    // $ANTLR start "rule__FTZipline__Group__9__Impl"
    // InternalFairtracksDsl.g:5101:1: rule__FTZipline__Group__9__Impl : ( ( rule__FTZipline__SizeAssignment_9 ) ) ;
    public final void rule__FTZipline__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5105:1: ( ( ( rule__FTZipline__SizeAssignment_9 ) ) )
            // InternalFairtracksDsl.g:5106:1: ( ( rule__FTZipline__SizeAssignment_9 ) )
            {
            // InternalFairtracksDsl.g:5106:1: ( ( rule__FTZipline__SizeAssignment_9 ) )
            // InternalFairtracksDsl.g:5107:2: ( rule__FTZipline__SizeAssignment_9 )
            {
             before(grammarAccess.getFTZiplineAccess().getSizeAssignment_9()); 
            // InternalFairtracksDsl.g:5108:2: ( rule__FTZipline__SizeAssignment_9 )
            // InternalFairtracksDsl.g:5108:3: rule__FTZipline__SizeAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__FTZipline__SizeAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getFTZiplineAccess().getSizeAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZipline__Group__9__Impl"


    // $ANTLR start "rule__FTZipline__Group__10"
    // InternalFairtracksDsl.g:5116:1: rule__FTZipline__Group__10 : rule__FTZipline__Group__10__Impl rule__FTZipline__Group__11 ;
    public final void rule__FTZipline__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5120:1: ( rule__FTZipline__Group__10__Impl rule__FTZipline__Group__11 )
            // InternalFairtracksDsl.g:5121:2: rule__FTZipline__Group__10__Impl rule__FTZipline__Group__11
            {
            pushFollow(FOLLOW_31);
            rule__FTZipline__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZipline__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZipline__Group__10"


    // $ANTLR start "rule__FTZipline__Group__10__Impl"
    // InternalFairtracksDsl.g:5128:1: rule__FTZipline__Group__10__Impl : ( ';' ) ;
    public final void rule__FTZipline__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5132:1: ( ( ';' ) )
            // InternalFairtracksDsl.g:5133:1: ( ';' )
            {
            // InternalFairtracksDsl.g:5133:1: ( ';' )
            // InternalFairtracksDsl.g:5134:2: ';'
            {
             before(grammarAccess.getFTZiplineAccess().getSemicolonKeyword_10()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getFTZiplineAccess().getSemicolonKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZipline__Group__10__Impl"


    // $ANTLR start "rule__FTZipline__Group__11"
    // InternalFairtracksDsl.g:5143:1: rule__FTZipline__Group__11 : rule__FTZipline__Group__11__Impl rule__FTZipline__Group__12 ;
    public final void rule__FTZipline__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5147:1: ( rule__FTZipline__Group__11__Impl rule__FTZipline__Group__12 )
            // InternalFairtracksDsl.g:5148:2: rule__FTZipline__Group__11__Impl rule__FTZipline__Group__12
            {
            pushFollow(FOLLOW_9);
            rule__FTZipline__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZipline__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZipline__Group__11"


    // $ANTLR start "rule__FTZipline__Group__11__Impl"
    // InternalFairtracksDsl.g:5155:1: rule__FTZipline__Group__11__Impl : ( 'extremities' ) ;
    public final void rule__FTZipline__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5159:1: ( ( 'extremities' ) )
            // InternalFairtracksDsl.g:5160:1: ( 'extremities' )
            {
            // InternalFairtracksDsl.g:5160:1: ( 'extremities' )
            // InternalFairtracksDsl.g:5161:2: 'extremities'
            {
             before(grammarAccess.getFTZiplineAccess().getExtremitiesKeyword_11()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getFTZiplineAccess().getExtremitiesKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZipline__Group__11__Impl"


    // $ANTLR start "rule__FTZipline__Group__12"
    // InternalFairtracksDsl.g:5170:1: rule__FTZipline__Group__12 : rule__FTZipline__Group__12__Impl rule__FTZipline__Group__13 ;
    public final void rule__FTZipline__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5174:1: ( rule__FTZipline__Group__12__Impl rule__FTZipline__Group__13 )
            // InternalFairtracksDsl.g:5175:2: rule__FTZipline__Group__12__Impl rule__FTZipline__Group__13
            {
            pushFollow(FOLLOW_22);
            rule__FTZipline__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZipline__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZipline__Group__12"


    // $ANTLR start "rule__FTZipline__Group__12__Impl"
    // InternalFairtracksDsl.g:5182:1: rule__FTZipline__Group__12__Impl : ( ':' ) ;
    public final void rule__FTZipline__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5186:1: ( ( ':' ) )
            // InternalFairtracksDsl.g:5187:1: ( ':' )
            {
            // InternalFairtracksDsl.g:5187:1: ( ':' )
            // InternalFairtracksDsl.g:5188:2: ':'
            {
             before(grammarAccess.getFTZiplineAccess().getColonKeyword_12()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getFTZiplineAccess().getColonKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZipline__Group__12__Impl"


    // $ANTLR start "rule__FTZipline__Group__13"
    // InternalFairtracksDsl.g:5197:1: rule__FTZipline__Group__13 : rule__FTZipline__Group__13__Impl rule__FTZipline__Group__14 ;
    public final void rule__FTZipline__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5201:1: ( rule__FTZipline__Group__13__Impl rule__FTZipline__Group__14 )
            // InternalFairtracksDsl.g:5202:2: rule__FTZipline__Group__13__Impl rule__FTZipline__Group__14
            {
            pushFollow(FOLLOW_10);
            rule__FTZipline__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZipline__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZipline__Group__13"


    // $ANTLR start "rule__FTZipline__Group__13__Impl"
    // InternalFairtracksDsl.g:5209:1: rule__FTZipline__Group__13__Impl : ( '[' ) ;
    public final void rule__FTZipline__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5213:1: ( ( '[' ) )
            // InternalFairtracksDsl.g:5214:1: ( '[' )
            {
            // InternalFairtracksDsl.g:5214:1: ( '[' )
            // InternalFairtracksDsl.g:5215:2: '['
            {
             before(grammarAccess.getFTZiplineAccess().getLeftSquareBracketKeyword_13()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getFTZiplineAccess().getLeftSquareBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZipline__Group__13__Impl"


    // $ANTLR start "rule__FTZipline__Group__14"
    // InternalFairtracksDsl.g:5224:1: rule__FTZipline__Group__14 : rule__FTZipline__Group__14__Impl rule__FTZipline__Group__15 ;
    public final void rule__FTZipline__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5228:1: ( rule__FTZipline__Group__14__Impl rule__FTZipline__Group__15 )
            // InternalFairtracksDsl.g:5229:2: rule__FTZipline__Group__14__Impl rule__FTZipline__Group__15
            {
            pushFollow(FOLLOW_32);
            rule__FTZipline__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZipline__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZipline__Group__14"


    // $ANTLR start "rule__FTZipline__Group__14__Impl"
    // InternalFairtracksDsl.g:5236:1: rule__FTZipline__Group__14__Impl : ( ( rule__FTZipline__StartZoneAssignment_14 ) ) ;
    public final void rule__FTZipline__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5240:1: ( ( ( rule__FTZipline__StartZoneAssignment_14 ) ) )
            // InternalFairtracksDsl.g:5241:1: ( ( rule__FTZipline__StartZoneAssignment_14 ) )
            {
            // InternalFairtracksDsl.g:5241:1: ( ( rule__FTZipline__StartZoneAssignment_14 ) )
            // InternalFairtracksDsl.g:5242:2: ( rule__FTZipline__StartZoneAssignment_14 )
            {
             before(grammarAccess.getFTZiplineAccess().getStartZoneAssignment_14()); 
            // InternalFairtracksDsl.g:5243:2: ( rule__FTZipline__StartZoneAssignment_14 )
            // InternalFairtracksDsl.g:5243:3: rule__FTZipline__StartZoneAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__FTZipline__StartZoneAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getFTZiplineAccess().getStartZoneAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZipline__Group__14__Impl"


    // $ANTLR start "rule__FTZipline__Group__15"
    // InternalFairtracksDsl.g:5251:1: rule__FTZipline__Group__15 : rule__FTZipline__Group__15__Impl rule__FTZipline__Group__16 ;
    public final void rule__FTZipline__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5255:1: ( rule__FTZipline__Group__15__Impl rule__FTZipline__Group__16 )
            // InternalFairtracksDsl.g:5256:2: rule__FTZipline__Group__15__Impl rule__FTZipline__Group__16
            {
            pushFollow(FOLLOW_10);
            rule__FTZipline__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZipline__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZipline__Group__15"


    // $ANTLR start "rule__FTZipline__Group__15__Impl"
    // InternalFairtracksDsl.g:5263:1: rule__FTZipline__Group__15__Impl : ( ',' ) ;
    public final void rule__FTZipline__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5267:1: ( ( ',' ) )
            // InternalFairtracksDsl.g:5268:1: ( ',' )
            {
            // InternalFairtracksDsl.g:5268:1: ( ',' )
            // InternalFairtracksDsl.g:5269:2: ','
            {
             before(grammarAccess.getFTZiplineAccess().getCommaKeyword_15()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getFTZiplineAccess().getCommaKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZipline__Group__15__Impl"


    // $ANTLR start "rule__FTZipline__Group__16"
    // InternalFairtracksDsl.g:5278:1: rule__FTZipline__Group__16 : rule__FTZipline__Group__16__Impl rule__FTZipline__Group__17 ;
    public final void rule__FTZipline__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5282:1: ( rule__FTZipline__Group__16__Impl rule__FTZipline__Group__17 )
            // InternalFairtracksDsl.g:5283:2: rule__FTZipline__Group__16__Impl rule__FTZipline__Group__17
            {
            pushFollow(FOLLOW_24);
            rule__FTZipline__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZipline__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZipline__Group__16"


    // $ANTLR start "rule__FTZipline__Group__16__Impl"
    // InternalFairtracksDsl.g:5290:1: rule__FTZipline__Group__16__Impl : ( ( rule__FTZipline__EndZoneAssignment_16 ) ) ;
    public final void rule__FTZipline__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5294:1: ( ( ( rule__FTZipline__EndZoneAssignment_16 ) ) )
            // InternalFairtracksDsl.g:5295:1: ( ( rule__FTZipline__EndZoneAssignment_16 ) )
            {
            // InternalFairtracksDsl.g:5295:1: ( ( rule__FTZipline__EndZoneAssignment_16 ) )
            // InternalFairtracksDsl.g:5296:2: ( rule__FTZipline__EndZoneAssignment_16 )
            {
             before(grammarAccess.getFTZiplineAccess().getEndZoneAssignment_16()); 
            // InternalFairtracksDsl.g:5297:2: ( rule__FTZipline__EndZoneAssignment_16 )
            // InternalFairtracksDsl.g:5297:3: rule__FTZipline__EndZoneAssignment_16
            {
            pushFollow(FOLLOW_2);
            rule__FTZipline__EndZoneAssignment_16();

            state._fsp--;


            }

             after(grammarAccess.getFTZiplineAccess().getEndZoneAssignment_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZipline__Group__16__Impl"


    // $ANTLR start "rule__FTZipline__Group__17"
    // InternalFairtracksDsl.g:5305:1: rule__FTZipline__Group__17 : rule__FTZipline__Group__17__Impl rule__FTZipline__Group__18 ;
    public final void rule__FTZipline__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5309:1: ( rule__FTZipline__Group__17__Impl rule__FTZipline__Group__18 )
            // InternalFairtracksDsl.g:5310:2: rule__FTZipline__Group__17__Impl rule__FTZipline__Group__18
            {
            pushFollow(FOLLOW_11);
            rule__FTZipline__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZipline__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZipline__Group__17"


    // $ANTLR start "rule__FTZipline__Group__17__Impl"
    // InternalFairtracksDsl.g:5317:1: rule__FTZipline__Group__17__Impl : ( ']' ) ;
    public final void rule__FTZipline__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5321:1: ( ( ']' ) )
            // InternalFairtracksDsl.g:5322:1: ( ']' )
            {
            // InternalFairtracksDsl.g:5322:1: ( ']' )
            // InternalFairtracksDsl.g:5323:2: ']'
            {
             before(grammarAccess.getFTZiplineAccess().getRightSquareBracketKeyword_17()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getFTZiplineAccess().getRightSquareBracketKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZipline__Group__17__Impl"


    // $ANTLR start "rule__FTZipline__Group__18"
    // InternalFairtracksDsl.g:5332:1: rule__FTZipline__Group__18 : rule__FTZipline__Group__18__Impl rule__FTZipline__Group__19 ;
    public final void rule__FTZipline__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5336:1: ( rule__FTZipline__Group__18__Impl rule__FTZipline__Group__19 )
            // InternalFairtracksDsl.g:5337:2: rule__FTZipline__Group__18__Impl rule__FTZipline__Group__19
            {
            pushFollow(FOLLOW_33);
            rule__FTZipline__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZipline__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZipline__Group__18"


    // $ANTLR start "rule__FTZipline__Group__18__Impl"
    // InternalFairtracksDsl.g:5344:1: rule__FTZipline__Group__18__Impl : ( ';' ) ;
    public final void rule__FTZipline__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5348:1: ( ( ';' ) )
            // InternalFairtracksDsl.g:5349:1: ( ';' )
            {
            // InternalFairtracksDsl.g:5349:1: ( ';' )
            // InternalFairtracksDsl.g:5350:2: ';'
            {
             before(grammarAccess.getFTZiplineAccess().getSemicolonKeyword_18()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getFTZiplineAccess().getSemicolonKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZipline__Group__18__Impl"


    // $ANTLR start "rule__FTZipline__Group__19"
    // InternalFairtracksDsl.g:5359:1: rule__FTZipline__Group__19 : rule__FTZipline__Group__19__Impl rule__FTZipline__Group__20 ;
    public final void rule__FTZipline__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5363:1: ( rule__FTZipline__Group__19__Impl rule__FTZipline__Group__20 )
            // InternalFairtracksDsl.g:5364:2: rule__FTZipline__Group__19__Impl rule__FTZipline__Group__20
            {
            pushFollow(FOLLOW_33);
            rule__FTZipline__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZipline__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZipline__Group__19"


    // $ANTLR start "rule__FTZipline__Group__19__Impl"
    // InternalFairtracksDsl.g:5371:1: rule__FTZipline__Group__19__Impl : ( ( rule__FTZipline__Group_19__0 )? ) ;
    public final void rule__FTZipline__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5375:1: ( ( ( rule__FTZipline__Group_19__0 )? ) )
            // InternalFairtracksDsl.g:5376:1: ( ( rule__FTZipline__Group_19__0 )? )
            {
            // InternalFairtracksDsl.g:5376:1: ( ( rule__FTZipline__Group_19__0 )? )
            // InternalFairtracksDsl.g:5377:2: ( rule__FTZipline__Group_19__0 )?
            {
             before(grammarAccess.getFTZiplineAccess().getGroup_19()); 
            // InternalFairtracksDsl.g:5378:2: ( rule__FTZipline__Group_19__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==46) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalFairtracksDsl.g:5378:3: rule__FTZipline__Group_19__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FTZipline__Group_19__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFTZiplineAccess().getGroup_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZipline__Group__19__Impl"


    // $ANTLR start "rule__FTZipline__Group__20"
    // InternalFairtracksDsl.g:5386:1: rule__FTZipline__Group__20 : rule__FTZipline__Group__20__Impl ;
    public final void rule__FTZipline__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5390:1: ( rule__FTZipline__Group__20__Impl )
            // InternalFairtracksDsl.g:5391:2: rule__FTZipline__Group__20__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FTZipline__Group__20__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZipline__Group__20"


    // $ANTLR start "rule__FTZipline__Group__20__Impl"
    // InternalFairtracksDsl.g:5397:1: rule__FTZipline__Group__20__Impl : ( '}' ) ;
    public final void rule__FTZipline__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5401:1: ( ( '}' ) )
            // InternalFairtracksDsl.g:5402:1: ( '}' )
            {
            // InternalFairtracksDsl.g:5402:1: ( '}' )
            // InternalFairtracksDsl.g:5403:2: '}'
            {
             before(grammarAccess.getFTZiplineAccess().getRightCurlyBracketKeyword_20()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getFTZiplineAccess().getRightCurlyBracketKeyword_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZipline__Group__20__Impl"


    // $ANTLR start "rule__FTZipline__Group_19__0"
    // InternalFairtracksDsl.g:5413:1: rule__FTZipline__Group_19__0 : rule__FTZipline__Group_19__0__Impl rule__FTZipline__Group_19__1 ;
    public final void rule__FTZipline__Group_19__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5417:1: ( rule__FTZipline__Group_19__0__Impl rule__FTZipline__Group_19__1 )
            // InternalFairtracksDsl.g:5418:2: rule__FTZipline__Group_19__0__Impl rule__FTZipline__Group_19__1
            {
            pushFollow(FOLLOW_21);
            rule__FTZipline__Group_19__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZipline__Group_19__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZipline__Group_19__0"


    // $ANTLR start "rule__FTZipline__Group_19__0__Impl"
    // InternalFairtracksDsl.g:5425:1: rule__FTZipline__Group_19__0__Impl : ( 'Real' ) ;
    public final void rule__FTZipline__Group_19__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5429:1: ( ( 'Real' ) )
            // InternalFairtracksDsl.g:5430:1: ( 'Real' )
            {
            // InternalFairtracksDsl.g:5430:1: ( 'Real' )
            // InternalFairtracksDsl.g:5431:2: 'Real'
            {
             before(grammarAccess.getFTZiplineAccess().getRealKeyword_19_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getFTZiplineAccess().getRealKeyword_19_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZipline__Group_19__0__Impl"


    // $ANTLR start "rule__FTZipline__Group_19__1"
    // InternalFairtracksDsl.g:5440:1: rule__FTZipline__Group_19__1 : rule__FTZipline__Group_19__1__Impl rule__FTZipline__Group_19__2 ;
    public final void rule__FTZipline__Group_19__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5444:1: ( rule__FTZipline__Group_19__1__Impl rule__FTZipline__Group_19__2 )
            // InternalFairtracksDsl.g:5445:2: rule__FTZipline__Group_19__1__Impl rule__FTZipline__Group_19__2
            {
            pushFollow(FOLLOW_9);
            rule__FTZipline__Group_19__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZipline__Group_19__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZipline__Group_19__1"


    // $ANTLR start "rule__FTZipline__Group_19__1__Impl"
    // InternalFairtracksDsl.g:5452:1: rule__FTZipline__Group_19__1__Impl : ( 'Coordinates' ) ;
    public final void rule__FTZipline__Group_19__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5456:1: ( ( 'Coordinates' ) )
            // InternalFairtracksDsl.g:5457:1: ( 'Coordinates' )
            {
            // InternalFairtracksDsl.g:5457:1: ( 'Coordinates' )
            // InternalFairtracksDsl.g:5458:2: 'Coordinates'
            {
             before(grammarAccess.getFTZiplineAccess().getCoordinatesKeyword_19_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getFTZiplineAccess().getCoordinatesKeyword_19_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZipline__Group_19__1__Impl"


    // $ANTLR start "rule__FTZipline__Group_19__2"
    // InternalFairtracksDsl.g:5467:1: rule__FTZipline__Group_19__2 : rule__FTZipline__Group_19__2__Impl rule__FTZipline__Group_19__3 ;
    public final void rule__FTZipline__Group_19__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5471:1: ( rule__FTZipline__Group_19__2__Impl rule__FTZipline__Group_19__3 )
            // InternalFairtracksDsl.g:5472:2: rule__FTZipline__Group_19__2__Impl rule__FTZipline__Group_19__3
            {
            pushFollow(FOLLOW_22);
            rule__FTZipline__Group_19__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZipline__Group_19__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZipline__Group_19__2"


    // $ANTLR start "rule__FTZipline__Group_19__2__Impl"
    // InternalFairtracksDsl.g:5479:1: rule__FTZipline__Group_19__2__Impl : ( ':' ) ;
    public final void rule__FTZipline__Group_19__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5483:1: ( ( ':' ) )
            // InternalFairtracksDsl.g:5484:1: ( ':' )
            {
            // InternalFairtracksDsl.g:5484:1: ( ':' )
            // InternalFairtracksDsl.g:5485:2: ':'
            {
             before(grammarAccess.getFTZiplineAccess().getColonKeyword_19_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getFTZiplineAccess().getColonKeyword_19_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZipline__Group_19__2__Impl"


    // $ANTLR start "rule__FTZipline__Group_19__3"
    // InternalFairtracksDsl.g:5494:1: rule__FTZipline__Group_19__3 : rule__FTZipline__Group_19__3__Impl rule__FTZipline__Group_19__4 ;
    public final void rule__FTZipline__Group_19__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5498:1: ( rule__FTZipline__Group_19__3__Impl rule__FTZipline__Group_19__4 )
            // InternalFairtracksDsl.g:5499:2: rule__FTZipline__Group_19__3__Impl rule__FTZipline__Group_19__4
            {
            pushFollow(FOLLOW_23);
            rule__FTZipline__Group_19__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZipline__Group_19__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZipline__Group_19__3"


    // $ANTLR start "rule__FTZipline__Group_19__3__Impl"
    // InternalFairtracksDsl.g:5506:1: rule__FTZipline__Group_19__3__Impl : ( '[' ) ;
    public final void rule__FTZipline__Group_19__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5510:1: ( ( '[' ) )
            // InternalFairtracksDsl.g:5511:1: ( '[' )
            {
            // InternalFairtracksDsl.g:5511:1: ( '[' )
            // InternalFairtracksDsl.g:5512:2: '['
            {
             before(grammarAccess.getFTZiplineAccess().getLeftSquareBracketKeyword_19_3()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getFTZiplineAccess().getLeftSquareBracketKeyword_19_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZipline__Group_19__3__Impl"


    // $ANTLR start "rule__FTZipline__Group_19__4"
    // InternalFairtracksDsl.g:5521:1: rule__FTZipline__Group_19__4 : rule__FTZipline__Group_19__4__Impl rule__FTZipline__Group_19__5 ;
    public final void rule__FTZipline__Group_19__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5525:1: ( rule__FTZipline__Group_19__4__Impl rule__FTZipline__Group_19__5 )
            // InternalFairtracksDsl.g:5526:2: rule__FTZipline__Group_19__4__Impl rule__FTZipline__Group_19__5
            {
            pushFollow(FOLLOW_24);
            rule__FTZipline__Group_19__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZipline__Group_19__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZipline__Group_19__4"


    // $ANTLR start "rule__FTZipline__Group_19__4__Impl"
    // InternalFairtracksDsl.g:5533:1: rule__FTZipline__Group_19__4__Impl : ( ( rule__FTZipline__CoordinatesAssignment_19_4 ) ) ;
    public final void rule__FTZipline__Group_19__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5537:1: ( ( ( rule__FTZipline__CoordinatesAssignment_19_4 ) ) )
            // InternalFairtracksDsl.g:5538:1: ( ( rule__FTZipline__CoordinatesAssignment_19_4 ) )
            {
            // InternalFairtracksDsl.g:5538:1: ( ( rule__FTZipline__CoordinatesAssignment_19_4 ) )
            // InternalFairtracksDsl.g:5539:2: ( rule__FTZipline__CoordinatesAssignment_19_4 )
            {
             before(grammarAccess.getFTZiplineAccess().getCoordinatesAssignment_19_4()); 
            // InternalFairtracksDsl.g:5540:2: ( rule__FTZipline__CoordinatesAssignment_19_4 )
            // InternalFairtracksDsl.g:5540:3: rule__FTZipline__CoordinatesAssignment_19_4
            {
            pushFollow(FOLLOW_2);
            rule__FTZipline__CoordinatesAssignment_19_4();

            state._fsp--;


            }

             after(grammarAccess.getFTZiplineAccess().getCoordinatesAssignment_19_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZipline__Group_19__4__Impl"


    // $ANTLR start "rule__FTZipline__Group_19__5"
    // InternalFairtracksDsl.g:5548:1: rule__FTZipline__Group_19__5 : rule__FTZipline__Group_19__5__Impl ;
    public final void rule__FTZipline__Group_19__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5552:1: ( rule__FTZipline__Group_19__5__Impl )
            // InternalFairtracksDsl.g:5553:2: rule__FTZipline__Group_19__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FTZipline__Group_19__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZipline__Group_19__5"


    // $ANTLR start "rule__FTZipline__Group_19__5__Impl"
    // InternalFairtracksDsl.g:5559:1: rule__FTZipline__Group_19__5__Impl : ( ']' ) ;
    public final void rule__FTZipline__Group_19__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5563:1: ( ( ']' ) )
            // InternalFairtracksDsl.g:5564:1: ( ']' )
            {
            // InternalFairtracksDsl.g:5564:1: ( ']' )
            // InternalFairtracksDsl.g:5565:2: ']'
            {
             before(grammarAccess.getFTZiplineAccess().getRightSquareBracketKeyword_19_5()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getFTZiplineAccess().getRightSquareBracketKeyword_19_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZipline__Group_19__5__Impl"


    // $ANTLR start "rule__FTRealCoordinates__Group__0"
    // InternalFairtracksDsl.g:5575:1: rule__FTRealCoordinates__Group__0 : rule__FTRealCoordinates__Group__0__Impl rule__FTRealCoordinates__Group__1 ;
    public final void rule__FTRealCoordinates__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5579:1: ( rule__FTRealCoordinates__Group__0__Impl rule__FTRealCoordinates__Group__1 )
            // InternalFairtracksDsl.g:5580:2: rule__FTRealCoordinates__Group__0__Impl rule__FTRealCoordinates__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__FTRealCoordinates__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTRealCoordinates__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTRealCoordinates__Group__0"


    // $ANTLR start "rule__FTRealCoordinates__Group__0__Impl"
    // InternalFairtracksDsl.g:5587:1: rule__FTRealCoordinates__Group__0__Impl : ( 'Position' ) ;
    public final void rule__FTRealCoordinates__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5591:1: ( ( 'Position' ) )
            // InternalFairtracksDsl.g:5592:1: ( 'Position' )
            {
            // InternalFairtracksDsl.g:5592:1: ( 'Position' )
            // InternalFairtracksDsl.g:5593:2: 'Position'
            {
             before(grammarAccess.getFTRealCoordinatesAccess().getPositionKeyword_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getFTRealCoordinatesAccess().getPositionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTRealCoordinates__Group__0__Impl"


    // $ANTLR start "rule__FTRealCoordinates__Group__1"
    // InternalFairtracksDsl.g:5602:1: rule__FTRealCoordinates__Group__1 : rule__FTRealCoordinates__Group__1__Impl rule__FTRealCoordinates__Group__2 ;
    public final void rule__FTRealCoordinates__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5606:1: ( rule__FTRealCoordinates__Group__1__Impl rule__FTRealCoordinates__Group__2 )
            // InternalFairtracksDsl.g:5607:2: rule__FTRealCoordinates__Group__1__Impl rule__FTRealCoordinates__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__FTRealCoordinates__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTRealCoordinates__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTRealCoordinates__Group__1"


    // $ANTLR start "rule__FTRealCoordinates__Group__1__Impl"
    // InternalFairtracksDsl.g:5614:1: rule__FTRealCoordinates__Group__1__Impl : ( ':' ) ;
    public final void rule__FTRealCoordinates__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5618:1: ( ( ':' ) )
            // InternalFairtracksDsl.g:5619:1: ( ':' )
            {
            // InternalFairtracksDsl.g:5619:1: ( ':' )
            // InternalFairtracksDsl.g:5620:2: ':'
            {
             before(grammarAccess.getFTRealCoordinatesAccess().getColonKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getFTRealCoordinatesAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTRealCoordinates__Group__1__Impl"


    // $ANTLR start "rule__FTRealCoordinates__Group__2"
    // InternalFairtracksDsl.g:5629:1: rule__FTRealCoordinates__Group__2 : rule__FTRealCoordinates__Group__2__Impl rule__FTRealCoordinates__Group__3 ;
    public final void rule__FTRealCoordinates__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5633:1: ( rule__FTRealCoordinates__Group__2__Impl rule__FTRealCoordinates__Group__3 )
            // InternalFairtracksDsl.g:5634:2: rule__FTRealCoordinates__Group__2__Impl rule__FTRealCoordinates__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__FTRealCoordinates__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTRealCoordinates__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTRealCoordinates__Group__2"


    // $ANTLR start "rule__FTRealCoordinates__Group__2__Impl"
    // InternalFairtracksDsl.g:5641:1: rule__FTRealCoordinates__Group__2__Impl : ( '(' ) ;
    public final void rule__FTRealCoordinates__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5645:1: ( ( '(' ) )
            // InternalFairtracksDsl.g:5646:1: ( '(' )
            {
            // InternalFairtracksDsl.g:5646:1: ( '(' )
            // InternalFairtracksDsl.g:5647:2: '('
            {
             before(grammarAccess.getFTRealCoordinatesAccess().getLeftParenthesisKeyword_2()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getFTRealCoordinatesAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTRealCoordinates__Group__2__Impl"


    // $ANTLR start "rule__FTRealCoordinates__Group__3"
    // InternalFairtracksDsl.g:5656:1: rule__FTRealCoordinates__Group__3 : rule__FTRealCoordinates__Group__3__Impl rule__FTRealCoordinates__Group__4 ;
    public final void rule__FTRealCoordinates__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5660:1: ( rule__FTRealCoordinates__Group__3__Impl rule__FTRealCoordinates__Group__4 )
            // InternalFairtracksDsl.g:5661:2: rule__FTRealCoordinates__Group__3__Impl rule__FTRealCoordinates__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__FTRealCoordinates__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTRealCoordinates__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTRealCoordinates__Group__3"


    // $ANTLR start "rule__FTRealCoordinates__Group__3__Impl"
    // InternalFairtracksDsl.g:5668:1: rule__FTRealCoordinates__Group__3__Impl : ( ( rule__FTRealCoordinates__PosXAssignment_3 ) ) ;
    public final void rule__FTRealCoordinates__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5672:1: ( ( ( rule__FTRealCoordinates__PosXAssignment_3 ) ) )
            // InternalFairtracksDsl.g:5673:1: ( ( rule__FTRealCoordinates__PosXAssignment_3 ) )
            {
            // InternalFairtracksDsl.g:5673:1: ( ( rule__FTRealCoordinates__PosXAssignment_3 ) )
            // InternalFairtracksDsl.g:5674:2: ( rule__FTRealCoordinates__PosXAssignment_3 )
            {
             before(grammarAccess.getFTRealCoordinatesAccess().getPosXAssignment_3()); 
            // InternalFairtracksDsl.g:5675:2: ( rule__FTRealCoordinates__PosXAssignment_3 )
            // InternalFairtracksDsl.g:5675:3: rule__FTRealCoordinates__PosXAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__FTRealCoordinates__PosXAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFTRealCoordinatesAccess().getPosXAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTRealCoordinates__Group__3__Impl"


    // $ANTLR start "rule__FTRealCoordinates__Group__4"
    // InternalFairtracksDsl.g:5683:1: rule__FTRealCoordinates__Group__4 : rule__FTRealCoordinates__Group__4__Impl rule__FTRealCoordinates__Group__5 ;
    public final void rule__FTRealCoordinates__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5687:1: ( rule__FTRealCoordinates__Group__4__Impl rule__FTRealCoordinates__Group__5 )
            // InternalFairtracksDsl.g:5688:2: rule__FTRealCoordinates__Group__4__Impl rule__FTRealCoordinates__Group__5
            {
            pushFollow(FOLLOW_35);
            rule__FTRealCoordinates__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTRealCoordinates__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTRealCoordinates__Group__4"


    // $ANTLR start "rule__FTRealCoordinates__Group__4__Impl"
    // InternalFairtracksDsl.g:5695:1: rule__FTRealCoordinates__Group__4__Impl : ( ',' ) ;
    public final void rule__FTRealCoordinates__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5699:1: ( ( ',' ) )
            // InternalFairtracksDsl.g:5700:1: ( ',' )
            {
            // InternalFairtracksDsl.g:5700:1: ( ',' )
            // InternalFairtracksDsl.g:5701:2: ','
            {
             before(grammarAccess.getFTRealCoordinatesAccess().getCommaKeyword_4()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getFTRealCoordinatesAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTRealCoordinates__Group__4__Impl"


    // $ANTLR start "rule__FTRealCoordinates__Group__5"
    // InternalFairtracksDsl.g:5710:1: rule__FTRealCoordinates__Group__5 : rule__FTRealCoordinates__Group__5__Impl rule__FTRealCoordinates__Group__6 ;
    public final void rule__FTRealCoordinates__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5714:1: ( rule__FTRealCoordinates__Group__5__Impl rule__FTRealCoordinates__Group__6 )
            // InternalFairtracksDsl.g:5715:2: rule__FTRealCoordinates__Group__5__Impl rule__FTRealCoordinates__Group__6
            {
            pushFollow(FOLLOW_36);
            rule__FTRealCoordinates__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTRealCoordinates__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTRealCoordinates__Group__5"


    // $ANTLR start "rule__FTRealCoordinates__Group__5__Impl"
    // InternalFairtracksDsl.g:5722:1: rule__FTRealCoordinates__Group__5__Impl : ( ( rule__FTRealCoordinates__PosYAssignment_5 ) ) ;
    public final void rule__FTRealCoordinates__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5726:1: ( ( ( rule__FTRealCoordinates__PosYAssignment_5 ) ) )
            // InternalFairtracksDsl.g:5727:1: ( ( rule__FTRealCoordinates__PosYAssignment_5 ) )
            {
            // InternalFairtracksDsl.g:5727:1: ( ( rule__FTRealCoordinates__PosYAssignment_5 ) )
            // InternalFairtracksDsl.g:5728:2: ( rule__FTRealCoordinates__PosYAssignment_5 )
            {
             before(grammarAccess.getFTRealCoordinatesAccess().getPosYAssignment_5()); 
            // InternalFairtracksDsl.g:5729:2: ( rule__FTRealCoordinates__PosYAssignment_5 )
            // InternalFairtracksDsl.g:5729:3: rule__FTRealCoordinates__PosYAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__FTRealCoordinates__PosYAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getFTRealCoordinatesAccess().getPosYAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTRealCoordinates__Group__5__Impl"


    // $ANTLR start "rule__FTRealCoordinates__Group__6"
    // InternalFairtracksDsl.g:5737:1: rule__FTRealCoordinates__Group__6 : rule__FTRealCoordinates__Group__6__Impl rule__FTRealCoordinates__Group__7 ;
    public final void rule__FTRealCoordinates__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5741:1: ( rule__FTRealCoordinates__Group__6__Impl rule__FTRealCoordinates__Group__7 )
            // InternalFairtracksDsl.g:5742:2: rule__FTRealCoordinates__Group__6__Impl rule__FTRealCoordinates__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__FTRealCoordinates__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTRealCoordinates__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTRealCoordinates__Group__6"


    // $ANTLR start "rule__FTRealCoordinates__Group__6__Impl"
    // InternalFairtracksDsl.g:5749:1: rule__FTRealCoordinates__Group__6__Impl : ( ')' ) ;
    public final void rule__FTRealCoordinates__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5753:1: ( ( ')' ) )
            // InternalFairtracksDsl.g:5754:1: ( ')' )
            {
            // InternalFairtracksDsl.g:5754:1: ( ')' )
            // InternalFairtracksDsl.g:5755:2: ')'
            {
             before(grammarAccess.getFTRealCoordinatesAccess().getRightParenthesisKeyword_6()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getFTRealCoordinatesAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTRealCoordinates__Group__6__Impl"


    // $ANTLR start "rule__FTRealCoordinates__Group__7"
    // InternalFairtracksDsl.g:5764:1: rule__FTRealCoordinates__Group__7 : rule__FTRealCoordinates__Group__7__Impl rule__FTRealCoordinates__Group__8 ;
    public final void rule__FTRealCoordinates__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5768:1: ( rule__FTRealCoordinates__Group__7__Impl rule__FTRealCoordinates__Group__8 )
            // InternalFairtracksDsl.g:5769:2: rule__FTRealCoordinates__Group__7__Impl rule__FTRealCoordinates__Group__8
            {
            pushFollow(FOLLOW_37);
            rule__FTRealCoordinates__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTRealCoordinates__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTRealCoordinates__Group__7"


    // $ANTLR start "rule__FTRealCoordinates__Group__7__Impl"
    // InternalFairtracksDsl.g:5776:1: rule__FTRealCoordinates__Group__7__Impl : ( ';' ) ;
    public final void rule__FTRealCoordinates__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5780:1: ( ( ';' ) )
            // InternalFairtracksDsl.g:5781:1: ( ';' )
            {
            // InternalFairtracksDsl.g:5781:1: ( ';' )
            // InternalFairtracksDsl.g:5782:2: ';'
            {
             before(grammarAccess.getFTRealCoordinatesAccess().getSemicolonKeyword_7()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getFTRealCoordinatesAccess().getSemicolonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTRealCoordinates__Group__7__Impl"


    // $ANTLR start "rule__FTRealCoordinates__Group__8"
    // InternalFairtracksDsl.g:5791:1: rule__FTRealCoordinates__Group__8 : rule__FTRealCoordinates__Group__8__Impl rule__FTRealCoordinates__Group__9 ;
    public final void rule__FTRealCoordinates__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5795:1: ( rule__FTRealCoordinates__Group__8__Impl rule__FTRealCoordinates__Group__9 )
            // InternalFairtracksDsl.g:5796:2: rule__FTRealCoordinates__Group__8__Impl rule__FTRealCoordinates__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__FTRealCoordinates__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTRealCoordinates__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTRealCoordinates__Group__8"


    // $ANTLR start "rule__FTRealCoordinates__Group__8__Impl"
    // InternalFairtracksDsl.g:5803:1: rule__FTRealCoordinates__Group__8__Impl : ( 'Size' ) ;
    public final void rule__FTRealCoordinates__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5807:1: ( ( 'Size' ) )
            // InternalFairtracksDsl.g:5808:1: ( 'Size' )
            {
            // InternalFairtracksDsl.g:5808:1: ( 'Size' )
            // InternalFairtracksDsl.g:5809:2: 'Size'
            {
             before(grammarAccess.getFTRealCoordinatesAccess().getSizeKeyword_8()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getFTRealCoordinatesAccess().getSizeKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTRealCoordinates__Group__8__Impl"


    // $ANTLR start "rule__FTRealCoordinates__Group__9"
    // InternalFairtracksDsl.g:5818:1: rule__FTRealCoordinates__Group__9 : rule__FTRealCoordinates__Group__9__Impl rule__FTRealCoordinates__Group__10 ;
    public final void rule__FTRealCoordinates__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5822:1: ( rule__FTRealCoordinates__Group__9__Impl rule__FTRealCoordinates__Group__10 )
            // InternalFairtracksDsl.g:5823:2: rule__FTRealCoordinates__Group__9__Impl rule__FTRealCoordinates__Group__10
            {
            pushFollow(FOLLOW_34);
            rule__FTRealCoordinates__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTRealCoordinates__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTRealCoordinates__Group__9"


    // $ANTLR start "rule__FTRealCoordinates__Group__9__Impl"
    // InternalFairtracksDsl.g:5830:1: rule__FTRealCoordinates__Group__9__Impl : ( ':' ) ;
    public final void rule__FTRealCoordinates__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5834:1: ( ( ':' ) )
            // InternalFairtracksDsl.g:5835:1: ( ':' )
            {
            // InternalFairtracksDsl.g:5835:1: ( ':' )
            // InternalFairtracksDsl.g:5836:2: ':'
            {
             before(grammarAccess.getFTRealCoordinatesAccess().getColonKeyword_9()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getFTRealCoordinatesAccess().getColonKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTRealCoordinates__Group__9__Impl"


    // $ANTLR start "rule__FTRealCoordinates__Group__10"
    // InternalFairtracksDsl.g:5845:1: rule__FTRealCoordinates__Group__10 : rule__FTRealCoordinates__Group__10__Impl rule__FTRealCoordinates__Group__11 ;
    public final void rule__FTRealCoordinates__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5849:1: ( rule__FTRealCoordinates__Group__10__Impl rule__FTRealCoordinates__Group__11 )
            // InternalFairtracksDsl.g:5850:2: rule__FTRealCoordinates__Group__10__Impl rule__FTRealCoordinates__Group__11
            {
            pushFollow(FOLLOW_35);
            rule__FTRealCoordinates__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTRealCoordinates__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTRealCoordinates__Group__10"


    // $ANTLR start "rule__FTRealCoordinates__Group__10__Impl"
    // InternalFairtracksDsl.g:5857:1: rule__FTRealCoordinates__Group__10__Impl : ( '(' ) ;
    public final void rule__FTRealCoordinates__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5861:1: ( ( '(' ) )
            // InternalFairtracksDsl.g:5862:1: ( '(' )
            {
            // InternalFairtracksDsl.g:5862:1: ( '(' )
            // InternalFairtracksDsl.g:5863:2: '('
            {
             before(grammarAccess.getFTRealCoordinatesAccess().getLeftParenthesisKeyword_10()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getFTRealCoordinatesAccess().getLeftParenthesisKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTRealCoordinates__Group__10__Impl"


    // $ANTLR start "rule__FTRealCoordinates__Group__11"
    // InternalFairtracksDsl.g:5872:1: rule__FTRealCoordinates__Group__11 : rule__FTRealCoordinates__Group__11__Impl rule__FTRealCoordinates__Group__12 ;
    public final void rule__FTRealCoordinates__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5876:1: ( rule__FTRealCoordinates__Group__11__Impl rule__FTRealCoordinates__Group__12 )
            // InternalFairtracksDsl.g:5877:2: rule__FTRealCoordinates__Group__11__Impl rule__FTRealCoordinates__Group__12
            {
            pushFollow(FOLLOW_32);
            rule__FTRealCoordinates__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTRealCoordinates__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTRealCoordinates__Group__11"


    // $ANTLR start "rule__FTRealCoordinates__Group__11__Impl"
    // InternalFairtracksDsl.g:5884:1: rule__FTRealCoordinates__Group__11__Impl : ( ( rule__FTRealCoordinates__SizeXAssignment_11 ) ) ;
    public final void rule__FTRealCoordinates__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5888:1: ( ( ( rule__FTRealCoordinates__SizeXAssignment_11 ) ) )
            // InternalFairtracksDsl.g:5889:1: ( ( rule__FTRealCoordinates__SizeXAssignment_11 ) )
            {
            // InternalFairtracksDsl.g:5889:1: ( ( rule__FTRealCoordinates__SizeXAssignment_11 ) )
            // InternalFairtracksDsl.g:5890:2: ( rule__FTRealCoordinates__SizeXAssignment_11 )
            {
             before(grammarAccess.getFTRealCoordinatesAccess().getSizeXAssignment_11()); 
            // InternalFairtracksDsl.g:5891:2: ( rule__FTRealCoordinates__SizeXAssignment_11 )
            // InternalFairtracksDsl.g:5891:3: rule__FTRealCoordinates__SizeXAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__FTRealCoordinates__SizeXAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getFTRealCoordinatesAccess().getSizeXAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTRealCoordinates__Group__11__Impl"


    // $ANTLR start "rule__FTRealCoordinates__Group__12"
    // InternalFairtracksDsl.g:5899:1: rule__FTRealCoordinates__Group__12 : rule__FTRealCoordinates__Group__12__Impl rule__FTRealCoordinates__Group__13 ;
    public final void rule__FTRealCoordinates__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5903:1: ( rule__FTRealCoordinates__Group__12__Impl rule__FTRealCoordinates__Group__13 )
            // InternalFairtracksDsl.g:5904:2: rule__FTRealCoordinates__Group__12__Impl rule__FTRealCoordinates__Group__13
            {
            pushFollow(FOLLOW_35);
            rule__FTRealCoordinates__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTRealCoordinates__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTRealCoordinates__Group__12"


    // $ANTLR start "rule__FTRealCoordinates__Group__12__Impl"
    // InternalFairtracksDsl.g:5911:1: rule__FTRealCoordinates__Group__12__Impl : ( ',' ) ;
    public final void rule__FTRealCoordinates__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5915:1: ( ( ',' ) )
            // InternalFairtracksDsl.g:5916:1: ( ',' )
            {
            // InternalFairtracksDsl.g:5916:1: ( ',' )
            // InternalFairtracksDsl.g:5917:2: ','
            {
             before(grammarAccess.getFTRealCoordinatesAccess().getCommaKeyword_12()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getFTRealCoordinatesAccess().getCommaKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTRealCoordinates__Group__12__Impl"


    // $ANTLR start "rule__FTRealCoordinates__Group__13"
    // InternalFairtracksDsl.g:5926:1: rule__FTRealCoordinates__Group__13 : rule__FTRealCoordinates__Group__13__Impl rule__FTRealCoordinates__Group__14 ;
    public final void rule__FTRealCoordinates__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5930:1: ( rule__FTRealCoordinates__Group__13__Impl rule__FTRealCoordinates__Group__14 )
            // InternalFairtracksDsl.g:5931:2: rule__FTRealCoordinates__Group__13__Impl rule__FTRealCoordinates__Group__14
            {
            pushFollow(FOLLOW_36);
            rule__FTRealCoordinates__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTRealCoordinates__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTRealCoordinates__Group__13"


    // $ANTLR start "rule__FTRealCoordinates__Group__13__Impl"
    // InternalFairtracksDsl.g:5938:1: rule__FTRealCoordinates__Group__13__Impl : ( ( rule__FTRealCoordinates__SizeYAssignment_13 ) ) ;
    public final void rule__FTRealCoordinates__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5942:1: ( ( ( rule__FTRealCoordinates__SizeYAssignment_13 ) ) )
            // InternalFairtracksDsl.g:5943:1: ( ( rule__FTRealCoordinates__SizeYAssignment_13 ) )
            {
            // InternalFairtracksDsl.g:5943:1: ( ( rule__FTRealCoordinates__SizeYAssignment_13 ) )
            // InternalFairtracksDsl.g:5944:2: ( rule__FTRealCoordinates__SizeYAssignment_13 )
            {
             before(grammarAccess.getFTRealCoordinatesAccess().getSizeYAssignment_13()); 
            // InternalFairtracksDsl.g:5945:2: ( rule__FTRealCoordinates__SizeYAssignment_13 )
            // InternalFairtracksDsl.g:5945:3: rule__FTRealCoordinates__SizeYAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__FTRealCoordinates__SizeYAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getFTRealCoordinatesAccess().getSizeYAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTRealCoordinates__Group__13__Impl"


    // $ANTLR start "rule__FTRealCoordinates__Group__14"
    // InternalFairtracksDsl.g:5953:1: rule__FTRealCoordinates__Group__14 : rule__FTRealCoordinates__Group__14__Impl rule__FTRealCoordinates__Group__15 ;
    public final void rule__FTRealCoordinates__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5957:1: ( rule__FTRealCoordinates__Group__14__Impl rule__FTRealCoordinates__Group__15 )
            // InternalFairtracksDsl.g:5958:2: rule__FTRealCoordinates__Group__14__Impl rule__FTRealCoordinates__Group__15
            {
            pushFollow(FOLLOW_11);
            rule__FTRealCoordinates__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTRealCoordinates__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTRealCoordinates__Group__14"


    // $ANTLR start "rule__FTRealCoordinates__Group__14__Impl"
    // InternalFairtracksDsl.g:5965:1: rule__FTRealCoordinates__Group__14__Impl : ( ')' ) ;
    public final void rule__FTRealCoordinates__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5969:1: ( ( ')' ) )
            // InternalFairtracksDsl.g:5970:1: ( ')' )
            {
            // InternalFairtracksDsl.g:5970:1: ( ')' )
            // InternalFairtracksDsl.g:5971:2: ')'
            {
             before(grammarAccess.getFTRealCoordinatesAccess().getRightParenthesisKeyword_14()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getFTRealCoordinatesAccess().getRightParenthesisKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTRealCoordinates__Group__14__Impl"


    // $ANTLR start "rule__FTRealCoordinates__Group__15"
    // InternalFairtracksDsl.g:5980:1: rule__FTRealCoordinates__Group__15 : rule__FTRealCoordinates__Group__15__Impl ;
    public final void rule__FTRealCoordinates__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5984:1: ( rule__FTRealCoordinates__Group__15__Impl )
            // InternalFairtracksDsl.g:5985:2: rule__FTRealCoordinates__Group__15__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FTRealCoordinates__Group__15__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTRealCoordinates__Group__15"


    // $ANTLR start "rule__FTRealCoordinates__Group__15__Impl"
    // InternalFairtracksDsl.g:5991:1: rule__FTRealCoordinates__Group__15__Impl : ( ';' ) ;
    public final void rule__FTRealCoordinates__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:5995:1: ( ( ';' ) )
            // InternalFairtracksDsl.g:5996:1: ( ';' )
            {
            // InternalFairtracksDsl.g:5996:1: ( ';' )
            // InternalFairtracksDsl.g:5997:2: ';'
            {
             before(grammarAccess.getFTRealCoordinatesAccess().getSemicolonKeyword_15()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getFTRealCoordinatesAccess().getSemicolonKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTRealCoordinates__Group__15__Impl"


    // $ANTLR start "rule__FTDistance__Group__0"
    // InternalFairtracksDsl.g:6007:1: rule__FTDistance__Group__0 : rule__FTDistance__Group__0__Impl rule__FTDistance__Group__1 ;
    public final void rule__FTDistance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6011:1: ( rule__FTDistance__Group__0__Impl rule__FTDistance__Group__1 )
            // InternalFairtracksDsl.g:6012:2: rule__FTDistance__Group__0__Impl rule__FTDistance__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__FTDistance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTDistance__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTDistance__Group__0"


    // $ANTLR start "rule__FTDistance__Group__0__Impl"
    // InternalFairtracksDsl.g:6019:1: rule__FTDistance__Group__0__Impl : ( 'is' ) ;
    public final void rule__FTDistance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6023:1: ( ( 'is' ) )
            // InternalFairtracksDsl.g:6024:1: ( 'is' )
            {
            // InternalFairtracksDsl.g:6024:1: ( 'is' )
            // InternalFairtracksDsl.g:6025:2: 'is'
            {
             before(grammarAccess.getFTDistanceAccess().getIsKeyword_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getFTDistanceAccess().getIsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTDistance__Group__0__Impl"


    // $ANTLR start "rule__FTDistance__Group__1"
    // InternalFairtracksDsl.g:6034:1: rule__FTDistance__Group__1 : rule__FTDistance__Group__1__Impl rule__FTDistance__Group__2 ;
    public final void rule__FTDistance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6038:1: ( rule__FTDistance__Group__1__Impl rule__FTDistance__Group__2 )
            // InternalFairtracksDsl.g:6039:2: rule__FTDistance__Group__1__Impl rule__FTDistance__Group__2
            {
            pushFollow(FOLLOW_39);
            rule__FTDistance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTDistance__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTDistance__Group__1"


    // $ANTLR start "rule__FTDistance__Group__1__Impl"
    // InternalFairtracksDsl.g:6046:1: rule__FTDistance__Group__1__Impl : ( ( rule__FTDistance__DistanceAssignment_1 ) ) ;
    public final void rule__FTDistance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6050:1: ( ( ( rule__FTDistance__DistanceAssignment_1 ) ) )
            // InternalFairtracksDsl.g:6051:1: ( ( rule__FTDistance__DistanceAssignment_1 ) )
            {
            // InternalFairtracksDsl.g:6051:1: ( ( rule__FTDistance__DistanceAssignment_1 ) )
            // InternalFairtracksDsl.g:6052:2: ( rule__FTDistance__DistanceAssignment_1 )
            {
             before(grammarAccess.getFTDistanceAccess().getDistanceAssignment_1()); 
            // InternalFairtracksDsl.g:6053:2: ( rule__FTDistance__DistanceAssignment_1 )
            // InternalFairtracksDsl.g:6053:3: rule__FTDistance__DistanceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FTDistance__DistanceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFTDistanceAccess().getDistanceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTDistance__Group__1__Impl"


    // $ANTLR start "rule__FTDistance__Group__2"
    // InternalFairtracksDsl.g:6061:1: rule__FTDistance__Group__2 : rule__FTDistance__Group__2__Impl rule__FTDistance__Group__3 ;
    public final void rule__FTDistance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6065:1: ( rule__FTDistance__Group__2__Impl rule__FTDistance__Group__3 )
            // InternalFairtracksDsl.g:6066:2: rule__FTDistance__Group__2__Impl rule__FTDistance__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__FTDistance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTDistance__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTDistance__Group__2"


    // $ANTLR start "rule__FTDistance__Group__2__Impl"
    // InternalFairtracksDsl.g:6073:1: rule__FTDistance__Group__2__Impl : ( 'object' ) ;
    public final void rule__FTDistance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6077:1: ( ( 'object' ) )
            // InternalFairtracksDsl.g:6078:1: ( 'object' )
            {
            // InternalFairtracksDsl.g:6078:1: ( 'object' )
            // InternalFairtracksDsl.g:6079:2: 'object'
            {
             before(grammarAccess.getFTDistanceAccess().getObjectKeyword_2()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getFTDistanceAccess().getObjectKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTDistance__Group__2__Impl"


    // $ANTLR start "rule__FTDistance__Group__3"
    // InternalFairtracksDsl.g:6088:1: rule__FTDistance__Group__3 : rule__FTDistance__Group__3__Impl ;
    public final void rule__FTDistance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6092:1: ( rule__FTDistance__Group__3__Impl )
            // InternalFairtracksDsl.g:6093:2: rule__FTDistance__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FTDistance__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTDistance__Group__3"


    // $ANTLR start "rule__FTDistance__Group__3__Impl"
    // InternalFairtracksDsl.g:6099:1: rule__FTDistance__Group__3__Impl : ( ( rule__FTDistance__ToObjectAssignment_3 ) ) ;
    public final void rule__FTDistance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6103:1: ( ( ( rule__FTDistance__ToObjectAssignment_3 ) ) )
            // InternalFairtracksDsl.g:6104:1: ( ( rule__FTDistance__ToObjectAssignment_3 ) )
            {
            // InternalFairtracksDsl.g:6104:1: ( ( rule__FTDistance__ToObjectAssignment_3 ) )
            // InternalFairtracksDsl.g:6105:2: ( rule__FTDistance__ToObjectAssignment_3 )
            {
             before(grammarAccess.getFTDistanceAccess().getToObjectAssignment_3()); 
            // InternalFairtracksDsl.g:6106:2: ( rule__FTDistance__ToObjectAssignment_3 )
            // InternalFairtracksDsl.g:6106:3: rule__FTDistance__ToObjectAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__FTDistance__ToObjectAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFTDistanceAccess().getToObjectAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTDistance__Group__3__Impl"


    // $ANTLR start "rule__FTState__Group__0"
    // InternalFairtracksDsl.g:6115:1: rule__FTState__Group__0 : rule__FTState__Group__0__Impl rule__FTState__Group__1 ;
    public final void rule__FTState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6119:1: ( rule__FTState__Group__0__Impl rule__FTState__Group__1 )
            // InternalFairtracksDsl.g:6120:2: rule__FTState__Group__0__Impl rule__FTState__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__FTState__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTState__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTState__Group__0"


    // $ANTLR start "rule__FTState__Group__0__Impl"
    // InternalFairtracksDsl.g:6127:1: rule__FTState__Group__0__Impl : ( 'State' ) ;
    public final void rule__FTState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6131:1: ( ( 'State' ) )
            // InternalFairtracksDsl.g:6132:1: ( 'State' )
            {
            // InternalFairtracksDsl.g:6132:1: ( 'State' )
            // InternalFairtracksDsl.g:6133:2: 'State'
            {
             before(grammarAccess.getFTStateAccess().getStateKeyword_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getFTStateAccess().getStateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTState__Group__0__Impl"


    // $ANTLR start "rule__FTState__Group__1"
    // InternalFairtracksDsl.g:6142:1: rule__FTState__Group__1 : rule__FTState__Group__1__Impl rule__FTState__Group__2 ;
    public final void rule__FTState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6146:1: ( rule__FTState__Group__1__Impl rule__FTState__Group__2 )
            // InternalFairtracksDsl.g:6147:2: rule__FTState__Group__1__Impl rule__FTState__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__FTState__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTState__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTState__Group__1"


    // $ANTLR start "rule__FTState__Group__1__Impl"
    // InternalFairtracksDsl.g:6154:1: rule__FTState__Group__1__Impl : ( '=' ) ;
    public final void rule__FTState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6158:1: ( ( '=' ) )
            // InternalFairtracksDsl.g:6159:1: ( '=' )
            {
            // InternalFairtracksDsl.g:6159:1: ( '=' )
            // InternalFairtracksDsl.g:6160:2: '='
            {
             before(grammarAccess.getFTStateAccess().getEqualsSignKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getFTStateAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTState__Group__1__Impl"


    // $ANTLR start "rule__FTState__Group__2"
    // InternalFairtracksDsl.g:6169:1: rule__FTState__Group__2 : rule__FTState__Group__2__Impl rule__FTState__Group__3 ;
    public final void rule__FTState__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6173:1: ( rule__FTState__Group__2__Impl rule__FTState__Group__3 )
            // InternalFairtracksDsl.g:6174:2: rule__FTState__Group__2__Impl rule__FTState__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__FTState__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTState__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTState__Group__2"


    // $ANTLR start "rule__FTState__Group__2__Impl"
    // InternalFairtracksDsl.g:6181:1: rule__FTState__Group__2__Impl : ( '[' ) ;
    public final void rule__FTState__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6185:1: ( ( '[' ) )
            // InternalFairtracksDsl.g:6186:1: ( '[' )
            {
            // InternalFairtracksDsl.g:6186:1: ( '[' )
            // InternalFairtracksDsl.g:6187:2: '['
            {
             before(grammarAccess.getFTStateAccess().getLeftSquareBracketKeyword_2()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getFTStateAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTState__Group__2__Impl"


    // $ANTLR start "rule__FTState__Group__3"
    // InternalFairtracksDsl.g:6196:1: rule__FTState__Group__3 : rule__FTState__Group__3__Impl rule__FTState__Group__4 ;
    public final void rule__FTState__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6200:1: ( rule__FTState__Group__3__Impl rule__FTState__Group__4 )
            // InternalFairtracksDsl.g:6201:2: rule__FTState__Group__3__Impl rule__FTState__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__FTState__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTState__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTState__Group__3"


    // $ANTLR start "rule__FTState__Group__3__Impl"
    // InternalFairtracksDsl.g:6208:1: rule__FTState__Group__3__Impl : ( 'name' ) ;
    public final void rule__FTState__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6212:1: ( ( 'name' ) )
            // InternalFairtracksDsl.g:6213:1: ( 'name' )
            {
            // InternalFairtracksDsl.g:6213:1: ( 'name' )
            // InternalFairtracksDsl.g:6214:2: 'name'
            {
             before(grammarAccess.getFTStateAccess().getNameKeyword_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getFTStateAccess().getNameKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTState__Group__3__Impl"


    // $ANTLR start "rule__FTState__Group__4"
    // InternalFairtracksDsl.g:6223:1: rule__FTState__Group__4 : rule__FTState__Group__4__Impl rule__FTState__Group__5 ;
    public final void rule__FTState__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6227:1: ( rule__FTState__Group__4__Impl rule__FTState__Group__5 )
            // InternalFairtracksDsl.g:6228:2: rule__FTState__Group__4__Impl rule__FTState__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__FTState__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTState__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTState__Group__4"


    // $ANTLR start "rule__FTState__Group__4__Impl"
    // InternalFairtracksDsl.g:6235:1: rule__FTState__Group__4__Impl : ( ':' ) ;
    public final void rule__FTState__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6239:1: ( ( ':' ) )
            // InternalFairtracksDsl.g:6240:1: ( ':' )
            {
            // InternalFairtracksDsl.g:6240:1: ( ':' )
            // InternalFairtracksDsl.g:6241:2: ':'
            {
             before(grammarAccess.getFTStateAccess().getColonKeyword_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getFTStateAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTState__Group__4__Impl"


    // $ANTLR start "rule__FTState__Group__5"
    // InternalFairtracksDsl.g:6250:1: rule__FTState__Group__5 : rule__FTState__Group__5__Impl rule__FTState__Group__6 ;
    public final void rule__FTState__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6254:1: ( rule__FTState__Group__5__Impl rule__FTState__Group__6 )
            // InternalFairtracksDsl.g:6255:2: rule__FTState__Group__5__Impl rule__FTState__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__FTState__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTState__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTState__Group__5"


    // $ANTLR start "rule__FTState__Group__5__Impl"
    // InternalFairtracksDsl.g:6262:1: rule__FTState__Group__5__Impl : ( ( rule__FTState__NameAssignment_5 ) ) ;
    public final void rule__FTState__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6266:1: ( ( ( rule__FTState__NameAssignment_5 ) ) )
            // InternalFairtracksDsl.g:6267:1: ( ( rule__FTState__NameAssignment_5 ) )
            {
            // InternalFairtracksDsl.g:6267:1: ( ( rule__FTState__NameAssignment_5 ) )
            // InternalFairtracksDsl.g:6268:2: ( rule__FTState__NameAssignment_5 )
            {
             before(grammarAccess.getFTStateAccess().getNameAssignment_5()); 
            // InternalFairtracksDsl.g:6269:2: ( rule__FTState__NameAssignment_5 )
            // InternalFairtracksDsl.g:6269:3: rule__FTState__NameAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__FTState__NameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getFTStateAccess().getNameAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTState__Group__5__Impl"


    // $ANTLR start "rule__FTState__Group__6"
    // InternalFairtracksDsl.g:6277:1: rule__FTState__Group__6 : rule__FTState__Group__6__Impl rule__FTState__Group__7 ;
    public final void rule__FTState__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6281:1: ( rule__FTState__Group__6__Impl rule__FTState__Group__7 )
            // InternalFairtracksDsl.g:6282:2: rule__FTState__Group__6__Impl rule__FTState__Group__7
            {
            pushFollow(FOLLOW_40);
            rule__FTState__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTState__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTState__Group__6"


    // $ANTLR start "rule__FTState__Group__6__Impl"
    // InternalFairtracksDsl.g:6289:1: rule__FTState__Group__6__Impl : ( ';' ) ;
    public final void rule__FTState__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6293:1: ( ( ';' ) )
            // InternalFairtracksDsl.g:6294:1: ( ';' )
            {
            // InternalFairtracksDsl.g:6294:1: ( ';' )
            // InternalFairtracksDsl.g:6295:2: ';'
            {
             before(grammarAccess.getFTStateAccess().getSemicolonKeyword_6()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getFTStateAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTState__Group__6__Impl"


    // $ANTLR start "rule__FTState__Group__7"
    // InternalFairtracksDsl.g:6304:1: rule__FTState__Group__7 : rule__FTState__Group__7__Impl rule__FTState__Group__8 ;
    public final void rule__FTState__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6308:1: ( rule__FTState__Group__7__Impl rule__FTState__Group__8 )
            // InternalFairtracksDsl.g:6309:2: rule__FTState__Group__7__Impl rule__FTState__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__FTState__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTState__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTState__Group__7"


    // $ANTLR start "rule__FTState__Group__7__Impl"
    // InternalFairtracksDsl.g:6316:1: rule__FTState__Group__7__Impl : ( 'position' ) ;
    public final void rule__FTState__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6320:1: ( ( 'position' ) )
            // InternalFairtracksDsl.g:6321:1: ( 'position' )
            {
            // InternalFairtracksDsl.g:6321:1: ( 'position' )
            // InternalFairtracksDsl.g:6322:2: 'position'
            {
             before(grammarAccess.getFTStateAccess().getPositionKeyword_7()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getFTStateAccess().getPositionKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTState__Group__7__Impl"


    // $ANTLR start "rule__FTState__Group__8"
    // InternalFairtracksDsl.g:6331:1: rule__FTState__Group__8 : rule__FTState__Group__8__Impl rule__FTState__Group__9 ;
    public final void rule__FTState__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6335:1: ( rule__FTState__Group__8__Impl rule__FTState__Group__9 )
            // InternalFairtracksDsl.g:6336:2: rule__FTState__Group__8__Impl rule__FTState__Group__9
            {
            pushFollow(FOLLOW_34);
            rule__FTState__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTState__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTState__Group__8"


    // $ANTLR start "rule__FTState__Group__8__Impl"
    // InternalFairtracksDsl.g:6343:1: rule__FTState__Group__8__Impl : ( ':' ) ;
    public final void rule__FTState__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6347:1: ( ( ':' ) )
            // InternalFairtracksDsl.g:6348:1: ( ':' )
            {
            // InternalFairtracksDsl.g:6348:1: ( ':' )
            // InternalFairtracksDsl.g:6349:2: ':'
            {
             before(grammarAccess.getFTStateAccess().getColonKeyword_8()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getFTStateAccess().getColonKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTState__Group__8__Impl"


    // $ANTLR start "rule__FTState__Group__9"
    // InternalFairtracksDsl.g:6358:1: rule__FTState__Group__9 : rule__FTState__Group__9__Impl rule__FTState__Group__10 ;
    public final void rule__FTState__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6362:1: ( rule__FTState__Group__9__Impl rule__FTState__Group__10 )
            // InternalFairtracksDsl.g:6363:2: rule__FTState__Group__9__Impl rule__FTState__Group__10
            {
            pushFollow(FOLLOW_35);
            rule__FTState__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTState__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTState__Group__9"


    // $ANTLR start "rule__FTState__Group__9__Impl"
    // InternalFairtracksDsl.g:6370:1: rule__FTState__Group__9__Impl : ( '(' ) ;
    public final void rule__FTState__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6374:1: ( ( '(' ) )
            // InternalFairtracksDsl.g:6375:1: ( '(' )
            {
            // InternalFairtracksDsl.g:6375:1: ( '(' )
            // InternalFairtracksDsl.g:6376:2: '('
            {
             before(grammarAccess.getFTStateAccess().getLeftParenthesisKeyword_9()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getFTStateAccess().getLeftParenthesisKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTState__Group__9__Impl"


    // $ANTLR start "rule__FTState__Group__10"
    // InternalFairtracksDsl.g:6385:1: rule__FTState__Group__10 : rule__FTState__Group__10__Impl rule__FTState__Group__11 ;
    public final void rule__FTState__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6389:1: ( rule__FTState__Group__10__Impl rule__FTState__Group__11 )
            // InternalFairtracksDsl.g:6390:2: rule__FTState__Group__10__Impl rule__FTState__Group__11
            {
            pushFollow(FOLLOW_32);
            rule__FTState__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTState__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTState__Group__10"


    // $ANTLR start "rule__FTState__Group__10__Impl"
    // InternalFairtracksDsl.g:6397:1: rule__FTState__Group__10__Impl : ( ( rule__FTState__PosXAssignment_10 ) ) ;
    public final void rule__FTState__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6401:1: ( ( ( rule__FTState__PosXAssignment_10 ) ) )
            // InternalFairtracksDsl.g:6402:1: ( ( rule__FTState__PosXAssignment_10 ) )
            {
            // InternalFairtracksDsl.g:6402:1: ( ( rule__FTState__PosXAssignment_10 ) )
            // InternalFairtracksDsl.g:6403:2: ( rule__FTState__PosXAssignment_10 )
            {
             before(grammarAccess.getFTStateAccess().getPosXAssignment_10()); 
            // InternalFairtracksDsl.g:6404:2: ( rule__FTState__PosXAssignment_10 )
            // InternalFairtracksDsl.g:6404:3: rule__FTState__PosXAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__FTState__PosXAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getFTStateAccess().getPosXAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTState__Group__10__Impl"


    // $ANTLR start "rule__FTState__Group__11"
    // InternalFairtracksDsl.g:6412:1: rule__FTState__Group__11 : rule__FTState__Group__11__Impl rule__FTState__Group__12 ;
    public final void rule__FTState__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6416:1: ( rule__FTState__Group__11__Impl rule__FTState__Group__12 )
            // InternalFairtracksDsl.g:6417:2: rule__FTState__Group__11__Impl rule__FTState__Group__12
            {
            pushFollow(FOLLOW_35);
            rule__FTState__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTState__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTState__Group__11"


    // $ANTLR start "rule__FTState__Group__11__Impl"
    // InternalFairtracksDsl.g:6424:1: rule__FTState__Group__11__Impl : ( ',' ) ;
    public final void rule__FTState__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6428:1: ( ( ',' ) )
            // InternalFairtracksDsl.g:6429:1: ( ',' )
            {
            // InternalFairtracksDsl.g:6429:1: ( ',' )
            // InternalFairtracksDsl.g:6430:2: ','
            {
             before(grammarAccess.getFTStateAccess().getCommaKeyword_11()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getFTStateAccess().getCommaKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTState__Group__11__Impl"


    // $ANTLR start "rule__FTState__Group__12"
    // InternalFairtracksDsl.g:6439:1: rule__FTState__Group__12 : rule__FTState__Group__12__Impl rule__FTState__Group__13 ;
    public final void rule__FTState__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6443:1: ( rule__FTState__Group__12__Impl rule__FTState__Group__13 )
            // InternalFairtracksDsl.g:6444:2: rule__FTState__Group__12__Impl rule__FTState__Group__13
            {
            pushFollow(FOLLOW_36);
            rule__FTState__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTState__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTState__Group__12"


    // $ANTLR start "rule__FTState__Group__12__Impl"
    // InternalFairtracksDsl.g:6451:1: rule__FTState__Group__12__Impl : ( ( rule__FTState__PosYAssignment_12 ) ) ;
    public final void rule__FTState__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6455:1: ( ( ( rule__FTState__PosYAssignment_12 ) ) )
            // InternalFairtracksDsl.g:6456:1: ( ( rule__FTState__PosYAssignment_12 ) )
            {
            // InternalFairtracksDsl.g:6456:1: ( ( rule__FTState__PosYAssignment_12 ) )
            // InternalFairtracksDsl.g:6457:2: ( rule__FTState__PosYAssignment_12 )
            {
             before(grammarAccess.getFTStateAccess().getPosYAssignment_12()); 
            // InternalFairtracksDsl.g:6458:2: ( rule__FTState__PosYAssignment_12 )
            // InternalFairtracksDsl.g:6458:3: rule__FTState__PosYAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__FTState__PosYAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getFTStateAccess().getPosYAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTState__Group__12__Impl"


    // $ANTLR start "rule__FTState__Group__13"
    // InternalFairtracksDsl.g:6466:1: rule__FTState__Group__13 : rule__FTState__Group__13__Impl rule__FTState__Group__14 ;
    public final void rule__FTState__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6470:1: ( rule__FTState__Group__13__Impl rule__FTState__Group__14 )
            // InternalFairtracksDsl.g:6471:2: rule__FTState__Group__13__Impl rule__FTState__Group__14
            {
            pushFollow(FOLLOW_11);
            rule__FTState__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTState__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTState__Group__13"


    // $ANTLR start "rule__FTState__Group__13__Impl"
    // InternalFairtracksDsl.g:6478:1: rule__FTState__Group__13__Impl : ( ')' ) ;
    public final void rule__FTState__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6482:1: ( ( ')' ) )
            // InternalFairtracksDsl.g:6483:1: ( ')' )
            {
            // InternalFairtracksDsl.g:6483:1: ( ')' )
            // InternalFairtracksDsl.g:6484:2: ')'
            {
             before(grammarAccess.getFTStateAccess().getRightParenthesisKeyword_13()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getFTStateAccess().getRightParenthesisKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTState__Group__13__Impl"


    // $ANTLR start "rule__FTState__Group__14"
    // InternalFairtracksDsl.g:6493:1: rule__FTState__Group__14 : rule__FTState__Group__14__Impl rule__FTState__Group__15 ;
    public final void rule__FTState__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6497:1: ( rule__FTState__Group__14__Impl rule__FTState__Group__15 )
            // InternalFairtracksDsl.g:6498:2: rule__FTState__Group__14__Impl rule__FTState__Group__15
            {
            pushFollow(FOLLOW_41);
            rule__FTState__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTState__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTState__Group__14"


    // $ANTLR start "rule__FTState__Group__14__Impl"
    // InternalFairtracksDsl.g:6505:1: rule__FTState__Group__14__Impl : ( ';' ) ;
    public final void rule__FTState__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6509:1: ( ( ';' ) )
            // InternalFairtracksDsl.g:6510:1: ( ';' )
            {
            // InternalFairtracksDsl.g:6510:1: ( ';' )
            // InternalFairtracksDsl.g:6511:2: ';'
            {
             before(grammarAccess.getFTStateAccess().getSemicolonKeyword_14()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getFTStateAccess().getSemicolonKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTState__Group__14__Impl"


    // $ANTLR start "rule__FTState__Group__15"
    // InternalFairtracksDsl.g:6520:1: rule__FTState__Group__15 : rule__FTState__Group__15__Impl rule__FTState__Group__16 ;
    public final void rule__FTState__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6524:1: ( rule__FTState__Group__15__Impl rule__FTState__Group__16 )
            // InternalFairtracksDsl.g:6525:2: rule__FTState__Group__15__Impl rule__FTState__Group__16
            {
            pushFollow(FOLLOW_41);
            rule__FTState__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTState__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTState__Group__15"


    // $ANTLR start "rule__FTState__Group__15__Impl"
    // InternalFairtracksDsl.g:6532:1: rule__FTState__Group__15__Impl : ( ( rule__FTState__ObservationsAssignment_15 )* ) ;
    public final void rule__FTState__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6536:1: ( ( ( rule__FTState__ObservationsAssignment_15 )* ) )
            // InternalFairtracksDsl.g:6537:1: ( ( rule__FTState__ObservationsAssignment_15 )* )
            {
            // InternalFairtracksDsl.g:6537:1: ( ( rule__FTState__ObservationsAssignment_15 )* )
            // InternalFairtracksDsl.g:6538:2: ( rule__FTState__ObservationsAssignment_15 )*
            {
             before(grammarAccess.getFTStateAccess().getObservationsAssignment_15()); 
            // InternalFairtracksDsl.g:6539:2: ( rule__FTState__ObservationsAssignment_15 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=70 && LA34_0<=73)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalFairtracksDsl.g:6539:3: rule__FTState__ObservationsAssignment_15
            	    {
            	    pushFollow(FOLLOW_42);
            	    rule__FTState__ObservationsAssignment_15();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getFTStateAccess().getObservationsAssignment_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTState__Group__15__Impl"


    // $ANTLR start "rule__FTState__Group__16"
    // InternalFairtracksDsl.g:6547:1: rule__FTState__Group__16 : rule__FTState__Group__16__Impl rule__FTState__Group__17 ;
    public final void rule__FTState__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6551:1: ( rule__FTState__Group__16__Impl rule__FTState__Group__17 )
            // InternalFairtracksDsl.g:6552:2: rule__FTState__Group__16__Impl rule__FTState__Group__17
            {
            pushFollow(FOLLOW_41);
            rule__FTState__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTState__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTState__Group__16"


    // $ANTLR start "rule__FTState__Group__16__Impl"
    // InternalFairtracksDsl.g:6559:1: rule__FTState__Group__16__Impl : ( ( rule__FTState__Group_16__0 )? ) ;
    public final void rule__FTState__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6563:1: ( ( ( rule__FTState__Group_16__0 )? ) )
            // InternalFairtracksDsl.g:6564:1: ( ( rule__FTState__Group_16__0 )? )
            {
            // InternalFairtracksDsl.g:6564:1: ( ( rule__FTState__Group_16__0 )? )
            // InternalFairtracksDsl.g:6565:2: ( rule__FTState__Group_16__0 )?
            {
             before(grammarAccess.getFTStateAccess().getGroup_16()); 
            // InternalFairtracksDsl.g:6566:2: ( rule__FTState__Group_16__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==69) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalFairtracksDsl.g:6566:3: rule__FTState__Group_16__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FTState__Group_16__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFTStateAccess().getGroup_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTState__Group__16__Impl"


    // $ANTLR start "rule__FTState__Group__17"
    // InternalFairtracksDsl.g:6574:1: rule__FTState__Group__17 : rule__FTState__Group__17__Impl ;
    public final void rule__FTState__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6578:1: ( rule__FTState__Group__17__Impl )
            // InternalFairtracksDsl.g:6579:2: rule__FTState__Group__17__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FTState__Group__17__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTState__Group__17"


    // $ANTLR start "rule__FTState__Group__17__Impl"
    // InternalFairtracksDsl.g:6585:1: rule__FTState__Group__17__Impl : ( ']' ) ;
    public final void rule__FTState__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6589:1: ( ( ']' ) )
            // InternalFairtracksDsl.g:6590:1: ( ']' )
            {
            // InternalFairtracksDsl.g:6590:1: ( ']' )
            // InternalFairtracksDsl.g:6591:2: ']'
            {
             before(grammarAccess.getFTStateAccess().getRightSquareBracketKeyword_17()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getFTStateAccess().getRightSquareBracketKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTState__Group__17__Impl"


    // $ANTLR start "rule__FTState__Group_16__0"
    // InternalFairtracksDsl.g:6601:1: rule__FTState__Group_16__0 : rule__FTState__Group_16__0__Impl rule__FTState__Group_16__1 ;
    public final void rule__FTState__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6605:1: ( rule__FTState__Group_16__0__Impl rule__FTState__Group_16__1 )
            // InternalFairtracksDsl.g:6606:2: rule__FTState__Group_16__0__Impl rule__FTState__Group_16__1
            {
            pushFollow(FOLLOW_9);
            rule__FTState__Group_16__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTState__Group_16__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTState__Group_16__0"


    // $ANTLR start "rule__FTState__Group_16__0__Impl"
    // InternalFairtracksDsl.g:6613:1: rule__FTState__Group_16__0__Impl : ( 'nextState' ) ;
    public final void rule__FTState__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6617:1: ( ( 'nextState' ) )
            // InternalFairtracksDsl.g:6618:1: ( 'nextState' )
            {
            // InternalFairtracksDsl.g:6618:1: ( 'nextState' )
            // InternalFairtracksDsl.g:6619:2: 'nextState'
            {
             before(grammarAccess.getFTStateAccess().getNextStateKeyword_16_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getFTStateAccess().getNextStateKeyword_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTState__Group_16__0__Impl"


    // $ANTLR start "rule__FTState__Group_16__1"
    // InternalFairtracksDsl.g:6628:1: rule__FTState__Group_16__1 : rule__FTState__Group_16__1__Impl rule__FTState__Group_16__2 ;
    public final void rule__FTState__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6632:1: ( rule__FTState__Group_16__1__Impl rule__FTState__Group_16__2 )
            // InternalFairtracksDsl.g:6633:2: rule__FTState__Group_16__1__Impl rule__FTState__Group_16__2
            {
            pushFollow(FOLLOW_10);
            rule__FTState__Group_16__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTState__Group_16__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTState__Group_16__1"


    // $ANTLR start "rule__FTState__Group_16__1__Impl"
    // InternalFairtracksDsl.g:6640:1: rule__FTState__Group_16__1__Impl : ( ':' ) ;
    public final void rule__FTState__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6644:1: ( ( ':' ) )
            // InternalFairtracksDsl.g:6645:1: ( ':' )
            {
            // InternalFairtracksDsl.g:6645:1: ( ':' )
            // InternalFairtracksDsl.g:6646:2: ':'
            {
             before(grammarAccess.getFTStateAccess().getColonKeyword_16_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getFTStateAccess().getColonKeyword_16_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTState__Group_16__1__Impl"


    // $ANTLR start "rule__FTState__Group_16__2"
    // InternalFairtracksDsl.g:6655:1: rule__FTState__Group_16__2 : rule__FTState__Group_16__2__Impl rule__FTState__Group_16__3 ;
    public final void rule__FTState__Group_16__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6659:1: ( rule__FTState__Group_16__2__Impl rule__FTState__Group_16__3 )
            // InternalFairtracksDsl.g:6660:2: rule__FTState__Group_16__2__Impl rule__FTState__Group_16__3
            {
            pushFollow(FOLLOW_11);
            rule__FTState__Group_16__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTState__Group_16__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTState__Group_16__2"


    // $ANTLR start "rule__FTState__Group_16__2__Impl"
    // InternalFairtracksDsl.g:6667:1: rule__FTState__Group_16__2__Impl : ( ( rule__FTState__NextStateAssignment_16_2 ) ) ;
    public final void rule__FTState__Group_16__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6671:1: ( ( ( rule__FTState__NextStateAssignment_16_2 ) ) )
            // InternalFairtracksDsl.g:6672:1: ( ( rule__FTState__NextStateAssignment_16_2 ) )
            {
            // InternalFairtracksDsl.g:6672:1: ( ( rule__FTState__NextStateAssignment_16_2 ) )
            // InternalFairtracksDsl.g:6673:2: ( rule__FTState__NextStateAssignment_16_2 )
            {
             before(grammarAccess.getFTStateAccess().getNextStateAssignment_16_2()); 
            // InternalFairtracksDsl.g:6674:2: ( rule__FTState__NextStateAssignment_16_2 )
            // InternalFairtracksDsl.g:6674:3: rule__FTState__NextStateAssignment_16_2
            {
            pushFollow(FOLLOW_2);
            rule__FTState__NextStateAssignment_16_2();

            state._fsp--;


            }

             after(grammarAccess.getFTStateAccess().getNextStateAssignment_16_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTState__Group_16__2__Impl"


    // $ANTLR start "rule__FTState__Group_16__3"
    // InternalFairtracksDsl.g:6682:1: rule__FTState__Group_16__3 : rule__FTState__Group_16__3__Impl ;
    public final void rule__FTState__Group_16__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6686:1: ( rule__FTState__Group_16__3__Impl )
            // InternalFairtracksDsl.g:6687:2: rule__FTState__Group_16__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FTState__Group_16__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTState__Group_16__3"


    // $ANTLR start "rule__FTState__Group_16__3__Impl"
    // InternalFairtracksDsl.g:6693:1: rule__FTState__Group_16__3__Impl : ( ';' ) ;
    public final void rule__FTState__Group_16__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6697:1: ( ( ';' ) )
            // InternalFairtracksDsl.g:6698:1: ( ';' )
            {
            // InternalFairtracksDsl.g:6698:1: ( ';' )
            // InternalFairtracksDsl.g:6699:2: ';'
            {
             before(grammarAccess.getFTStateAccess().getSemicolonKeyword_16_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getFTStateAccess().getSemicolonKeyword_16_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTState__Group_16__3__Impl"


    // $ANTLR start "rule__FTDistanceObs__Group__0"
    // InternalFairtracksDsl.g:6709:1: rule__FTDistanceObs__Group__0 : rule__FTDistanceObs__Group__0__Impl rule__FTDistanceObs__Group__1 ;
    public final void rule__FTDistanceObs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6713:1: ( rule__FTDistanceObs__Group__0__Impl rule__FTDistanceObs__Group__1 )
            // InternalFairtracksDsl.g:6714:2: rule__FTDistanceObs__Group__0__Impl rule__FTDistanceObs__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__FTDistanceObs__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTDistanceObs__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTDistanceObs__Group__0"


    // $ANTLR start "rule__FTDistanceObs__Group__0__Impl"
    // InternalFairtracksDsl.g:6721:1: rule__FTDistanceObs__Group__0__Impl : ( 'distanceIs' ) ;
    public final void rule__FTDistanceObs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6725:1: ( ( 'distanceIs' ) )
            // InternalFairtracksDsl.g:6726:1: ( 'distanceIs' )
            {
            // InternalFairtracksDsl.g:6726:1: ( 'distanceIs' )
            // InternalFairtracksDsl.g:6727:2: 'distanceIs'
            {
             before(grammarAccess.getFTDistanceObsAccess().getDistanceIsKeyword_0()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getFTDistanceObsAccess().getDistanceIsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTDistanceObs__Group__0__Impl"


    // $ANTLR start "rule__FTDistanceObs__Group__1"
    // InternalFairtracksDsl.g:6736:1: rule__FTDistanceObs__Group__1 : rule__FTDistanceObs__Group__1__Impl rule__FTDistanceObs__Group__2 ;
    public final void rule__FTDistanceObs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6740:1: ( rule__FTDistanceObs__Group__1__Impl rule__FTDistanceObs__Group__2 )
            // InternalFairtracksDsl.g:6741:2: rule__FTDistanceObs__Group__1__Impl rule__FTDistanceObs__Group__2
            {
            pushFollow(FOLLOW_38);
            rule__FTDistanceObs__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTDistanceObs__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTDistanceObs__Group__1"


    // $ANTLR start "rule__FTDistanceObs__Group__1__Impl"
    // InternalFairtracksDsl.g:6748:1: rule__FTDistanceObs__Group__1__Impl : ( ':' ) ;
    public final void rule__FTDistanceObs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6752:1: ( ( ':' ) )
            // InternalFairtracksDsl.g:6753:1: ( ':' )
            {
            // InternalFairtracksDsl.g:6753:1: ( ':' )
            // InternalFairtracksDsl.g:6754:2: ':'
            {
             before(grammarAccess.getFTDistanceObsAccess().getColonKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getFTDistanceObsAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTDistanceObs__Group__1__Impl"


    // $ANTLR start "rule__FTDistanceObs__Group__2"
    // InternalFairtracksDsl.g:6763:1: rule__FTDistanceObs__Group__2 : rule__FTDistanceObs__Group__2__Impl rule__FTDistanceObs__Group__3 ;
    public final void rule__FTDistanceObs__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6767:1: ( rule__FTDistanceObs__Group__2__Impl rule__FTDistanceObs__Group__3 )
            // InternalFairtracksDsl.g:6768:2: rule__FTDistanceObs__Group__2__Impl rule__FTDistanceObs__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__FTDistanceObs__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTDistanceObs__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTDistanceObs__Group__2"


    // $ANTLR start "rule__FTDistanceObs__Group__2__Impl"
    // InternalFairtracksDsl.g:6775:1: rule__FTDistanceObs__Group__2__Impl : ( ( rule__FTDistanceObs__DistanceAssignment_2 ) ) ;
    public final void rule__FTDistanceObs__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6779:1: ( ( ( rule__FTDistanceObs__DistanceAssignment_2 ) ) )
            // InternalFairtracksDsl.g:6780:1: ( ( rule__FTDistanceObs__DistanceAssignment_2 ) )
            {
            // InternalFairtracksDsl.g:6780:1: ( ( rule__FTDistanceObs__DistanceAssignment_2 ) )
            // InternalFairtracksDsl.g:6781:2: ( rule__FTDistanceObs__DistanceAssignment_2 )
            {
             before(grammarAccess.getFTDistanceObsAccess().getDistanceAssignment_2()); 
            // InternalFairtracksDsl.g:6782:2: ( rule__FTDistanceObs__DistanceAssignment_2 )
            // InternalFairtracksDsl.g:6782:3: rule__FTDistanceObs__DistanceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FTDistanceObs__DistanceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFTDistanceObsAccess().getDistanceAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTDistanceObs__Group__2__Impl"


    // $ANTLR start "rule__FTDistanceObs__Group__3"
    // InternalFairtracksDsl.g:6790:1: rule__FTDistanceObs__Group__3 : rule__FTDistanceObs__Group__3__Impl rule__FTDistanceObs__Group__4 ;
    public final void rule__FTDistanceObs__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6794:1: ( rule__FTDistanceObs__Group__3__Impl rule__FTDistanceObs__Group__4 )
            // InternalFairtracksDsl.g:6795:2: rule__FTDistanceObs__Group__3__Impl rule__FTDistanceObs__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__FTDistanceObs__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTDistanceObs__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTDistanceObs__Group__3"


    // $ANTLR start "rule__FTDistanceObs__Group__3__Impl"
    // InternalFairtracksDsl.g:6802:1: rule__FTDistanceObs__Group__3__Impl : ( ( rule__FTDistanceObs__ObjectAssignment_3 ) ) ;
    public final void rule__FTDistanceObs__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6806:1: ( ( ( rule__FTDistanceObs__ObjectAssignment_3 ) ) )
            // InternalFairtracksDsl.g:6807:1: ( ( rule__FTDistanceObs__ObjectAssignment_3 ) )
            {
            // InternalFairtracksDsl.g:6807:1: ( ( rule__FTDistanceObs__ObjectAssignment_3 ) )
            // InternalFairtracksDsl.g:6808:2: ( rule__FTDistanceObs__ObjectAssignment_3 )
            {
             before(grammarAccess.getFTDistanceObsAccess().getObjectAssignment_3()); 
            // InternalFairtracksDsl.g:6809:2: ( rule__FTDistanceObs__ObjectAssignment_3 )
            // InternalFairtracksDsl.g:6809:3: rule__FTDistanceObs__ObjectAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__FTDistanceObs__ObjectAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFTDistanceObsAccess().getObjectAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTDistanceObs__Group__3__Impl"


    // $ANTLR start "rule__FTDistanceObs__Group__4"
    // InternalFairtracksDsl.g:6817:1: rule__FTDistanceObs__Group__4 : rule__FTDistanceObs__Group__4__Impl ;
    public final void rule__FTDistanceObs__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6821:1: ( rule__FTDistanceObs__Group__4__Impl )
            // InternalFairtracksDsl.g:6822:2: rule__FTDistanceObs__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FTDistanceObs__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTDistanceObs__Group__4"


    // $ANTLR start "rule__FTDistanceObs__Group__4__Impl"
    // InternalFairtracksDsl.g:6828:1: rule__FTDistanceObs__Group__4__Impl : ( ';' ) ;
    public final void rule__FTDistanceObs__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6832:1: ( ( ';' ) )
            // InternalFairtracksDsl.g:6833:1: ( ';' )
            {
            // InternalFairtracksDsl.g:6833:1: ( ';' )
            // InternalFairtracksDsl.g:6834:2: ';'
            {
             before(grammarAccess.getFTDistanceObsAccess().getSemicolonKeyword_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getFTDistanceObsAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTDistanceObs__Group__4__Impl"


    // $ANTLR start "rule__FTHangingObs__Group__0"
    // InternalFairtracksDsl.g:6844:1: rule__FTHangingObs__Group__0 : rule__FTHangingObs__Group__0__Impl rule__FTHangingObs__Group__1 ;
    public final void rule__FTHangingObs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6848:1: ( rule__FTHangingObs__Group__0__Impl rule__FTHangingObs__Group__1 )
            // InternalFairtracksDsl.g:6849:2: rule__FTHangingObs__Group__0__Impl rule__FTHangingObs__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__FTHangingObs__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTHangingObs__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTHangingObs__Group__0"


    // $ANTLR start "rule__FTHangingObs__Group__0__Impl"
    // InternalFairtracksDsl.g:6856:1: rule__FTHangingObs__Group__0__Impl : ( 'hangingFrom' ) ;
    public final void rule__FTHangingObs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6860:1: ( ( 'hangingFrom' ) )
            // InternalFairtracksDsl.g:6861:1: ( 'hangingFrom' )
            {
            // InternalFairtracksDsl.g:6861:1: ( 'hangingFrom' )
            // InternalFairtracksDsl.g:6862:2: 'hangingFrom'
            {
             before(grammarAccess.getFTHangingObsAccess().getHangingFromKeyword_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getFTHangingObsAccess().getHangingFromKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTHangingObs__Group__0__Impl"


    // $ANTLR start "rule__FTHangingObs__Group__1"
    // InternalFairtracksDsl.g:6871:1: rule__FTHangingObs__Group__1 : rule__FTHangingObs__Group__1__Impl rule__FTHangingObs__Group__2 ;
    public final void rule__FTHangingObs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6875:1: ( rule__FTHangingObs__Group__1__Impl rule__FTHangingObs__Group__2 )
            // InternalFairtracksDsl.g:6876:2: rule__FTHangingObs__Group__1__Impl rule__FTHangingObs__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__FTHangingObs__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTHangingObs__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTHangingObs__Group__1"


    // $ANTLR start "rule__FTHangingObs__Group__1__Impl"
    // InternalFairtracksDsl.g:6883:1: rule__FTHangingObs__Group__1__Impl : ( ':' ) ;
    public final void rule__FTHangingObs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6887:1: ( ( ':' ) )
            // InternalFairtracksDsl.g:6888:1: ( ':' )
            {
            // InternalFairtracksDsl.g:6888:1: ( ':' )
            // InternalFairtracksDsl.g:6889:2: ':'
            {
             before(grammarAccess.getFTHangingObsAccess().getColonKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getFTHangingObsAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTHangingObs__Group__1__Impl"


    // $ANTLR start "rule__FTHangingObs__Group__2"
    // InternalFairtracksDsl.g:6898:1: rule__FTHangingObs__Group__2 : rule__FTHangingObs__Group__2__Impl rule__FTHangingObs__Group__3 ;
    public final void rule__FTHangingObs__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6902:1: ( rule__FTHangingObs__Group__2__Impl rule__FTHangingObs__Group__3 )
            // InternalFairtracksDsl.g:6903:2: rule__FTHangingObs__Group__2__Impl rule__FTHangingObs__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__FTHangingObs__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTHangingObs__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTHangingObs__Group__2"


    // $ANTLR start "rule__FTHangingObs__Group__2__Impl"
    // InternalFairtracksDsl.g:6910:1: rule__FTHangingObs__Group__2__Impl : ( ( rule__FTHangingObs__ObjectAssignment_2 ) ) ;
    public final void rule__FTHangingObs__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6914:1: ( ( ( rule__FTHangingObs__ObjectAssignment_2 ) ) )
            // InternalFairtracksDsl.g:6915:1: ( ( rule__FTHangingObs__ObjectAssignment_2 ) )
            {
            // InternalFairtracksDsl.g:6915:1: ( ( rule__FTHangingObs__ObjectAssignment_2 ) )
            // InternalFairtracksDsl.g:6916:2: ( rule__FTHangingObs__ObjectAssignment_2 )
            {
             before(grammarAccess.getFTHangingObsAccess().getObjectAssignment_2()); 
            // InternalFairtracksDsl.g:6917:2: ( rule__FTHangingObs__ObjectAssignment_2 )
            // InternalFairtracksDsl.g:6917:3: rule__FTHangingObs__ObjectAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FTHangingObs__ObjectAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFTHangingObsAccess().getObjectAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTHangingObs__Group__2__Impl"


    // $ANTLR start "rule__FTHangingObs__Group__3"
    // InternalFairtracksDsl.g:6925:1: rule__FTHangingObs__Group__3 : rule__FTHangingObs__Group__3__Impl ;
    public final void rule__FTHangingObs__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6929:1: ( rule__FTHangingObs__Group__3__Impl )
            // InternalFairtracksDsl.g:6930:2: rule__FTHangingObs__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FTHangingObs__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTHangingObs__Group__3"


    // $ANTLR start "rule__FTHangingObs__Group__3__Impl"
    // InternalFairtracksDsl.g:6936:1: rule__FTHangingObs__Group__3__Impl : ( ';' ) ;
    public final void rule__FTHangingObs__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6940:1: ( ( ';' ) )
            // InternalFairtracksDsl.g:6941:1: ( ';' )
            {
            // InternalFairtracksDsl.g:6941:1: ( ';' )
            // InternalFairtracksDsl.g:6942:2: ';'
            {
             before(grammarAccess.getFTHangingObsAccess().getSemicolonKeyword_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getFTHangingObsAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTHangingObs__Group__3__Impl"


    // $ANTLR start "rule__FTPickUpObs__Group__0"
    // InternalFairtracksDsl.g:6952:1: rule__FTPickUpObs__Group__0 : rule__FTPickUpObs__Group__0__Impl rule__FTPickUpObs__Group__1 ;
    public final void rule__FTPickUpObs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6956:1: ( rule__FTPickUpObs__Group__0__Impl rule__FTPickUpObs__Group__1 )
            // InternalFairtracksDsl.g:6957:2: rule__FTPickUpObs__Group__0__Impl rule__FTPickUpObs__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__FTPickUpObs__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTPickUpObs__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPickUpObs__Group__0"


    // $ANTLR start "rule__FTPickUpObs__Group__0__Impl"
    // InternalFairtracksDsl.g:6964:1: rule__FTPickUpObs__Group__0__Impl : ( 'pickedUp' ) ;
    public final void rule__FTPickUpObs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6968:1: ( ( 'pickedUp' ) )
            // InternalFairtracksDsl.g:6969:1: ( 'pickedUp' )
            {
            // InternalFairtracksDsl.g:6969:1: ( 'pickedUp' )
            // InternalFairtracksDsl.g:6970:2: 'pickedUp'
            {
             before(grammarAccess.getFTPickUpObsAccess().getPickedUpKeyword_0()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getFTPickUpObsAccess().getPickedUpKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPickUpObs__Group__0__Impl"


    // $ANTLR start "rule__FTPickUpObs__Group__1"
    // InternalFairtracksDsl.g:6979:1: rule__FTPickUpObs__Group__1 : rule__FTPickUpObs__Group__1__Impl rule__FTPickUpObs__Group__2 ;
    public final void rule__FTPickUpObs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6983:1: ( rule__FTPickUpObs__Group__1__Impl rule__FTPickUpObs__Group__2 )
            // InternalFairtracksDsl.g:6984:2: rule__FTPickUpObs__Group__1__Impl rule__FTPickUpObs__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__FTPickUpObs__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTPickUpObs__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPickUpObs__Group__1"


    // $ANTLR start "rule__FTPickUpObs__Group__1__Impl"
    // InternalFairtracksDsl.g:6991:1: rule__FTPickUpObs__Group__1__Impl : ( ':' ) ;
    public final void rule__FTPickUpObs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:6995:1: ( ( ':' ) )
            // InternalFairtracksDsl.g:6996:1: ( ':' )
            {
            // InternalFairtracksDsl.g:6996:1: ( ':' )
            // InternalFairtracksDsl.g:6997:2: ':'
            {
             before(grammarAccess.getFTPickUpObsAccess().getColonKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getFTPickUpObsAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPickUpObs__Group__1__Impl"


    // $ANTLR start "rule__FTPickUpObs__Group__2"
    // InternalFairtracksDsl.g:7006:1: rule__FTPickUpObs__Group__2 : rule__FTPickUpObs__Group__2__Impl rule__FTPickUpObs__Group__3 ;
    public final void rule__FTPickUpObs__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7010:1: ( rule__FTPickUpObs__Group__2__Impl rule__FTPickUpObs__Group__3 )
            // InternalFairtracksDsl.g:7011:2: rule__FTPickUpObs__Group__2__Impl rule__FTPickUpObs__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__FTPickUpObs__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTPickUpObs__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPickUpObs__Group__2"


    // $ANTLR start "rule__FTPickUpObs__Group__2__Impl"
    // InternalFairtracksDsl.g:7018:1: rule__FTPickUpObs__Group__2__Impl : ( ( rule__FTPickUpObs__ObjectAssignment_2 ) ) ;
    public final void rule__FTPickUpObs__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7022:1: ( ( ( rule__FTPickUpObs__ObjectAssignment_2 ) ) )
            // InternalFairtracksDsl.g:7023:1: ( ( rule__FTPickUpObs__ObjectAssignment_2 ) )
            {
            // InternalFairtracksDsl.g:7023:1: ( ( rule__FTPickUpObs__ObjectAssignment_2 ) )
            // InternalFairtracksDsl.g:7024:2: ( rule__FTPickUpObs__ObjectAssignment_2 )
            {
             before(grammarAccess.getFTPickUpObsAccess().getObjectAssignment_2()); 
            // InternalFairtracksDsl.g:7025:2: ( rule__FTPickUpObs__ObjectAssignment_2 )
            // InternalFairtracksDsl.g:7025:3: rule__FTPickUpObs__ObjectAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FTPickUpObs__ObjectAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFTPickUpObsAccess().getObjectAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPickUpObs__Group__2__Impl"


    // $ANTLR start "rule__FTPickUpObs__Group__3"
    // InternalFairtracksDsl.g:7033:1: rule__FTPickUpObs__Group__3 : rule__FTPickUpObs__Group__3__Impl ;
    public final void rule__FTPickUpObs__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7037:1: ( rule__FTPickUpObs__Group__3__Impl )
            // InternalFairtracksDsl.g:7038:2: rule__FTPickUpObs__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FTPickUpObs__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPickUpObs__Group__3"


    // $ANTLR start "rule__FTPickUpObs__Group__3__Impl"
    // InternalFairtracksDsl.g:7044:1: rule__FTPickUpObs__Group__3__Impl : ( ';' ) ;
    public final void rule__FTPickUpObs__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7048:1: ( ( ';' ) )
            // InternalFairtracksDsl.g:7049:1: ( ';' )
            {
            // InternalFairtracksDsl.g:7049:1: ( ';' )
            // InternalFairtracksDsl.g:7050:2: ';'
            {
             before(grammarAccess.getFTPickUpObsAccess().getSemicolonKeyword_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getFTPickUpObsAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPickUpObs__Group__3__Impl"


    // $ANTLR start "rule__FTZoneObs__Group__0"
    // InternalFairtracksDsl.g:7060:1: rule__FTZoneObs__Group__0 : rule__FTZoneObs__Group__0__Impl rule__FTZoneObs__Group__1 ;
    public final void rule__FTZoneObs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7064:1: ( rule__FTZoneObs__Group__0__Impl rule__FTZoneObs__Group__1 )
            // InternalFairtracksDsl.g:7065:2: rule__FTZoneObs__Group__0__Impl rule__FTZoneObs__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__FTZoneObs__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZoneObs__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZoneObs__Group__0"


    // $ANTLR start "rule__FTZoneObs__Group__0__Impl"
    // InternalFairtracksDsl.g:7072:1: rule__FTZoneObs__Group__0__Impl : ( 'inZone' ) ;
    public final void rule__FTZoneObs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7076:1: ( ( 'inZone' ) )
            // InternalFairtracksDsl.g:7077:1: ( 'inZone' )
            {
            // InternalFairtracksDsl.g:7077:1: ( 'inZone' )
            // InternalFairtracksDsl.g:7078:2: 'inZone'
            {
             before(grammarAccess.getFTZoneObsAccess().getInZoneKeyword_0()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getFTZoneObsAccess().getInZoneKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZoneObs__Group__0__Impl"


    // $ANTLR start "rule__FTZoneObs__Group__1"
    // InternalFairtracksDsl.g:7087:1: rule__FTZoneObs__Group__1 : rule__FTZoneObs__Group__1__Impl rule__FTZoneObs__Group__2 ;
    public final void rule__FTZoneObs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7091:1: ( rule__FTZoneObs__Group__1__Impl rule__FTZoneObs__Group__2 )
            // InternalFairtracksDsl.g:7092:2: rule__FTZoneObs__Group__1__Impl rule__FTZoneObs__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__FTZoneObs__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZoneObs__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZoneObs__Group__1"


    // $ANTLR start "rule__FTZoneObs__Group__1__Impl"
    // InternalFairtracksDsl.g:7099:1: rule__FTZoneObs__Group__1__Impl : ( ':' ) ;
    public final void rule__FTZoneObs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7103:1: ( ( ':' ) )
            // InternalFairtracksDsl.g:7104:1: ( ':' )
            {
            // InternalFairtracksDsl.g:7104:1: ( ':' )
            // InternalFairtracksDsl.g:7105:2: ':'
            {
             before(grammarAccess.getFTZoneObsAccess().getColonKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getFTZoneObsAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZoneObs__Group__1__Impl"


    // $ANTLR start "rule__FTZoneObs__Group__2"
    // InternalFairtracksDsl.g:7114:1: rule__FTZoneObs__Group__2 : rule__FTZoneObs__Group__2__Impl rule__FTZoneObs__Group__3 ;
    public final void rule__FTZoneObs__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7118:1: ( rule__FTZoneObs__Group__2__Impl rule__FTZoneObs__Group__3 )
            // InternalFairtracksDsl.g:7119:2: rule__FTZoneObs__Group__2__Impl rule__FTZoneObs__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__FTZoneObs__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FTZoneObs__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZoneObs__Group__2"


    // $ANTLR start "rule__FTZoneObs__Group__2__Impl"
    // InternalFairtracksDsl.g:7126:1: rule__FTZoneObs__Group__2__Impl : ( ( rule__FTZoneObs__ObjectAssignment_2 ) ) ;
    public final void rule__FTZoneObs__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7130:1: ( ( ( rule__FTZoneObs__ObjectAssignment_2 ) ) )
            // InternalFairtracksDsl.g:7131:1: ( ( rule__FTZoneObs__ObjectAssignment_2 ) )
            {
            // InternalFairtracksDsl.g:7131:1: ( ( rule__FTZoneObs__ObjectAssignment_2 ) )
            // InternalFairtracksDsl.g:7132:2: ( rule__FTZoneObs__ObjectAssignment_2 )
            {
             before(grammarAccess.getFTZoneObsAccess().getObjectAssignment_2()); 
            // InternalFairtracksDsl.g:7133:2: ( rule__FTZoneObs__ObjectAssignment_2 )
            // InternalFairtracksDsl.g:7133:3: rule__FTZoneObs__ObjectAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FTZoneObs__ObjectAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFTZoneObsAccess().getObjectAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZoneObs__Group__2__Impl"


    // $ANTLR start "rule__FTZoneObs__Group__3"
    // InternalFairtracksDsl.g:7141:1: rule__FTZoneObs__Group__3 : rule__FTZoneObs__Group__3__Impl ;
    public final void rule__FTZoneObs__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7145:1: ( rule__FTZoneObs__Group__3__Impl )
            // InternalFairtracksDsl.g:7146:2: rule__FTZoneObs__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FTZoneObs__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZoneObs__Group__3"


    // $ANTLR start "rule__FTZoneObs__Group__3__Impl"
    // InternalFairtracksDsl.g:7152:1: rule__FTZoneObs__Group__3__Impl : ( ';' ) ;
    public final void rule__FTZoneObs__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7156:1: ( ( ';' ) )
            // InternalFairtracksDsl.g:7157:1: ( ';' )
            {
            // InternalFairtracksDsl.g:7157:1: ( ';' )
            // InternalFairtracksDsl.g:7158:2: ';'
            {
             before(grammarAccess.getFTZoneObsAccess().getSemicolonKeyword_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getFTZoneObsAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZoneObs__Group__3__Impl"


    // $ANTLR start "rule__Fairtracksmodel__StaticObjectsAssignment_0"
    // InternalFairtracksDsl.g:7168:1: rule__Fairtracksmodel__StaticObjectsAssignment_0 : ( ruleFTStaticObject ) ;
    public final void rule__Fairtracksmodel__StaticObjectsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7172:1: ( ( ruleFTStaticObject ) )
            // InternalFairtracksDsl.g:7173:2: ( ruleFTStaticObject )
            {
            // InternalFairtracksDsl.g:7173:2: ( ruleFTStaticObject )
            // InternalFairtracksDsl.g:7174:3: ruleFTStaticObject
            {
             before(grammarAccess.getFairtracksmodelAccess().getStaticObjectsFTStaticObjectParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFTStaticObject();

            state._fsp--;

             after(grammarAccess.getFairtracksmodelAccess().getStaticObjectsFTStaticObjectParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fairtracksmodel__StaticObjectsAssignment_0"


    // $ANTLR start "rule__Fairtracksmodel__InitialDistancesAssignment_1"
    // InternalFairtracksDsl.g:7183:1: rule__Fairtracksmodel__InitialDistancesAssignment_1 : ( ruleFTDistance ) ;
    public final void rule__Fairtracksmodel__InitialDistancesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7187:1: ( ( ruleFTDistance ) )
            // InternalFairtracksDsl.g:7188:2: ( ruleFTDistance )
            {
            // InternalFairtracksDsl.g:7188:2: ( ruleFTDistance )
            // InternalFairtracksDsl.g:7189:3: ruleFTDistance
            {
             before(grammarAccess.getFairtracksmodelAccess().getInitialDistancesFTDistanceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFTDistance();

            state._fsp--;

             after(grammarAccess.getFairtracksmodelAccess().getInitialDistancesFTDistanceParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fairtracksmodel__InitialDistancesAssignment_1"


    // $ANTLR start "rule__FTPlayer__NameAssignment_5"
    // InternalFairtracksDsl.g:7198:1: rule__FTPlayer__NameAssignment_5 : ( RULE_ID ) ;
    public final void rule__FTPlayer__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7202:1: ( ( RULE_ID ) )
            // InternalFairtracksDsl.g:7203:2: ( RULE_ID )
            {
            // InternalFairtracksDsl.g:7203:2: ( RULE_ID )
            // InternalFairtracksDsl.g:7204:3: RULE_ID
            {
             before(grammarAccess.getFTPlayerAccess().getNameIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFTPlayerAccess().getNameIDTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__NameAssignment_5"


    // $ANTLR start "rule__FTPlayer__SizeAssignment_9"
    // InternalFairtracksDsl.g:7213:1: rule__FTPlayer__SizeAssignment_9 : ( ruleFTSize ) ;
    public final void rule__FTPlayer__SizeAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7217:1: ( ( ruleFTSize ) )
            // InternalFairtracksDsl.g:7218:2: ( ruleFTSize )
            {
            // InternalFairtracksDsl.g:7218:2: ( ruleFTSize )
            // InternalFairtracksDsl.g:7219:3: ruleFTSize
            {
             before(grammarAccess.getFTPlayerAccess().getSizeFTSizeEnumRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleFTSize();

            state._fsp--;

             after(grammarAccess.getFTPlayerAccess().getSizeFTSizeEnumRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__SizeAssignment_9"


    // $ANTLR start "rule__FTPlayer__RoleAssignment_13"
    // InternalFairtracksDsl.g:7228:1: rule__FTPlayer__RoleAssignment_13 : ( ruleFTRole ) ;
    public final void rule__FTPlayer__RoleAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7232:1: ( ( ruleFTRole ) )
            // InternalFairtracksDsl.g:7233:2: ( ruleFTRole )
            {
            // InternalFairtracksDsl.g:7233:2: ( ruleFTRole )
            // InternalFairtracksDsl.g:7234:3: ruleFTRole
            {
             before(grammarAccess.getFTPlayerAccess().getRoleFTRoleEnumRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleFTRole();

            state._fsp--;

             after(grammarAccess.getFTPlayerAccess().getRoleFTRoleEnumRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__RoleAssignment_13"


    // $ANTLR start "rule__FTPlayer__InitiallyInsideAssignment_15_2"
    // InternalFairtracksDsl.g:7243:1: rule__FTPlayer__InitiallyInsideAssignment_15_2 : ( ( RULE_ID ) ) ;
    public final void rule__FTPlayer__InitiallyInsideAssignment_15_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7247:1: ( ( ( RULE_ID ) ) )
            // InternalFairtracksDsl.g:7248:2: ( ( RULE_ID ) )
            {
            // InternalFairtracksDsl.g:7248:2: ( ( RULE_ID ) )
            // InternalFairtracksDsl.g:7249:3: ( RULE_ID )
            {
             before(grammarAccess.getFTPlayerAccess().getInitiallyInsideFTZoneCrossReference_15_2_0()); 
            // InternalFairtracksDsl.g:7250:3: ( RULE_ID )
            // InternalFairtracksDsl.g:7251:4: RULE_ID
            {
             before(grammarAccess.getFTPlayerAccess().getInitiallyInsideFTZoneIDTerminalRuleCall_15_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFTPlayerAccess().getInitiallyInsideFTZoneIDTerminalRuleCall_15_2_0_1()); 

            }

             after(grammarAccess.getFTPlayerAccess().getInitiallyInsideFTZoneCrossReference_15_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__InitiallyInsideAssignment_15_2"


    // $ANTLR start "rule__FTPlayer__CanPickUpObjectAssignment_16_0"
    // InternalFairtracksDsl.g:7262:1: rule__FTPlayer__CanPickUpObjectAssignment_16_0 : ( ( 'canPickUp' ) ) ;
    public final void rule__FTPlayer__CanPickUpObjectAssignment_16_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7266:1: ( ( ( 'canPickUp' ) ) )
            // InternalFairtracksDsl.g:7267:2: ( ( 'canPickUp' ) )
            {
            // InternalFairtracksDsl.g:7267:2: ( ( 'canPickUp' ) )
            // InternalFairtracksDsl.g:7268:3: ( 'canPickUp' )
            {
             before(grammarAccess.getFTPlayerAccess().getCanPickUpObjectCanPickUpKeyword_16_0_0()); 
            // InternalFairtracksDsl.g:7269:3: ( 'canPickUp' )
            // InternalFairtracksDsl.g:7270:4: 'canPickUp'
            {
             before(grammarAccess.getFTPlayerAccess().getCanPickUpObjectCanPickUpKeyword_16_0_0()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getFTPlayerAccess().getCanPickUpObjectCanPickUpKeyword_16_0_0()); 

            }

             after(grammarAccess.getFTPlayerAccess().getCanPickUpObjectCanPickUpKeyword_16_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__CanPickUpObjectAssignment_16_0"


    // $ANTLR start "rule__FTPlayer__PickUpColorAssignment_17_2"
    // InternalFairtracksDsl.g:7281:1: rule__FTPlayer__PickUpColorAssignment_17_2 : ( ruleFTPickUpColorClass ) ;
    public final void rule__FTPlayer__PickUpColorAssignment_17_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7285:1: ( ( ruleFTPickUpColorClass ) )
            // InternalFairtracksDsl.g:7286:2: ( ruleFTPickUpColorClass )
            {
            // InternalFairtracksDsl.g:7286:2: ( ruleFTPickUpColorClass )
            // InternalFairtracksDsl.g:7287:3: ruleFTPickUpColorClass
            {
             before(grammarAccess.getFTPlayerAccess().getPickUpColorFTPickUpColorClassParserRuleCall_17_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFTPickUpColorClass();

            state._fsp--;

             after(grammarAccess.getFTPlayerAccess().getPickUpColorFTPickUpColorClassParserRuleCall_17_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__PickUpColorAssignment_17_2"


    // $ANTLR start "rule__FTPlayer__PickUpColorAssignment_17_3_1"
    // InternalFairtracksDsl.g:7296:1: rule__FTPlayer__PickUpColorAssignment_17_3_1 : ( ruleFTPickUpColorClass ) ;
    public final void rule__FTPlayer__PickUpColorAssignment_17_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7300:1: ( ( ruleFTPickUpColorClass ) )
            // InternalFairtracksDsl.g:7301:2: ( ruleFTPickUpColorClass )
            {
            // InternalFairtracksDsl.g:7301:2: ( ruleFTPickUpColorClass )
            // InternalFairtracksDsl.g:7302:3: ruleFTPickUpColorClass
            {
             before(grammarAccess.getFTPlayerAccess().getPickUpColorFTPickUpColorClassParserRuleCall_17_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFTPickUpColorClass();

            state._fsp--;

             after(grammarAccess.getFTPlayerAccess().getPickUpColorFTPickUpColorClassParserRuleCall_17_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__PickUpColorAssignment_17_3_1"


    // $ANTLR start "rule__FTPlayer__DistanceClassAssignment_18_2"
    // InternalFairtracksDsl.g:7311:1: rule__FTPlayer__DistanceClassAssignment_18_2 : ( ruleFTDistance ) ;
    public final void rule__FTPlayer__DistanceClassAssignment_18_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7315:1: ( ( ruleFTDistance ) )
            // InternalFairtracksDsl.g:7316:2: ( ruleFTDistance )
            {
            // InternalFairtracksDsl.g:7316:2: ( ruleFTDistance )
            // InternalFairtracksDsl.g:7317:3: ruleFTDistance
            {
             before(grammarAccess.getFTPlayerAccess().getDistanceClassFTDistanceParserRuleCall_18_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFTDistance();

            state._fsp--;

             after(grammarAccess.getFTPlayerAccess().getDistanceClassFTDistanceParserRuleCall_18_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__DistanceClassAssignment_18_2"


    // $ANTLR start "rule__FTPlayer__CoordinatesAssignment_19_4"
    // InternalFairtracksDsl.g:7326:1: rule__FTPlayer__CoordinatesAssignment_19_4 : ( ruleFTRealCoordinates ) ;
    public final void rule__FTPlayer__CoordinatesAssignment_19_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7330:1: ( ( ruleFTRealCoordinates ) )
            // InternalFairtracksDsl.g:7331:2: ( ruleFTRealCoordinates )
            {
            // InternalFairtracksDsl.g:7331:2: ( ruleFTRealCoordinates )
            // InternalFairtracksDsl.g:7332:3: ruleFTRealCoordinates
            {
             before(grammarAccess.getFTPlayerAccess().getCoordinatesFTRealCoordinatesParserRuleCall_19_4_0()); 
            pushFollow(FOLLOW_2);
            ruleFTRealCoordinates();

            state._fsp--;

             after(grammarAccess.getFTPlayerAccess().getCoordinatesFTRealCoordinatesParserRuleCall_19_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPlayer__CoordinatesAssignment_19_4"


    // $ANTLR start "rule__FTPickUpColorClass__ColorAssignment"
    // InternalFairtracksDsl.g:7341:1: rule__FTPickUpColorClass__ColorAssignment : ( ruleFTPickUpColor ) ;
    public final void rule__FTPickUpColorClass__ColorAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7345:1: ( ( ruleFTPickUpColor ) )
            // InternalFairtracksDsl.g:7346:2: ( ruleFTPickUpColor )
            {
            // InternalFairtracksDsl.g:7346:2: ( ruleFTPickUpColor )
            // InternalFairtracksDsl.g:7347:3: ruleFTPickUpColor
            {
             before(grammarAccess.getFTPickUpColorClassAccess().getColorFTPickUpColorEnumRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleFTPickUpColor();

            state._fsp--;

             after(grammarAccess.getFTPickUpColorClassAccess().getColorFTPickUpColorEnumRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPickUpColorClass__ColorAssignment"


    // $ANTLR start "rule__FTZone__NameAssignment_5"
    // InternalFairtracksDsl.g:7356:1: rule__FTZone__NameAssignment_5 : ( RULE_ID ) ;
    public final void rule__FTZone__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7360:1: ( ( RULE_ID ) )
            // InternalFairtracksDsl.g:7361:2: ( RULE_ID )
            {
            // InternalFairtracksDsl.g:7361:2: ( RULE_ID )
            // InternalFairtracksDsl.g:7362:3: RULE_ID
            {
             before(grammarAccess.getFTZoneAccess().getNameIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFTZoneAccess().getNameIDTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__NameAssignment_5"


    // $ANTLR start "rule__FTZone__SizeAssignment_9"
    // InternalFairtracksDsl.g:7371:1: rule__FTZone__SizeAssignment_9 : ( ruleFTSize ) ;
    public final void rule__FTZone__SizeAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7375:1: ( ( ruleFTSize ) )
            // InternalFairtracksDsl.g:7376:2: ( ruleFTSize )
            {
            // InternalFairtracksDsl.g:7376:2: ( ruleFTSize )
            // InternalFairtracksDsl.g:7377:3: ruleFTSize
            {
             before(grammarAccess.getFTZoneAccess().getSizeFTSizeEnumRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleFTSize();

            state._fsp--;

             after(grammarAccess.getFTZoneAccess().getSizeFTSizeEnumRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__SizeAssignment_9"


    // $ANTLR start "rule__FTZone__TypeAssignment_13"
    // InternalFairtracksDsl.g:7386:1: rule__FTZone__TypeAssignment_13 : ( ruleFTZoneType ) ;
    public final void rule__FTZone__TypeAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7390:1: ( ( ruleFTZoneType ) )
            // InternalFairtracksDsl.g:7391:2: ( ruleFTZoneType )
            {
            // InternalFairtracksDsl.g:7391:2: ( ruleFTZoneType )
            // InternalFairtracksDsl.g:7392:3: ruleFTZoneType
            {
             before(grammarAccess.getFTZoneAccess().getTypeFTZoneTypeEnumRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleFTZoneType();

            state._fsp--;

             after(grammarAccess.getFTZoneAccess().getTypeFTZoneTypeEnumRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__TypeAssignment_13"


    // $ANTLR start "rule__FTZone__ContainsAssignment_15_2"
    // InternalFairtracksDsl.g:7401:1: rule__FTZone__ContainsAssignment_15_2 : ( ( RULE_ID ) ) ;
    public final void rule__FTZone__ContainsAssignment_15_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7405:1: ( ( ( RULE_ID ) ) )
            // InternalFairtracksDsl.g:7406:2: ( ( RULE_ID ) )
            {
            // InternalFairtracksDsl.g:7406:2: ( ( RULE_ID ) )
            // InternalFairtracksDsl.g:7407:3: ( RULE_ID )
            {
             before(grammarAccess.getFTZoneAccess().getContainsFTZoneCrossReference_15_2_0()); 
            // InternalFairtracksDsl.g:7408:3: ( RULE_ID )
            // InternalFairtracksDsl.g:7409:4: RULE_ID
            {
             before(grammarAccess.getFTZoneAccess().getContainsFTZoneIDTerminalRuleCall_15_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFTZoneAccess().getContainsFTZoneIDTerminalRuleCall_15_2_0_1()); 

            }

             after(grammarAccess.getFTZoneAccess().getContainsFTZoneCrossReference_15_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__ContainsAssignment_15_2"


    // $ANTLR start "rule__FTZone__ContainsAssignment_15_3_1"
    // InternalFairtracksDsl.g:7420:1: rule__FTZone__ContainsAssignment_15_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__FTZone__ContainsAssignment_15_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7424:1: ( ( ( RULE_ID ) ) )
            // InternalFairtracksDsl.g:7425:2: ( ( RULE_ID ) )
            {
            // InternalFairtracksDsl.g:7425:2: ( ( RULE_ID ) )
            // InternalFairtracksDsl.g:7426:3: ( RULE_ID )
            {
             before(grammarAccess.getFTZoneAccess().getContainsFTZoneCrossReference_15_3_1_0()); 
            // InternalFairtracksDsl.g:7427:3: ( RULE_ID )
            // InternalFairtracksDsl.g:7428:4: RULE_ID
            {
             before(grammarAccess.getFTZoneAccess().getContainsFTZoneIDTerminalRuleCall_15_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFTZoneAccess().getContainsFTZoneIDTerminalRuleCall_15_3_1_0_1()); 

            }

             after(grammarAccess.getFTZoneAccess().getContainsFTZoneCrossReference_15_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__ContainsAssignment_15_3_1"


    // $ANTLR start "rule__FTZone__PartiallyOverlapsAssignment_16_2"
    // InternalFairtracksDsl.g:7439:1: rule__FTZone__PartiallyOverlapsAssignment_16_2 : ( ( RULE_ID ) ) ;
    public final void rule__FTZone__PartiallyOverlapsAssignment_16_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7443:1: ( ( ( RULE_ID ) ) )
            // InternalFairtracksDsl.g:7444:2: ( ( RULE_ID ) )
            {
            // InternalFairtracksDsl.g:7444:2: ( ( RULE_ID ) )
            // InternalFairtracksDsl.g:7445:3: ( RULE_ID )
            {
             before(grammarAccess.getFTZoneAccess().getPartiallyOverlapsFTZoneCrossReference_16_2_0()); 
            // InternalFairtracksDsl.g:7446:3: ( RULE_ID )
            // InternalFairtracksDsl.g:7447:4: RULE_ID
            {
             before(grammarAccess.getFTZoneAccess().getPartiallyOverlapsFTZoneIDTerminalRuleCall_16_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFTZoneAccess().getPartiallyOverlapsFTZoneIDTerminalRuleCall_16_2_0_1()); 

            }

             after(grammarAccess.getFTZoneAccess().getPartiallyOverlapsFTZoneCrossReference_16_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__PartiallyOverlapsAssignment_16_2"


    // $ANTLR start "rule__FTZone__PartiallyOverlapsAssignment_16_3_1"
    // InternalFairtracksDsl.g:7458:1: rule__FTZone__PartiallyOverlapsAssignment_16_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__FTZone__PartiallyOverlapsAssignment_16_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7462:1: ( ( ( RULE_ID ) ) )
            // InternalFairtracksDsl.g:7463:2: ( ( RULE_ID ) )
            {
            // InternalFairtracksDsl.g:7463:2: ( ( RULE_ID ) )
            // InternalFairtracksDsl.g:7464:3: ( RULE_ID )
            {
             before(grammarAccess.getFTZoneAccess().getPartiallyOverlapsFTZoneCrossReference_16_3_1_0()); 
            // InternalFairtracksDsl.g:7465:3: ( RULE_ID )
            // InternalFairtracksDsl.g:7466:4: RULE_ID
            {
             before(grammarAccess.getFTZoneAccess().getPartiallyOverlapsFTZoneIDTerminalRuleCall_16_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFTZoneAccess().getPartiallyOverlapsFTZoneIDTerminalRuleCall_16_3_1_0_1()); 

            }

             after(grammarAccess.getFTZoneAccess().getPartiallyOverlapsFTZoneCrossReference_16_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__PartiallyOverlapsAssignment_16_3_1"


    // $ANTLR start "rule__FTZone__IsAdjacentToAssignment_17_2"
    // InternalFairtracksDsl.g:7477:1: rule__FTZone__IsAdjacentToAssignment_17_2 : ( ( RULE_ID ) ) ;
    public final void rule__FTZone__IsAdjacentToAssignment_17_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7481:1: ( ( ( RULE_ID ) ) )
            // InternalFairtracksDsl.g:7482:2: ( ( RULE_ID ) )
            {
            // InternalFairtracksDsl.g:7482:2: ( ( RULE_ID ) )
            // InternalFairtracksDsl.g:7483:3: ( RULE_ID )
            {
             before(grammarAccess.getFTZoneAccess().getIsAdjacentToFTZoneCrossReference_17_2_0()); 
            // InternalFairtracksDsl.g:7484:3: ( RULE_ID )
            // InternalFairtracksDsl.g:7485:4: RULE_ID
            {
             before(grammarAccess.getFTZoneAccess().getIsAdjacentToFTZoneIDTerminalRuleCall_17_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFTZoneAccess().getIsAdjacentToFTZoneIDTerminalRuleCall_17_2_0_1()); 

            }

             after(grammarAccess.getFTZoneAccess().getIsAdjacentToFTZoneCrossReference_17_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__IsAdjacentToAssignment_17_2"


    // $ANTLR start "rule__FTZone__IsAdjacentToAssignment_17_3_1"
    // InternalFairtracksDsl.g:7496:1: rule__FTZone__IsAdjacentToAssignment_17_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__FTZone__IsAdjacentToAssignment_17_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7500:1: ( ( ( RULE_ID ) ) )
            // InternalFairtracksDsl.g:7501:2: ( ( RULE_ID ) )
            {
            // InternalFairtracksDsl.g:7501:2: ( ( RULE_ID ) )
            // InternalFairtracksDsl.g:7502:3: ( RULE_ID )
            {
             before(grammarAccess.getFTZoneAccess().getIsAdjacentToFTZoneCrossReference_17_3_1_0()); 
            // InternalFairtracksDsl.g:7503:3: ( RULE_ID )
            // InternalFairtracksDsl.g:7504:4: RULE_ID
            {
             before(grammarAccess.getFTZoneAccess().getIsAdjacentToFTZoneIDTerminalRuleCall_17_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFTZoneAccess().getIsAdjacentToFTZoneIDTerminalRuleCall_17_3_1_0_1()); 

            }

             after(grammarAccess.getFTZoneAccess().getIsAdjacentToFTZoneCrossReference_17_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__IsAdjacentToAssignment_17_3_1"


    // $ANTLR start "rule__FTZone__DisallowedPlayersAssignment_18_2"
    // InternalFairtracksDsl.g:7515:1: rule__FTZone__DisallowedPlayersAssignment_18_2 : ( ( RULE_ID ) ) ;
    public final void rule__FTZone__DisallowedPlayersAssignment_18_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7519:1: ( ( ( RULE_ID ) ) )
            // InternalFairtracksDsl.g:7520:2: ( ( RULE_ID ) )
            {
            // InternalFairtracksDsl.g:7520:2: ( ( RULE_ID ) )
            // InternalFairtracksDsl.g:7521:3: ( RULE_ID )
            {
             before(grammarAccess.getFTZoneAccess().getDisallowedPlayersFTPlayerCrossReference_18_2_0()); 
            // InternalFairtracksDsl.g:7522:3: ( RULE_ID )
            // InternalFairtracksDsl.g:7523:4: RULE_ID
            {
             before(grammarAccess.getFTZoneAccess().getDisallowedPlayersFTPlayerIDTerminalRuleCall_18_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFTZoneAccess().getDisallowedPlayersFTPlayerIDTerminalRuleCall_18_2_0_1()); 

            }

             after(grammarAccess.getFTZoneAccess().getDisallowedPlayersFTPlayerCrossReference_18_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__DisallowedPlayersAssignment_18_2"


    // $ANTLR start "rule__FTZone__DisallowedPlayersAssignment_18_3_1"
    // InternalFairtracksDsl.g:7534:1: rule__FTZone__DisallowedPlayersAssignment_18_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__FTZone__DisallowedPlayersAssignment_18_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7538:1: ( ( ( RULE_ID ) ) )
            // InternalFairtracksDsl.g:7539:2: ( ( RULE_ID ) )
            {
            // InternalFairtracksDsl.g:7539:2: ( ( RULE_ID ) )
            // InternalFairtracksDsl.g:7540:3: ( RULE_ID )
            {
             before(grammarAccess.getFTZoneAccess().getDisallowedPlayersFTPlayerCrossReference_18_3_1_0()); 
            // InternalFairtracksDsl.g:7541:3: ( RULE_ID )
            // InternalFairtracksDsl.g:7542:4: RULE_ID
            {
             before(grammarAccess.getFTZoneAccess().getDisallowedPlayersFTPlayerIDTerminalRuleCall_18_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFTZoneAccess().getDisallowedPlayersFTPlayerIDTerminalRuleCall_18_3_1_0_1()); 

            }

             after(grammarAccess.getFTZoneAccess().getDisallowedPlayersFTPlayerCrossReference_18_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__DisallowedPlayersAssignment_18_3_1"


    // $ANTLR start "rule__FTZone__DistanceClassAssignment_19_2"
    // InternalFairtracksDsl.g:7553:1: rule__FTZone__DistanceClassAssignment_19_2 : ( ruleFTDistance ) ;
    public final void rule__FTZone__DistanceClassAssignment_19_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7557:1: ( ( ruleFTDistance ) )
            // InternalFairtracksDsl.g:7558:2: ( ruleFTDistance )
            {
            // InternalFairtracksDsl.g:7558:2: ( ruleFTDistance )
            // InternalFairtracksDsl.g:7559:3: ruleFTDistance
            {
             before(grammarAccess.getFTZoneAccess().getDistanceClassFTDistanceParserRuleCall_19_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFTDistance();

            state._fsp--;

             after(grammarAccess.getFTZoneAccess().getDistanceClassFTDistanceParserRuleCall_19_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__DistanceClassAssignment_19_2"


    // $ANTLR start "rule__FTZone__CoordinatesAssignment_20_4"
    // InternalFairtracksDsl.g:7568:1: rule__FTZone__CoordinatesAssignment_20_4 : ( ruleFTRealCoordinates ) ;
    public final void rule__FTZone__CoordinatesAssignment_20_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7572:1: ( ( ruleFTRealCoordinates ) )
            // InternalFairtracksDsl.g:7573:2: ( ruleFTRealCoordinates )
            {
            // InternalFairtracksDsl.g:7573:2: ( ruleFTRealCoordinates )
            // InternalFairtracksDsl.g:7574:3: ruleFTRealCoordinates
            {
             before(grammarAccess.getFTZoneAccess().getCoordinatesFTRealCoordinatesParserRuleCall_20_4_0()); 
            pushFollow(FOLLOW_2);
            ruleFTRealCoordinates();

            state._fsp--;

             after(grammarAccess.getFTZoneAccess().getCoordinatesFTRealCoordinatesParserRuleCall_20_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZone__CoordinatesAssignment_20_4"


    // $ANTLR start "rule__FTObstacle__NameAssignment_5"
    // InternalFairtracksDsl.g:7583:1: rule__FTObstacle__NameAssignment_5 : ( RULE_ID ) ;
    public final void rule__FTObstacle__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7587:1: ( ( RULE_ID ) )
            // InternalFairtracksDsl.g:7588:2: ( RULE_ID )
            {
            // InternalFairtracksDsl.g:7588:2: ( RULE_ID )
            // InternalFairtracksDsl.g:7589:3: RULE_ID
            {
             before(grammarAccess.getFTObstacleAccess().getNameIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFTObstacleAccess().getNameIDTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__NameAssignment_5"


    // $ANTLR start "rule__FTObstacle__SizeAssignment_9"
    // InternalFairtracksDsl.g:7598:1: rule__FTObstacle__SizeAssignment_9 : ( ruleFTSize ) ;
    public final void rule__FTObstacle__SizeAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7602:1: ( ( ruleFTSize ) )
            // InternalFairtracksDsl.g:7603:2: ( ruleFTSize )
            {
            // InternalFairtracksDsl.g:7603:2: ( ruleFTSize )
            // InternalFairtracksDsl.g:7604:3: ruleFTSize
            {
             before(grammarAccess.getFTObstacleAccess().getSizeFTSizeEnumRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleFTSize();

            state._fsp--;

             after(grammarAccess.getFTObstacleAccess().getSizeFTSizeEnumRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__SizeAssignment_9"


    // $ANTLR start "rule__FTObstacle__IsMoveableAssignment_11_0"
    // InternalFairtracksDsl.g:7613:1: rule__FTObstacle__IsMoveableAssignment_11_0 : ( ( 'isMoveable' ) ) ;
    public final void rule__FTObstacle__IsMoveableAssignment_11_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7617:1: ( ( ( 'isMoveable' ) ) )
            // InternalFairtracksDsl.g:7618:2: ( ( 'isMoveable' ) )
            {
            // InternalFairtracksDsl.g:7618:2: ( ( 'isMoveable' ) )
            // InternalFairtracksDsl.g:7619:3: ( 'isMoveable' )
            {
             before(grammarAccess.getFTObstacleAccess().getIsMoveableIsMoveableKeyword_11_0_0()); 
            // InternalFairtracksDsl.g:7620:3: ( 'isMoveable' )
            // InternalFairtracksDsl.g:7621:4: 'isMoveable'
            {
             before(grammarAccess.getFTObstacleAccess().getIsMoveableIsMoveableKeyword_11_0_0()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getFTObstacleAccess().getIsMoveableIsMoveableKeyword_11_0_0()); 

            }

             after(grammarAccess.getFTObstacleAccess().getIsMoveableIsMoveableKeyword_11_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__IsMoveableAssignment_11_0"


    // $ANTLR start "rule__FTObstacle__ColorAssignment_14"
    // InternalFairtracksDsl.g:7632:1: rule__FTObstacle__ColorAssignment_14 : ( ruleFTPickUpColor ) ;
    public final void rule__FTObstacle__ColorAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7636:1: ( ( ruleFTPickUpColor ) )
            // InternalFairtracksDsl.g:7637:2: ( ruleFTPickUpColor )
            {
            // InternalFairtracksDsl.g:7637:2: ( ruleFTPickUpColor )
            // InternalFairtracksDsl.g:7638:3: ruleFTPickUpColor
            {
             before(grammarAccess.getFTObstacleAccess().getColorFTPickUpColorEnumRuleCall_14_0()); 
            pushFollow(FOLLOW_2);
            ruleFTPickUpColor();

            state._fsp--;

             after(grammarAccess.getFTObstacleAccess().getColorFTPickUpColorEnumRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__ColorAssignment_14"


    // $ANTLR start "rule__FTObstacle__InitiallyInsideAssignment_16_2"
    // InternalFairtracksDsl.g:7647:1: rule__FTObstacle__InitiallyInsideAssignment_16_2 : ( ( RULE_ID ) ) ;
    public final void rule__FTObstacle__InitiallyInsideAssignment_16_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7651:1: ( ( ( RULE_ID ) ) )
            // InternalFairtracksDsl.g:7652:2: ( ( RULE_ID ) )
            {
            // InternalFairtracksDsl.g:7652:2: ( ( RULE_ID ) )
            // InternalFairtracksDsl.g:7653:3: ( RULE_ID )
            {
             before(grammarAccess.getFTObstacleAccess().getInitiallyInsideFTZoneCrossReference_16_2_0()); 
            // InternalFairtracksDsl.g:7654:3: ( RULE_ID )
            // InternalFairtracksDsl.g:7655:4: RULE_ID
            {
             before(grammarAccess.getFTObstacleAccess().getInitiallyInsideFTZoneIDTerminalRuleCall_16_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFTObstacleAccess().getInitiallyInsideFTZoneIDTerminalRuleCall_16_2_0_1()); 

            }

             after(grammarAccess.getFTObstacleAccess().getInitiallyInsideFTZoneCrossReference_16_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__InitiallyInsideAssignment_16_2"


    // $ANTLR start "rule__FTObstacle__DisallowedZonesAssignment_17_2"
    // InternalFairtracksDsl.g:7666:1: rule__FTObstacle__DisallowedZonesAssignment_17_2 : ( ( RULE_ID ) ) ;
    public final void rule__FTObstacle__DisallowedZonesAssignment_17_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7670:1: ( ( ( RULE_ID ) ) )
            // InternalFairtracksDsl.g:7671:2: ( ( RULE_ID ) )
            {
            // InternalFairtracksDsl.g:7671:2: ( ( RULE_ID ) )
            // InternalFairtracksDsl.g:7672:3: ( RULE_ID )
            {
             before(grammarAccess.getFTObstacleAccess().getDisallowedZonesFTZoneCrossReference_17_2_0()); 
            // InternalFairtracksDsl.g:7673:3: ( RULE_ID )
            // InternalFairtracksDsl.g:7674:4: RULE_ID
            {
             before(grammarAccess.getFTObstacleAccess().getDisallowedZonesFTZoneIDTerminalRuleCall_17_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFTObstacleAccess().getDisallowedZonesFTZoneIDTerminalRuleCall_17_2_0_1()); 

            }

             after(grammarAccess.getFTObstacleAccess().getDisallowedZonesFTZoneCrossReference_17_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__DisallowedZonesAssignment_17_2"


    // $ANTLR start "rule__FTObstacle__DisallowedZonesAssignment_17_3_1"
    // InternalFairtracksDsl.g:7685:1: rule__FTObstacle__DisallowedZonesAssignment_17_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__FTObstacle__DisallowedZonesAssignment_17_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7689:1: ( ( ( RULE_ID ) ) )
            // InternalFairtracksDsl.g:7690:2: ( ( RULE_ID ) )
            {
            // InternalFairtracksDsl.g:7690:2: ( ( RULE_ID ) )
            // InternalFairtracksDsl.g:7691:3: ( RULE_ID )
            {
             before(grammarAccess.getFTObstacleAccess().getDisallowedZonesFTZoneCrossReference_17_3_1_0()); 
            // InternalFairtracksDsl.g:7692:3: ( RULE_ID )
            // InternalFairtracksDsl.g:7693:4: RULE_ID
            {
             before(grammarAccess.getFTObstacleAccess().getDisallowedZonesFTZoneIDTerminalRuleCall_17_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFTObstacleAccess().getDisallowedZonesFTZoneIDTerminalRuleCall_17_3_1_0_1()); 

            }

             after(grammarAccess.getFTObstacleAccess().getDisallowedZonesFTZoneCrossReference_17_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__DisallowedZonesAssignment_17_3_1"


    // $ANTLR start "rule__FTObstacle__DistanceClassAssignment_18_2"
    // InternalFairtracksDsl.g:7704:1: rule__FTObstacle__DistanceClassAssignment_18_2 : ( ruleFTDistance ) ;
    public final void rule__FTObstacle__DistanceClassAssignment_18_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7708:1: ( ( ruleFTDistance ) )
            // InternalFairtracksDsl.g:7709:2: ( ruleFTDistance )
            {
            // InternalFairtracksDsl.g:7709:2: ( ruleFTDistance )
            // InternalFairtracksDsl.g:7710:3: ruleFTDistance
            {
             before(grammarAccess.getFTObstacleAccess().getDistanceClassFTDistanceParserRuleCall_18_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFTDistance();

            state._fsp--;

             after(grammarAccess.getFTObstacleAccess().getDistanceClassFTDistanceParserRuleCall_18_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__DistanceClassAssignment_18_2"


    // $ANTLR start "rule__FTObstacle__CoordinatesAssignment_19_4"
    // InternalFairtracksDsl.g:7719:1: rule__FTObstacle__CoordinatesAssignment_19_4 : ( ruleFTRealCoordinates ) ;
    public final void rule__FTObstacle__CoordinatesAssignment_19_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7723:1: ( ( ruleFTRealCoordinates ) )
            // InternalFairtracksDsl.g:7724:2: ( ruleFTRealCoordinates )
            {
            // InternalFairtracksDsl.g:7724:2: ( ruleFTRealCoordinates )
            // InternalFairtracksDsl.g:7725:3: ruleFTRealCoordinates
            {
             before(grammarAccess.getFTObstacleAccess().getCoordinatesFTRealCoordinatesParserRuleCall_19_4_0()); 
            pushFollow(FOLLOW_2);
            ruleFTRealCoordinates();

            state._fsp--;

             after(grammarAccess.getFTObstacleAccess().getCoordinatesFTRealCoordinatesParserRuleCall_19_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTObstacle__CoordinatesAssignment_19_4"


    // $ANTLR start "rule__FTZipline__NameAssignment_5"
    // InternalFairtracksDsl.g:7734:1: rule__FTZipline__NameAssignment_5 : ( RULE_ID ) ;
    public final void rule__FTZipline__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7738:1: ( ( RULE_ID ) )
            // InternalFairtracksDsl.g:7739:2: ( RULE_ID )
            {
            // InternalFairtracksDsl.g:7739:2: ( RULE_ID )
            // InternalFairtracksDsl.g:7740:3: RULE_ID
            {
             before(grammarAccess.getFTZiplineAccess().getNameIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFTZiplineAccess().getNameIDTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZipline__NameAssignment_5"


    // $ANTLR start "rule__FTZipline__SizeAssignment_9"
    // InternalFairtracksDsl.g:7749:1: rule__FTZipline__SizeAssignment_9 : ( ruleFTSize ) ;
    public final void rule__FTZipline__SizeAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7753:1: ( ( ruleFTSize ) )
            // InternalFairtracksDsl.g:7754:2: ( ruleFTSize )
            {
            // InternalFairtracksDsl.g:7754:2: ( ruleFTSize )
            // InternalFairtracksDsl.g:7755:3: ruleFTSize
            {
             before(grammarAccess.getFTZiplineAccess().getSizeFTSizeEnumRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleFTSize();

            state._fsp--;

             after(grammarAccess.getFTZiplineAccess().getSizeFTSizeEnumRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZipline__SizeAssignment_9"


    // $ANTLR start "rule__FTZipline__StartZoneAssignment_14"
    // InternalFairtracksDsl.g:7764:1: rule__FTZipline__StartZoneAssignment_14 : ( ( RULE_ID ) ) ;
    public final void rule__FTZipline__StartZoneAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7768:1: ( ( ( RULE_ID ) ) )
            // InternalFairtracksDsl.g:7769:2: ( ( RULE_ID ) )
            {
            // InternalFairtracksDsl.g:7769:2: ( ( RULE_ID ) )
            // InternalFairtracksDsl.g:7770:3: ( RULE_ID )
            {
             before(grammarAccess.getFTZiplineAccess().getStartZoneFTZoneCrossReference_14_0()); 
            // InternalFairtracksDsl.g:7771:3: ( RULE_ID )
            // InternalFairtracksDsl.g:7772:4: RULE_ID
            {
             before(grammarAccess.getFTZiplineAccess().getStartZoneFTZoneIDTerminalRuleCall_14_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFTZiplineAccess().getStartZoneFTZoneIDTerminalRuleCall_14_0_1()); 

            }

             after(grammarAccess.getFTZiplineAccess().getStartZoneFTZoneCrossReference_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZipline__StartZoneAssignment_14"


    // $ANTLR start "rule__FTZipline__EndZoneAssignment_16"
    // InternalFairtracksDsl.g:7783:1: rule__FTZipline__EndZoneAssignment_16 : ( ( RULE_ID ) ) ;
    public final void rule__FTZipline__EndZoneAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7787:1: ( ( ( RULE_ID ) ) )
            // InternalFairtracksDsl.g:7788:2: ( ( RULE_ID ) )
            {
            // InternalFairtracksDsl.g:7788:2: ( ( RULE_ID ) )
            // InternalFairtracksDsl.g:7789:3: ( RULE_ID )
            {
             before(grammarAccess.getFTZiplineAccess().getEndZoneFTZoneCrossReference_16_0()); 
            // InternalFairtracksDsl.g:7790:3: ( RULE_ID )
            // InternalFairtracksDsl.g:7791:4: RULE_ID
            {
             before(grammarAccess.getFTZiplineAccess().getEndZoneFTZoneIDTerminalRuleCall_16_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFTZiplineAccess().getEndZoneFTZoneIDTerminalRuleCall_16_0_1()); 

            }

             after(grammarAccess.getFTZiplineAccess().getEndZoneFTZoneCrossReference_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZipline__EndZoneAssignment_16"


    // $ANTLR start "rule__FTZipline__CoordinatesAssignment_19_4"
    // InternalFairtracksDsl.g:7802:1: rule__FTZipline__CoordinatesAssignment_19_4 : ( ruleFTRealCoordinates ) ;
    public final void rule__FTZipline__CoordinatesAssignment_19_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7806:1: ( ( ruleFTRealCoordinates ) )
            // InternalFairtracksDsl.g:7807:2: ( ruleFTRealCoordinates )
            {
            // InternalFairtracksDsl.g:7807:2: ( ruleFTRealCoordinates )
            // InternalFairtracksDsl.g:7808:3: ruleFTRealCoordinates
            {
             before(grammarAccess.getFTZiplineAccess().getCoordinatesFTRealCoordinatesParserRuleCall_19_4_0()); 
            pushFollow(FOLLOW_2);
            ruleFTRealCoordinates();

            state._fsp--;

             after(grammarAccess.getFTZiplineAccess().getCoordinatesFTRealCoordinatesParserRuleCall_19_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZipline__CoordinatesAssignment_19_4"


    // $ANTLR start "rule__FTRealCoordinates__PosXAssignment_3"
    // InternalFairtracksDsl.g:7817:1: rule__FTRealCoordinates__PosXAssignment_3 : ( RULE_INT ) ;
    public final void rule__FTRealCoordinates__PosXAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7821:1: ( ( RULE_INT ) )
            // InternalFairtracksDsl.g:7822:2: ( RULE_INT )
            {
            // InternalFairtracksDsl.g:7822:2: ( RULE_INT )
            // InternalFairtracksDsl.g:7823:3: RULE_INT
            {
             before(grammarAccess.getFTRealCoordinatesAccess().getPosXINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFTRealCoordinatesAccess().getPosXINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTRealCoordinates__PosXAssignment_3"


    // $ANTLR start "rule__FTRealCoordinates__PosYAssignment_5"
    // InternalFairtracksDsl.g:7832:1: rule__FTRealCoordinates__PosYAssignment_5 : ( RULE_INT ) ;
    public final void rule__FTRealCoordinates__PosYAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7836:1: ( ( RULE_INT ) )
            // InternalFairtracksDsl.g:7837:2: ( RULE_INT )
            {
            // InternalFairtracksDsl.g:7837:2: ( RULE_INT )
            // InternalFairtracksDsl.g:7838:3: RULE_INT
            {
             before(grammarAccess.getFTRealCoordinatesAccess().getPosYINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFTRealCoordinatesAccess().getPosYINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTRealCoordinates__PosYAssignment_5"


    // $ANTLR start "rule__FTRealCoordinates__SizeXAssignment_11"
    // InternalFairtracksDsl.g:7847:1: rule__FTRealCoordinates__SizeXAssignment_11 : ( RULE_INT ) ;
    public final void rule__FTRealCoordinates__SizeXAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7851:1: ( ( RULE_INT ) )
            // InternalFairtracksDsl.g:7852:2: ( RULE_INT )
            {
            // InternalFairtracksDsl.g:7852:2: ( RULE_INT )
            // InternalFairtracksDsl.g:7853:3: RULE_INT
            {
             before(grammarAccess.getFTRealCoordinatesAccess().getSizeXINTTerminalRuleCall_11_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFTRealCoordinatesAccess().getSizeXINTTerminalRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTRealCoordinates__SizeXAssignment_11"


    // $ANTLR start "rule__FTRealCoordinates__SizeYAssignment_13"
    // InternalFairtracksDsl.g:7862:1: rule__FTRealCoordinates__SizeYAssignment_13 : ( RULE_INT ) ;
    public final void rule__FTRealCoordinates__SizeYAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7866:1: ( ( RULE_INT ) )
            // InternalFairtracksDsl.g:7867:2: ( RULE_INT )
            {
            // InternalFairtracksDsl.g:7867:2: ( RULE_INT )
            // InternalFairtracksDsl.g:7868:3: RULE_INT
            {
             before(grammarAccess.getFTRealCoordinatesAccess().getSizeYINTTerminalRuleCall_13_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFTRealCoordinatesAccess().getSizeYINTTerminalRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTRealCoordinates__SizeYAssignment_13"


    // $ANTLR start "rule__FTDistance__DistanceAssignment_1"
    // InternalFairtracksDsl.g:7877:1: rule__FTDistance__DistanceAssignment_1 : ( ruleFTDistanceValue ) ;
    public final void rule__FTDistance__DistanceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7881:1: ( ( ruleFTDistanceValue ) )
            // InternalFairtracksDsl.g:7882:2: ( ruleFTDistanceValue )
            {
            // InternalFairtracksDsl.g:7882:2: ( ruleFTDistanceValue )
            // InternalFairtracksDsl.g:7883:3: ruleFTDistanceValue
            {
             before(grammarAccess.getFTDistanceAccess().getDistanceFTDistanceValueEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFTDistanceValue();

            state._fsp--;

             after(grammarAccess.getFTDistanceAccess().getDistanceFTDistanceValueEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTDistance__DistanceAssignment_1"


    // $ANTLR start "rule__FTDistance__ToObjectAssignment_3"
    // InternalFairtracksDsl.g:7892:1: rule__FTDistance__ToObjectAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__FTDistance__ToObjectAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7896:1: ( ( ( RULE_ID ) ) )
            // InternalFairtracksDsl.g:7897:2: ( ( RULE_ID ) )
            {
            // InternalFairtracksDsl.g:7897:2: ( ( RULE_ID ) )
            // InternalFairtracksDsl.g:7898:3: ( RULE_ID )
            {
             before(grammarAccess.getFTDistanceAccess().getToObjectFTObjectWithDistanceCrossReference_3_0()); 
            // InternalFairtracksDsl.g:7899:3: ( RULE_ID )
            // InternalFairtracksDsl.g:7900:4: RULE_ID
            {
             before(grammarAccess.getFTDistanceAccess().getToObjectFTObjectWithDistanceIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFTDistanceAccess().getToObjectFTObjectWithDistanceIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getFTDistanceAccess().getToObjectFTObjectWithDistanceCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTDistance__ToObjectAssignment_3"


    // $ANTLR start "rule__FTState__NameAssignment_5"
    // InternalFairtracksDsl.g:7911:1: rule__FTState__NameAssignment_5 : ( RULE_ID ) ;
    public final void rule__FTState__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7915:1: ( ( RULE_ID ) )
            // InternalFairtracksDsl.g:7916:2: ( RULE_ID )
            {
            // InternalFairtracksDsl.g:7916:2: ( RULE_ID )
            // InternalFairtracksDsl.g:7917:3: RULE_ID
            {
             before(grammarAccess.getFTStateAccess().getNameIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFTStateAccess().getNameIDTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTState__NameAssignment_5"


    // $ANTLR start "rule__FTState__PosXAssignment_10"
    // InternalFairtracksDsl.g:7926:1: rule__FTState__PosXAssignment_10 : ( RULE_INT ) ;
    public final void rule__FTState__PosXAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7930:1: ( ( RULE_INT ) )
            // InternalFairtracksDsl.g:7931:2: ( RULE_INT )
            {
            // InternalFairtracksDsl.g:7931:2: ( RULE_INT )
            // InternalFairtracksDsl.g:7932:3: RULE_INT
            {
             before(grammarAccess.getFTStateAccess().getPosXINTTerminalRuleCall_10_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFTStateAccess().getPosXINTTerminalRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTState__PosXAssignment_10"


    // $ANTLR start "rule__FTState__PosYAssignment_12"
    // InternalFairtracksDsl.g:7941:1: rule__FTState__PosYAssignment_12 : ( RULE_INT ) ;
    public final void rule__FTState__PosYAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7945:1: ( ( RULE_INT ) )
            // InternalFairtracksDsl.g:7946:2: ( RULE_INT )
            {
            // InternalFairtracksDsl.g:7946:2: ( RULE_INT )
            // InternalFairtracksDsl.g:7947:3: RULE_INT
            {
             before(grammarAccess.getFTStateAccess().getPosYINTTerminalRuleCall_12_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFTStateAccess().getPosYINTTerminalRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTState__PosYAssignment_12"


    // $ANTLR start "rule__FTState__ObservationsAssignment_15"
    // InternalFairtracksDsl.g:7956:1: rule__FTState__ObservationsAssignment_15 : ( ruleFTObservation ) ;
    public final void rule__FTState__ObservationsAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7960:1: ( ( ruleFTObservation ) )
            // InternalFairtracksDsl.g:7961:2: ( ruleFTObservation )
            {
            // InternalFairtracksDsl.g:7961:2: ( ruleFTObservation )
            // InternalFairtracksDsl.g:7962:3: ruleFTObservation
            {
             before(grammarAccess.getFTStateAccess().getObservationsFTObservationParserRuleCall_15_0()); 
            pushFollow(FOLLOW_2);
            ruleFTObservation();

            state._fsp--;

             after(grammarAccess.getFTStateAccess().getObservationsFTObservationParserRuleCall_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTState__ObservationsAssignment_15"


    // $ANTLR start "rule__FTState__NextStateAssignment_16_2"
    // InternalFairtracksDsl.g:7971:1: rule__FTState__NextStateAssignment_16_2 : ( ( RULE_ID ) ) ;
    public final void rule__FTState__NextStateAssignment_16_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7975:1: ( ( ( RULE_ID ) ) )
            // InternalFairtracksDsl.g:7976:2: ( ( RULE_ID ) )
            {
            // InternalFairtracksDsl.g:7976:2: ( ( RULE_ID ) )
            // InternalFairtracksDsl.g:7977:3: ( RULE_ID )
            {
             before(grammarAccess.getFTStateAccess().getNextStateFTStateCrossReference_16_2_0()); 
            // InternalFairtracksDsl.g:7978:3: ( RULE_ID )
            // InternalFairtracksDsl.g:7979:4: RULE_ID
            {
             before(grammarAccess.getFTStateAccess().getNextStateFTStateIDTerminalRuleCall_16_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFTStateAccess().getNextStateFTStateIDTerminalRuleCall_16_2_0_1()); 

            }

             after(grammarAccess.getFTStateAccess().getNextStateFTStateCrossReference_16_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTState__NextStateAssignment_16_2"


    // $ANTLR start "rule__FTDistanceObs__DistanceAssignment_2"
    // InternalFairtracksDsl.g:7990:1: rule__FTDistanceObs__DistanceAssignment_2 : ( ruleFTDistanceValue ) ;
    public final void rule__FTDistanceObs__DistanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:7994:1: ( ( ruleFTDistanceValue ) )
            // InternalFairtracksDsl.g:7995:2: ( ruleFTDistanceValue )
            {
            // InternalFairtracksDsl.g:7995:2: ( ruleFTDistanceValue )
            // InternalFairtracksDsl.g:7996:3: ruleFTDistanceValue
            {
             before(grammarAccess.getFTDistanceObsAccess().getDistanceFTDistanceValueEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFTDistanceValue();

            state._fsp--;

             after(grammarAccess.getFTDistanceObsAccess().getDistanceFTDistanceValueEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTDistanceObs__DistanceAssignment_2"


    // $ANTLR start "rule__FTDistanceObs__ObjectAssignment_3"
    // InternalFairtracksDsl.g:8005:1: rule__FTDistanceObs__ObjectAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__FTDistanceObs__ObjectAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:8009:1: ( ( ( RULE_ID ) ) )
            // InternalFairtracksDsl.g:8010:2: ( ( RULE_ID ) )
            {
            // InternalFairtracksDsl.g:8010:2: ( ( RULE_ID ) )
            // InternalFairtracksDsl.g:8011:3: ( RULE_ID )
            {
             before(grammarAccess.getFTDistanceObsAccess().getObjectFTObjectWithDistanceCrossReference_3_0()); 
            // InternalFairtracksDsl.g:8012:3: ( RULE_ID )
            // InternalFairtracksDsl.g:8013:4: RULE_ID
            {
             before(grammarAccess.getFTDistanceObsAccess().getObjectFTObjectWithDistanceIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFTDistanceObsAccess().getObjectFTObjectWithDistanceIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getFTDistanceObsAccess().getObjectFTObjectWithDistanceCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTDistanceObs__ObjectAssignment_3"


    // $ANTLR start "rule__FTHangingObs__ObjectAssignment_2"
    // InternalFairtracksDsl.g:8024:1: rule__FTHangingObs__ObjectAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__FTHangingObs__ObjectAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:8028:1: ( ( ( RULE_ID ) ) )
            // InternalFairtracksDsl.g:8029:2: ( ( RULE_ID ) )
            {
            // InternalFairtracksDsl.g:8029:2: ( ( RULE_ID ) )
            // InternalFairtracksDsl.g:8030:3: ( RULE_ID )
            {
             before(grammarAccess.getFTHangingObsAccess().getObjectFTZiplineCrossReference_2_0()); 
            // InternalFairtracksDsl.g:8031:3: ( RULE_ID )
            // InternalFairtracksDsl.g:8032:4: RULE_ID
            {
             before(grammarAccess.getFTHangingObsAccess().getObjectFTZiplineIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFTHangingObsAccess().getObjectFTZiplineIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getFTHangingObsAccess().getObjectFTZiplineCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTHangingObs__ObjectAssignment_2"


    // $ANTLR start "rule__FTPickUpObs__ObjectAssignment_2"
    // InternalFairtracksDsl.g:8043:1: rule__FTPickUpObs__ObjectAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__FTPickUpObs__ObjectAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:8047:1: ( ( ( RULE_ID ) ) )
            // InternalFairtracksDsl.g:8048:2: ( ( RULE_ID ) )
            {
            // InternalFairtracksDsl.g:8048:2: ( ( RULE_ID ) )
            // InternalFairtracksDsl.g:8049:3: ( RULE_ID )
            {
             before(grammarAccess.getFTPickUpObsAccess().getObjectFTObstacleCrossReference_2_0()); 
            // InternalFairtracksDsl.g:8050:3: ( RULE_ID )
            // InternalFairtracksDsl.g:8051:4: RULE_ID
            {
             before(grammarAccess.getFTPickUpObsAccess().getObjectFTObstacleIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFTPickUpObsAccess().getObjectFTObstacleIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getFTPickUpObsAccess().getObjectFTObstacleCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTPickUpObs__ObjectAssignment_2"


    // $ANTLR start "rule__FTZoneObs__ObjectAssignment_2"
    // InternalFairtracksDsl.g:8062:1: rule__FTZoneObs__ObjectAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__FTZoneObs__ObjectAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFairtracksDsl.g:8066:1: ( ( ( RULE_ID ) ) )
            // InternalFairtracksDsl.g:8067:2: ( ( RULE_ID ) )
            {
            // InternalFairtracksDsl.g:8067:2: ( ( RULE_ID ) )
            // InternalFairtracksDsl.g:8068:3: ( RULE_ID )
            {
             before(grammarAccess.getFTZoneObsAccess().getObjectFTZoneCrossReference_2_0()); 
            // InternalFairtracksDsl.g:8069:3: ( RULE_ID )
            // InternalFairtracksDsl.g:8070:4: RULE_ID
            {
             before(grammarAccess.getFTZoneObsAccess().getObjectFTZoneIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFTZoneObsAccess().getObjectFTZoneIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getFTZoneObsAccess().getObjectFTZoneCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FTZoneObs__ObjectAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0104000201000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000001E0000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00006E0000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000000F800L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000104000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000001FC0800L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00F0620000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0400660000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000420000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000000001E000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0002000000000000L,0x00000000000003E0L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000002L,0x00000000000003C0L});

}
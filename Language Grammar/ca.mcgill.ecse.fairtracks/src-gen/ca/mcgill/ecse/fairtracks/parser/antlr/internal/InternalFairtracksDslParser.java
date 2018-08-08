package ca.mcgill.ecse.fairtracks.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ca.mcgill.ecse.fairtracks.services.FairtracksDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFairtracksDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Player'", "'='", "'{'", "'name'", "':'", "';'", "'size'", "'role'", "'inside'", "'canPickUp'", "'pickUpColor'", "','", "'distance'", "'Real'", "'Coordinates'", "'['", "']'", "'}'", "'Zone'", "'zoneType'", "'contains'", "'partiallyOverlaps'", "'isAdjacentTo'", "'disallowedPlayers'", "'Obstacle'", "'isMoveable'", "'color'", "'disallowedZones'", "'Zipline'", "'length'", "'extremities'", "'Position'", "'('", "')'", "'Size'", "'is'", "'object'", "'State'", "'position'", "'nextState'", "'distanceIs'", "'hangingFrom'", "'pickedUp'", "'inZone'", "'Red'", "'Blue'", "'Yellow'", "'White'", "'Other'", "'Attack'", "'Defense'", "'Background'", "'Green'", "'Passage'", "'Ball'", "'Search'", "'Start'", "'VeryFarFrom'", "'FarFrom'", "'CloseTo'", "'DangerouslyCloseTo'", "'Point'", "'Small'", "'Medium'", "'Big'"
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

        public InternalFairtracksDslParser(TokenStream input, FairtracksDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Fairtracksmodel";
       	}

       	@Override
       	protected FairtracksDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleFairtracksmodel"
    // InternalFairtracksDsl.g:65:1: entryRuleFairtracksmodel returns [EObject current=null] : iv_ruleFairtracksmodel= ruleFairtracksmodel EOF ;
    public final EObject entryRuleFairtracksmodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFairtracksmodel = null;


        try {
            // InternalFairtracksDsl.g:65:56: (iv_ruleFairtracksmodel= ruleFairtracksmodel EOF )
            // InternalFairtracksDsl.g:66:2: iv_ruleFairtracksmodel= ruleFairtracksmodel EOF
            {
             newCompositeNode(grammarAccess.getFairtracksmodelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFairtracksmodel=ruleFairtracksmodel();

            state._fsp--;

             current =iv_ruleFairtracksmodel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFairtracksmodel"


    // $ANTLR start "ruleFairtracksmodel"
    // InternalFairtracksDsl.g:72:1: ruleFairtracksmodel returns [EObject current=null] : ( ( (lv_staticObjects_0_0= ruleFTStaticObject ) )* ( (lv_initialDistances_1_0= ruleFTDistance ) )* ) ;
    public final EObject ruleFairtracksmodel() throws RecognitionException {
        EObject current = null;

        EObject lv_staticObjects_0_0 = null;

        EObject lv_initialDistances_1_0 = null;



        	enterRule();

        try {
            // InternalFairtracksDsl.g:78:2: ( ( ( (lv_staticObjects_0_0= ruleFTStaticObject ) )* ( (lv_initialDistances_1_0= ruleFTDistance ) )* ) )
            // InternalFairtracksDsl.g:79:2: ( ( (lv_staticObjects_0_0= ruleFTStaticObject ) )* ( (lv_initialDistances_1_0= ruleFTDistance ) )* )
            {
            // InternalFairtracksDsl.g:79:2: ( ( (lv_staticObjects_0_0= ruleFTStaticObject ) )* ( (lv_initialDistances_1_0= ruleFTDistance ) )* )
            // InternalFairtracksDsl.g:80:3: ( (lv_staticObjects_0_0= ruleFTStaticObject ) )* ( (lv_initialDistances_1_0= ruleFTDistance ) )*
            {
            // InternalFairtracksDsl.g:80:3: ( (lv_staticObjects_0_0= ruleFTStaticObject ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==29||LA1_0==35||LA1_0==39) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFairtracksDsl.g:81:4: (lv_staticObjects_0_0= ruleFTStaticObject )
            	    {
            	    // InternalFairtracksDsl.g:81:4: (lv_staticObjects_0_0= ruleFTStaticObject )
            	    // InternalFairtracksDsl.g:82:5: lv_staticObjects_0_0= ruleFTStaticObject
            	    {

            	    					newCompositeNode(grammarAccess.getFairtracksmodelAccess().getStaticObjectsFTStaticObjectParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_staticObjects_0_0=ruleFTStaticObject();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFairtracksmodelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"staticObjects",
            	    						lv_staticObjects_0_0,
            	    						"ca.mcgill.ecse.fairtracks.FairtracksDsl.FTStaticObject");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalFairtracksDsl.g:99:3: ( (lv_initialDistances_1_0= ruleFTDistance ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==46) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalFairtracksDsl.g:100:4: (lv_initialDistances_1_0= ruleFTDistance )
            	    {
            	    // InternalFairtracksDsl.g:100:4: (lv_initialDistances_1_0= ruleFTDistance )
            	    // InternalFairtracksDsl.g:101:5: lv_initialDistances_1_0= ruleFTDistance
            	    {

            	    					newCompositeNode(grammarAccess.getFairtracksmodelAccess().getInitialDistancesFTDistanceParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_initialDistances_1_0=ruleFTDistance();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFairtracksmodelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"initialDistances",
            	    						lv_initialDistances_1_0,
            	    						"ca.mcgill.ecse.fairtracks.FairtracksDsl.FTDistance");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFairtracksmodel"


    // $ANTLR start "entryRuleFTStaticObject"
    // InternalFairtracksDsl.g:122:1: entryRuleFTStaticObject returns [EObject current=null] : iv_ruleFTStaticObject= ruleFTStaticObject EOF ;
    public final EObject entryRuleFTStaticObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFTStaticObject = null;


        try {
            // InternalFairtracksDsl.g:122:55: (iv_ruleFTStaticObject= ruleFTStaticObject EOF )
            // InternalFairtracksDsl.g:123:2: iv_ruleFTStaticObject= ruleFTStaticObject EOF
            {
             newCompositeNode(grammarAccess.getFTStaticObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFTStaticObject=ruleFTStaticObject();

            state._fsp--;

             current =iv_ruleFTStaticObject; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFTStaticObject"


    // $ANTLR start "ruleFTStaticObject"
    // InternalFairtracksDsl.g:129:1: ruleFTStaticObject returns [EObject current=null] : (this_FTObjectWithDistance_0= ruleFTObjectWithDistance | this_FTZipline_1= ruleFTZipline ) ;
    public final EObject ruleFTStaticObject() throws RecognitionException {
        EObject current = null;

        EObject this_FTObjectWithDistance_0 = null;

        EObject this_FTZipline_1 = null;



        	enterRule();

        try {
            // InternalFairtracksDsl.g:135:2: ( (this_FTObjectWithDistance_0= ruleFTObjectWithDistance | this_FTZipline_1= ruleFTZipline ) )
            // InternalFairtracksDsl.g:136:2: (this_FTObjectWithDistance_0= ruleFTObjectWithDistance | this_FTZipline_1= ruleFTZipline )
            {
            // InternalFairtracksDsl.g:136:2: (this_FTObjectWithDistance_0= ruleFTObjectWithDistance | this_FTZipline_1= ruleFTZipline )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11||LA3_0==29||LA3_0==35) ) {
                alt3=1;
            }
            else if ( (LA3_0==39) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalFairtracksDsl.g:137:3: this_FTObjectWithDistance_0= ruleFTObjectWithDistance
                    {

                    			newCompositeNode(grammarAccess.getFTStaticObjectAccess().getFTObjectWithDistanceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FTObjectWithDistance_0=ruleFTObjectWithDistance();

                    state._fsp--;


                    			current = this_FTObjectWithDistance_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFairtracksDsl.g:146:3: this_FTZipline_1= ruleFTZipline
                    {

                    			newCompositeNode(grammarAccess.getFTStaticObjectAccess().getFTZiplineParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FTZipline_1=ruleFTZipline();

                    state._fsp--;


                    			current = this_FTZipline_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFTStaticObject"


    // $ANTLR start "entryRuleFTObjectWithDistance"
    // InternalFairtracksDsl.g:158:1: entryRuleFTObjectWithDistance returns [EObject current=null] : iv_ruleFTObjectWithDistance= ruleFTObjectWithDistance EOF ;
    public final EObject entryRuleFTObjectWithDistance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFTObjectWithDistance = null;


        try {
            // InternalFairtracksDsl.g:158:61: (iv_ruleFTObjectWithDistance= ruleFTObjectWithDistance EOF )
            // InternalFairtracksDsl.g:159:2: iv_ruleFTObjectWithDistance= ruleFTObjectWithDistance EOF
            {
             newCompositeNode(grammarAccess.getFTObjectWithDistanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFTObjectWithDistance=ruleFTObjectWithDistance();

            state._fsp--;

             current =iv_ruleFTObjectWithDistance; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFTObjectWithDistance"


    // $ANTLR start "ruleFTObjectWithDistance"
    // InternalFairtracksDsl.g:165:1: ruleFTObjectWithDistance returns [EObject current=null] : (this_FTPlayer_0= ruleFTPlayer | this_FTZone_1= ruleFTZone | this_FTObstacle_2= ruleFTObstacle ) ;
    public final EObject ruleFTObjectWithDistance() throws RecognitionException {
        EObject current = null;

        EObject this_FTPlayer_0 = null;

        EObject this_FTZone_1 = null;

        EObject this_FTObstacle_2 = null;



        	enterRule();

        try {
            // InternalFairtracksDsl.g:171:2: ( (this_FTPlayer_0= ruleFTPlayer | this_FTZone_1= ruleFTZone | this_FTObstacle_2= ruleFTObstacle ) )
            // InternalFairtracksDsl.g:172:2: (this_FTPlayer_0= ruleFTPlayer | this_FTZone_1= ruleFTZone | this_FTObstacle_2= ruleFTObstacle )
            {
            // InternalFairtracksDsl.g:172:2: (this_FTPlayer_0= ruleFTPlayer | this_FTZone_1= ruleFTZone | this_FTObstacle_2= ruleFTObstacle )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 29:
                {
                alt4=2;
                }
                break;
            case 35:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalFairtracksDsl.g:173:3: this_FTPlayer_0= ruleFTPlayer
                    {

                    			newCompositeNode(grammarAccess.getFTObjectWithDistanceAccess().getFTPlayerParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FTPlayer_0=ruleFTPlayer();

                    state._fsp--;


                    			current = this_FTPlayer_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFairtracksDsl.g:182:3: this_FTZone_1= ruleFTZone
                    {

                    			newCompositeNode(grammarAccess.getFTObjectWithDistanceAccess().getFTZoneParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FTZone_1=ruleFTZone();

                    state._fsp--;


                    			current = this_FTZone_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalFairtracksDsl.g:191:3: this_FTObstacle_2= ruleFTObstacle
                    {

                    			newCompositeNode(grammarAccess.getFTObjectWithDistanceAccess().getFTObstacleParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_FTObstacle_2=ruleFTObstacle();

                    state._fsp--;


                    			current = this_FTObstacle_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFTObjectWithDistance"


    // $ANTLR start "entryRuleFTPlayer"
    // InternalFairtracksDsl.g:203:1: entryRuleFTPlayer returns [EObject current=null] : iv_ruleFTPlayer= ruleFTPlayer EOF ;
    public final EObject entryRuleFTPlayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFTPlayer = null;


        try {
            // InternalFairtracksDsl.g:203:49: (iv_ruleFTPlayer= ruleFTPlayer EOF )
            // InternalFairtracksDsl.g:204:2: iv_ruleFTPlayer= ruleFTPlayer EOF
            {
             newCompositeNode(grammarAccess.getFTPlayerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFTPlayer=ruleFTPlayer();

            state._fsp--;

             current =iv_ruleFTPlayer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFTPlayer"


    // $ANTLR start "ruleFTPlayer"
    // InternalFairtracksDsl.g:210:1: ruleFTPlayer returns [EObject current=null] : (otherlv_0= 'Player' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ';' otherlv_7= 'size' otherlv_8= ':' ( (lv_size_9_0= ruleFTSize ) ) otherlv_10= ';' otherlv_11= 'role' otherlv_12= ':' ( (lv_role_13_0= ruleFTRole ) ) otherlv_14= ';' (otherlv_15= 'inside' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) otherlv_18= ';' )? ( ( (lv_canPickUpObject_19_0= 'canPickUp' ) ) otherlv_20= ';' )? (otherlv_21= 'pickUpColor' otherlv_22= ':' ( (lv_pickUpColor_23_0= ruleFTPickUpColorClass ) ) (otherlv_24= ',' ( (lv_pickUpColor_25_0= ruleFTPickUpColorClass ) ) )* otherlv_26= ';' )? (otherlv_27= 'distance' otherlv_28= ':' ( (lv_distanceClass_29_0= ruleFTDistance ) ) otherlv_30= ';' )* (otherlv_31= 'Real' otherlv_32= 'Coordinates' otherlv_33= ':' otherlv_34= '[' ( (lv_coordinates_35_0= ruleFTRealCoordinates ) ) otherlv_36= ']' )? otherlv_37= '}' ) ;
    public final EObject ruleFTPlayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_canPickUpObject_19_0=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Enumerator lv_size_9_0 = null;

        Enumerator lv_role_13_0 = null;

        EObject lv_pickUpColor_23_0 = null;

        EObject lv_pickUpColor_25_0 = null;

        EObject lv_distanceClass_29_0 = null;

        EObject lv_coordinates_35_0 = null;



        	enterRule();

        try {
            // InternalFairtracksDsl.g:216:2: ( (otherlv_0= 'Player' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ';' otherlv_7= 'size' otherlv_8= ':' ( (lv_size_9_0= ruleFTSize ) ) otherlv_10= ';' otherlv_11= 'role' otherlv_12= ':' ( (lv_role_13_0= ruleFTRole ) ) otherlv_14= ';' (otherlv_15= 'inside' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) otherlv_18= ';' )? ( ( (lv_canPickUpObject_19_0= 'canPickUp' ) ) otherlv_20= ';' )? (otherlv_21= 'pickUpColor' otherlv_22= ':' ( (lv_pickUpColor_23_0= ruleFTPickUpColorClass ) ) (otherlv_24= ',' ( (lv_pickUpColor_25_0= ruleFTPickUpColorClass ) ) )* otherlv_26= ';' )? (otherlv_27= 'distance' otherlv_28= ':' ( (lv_distanceClass_29_0= ruleFTDistance ) ) otherlv_30= ';' )* (otherlv_31= 'Real' otherlv_32= 'Coordinates' otherlv_33= ':' otherlv_34= '[' ( (lv_coordinates_35_0= ruleFTRealCoordinates ) ) otherlv_36= ']' )? otherlv_37= '}' ) )
            // InternalFairtracksDsl.g:217:2: (otherlv_0= 'Player' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ';' otherlv_7= 'size' otherlv_8= ':' ( (lv_size_9_0= ruleFTSize ) ) otherlv_10= ';' otherlv_11= 'role' otherlv_12= ':' ( (lv_role_13_0= ruleFTRole ) ) otherlv_14= ';' (otherlv_15= 'inside' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) otherlv_18= ';' )? ( ( (lv_canPickUpObject_19_0= 'canPickUp' ) ) otherlv_20= ';' )? (otherlv_21= 'pickUpColor' otherlv_22= ':' ( (lv_pickUpColor_23_0= ruleFTPickUpColorClass ) ) (otherlv_24= ',' ( (lv_pickUpColor_25_0= ruleFTPickUpColorClass ) ) )* otherlv_26= ';' )? (otherlv_27= 'distance' otherlv_28= ':' ( (lv_distanceClass_29_0= ruleFTDistance ) ) otherlv_30= ';' )* (otherlv_31= 'Real' otherlv_32= 'Coordinates' otherlv_33= ':' otherlv_34= '[' ( (lv_coordinates_35_0= ruleFTRealCoordinates ) ) otherlv_36= ']' )? otherlv_37= '}' )
            {
            // InternalFairtracksDsl.g:217:2: (otherlv_0= 'Player' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ';' otherlv_7= 'size' otherlv_8= ':' ( (lv_size_9_0= ruleFTSize ) ) otherlv_10= ';' otherlv_11= 'role' otherlv_12= ':' ( (lv_role_13_0= ruleFTRole ) ) otherlv_14= ';' (otherlv_15= 'inside' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) otherlv_18= ';' )? ( ( (lv_canPickUpObject_19_0= 'canPickUp' ) ) otherlv_20= ';' )? (otherlv_21= 'pickUpColor' otherlv_22= ':' ( (lv_pickUpColor_23_0= ruleFTPickUpColorClass ) ) (otherlv_24= ',' ( (lv_pickUpColor_25_0= ruleFTPickUpColorClass ) ) )* otherlv_26= ';' )? (otherlv_27= 'distance' otherlv_28= ':' ( (lv_distanceClass_29_0= ruleFTDistance ) ) otherlv_30= ';' )* (otherlv_31= 'Real' otherlv_32= 'Coordinates' otherlv_33= ':' otherlv_34= '[' ( (lv_coordinates_35_0= ruleFTRealCoordinates ) ) otherlv_36= ']' )? otherlv_37= '}' )
            // InternalFairtracksDsl.g:218:3: otherlv_0= 'Player' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ';' otherlv_7= 'size' otherlv_8= ':' ( (lv_size_9_0= ruleFTSize ) ) otherlv_10= ';' otherlv_11= 'role' otherlv_12= ':' ( (lv_role_13_0= ruleFTRole ) ) otherlv_14= ';' (otherlv_15= 'inside' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) otherlv_18= ';' )? ( ( (lv_canPickUpObject_19_0= 'canPickUp' ) ) otherlv_20= ';' )? (otherlv_21= 'pickUpColor' otherlv_22= ':' ( (lv_pickUpColor_23_0= ruleFTPickUpColorClass ) ) (otherlv_24= ',' ( (lv_pickUpColor_25_0= ruleFTPickUpColorClass ) ) )* otherlv_26= ';' )? (otherlv_27= 'distance' otherlv_28= ':' ( (lv_distanceClass_29_0= ruleFTDistance ) ) otherlv_30= ';' )* (otherlv_31= 'Real' otherlv_32= 'Coordinates' otherlv_33= ':' otherlv_34= '[' ( (lv_coordinates_35_0= ruleFTRealCoordinates ) ) otherlv_36= ']' )? otherlv_37= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getFTPlayerAccess().getPlayerKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getFTPlayerAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getFTPlayerAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getFTPlayerAccess().getNameKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getFTPlayerAccess().getColonKeyword_4());
            		
            // InternalFairtracksDsl.g:238:3: ( (lv_name_5_0= RULE_ID ) )
            // InternalFairtracksDsl.g:239:4: (lv_name_5_0= RULE_ID )
            {
            // InternalFairtracksDsl.g:239:4: (lv_name_5_0= RULE_ID )
            // InternalFairtracksDsl.g:240:5: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_5_0, grammarAccess.getFTPlayerAccess().getNameIDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFTPlayerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getFTPlayerAccess().getSemicolonKeyword_6());
            		
            otherlv_7=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getFTPlayerAccess().getSizeKeyword_7());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_8, grammarAccess.getFTPlayerAccess().getColonKeyword_8());
            		
            // InternalFairtracksDsl.g:268:3: ( (lv_size_9_0= ruleFTSize ) )
            // InternalFairtracksDsl.g:269:4: (lv_size_9_0= ruleFTSize )
            {
            // InternalFairtracksDsl.g:269:4: (lv_size_9_0= ruleFTSize )
            // InternalFairtracksDsl.g:270:5: lv_size_9_0= ruleFTSize
            {

            					newCompositeNode(grammarAccess.getFTPlayerAccess().getSizeFTSizeEnumRuleCall_9_0());
            				
            pushFollow(FOLLOW_10);
            lv_size_9_0=ruleFTSize();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFTPlayerRule());
            					}
            					set(
            						current,
            						"size",
            						lv_size_9_0,
            						"ca.mcgill.ecse.fairtracks.FairtracksDsl.FTSize");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_10, grammarAccess.getFTPlayerAccess().getSemicolonKeyword_10());
            		
            otherlv_11=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_11, grammarAccess.getFTPlayerAccess().getRoleKeyword_11());
            		
            otherlv_12=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_12, grammarAccess.getFTPlayerAccess().getColonKeyword_12());
            		
            // InternalFairtracksDsl.g:299:3: ( (lv_role_13_0= ruleFTRole ) )
            // InternalFairtracksDsl.g:300:4: (lv_role_13_0= ruleFTRole )
            {
            // InternalFairtracksDsl.g:300:4: (lv_role_13_0= ruleFTRole )
            // InternalFairtracksDsl.g:301:5: lv_role_13_0= ruleFTRole
            {

            					newCompositeNode(grammarAccess.getFTPlayerAccess().getRoleFTRoleEnumRuleCall_13_0());
            				
            pushFollow(FOLLOW_10);
            lv_role_13_0=ruleFTRole();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFTPlayerRule());
            					}
            					set(
            						current,
            						"role",
            						lv_role_13_0,
            						"ca.mcgill.ecse.fairtracks.FairtracksDsl.FTRole");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_14, grammarAccess.getFTPlayerAccess().getSemicolonKeyword_14());
            		
            // InternalFairtracksDsl.g:322:3: (otherlv_15= 'inside' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) otherlv_18= ';' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalFairtracksDsl.g:323:4: otherlv_15= 'inside' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) otherlv_18= ';'
                    {
                    otherlv_15=(Token)match(input,19,FOLLOW_8); 

                    				newLeafNode(otherlv_15, grammarAccess.getFTPlayerAccess().getInsideKeyword_15_0());
                    			
                    otherlv_16=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_16, grammarAccess.getFTPlayerAccess().getColonKeyword_15_1());
                    			
                    // InternalFairtracksDsl.g:331:4: ( (otherlv_17= RULE_ID ) )
                    // InternalFairtracksDsl.g:332:5: (otherlv_17= RULE_ID )
                    {
                    // InternalFairtracksDsl.g:332:5: (otherlv_17= RULE_ID )
                    // InternalFairtracksDsl.g:333:6: otherlv_17= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFTPlayerRule());
                    						}
                    					
                    otherlv_17=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(otherlv_17, grammarAccess.getFTPlayerAccess().getInitiallyInsideFTZoneCrossReference_15_2_0());
                    					

                    }


                    }

                    otherlv_18=(Token)match(input,16,FOLLOW_16); 

                    				newLeafNode(otherlv_18, grammarAccess.getFTPlayerAccess().getSemicolonKeyword_15_3());
                    			

                    }
                    break;

            }

            // InternalFairtracksDsl.g:349:3: ( ( (lv_canPickUpObject_19_0= 'canPickUp' ) ) otherlv_20= ';' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalFairtracksDsl.g:350:4: ( (lv_canPickUpObject_19_0= 'canPickUp' ) ) otherlv_20= ';'
                    {
                    // InternalFairtracksDsl.g:350:4: ( (lv_canPickUpObject_19_0= 'canPickUp' ) )
                    // InternalFairtracksDsl.g:351:5: (lv_canPickUpObject_19_0= 'canPickUp' )
                    {
                    // InternalFairtracksDsl.g:351:5: (lv_canPickUpObject_19_0= 'canPickUp' )
                    // InternalFairtracksDsl.g:352:6: lv_canPickUpObject_19_0= 'canPickUp'
                    {
                    lv_canPickUpObject_19_0=(Token)match(input,20,FOLLOW_10); 

                    						newLeafNode(lv_canPickUpObject_19_0, grammarAccess.getFTPlayerAccess().getCanPickUpObjectCanPickUpKeyword_16_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFTPlayerRule());
                    						}
                    						setWithLastConsumed(current, "canPickUpObject", true, "canPickUp");
                    					

                    }


                    }

                    otherlv_20=(Token)match(input,16,FOLLOW_17); 

                    				newLeafNode(otherlv_20, grammarAccess.getFTPlayerAccess().getSemicolonKeyword_16_1());
                    			

                    }
                    break;

            }

            // InternalFairtracksDsl.g:369:3: (otherlv_21= 'pickUpColor' otherlv_22= ':' ( (lv_pickUpColor_23_0= ruleFTPickUpColorClass ) ) (otherlv_24= ',' ( (lv_pickUpColor_25_0= ruleFTPickUpColorClass ) ) )* otherlv_26= ';' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalFairtracksDsl.g:370:4: otherlv_21= 'pickUpColor' otherlv_22= ':' ( (lv_pickUpColor_23_0= ruleFTPickUpColorClass ) ) (otherlv_24= ',' ( (lv_pickUpColor_25_0= ruleFTPickUpColorClass ) ) )* otherlv_26= ';'
                    {
                    otherlv_21=(Token)match(input,21,FOLLOW_8); 

                    				newLeafNode(otherlv_21, grammarAccess.getFTPlayerAccess().getPickUpColorKeyword_17_0());
                    			
                    otherlv_22=(Token)match(input,15,FOLLOW_18); 

                    				newLeafNode(otherlv_22, grammarAccess.getFTPlayerAccess().getColonKeyword_17_1());
                    			
                    // InternalFairtracksDsl.g:378:4: ( (lv_pickUpColor_23_0= ruleFTPickUpColorClass ) )
                    // InternalFairtracksDsl.g:379:5: (lv_pickUpColor_23_0= ruleFTPickUpColorClass )
                    {
                    // InternalFairtracksDsl.g:379:5: (lv_pickUpColor_23_0= ruleFTPickUpColorClass )
                    // InternalFairtracksDsl.g:380:6: lv_pickUpColor_23_0= ruleFTPickUpColorClass
                    {

                    						newCompositeNode(grammarAccess.getFTPlayerAccess().getPickUpColorFTPickUpColorClassParserRuleCall_17_2_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_pickUpColor_23_0=ruleFTPickUpColorClass();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFTPlayerRule());
                    						}
                    						add(
                    							current,
                    							"pickUpColor",
                    							lv_pickUpColor_23_0,
                    							"ca.mcgill.ecse.fairtracks.FairtracksDsl.FTPickUpColorClass");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFairtracksDsl.g:397:4: (otherlv_24= ',' ( (lv_pickUpColor_25_0= ruleFTPickUpColorClass ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==22) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalFairtracksDsl.g:398:5: otherlv_24= ',' ( (lv_pickUpColor_25_0= ruleFTPickUpColorClass ) )
                    	    {
                    	    otherlv_24=(Token)match(input,22,FOLLOW_18); 

                    	    					newLeafNode(otherlv_24, grammarAccess.getFTPlayerAccess().getCommaKeyword_17_3_0());
                    	    				
                    	    // InternalFairtracksDsl.g:402:5: ( (lv_pickUpColor_25_0= ruleFTPickUpColorClass ) )
                    	    // InternalFairtracksDsl.g:403:6: (lv_pickUpColor_25_0= ruleFTPickUpColorClass )
                    	    {
                    	    // InternalFairtracksDsl.g:403:6: (lv_pickUpColor_25_0= ruleFTPickUpColorClass )
                    	    // InternalFairtracksDsl.g:404:7: lv_pickUpColor_25_0= ruleFTPickUpColorClass
                    	    {

                    	    							newCompositeNode(grammarAccess.getFTPlayerAccess().getPickUpColorFTPickUpColorClassParserRuleCall_17_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    lv_pickUpColor_25_0=ruleFTPickUpColorClass();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFTPlayerRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"pickUpColor",
                    	    								lv_pickUpColor_25_0,
                    	    								"ca.mcgill.ecse.fairtracks.FairtracksDsl.FTPickUpColorClass");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,16,FOLLOW_20); 

                    				newLeafNode(otherlv_26, grammarAccess.getFTPlayerAccess().getSemicolonKeyword_17_4());
                    			

                    }
                    break;

            }

            // InternalFairtracksDsl.g:427:3: (otherlv_27= 'distance' otherlv_28= ':' ( (lv_distanceClass_29_0= ruleFTDistance ) ) otherlv_30= ';' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalFairtracksDsl.g:428:4: otherlv_27= 'distance' otherlv_28= ':' ( (lv_distanceClass_29_0= ruleFTDistance ) ) otherlv_30= ';'
            	    {
            	    otherlv_27=(Token)match(input,23,FOLLOW_8); 

            	    				newLeafNode(otherlv_27, grammarAccess.getFTPlayerAccess().getDistanceKeyword_18_0());
            	    			
            	    otherlv_28=(Token)match(input,15,FOLLOW_21); 

            	    				newLeafNode(otherlv_28, grammarAccess.getFTPlayerAccess().getColonKeyword_18_1());
            	    			
            	    // InternalFairtracksDsl.g:436:4: ( (lv_distanceClass_29_0= ruleFTDistance ) )
            	    // InternalFairtracksDsl.g:437:5: (lv_distanceClass_29_0= ruleFTDistance )
            	    {
            	    // InternalFairtracksDsl.g:437:5: (lv_distanceClass_29_0= ruleFTDistance )
            	    // InternalFairtracksDsl.g:438:6: lv_distanceClass_29_0= ruleFTDistance
            	    {

            	    						newCompositeNode(grammarAccess.getFTPlayerAccess().getDistanceClassFTDistanceParserRuleCall_18_2_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_distanceClass_29_0=ruleFTDistance();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFTPlayerRule());
            	    						}
            	    						add(
            	    							current,
            	    							"distanceClass",
            	    							lv_distanceClass_29_0,
            	    							"ca.mcgill.ecse.fairtracks.FairtracksDsl.FTDistance");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_30=(Token)match(input,16,FOLLOW_20); 

            	    				newLeafNode(otherlv_30, grammarAccess.getFTPlayerAccess().getSemicolonKeyword_18_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalFairtracksDsl.g:460:3: (otherlv_31= 'Real' otherlv_32= 'Coordinates' otherlv_33= ':' otherlv_34= '[' ( (lv_coordinates_35_0= ruleFTRealCoordinates ) ) otherlv_36= ']' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalFairtracksDsl.g:461:4: otherlv_31= 'Real' otherlv_32= 'Coordinates' otherlv_33= ':' otherlv_34= '[' ( (lv_coordinates_35_0= ruleFTRealCoordinates ) ) otherlv_36= ']'
                    {
                    otherlv_31=(Token)match(input,24,FOLLOW_22); 

                    				newLeafNode(otherlv_31, grammarAccess.getFTPlayerAccess().getRealKeyword_19_0());
                    			
                    otherlv_32=(Token)match(input,25,FOLLOW_8); 

                    				newLeafNode(otherlv_32, grammarAccess.getFTPlayerAccess().getCoordinatesKeyword_19_1());
                    			
                    otherlv_33=(Token)match(input,15,FOLLOW_23); 

                    				newLeafNode(otherlv_33, grammarAccess.getFTPlayerAccess().getColonKeyword_19_2());
                    			
                    otherlv_34=(Token)match(input,26,FOLLOW_24); 

                    				newLeafNode(otherlv_34, grammarAccess.getFTPlayerAccess().getLeftSquareBracketKeyword_19_3());
                    			
                    // InternalFairtracksDsl.g:477:4: ( (lv_coordinates_35_0= ruleFTRealCoordinates ) )
                    // InternalFairtracksDsl.g:478:5: (lv_coordinates_35_0= ruleFTRealCoordinates )
                    {
                    // InternalFairtracksDsl.g:478:5: (lv_coordinates_35_0= ruleFTRealCoordinates )
                    // InternalFairtracksDsl.g:479:6: lv_coordinates_35_0= ruleFTRealCoordinates
                    {

                    						newCompositeNode(grammarAccess.getFTPlayerAccess().getCoordinatesFTRealCoordinatesParserRuleCall_19_4_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_coordinates_35_0=ruleFTRealCoordinates();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFTPlayerRule());
                    						}
                    						set(
                    							current,
                    							"coordinates",
                    							lv_coordinates_35_0,
                    							"ca.mcgill.ecse.fairtracks.FairtracksDsl.FTRealCoordinates");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_36=(Token)match(input,27,FOLLOW_26); 

                    				newLeafNode(otherlv_36, grammarAccess.getFTPlayerAccess().getRightSquareBracketKeyword_19_5());
                    			

                    }
                    break;

            }

            otherlv_37=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_37, grammarAccess.getFTPlayerAccess().getRightCurlyBracketKeyword_20());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFTPlayer"


    // $ANTLR start "entryRuleFTPickUpColorClass"
    // InternalFairtracksDsl.g:509:1: entryRuleFTPickUpColorClass returns [EObject current=null] : iv_ruleFTPickUpColorClass= ruleFTPickUpColorClass EOF ;
    public final EObject entryRuleFTPickUpColorClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFTPickUpColorClass = null;


        try {
            // InternalFairtracksDsl.g:509:59: (iv_ruleFTPickUpColorClass= ruleFTPickUpColorClass EOF )
            // InternalFairtracksDsl.g:510:2: iv_ruleFTPickUpColorClass= ruleFTPickUpColorClass EOF
            {
             newCompositeNode(grammarAccess.getFTPickUpColorClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFTPickUpColorClass=ruleFTPickUpColorClass();

            state._fsp--;

             current =iv_ruleFTPickUpColorClass; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFTPickUpColorClass"


    // $ANTLR start "ruleFTPickUpColorClass"
    // InternalFairtracksDsl.g:516:1: ruleFTPickUpColorClass returns [EObject current=null] : ( (lv_color_0_0= ruleFTPickUpColor ) ) ;
    public final EObject ruleFTPickUpColorClass() throws RecognitionException {
        EObject current = null;

        Enumerator lv_color_0_0 = null;



        	enterRule();

        try {
            // InternalFairtracksDsl.g:522:2: ( ( (lv_color_0_0= ruleFTPickUpColor ) ) )
            // InternalFairtracksDsl.g:523:2: ( (lv_color_0_0= ruleFTPickUpColor ) )
            {
            // InternalFairtracksDsl.g:523:2: ( (lv_color_0_0= ruleFTPickUpColor ) )
            // InternalFairtracksDsl.g:524:3: (lv_color_0_0= ruleFTPickUpColor )
            {
            // InternalFairtracksDsl.g:524:3: (lv_color_0_0= ruleFTPickUpColor )
            // InternalFairtracksDsl.g:525:4: lv_color_0_0= ruleFTPickUpColor
            {

            				newCompositeNode(grammarAccess.getFTPickUpColorClassAccess().getColorFTPickUpColorEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_color_0_0=ruleFTPickUpColor();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getFTPickUpColorClassRule());
            				}
            				set(
            					current,
            					"color",
            					lv_color_0_0,
            					"ca.mcgill.ecse.fairtracks.FairtracksDsl.FTPickUpColor");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFTPickUpColorClass"


    // $ANTLR start "entryRuleFTZone"
    // InternalFairtracksDsl.g:545:1: entryRuleFTZone returns [EObject current=null] : iv_ruleFTZone= ruleFTZone EOF ;
    public final EObject entryRuleFTZone() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFTZone = null;


        try {
            // InternalFairtracksDsl.g:545:47: (iv_ruleFTZone= ruleFTZone EOF )
            // InternalFairtracksDsl.g:546:2: iv_ruleFTZone= ruleFTZone EOF
            {
             newCompositeNode(grammarAccess.getFTZoneRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFTZone=ruleFTZone();

            state._fsp--;

             current =iv_ruleFTZone; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFTZone"


    // $ANTLR start "ruleFTZone"
    // InternalFairtracksDsl.g:552:1: ruleFTZone returns [EObject current=null] : (otherlv_0= 'Zone' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ';' otherlv_7= 'size' otherlv_8= ':' ( (lv_size_9_0= ruleFTSize ) ) otherlv_10= ';' otherlv_11= 'zoneType' otherlv_12= ':' ( (lv_type_13_0= ruleFTZoneType ) ) otherlv_14= ';' (otherlv_15= 'contains' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ';' )? (otherlv_21= 'partiallyOverlaps' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) (otherlv_24= ',' ( (otherlv_25= RULE_ID ) ) )* otherlv_26= ';' )? (otherlv_27= 'isAdjacentTo' otherlv_28= ':' ( (otherlv_29= RULE_ID ) ) (otherlv_30= ',' ( (otherlv_31= RULE_ID ) ) )* otherlv_32= ';' )? (otherlv_33= 'disallowedPlayers' otherlv_34= ':' ( (otherlv_35= RULE_ID ) ) (otherlv_36= ',' ( (otherlv_37= RULE_ID ) ) )* otherlv_38= ';' )? (otherlv_39= 'distance' otherlv_40= ':' ( (lv_distanceClass_41_0= ruleFTDistance ) ) otherlv_42= ';' )* (otherlv_43= 'Real' otherlv_44= 'Coordinates' otherlv_45= ':' otherlv_46= '[' ( (lv_coordinates_47_0= ruleFTRealCoordinates ) ) otherlv_48= ']' )? otherlv_49= '}' ) ;
    public final EObject ruleFTZone() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token otherlv_44=null;
        Token otherlv_45=null;
        Token otherlv_46=null;
        Token otherlv_48=null;
        Token otherlv_49=null;
        Enumerator lv_size_9_0 = null;

        Enumerator lv_type_13_0 = null;

        EObject lv_distanceClass_41_0 = null;

        EObject lv_coordinates_47_0 = null;



        	enterRule();

        try {
            // InternalFairtracksDsl.g:558:2: ( (otherlv_0= 'Zone' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ';' otherlv_7= 'size' otherlv_8= ':' ( (lv_size_9_0= ruleFTSize ) ) otherlv_10= ';' otherlv_11= 'zoneType' otherlv_12= ':' ( (lv_type_13_0= ruleFTZoneType ) ) otherlv_14= ';' (otherlv_15= 'contains' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ';' )? (otherlv_21= 'partiallyOverlaps' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) (otherlv_24= ',' ( (otherlv_25= RULE_ID ) ) )* otherlv_26= ';' )? (otherlv_27= 'isAdjacentTo' otherlv_28= ':' ( (otherlv_29= RULE_ID ) ) (otherlv_30= ',' ( (otherlv_31= RULE_ID ) ) )* otherlv_32= ';' )? (otherlv_33= 'disallowedPlayers' otherlv_34= ':' ( (otherlv_35= RULE_ID ) ) (otherlv_36= ',' ( (otherlv_37= RULE_ID ) ) )* otherlv_38= ';' )? (otherlv_39= 'distance' otherlv_40= ':' ( (lv_distanceClass_41_0= ruleFTDistance ) ) otherlv_42= ';' )* (otherlv_43= 'Real' otherlv_44= 'Coordinates' otherlv_45= ':' otherlv_46= '[' ( (lv_coordinates_47_0= ruleFTRealCoordinates ) ) otherlv_48= ']' )? otherlv_49= '}' ) )
            // InternalFairtracksDsl.g:559:2: (otherlv_0= 'Zone' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ';' otherlv_7= 'size' otherlv_8= ':' ( (lv_size_9_0= ruleFTSize ) ) otherlv_10= ';' otherlv_11= 'zoneType' otherlv_12= ':' ( (lv_type_13_0= ruleFTZoneType ) ) otherlv_14= ';' (otherlv_15= 'contains' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ';' )? (otherlv_21= 'partiallyOverlaps' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) (otherlv_24= ',' ( (otherlv_25= RULE_ID ) ) )* otherlv_26= ';' )? (otherlv_27= 'isAdjacentTo' otherlv_28= ':' ( (otherlv_29= RULE_ID ) ) (otherlv_30= ',' ( (otherlv_31= RULE_ID ) ) )* otherlv_32= ';' )? (otherlv_33= 'disallowedPlayers' otherlv_34= ':' ( (otherlv_35= RULE_ID ) ) (otherlv_36= ',' ( (otherlv_37= RULE_ID ) ) )* otherlv_38= ';' )? (otherlv_39= 'distance' otherlv_40= ':' ( (lv_distanceClass_41_0= ruleFTDistance ) ) otherlv_42= ';' )* (otherlv_43= 'Real' otherlv_44= 'Coordinates' otherlv_45= ':' otherlv_46= '[' ( (lv_coordinates_47_0= ruleFTRealCoordinates ) ) otherlv_48= ']' )? otherlv_49= '}' )
            {
            // InternalFairtracksDsl.g:559:2: (otherlv_0= 'Zone' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ';' otherlv_7= 'size' otherlv_8= ':' ( (lv_size_9_0= ruleFTSize ) ) otherlv_10= ';' otherlv_11= 'zoneType' otherlv_12= ':' ( (lv_type_13_0= ruleFTZoneType ) ) otherlv_14= ';' (otherlv_15= 'contains' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ';' )? (otherlv_21= 'partiallyOverlaps' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) (otherlv_24= ',' ( (otherlv_25= RULE_ID ) ) )* otherlv_26= ';' )? (otherlv_27= 'isAdjacentTo' otherlv_28= ':' ( (otherlv_29= RULE_ID ) ) (otherlv_30= ',' ( (otherlv_31= RULE_ID ) ) )* otherlv_32= ';' )? (otherlv_33= 'disallowedPlayers' otherlv_34= ':' ( (otherlv_35= RULE_ID ) ) (otherlv_36= ',' ( (otherlv_37= RULE_ID ) ) )* otherlv_38= ';' )? (otherlv_39= 'distance' otherlv_40= ':' ( (lv_distanceClass_41_0= ruleFTDistance ) ) otherlv_42= ';' )* (otherlv_43= 'Real' otherlv_44= 'Coordinates' otherlv_45= ':' otherlv_46= '[' ( (lv_coordinates_47_0= ruleFTRealCoordinates ) ) otherlv_48= ']' )? otherlv_49= '}' )
            // InternalFairtracksDsl.g:560:3: otherlv_0= 'Zone' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ';' otherlv_7= 'size' otherlv_8= ':' ( (lv_size_9_0= ruleFTSize ) ) otherlv_10= ';' otherlv_11= 'zoneType' otherlv_12= ':' ( (lv_type_13_0= ruleFTZoneType ) ) otherlv_14= ';' (otherlv_15= 'contains' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ';' )? (otherlv_21= 'partiallyOverlaps' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) (otherlv_24= ',' ( (otherlv_25= RULE_ID ) ) )* otherlv_26= ';' )? (otherlv_27= 'isAdjacentTo' otherlv_28= ':' ( (otherlv_29= RULE_ID ) ) (otherlv_30= ',' ( (otherlv_31= RULE_ID ) ) )* otherlv_32= ';' )? (otherlv_33= 'disallowedPlayers' otherlv_34= ':' ( (otherlv_35= RULE_ID ) ) (otherlv_36= ',' ( (otherlv_37= RULE_ID ) ) )* otherlv_38= ';' )? (otherlv_39= 'distance' otherlv_40= ':' ( (lv_distanceClass_41_0= ruleFTDistance ) ) otherlv_42= ';' )* (otherlv_43= 'Real' otherlv_44= 'Coordinates' otherlv_45= ':' otherlv_46= '[' ( (lv_coordinates_47_0= ruleFTRealCoordinates ) ) otherlv_48= ']' )? otherlv_49= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getFTZoneAccess().getZoneKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getFTZoneAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getFTZoneAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getFTZoneAccess().getNameKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getFTZoneAccess().getColonKeyword_4());
            		
            // InternalFairtracksDsl.g:580:3: ( (lv_name_5_0= RULE_ID ) )
            // InternalFairtracksDsl.g:581:4: (lv_name_5_0= RULE_ID )
            {
            // InternalFairtracksDsl.g:581:4: (lv_name_5_0= RULE_ID )
            // InternalFairtracksDsl.g:582:5: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_5_0, grammarAccess.getFTZoneAccess().getNameIDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFTZoneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getFTZoneAccess().getSemicolonKeyword_6());
            		
            otherlv_7=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getFTZoneAccess().getSizeKeyword_7());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_8, grammarAccess.getFTZoneAccess().getColonKeyword_8());
            		
            // InternalFairtracksDsl.g:610:3: ( (lv_size_9_0= ruleFTSize ) )
            // InternalFairtracksDsl.g:611:4: (lv_size_9_0= ruleFTSize )
            {
            // InternalFairtracksDsl.g:611:4: (lv_size_9_0= ruleFTSize )
            // InternalFairtracksDsl.g:612:5: lv_size_9_0= ruleFTSize
            {

            					newCompositeNode(grammarAccess.getFTZoneAccess().getSizeFTSizeEnumRuleCall_9_0());
            				
            pushFollow(FOLLOW_10);
            lv_size_9_0=ruleFTSize();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFTZoneRule());
            					}
            					set(
            						current,
            						"size",
            						lv_size_9_0,
            						"ca.mcgill.ecse.fairtracks.FairtracksDsl.FTSize");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,16,FOLLOW_27); 

            			newLeafNode(otherlv_10, grammarAccess.getFTZoneAccess().getSemicolonKeyword_10());
            		
            otherlv_11=(Token)match(input,30,FOLLOW_8); 

            			newLeafNode(otherlv_11, grammarAccess.getFTZoneAccess().getZoneTypeKeyword_11());
            		
            otherlv_12=(Token)match(input,15,FOLLOW_28); 

            			newLeafNode(otherlv_12, grammarAccess.getFTZoneAccess().getColonKeyword_12());
            		
            // InternalFairtracksDsl.g:641:3: ( (lv_type_13_0= ruleFTZoneType ) )
            // InternalFairtracksDsl.g:642:4: (lv_type_13_0= ruleFTZoneType )
            {
            // InternalFairtracksDsl.g:642:4: (lv_type_13_0= ruleFTZoneType )
            // InternalFairtracksDsl.g:643:5: lv_type_13_0= ruleFTZoneType
            {

            					newCompositeNode(grammarAccess.getFTZoneAccess().getTypeFTZoneTypeEnumRuleCall_13_0());
            				
            pushFollow(FOLLOW_10);
            lv_type_13_0=ruleFTZoneType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFTZoneRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_13_0,
            						"ca.mcgill.ecse.fairtracks.FairtracksDsl.FTZoneType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,16,FOLLOW_29); 

            			newLeafNode(otherlv_14, grammarAccess.getFTZoneAccess().getSemicolonKeyword_14());
            		
            // InternalFairtracksDsl.g:664:3: (otherlv_15= 'contains' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ';' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalFairtracksDsl.g:665:4: otherlv_15= 'contains' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ';'
                    {
                    otherlv_15=(Token)match(input,31,FOLLOW_8); 

                    				newLeafNode(otherlv_15, grammarAccess.getFTZoneAccess().getContainsKeyword_15_0());
                    			
                    otherlv_16=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_16, grammarAccess.getFTZoneAccess().getColonKeyword_15_1());
                    			
                    // InternalFairtracksDsl.g:673:4: ( (otherlv_17= RULE_ID ) )
                    // InternalFairtracksDsl.g:674:5: (otherlv_17= RULE_ID )
                    {
                    // InternalFairtracksDsl.g:674:5: (otherlv_17= RULE_ID )
                    // InternalFairtracksDsl.g:675:6: otherlv_17= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFTZoneRule());
                    						}
                    					
                    otherlv_17=(Token)match(input,RULE_ID,FOLLOW_19); 

                    						newLeafNode(otherlv_17, grammarAccess.getFTZoneAccess().getContainsFTZoneCrossReference_15_2_0());
                    					

                    }


                    }

                    // InternalFairtracksDsl.g:686:4: (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==22) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalFairtracksDsl.g:687:5: otherlv_18= ',' ( (otherlv_19= RULE_ID ) )
                    	    {
                    	    otherlv_18=(Token)match(input,22,FOLLOW_9); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getFTZoneAccess().getCommaKeyword_15_3_0());
                    	    				
                    	    // InternalFairtracksDsl.g:691:5: ( (otherlv_19= RULE_ID ) )
                    	    // InternalFairtracksDsl.g:692:6: (otherlv_19= RULE_ID )
                    	    {
                    	    // InternalFairtracksDsl.g:692:6: (otherlv_19= RULE_ID )
                    	    // InternalFairtracksDsl.g:693:7: otherlv_19= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getFTZoneRule());
                    	    							}
                    	    						
                    	    otherlv_19=(Token)match(input,RULE_ID,FOLLOW_19); 

                    	    							newLeafNode(otherlv_19, grammarAccess.getFTZoneAccess().getContainsFTZoneCrossReference_15_3_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,16,FOLLOW_30); 

                    				newLeafNode(otherlv_20, grammarAccess.getFTZoneAccess().getSemicolonKeyword_15_4());
                    			

                    }
                    break;

            }

            // InternalFairtracksDsl.g:710:3: (otherlv_21= 'partiallyOverlaps' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) (otherlv_24= ',' ( (otherlv_25= RULE_ID ) ) )* otherlv_26= ';' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalFairtracksDsl.g:711:4: otherlv_21= 'partiallyOverlaps' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) (otherlv_24= ',' ( (otherlv_25= RULE_ID ) ) )* otherlv_26= ';'
                    {
                    otherlv_21=(Token)match(input,32,FOLLOW_8); 

                    				newLeafNode(otherlv_21, grammarAccess.getFTZoneAccess().getPartiallyOverlapsKeyword_16_0());
                    			
                    otherlv_22=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_22, grammarAccess.getFTZoneAccess().getColonKeyword_16_1());
                    			
                    // InternalFairtracksDsl.g:719:4: ( (otherlv_23= RULE_ID ) )
                    // InternalFairtracksDsl.g:720:5: (otherlv_23= RULE_ID )
                    {
                    // InternalFairtracksDsl.g:720:5: (otherlv_23= RULE_ID )
                    // InternalFairtracksDsl.g:721:6: otherlv_23= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFTZoneRule());
                    						}
                    					
                    otherlv_23=(Token)match(input,RULE_ID,FOLLOW_19); 

                    						newLeafNode(otherlv_23, grammarAccess.getFTZoneAccess().getPartiallyOverlapsFTZoneCrossReference_16_2_0());
                    					

                    }


                    }

                    // InternalFairtracksDsl.g:732:4: (otherlv_24= ',' ( (otherlv_25= RULE_ID ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==22) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalFairtracksDsl.g:733:5: otherlv_24= ',' ( (otherlv_25= RULE_ID ) )
                    	    {
                    	    otherlv_24=(Token)match(input,22,FOLLOW_9); 

                    	    					newLeafNode(otherlv_24, grammarAccess.getFTZoneAccess().getCommaKeyword_16_3_0());
                    	    				
                    	    // InternalFairtracksDsl.g:737:5: ( (otherlv_25= RULE_ID ) )
                    	    // InternalFairtracksDsl.g:738:6: (otherlv_25= RULE_ID )
                    	    {
                    	    // InternalFairtracksDsl.g:738:6: (otherlv_25= RULE_ID )
                    	    // InternalFairtracksDsl.g:739:7: otherlv_25= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getFTZoneRule());
                    	    							}
                    	    						
                    	    otherlv_25=(Token)match(input,RULE_ID,FOLLOW_19); 

                    	    							newLeafNode(otherlv_25, grammarAccess.getFTZoneAccess().getPartiallyOverlapsFTZoneCrossReference_16_3_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,16,FOLLOW_31); 

                    				newLeafNode(otherlv_26, grammarAccess.getFTZoneAccess().getSemicolonKeyword_16_4());
                    			

                    }
                    break;

            }

            // InternalFairtracksDsl.g:756:3: (otherlv_27= 'isAdjacentTo' otherlv_28= ':' ( (otherlv_29= RULE_ID ) ) (otherlv_30= ',' ( (otherlv_31= RULE_ID ) ) )* otherlv_32= ';' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==33) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalFairtracksDsl.g:757:4: otherlv_27= 'isAdjacentTo' otherlv_28= ':' ( (otherlv_29= RULE_ID ) ) (otherlv_30= ',' ( (otherlv_31= RULE_ID ) ) )* otherlv_32= ';'
                    {
                    otherlv_27=(Token)match(input,33,FOLLOW_8); 

                    				newLeafNode(otherlv_27, grammarAccess.getFTZoneAccess().getIsAdjacentToKeyword_17_0());
                    			
                    otherlv_28=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_28, grammarAccess.getFTZoneAccess().getColonKeyword_17_1());
                    			
                    // InternalFairtracksDsl.g:765:4: ( (otherlv_29= RULE_ID ) )
                    // InternalFairtracksDsl.g:766:5: (otherlv_29= RULE_ID )
                    {
                    // InternalFairtracksDsl.g:766:5: (otherlv_29= RULE_ID )
                    // InternalFairtracksDsl.g:767:6: otherlv_29= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFTZoneRule());
                    						}
                    					
                    otherlv_29=(Token)match(input,RULE_ID,FOLLOW_19); 

                    						newLeafNode(otherlv_29, grammarAccess.getFTZoneAccess().getIsAdjacentToFTZoneCrossReference_17_2_0());
                    					

                    }


                    }

                    // InternalFairtracksDsl.g:778:4: (otherlv_30= ',' ( (otherlv_31= RULE_ID ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==22) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalFairtracksDsl.g:779:5: otherlv_30= ',' ( (otherlv_31= RULE_ID ) )
                    	    {
                    	    otherlv_30=(Token)match(input,22,FOLLOW_9); 

                    	    					newLeafNode(otherlv_30, grammarAccess.getFTZoneAccess().getCommaKeyword_17_3_0());
                    	    				
                    	    // InternalFairtracksDsl.g:783:5: ( (otherlv_31= RULE_ID ) )
                    	    // InternalFairtracksDsl.g:784:6: (otherlv_31= RULE_ID )
                    	    {
                    	    // InternalFairtracksDsl.g:784:6: (otherlv_31= RULE_ID )
                    	    // InternalFairtracksDsl.g:785:7: otherlv_31= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getFTZoneRule());
                    	    							}
                    	    						
                    	    otherlv_31=(Token)match(input,RULE_ID,FOLLOW_19); 

                    	    							newLeafNode(otherlv_31, grammarAccess.getFTZoneAccess().getIsAdjacentToFTZoneCrossReference_17_3_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_32=(Token)match(input,16,FOLLOW_32); 

                    				newLeafNode(otherlv_32, grammarAccess.getFTZoneAccess().getSemicolonKeyword_17_4());
                    			

                    }
                    break;

            }

            // InternalFairtracksDsl.g:802:3: (otherlv_33= 'disallowedPlayers' otherlv_34= ':' ( (otherlv_35= RULE_ID ) ) (otherlv_36= ',' ( (otherlv_37= RULE_ID ) ) )* otherlv_38= ';' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==34) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalFairtracksDsl.g:803:4: otherlv_33= 'disallowedPlayers' otherlv_34= ':' ( (otherlv_35= RULE_ID ) ) (otherlv_36= ',' ( (otherlv_37= RULE_ID ) ) )* otherlv_38= ';'
                    {
                    otherlv_33=(Token)match(input,34,FOLLOW_8); 

                    				newLeafNode(otherlv_33, grammarAccess.getFTZoneAccess().getDisallowedPlayersKeyword_18_0());
                    			
                    otherlv_34=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_34, grammarAccess.getFTZoneAccess().getColonKeyword_18_1());
                    			
                    // InternalFairtracksDsl.g:811:4: ( (otherlv_35= RULE_ID ) )
                    // InternalFairtracksDsl.g:812:5: (otherlv_35= RULE_ID )
                    {
                    // InternalFairtracksDsl.g:812:5: (otherlv_35= RULE_ID )
                    // InternalFairtracksDsl.g:813:6: otherlv_35= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFTZoneRule());
                    						}
                    					
                    otherlv_35=(Token)match(input,RULE_ID,FOLLOW_19); 

                    						newLeafNode(otherlv_35, grammarAccess.getFTZoneAccess().getDisallowedPlayersFTPlayerCrossReference_18_2_0());
                    					

                    }


                    }

                    // InternalFairtracksDsl.g:824:4: (otherlv_36= ',' ( (otherlv_37= RULE_ID ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==22) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalFairtracksDsl.g:825:5: otherlv_36= ',' ( (otherlv_37= RULE_ID ) )
                    	    {
                    	    otherlv_36=(Token)match(input,22,FOLLOW_9); 

                    	    					newLeafNode(otherlv_36, grammarAccess.getFTZoneAccess().getCommaKeyword_18_3_0());
                    	    				
                    	    // InternalFairtracksDsl.g:829:5: ( (otherlv_37= RULE_ID ) )
                    	    // InternalFairtracksDsl.g:830:6: (otherlv_37= RULE_ID )
                    	    {
                    	    // InternalFairtracksDsl.g:830:6: (otherlv_37= RULE_ID )
                    	    // InternalFairtracksDsl.g:831:7: otherlv_37= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getFTZoneRule());
                    	    							}
                    	    						
                    	    otherlv_37=(Token)match(input,RULE_ID,FOLLOW_19); 

                    	    							newLeafNode(otherlv_37, grammarAccess.getFTZoneAccess().getDisallowedPlayersFTPlayerCrossReference_18_3_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_38=(Token)match(input,16,FOLLOW_20); 

                    				newLeafNode(otherlv_38, grammarAccess.getFTZoneAccess().getSemicolonKeyword_18_4());
                    			

                    }
                    break;

            }

            // InternalFairtracksDsl.g:848:3: (otherlv_39= 'distance' otherlv_40= ':' ( (lv_distanceClass_41_0= ruleFTDistance ) ) otherlv_42= ';' )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==23) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalFairtracksDsl.g:849:4: otherlv_39= 'distance' otherlv_40= ':' ( (lv_distanceClass_41_0= ruleFTDistance ) ) otherlv_42= ';'
            	    {
            	    otherlv_39=(Token)match(input,23,FOLLOW_8); 

            	    				newLeafNode(otherlv_39, grammarAccess.getFTZoneAccess().getDistanceKeyword_19_0());
            	    			
            	    otherlv_40=(Token)match(input,15,FOLLOW_21); 

            	    				newLeafNode(otherlv_40, grammarAccess.getFTZoneAccess().getColonKeyword_19_1());
            	    			
            	    // InternalFairtracksDsl.g:857:4: ( (lv_distanceClass_41_0= ruleFTDistance ) )
            	    // InternalFairtracksDsl.g:858:5: (lv_distanceClass_41_0= ruleFTDistance )
            	    {
            	    // InternalFairtracksDsl.g:858:5: (lv_distanceClass_41_0= ruleFTDistance )
            	    // InternalFairtracksDsl.g:859:6: lv_distanceClass_41_0= ruleFTDistance
            	    {

            	    						newCompositeNode(grammarAccess.getFTZoneAccess().getDistanceClassFTDistanceParserRuleCall_19_2_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_distanceClass_41_0=ruleFTDistance();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFTZoneRule());
            	    						}
            	    						add(
            	    							current,
            	    							"distanceClass",
            	    							lv_distanceClass_41_0,
            	    							"ca.mcgill.ecse.fairtracks.FairtracksDsl.FTDistance");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_42=(Token)match(input,16,FOLLOW_20); 

            	    				newLeafNode(otherlv_42, grammarAccess.getFTZoneAccess().getSemicolonKeyword_19_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // InternalFairtracksDsl.g:881:3: (otherlv_43= 'Real' otherlv_44= 'Coordinates' otherlv_45= ':' otherlv_46= '[' ( (lv_coordinates_47_0= ruleFTRealCoordinates ) ) otherlv_48= ']' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==24) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalFairtracksDsl.g:882:4: otherlv_43= 'Real' otherlv_44= 'Coordinates' otherlv_45= ':' otherlv_46= '[' ( (lv_coordinates_47_0= ruleFTRealCoordinates ) ) otherlv_48= ']'
                    {
                    otherlv_43=(Token)match(input,24,FOLLOW_22); 

                    				newLeafNode(otherlv_43, grammarAccess.getFTZoneAccess().getRealKeyword_20_0());
                    			
                    otherlv_44=(Token)match(input,25,FOLLOW_8); 

                    				newLeafNode(otherlv_44, grammarAccess.getFTZoneAccess().getCoordinatesKeyword_20_1());
                    			
                    otherlv_45=(Token)match(input,15,FOLLOW_23); 

                    				newLeafNode(otherlv_45, grammarAccess.getFTZoneAccess().getColonKeyword_20_2());
                    			
                    otherlv_46=(Token)match(input,26,FOLLOW_24); 

                    				newLeafNode(otherlv_46, grammarAccess.getFTZoneAccess().getLeftSquareBracketKeyword_20_3());
                    			
                    // InternalFairtracksDsl.g:898:4: ( (lv_coordinates_47_0= ruleFTRealCoordinates ) )
                    // InternalFairtracksDsl.g:899:5: (lv_coordinates_47_0= ruleFTRealCoordinates )
                    {
                    // InternalFairtracksDsl.g:899:5: (lv_coordinates_47_0= ruleFTRealCoordinates )
                    // InternalFairtracksDsl.g:900:6: lv_coordinates_47_0= ruleFTRealCoordinates
                    {

                    						newCompositeNode(grammarAccess.getFTZoneAccess().getCoordinatesFTRealCoordinatesParserRuleCall_20_4_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_coordinates_47_0=ruleFTRealCoordinates();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFTZoneRule());
                    						}
                    						set(
                    							current,
                    							"coordinates",
                    							lv_coordinates_47_0,
                    							"ca.mcgill.ecse.fairtracks.FairtracksDsl.FTRealCoordinates");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_48=(Token)match(input,27,FOLLOW_26); 

                    				newLeafNode(otherlv_48, grammarAccess.getFTZoneAccess().getRightSquareBracketKeyword_20_5());
                    			

                    }
                    break;

            }

            otherlv_49=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_49, grammarAccess.getFTZoneAccess().getRightCurlyBracketKeyword_21());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFTZone"


    // $ANTLR start "entryRuleFTObstacle"
    // InternalFairtracksDsl.g:930:1: entryRuleFTObstacle returns [EObject current=null] : iv_ruleFTObstacle= ruleFTObstacle EOF ;
    public final EObject entryRuleFTObstacle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFTObstacle = null;


        try {
            // InternalFairtracksDsl.g:930:51: (iv_ruleFTObstacle= ruleFTObstacle EOF )
            // InternalFairtracksDsl.g:931:2: iv_ruleFTObstacle= ruleFTObstacle EOF
            {
             newCompositeNode(grammarAccess.getFTObstacleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFTObstacle=ruleFTObstacle();

            state._fsp--;

             current =iv_ruleFTObstacle; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFTObstacle"


    // $ANTLR start "ruleFTObstacle"
    // InternalFairtracksDsl.g:937:1: ruleFTObstacle returns [EObject current=null] : (otherlv_0= 'Obstacle' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ';' otherlv_7= 'size' otherlv_8= ':' ( (lv_size_9_0= ruleFTSize ) ) otherlv_10= ';' ( ( (lv_isMoveable_11_0= 'isMoveable' ) ) otherlv_12= ';' )? otherlv_13= 'color' otherlv_14= ':' ( (lv_color_15_0= ruleFTPickUpColor ) ) otherlv_16= ';' (otherlv_17= 'inside' otherlv_18= ':' ( (otherlv_19= RULE_ID ) ) otherlv_20= ';' )? (otherlv_21= 'disallowedZones' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) (otherlv_24= ',' ( (otherlv_25= RULE_ID ) ) )* otherlv_26= ';' )? (otherlv_27= 'distance' otherlv_28= ':' ( (lv_distanceClass_29_0= ruleFTDistance ) ) otherlv_30= ';' )* (otherlv_31= 'Real' otherlv_32= 'Coordinates' otherlv_33= ':' otherlv_34= '[' ( (lv_coordinates_35_0= ruleFTRealCoordinates ) ) otherlv_36= ']' )? otherlv_37= '}' ) ;
    public final EObject ruleFTObstacle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token lv_isMoveable_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Enumerator lv_size_9_0 = null;

        Enumerator lv_color_15_0 = null;

        EObject lv_distanceClass_29_0 = null;

        EObject lv_coordinates_35_0 = null;



        	enterRule();

        try {
            // InternalFairtracksDsl.g:943:2: ( (otherlv_0= 'Obstacle' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ';' otherlv_7= 'size' otherlv_8= ':' ( (lv_size_9_0= ruleFTSize ) ) otherlv_10= ';' ( ( (lv_isMoveable_11_0= 'isMoveable' ) ) otherlv_12= ';' )? otherlv_13= 'color' otherlv_14= ':' ( (lv_color_15_0= ruleFTPickUpColor ) ) otherlv_16= ';' (otherlv_17= 'inside' otherlv_18= ':' ( (otherlv_19= RULE_ID ) ) otherlv_20= ';' )? (otherlv_21= 'disallowedZones' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) (otherlv_24= ',' ( (otherlv_25= RULE_ID ) ) )* otherlv_26= ';' )? (otherlv_27= 'distance' otherlv_28= ':' ( (lv_distanceClass_29_0= ruleFTDistance ) ) otherlv_30= ';' )* (otherlv_31= 'Real' otherlv_32= 'Coordinates' otherlv_33= ':' otherlv_34= '[' ( (lv_coordinates_35_0= ruleFTRealCoordinates ) ) otherlv_36= ']' )? otherlv_37= '}' ) )
            // InternalFairtracksDsl.g:944:2: (otherlv_0= 'Obstacle' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ';' otherlv_7= 'size' otherlv_8= ':' ( (lv_size_9_0= ruleFTSize ) ) otherlv_10= ';' ( ( (lv_isMoveable_11_0= 'isMoveable' ) ) otherlv_12= ';' )? otherlv_13= 'color' otherlv_14= ':' ( (lv_color_15_0= ruleFTPickUpColor ) ) otherlv_16= ';' (otherlv_17= 'inside' otherlv_18= ':' ( (otherlv_19= RULE_ID ) ) otherlv_20= ';' )? (otherlv_21= 'disallowedZones' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) (otherlv_24= ',' ( (otherlv_25= RULE_ID ) ) )* otherlv_26= ';' )? (otherlv_27= 'distance' otherlv_28= ':' ( (lv_distanceClass_29_0= ruleFTDistance ) ) otherlv_30= ';' )* (otherlv_31= 'Real' otherlv_32= 'Coordinates' otherlv_33= ':' otherlv_34= '[' ( (lv_coordinates_35_0= ruleFTRealCoordinates ) ) otherlv_36= ']' )? otherlv_37= '}' )
            {
            // InternalFairtracksDsl.g:944:2: (otherlv_0= 'Obstacle' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ';' otherlv_7= 'size' otherlv_8= ':' ( (lv_size_9_0= ruleFTSize ) ) otherlv_10= ';' ( ( (lv_isMoveable_11_0= 'isMoveable' ) ) otherlv_12= ';' )? otherlv_13= 'color' otherlv_14= ':' ( (lv_color_15_0= ruleFTPickUpColor ) ) otherlv_16= ';' (otherlv_17= 'inside' otherlv_18= ':' ( (otherlv_19= RULE_ID ) ) otherlv_20= ';' )? (otherlv_21= 'disallowedZones' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) (otherlv_24= ',' ( (otherlv_25= RULE_ID ) ) )* otherlv_26= ';' )? (otherlv_27= 'distance' otherlv_28= ':' ( (lv_distanceClass_29_0= ruleFTDistance ) ) otherlv_30= ';' )* (otherlv_31= 'Real' otherlv_32= 'Coordinates' otherlv_33= ':' otherlv_34= '[' ( (lv_coordinates_35_0= ruleFTRealCoordinates ) ) otherlv_36= ']' )? otherlv_37= '}' )
            // InternalFairtracksDsl.g:945:3: otherlv_0= 'Obstacle' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ';' otherlv_7= 'size' otherlv_8= ':' ( (lv_size_9_0= ruleFTSize ) ) otherlv_10= ';' ( ( (lv_isMoveable_11_0= 'isMoveable' ) ) otherlv_12= ';' )? otherlv_13= 'color' otherlv_14= ':' ( (lv_color_15_0= ruleFTPickUpColor ) ) otherlv_16= ';' (otherlv_17= 'inside' otherlv_18= ':' ( (otherlv_19= RULE_ID ) ) otherlv_20= ';' )? (otherlv_21= 'disallowedZones' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) (otherlv_24= ',' ( (otherlv_25= RULE_ID ) ) )* otherlv_26= ';' )? (otherlv_27= 'distance' otherlv_28= ':' ( (lv_distanceClass_29_0= ruleFTDistance ) ) otherlv_30= ';' )* (otherlv_31= 'Real' otherlv_32= 'Coordinates' otherlv_33= ':' otherlv_34= '[' ( (lv_coordinates_35_0= ruleFTRealCoordinates ) ) otherlv_36= ']' )? otherlv_37= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getFTObstacleAccess().getObstacleKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getFTObstacleAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getFTObstacleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getFTObstacleAccess().getNameKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getFTObstacleAccess().getColonKeyword_4());
            		
            // InternalFairtracksDsl.g:965:3: ( (lv_name_5_0= RULE_ID ) )
            // InternalFairtracksDsl.g:966:4: (lv_name_5_0= RULE_ID )
            {
            // InternalFairtracksDsl.g:966:4: (lv_name_5_0= RULE_ID )
            // InternalFairtracksDsl.g:967:5: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_5_0, grammarAccess.getFTObstacleAccess().getNameIDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFTObstacleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getFTObstacleAccess().getSemicolonKeyword_6());
            		
            otherlv_7=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getFTObstacleAccess().getSizeKeyword_7());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_8, grammarAccess.getFTObstacleAccess().getColonKeyword_8());
            		
            // InternalFairtracksDsl.g:995:3: ( (lv_size_9_0= ruleFTSize ) )
            // InternalFairtracksDsl.g:996:4: (lv_size_9_0= ruleFTSize )
            {
            // InternalFairtracksDsl.g:996:4: (lv_size_9_0= ruleFTSize )
            // InternalFairtracksDsl.g:997:5: lv_size_9_0= ruleFTSize
            {

            					newCompositeNode(grammarAccess.getFTObstacleAccess().getSizeFTSizeEnumRuleCall_9_0());
            				
            pushFollow(FOLLOW_10);
            lv_size_9_0=ruleFTSize();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFTObstacleRule());
            					}
            					set(
            						current,
            						"size",
            						lv_size_9_0,
            						"ca.mcgill.ecse.fairtracks.FairtracksDsl.FTSize");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,16,FOLLOW_33); 

            			newLeafNode(otherlv_10, grammarAccess.getFTObstacleAccess().getSemicolonKeyword_10());
            		
            // InternalFairtracksDsl.g:1018:3: ( ( (lv_isMoveable_11_0= 'isMoveable' ) ) otherlv_12= ';' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==36) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalFairtracksDsl.g:1019:4: ( (lv_isMoveable_11_0= 'isMoveable' ) ) otherlv_12= ';'
                    {
                    // InternalFairtracksDsl.g:1019:4: ( (lv_isMoveable_11_0= 'isMoveable' ) )
                    // InternalFairtracksDsl.g:1020:5: (lv_isMoveable_11_0= 'isMoveable' )
                    {
                    // InternalFairtracksDsl.g:1020:5: (lv_isMoveable_11_0= 'isMoveable' )
                    // InternalFairtracksDsl.g:1021:6: lv_isMoveable_11_0= 'isMoveable'
                    {
                    lv_isMoveable_11_0=(Token)match(input,36,FOLLOW_10); 

                    						newLeafNode(lv_isMoveable_11_0, grammarAccess.getFTObstacleAccess().getIsMoveableIsMoveableKeyword_11_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFTObstacleRule());
                    						}
                    						setWithLastConsumed(current, "isMoveable", true, "isMoveable");
                    					

                    }


                    }

                    otherlv_12=(Token)match(input,16,FOLLOW_34); 

                    				newLeafNode(otherlv_12, grammarAccess.getFTObstacleAccess().getSemicolonKeyword_11_1());
                    			

                    }
                    break;

            }

            otherlv_13=(Token)match(input,37,FOLLOW_8); 

            			newLeafNode(otherlv_13, grammarAccess.getFTObstacleAccess().getColorKeyword_12());
            		
            otherlv_14=(Token)match(input,15,FOLLOW_18); 

            			newLeafNode(otherlv_14, grammarAccess.getFTObstacleAccess().getColonKeyword_13());
            		
            // InternalFairtracksDsl.g:1046:3: ( (lv_color_15_0= ruleFTPickUpColor ) )
            // InternalFairtracksDsl.g:1047:4: (lv_color_15_0= ruleFTPickUpColor )
            {
            // InternalFairtracksDsl.g:1047:4: (lv_color_15_0= ruleFTPickUpColor )
            // InternalFairtracksDsl.g:1048:5: lv_color_15_0= ruleFTPickUpColor
            {

            					newCompositeNode(grammarAccess.getFTObstacleAccess().getColorFTPickUpColorEnumRuleCall_14_0());
            				
            pushFollow(FOLLOW_10);
            lv_color_15_0=ruleFTPickUpColor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFTObstacleRule());
            					}
            					set(
            						current,
            						"color",
            						lv_color_15_0,
            						"ca.mcgill.ecse.fairtracks.FairtracksDsl.FTPickUpColor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_16=(Token)match(input,16,FOLLOW_35); 

            			newLeafNode(otherlv_16, grammarAccess.getFTObstacleAccess().getSemicolonKeyword_15());
            		
            // InternalFairtracksDsl.g:1069:3: (otherlv_17= 'inside' otherlv_18= ':' ( (otherlv_19= RULE_ID ) ) otherlv_20= ';' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==19) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalFairtracksDsl.g:1070:4: otherlv_17= 'inside' otherlv_18= ':' ( (otherlv_19= RULE_ID ) ) otherlv_20= ';'
                    {
                    otherlv_17=(Token)match(input,19,FOLLOW_8); 

                    				newLeafNode(otherlv_17, grammarAccess.getFTObstacleAccess().getInsideKeyword_16_0());
                    			
                    otherlv_18=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_18, grammarAccess.getFTObstacleAccess().getColonKeyword_16_1());
                    			
                    // InternalFairtracksDsl.g:1078:4: ( (otherlv_19= RULE_ID ) )
                    // InternalFairtracksDsl.g:1079:5: (otherlv_19= RULE_ID )
                    {
                    // InternalFairtracksDsl.g:1079:5: (otherlv_19= RULE_ID )
                    // InternalFairtracksDsl.g:1080:6: otherlv_19= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFTObstacleRule());
                    						}
                    					
                    otherlv_19=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(otherlv_19, grammarAccess.getFTObstacleAccess().getInitiallyInsideFTZoneCrossReference_16_2_0());
                    					

                    }


                    }

                    otherlv_20=(Token)match(input,16,FOLLOW_36); 

                    				newLeafNode(otherlv_20, grammarAccess.getFTObstacleAccess().getSemicolonKeyword_16_3());
                    			

                    }
                    break;

            }

            // InternalFairtracksDsl.g:1096:3: (otherlv_21= 'disallowedZones' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) (otherlv_24= ',' ( (otherlv_25= RULE_ID ) ) )* otherlv_26= ';' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==38) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalFairtracksDsl.g:1097:4: otherlv_21= 'disallowedZones' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) (otherlv_24= ',' ( (otherlv_25= RULE_ID ) ) )* otherlv_26= ';'
                    {
                    otherlv_21=(Token)match(input,38,FOLLOW_8); 

                    				newLeafNode(otherlv_21, grammarAccess.getFTObstacleAccess().getDisallowedZonesKeyword_17_0());
                    			
                    otherlv_22=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_22, grammarAccess.getFTObstacleAccess().getColonKeyword_17_1());
                    			
                    // InternalFairtracksDsl.g:1105:4: ( (otherlv_23= RULE_ID ) )
                    // InternalFairtracksDsl.g:1106:5: (otherlv_23= RULE_ID )
                    {
                    // InternalFairtracksDsl.g:1106:5: (otherlv_23= RULE_ID )
                    // InternalFairtracksDsl.g:1107:6: otherlv_23= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFTObstacleRule());
                    						}
                    					
                    otherlv_23=(Token)match(input,RULE_ID,FOLLOW_19); 

                    						newLeafNode(otherlv_23, grammarAccess.getFTObstacleAccess().getDisallowedZonesFTZoneCrossReference_17_2_0());
                    					

                    }


                    }

                    // InternalFairtracksDsl.g:1118:4: (otherlv_24= ',' ( (otherlv_25= RULE_ID ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==22) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalFairtracksDsl.g:1119:5: otherlv_24= ',' ( (otherlv_25= RULE_ID ) )
                    	    {
                    	    otherlv_24=(Token)match(input,22,FOLLOW_9); 

                    	    					newLeafNode(otherlv_24, grammarAccess.getFTObstacleAccess().getCommaKeyword_17_3_0());
                    	    				
                    	    // InternalFairtracksDsl.g:1123:5: ( (otherlv_25= RULE_ID ) )
                    	    // InternalFairtracksDsl.g:1124:6: (otherlv_25= RULE_ID )
                    	    {
                    	    // InternalFairtracksDsl.g:1124:6: (otherlv_25= RULE_ID )
                    	    // InternalFairtracksDsl.g:1125:7: otherlv_25= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getFTObstacleRule());
                    	    							}
                    	    						
                    	    otherlv_25=(Token)match(input,RULE_ID,FOLLOW_19); 

                    	    							newLeafNode(otherlv_25, grammarAccess.getFTObstacleAccess().getDisallowedZonesFTZoneCrossReference_17_3_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,16,FOLLOW_20); 

                    				newLeafNode(otherlv_26, grammarAccess.getFTObstacleAccess().getSemicolonKeyword_17_4());
                    			

                    }
                    break;

            }

            // InternalFairtracksDsl.g:1142:3: (otherlv_27= 'distance' otherlv_28= ':' ( (lv_distanceClass_29_0= ruleFTDistance ) ) otherlv_30= ';' )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==23) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalFairtracksDsl.g:1143:4: otherlv_27= 'distance' otherlv_28= ':' ( (lv_distanceClass_29_0= ruleFTDistance ) ) otherlv_30= ';'
            	    {
            	    otherlv_27=(Token)match(input,23,FOLLOW_8); 

            	    				newLeafNode(otherlv_27, grammarAccess.getFTObstacleAccess().getDistanceKeyword_18_0());
            	    			
            	    otherlv_28=(Token)match(input,15,FOLLOW_21); 

            	    				newLeafNode(otherlv_28, grammarAccess.getFTObstacleAccess().getColonKeyword_18_1());
            	    			
            	    // InternalFairtracksDsl.g:1151:4: ( (lv_distanceClass_29_0= ruleFTDistance ) )
            	    // InternalFairtracksDsl.g:1152:5: (lv_distanceClass_29_0= ruleFTDistance )
            	    {
            	    // InternalFairtracksDsl.g:1152:5: (lv_distanceClass_29_0= ruleFTDistance )
            	    // InternalFairtracksDsl.g:1153:6: lv_distanceClass_29_0= ruleFTDistance
            	    {

            	    						newCompositeNode(grammarAccess.getFTObstacleAccess().getDistanceClassFTDistanceParserRuleCall_18_2_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_distanceClass_29_0=ruleFTDistance();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFTObstacleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"distanceClass",
            	    							lv_distanceClass_29_0,
            	    							"ca.mcgill.ecse.fairtracks.FairtracksDsl.FTDistance");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_30=(Token)match(input,16,FOLLOW_20); 

            	    				newLeafNode(otherlv_30, grammarAccess.getFTObstacleAccess().getSemicolonKeyword_18_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            // InternalFairtracksDsl.g:1175:3: (otherlv_31= 'Real' otherlv_32= 'Coordinates' otherlv_33= ':' otherlv_34= '[' ( (lv_coordinates_35_0= ruleFTRealCoordinates ) ) otherlv_36= ']' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==24) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalFairtracksDsl.g:1176:4: otherlv_31= 'Real' otherlv_32= 'Coordinates' otherlv_33= ':' otherlv_34= '[' ( (lv_coordinates_35_0= ruleFTRealCoordinates ) ) otherlv_36= ']'
                    {
                    otherlv_31=(Token)match(input,24,FOLLOW_22); 

                    				newLeafNode(otherlv_31, grammarAccess.getFTObstacleAccess().getRealKeyword_19_0());
                    			
                    otherlv_32=(Token)match(input,25,FOLLOW_8); 

                    				newLeafNode(otherlv_32, grammarAccess.getFTObstacleAccess().getCoordinatesKeyword_19_1());
                    			
                    otherlv_33=(Token)match(input,15,FOLLOW_23); 

                    				newLeafNode(otherlv_33, grammarAccess.getFTObstacleAccess().getColonKeyword_19_2());
                    			
                    otherlv_34=(Token)match(input,26,FOLLOW_24); 

                    				newLeafNode(otherlv_34, grammarAccess.getFTObstacleAccess().getLeftSquareBracketKeyword_19_3());
                    			
                    // InternalFairtracksDsl.g:1192:4: ( (lv_coordinates_35_0= ruleFTRealCoordinates ) )
                    // InternalFairtracksDsl.g:1193:5: (lv_coordinates_35_0= ruleFTRealCoordinates )
                    {
                    // InternalFairtracksDsl.g:1193:5: (lv_coordinates_35_0= ruleFTRealCoordinates )
                    // InternalFairtracksDsl.g:1194:6: lv_coordinates_35_0= ruleFTRealCoordinates
                    {

                    						newCompositeNode(grammarAccess.getFTObstacleAccess().getCoordinatesFTRealCoordinatesParserRuleCall_19_4_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_coordinates_35_0=ruleFTRealCoordinates();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFTObstacleRule());
                    						}
                    						set(
                    							current,
                    							"coordinates",
                    							lv_coordinates_35_0,
                    							"ca.mcgill.ecse.fairtracks.FairtracksDsl.FTRealCoordinates");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_36=(Token)match(input,27,FOLLOW_26); 

                    				newLeafNode(otherlv_36, grammarAccess.getFTObstacleAccess().getRightSquareBracketKeyword_19_5());
                    			

                    }
                    break;

            }

            otherlv_37=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_37, grammarAccess.getFTObstacleAccess().getRightCurlyBracketKeyword_20());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFTObstacle"


    // $ANTLR start "entryRuleFTZipline"
    // InternalFairtracksDsl.g:1224:1: entryRuleFTZipline returns [EObject current=null] : iv_ruleFTZipline= ruleFTZipline EOF ;
    public final EObject entryRuleFTZipline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFTZipline = null;


        try {
            // InternalFairtracksDsl.g:1224:50: (iv_ruleFTZipline= ruleFTZipline EOF )
            // InternalFairtracksDsl.g:1225:2: iv_ruleFTZipline= ruleFTZipline EOF
            {
             newCompositeNode(grammarAccess.getFTZiplineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFTZipline=ruleFTZipline();

            state._fsp--;

             current =iv_ruleFTZipline; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFTZipline"


    // $ANTLR start "ruleFTZipline"
    // InternalFairtracksDsl.g:1231:1: ruleFTZipline returns [EObject current=null] : (otherlv_0= 'Zipline' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ';' otherlv_7= 'length' otherlv_8= ':' ( (lv_size_9_0= ruleFTSize ) ) otherlv_10= ';' otherlv_11= 'extremities' otherlv_12= ':' otherlv_13= '[' ( (otherlv_14= RULE_ID ) ) otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) otherlv_17= ']' otherlv_18= ';' (otherlv_19= 'Real' otherlv_20= 'Coordinates' otherlv_21= ':' otherlv_22= '[' ( (lv_coordinates_23_0= ruleFTRealCoordinates ) ) otherlv_24= ']' )? otherlv_25= '}' ) ;
    public final EObject ruleFTZipline() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Enumerator lv_size_9_0 = null;

        EObject lv_coordinates_23_0 = null;



        	enterRule();

        try {
            // InternalFairtracksDsl.g:1237:2: ( (otherlv_0= 'Zipline' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ';' otherlv_7= 'length' otherlv_8= ':' ( (lv_size_9_0= ruleFTSize ) ) otherlv_10= ';' otherlv_11= 'extremities' otherlv_12= ':' otherlv_13= '[' ( (otherlv_14= RULE_ID ) ) otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) otherlv_17= ']' otherlv_18= ';' (otherlv_19= 'Real' otherlv_20= 'Coordinates' otherlv_21= ':' otherlv_22= '[' ( (lv_coordinates_23_0= ruleFTRealCoordinates ) ) otherlv_24= ']' )? otherlv_25= '}' ) )
            // InternalFairtracksDsl.g:1238:2: (otherlv_0= 'Zipline' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ';' otherlv_7= 'length' otherlv_8= ':' ( (lv_size_9_0= ruleFTSize ) ) otherlv_10= ';' otherlv_11= 'extremities' otherlv_12= ':' otherlv_13= '[' ( (otherlv_14= RULE_ID ) ) otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) otherlv_17= ']' otherlv_18= ';' (otherlv_19= 'Real' otherlv_20= 'Coordinates' otherlv_21= ':' otherlv_22= '[' ( (lv_coordinates_23_0= ruleFTRealCoordinates ) ) otherlv_24= ']' )? otherlv_25= '}' )
            {
            // InternalFairtracksDsl.g:1238:2: (otherlv_0= 'Zipline' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ';' otherlv_7= 'length' otherlv_8= ':' ( (lv_size_9_0= ruleFTSize ) ) otherlv_10= ';' otherlv_11= 'extremities' otherlv_12= ':' otherlv_13= '[' ( (otherlv_14= RULE_ID ) ) otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) otherlv_17= ']' otherlv_18= ';' (otherlv_19= 'Real' otherlv_20= 'Coordinates' otherlv_21= ':' otherlv_22= '[' ( (lv_coordinates_23_0= ruleFTRealCoordinates ) ) otherlv_24= ']' )? otherlv_25= '}' )
            // InternalFairtracksDsl.g:1239:3: otherlv_0= 'Zipline' otherlv_1= '=' otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ';' otherlv_7= 'length' otherlv_8= ':' ( (lv_size_9_0= ruleFTSize ) ) otherlv_10= ';' otherlv_11= 'extremities' otherlv_12= ':' otherlv_13= '[' ( (otherlv_14= RULE_ID ) ) otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) otherlv_17= ']' otherlv_18= ';' (otherlv_19= 'Real' otherlv_20= 'Coordinates' otherlv_21= ':' otherlv_22= '[' ( (lv_coordinates_23_0= ruleFTRealCoordinates ) ) otherlv_24= ']' )? otherlv_25= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getFTZiplineAccess().getZiplineKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getFTZiplineAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getFTZiplineAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getFTZiplineAccess().getNameKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getFTZiplineAccess().getColonKeyword_4());
            		
            // InternalFairtracksDsl.g:1259:3: ( (lv_name_5_0= RULE_ID ) )
            // InternalFairtracksDsl.g:1260:4: (lv_name_5_0= RULE_ID )
            {
            // InternalFairtracksDsl.g:1260:4: (lv_name_5_0= RULE_ID )
            // InternalFairtracksDsl.g:1261:5: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_5_0, grammarAccess.getFTZiplineAccess().getNameIDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFTZiplineRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_37); 

            			newLeafNode(otherlv_6, grammarAccess.getFTZiplineAccess().getSemicolonKeyword_6());
            		
            otherlv_7=(Token)match(input,40,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getFTZiplineAccess().getLengthKeyword_7());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_8, grammarAccess.getFTZiplineAccess().getColonKeyword_8());
            		
            // InternalFairtracksDsl.g:1289:3: ( (lv_size_9_0= ruleFTSize ) )
            // InternalFairtracksDsl.g:1290:4: (lv_size_9_0= ruleFTSize )
            {
            // InternalFairtracksDsl.g:1290:4: (lv_size_9_0= ruleFTSize )
            // InternalFairtracksDsl.g:1291:5: lv_size_9_0= ruleFTSize
            {

            					newCompositeNode(grammarAccess.getFTZiplineAccess().getSizeFTSizeEnumRuleCall_9_0());
            				
            pushFollow(FOLLOW_10);
            lv_size_9_0=ruleFTSize();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFTZiplineRule());
            					}
            					set(
            						current,
            						"size",
            						lv_size_9_0,
            						"ca.mcgill.ecse.fairtracks.FairtracksDsl.FTSize");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,16,FOLLOW_38); 

            			newLeafNode(otherlv_10, grammarAccess.getFTZiplineAccess().getSemicolonKeyword_10());
            		
            otherlv_11=(Token)match(input,41,FOLLOW_8); 

            			newLeafNode(otherlv_11, grammarAccess.getFTZiplineAccess().getExtremitiesKeyword_11());
            		
            otherlv_12=(Token)match(input,15,FOLLOW_23); 

            			newLeafNode(otherlv_12, grammarAccess.getFTZiplineAccess().getColonKeyword_12());
            		
            otherlv_13=(Token)match(input,26,FOLLOW_9); 

            			newLeafNode(otherlv_13, grammarAccess.getFTZiplineAccess().getLeftSquareBracketKeyword_13());
            		
            // InternalFairtracksDsl.g:1324:3: ( (otherlv_14= RULE_ID ) )
            // InternalFairtracksDsl.g:1325:4: (otherlv_14= RULE_ID )
            {
            // InternalFairtracksDsl.g:1325:4: (otherlv_14= RULE_ID )
            // InternalFairtracksDsl.g:1326:5: otherlv_14= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFTZiplineRule());
            					}
            				
            otherlv_14=(Token)match(input,RULE_ID,FOLLOW_39); 

            					newLeafNode(otherlv_14, grammarAccess.getFTZiplineAccess().getStartZoneFTZoneCrossReference_14_0());
            				

            }


            }

            otherlv_15=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_15, grammarAccess.getFTZiplineAccess().getCommaKeyword_15());
            		
            // InternalFairtracksDsl.g:1341:3: ( (otherlv_16= RULE_ID ) )
            // InternalFairtracksDsl.g:1342:4: (otherlv_16= RULE_ID )
            {
            // InternalFairtracksDsl.g:1342:4: (otherlv_16= RULE_ID )
            // InternalFairtracksDsl.g:1343:5: otherlv_16= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFTZiplineRule());
            					}
            				
            otherlv_16=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_16, grammarAccess.getFTZiplineAccess().getEndZoneFTZoneCrossReference_16_0());
            				

            }


            }

            otherlv_17=(Token)match(input,27,FOLLOW_10); 

            			newLeafNode(otherlv_17, grammarAccess.getFTZiplineAccess().getRightSquareBracketKeyword_17());
            		
            otherlv_18=(Token)match(input,16,FOLLOW_40); 

            			newLeafNode(otherlv_18, grammarAccess.getFTZiplineAccess().getSemicolonKeyword_18());
            		
            // InternalFairtracksDsl.g:1362:3: (otherlv_19= 'Real' otherlv_20= 'Coordinates' otherlv_21= ':' otherlv_22= '[' ( (lv_coordinates_23_0= ruleFTRealCoordinates ) ) otherlv_24= ']' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==24) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalFairtracksDsl.g:1363:4: otherlv_19= 'Real' otherlv_20= 'Coordinates' otherlv_21= ':' otherlv_22= '[' ( (lv_coordinates_23_0= ruleFTRealCoordinates ) ) otherlv_24= ']'
                    {
                    otherlv_19=(Token)match(input,24,FOLLOW_22); 

                    				newLeafNode(otherlv_19, grammarAccess.getFTZiplineAccess().getRealKeyword_19_0());
                    			
                    otherlv_20=(Token)match(input,25,FOLLOW_8); 

                    				newLeafNode(otherlv_20, grammarAccess.getFTZiplineAccess().getCoordinatesKeyword_19_1());
                    			
                    otherlv_21=(Token)match(input,15,FOLLOW_23); 

                    				newLeafNode(otherlv_21, grammarAccess.getFTZiplineAccess().getColonKeyword_19_2());
                    			
                    otherlv_22=(Token)match(input,26,FOLLOW_24); 

                    				newLeafNode(otherlv_22, grammarAccess.getFTZiplineAccess().getLeftSquareBracketKeyword_19_3());
                    			
                    // InternalFairtracksDsl.g:1379:4: ( (lv_coordinates_23_0= ruleFTRealCoordinates ) )
                    // InternalFairtracksDsl.g:1380:5: (lv_coordinates_23_0= ruleFTRealCoordinates )
                    {
                    // InternalFairtracksDsl.g:1380:5: (lv_coordinates_23_0= ruleFTRealCoordinates )
                    // InternalFairtracksDsl.g:1381:6: lv_coordinates_23_0= ruleFTRealCoordinates
                    {

                    						newCompositeNode(grammarAccess.getFTZiplineAccess().getCoordinatesFTRealCoordinatesParserRuleCall_19_4_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_coordinates_23_0=ruleFTRealCoordinates();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFTZiplineRule());
                    						}
                    						set(
                    							current,
                    							"coordinates",
                    							lv_coordinates_23_0,
                    							"ca.mcgill.ecse.fairtracks.FairtracksDsl.FTRealCoordinates");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_24=(Token)match(input,27,FOLLOW_26); 

                    				newLeafNode(otherlv_24, grammarAccess.getFTZiplineAccess().getRightSquareBracketKeyword_19_5());
                    			

                    }
                    break;

            }

            otherlv_25=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getFTZiplineAccess().getRightCurlyBracketKeyword_20());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFTZipline"


    // $ANTLR start "entryRuleFTRealCoordinates"
    // InternalFairtracksDsl.g:1411:1: entryRuleFTRealCoordinates returns [EObject current=null] : iv_ruleFTRealCoordinates= ruleFTRealCoordinates EOF ;
    public final EObject entryRuleFTRealCoordinates() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFTRealCoordinates = null;


        try {
            // InternalFairtracksDsl.g:1411:58: (iv_ruleFTRealCoordinates= ruleFTRealCoordinates EOF )
            // InternalFairtracksDsl.g:1412:2: iv_ruleFTRealCoordinates= ruleFTRealCoordinates EOF
            {
             newCompositeNode(grammarAccess.getFTRealCoordinatesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFTRealCoordinates=ruleFTRealCoordinates();

            state._fsp--;

             current =iv_ruleFTRealCoordinates; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFTRealCoordinates"


    // $ANTLR start "ruleFTRealCoordinates"
    // InternalFairtracksDsl.g:1418:1: ruleFTRealCoordinates returns [EObject current=null] : (otherlv_0= 'Position' otherlv_1= ':' otherlv_2= '(' ( (lv_posX_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_posY_5_0= RULE_INT ) ) otherlv_6= ')' otherlv_7= ';' otherlv_8= 'Size' otherlv_9= ':' otherlv_10= '(' ( (lv_sizeX_11_0= RULE_INT ) ) otherlv_12= ',' ( (lv_sizeY_13_0= RULE_INT ) ) otherlv_14= ')' otherlv_15= ';' ) ;
    public final EObject ruleFTRealCoordinates() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_posX_3_0=null;
        Token otherlv_4=null;
        Token lv_posY_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_sizeX_11_0=null;
        Token otherlv_12=null;
        Token lv_sizeY_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;


        	enterRule();

        try {
            // InternalFairtracksDsl.g:1424:2: ( (otherlv_0= 'Position' otherlv_1= ':' otherlv_2= '(' ( (lv_posX_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_posY_5_0= RULE_INT ) ) otherlv_6= ')' otherlv_7= ';' otherlv_8= 'Size' otherlv_9= ':' otherlv_10= '(' ( (lv_sizeX_11_0= RULE_INT ) ) otherlv_12= ',' ( (lv_sizeY_13_0= RULE_INT ) ) otherlv_14= ')' otherlv_15= ';' ) )
            // InternalFairtracksDsl.g:1425:2: (otherlv_0= 'Position' otherlv_1= ':' otherlv_2= '(' ( (lv_posX_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_posY_5_0= RULE_INT ) ) otherlv_6= ')' otherlv_7= ';' otherlv_8= 'Size' otherlv_9= ':' otherlv_10= '(' ( (lv_sizeX_11_0= RULE_INT ) ) otherlv_12= ',' ( (lv_sizeY_13_0= RULE_INT ) ) otherlv_14= ')' otherlv_15= ';' )
            {
            // InternalFairtracksDsl.g:1425:2: (otherlv_0= 'Position' otherlv_1= ':' otherlv_2= '(' ( (lv_posX_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_posY_5_0= RULE_INT ) ) otherlv_6= ')' otherlv_7= ';' otherlv_8= 'Size' otherlv_9= ':' otherlv_10= '(' ( (lv_sizeX_11_0= RULE_INT ) ) otherlv_12= ',' ( (lv_sizeY_13_0= RULE_INT ) ) otherlv_14= ')' otherlv_15= ';' )
            // InternalFairtracksDsl.g:1426:3: otherlv_0= 'Position' otherlv_1= ':' otherlv_2= '(' ( (lv_posX_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_posY_5_0= RULE_INT ) ) otherlv_6= ')' otherlv_7= ';' otherlv_8= 'Size' otherlv_9= ':' otherlv_10= '(' ( (lv_sizeX_11_0= RULE_INT ) ) otherlv_12= ',' ( (lv_sizeY_13_0= RULE_INT ) ) otherlv_14= ')' otherlv_15= ';'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getFTRealCoordinatesAccess().getPositionKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_41); 

            			newLeafNode(otherlv_1, grammarAccess.getFTRealCoordinatesAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,43,FOLLOW_42); 

            			newLeafNode(otherlv_2, grammarAccess.getFTRealCoordinatesAccess().getLeftParenthesisKeyword_2());
            		
            // InternalFairtracksDsl.g:1438:3: ( (lv_posX_3_0= RULE_INT ) )
            // InternalFairtracksDsl.g:1439:4: (lv_posX_3_0= RULE_INT )
            {
            // InternalFairtracksDsl.g:1439:4: (lv_posX_3_0= RULE_INT )
            // InternalFairtracksDsl.g:1440:5: lv_posX_3_0= RULE_INT
            {
            lv_posX_3_0=(Token)match(input,RULE_INT,FOLLOW_39); 

            					newLeafNode(lv_posX_3_0, grammarAccess.getFTRealCoordinatesAccess().getPosXINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFTRealCoordinatesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"posX",
            						lv_posX_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_42); 

            			newLeafNode(otherlv_4, grammarAccess.getFTRealCoordinatesAccess().getCommaKeyword_4());
            		
            // InternalFairtracksDsl.g:1460:3: ( (lv_posY_5_0= RULE_INT ) )
            // InternalFairtracksDsl.g:1461:4: (lv_posY_5_0= RULE_INT )
            {
            // InternalFairtracksDsl.g:1461:4: (lv_posY_5_0= RULE_INT )
            // InternalFairtracksDsl.g:1462:5: lv_posY_5_0= RULE_INT
            {
            lv_posY_5_0=(Token)match(input,RULE_INT,FOLLOW_43); 

            					newLeafNode(lv_posY_5_0, grammarAccess.getFTRealCoordinatesAccess().getPosYINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFTRealCoordinatesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"posY",
            						lv_posY_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,44,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getFTRealCoordinatesAccess().getRightParenthesisKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_44); 

            			newLeafNode(otherlv_7, grammarAccess.getFTRealCoordinatesAccess().getSemicolonKeyword_7());
            		
            otherlv_8=(Token)match(input,45,FOLLOW_8); 

            			newLeafNode(otherlv_8, grammarAccess.getFTRealCoordinatesAccess().getSizeKeyword_8());
            		
            otherlv_9=(Token)match(input,15,FOLLOW_41); 

            			newLeafNode(otherlv_9, grammarAccess.getFTRealCoordinatesAccess().getColonKeyword_9());
            		
            otherlv_10=(Token)match(input,43,FOLLOW_42); 

            			newLeafNode(otherlv_10, grammarAccess.getFTRealCoordinatesAccess().getLeftParenthesisKeyword_10());
            		
            // InternalFairtracksDsl.g:1498:3: ( (lv_sizeX_11_0= RULE_INT ) )
            // InternalFairtracksDsl.g:1499:4: (lv_sizeX_11_0= RULE_INT )
            {
            // InternalFairtracksDsl.g:1499:4: (lv_sizeX_11_0= RULE_INT )
            // InternalFairtracksDsl.g:1500:5: lv_sizeX_11_0= RULE_INT
            {
            lv_sizeX_11_0=(Token)match(input,RULE_INT,FOLLOW_39); 

            					newLeafNode(lv_sizeX_11_0, grammarAccess.getFTRealCoordinatesAccess().getSizeXINTTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFTRealCoordinatesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sizeX",
            						lv_sizeX_11_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_12=(Token)match(input,22,FOLLOW_42); 

            			newLeafNode(otherlv_12, grammarAccess.getFTRealCoordinatesAccess().getCommaKeyword_12());
            		
            // InternalFairtracksDsl.g:1520:3: ( (lv_sizeY_13_0= RULE_INT ) )
            // InternalFairtracksDsl.g:1521:4: (lv_sizeY_13_0= RULE_INT )
            {
            // InternalFairtracksDsl.g:1521:4: (lv_sizeY_13_0= RULE_INT )
            // InternalFairtracksDsl.g:1522:5: lv_sizeY_13_0= RULE_INT
            {
            lv_sizeY_13_0=(Token)match(input,RULE_INT,FOLLOW_43); 

            					newLeafNode(lv_sizeY_13_0, grammarAccess.getFTRealCoordinatesAccess().getSizeYINTTerminalRuleCall_13_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFTRealCoordinatesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sizeY",
            						lv_sizeY_13_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_14=(Token)match(input,44,FOLLOW_10); 

            			newLeafNode(otherlv_14, grammarAccess.getFTRealCoordinatesAccess().getRightParenthesisKeyword_14());
            		
            otherlv_15=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getFTRealCoordinatesAccess().getSemicolonKeyword_15());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFTRealCoordinates"


    // $ANTLR start "entryRuleFTDistance"
    // InternalFairtracksDsl.g:1550:1: entryRuleFTDistance returns [EObject current=null] : iv_ruleFTDistance= ruleFTDistance EOF ;
    public final EObject entryRuleFTDistance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFTDistance = null;


        try {
            // InternalFairtracksDsl.g:1550:51: (iv_ruleFTDistance= ruleFTDistance EOF )
            // InternalFairtracksDsl.g:1551:2: iv_ruleFTDistance= ruleFTDistance EOF
            {
             newCompositeNode(grammarAccess.getFTDistanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFTDistance=ruleFTDistance();

            state._fsp--;

             current =iv_ruleFTDistance; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFTDistance"


    // $ANTLR start "ruleFTDistance"
    // InternalFairtracksDsl.g:1557:1: ruleFTDistance returns [EObject current=null] : (otherlv_0= 'is' ( (lv_distance_1_0= ruleFTDistanceValue ) ) otherlv_2= 'object' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleFTDistance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Enumerator lv_distance_1_0 = null;



        	enterRule();

        try {
            // InternalFairtracksDsl.g:1563:2: ( (otherlv_0= 'is' ( (lv_distance_1_0= ruleFTDistanceValue ) ) otherlv_2= 'object' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalFairtracksDsl.g:1564:2: (otherlv_0= 'is' ( (lv_distance_1_0= ruleFTDistanceValue ) ) otherlv_2= 'object' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalFairtracksDsl.g:1564:2: (otherlv_0= 'is' ( (lv_distance_1_0= ruleFTDistanceValue ) ) otherlv_2= 'object' ( (otherlv_3= RULE_ID ) ) )
            // InternalFairtracksDsl.g:1565:3: otherlv_0= 'is' ( (lv_distance_1_0= ruleFTDistanceValue ) ) otherlv_2= 'object' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_45); 

            			newLeafNode(otherlv_0, grammarAccess.getFTDistanceAccess().getIsKeyword_0());
            		
            // InternalFairtracksDsl.g:1569:3: ( (lv_distance_1_0= ruleFTDistanceValue ) )
            // InternalFairtracksDsl.g:1570:4: (lv_distance_1_0= ruleFTDistanceValue )
            {
            // InternalFairtracksDsl.g:1570:4: (lv_distance_1_0= ruleFTDistanceValue )
            // InternalFairtracksDsl.g:1571:5: lv_distance_1_0= ruleFTDistanceValue
            {

            					newCompositeNode(grammarAccess.getFTDistanceAccess().getDistanceFTDistanceValueEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_46);
            lv_distance_1_0=ruleFTDistanceValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFTDistanceRule());
            					}
            					set(
            						current,
            						"distance",
            						lv_distance_1_0,
            						"ca.mcgill.ecse.fairtracks.FairtracksDsl.FTDistanceValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,47,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getFTDistanceAccess().getObjectKeyword_2());
            		
            // InternalFairtracksDsl.g:1592:3: ( (otherlv_3= RULE_ID ) )
            // InternalFairtracksDsl.g:1593:4: (otherlv_3= RULE_ID )
            {
            // InternalFairtracksDsl.g:1593:4: (otherlv_3= RULE_ID )
            // InternalFairtracksDsl.g:1594:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFTDistanceRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getFTDistanceAccess().getToObjectFTObjectWithDistanceCrossReference_3_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFTDistance"


    // $ANTLR start "entryRuleFTState"
    // InternalFairtracksDsl.g:1609:1: entryRuleFTState returns [EObject current=null] : iv_ruleFTState= ruleFTState EOF ;
    public final EObject entryRuleFTState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFTState = null;


        try {
            // InternalFairtracksDsl.g:1609:48: (iv_ruleFTState= ruleFTState EOF )
            // InternalFairtracksDsl.g:1610:2: iv_ruleFTState= ruleFTState EOF
            {
             newCompositeNode(grammarAccess.getFTStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFTState=ruleFTState();

            state._fsp--;

             current =iv_ruleFTState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFTState"


    // $ANTLR start "ruleFTState"
    // InternalFairtracksDsl.g:1616:1: ruleFTState returns [EObject current=null] : (otherlv_0= 'State' otherlv_1= '=' otherlv_2= '[' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ';' otherlv_7= 'position' otherlv_8= ':' otherlv_9= '(' ( (lv_posX_10_0= RULE_INT ) ) otherlv_11= ',' ( (lv_posY_12_0= RULE_INT ) ) otherlv_13= ')' otherlv_14= ';' ( (lv_observations_15_0= ruleFTObservation ) )* (otherlv_16= 'nextState' otherlv_17= ':' ( (otherlv_18= RULE_ID ) ) otherlv_19= ';' )? otherlv_20= ']' ) ;
    public final EObject ruleFTState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_posX_10_0=null;
        Token otherlv_11=null;
        Token lv_posY_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        EObject lv_observations_15_0 = null;



        	enterRule();

        try {
            // InternalFairtracksDsl.g:1622:2: ( (otherlv_0= 'State' otherlv_1= '=' otherlv_2= '[' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ';' otherlv_7= 'position' otherlv_8= ':' otherlv_9= '(' ( (lv_posX_10_0= RULE_INT ) ) otherlv_11= ',' ( (lv_posY_12_0= RULE_INT ) ) otherlv_13= ')' otherlv_14= ';' ( (lv_observations_15_0= ruleFTObservation ) )* (otherlv_16= 'nextState' otherlv_17= ':' ( (otherlv_18= RULE_ID ) ) otherlv_19= ';' )? otherlv_20= ']' ) )
            // InternalFairtracksDsl.g:1623:2: (otherlv_0= 'State' otherlv_1= '=' otherlv_2= '[' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ';' otherlv_7= 'position' otherlv_8= ':' otherlv_9= '(' ( (lv_posX_10_0= RULE_INT ) ) otherlv_11= ',' ( (lv_posY_12_0= RULE_INT ) ) otherlv_13= ')' otherlv_14= ';' ( (lv_observations_15_0= ruleFTObservation ) )* (otherlv_16= 'nextState' otherlv_17= ':' ( (otherlv_18= RULE_ID ) ) otherlv_19= ';' )? otherlv_20= ']' )
            {
            // InternalFairtracksDsl.g:1623:2: (otherlv_0= 'State' otherlv_1= '=' otherlv_2= '[' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ';' otherlv_7= 'position' otherlv_8= ':' otherlv_9= '(' ( (lv_posX_10_0= RULE_INT ) ) otherlv_11= ',' ( (lv_posY_12_0= RULE_INT ) ) otherlv_13= ')' otherlv_14= ';' ( (lv_observations_15_0= ruleFTObservation ) )* (otherlv_16= 'nextState' otherlv_17= ':' ( (otherlv_18= RULE_ID ) ) otherlv_19= ';' )? otherlv_20= ']' )
            // InternalFairtracksDsl.g:1624:3: otherlv_0= 'State' otherlv_1= '=' otherlv_2= '[' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ';' otherlv_7= 'position' otherlv_8= ':' otherlv_9= '(' ( (lv_posX_10_0= RULE_INT ) ) otherlv_11= ',' ( (lv_posY_12_0= RULE_INT ) ) otherlv_13= ')' otherlv_14= ';' ( (lv_observations_15_0= ruleFTObservation ) )* (otherlv_16= 'nextState' otherlv_17= ':' ( (otherlv_18= RULE_ID ) ) otherlv_19= ';' )? otherlv_20= ']'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getFTStateAccess().getStateKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getFTStateAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getFTStateAccess().getLeftSquareBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getFTStateAccess().getNameKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getFTStateAccess().getColonKeyword_4());
            		
            // InternalFairtracksDsl.g:1644:3: ( (lv_name_5_0= RULE_ID ) )
            // InternalFairtracksDsl.g:1645:4: (lv_name_5_0= RULE_ID )
            {
            // InternalFairtracksDsl.g:1645:4: (lv_name_5_0= RULE_ID )
            // InternalFairtracksDsl.g:1646:5: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_5_0, grammarAccess.getFTStateAccess().getNameIDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFTStateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_47); 

            			newLeafNode(otherlv_6, grammarAccess.getFTStateAccess().getSemicolonKeyword_6());
            		
            otherlv_7=(Token)match(input,49,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getFTStateAccess().getPositionKeyword_7());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_41); 

            			newLeafNode(otherlv_8, grammarAccess.getFTStateAccess().getColonKeyword_8());
            		
            otherlv_9=(Token)match(input,43,FOLLOW_42); 

            			newLeafNode(otherlv_9, grammarAccess.getFTStateAccess().getLeftParenthesisKeyword_9());
            		
            // InternalFairtracksDsl.g:1678:3: ( (lv_posX_10_0= RULE_INT ) )
            // InternalFairtracksDsl.g:1679:4: (lv_posX_10_0= RULE_INT )
            {
            // InternalFairtracksDsl.g:1679:4: (lv_posX_10_0= RULE_INT )
            // InternalFairtracksDsl.g:1680:5: lv_posX_10_0= RULE_INT
            {
            lv_posX_10_0=(Token)match(input,RULE_INT,FOLLOW_39); 

            					newLeafNode(lv_posX_10_0, grammarAccess.getFTStateAccess().getPosXINTTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFTStateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"posX",
            						lv_posX_10_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_11=(Token)match(input,22,FOLLOW_42); 

            			newLeafNode(otherlv_11, grammarAccess.getFTStateAccess().getCommaKeyword_11());
            		
            // InternalFairtracksDsl.g:1700:3: ( (lv_posY_12_0= RULE_INT ) )
            // InternalFairtracksDsl.g:1701:4: (lv_posY_12_0= RULE_INT )
            {
            // InternalFairtracksDsl.g:1701:4: (lv_posY_12_0= RULE_INT )
            // InternalFairtracksDsl.g:1702:5: lv_posY_12_0= RULE_INT
            {
            lv_posY_12_0=(Token)match(input,RULE_INT,FOLLOW_43); 

            					newLeafNode(lv_posY_12_0, grammarAccess.getFTStateAccess().getPosYINTTerminalRuleCall_12_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFTStateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"posY",
            						lv_posY_12_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_13=(Token)match(input,44,FOLLOW_10); 

            			newLeafNode(otherlv_13, grammarAccess.getFTStateAccess().getRightParenthesisKeyword_13());
            		
            otherlv_14=(Token)match(input,16,FOLLOW_48); 

            			newLeafNode(otherlv_14, grammarAccess.getFTStateAccess().getSemicolonKeyword_14());
            		
            // InternalFairtracksDsl.g:1726:3: ( (lv_observations_15_0= ruleFTObservation ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=51 && LA28_0<=54)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalFairtracksDsl.g:1727:4: (lv_observations_15_0= ruleFTObservation )
            	    {
            	    // InternalFairtracksDsl.g:1727:4: (lv_observations_15_0= ruleFTObservation )
            	    // InternalFairtracksDsl.g:1728:5: lv_observations_15_0= ruleFTObservation
            	    {

            	    					newCompositeNode(grammarAccess.getFTStateAccess().getObservationsFTObservationParserRuleCall_15_0());
            	    				
            	    pushFollow(FOLLOW_48);
            	    lv_observations_15_0=ruleFTObservation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFTStateRule());
            	    					}
            	    					add(
            	    						current,
            	    						"observations",
            	    						lv_observations_15_0,
            	    						"ca.mcgill.ecse.fairtracks.FairtracksDsl.FTObservation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            // InternalFairtracksDsl.g:1745:3: (otherlv_16= 'nextState' otherlv_17= ':' ( (otherlv_18= RULE_ID ) ) otherlv_19= ';' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==50) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalFairtracksDsl.g:1746:4: otherlv_16= 'nextState' otherlv_17= ':' ( (otherlv_18= RULE_ID ) ) otherlv_19= ';'
                    {
                    otherlv_16=(Token)match(input,50,FOLLOW_8); 

                    				newLeafNode(otherlv_16, grammarAccess.getFTStateAccess().getNextStateKeyword_16_0());
                    			
                    otherlv_17=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_17, grammarAccess.getFTStateAccess().getColonKeyword_16_1());
                    			
                    // InternalFairtracksDsl.g:1754:4: ( (otherlv_18= RULE_ID ) )
                    // InternalFairtracksDsl.g:1755:5: (otherlv_18= RULE_ID )
                    {
                    // InternalFairtracksDsl.g:1755:5: (otherlv_18= RULE_ID )
                    // InternalFairtracksDsl.g:1756:6: otherlv_18= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFTStateRule());
                    						}
                    					
                    otherlv_18=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(otherlv_18, grammarAccess.getFTStateAccess().getNextStateFTStateCrossReference_16_2_0());
                    					

                    }


                    }

                    otherlv_19=(Token)match(input,16,FOLLOW_25); 

                    				newLeafNode(otherlv_19, grammarAccess.getFTStateAccess().getSemicolonKeyword_16_3());
                    			

                    }
                    break;

            }

            otherlv_20=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getFTStateAccess().getRightSquareBracketKeyword_17());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFTState"


    // $ANTLR start "entryRuleFTObservation"
    // InternalFairtracksDsl.g:1780:1: entryRuleFTObservation returns [EObject current=null] : iv_ruleFTObservation= ruleFTObservation EOF ;
    public final EObject entryRuleFTObservation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFTObservation = null;


        try {
            // InternalFairtracksDsl.g:1780:54: (iv_ruleFTObservation= ruleFTObservation EOF )
            // InternalFairtracksDsl.g:1781:2: iv_ruleFTObservation= ruleFTObservation EOF
            {
             newCompositeNode(grammarAccess.getFTObservationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFTObservation=ruleFTObservation();

            state._fsp--;

             current =iv_ruleFTObservation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFTObservation"


    // $ANTLR start "ruleFTObservation"
    // InternalFairtracksDsl.g:1787:1: ruleFTObservation returns [EObject current=null] : (this_FTDistanceObs_0= ruleFTDistanceObs | this_FTHangingObs_1= ruleFTHangingObs | this_FTPickUpObs_2= ruleFTPickUpObs | this_FTZoneObs_3= ruleFTZoneObs ) ;
    public final EObject ruleFTObservation() throws RecognitionException {
        EObject current = null;

        EObject this_FTDistanceObs_0 = null;

        EObject this_FTHangingObs_1 = null;

        EObject this_FTPickUpObs_2 = null;

        EObject this_FTZoneObs_3 = null;



        	enterRule();

        try {
            // InternalFairtracksDsl.g:1793:2: ( (this_FTDistanceObs_0= ruleFTDistanceObs | this_FTHangingObs_1= ruleFTHangingObs | this_FTPickUpObs_2= ruleFTPickUpObs | this_FTZoneObs_3= ruleFTZoneObs ) )
            // InternalFairtracksDsl.g:1794:2: (this_FTDistanceObs_0= ruleFTDistanceObs | this_FTHangingObs_1= ruleFTHangingObs | this_FTPickUpObs_2= ruleFTPickUpObs | this_FTZoneObs_3= ruleFTZoneObs )
            {
            // InternalFairtracksDsl.g:1794:2: (this_FTDistanceObs_0= ruleFTDistanceObs | this_FTHangingObs_1= ruleFTHangingObs | this_FTPickUpObs_2= ruleFTPickUpObs | this_FTZoneObs_3= ruleFTZoneObs )
            int alt30=4;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt30=1;
                }
                break;
            case 52:
                {
                alt30=2;
                }
                break;
            case 53:
                {
                alt30=3;
                }
                break;
            case 54:
                {
                alt30=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalFairtracksDsl.g:1795:3: this_FTDistanceObs_0= ruleFTDistanceObs
                    {

                    			newCompositeNode(grammarAccess.getFTObservationAccess().getFTDistanceObsParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FTDistanceObs_0=ruleFTDistanceObs();

                    state._fsp--;


                    			current = this_FTDistanceObs_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFairtracksDsl.g:1804:3: this_FTHangingObs_1= ruleFTHangingObs
                    {

                    			newCompositeNode(grammarAccess.getFTObservationAccess().getFTHangingObsParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FTHangingObs_1=ruleFTHangingObs();

                    state._fsp--;


                    			current = this_FTHangingObs_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalFairtracksDsl.g:1813:3: this_FTPickUpObs_2= ruleFTPickUpObs
                    {

                    			newCompositeNode(grammarAccess.getFTObservationAccess().getFTPickUpObsParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_FTPickUpObs_2=ruleFTPickUpObs();

                    state._fsp--;


                    			current = this_FTPickUpObs_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalFairtracksDsl.g:1822:3: this_FTZoneObs_3= ruleFTZoneObs
                    {

                    			newCompositeNode(grammarAccess.getFTObservationAccess().getFTZoneObsParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_FTZoneObs_3=ruleFTZoneObs();

                    state._fsp--;


                    			current = this_FTZoneObs_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFTObservation"


    // $ANTLR start "entryRuleFTDistanceObs"
    // InternalFairtracksDsl.g:1834:1: entryRuleFTDistanceObs returns [EObject current=null] : iv_ruleFTDistanceObs= ruleFTDistanceObs EOF ;
    public final EObject entryRuleFTDistanceObs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFTDistanceObs = null;


        try {
            // InternalFairtracksDsl.g:1834:54: (iv_ruleFTDistanceObs= ruleFTDistanceObs EOF )
            // InternalFairtracksDsl.g:1835:2: iv_ruleFTDistanceObs= ruleFTDistanceObs EOF
            {
             newCompositeNode(grammarAccess.getFTDistanceObsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFTDistanceObs=ruleFTDistanceObs();

            state._fsp--;

             current =iv_ruleFTDistanceObs; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFTDistanceObs"


    // $ANTLR start "ruleFTDistanceObs"
    // InternalFairtracksDsl.g:1841:1: ruleFTDistanceObs returns [EObject current=null] : (otherlv_0= 'distanceIs' otherlv_1= ':' ( (lv_distance_2_0= ruleFTDistanceValue ) ) ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleFTDistanceObs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Enumerator lv_distance_2_0 = null;



        	enterRule();

        try {
            // InternalFairtracksDsl.g:1847:2: ( (otherlv_0= 'distanceIs' otherlv_1= ':' ( (lv_distance_2_0= ruleFTDistanceValue ) ) ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalFairtracksDsl.g:1848:2: (otherlv_0= 'distanceIs' otherlv_1= ':' ( (lv_distance_2_0= ruleFTDistanceValue ) ) ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalFairtracksDsl.g:1848:2: (otherlv_0= 'distanceIs' otherlv_1= ':' ( (lv_distance_2_0= ruleFTDistanceValue ) ) ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalFairtracksDsl.g:1849:3: otherlv_0= 'distanceIs' otherlv_1= ':' ( (lv_distance_2_0= ruleFTDistanceValue ) ) ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getFTDistanceObsAccess().getDistanceIsKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_45); 

            			newLeafNode(otherlv_1, grammarAccess.getFTDistanceObsAccess().getColonKeyword_1());
            		
            // InternalFairtracksDsl.g:1857:3: ( (lv_distance_2_0= ruleFTDistanceValue ) )
            // InternalFairtracksDsl.g:1858:4: (lv_distance_2_0= ruleFTDistanceValue )
            {
            // InternalFairtracksDsl.g:1858:4: (lv_distance_2_0= ruleFTDistanceValue )
            // InternalFairtracksDsl.g:1859:5: lv_distance_2_0= ruleFTDistanceValue
            {

            					newCompositeNode(grammarAccess.getFTDistanceObsAccess().getDistanceFTDistanceValueEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_distance_2_0=ruleFTDistanceValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFTDistanceObsRule());
            					}
            					set(
            						current,
            						"distance",
            						lv_distance_2_0,
            						"ca.mcgill.ecse.fairtracks.FairtracksDsl.FTDistanceValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFairtracksDsl.g:1876:3: ( (otherlv_3= RULE_ID ) )
            // InternalFairtracksDsl.g:1877:4: (otherlv_3= RULE_ID )
            {
            // InternalFairtracksDsl.g:1877:4: (otherlv_3= RULE_ID )
            // InternalFairtracksDsl.g:1878:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFTDistanceObsRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_3, grammarAccess.getFTDistanceObsAccess().getObjectFTObjectWithDistanceCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getFTDistanceObsAccess().getSemicolonKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFTDistanceObs"


    // $ANTLR start "entryRuleFTHangingObs"
    // InternalFairtracksDsl.g:1897:1: entryRuleFTHangingObs returns [EObject current=null] : iv_ruleFTHangingObs= ruleFTHangingObs EOF ;
    public final EObject entryRuleFTHangingObs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFTHangingObs = null;


        try {
            // InternalFairtracksDsl.g:1897:53: (iv_ruleFTHangingObs= ruleFTHangingObs EOF )
            // InternalFairtracksDsl.g:1898:2: iv_ruleFTHangingObs= ruleFTHangingObs EOF
            {
             newCompositeNode(grammarAccess.getFTHangingObsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFTHangingObs=ruleFTHangingObs();

            state._fsp--;

             current =iv_ruleFTHangingObs; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFTHangingObs"


    // $ANTLR start "ruleFTHangingObs"
    // InternalFairtracksDsl.g:1904:1: ruleFTHangingObs returns [EObject current=null] : (otherlv_0= 'hangingFrom' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleFTHangingObs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalFairtracksDsl.g:1910:2: ( (otherlv_0= 'hangingFrom' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalFairtracksDsl.g:1911:2: (otherlv_0= 'hangingFrom' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalFairtracksDsl.g:1911:2: (otherlv_0= 'hangingFrom' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' )
            // InternalFairtracksDsl.g:1912:3: otherlv_0= 'hangingFrom' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getFTHangingObsAccess().getHangingFromKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getFTHangingObsAccess().getColonKeyword_1());
            		
            // InternalFairtracksDsl.g:1920:3: ( (otherlv_2= RULE_ID ) )
            // InternalFairtracksDsl.g:1921:4: (otherlv_2= RULE_ID )
            {
            // InternalFairtracksDsl.g:1921:4: (otherlv_2= RULE_ID )
            // InternalFairtracksDsl.g:1922:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFTHangingObsRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_2, grammarAccess.getFTHangingObsAccess().getObjectFTZiplineCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getFTHangingObsAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFTHangingObs"


    // $ANTLR start "entryRuleFTPickUpObs"
    // InternalFairtracksDsl.g:1941:1: entryRuleFTPickUpObs returns [EObject current=null] : iv_ruleFTPickUpObs= ruleFTPickUpObs EOF ;
    public final EObject entryRuleFTPickUpObs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFTPickUpObs = null;


        try {
            // InternalFairtracksDsl.g:1941:52: (iv_ruleFTPickUpObs= ruleFTPickUpObs EOF )
            // InternalFairtracksDsl.g:1942:2: iv_ruleFTPickUpObs= ruleFTPickUpObs EOF
            {
             newCompositeNode(grammarAccess.getFTPickUpObsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFTPickUpObs=ruleFTPickUpObs();

            state._fsp--;

             current =iv_ruleFTPickUpObs; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFTPickUpObs"


    // $ANTLR start "ruleFTPickUpObs"
    // InternalFairtracksDsl.g:1948:1: ruleFTPickUpObs returns [EObject current=null] : (otherlv_0= 'pickedUp' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleFTPickUpObs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalFairtracksDsl.g:1954:2: ( (otherlv_0= 'pickedUp' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalFairtracksDsl.g:1955:2: (otherlv_0= 'pickedUp' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalFairtracksDsl.g:1955:2: (otherlv_0= 'pickedUp' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' )
            // InternalFairtracksDsl.g:1956:3: otherlv_0= 'pickedUp' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getFTPickUpObsAccess().getPickedUpKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getFTPickUpObsAccess().getColonKeyword_1());
            		
            // InternalFairtracksDsl.g:1964:3: ( (otherlv_2= RULE_ID ) )
            // InternalFairtracksDsl.g:1965:4: (otherlv_2= RULE_ID )
            {
            // InternalFairtracksDsl.g:1965:4: (otherlv_2= RULE_ID )
            // InternalFairtracksDsl.g:1966:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFTPickUpObsRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_2, grammarAccess.getFTPickUpObsAccess().getObjectFTObstacleCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getFTPickUpObsAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFTPickUpObs"


    // $ANTLR start "entryRuleFTZoneObs"
    // InternalFairtracksDsl.g:1985:1: entryRuleFTZoneObs returns [EObject current=null] : iv_ruleFTZoneObs= ruleFTZoneObs EOF ;
    public final EObject entryRuleFTZoneObs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFTZoneObs = null;


        try {
            // InternalFairtracksDsl.g:1985:50: (iv_ruleFTZoneObs= ruleFTZoneObs EOF )
            // InternalFairtracksDsl.g:1986:2: iv_ruleFTZoneObs= ruleFTZoneObs EOF
            {
             newCompositeNode(grammarAccess.getFTZoneObsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFTZoneObs=ruleFTZoneObs();

            state._fsp--;

             current =iv_ruleFTZoneObs; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFTZoneObs"


    // $ANTLR start "ruleFTZoneObs"
    // InternalFairtracksDsl.g:1992:1: ruleFTZoneObs returns [EObject current=null] : (otherlv_0= 'inZone' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleFTZoneObs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalFairtracksDsl.g:1998:2: ( (otherlv_0= 'inZone' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalFairtracksDsl.g:1999:2: (otherlv_0= 'inZone' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalFairtracksDsl.g:1999:2: (otherlv_0= 'inZone' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' )
            // InternalFairtracksDsl.g:2000:3: otherlv_0= 'inZone' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getFTZoneObsAccess().getInZoneKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getFTZoneObsAccess().getColonKeyword_1());
            		
            // InternalFairtracksDsl.g:2008:3: ( (otherlv_2= RULE_ID ) )
            // InternalFairtracksDsl.g:2009:4: (otherlv_2= RULE_ID )
            {
            // InternalFairtracksDsl.g:2009:4: (otherlv_2= RULE_ID )
            // InternalFairtracksDsl.g:2010:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFTZoneObsRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_2, grammarAccess.getFTZoneObsAccess().getObjectFTZoneCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getFTZoneObsAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFTZoneObs"


    // $ANTLR start "ruleFTPickUpColor"
    // InternalFairtracksDsl.g:2029:1: ruleFTPickUpColor returns [Enumerator current=null] : ( (enumLiteral_0= 'Red' ) | (enumLiteral_1= 'Blue' ) | (enumLiteral_2= 'Yellow' ) | (enumLiteral_3= 'White' ) | (enumLiteral_4= 'Other' ) ) ;
    public final Enumerator ruleFTPickUpColor() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalFairtracksDsl.g:2035:2: ( ( (enumLiteral_0= 'Red' ) | (enumLiteral_1= 'Blue' ) | (enumLiteral_2= 'Yellow' ) | (enumLiteral_3= 'White' ) | (enumLiteral_4= 'Other' ) ) )
            // InternalFairtracksDsl.g:2036:2: ( (enumLiteral_0= 'Red' ) | (enumLiteral_1= 'Blue' ) | (enumLiteral_2= 'Yellow' ) | (enumLiteral_3= 'White' ) | (enumLiteral_4= 'Other' ) )
            {
            // InternalFairtracksDsl.g:2036:2: ( (enumLiteral_0= 'Red' ) | (enumLiteral_1= 'Blue' ) | (enumLiteral_2= 'Yellow' ) | (enumLiteral_3= 'White' ) | (enumLiteral_4= 'Other' ) )
            int alt31=5;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt31=1;
                }
                break;
            case 56:
                {
                alt31=2;
                }
                break;
            case 57:
                {
                alt31=3;
                }
                break;
            case 58:
                {
                alt31=4;
                }
                break;
            case 59:
                {
                alt31=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalFairtracksDsl.g:2037:3: (enumLiteral_0= 'Red' )
                    {
                    // InternalFairtracksDsl.g:2037:3: (enumLiteral_0= 'Red' )
                    // InternalFairtracksDsl.g:2038:4: enumLiteral_0= 'Red'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getFTPickUpColorAccess().getRedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFTPickUpColorAccess().getRedEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFairtracksDsl.g:2045:3: (enumLiteral_1= 'Blue' )
                    {
                    // InternalFairtracksDsl.g:2045:3: (enumLiteral_1= 'Blue' )
                    // InternalFairtracksDsl.g:2046:4: enumLiteral_1= 'Blue'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getFTPickUpColorAccess().getBlueEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFTPickUpColorAccess().getBlueEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalFairtracksDsl.g:2053:3: (enumLiteral_2= 'Yellow' )
                    {
                    // InternalFairtracksDsl.g:2053:3: (enumLiteral_2= 'Yellow' )
                    // InternalFairtracksDsl.g:2054:4: enumLiteral_2= 'Yellow'
                    {
                    enumLiteral_2=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getFTPickUpColorAccess().getYellowEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getFTPickUpColorAccess().getYellowEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalFairtracksDsl.g:2061:3: (enumLiteral_3= 'White' )
                    {
                    // InternalFairtracksDsl.g:2061:3: (enumLiteral_3= 'White' )
                    // InternalFairtracksDsl.g:2062:4: enumLiteral_3= 'White'
                    {
                    enumLiteral_3=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getFTPickUpColorAccess().getWhiteEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getFTPickUpColorAccess().getWhiteEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalFairtracksDsl.g:2069:3: (enumLiteral_4= 'Other' )
                    {
                    // InternalFairtracksDsl.g:2069:3: (enumLiteral_4= 'Other' )
                    // InternalFairtracksDsl.g:2070:4: enumLiteral_4= 'Other'
                    {
                    enumLiteral_4=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getFTPickUpColorAccess().getOtherEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getFTPickUpColorAccess().getOtherEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFTPickUpColor"


    // $ANTLR start "ruleFTRole"
    // InternalFairtracksDsl.g:2080:1: ruleFTRole returns [Enumerator current=null] : ( (enumLiteral_0= 'Attack' ) | (enumLiteral_1= 'Defense' ) ) ;
    public final Enumerator ruleFTRole() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalFairtracksDsl.g:2086:2: ( ( (enumLiteral_0= 'Attack' ) | (enumLiteral_1= 'Defense' ) ) )
            // InternalFairtracksDsl.g:2087:2: ( (enumLiteral_0= 'Attack' ) | (enumLiteral_1= 'Defense' ) )
            {
            // InternalFairtracksDsl.g:2087:2: ( (enumLiteral_0= 'Attack' ) | (enumLiteral_1= 'Defense' ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==60) ) {
                alt32=1;
            }
            else if ( (LA32_0==61) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalFairtracksDsl.g:2088:3: (enumLiteral_0= 'Attack' )
                    {
                    // InternalFairtracksDsl.g:2088:3: (enumLiteral_0= 'Attack' )
                    // InternalFairtracksDsl.g:2089:4: enumLiteral_0= 'Attack'
                    {
                    enumLiteral_0=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getFTRoleAccess().getAttackEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFTRoleAccess().getAttackEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFairtracksDsl.g:2096:3: (enumLiteral_1= 'Defense' )
                    {
                    // InternalFairtracksDsl.g:2096:3: (enumLiteral_1= 'Defense' )
                    // InternalFairtracksDsl.g:2097:4: enumLiteral_1= 'Defense'
                    {
                    enumLiteral_1=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getFTRoleAccess().getDefenseEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFTRoleAccess().getDefenseEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFTRole"


    // $ANTLR start "ruleFTZoneType"
    // InternalFairtracksDsl.g:2107:1: ruleFTZoneType returns [Enumerator current=null] : ( (enumLiteral_0= 'Background' ) | (enumLiteral_1= 'Green' ) | (enumLiteral_2= 'Red' ) | (enumLiteral_3= 'Passage' ) | (enumLiteral_4= 'Ball' ) | (enumLiteral_5= 'Search' ) | (enumLiteral_6= 'Start' ) | (enumLiteral_7= 'Zipline' ) ) ;
    public final Enumerator ruleFTZoneType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;


        	enterRule();

        try {
            // InternalFairtracksDsl.g:2113:2: ( ( (enumLiteral_0= 'Background' ) | (enumLiteral_1= 'Green' ) | (enumLiteral_2= 'Red' ) | (enumLiteral_3= 'Passage' ) | (enumLiteral_4= 'Ball' ) | (enumLiteral_5= 'Search' ) | (enumLiteral_6= 'Start' ) | (enumLiteral_7= 'Zipline' ) ) )
            // InternalFairtracksDsl.g:2114:2: ( (enumLiteral_0= 'Background' ) | (enumLiteral_1= 'Green' ) | (enumLiteral_2= 'Red' ) | (enumLiteral_3= 'Passage' ) | (enumLiteral_4= 'Ball' ) | (enumLiteral_5= 'Search' ) | (enumLiteral_6= 'Start' ) | (enumLiteral_7= 'Zipline' ) )
            {
            // InternalFairtracksDsl.g:2114:2: ( (enumLiteral_0= 'Background' ) | (enumLiteral_1= 'Green' ) | (enumLiteral_2= 'Red' ) | (enumLiteral_3= 'Passage' ) | (enumLiteral_4= 'Ball' ) | (enumLiteral_5= 'Search' ) | (enumLiteral_6= 'Start' ) | (enumLiteral_7= 'Zipline' ) )
            int alt33=8;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt33=1;
                }
                break;
            case 63:
                {
                alt33=2;
                }
                break;
            case 55:
                {
                alt33=3;
                }
                break;
            case 64:
                {
                alt33=4;
                }
                break;
            case 65:
                {
                alt33=5;
                }
                break;
            case 66:
                {
                alt33=6;
                }
                break;
            case 67:
                {
                alt33=7;
                }
                break;
            case 39:
                {
                alt33=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalFairtracksDsl.g:2115:3: (enumLiteral_0= 'Background' )
                    {
                    // InternalFairtracksDsl.g:2115:3: (enumLiteral_0= 'Background' )
                    // InternalFairtracksDsl.g:2116:4: enumLiteral_0= 'Background'
                    {
                    enumLiteral_0=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getFTZoneTypeAccess().getBackgroundEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFTZoneTypeAccess().getBackgroundEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFairtracksDsl.g:2123:3: (enumLiteral_1= 'Green' )
                    {
                    // InternalFairtracksDsl.g:2123:3: (enumLiteral_1= 'Green' )
                    // InternalFairtracksDsl.g:2124:4: enumLiteral_1= 'Green'
                    {
                    enumLiteral_1=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getFTZoneTypeAccess().getGreenEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFTZoneTypeAccess().getGreenEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalFairtracksDsl.g:2131:3: (enumLiteral_2= 'Red' )
                    {
                    // InternalFairtracksDsl.g:2131:3: (enumLiteral_2= 'Red' )
                    // InternalFairtracksDsl.g:2132:4: enumLiteral_2= 'Red'
                    {
                    enumLiteral_2=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getFTZoneTypeAccess().getRedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getFTZoneTypeAccess().getRedEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalFairtracksDsl.g:2139:3: (enumLiteral_3= 'Passage' )
                    {
                    // InternalFairtracksDsl.g:2139:3: (enumLiteral_3= 'Passage' )
                    // InternalFairtracksDsl.g:2140:4: enumLiteral_3= 'Passage'
                    {
                    enumLiteral_3=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getFTZoneTypeAccess().getPassageEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getFTZoneTypeAccess().getPassageEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalFairtracksDsl.g:2147:3: (enumLiteral_4= 'Ball' )
                    {
                    // InternalFairtracksDsl.g:2147:3: (enumLiteral_4= 'Ball' )
                    // InternalFairtracksDsl.g:2148:4: enumLiteral_4= 'Ball'
                    {
                    enumLiteral_4=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getFTZoneTypeAccess().getBallEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getFTZoneTypeAccess().getBallEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalFairtracksDsl.g:2155:3: (enumLiteral_5= 'Search' )
                    {
                    // InternalFairtracksDsl.g:2155:3: (enumLiteral_5= 'Search' )
                    // InternalFairtracksDsl.g:2156:4: enumLiteral_5= 'Search'
                    {
                    enumLiteral_5=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getFTZoneTypeAccess().getSearchEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getFTZoneTypeAccess().getSearchEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalFairtracksDsl.g:2163:3: (enumLiteral_6= 'Start' )
                    {
                    // InternalFairtracksDsl.g:2163:3: (enumLiteral_6= 'Start' )
                    // InternalFairtracksDsl.g:2164:4: enumLiteral_6= 'Start'
                    {
                    enumLiteral_6=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getFTZoneTypeAccess().getStartEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getFTZoneTypeAccess().getStartEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalFairtracksDsl.g:2171:3: (enumLiteral_7= 'Zipline' )
                    {
                    // InternalFairtracksDsl.g:2171:3: (enumLiteral_7= 'Zipline' )
                    // InternalFairtracksDsl.g:2172:4: enumLiteral_7= 'Zipline'
                    {
                    enumLiteral_7=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getFTZoneTypeAccess().getZiplineEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getFTZoneTypeAccess().getZiplineEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFTZoneType"


    // $ANTLR start "ruleFTDistanceValue"
    // InternalFairtracksDsl.g:2182:1: ruleFTDistanceValue returns [Enumerator current=null] : ( (enumLiteral_0= 'VeryFarFrom' ) | (enumLiteral_1= 'FarFrom' ) | (enumLiteral_2= 'CloseTo' ) | (enumLiteral_3= 'DangerouslyCloseTo' ) ) ;
    public final Enumerator ruleFTDistanceValue() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalFairtracksDsl.g:2188:2: ( ( (enumLiteral_0= 'VeryFarFrom' ) | (enumLiteral_1= 'FarFrom' ) | (enumLiteral_2= 'CloseTo' ) | (enumLiteral_3= 'DangerouslyCloseTo' ) ) )
            // InternalFairtracksDsl.g:2189:2: ( (enumLiteral_0= 'VeryFarFrom' ) | (enumLiteral_1= 'FarFrom' ) | (enumLiteral_2= 'CloseTo' ) | (enumLiteral_3= 'DangerouslyCloseTo' ) )
            {
            // InternalFairtracksDsl.g:2189:2: ( (enumLiteral_0= 'VeryFarFrom' ) | (enumLiteral_1= 'FarFrom' ) | (enumLiteral_2= 'CloseTo' ) | (enumLiteral_3= 'DangerouslyCloseTo' ) )
            int alt34=4;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt34=1;
                }
                break;
            case 69:
                {
                alt34=2;
                }
                break;
            case 70:
                {
                alt34=3;
                }
                break;
            case 71:
                {
                alt34=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalFairtracksDsl.g:2190:3: (enumLiteral_0= 'VeryFarFrom' )
                    {
                    // InternalFairtracksDsl.g:2190:3: (enumLiteral_0= 'VeryFarFrom' )
                    // InternalFairtracksDsl.g:2191:4: enumLiteral_0= 'VeryFarFrom'
                    {
                    enumLiteral_0=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getFTDistanceValueAccess().getVeryFarFromEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFTDistanceValueAccess().getVeryFarFromEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFairtracksDsl.g:2198:3: (enumLiteral_1= 'FarFrom' )
                    {
                    // InternalFairtracksDsl.g:2198:3: (enumLiteral_1= 'FarFrom' )
                    // InternalFairtracksDsl.g:2199:4: enumLiteral_1= 'FarFrom'
                    {
                    enumLiteral_1=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getFTDistanceValueAccess().getFarFromEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFTDistanceValueAccess().getFarFromEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalFairtracksDsl.g:2206:3: (enumLiteral_2= 'CloseTo' )
                    {
                    // InternalFairtracksDsl.g:2206:3: (enumLiteral_2= 'CloseTo' )
                    // InternalFairtracksDsl.g:2207:4: enumLiteral_2= 'CloseTo'
                    {
                    enumLiteral_2=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getFTDistanceValueAccess().getCloseToEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getFTDistanceValueAccess().getCloseToEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalFairtracksDsl.g:2214:3: (enumLiteral_3= 'DangerouslyCloseTo' )
                    {
                    // InternalFairtracksDsl.g:2214:3: (enumLiteral_3= 'DangerouslyCloseTo' )
                    // InternalFairtracksDsl.g:2215:4: enumLiteral_3= 'DangerouslyCloseTo'
                    {
                    enumLiteral_3=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getFTDistanceValueAccess().getDangerouslyCloseToEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getFTDistanceValueAccess().getDangerouslyCloseToEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFTDistanceValue"


    // $ANTLR start "ruleFTSize"
    // InternalFairtracksDsl.g:2225:1: ruleFTSize returns [Enumerator current=null] : ( (enumLiteral_0= 'Point' ) | (enumLiteral_1= 'Small' ) | (enumLiteral_2= 'Medium' ) | (enumLiteral_3= 'Big' ) ) ;
    public final Enumerator ruleFTSize() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalFairtracksDsl.g:2231:2: ( ( (enumLiteral_0= 'Point' ) | (enumLiteral_1= 'Small' ) | (enumLiteral_2= 'Medium' ) | (enumLiteral_3= 'Big' ) ) )
            // InternalFairtracksDsl.g:2232:2: ( (enumLiteral_0= 'Point' ) | (enumLiteral_1= 'Small' ) | (enumLiteral_2= 'Medium' ) | (enumLiteral_3= 'Big' ) )
            {
            // InternalFairtracksDsl.g:2232:2: ( (enumLiteral_0= 'Point' ) | (enumLiteral_1= 'Small' ) | (enumLiteral_2= 'Medium' ) | (enumLiteral_3= 'Big' ) )
            int alt35=4;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt35=1;
                }
                break;
            case 73:
                {
                alt35=2;
                }
                break;
            case 74:
                {
                alt35=3;
                }
                break;
            case 75:
                {
                alt35=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalFairtracksDsl.g:2233:3: (enumLiteral_0= 'Point' )
                    {
                    // InternalFairtracksDsl.g:2233:3: (enumLiteral_0= 'Point' )
                    // InternalFairtracksDsl.g:2234:4: enumLiteral_0= 'Point'
                    {
                    enumLiteral_0=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getFTSizeAccess().getPointEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFTSizeAccess().getPointEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFairtracksDsl.g:2241:3: (enumLiteral_1= 'Small' )
                    {
                    // InternalFairtracksDsl.g:2241:3: (enumLiteral_1= 'Small' )
                    // InternalFairtracksDsl.g:2242:4: enumLiteral_1= 'Small'
                    {
                    enumLiteral_1=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getFTSizeAccess().getSmallEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFTSizeAccess().getSmallEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalFairtracksDsl.g:2249:3: (enumLiteral_2= 'Medium' )
                    {
                    // InternalFairtracksDsl.g:2249:3: (enumLiteral_2= 'Medium' )
                    // InternalFairtracksDsl.g:2250:4: enumLiteral_2= 'Medium'
                    {
                    enumLiteral_2=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getFTSizeAccess().getMediumEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getFTSizeAccess().getMediumEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalFairtracksDsl.g:2257:3: (enumLiteral_3= 'Big' )
                    {
                    // InternalFairtracksDsl.g:2257:3: (enumLiteral_3= 'Big' )
                    // InternalFairtracksDsl.g:2258:4: enumLiteral_3= 'Big'
                    {
                    enumLiteral_3=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getFTSizeAccess().getBigEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getFTSizeAccess().getBigEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFTSize"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000408820000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000F00L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x3000000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000011B80000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000011B00000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000011A00000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0F80000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000011800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0xC080008000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000791800000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000711800000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000611800000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000411800000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000004011880000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000004011800000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000011000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x007C000008000000L});

}
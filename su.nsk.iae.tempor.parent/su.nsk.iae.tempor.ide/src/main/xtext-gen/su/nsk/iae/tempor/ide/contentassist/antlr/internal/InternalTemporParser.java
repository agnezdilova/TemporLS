package su.nsk.iae.tempor.ide.contentassist.antlr.internal;

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
import su.nsk.iae.tempor.services.TemporGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTemporParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INTEGER", "RULE_BOOLEAN_LITERAL", "RULE_ID", "RULE_OR_OPERATOR", "RULE_INTERVAL", "RULE_DIGIT", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'XOR'", "'#T'", "','", "'BOOL'", "'INT'", "'AND'", "'&&'", "'FE'", "'RE'", "'HIGH'", "'LOW'", "'NOT'", "'!'", "'Always'", "'=='", "'<>'", "'<='", "'>='", "'<'", "'>'", "'VAR_INPUT'", "'END_VAR'", "';'", "'VAR_OUTPUT'", "':'", "'SENTENCE'", "'END_SENTENCE'", "'='", "'TAU'", "'('", "')'", "'REQUIREMENT'", "'END_REQUIREMENT'", "'.'", "'After'", "'should'", "'remain'", "'valid'", "'until'", "'always'", "'either'", "'or'", "'Reaction'", "'is'", "'reaction'", "'which'", "'must'", "'occur'", "'from'", "'after'", "'within'", "'immediately'"
    };
    public static final int T__50=50;
    public static final int RULE_INTERVAL=9;
    public static final int T__19=19;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=7;
    public static final int RULE_BOOLEAN_LITERAL=6;
    public static final int RULE_DIGIT=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=11;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=4;
    public static final int RULE_OR_OPERATOR=8;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=14;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int RULE_INTEGER=5;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalTemporParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTemporParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTemporParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTempor.g"; }


    	private TemporGrammarAccess grammarAccess;

    	public void setGrammarAccess(TemporGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalTempor.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalTempor.g:54:1: ( ruleModel EOF )
            // InternalTempor.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalTempor.g:62:1: ruleModel : ( ( rule__Model__Alternatives )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:66:2: ( ( ( rule__Model__Alternatives )* ) )
            // InternalTempor.g:67:2: ( ( rule__Model__Alternatives )* )
            {
            // InternalTempor.g:67:2: ( ( rule__Model__Alternatives )* )
            // InternalTempor.g:68:3: ( rule__Model__Alternatives )*
            {
             before(grammarAccess.getModelAccess().getAlternatives()); 
            // InternalTempor.g:69:3: ( rule__Model__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==36||LA1_0==39||LA1_0==41||LA1_0==47) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTempor.g:69:4: rule__Model__Alternatives
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleVariableType"
    // InternalTempor.g:78:1: entryRuleVariableType : ruleVariableType EOF ;
    public final void entryRuleVariableType() throws RecognitionException {
        try {
            // InternalTempor.g:79:1: ( ruleVariableType EOF )
            // InternalTempor.g:80:1: ruleVariableType EOF
            {
             before(grammarAccess.getVariableTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableType();

            state._fsp--;

             after(grammarAccess.getVariableTypeRule()); 
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
    // $ANTLR end "entryRuleVariableType"


    // $ANTLR start "ruleVariableType"
    // InternalTempor.g:87:1: ruleVariableType : ( ( rule__VariableType__Alternatives ) ) ;
    public final void ruleVariableType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:91:2: ( ( ( rule__VariableType__Alternatives ) ) )
            // InternalTempor.g:92:2: ( ( rule__VariableType__Alternatives ) )
            {
            // InternalTempor.g:92:2: ( ( rule__VariableType__Alternatives ) )
            // InternalTempor.g:93:3: ( rule__VariableType__Alternatives )
            {
             before(grammarAccess.getVariableTypeAccess().getAlternatives()); 
            // InternalTempor.g:94:3: ( rule__VariableType__Alternatives )
            // InternalTempor.g:94:4: rule__VariableType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VariableType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVariableTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableType"


    // $ANTLR start "entryRuleDeclVarInput"
    // InternalTempor.g:103:1: entryRuleDeclVarInput : ruleDeclVarInput EOF ;
    public final void entryRuleDeclVarInput() throws RecognitionException {
        try {
            // InternalTempor.g:104:1: ( ruleDeclVarInput EOF )
            // InternalTempor.g:105:1: ruleDeclVarInput EOF
            {
             before(grammarAccess.getDeclVarInputRule()); 
            pushFollow(FOLLOW_1);
            ruleDeclVarInput();

            state._fsp--;

             after(grammarAccess.getDeclVarInputRule()); 
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
    // $ANTLR end "entryRuleDeclVarInput"


    // $ANTLR start "ruleDeclVarInput"
    // InternalTempor.g:112:1: ruleDeclVarInput : ( ( rule__DeclVarInput__Group__0 ) ) ;
    public final void ruleDeclVarInput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:116:2: ( ( ( rule__DeclVarInput__Group__0 ) ) )
            // InternalTempor.g:117:2: ( ( rule__DeclVarInput__Group__0 ) )
            {
            // InternalTempor.g:117:2: ( ( rule__DeclVarInput__Group__0 ) )
            // InternalTempor.g:118:3: ( rule__DeclVarInput__Group__0 )
            {
             before(grammarAccess.getDeclVarInputAccess().getGroup()); 
            // InternalTempor.g:119:3: ( rule__DeclVarInput__Group__0 )
            // InternalTempor.g:119:4: rule__DeclVarInput__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DeclVarInput__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeclVarInputAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclVarInput"


    // $ANTLR start "entryRuleDeclVarOutput"
    // InternalTempor.g:128:1: entryRuleDeclVarOutput : ruleDeclVarOutput EOF ;
    public final void entryRuleDeclVarOutput() throws RecognitionException {
        try {
            // InternalTempor.g:129:1: ( ruleDeclVarOutput EOF )
            // InternalTempor.g:130:1: ruleDeclVarOutput EOF
            {
             before(grammarAccess.getDeclVarOutputRule()); 
            pushFollow(FOLLOW_1);
            ruleDeclVarOutput();

            state._fsp--;

             after(grammarAccess.getDeclVarOutputRule()); 
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
    // $ANTLR end "entryRuleDeclVarOutput"


    // $ANTLR start "ruleDeclVarOutput"
    // InternalTempor.g:137:1: ruleDeclVarOutput : ( ( rule__DeclVarOutput__Group__0 ) ) ;
    public final void ruleDeclVarOutput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:141:2: ( ( ( rule__DeclVarOutput__Group__0 ) ) )
            // InternalTempor.g:142:2: ( ( rule__DeclVarOutput__Group__0 ) )
            {
            // InternalTempor.g:142:2: ( ( rule__DeclVarOutput__Group__0 ) )
            // InternalTempor.g:143:3: ( rule__DeclVarOutput__Group__0 )
            {
             before(grammarAccess.getDeclVarOutputAccess().getGroup()); 
            // InternalTempor.g:144:3: ( rule__DeclVarOutput__Group__0 )
            // InternalTempor.g:144:4: rule__DeclVarOutput__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DeclVarOutput__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeclVarOutputAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclVarOutput"


    // $ANTLR start "entryRuleVarDeclaration"
    // InternalTempor.g:153:1: entryRuleVarDeclaration : ruleVarDeclaration EOF ;
    public final void entryRuleVarDeclaration() throws RecognitionException {
        try {
            // InternalTempor.g:154:1: ( ruleVarDeclaration EOF )
            // InternalTempor.g:155:1: ruleVarDeclaration EOF
            {
             before(grammarAccess.getVarDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleVarDeclaration();

            state._fsp--;

             after(grammarAccess.getVarDeclarationRule()); 
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
    // $ANTLR end "entryRuleVarDeclaration"


    // $ANTLR start "ruleVarDeclaration"
    // InternalTempor.g:162:1: ruleVarDeclaration : ( ( rule__VarDeclaration__Group__0 ) ) ;
    public final void ruleVarDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:166:2: ( ( ( rule__VarDeclaration__Group__0 ) ) )
            // InternalTempor.g:167:2: ( ( rule__VarDeclaration__Group__0 ) )
            {
            // InternalTempor.g:167:2: ( ( rule__VarDeclaration__Group__0 ) )
            // InternalTempor.g:168:3: ( rule__VarDeclaration__Group__0 )
            {
             before(grammarAccess.getVarDeclarationAccess().getGroup()); 
            // InternalTempor.g:169:3: ( rule__VarDeclaration__Group__0 )
            // InternalTempor.g:169:4: rule__VarDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVarDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVarDeclaration"


    // $ANTLR start "entryRuleSentDeclaration"
    // InternalTempor.g:178:1: entryRuleSentDeclaration : ruleSentDeclaration EOF ;
    public final void entryRuleSentDeclaration() throws RecognitionException {
        try {
            // InternalTempor.g:179:1: ( ruleSentDeclaration EOF )
            // InternalTempor.g:180:1: ruleSentDeclaration EOF
            {
             before(grammarAccess.getSentDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleSentDeclaration();

            state._fsp--;

             after(grammarAccess.getSentDeclarationRule()); 
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
    // $ANTLR end "entryRuleSentDeclaration"


    // $ANTLR start "ruleSentDeclaration"
    // InternalTempor.g:187:1: ruleSentDeclaration : ( ( rule__SentDeclaration__Group__0 ) ) ;
    public final void ruleSentDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:191:2: ( ( ( rule__SentDeclaration__Group__0 ) ) )
            // InternalTempor.g:192:2: ( ( rule__SentDeclaration__Group__0 ) )
            {
            // InternalTempor.g:192:2: ( ( rule__SentDeclaration__Group__0 ) )
            // InternalTempor.g:193:3: ( rule__SentDeclaration__Group__0 )
            {
             before(grammarAccess.getSentDeclarationAccess().getGroup()); 
            // InternalTempor.g:194:3: ( rule__SentDeclaration__Group__0 )
            // InternalTempor.g:194:4: rule__SentDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SentDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSentDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSentDeclaration"


    // $ANTLR start "entryRuleSentenceDeclaration"
    // InternalTempor.g:203:1: entryRuleSentenceDeclaration : ruleSentenceDeclaration EOF ;
    public final void entryRuleSentenceDeclaration() throws RecognitionException {
        try {
            // InternalTempor.g:204:1: ( ruleSentenceDeclaration EOF )
            // InternalTempor.g:205:1: ruleSentenceDeclaration EOF
            {
             before(grammarAccess.getSentenceDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleSentenceDeclaration();

            state._fsp--;

             after(grammarAccess.getSentenceDeclarationRule()); 
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
    // $ANTLR end "entryRuleSentenceDeclaration"


    // $ANTLR start "ruleSentenceDeclaration"
    // InternalTempor.g:212:1: ruleSentenceDeclaration : ( ( rule__SentenceDeclaration__Group__0 ) ) ;
    public final void ruleSentenceDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:216:2: ( ( ( rule__SentenceDeclaration__Group__0 ) ) )
            // InternalTempor.g:217:2: ( ( rule__SentenceDeclaration__Group__0 ) )
            {
            // InternalTempor.g:217:2: ( ( rule__SentenceDeclaration__Group__0 ) )
            // InternalTempor.g:218:3: ( rule__SentenceDeclaration__Group__0 )
            {
             before(grammarAccess.getSentenceDeclarationAccess().getGroup()); 
            // InternalTempor.g:219:3: ( rule__SentenceDeclaration__Group__0 )
            // InternalTempor.g:219:4: rule__SentenceDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SentenceDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSentenceDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSentenceDeclaration"


    // $ANTLR start "entryRuleExpression"
    // InternalTempor.g:228:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalTempor.g:229:1: ( ruleExpression EOF )
            // InternalTempor.g:230:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalTempor.g:237:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:241:2: ( ( ( rule__Expression__Group__0 ) ) )
            // InternalTempor.g:242:2: ( ( rule__Expression__Group__0 ) )
            {
            // InternalTempor.g:242:2: ( ( rule__Expression__Group__0 ) )
            // InternalTempor.g:243:3: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // InternalTempor.g:244:3: ( rule__Expression__Group__0 )
            // InternalTempor.g:244:4: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleXorExpression"
    // InternalTempor.g:253:1: entryRuleXorExpression : ruleXorExpression EOF ;
    public final void entryRuleXorExpression() throws RecognitionException {
        try {
            // InternalTempor.g:254:1: ( ruleXorExpression EOF )
            // InternalTempor.g:255:1: ruleXorExpression EOF
            {
             before(grammarAccess.getXorExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleXorExpression();

            state._fsp--;

             after(grammarAccess.getXorExpressionRule()); 
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
    // $ANTLR end "entryRuleXorExpression"


    // $ANTLR start "ruleXorExpression"
    // InternalTempor.g:262:1: ruleXorExpression : ( ( rule__XorExpression__Group__0 ) ) ;
    public final void ruleXorExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:266:2: ( ( ( rule__XorExpression__Group__0 ) ) )
            // InternalTempor.g:267:2: ( ( rule__XorExpression__Group__0 ) )
            {
            // InternalTempor.g:267:2: ( ( rule__XorExpression__Group__0 ) )
            // InternalTempor.g:268:3: ( rule__XorExpression__Group__0 )
            {
             before(grammarAccess.getXorExpressionAccess().getGroup()); 
            // InternalTempor.g:269:3: ( rule__XorExpression__Group__0 )
            // InternalTempor.g:269:4: rule__XorExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XorExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXorExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXorExpression"


    // $ANTLR start "entryRuleXOR_OPERATOR"
    // InternalTempor.g:278:1: entryRuleXOR_OPERATOR : ruleXOR_OPERATOR EOF ;
    public final void entryRuleXOR_OPERATOR() throws RecognitionException {
        try {
            // InternalTempor.g:279:1: ( ruleXOR_OPERATOR EOF )
            // InternalTempor.g:280:1: ruleXOR_OPERATOR EOF
            {
             before(grammarAccess.getXOR_OPERATORRule()); 
            pushFollow(FOLLOW_1);
            ruleXOR_OPERATOR();

            state._fsp--;

             after(grammarAccess.getXOR_OPERATORRule()); 
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
    // $ANTLR end "entryRuleXOR_OPERATOR"


    // $ANTLR start "ruleXOR_OPERATOR"
    // InternalTempor.g:287:1: ruleXOR_OPERATOR : ( 'XOR' ) ;
    public final void ruleXOR_OPERATOR() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:291:2: ( ( 'XOR' ) )
            // InternalTempor.g:292:2: ( 'XOR' )
            {
            // InternalTempor.g:292:2: ( 'XOR' )
            // InternalTempor.g:293:3: 'XOR'
            {
             before(grammarAccess.getXOR_OPERATORAccess().getXORKeyword()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getXOR_OPERATORAccess().getXORKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXOR_OPERATOR"


    // $ANTLR start "entryRuleAndExpression"
    // InternalTempor.g:303:1: entryRuleAndExpression : ruleAndExpression EOF ;
    public final void entryRuleAndExpression() throws RecognitionException {
        try {
            // InternalTempor.g:304:1: ( ruleAndExpression EOF )
            // InternalTempor.g:305:1: ruleAndExpression EOF
            {
             before(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionRule()); 
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
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalTempor.g:312:1: ruleAndExpression : ( ( rule__AndExpression__Group__0 ) ) ;
    public final void ruleAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:316:2: ( ( ( rule__AndExpression__Group__0 ) ) )
            // InternalTempor.g:317:2: ( ( rule__AndExpression__Group__0 ) )
            {
            // InternalTempor.g:317:2: ( ( rule__AndExpression__Group__0 ) )
            // InternalTempor.g:318:3: ( rule__AndExpression__Group__0 )
            {
             before(grammarAccess.getAndExpressionAccess().getGroup()); 
            // InternalTempor.g:319:3: ( rule__AndExpression__Group__0 )
            // InternalTempor.g:319:4: rule__AndExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleAND_OPERATOR"
    // InternalTempor.g:328:1: entryRuleAND_OPERATOR : ruleAND_OPERATOR EOF ;
    public final void entryRuleAND_OPERATOR() throws RecognitionException {
        try {
            // InternalTempor.g:329:1: ( ruleAND_OPERATOR EOF )
            // InternalTempor.g:330:1: ruleAND_OPERATOR EOF
            {
             before(grammarAccess.getAND_OPERATORRule()); 
            pushFollow(FOLLOW_1);
            ruleAND_OPERATOR();

            state._fsp--;

             after(grammarAccess.getAND_OPERATORRule()); 
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
    // $ANTLR end "entryRuleAND_OPERATOR"


    // $ANTLR start "ruleAND_OPERATOR"
    // InternalTempor.g:337:1: ruleAND_OPERATOR : ( ( rule__AND_OPERATOR__Alternatives ) ) ;
    public final void ruleAND_OPERATOR() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:341:2: ( ( ( rule__AND_OPERATOR__Alternatives ) ) )
            // InternalTempor.g:342:2: ( ( rule__AND_OPERATOR__Alternatives ) )
            {
            // InternalTempor.g:342:2: ( ( rule__AND_OPERATOR__Alternatives ) )
            // InternalTempor.g:343:3: ( rule__AND_OPERATOR__Alternatives )
            {
             before(grammarAccess.getAND_OPERATORAccess().getAlternatives()); 
            // InternalTempor.g:344:3: ( rule__AND_OPERATOR__Alternatives )
            // InternalTempor.g:344:4: rule__AND_OPERATOR__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AND_OPERATOR__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAND_OPERATORAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAND_OPERATOR"


    // $ANTLR start "entryRuleCompExpression"
    // InternalTempor.g:353:1: entryRuleCompExpression : ruleCompExpression EOF ;
    public final void entryRuleCompExpression() throws RecognitionException {
        try {
            // InternalTempor.g:354:1: ( ruleCompExpression EOF )
            // InternalTempor.g:355:1: ruleCompExpression EOF
            {
             before(grammarAccess.getCompExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleCompExpression();

            state._fsp--;

             after(grammarAccess.getCompExpressionRule()); 
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
    // $ANTLR end "entryRuleCompExpression"


    // $ANTLR start "ruleCompExpression"
    // InternalTempor.g:362:1: ruleCompExpression : ( ( rule__CompExpression__Group__0 ) ) ;
    public final void ruleCompExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:366:2: ( ( ( rule__CompExpression__Group__0 ) ) )
            // InternalTempor.g:367:2: ( ( rule__CompExpression__Group__0 ) )
            {
            // InternalTempor.g:367:2: ( ( rule__CompExpression__Group__0 ) )
            // InternalTempor.g:368:3: ( rule__CompExpression__Group__0 )
            {
             before(grammarAccess.getCompExpressionAccess().getGroup()); 
            // InternalTempor.g:369:3: ( rule__CompExpression__Group__0 )
            // InternalTempor.g:369:4: rule__CompExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CompExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompExpression"


    // $ANTLR start "entryRuleEquExpression"
    // InternalTempor.g:378:1: entryRuleEquExpression : ruleEquExpression EOF ;
    public final void entryRuleEquExpression() throws RecognitionException {
        try {
            // InternalTempor.g:379:1: ( ruleEquExpression EOF )
            // InternalTempor.g:380:1: ruleEquExpression EOF
            {
             before(grammarAccess.getEquExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleEquExpression();

            state._fsp--;

             after(grammarAccess.getEquExpressionRule()); 
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
    // $ANTLR end "entryRuleEquExpression"


    // $ANTLR start "ruleEquExpression"
    // InternalTempor.g:387:1: ruleEquExpression : ( ( rule__EquExpression__Group__0 ) ) ;
    public final void ruleEquExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:391:2: ( ( ( rule__EquExpression__Group__0 ) ) )
            // InternalTempor.g:392:2: ( ( rule__EquExpression__Group__0 ) )
            {
            // InternalTempor.g:392:2: ( ( rule__EquExpression__Group__0 ) )
            // InternalTempor.g:393:3: ( rule__EquExpression__Group__0 )
            {
             before(grammarAccess.getEquExpressionAccess().getGroup()); 
            // InternalTempor.g:394:3: ( rule__EquExpression__Group__0 )
            // InternalTempor.g:394:4: rule__EquExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EquExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEquExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEquExpression"


    // $ANTLR start "entryRuleUnOperator"
    // InternalTempor.g:403:1: entryRuleUnOperator : ruleUnOperator EOF ;
    public final void entryRuleUnOperator() throws RecognitionException {
        try {
            // InternalTempor.g:404:1: ( ruleUnOperator EOF )
            // InternalTempor.g:405:1: ruleUnOperator EOF
            {
             before(grammarAccess.getUnOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleUnOperator();

            state._fsp--;

             after(grammarAccess.getUnOperatorRule()); 
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
    // $ANTLR end "entryRuleUnOperator"


    // $ANTLR start "ruleUnOperator"
    // InternalTempor.g:412:1: ruleUnOperator : ( ( rule__UnOperator__Alternatives ) ) ;
    public final void ruleUnOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:416:2: ( ( ( rule__UnOperator__Alternatives ) ) )
            // InternalTempor.g:417:2: ( ( rule__UnOperator__Alternatives ) )
            {
            // InternalTempor.g:417:2: ( ( rule__UnOperator__Alternatives ) )
            // InternalTempor.g:418:3: ( rule__UnOperator__Alternatives )
            {
             before(grammarAccess.getUnOperatorAccess().getAlternatives()); 
            // InternalTempor.g:419:3: ( rule__UnOperator__Alternatives )
            // InternalTempor.g:419:4: rule__UnOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__UnOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnOperator"


    // $ANTLR start "entryRuleNotOperator"
    // InternalTempor.g:428:1: entryRuleNotOperator : ruleNotOperator EOF ;
    public final void entryRuleNotOperator() throws RecognitionException {
        try {
            // InternalTempor.g:429:1: ( ruleNotOperator EOF )
            // InternalTempor.g:430:1: ruleNotOperator EOF
            {
             before(grammarAccess.getNotOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleNotOperator();

            state._fsp--;

             after(grammarAccess.getNotOperatorRule()); 
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
    // $ANTLR end "entryRuleNotOperator"


    // $ANTLR start "ruleNotOperator"
    // InternalTempor.g:437:1: ruleNotOperator : ( ( rule__NotOperator__Alternatives ) ) ;
    public final void ruleNotOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:441:2: ( ( ( rule__NotOperator__Alternatives ) ) )
            // InternalTempor.g:442:2: ( ( rule__NotOperator__Alternatives ) )
            {
            // InternalTempor.g:442:2: ( ( rule__NotOperator__Alternatives ) )
            // InternalTempor.g:443:3: ( rule__NotOperator__Alternatives )
            {
             before(grammarAccess.getNotOperatorAccess().getAlternatives()); 
            // InternalTempor.g:444:3: ( rule__NotOperator__Alternatives )
            // InternalTempor.g:444:4: rule__NotOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NotOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNotOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNotOperator"


    // $ANTLR start "entryRuleUnExpression"
    // InternalTempor.g:453:1: entryRuleUnExpression : ruleUnExpression EOF ;
    public final void entryRuleUnExpression() throws RecognitionException {
        try {
            // InternalTempor.g:454:1: ( ruleUnExpression EOF )
            // InternalTempor.g:455:1: ruleUnExpression EOF
            {
             before(grammarAccess.getUnExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleUnExpression();

            state._fsp--;

             after(grammarAccess.getUnExpressionRule()); 
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
    // $ANTLR end "entryRuleUnExpression"


    // $ANTLR start "ruleUnExpression"
    // InternalTempor.g:462:1: ruleUnExpression : ( ( rule__UnExpression__Alternatives ) ) ;
    public final void ruleUnExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:466:2: ( ( ( rule__UnExpression__Alternatives ) ) )
            // InternalTempor.g:467:2: ( ( rule__UnExpression__Alternatives ) )
            {
            // InternalTempor.g:467:2: ( ( rule__UnExpression__Alternatives ) )
            // InternalTempor.g:468:3: ( rule__UnExpression__Alternatives )
            {
             before(grammarAccess.getUnExpressionAccess().getAlternatives()); 
            // InternalTempor.g:469:3: ( rule__UnExpression__Alternatives )
            // InternalTempor.g:469:4: rule__UnExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__UnExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnExpression"


    // $ANTLR start "entryRuleTauExpression"
    // InternalTempor.g:478:1: entryRuleTauExpression : ruleTauExpression EOF ;
    public final void entryRuleTauExpression() throws RecognitionException {
        try {
            // InternalTempor.g:479:1: ( ruleTauExpression EOF )
            // InternalTempor.g:480:1: ruleTauExpression EOF
            {
             before(grammarAccess.getTauExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleTauExpression();

            state._fsp--;

             after(grammarAccess.getTauExpressionRule()); 
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
    // $ANTLR end "entryRuleTauExpression"


    // $ANTLR start "ruleTauExpression"
    // InternalTempor.g:487:1: ruleTauExpression : ( ( rule__TauExpression__Group__0 ) ) ;
    public final void ruleTauExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:491:2: ( ( ( rule__TauExpression__Group__0 ) ) )
            // InternalTempor.g:492:2: ( ( rule__TauExpression__Group__0 ) )
            {
            // InternalTempor.g:492:2: ( ( rule__TauExpression__Group__0 ) )
            // InternalTempor.g:493:3: ( rule__TauExpression__Group__0 )
            {
             before(grammarAccess.getTauExpressionAccess().getGroup()); 
            // InternalTempor.g:494:3: ( rule__TauExpression__Group__0 )
            // InternalTempor.g:494:4: rule__TauExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TauExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTauExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTauExpression"


    // $ANTLR start "entryRuleTimeLiteral"
    // InternalTempor.g:503:1: entryRuleTimeLiteral : ruleTimeLiteral EOF ;
    public final void entryRuleTimeLiteral() throws RecognitionException {
        try {
            // InternalTempor.g:504:1: ( ruleTimeLiteral EOF )
            // InternalTempor.g:505:1: ruleTimeLiteral EOF
            {
             before(grammarAccess.getTimeLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleTimeLiteral();

            state._fsp--;

             after(grammarAccess.getTimeLiteralRule()); 
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
    // $ANTLR end "entryRuleTimeLiteral"


    // $ANTLR start "ruleTimeLiteral"
    // InternalTempor.g:512:1: ruleTimeLiteral : ( ( rule__TimeLiteral__Group__0 ) ) ;
    public final void ruleTimeLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:516:2: ( ( ( rule__TimeLiteral__Group__0 ) ) )
            // InternalTempor.g:517:2: ( ( rule__TimeLiteral__Group__0 ) )
            {
            // InternalTempor.g:517:2: ( ( rule__TimeLiteral__Group__0 ) )
            // InternalTempor.g:518:3: ( rule__TimeLiteral__Group__0 )
            {
             before(grammarAccess.getTimeLiteralAccess().getGroup()); 
            // InternalTempor.g:519:3: ( rule__TimeLiteral__Group__0 )
            // InternalTempor.g:519:4: rule__TimeLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TimeLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTimeLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimeLiteral"


    // $ANTLR start "entryRuleTIME_PREF_LITERAL"
    // InternalTempor.g:528:1: entryRuleTIME_PREF_LITERAL : ruleTIME_PREF_LITERAL EOF ;
    public final void entryRuleTIME_PREF_LITERAL() throws RecognitionException {
        try {
            // InternalTempor.g:529:1: ( ruleTIME_PREF_LITERAL EOF )
            // InternalTempor.g:530:1: ruleTIME_PREF_LITERAL EOF
            {
             before(grammarAccess.getTIME_PREF_LITERALRule()); 
            pushFollow(FOLLOW_1);
            ruleTIME_PREF_LITERAL();

            state._fsp--;

             after(grammarAccess.getTIME_PREF_LITERALRule()); 
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
    // $ANTLR end "entryRuleTIME_PREF_LITERAL"


    // $ANTLR start "ruleTIME_PREF_LITERAL"
    // InternalTempor.g:537:1: ruleTIME_PREF_LITERAL : ( '#T' ) ;
    public final void ruleTIME_PREF_LITERAL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:541:2: ( ( '#T' ) )
            // InternalTempor.g:542:2: ( '#T' )
            {
            // InternalTempor.g:542:2: ( '#T' )
            // InternalTempor.g:543:3: '#T'
            {
             before(grammarAccess.getTIME_PREF_LITERALAccess().getTKeyword()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTIME_PREF_LITERALAccess().getTKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTIME_PREF_LITERAL"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalTempor.g:553:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // InternalTempor.g:554:1: ( rulePrimaryExpression EOF )
            // InternalTempor.g:555:1: rulePrimaryExpression EOF
            {
             before(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionRule()); 
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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalTempor.g:562:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:566:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // InternalTempor.g:567:2: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // InternalTempor.g:567:2: ( ( rule__PrimaryExpression__Alternatives ) )
            // InternalTempor.g:568:3: ( rule__PrimaryExpression__Alternatives )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            // InternalTempor.g:569:3: ( rule__PrimaryExpression__Alternatives )
            // InternalTempor.g:569:4: rule__PrimaryExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleConstant"
    // InternalTempor.g:578:1: entryRuleConstant : ruleConstant EOF ;
    public final void entryRuleConstant() throws RecognitionException {
        try {
            // InternalTempor.g:579:1: ( ruleConstant EOF )
            // InternalTempor.g:580:1: ruleConstant EOF
            {
             before(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_1);
            ruleConstant();

            state._fsp--;

             after(grammarAccess.getConstantRule()); 
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
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalTempor.g:587:1: ruleConstant : ( ( rule__Constant__Alternatives ) ) ;
    public final void ruleConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:591:2: ( ( ( rule__Constant__Alternatives ) ) )
            // InternalTempor.g:592:2: ( ( rule__Constant__Alternatives ) )
            {
            // InternalTempor.g:592:2: ( ( rule__Constant__Alternatives ) )
            // InternalTempor.g:593:3: ( rule__Constant__Alternatives )
            {
             before(grammarAccess.getConstantAccess().getAlternatives()); 
            // InternalTempor.g:594:3: ( rule__Constant__Alternatives )
            // InternalTempor.g:594:4: rule__Constant__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Constant__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleReqDeclaration"
    // InternalTempor.g:603:1: entryRuleReqDeclaration : ruleReqDeclaration EOF ;
    public final void entryRuleReqDeclaration() throws RecognitionException {
        try {
            // InternalTempor.g:604:1: ( ruleReqDeclaration EOF )
            // InternalTempor.g:605:1: ruleReqDeclaration EOF
            {
             before(grammarAccess.getReqDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleReqDeclaration();

            state._fsp--;

             after(grammarAccess.getReqDeclarationRule()); 
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
    // $ANTLR end "entryRuleReqDeclaration"


    // $ANTLR start "ruleReqDeclaration"
    // InternalTempor.g:612:1: ruleReqDeclaration : ( ( rule__ReqDeclaration__Group__0 ) ) ;
    public final void ruleReqDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:616:2: ( ( ( rule__ReqDeclaration__Group__0 ) ) )
            // InternalTempor.g:617:2: ( ( rule__ReqDeclaration__Group__0 ) )
            {
            // InternalTempor.g:617:2: ( ( rule__ReqDeclaration__Group__0 ) )
            // InternalTempor.g:618:3: ( rule__ReqDeclaration__Group__0 )
            {
             before(grammarAccess.getReqDeclarationAccess().getGroup()); 
            // InternalTempor.g:619:3: ( rule__ReqDeclaration__Group__0 )
            // InternalTempor.g:619:4: rule__ReqDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReqDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReqDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReqDeclaration"


    // $ANTLR start "entryRuleRequirement"
    // InternalTempor.g:628:1: entryRuleRequirement : ruleRequirement EOF ;
    public final void entryRuleRequirement() throws RecognitionException {
        try {
            // InternalTempor.g:629:1: ( ruleRequirement EOF )
            // InternalTempor.g:630:1: ruleRequirement EOF
            {
             before(grammarAccess.getRequirementRule()); 
            pushFollow(FOLLOW_1);
            ruleRequirement();

            state._fsp--;

             after(grammarAccess.getRequirementRule()); 
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
    // $ANTLR end "entryRuleRequirement"


    // $ANTLR start "ruleRequirement"
    // InternalTempor.g:637:1: ruleRequirement : ( ( rule__Requirement__Group__0 ) ) ;
    public final void ruleRequirement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:641:2: ( ( ( rule__Requirement__Group__0 ) ) )
            // InternalTempor.g:642:2: ( ( rule__Requirement__Group__0 ) )
            {
            // InternalTempor.g:642:2: ( ( rule__Requirement__Group__0 ) )
            // InternalTempor.g:643:3: ( rule__Requirement__Group__0 )
            {
             before(grammarAccess.getRequirementAccess().getGroup()); 
            // InternalTempor.g:644:3: ( rule__Requirement__Group__0 )
            // InternalTempor.g:644:4: rule__Requirement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Requirement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRequirementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRequirement"


    // $ANTLR start "entryRuleTrig"
    // InternalTempor.g:653:1: entryRuleTrig : ruleTrig EOF ;
    public final void entryRuleTrig() throws RecognitionException {
        try {
            // InternalTempor.g:654:1: ( ruleTrig EOF )
            // InternalTempor.g:655:1: ruleTrig EOF
            {
             before(grammarAccess.getTrigRule()); 
            pushFollow(FOLLOW_1);
            ruleTrig();

            state._fsp--;

             after(grammarAccess.getTrigRule()); 
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
    // $ANTLR end "entryRuleTrig"


    // $ANTLR start "ruleTrig"
    // InternalTempor.g:662:1: ruleTrig : ( ( rule__Trig__Group__0 ) ) ;
    public final void ruleTrig() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:666:2: ( ( ( rule__Trig__Group__0 ) ) )
            // InternalTempor.g:667:2: ( ( rule__Trig__Group__0 ) )
            {
            // InternalTempor.g:667:2: ( ( rule__Trig__Group__0 ) )
            // InternalTempor.g:668:3: ( rule__Trig__Group__0 )
            {
             before(grammarAccess.getTrigAccess().getGroup()); 
            // InternalTempor.g:669:3: ( rule__Trig__Group__0 )
            // InternalTempor.g:669:4: rule__Trig__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Trig__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTrigAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTrig"


    // $ANTLR start "entryRuleInv"
    // InternalTempor.g:678:1: entryRuleInv : ruleInv EOF ;
    public final void entryRuleInv() throws RecognitionException {
        try {
            // InternalTempor.g:679:1: ( ruleInv EOF )
            // InternalTempor.g:680:1: ruleInv EOF
            {
             before(grammarAccess.getInvRule()); 
            pushFollow(FOLLOW_1);
            ruleInv();

            state._fsp--;

             after(grammarAccess.getInvRule()); 
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
    // $ANTLR end "entryRuleInv"


    // $ANTLR start "ruleInv"
    // InternalTempor.g:687:1: ruleInv : ( ( rule__Inv__Group__0 ) ) ;
    public final void ruleInv() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:691:2: ( ( ( rule__Inv__Group__0 ) ) )
            // InternalTempor.g:692:2: ( ( rule__Inv__Group__0 ) )
            {
            // InternalTempor.g:692:2: ( ( rule__Inv__Group__0 ) )
            // InternalTempor.g:693:3: ( rule__Inv__Group__0 )
            {
             before(grammarAccess.getInvAccess().getGroup()); 
            // InternalTempor.g:694:3: ( rule__Inv__Group__0 )
            // InternalTempor.g:694:4: rule__Inv__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Inv__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInvAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInv"


    // $ANTLR start "entryRuleInv_always"
    // InternalTempor.g:703:1: entryRuleInv_always : ruleInv_always EOF ;
    public final void entryRuleInv_always() throws RecognitionException {
        try {
            // InternalTempor.g:704:1: ( ruleInv_always EOF )
            // InternalTempor.g:705:1: ruleInv_always EOF
            {
             before(grammarAccess.getInv_alwaysRule()); 
            pushFollow(FOLLOW_1);
            ruleInv_always();

            state._fsp--;

             after(grammarAccess.getInv_alwaysRule()); 
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
    // $ANTLR end "entryRuleInv_always"


    // $ANTLR start "ruleInv_always"
    // InternalTempor.g:712:1: ruleInv_always : ( ( rule__Inv_always__Group__0 ) ) ;
    public final void ruleInv_always() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:716:2: ( ( ( rule__Inv_always__Group__0 ) ) )
            // InternalTempor.g:717:2: ( ( rule__Inv_always__Group__0 ) )
            {
            // InternalTempor.g:717:2: ( ( rule__Inv_always__Group__0 ) )
            // InternalTempor.g:718:3: ( rule__Inv_always__Group__0 )
            {
             before(grammarAccess.getInv_alwaysAccess().getGroup()); 
            // InternalTempor.g:719:3: ( rule__Inv_always__Group__0 )
            // InternalTempor.g:719:4: rule__Inv_always__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Inv_always__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInv_alwaysAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInv_always"


    // $ANTLR start "entryRuleRelRea"
    // InternalTempor.g:728:1: entryRuleRelRea : ruleRelRea EOF ;
    public final void entryRuleRelRea() throws RecognitionException {
        try {
            // InternalTempor.g:729:1: ( ruleRelRea EOF )
            // InternalTempor.g:730:1: ruleRelRea EOF
            {
             before(grammarAccess.getRelReaRule()); 
            pushFollow(FOLLOW_1);
            ruleRelRea();

            state._fsp--;

             after(grammarAccess.getRelReaRule()); 
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
    // $ANTLR end "entryRuleRelRea"


    // $ANTLR start "ruleRelRea"
    // InternalTempor.g:737:1: ruleRelRea : ( ( rule__RelRea__Alternatives ) ) ;
    public final void ruleRelRea() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:741:2: ( ( ( rule__RelRea__Alternatives ) ) )
            // InternalTempor.g:742:2: ( ( rule__RelRea__Alternatives ) )
            {
            // InternalTempor.g:742:2: ( ( rule__RelRea__Alternatives ) )
            // InternalTempor.g:743:3: ( rule__RelRea__Alternatives )
            {
             before(grammarAccess.getRelReaAccess().getAlternatives()); 
            // InternalTempor.g:744:3: ( rule__RelRea__Alternatives )
            // InternalTempor.g:744:4: rule__RelRea__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RelRea__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRelReaAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelRea"


    // $ANTLR start "entryRuleRea"
    // InternalTempor.g:753:1: entryRuleRea : ruleRea EOF ;
    public final void entryRuleRea() throws RecognitionException {
        try {
            // InternalTempor.g:754:1: ( ruleRea EOF )
            // InternalTempor.g:755:1: ruleRea EOF
            {
             before(grammarAccess.getReaRule()); 
            pushFollow(FOLLOW_1);
            ruleRea();

            state._fsp--;

             after(grammarAccess.getReaRule()); 
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
    // $ANTLR end "entryRuleRea"


    // $ANTLR start "ruleRea"
    // InternalTempor.g:762:1: ruleRea : ( ( rule__Rea__Group__0 ) ) ;
    public final void ruleRea() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:766:2: ( ( ( rule__Rea__Group__0 ) ) )
            // InternalTempor.g:767:2: ( ( rule__Rea__Group__0 ) )
            {
            // InternalTempor.g:767:2: ( ( rule__Rea__Group__0 ) )
            // InternalTempor.g:768:3: ( rule__Rea__Group__0 )
            {
             before(grammarAccess.getReaAccess().getGroup()); 
            // InternalTempor.g:769:3: ( rule__Rea__Group__0 )
            // InternalTempor.g:769:4: rule__Rea__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rea__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRea"


    // $ANTLR start "entryRuleDelFin"
    // InternalTempor.g:778:1: entryRuleDelFin : ruleDelFin EOF ;
    public final void entryRuleDelFin() throws RecognitionException {
        try {
            // InternalTempor.g:779:1: ( ruleDelFin EOF )
            // InternalTempor.g:780:1: ruleDelFin EOF
            {
             before(grammarAccess.getDelFinRule()); 
            pushFollow(FOLLOW_1);
            ruleDelFin();

            state._fsp--;

             after(grammarAccess.getDelFinRule()); 
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
    // $ANTLR end "entryRuleDelFin"


    // $ANTLR start "ruleDelFin"
    // InternalTempor.g:787:1: ruleDelFin : ( ( rule__DelFin__Group__0 ) ) ;
    public final void ruleDelFin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:791:2: ( ( ( rule__DelFin__Group__0 ) ) )
            // InternalTempor.g:792:2: ( ( rule__DelFin__Group__0 ) )
            {
            // InternalTempor.g:792:2: ( ( rule__DelFin__Group__0 ) )
            // InternalTempor.g:793:3: ( rule__DelFin__Group__0 )
            {
             before(grammarAccess.getDelFinAccess().getGroup()); 
            // InternalTempor.g:794:3: ( rule__DelFin__Group__0 )
            // InternalTempor.g:794:4: rule__DelFin__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DelFin__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDelFinAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDelFin"


    // $ANTLR start "entryRuleDelay"
    // InternalTempor.g:803:1: entryRuleDelay : ruleDelay EOF ;
    public final void entryRuleDelay() throws RecognitionException {
        try {
            // InternalTempor.g:804:1: ( ruleDelay EOF )
            // InternalTempor.g:805:1: ruleDelay EOF
            {
             before(grammarAccess.getDelayRule()); 
            pushFollow(FOLLOW_1);
            ruleDelay();

            state._fsp--;

             after(grammarAccess.getDelayRule()); 
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
    // $ANTLR end "entryRuleDelay"


    // $ANTLR start "ruleDelay"
    // InternalTempor.g:812:1: ruleDelay : ( ( rule__Delay__Group__0 ) ) ;
    public final void ruleDelay() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:816:2: ( ( ( rule__Delay__Group__0 ) ) )
            // InternalTempor.g:817:2: ( ( rule__Delay__Group__0 ) )
            {
            // InternalTempor.g:817:2: ( ( rule__Delay__Group__0 ) )
            // InternalTempor.g:818:3: ( rule__Delay__Group__0 )
            {
             before(grammarAccess.getDelayAccess().getGroup()); 
            // InternalTempor.g:819:3: ( rule__Delay__Group__0 )
            // InternalTempor.g:819:4: rule__Delay__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Delay__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDelayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDelay"


    // $ANTLR start "entryRuleSentence"
    // InternalTempor.g:828:1: entryRuleSentence : ruleSentence EOF ;
    public final void entryRuleSentence() throws RecognitionException {
        try {
            // InternalTempor.g:829:1: ( ruleSentence EOF )
            // InternalTempor.g:830:1: ruleSentence EOF
            {
             before(grammarAccess.getSentenceRule()); 
            pushFollow(FOLLOW_1);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getSentenceRule()); 
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
    // $ANTLR end "entryRuleSentence"


    // $ANTLR start "ruleSentence"
    // InternalTempor.g:837:1: ruleSentence : ( RULE_STRING ) ;
    public final void ruleSentence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:841:2: ( ( RULE_STRING ) )
            // InternalTempor.g:842:2: ( RULE_STRING )
            {
            // InternalTempor.g:842:2: ( RULE_STRING )
            // InternalTempor.g:843:3: RULE_STRING
            {
             before(grammarAccess.getSentenceAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSentenceAccess().getSTRINGTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSentence"


    // $ANTLR start "entryRuleCOMMA"
    // InternalTempor.g:853:1: entryRuleCOMMA : ruleCOMMA EOF ;
    public final void entryRuleCOMMA() throws RecognitionException {
        try {
            // InternalTempor.g:854:1: ( ruleCOMMA EOF )
            // InternalTempor.g:855:1: ruleCOMMA EOF
            {
             before(grammarAccess.getCOMMARule()); 
            pushFollow(FOLLOW_1);
            ruleCOMMA();

            state._fsp--;

             after(grammarAccess.getCOMMARule()); 
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
    // $ANTLR end "entryRuleCOMMA"


    // $ANTLR start "ruleCOMMA"
    // InternalTempor.g:862:1: ruleCOMMA : ( ',' ) ;
    public final void ruleCOMMA() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:866:2: ( ( ',' ) )
            // InternalTempor.g:867:2: ( ',' )
            {
            // InternalTempor.g:867:2: ( ',' )
            // InternalTempor.g:868:3: ','
            {
             before(grammarAccess.getCOMMAAccess().getCommaKeyword()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCOMMAAccess().getCommaKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCOMMA"


    // $ANTLR start "ruleEquOperator"
    // InternalTempor.g:878:1: ruleEquOperator : ( ( rule__EquOperator__Alternatives ) ) ;
    public final void ruleEquOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:882:1: ( ( ( rule__EquOperator__Alternatives ) ) )
            // InternalTempor.g:883:2: ( ( rule__EquOperator__Alternatives ) )
            {
            // InternalTempor.g:883:2: ( ( rule__EquOperator__Alternatives ) )
            // InternalTempor.g:884:3: ( rule__EquOperator__Alternatives )
            {
             before(grammarAccess.getEquOperatorAccess().getAlternatives()); 
            // InternalTempor.g:885:3: ( rule__EquOperator__Alternatives )
            // InternalTempor.g:885:4: rule__EquOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EquOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEquOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEquOperator"


    // $ANTLR start "ruleCompOperator"
    // InternalTempor.g:894:1: ruleCompOperator : ( ( rule__CompOperator__Alternatives ) ) ;
    public final void ruleCompOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:898:1: ( ( ( rule__CompOperator__Alternatives ) ) )
            // InternalTempor.g:899:2: ( ( rule__CompOperator__Alternatives ) )
            {
            // InternalTempor.g:899:2: ( ( rule__CompOperator__Alternatives ) )
            // InternalTempor.g:900:3: ( rule__CompOperator__Alternatives )
            {
             before(grammarAccess.getCompOperatorAccess().getAlternatives()); 
            // InternalTempor.g:901:3: ( rule__CompOperator__Alternatives )
            // InternalTempor.g:901:4: rule__CompOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CompOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCompOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompOperator"


    // $ANTLR start "rule__Model__Alternatives"
    // InternalTempor.g:909:1: rule__Model__Alternatives : ( ( ( rule__Model__DeclVarInputAssignment_0 ) ) | ( ( rule__Model__DeclVarOutputAssignment_1 ) ) | ( ( rule__Model__SentDeclarationAssignment_2 ) ) | ( ( rule__Model__ReqDeclarationAssignment_3 ) ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:913:1: ( ( ( rule__Model__DeclVarInputAssignment_0 ) ) | ( ( rule__Model__DeclVarOutputAssignment_1 ) ) | ( ( rule__Model__SentDeclarationAssignment_2 ) ) | ( ( rule__Model__ReqDeclarationAssignment_3 ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt2=1;
                }
                break;
            case 39:
                {
                alt2=2;
                }
                break;
            case 41:
                {
                alt2=3;
                }
                break;
            case 47:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalTempor.g:914:2: ( ( rule__Model__DeclVarInputAssignment_0 ) )
                    {
                    // InternalTempor.g:914:2: ( ( rule__Model__DeclVarInputAssignment_0 ) )
                    // InternalTempor.g:915:3: ( rule__Model__DeclVarInputAssignment_0 )
                    {
                     before(grammarAccess.getModelAccess().getDeclVarInputAssignment_0()); 
                    // InternalTempor.g:916:3: ( rule__Model__DeclVarInputAssignment_0 )
                    // InternalTempor.g:916:4: rule__Model__DeclVarInputAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__DeclVarInputAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getDeclVarInputAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTempor.g:920:2: ( ( rule__Model__DeclVarOutputAssignment_1 ) )
                    {
                    // InternalTempor.g:920:2: ( ( rule__Model__DeclVarOutputAssignment_1 ) )
                    // InternalTempor.g:921:3: ( rule__Model__DeclVarOutputAssignment_1 )
                    {
                     before(grammarAccess.getModelAccess().getDeclVarOutputAssignment_1()); 
                    // InternalTempor.g:922:3: ( rule__Model__DeclVarOutputAssignment_1 )
                    // InternalTempor.g:922:4: rule__Model__DeclVarOutputAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__DeclVarOutputAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getDeclVarOutputAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTempor.g:926:2: ( ( rule__Model__SentDeclarationAssignment_2 ) )
                    {
                    // InternalTempor.g:926:2: ( ( rule__Model__SentDeclarationAssignment_2 ) )
                    // InternalTempor.g:927:3: ( rule__Model__SentDeclarationAssignment_2 )
                    {
                     before(grammarAccess.getModelAccess().getSentDeclarationAssignment_2()); 
                    // InternalTempor.g:928:3: ( rule__Model__SentDeclarationAssignment_2 )
                    // InternalTempor.g:928:4: rule__Model__SentDeclarationAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__SentDeclarationAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getSentDeclarationAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTempor.g:932:2: ( ( rule__Model__ReqDeclarationAssignment_3 ) )
                    {
                    // InternalTempor.g:932:2: ( ( rule__Model__ReqDeclarationAssignment_3 ) )
                    // InternalTempor.g:933:3: ( rule__Model__ReqDeclarationAssignment_3 )
                    {
                     before(grammarAccess.getModelAccess().getReqDeclarationAssignment_3()); 
                    // InternalTempor.g:934:3: ( rule__Model__ReqDeclarationAssignment_3 )
                    // InternalTempor.g:934:4: rule__Model__ReqDeclarationAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__ReqDeclarationAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getReqDeclarationAssignment_3()); 

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
    // $ANTLR end "rule__Model__Alternatives"


    // $ANTLR start "rule__VariableType__Alternatives"
    // InternalTempor.g:942:1: rule__VariableType__Alternatives : ( ( 'BOOL' ) | ( 'INT' ) );
    public final void rule__VariableType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:946:1: ( ( 'BOOL' ) | ( 'INT' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            else if ( (LA3_0==20) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTempor.g:947:2: ( 'BOOL' )
                    {
                    // InternalTempor.g:947:2: ( 'BOOL' )
                    // InternalTempor.g:948:3: 'BOOL'
                    {
                     before(grammarAccess.getVariableTypeAccess().getBOOLKeyword_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getVariableTypeAccess().getBOOLKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTempor.g:953:2: ( 'INT' )
                    {
                    // InternalTempor.g:953:2: ( 'INT' )
                    // InternalTempor.g:954:3: 'INT'
                    {
                     before(grammarAccess.getVariableTypeAccess().getINTKeyword_1()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getVariableTypeAccess().getINTKeyword_1()); 

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
    // $ANTLR end "rule__VariableType__Alternatives"


    // $ANTLR start "rule__AND_OPERATOR__Alternatives"
    // InternalTempor.g:963:1: rule__AND_OPERATOR__Alternatives : ( ( 'AND' ) | ( '&&' ) );
    public final void rule__AND_OPERATOR__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:967:1: ( ( 'AND' ) | ( '&&' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            else if ( (LA4_0==22) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalTempor.g:968:2: ( 'AND' )
                    {
                    // InternalTempor.g:968:2: ( 'AND' )
                    // InternalTempor.g:969:3: 'AND'
                    {
                     before(grammarAccess.getAND_OPERATORAccess().getANDKeyword_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getAND_OPERATORAccess().getANDKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTempor.g:974:2: ( '&&' )
                    {
                    // InternalTempor.g:974:2: ( '&&' )
                    // InternalTempor.g:975:3: '&&'
                    {
                     before(grammarAccess.getAND_OPERATORAccess().getAmpersandAmpersandKeyword_1()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getAND_OPERATORAccess().getAmpersandAmpersandKeyword_1()); 

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
    // $ANTLR end "rule__AND_OPERATOR__Alternatives"


    // $ANTLR start "rule__UnOperator__Alternatives"
    // InternalTempor.g:984:1: rule__UnOperator__Alternatives : ( ( ruleNotOperator ) | ( 'FE' ) | ( 'RE' ) | ( 'HIGH' ) | ( 'LOW' ) );
    public final void rule__UnOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:988:1: ( ( ruleNotOperator ) | ( 'FE' ) | ( 'RE' ) | ( 'HIGH' ) | ( 'LOW' ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 27:
            case 28:
                {
                alt5=1;
                }
                break;
            case 23:
                {
                alt5=2;
                }
                break;
            case 24:
                {
                alt5=3;
                }
                break;
            case 25:
                {
                alt5=4;
                }
                break;
            case 26:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalTempor.g:989:2: ( ruleNotOperator )
                    {
                    // InternalTempor.g:989:2: ( ruleNotOperator )
                    // InternalTempor.g:990:3: ruleNotOperator
                    {
                     before(grammarAccess.getUnOperatorAccess().getNotOperatorParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNotOperator();

                    state._fsp--;

                     after(grammarAccess.getUnOperatorAccess().getNotOperatorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTempor.g:995:2: ( 'FE' )
                    {
                    // InternalTempor.g:995:2: ( 'FE' )
                    // InternalTempor.g:996:3: 'FE'
                    {
                     before(grammarAccess.getUnOperatorAccess().getFEKeyword_1()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getUnOperatorAccess().getFEKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTempor.g:1001:2: ( 'RE' )
                    {
                    // InternalTempor.g:1001:2: ( 'RE' )
                    // InternalTempor.g:1002:3: 'RE'
                    {
                     before(grammarAccess.getUnOperatorAccess().getREKeyword_2()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getUnOperatorAccess().getREKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTempor.g:1007:2: ( 'HIGH' )
                    {
                    // InternalTempor.g:1007:2: ( 'HIGH' )
                    // InternalTempor.g:1008:3: 'HIGH'
                    {
                     before(grammarAccess.getUnOperatorAccess().getHIGHKeyword_3()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getUnOperatorAccess().getHIGHKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTempor.g:1013:2: ( 'LOW' )
                    {
                    // InternalTempor.g:1013:2: ( 'LOW' )
                    // InternalTempor.g:1014:3: 'LOW'
                    {
                     before(grammarAccess.getUnOperatorAccess().getLOWKeyword_4()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getUnOperatorAccess().getLOWKeyword_4()); 

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
    // $ANTLR end "rule__UnOperator__Alternatives"


    // $ANTLR start "rule__NotOperator__Alternatives"
    // InternalTempor.g:1023:1: rule__NotOperator__Alternatives : ( ( 'NOT' ) | ( '!' ) );
    public final void rule__NotOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:1027:1: ( ( 'NOT' ) | ( '!' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==27) ) {
                alt6=1;
            }
            else if ( (LA6_0==28) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalTempor.g:1028:2: ( 'NOT' )
                    {
                    // InternalTempor.g:1028:2: ( 'NOT' )
                    // InternalTempor.g:1029:3: 'NOT'
                    {
                     before(grammarAccess.getNotOperatorAccess().getNOTKeyword_0()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getNotOperatorAccess().getNOTKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTempor.g:1034:2: ( '!' )
                    {
                    // InternalTempor.g:1034:2: ( '!' )
                    // InternalTempor.g:1035:3: '!'
                    {
                     before(grammarAccess.getNotOperatorAccess().getExclamationMarkKeyword_1()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getNotOperatorAccess().getExclamationMarkKeyword_1()); 

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
    // $ANTLR end "rule__NotOperator__Alternatives"


    // $ANTLR start "rule__UnExpression__Alternatives"
    // InternalTempor.g:1044:1: rule__UnExpression__Alternatives : ( ( rulePrimaryExpression ) | ( ( rule__UnExpression__Group_1__0 ) ) );
    public final void rule__UnExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:1048:1: ( ( rulePrimaryExpression ) | ( ( rule__UnExpression__Group_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_INTEGER && LA7_0<=RULE_ID)||(LA7_0>=44 && LA7_0<=45)) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=23 && LA7_0<=28)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalTempor.g:1049:2: ( rulePrimaryExpression )
                    {
                    // InternalTempor.g:1049:2: ( rulePrimaryExpression )
                    // InternalTempor.g:1050:3: rulePrimaryExpression
                    {
                     before(grammarAccess.getUnExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePrimaryExpression();

                    state._fsp--;

                     after(grammarAccess.getUnExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTempor.g:1055:2: ( ( rule__UnExpression__Group_1__0 ) )
                    {
                    // InternalTempor.g:1055:2: ( ( rule__UnExpression__Group_1__0 ) )
                    // InternalTempor.g:1056:3: ( rule__UnExpression__Group_1__0 )
                    {
                     before(grammarAccess.getUnExpressionAccess().getGroup_1()); 
                    // InternalTempor.g:1057:3: ( rule__UnExpression__Group_1__0 )
                    // InternalTempor.g:1057:4: rule__UnExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnExpression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__UnExpression__Alternatives"


    // $ANTLR start "rule__PrimaryExpression__Alternatives"
    // InternalTempor.g:1065:1: rule__PrimaryExpression__Alternatives : ( ( ( rule__PrimaryExpression__NameAssignment_0 ) ) | ( ( rule__PrimaryExpression__ConstantAssignment_1 ) ) | ( ( rule__PrimaryExpression__TauAssignment_2 ) ) | ( ( rule__PrimaryExpression__Group_3__0 ) ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:1069:1: ( ( ( rule__PrimaryExpression__NameAssignment_0 ) ) | ( ( rule__PrimaryExpression__ConstantAssignment_1 ) ) | ( ( rule__PrimaryExpression__TauAssignment_2 ) ) | ( ( rule__PrimaryExpression__Group_3__0 ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt8=1;
                }
                break;
            case RULE_INTEGER:
            case RULE_BOOLEAN_LITERAL:
                {
                alt8=2;
                }
                break;
            case 44:
                {
                alt8=3;
                }
                break;
            case 45:
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
                    // InternalTempor.g:1070:2: ( ( rule__PrimaryExpression__NameAssignment_0 ) )
                    {
                    // InternalTempor.g:1070:2: ( ( rule__PrimaryExpression__NameAssignment_0 ) )
                    // InternalTempor.g:1071:3: ( rule__PrimaryExpression__NameAssignment_0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getNameAssignment_0()); 
                    // InternalTempor.g:1072:3: ( rule__PrimaryExpression__NameAssignment_0 )
                    // InternalTempor.g:1072:4: rule__PrimaryExpression__NameAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__NameAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getNameAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTempor.g:1076:2: ( ( rule__PrimaryExpression__ConstantAssignment_1 ) )
                    {
                    // InternalTempor.g:1076:2: ( ( rule__PrimaryExpression__ConstantAssignment_1 ) )
                    // InternalTempor.g:1077:3: ( rule__PrimaryExpression__ConstantAssignment_1 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getConstantAssignment_1()); 
                    // InternalTempor.g:1078:3: ( rule__PrimaryExpression__ConstantAssignment_1 )
                    // InternalTempor.g:1078:4: rule__PrimaryExpression__ConstantAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__ConstantAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getConstantAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTempor.g:1082:2: ( ( rule__PrimaryExpression__TauAssignment_2 ) )
                    {
                    // InternalTempor.g:1082:2: ( ( rule__PrimaryExpression__TauAssignment_2 ) )
                    // InternalTempor.g:1083:3: ( rule__PrimaryExpression__TauAssignment_2 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getTauAssignment_2()); 
                    // InternalTempor.g:1084:3: ( rule__PrimaryExpression__TauAssignment_2 )
                    // InternalTempor.g:1084:4: rule__PrimaryExpression__TauAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__TauAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getTauAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTempor.g:1088:2: ( ( rule__PrimaryExpression__Group_3__0 ) )
                    {
                    // InternalTempor.g:1088:2: ( ( rule__PrimaryExpression__Group_3__0 ) )
                    // InternalTempor.g:1089:3: ( rule__PrimaryExpression__Group_3__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_3()); 
                    // InternalTempor.g:1090:3: ( rule__PrimaryExpression__Group_3__0 )
                    // InternalTempor.g:1090:4: rule__PrimaryExpression__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_3()); 

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
    // $ANTLR end "rule__PrimaryExpression__Alternatives"


    // $ANTLR start "rule__Constant__Alternatives"
    // InternalTempor.g:1098:1: rule__Constant__Alternatives : ( ( RULE_INTEGER ) | ( RULE_BOOLEAN_LITERAL ) );
    public final void rule__Constant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:1102:1: ( ( RULE_INTEGER ) | ( RULE_BOOLEAN_LITERAL ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INTEGER) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_BOOLEAN_LITERAL) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalTempor.g:1103:2: ( RULE_INTEGER )
                    {
                    // InternalTempor.g:1103:2: ( RULE_INTEGER )
                    // InternalTempor.g:1104:3: RULE_INTEGER
                    {
                     before(grammarAccess.getConstantAccess().getINTEGERTerminalRuleCall_0()); 
                    match(input,RULE_INTEGER,FOLLOW_2); 
                     after(grammarAccess.getConstantAccess().getINTEGERTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTempor.g:1109:2: ( RULE_BOOLEAN_LITERAL )
                    {
                    // InternalTempor.g:1109:2: ( RULE_BOOLEAN_LITERAL )
                    // InternalTempor.g:1110:3: RULE_BOOLEAN_LITERAL
                    {
                     before(grammarAccess.getConstantAccess().getBOOLEAN_LITERALTerminalRuleCall_1()); 
                    match(input,RULE_BOOLEAN_LITERAL,FOLLOW_2); 
                     after(grammarAccess.getConstantAccess().getBOOLEAN_LITERALTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Constant__Alternatives"


    // $ANTLR start "rule__Requirement__Alternatives_0"
    // InternalTempor.g:1119:1: rule__Requirement__Alternatives_0 : ( ( ( rule__Requirement__TriggerAssignment_0_0 ) ) | ( ( rule__Requirement__InvariantAssignment_0_1 ) ) );
    public final void rule__Requirement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:1123:1: ( ( ( rule__Requirement__TriggerAssignment_0_0 ) ) | ( ( rule__Requirement__InvariantAssignment_0_1 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29||LA10_0==50) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_STRING) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalTempor.g:1124:2: ( ( rule__Requirement__TriggerAssignment_0_0 ) )
                    {
                    // InternalTempor.g:1124:2: ( ( rule__Requirement__TriggerAssignment_0_0 ) )
                    // InternalTempor.g:1125:3: ( rule__Requirement__TriggerAssignment_0_0 )
                    {
                     before(grammarAccess.getRequirementAccess().getTriggerAssignment_0_0()); 
                    // InternalTempor.g:1126:3: ( rule__Requirement__TriggerAssignment_0_0 )
                    // InternalTempor.g:1126:4: rule__Requirement__TriggerAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Requirement__TriggerAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRequirementAccess().getTriggerAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTempor.g:1130:2: ( ( rule__Requirement__InvariantAssignment_0_1 ) )
                    {
                    // InternalTempor.g:1130:2: ( ( rule__Requirement__InvariantAssignment_0_1 ) )
                    // InternalTempor.g:1131:3: ( rule__Requirement__InvariantAssignment_0_1 )
                    {
                     before(grammarAccess.getRequirementAccess().getInvariantAssignment_0_1()); 
                    // InternalTempor.g:1132:3: ( rule__Requirement__InvariantAssignment_0_1 )
                    // InternalTempor.g:1132:4: rule__Requirement__InvariantAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Requirement__InvariantAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRequirementAccess().getInvariantAssignment_0_1()); 

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
    // $ANTLR end "rule__Requirement__Alternatives_0"


    // $ANTLR start "rule__Trig__Alternatives_0"
    // InternalTempor.g:1140:1: rule__Trig__Alternatives_0 : ( ( ( rule__Trig__Group_0_0__0 ) ) | ( 'Always' ) );
    public final void rule__Trig__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:1144:1: ( ( ( rule__Trig__Group_0_0__0 ) ) | ( 'Always' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==50) ) {
                alt11=1;
            }
            else if ( (LA11_0==29) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalTempor.g:1145:2: ( ( rule__Trig__Group_0_0__0 ) )
                    {
                    // InternalTempor.g:1145:2: ( ( rule__Trig__Group_0_0__0 ) )
                    // InternalTempor.g:1146:3: ( rule__Trig__Group_0_0__0 )
                    {
                     before(grammarAccess.getTrigAccess().getGroup_0_0()); 
                    // InternalTempor.g:1147:3: ( rule__Trig__Group_0_0__0 )
                    // InternalTempor.g:1147:4: rule__Trig__Group_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Trig__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTrigAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTempor.g:1151:2: ( 'Always' )
                    {
                    // InternalTempor.g:1151:2: ( 'Always' )
                    // InternalTempor.g:1152:3: 'Always'
                    {
                     before(grammarAccess.getTrigAccess().getAlwaysKeyword_0_1()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getTrigAccess().getAlwaysKeyword_0_1()); 

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
    // $ANTLR end "rule__Trig__Alternatives_0"


    // $ANTLR start "rule__Trig__Alternatives_1"
    // InternalTempor.g:1161:1: rule__Trig__Alternatives_1 : ( ( ( rule__Trig__InvariantAssignment_1_0 ) ) | ( ( rule__Trig__Release_reactionAssignment_1_1 ) ) | ( ( rule__Trig__Delay_finalAssignment_1_2 ) ) );
    public final void rule__Trig__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:1165:1: ( ( ( rule__Trig__InvariantAssignment_1_0 ) ) | ( ( rule__Trig__Release_reactionAssignment_1_1 ) ) | ( ( rule__Trig__Delay_finalAssignment_1_2 ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt12=1;
                }
                break;
            case 56:
            case 58:
            case 60:
                {
                alt12=2;
                }
                break;
            case 61:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalTempor.g:1166:2: ( ( rule__Trig__InvariantAssignment_1_0 ) )
                    {
                    // InternalTempor.g:1166:2: ( ( rule__Trig__InvariantAssignment_1_0 ) )
                    // InternalTempor.g:1167:3: ( rule__Trig__InvariantAssignment_1_0 )
                    {
                     before(grammarAccess.getTrigAccess().getInvariantAssignment_1_0()); 
                    // InternalTempor.g:1168:3: ( rule__Trig__InvariantAssignment_1_0 )
                    // InternalTempor.g:1168:4: rule__Trig__InvariantAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Trig__InvariantAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTrigAccess().getInvariantAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTempor.g:1172:2: ( ( rule__Trig__Release_reactionAssignment_1_1 ) )
                    {
                    // InternalTempor.g:1172:2: ( ( rule__Trig__Release_reactionAssignment_1_1 ) )
                    // InternalTempor.g:1173:3: ( rule__Trig__Release_reactionAssignment_1_1 )
                    {
                     before(grammarAccess.getTrigAccess().getRelease_reactionAssignment_1_1()); 
                    // InternalTempor.g:1174:3: ( rule__Trig__Release_reactionAssignment_1_1 )
                    // InternalTempor.g:1174:4: rule__Trig__Release_reactionAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Trig__Release_reactionAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTrigAccess().getRelease_reactionAssignment_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTempor.g:1178:2: ( ( rule__Trig__Delay_finalAssignment_1_2 ) )
                    {
                    // InternalTempor.g:1178:2: ( ( rule__Trig__Delay_finalAssignment_1_2 ) )
                    // InternalTempor.g:1179:3: ( rule__Trig__Delay_finalAssignment_1_2 )
                    {
                     before(grammarAccess.getTrigAccess().getDelay_finalAssignment_1_2()); 
                    // InternalTempor.g:1180:3: ( rule__Trig__Delay_finalAssignment_1_2 )
                    // InternalTempor.g:1180:4: rule__Trig__Delay_finalAssignment_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Trig__Delay_finalAssignment_1_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getTrigAccess().getDelay_finalAssignment_1_2()); 

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
    // $ANTLR end "rule__Trig__Alternatives_1"


    // $ANTLR start "rule__Inv__Alternatives_2"
    // InternalTempor.g:1188:1: rule__Inv__Alternatives_2 : ( ( ( rule__Inv__Group_2_0__0 ) ) | ( ( rule__Inv__Group_2_1__0 ) ) );
    public final void rule__Inv__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:1192:1: ( ( ( rule__Inv__Group_2_0__0 ) ) | ( ( rule__Inv__Group_2_1__0 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            else if ( (LA13_0==51) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalTempor.g:1193:2: ( ( rule__Inv__Group_2_0__0 ) )
                    {
                    // InternalTempor.g:1193:2: ( ( rule__Inv__Group_2_0__0 ) )
                    // InternalTempor.g:1194:3: ( rule__Inv__Group_2_0__0 )
                    {
                     before(grammarAccess.getInvAccess().getGroup_2_0()); 
                    // InternalTempor.g:1195:3: ( rule__Inv__Group_2_0__0 )
                    // InternalTempor.g:1195:4: rule__Inv__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Inv__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInvAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTempor.g:1199:2: ( ( rule__Inv__Group_2_1__0 ) )
                    {
                    // InternalTempor.g:1199:2: ( ( rule__Inv__Group_2_1__0 ) )
                    // InternalTempor.g:1200:3: ( rule__Inv__Group_2_1__0 )
                    {
                     before(grammarAccess.getInvAccess().getGroup_2_1()); 
                    // InternalTempor.g:1201:3: ( rule__Inv__Group_2_1__0 )
                    // InternalTempor.g:1201:4: rule__Inv__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Inv__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInvAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__Inv__Alternatives_2"


    // $ANTLR start "rule__RelRea__Alternatives"
    // InternalTempor.g:1209:1: rule__RelRea__Alternatives : ( ( ( rule__RelRea__Group_0__0 ) ) | ( ( rule__RelRea__Group_1__0 ) ) | ( ( rule__RelRea__Group_2__0 ) ) | ( ( rule__RelRea__Group_3__0 ) ) );
    public final void rule__RelRea__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:1213:1: ( ( ( rule__RelRea__Group_0__0 ) ) | ( ( rule__RelRea__Group_1__0 ) ) | ( ( rule__RelRea__Group_2__0 ) ) | ( ( rule__RelRea__Group_3__0 ) ) )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt14=1;
                }
                break;
            case RULE_STRING:
                {
                alt14=2;
                }
                break;
            case 60:
                {
                alt14=3;
                }
                break;
            case 58:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalTempor.g:1214:2: ( ( rule__RelRea__Group_0__0 ) )
                    {
                    // InternalTempor.g:1214:2: ( ( rule__RelRea__Group_0__0 ) )
                    // InternalTempor.g:1215:3: ( rule__RelRea__Group_0__0 )
                    {
                     before(grammarAccess.getRelReaAccess().getGroup_0()); 
                    // InternalTempor.g:1216:3: ( rule__RelRea__Group_0__0 )
                    // InternalTempor.g:1216:4: rule__RelRea__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RelRea__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRelReaAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTempor.g:1220:2: ( ( rule__RelRea__Group_1__0 ) )
                    {
                    // InternalTempor.g:1220:2: ( ( rule__RelRea__Group_1__0 ) )
                    // InternalTempor.g:1221:3: ( rule__RelRea__Group_1__0 )
                    {
                     before(grammarAccess.getRelReaAccess().getGroup_1()); 
                    // InternalTempor.g:1222:3: ( rule__RelRea__Group_1__0 )
                    // InternalTempor.g:1222:4: rule__RelRea__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RelRea__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRelReaAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTempor.g:1226:2: ( ( rule__RelRea__Group_2__0 ) )
                    {
                    // InternalTempor.g:1226:2: ( ( rule__RelRea__Group_2__0 ) )
                    // InternalTempor.g:1227:3: ( rule__RelRea__Group_2__0 )
                    {
                     before(grammarAccess.getRelReaAccess().getGroup_2()); 
                    // InternalTempor.g:1228:3: ( rule__RelRea__Group_2__0 )
                    // InternalTempor.g:1228:4: rule__RelRea__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RelRea__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRelReaAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTempor.g:1232:2: ( ( rule__RelRea__Group_3__0 ) )
                    {
                    // InternalTempor.g:1232:2: ( ( rule__RelRea__Group_3__0 ) )
                    // InternalTempor.g:1233:3: ( rule__RelRea__Group_3__0 )
                    {
                     before(grammarAccess.getRelReaAccess().getGroup_3()); 
                    // InternalTempor.g:1234:3: ( rule__RelRea__Group_3__0 )
                    // InternalTempor.g:1234:4: rule__RelRea__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RelRea__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRelReaAccess().getGroup_3()); 

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
    // $ANTLR end "rule__RelRea__Alternatives"


    // $ANTLR start "rule__DelFin__Alternatives_1"
    // InternalTempor.g:1242:1: rule__DelFin__Alternatives_1 : ( ( ( rule__DelFin__Group_1_0__0 ) ) | ( ( rule__DelFin__FinAssignment_1_1 ) ) );
    public final void rule__DelFin__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:1246:1: ( ( ( rule__DelFin__Group_1_0__0 ) ) | ( ( rule__DelFin__FinAssignment_1_1 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==61) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_STRING) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalTempor.g:1247:2: ( ( rule__DelFin__Group_1_0__0 ) )
                    {
                    // InternalTempor.g:1247:2: ( ( rule__DelFin__Group_1_0__0 ) )
                    // InternalTempor.g:1248:3: ( rule__DelFin__Group_1_0__0 )
                    {
                     before(grammarAccess.getDelFinAccess().getGroup_1_0()); 
                    // InternalTempor.g:1249:3: ( rule__DelFin__Group_1_0__0 )
                    // InternalTempor.g:1249:4: rule__DelFin__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DelFin__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDelFinAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTempor.g:1253:2: ( ( rule__DelFin__FinAssignment_1_1 ) )
                    {
                    // InternalTempor.g:1253:2: ( ( rule__DelFin__FinAssignment_1_1 ) )
                    // InternalTempor.g:1254:3: ( rule__DelFin__FinAssignment_1_1 )
                    {
                     before(grammarAccess.getDelFinAccess().getFinAssignment_1_1()); 
                    // InternalTempor.g:1255:3: ( rule__DelFin__FinAssignment_1_1 )
                    // InternalTempor.g:1255:4: rule__DelFin__FinAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__DelFin__FinAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getDelFinAccess().getFinAssignment_1_1()); 

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
    // $ANTLR end "rule__DelFin__Alternatives_1"


    // $ANTLR start "rule__DelFin__Alternatives_1_0_1"
    // InternalTempor.g:1263:1: rule__DelFin__Alternatives_1_0_1 : ( ( ( rule__DelFin__Group_1_0_1_0__0 ) ) | ( ( rule__DelFin__Group_1_0_1_1__0 ) ) );
    public final void rule__DelFin__Alternatives_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:1267:1: ( ( ( rule__DelFin__Group_1_0_1_0__0 ) ) | ( ( rule__DelFin__Group_1_0_1_1__0 ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==66) ) {
                alt16=1;
            }
            else if ( (LA16_0==65||LA16_0==67) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalTempor.g:1268:2: ( ( rule__DelFin__Group_1_0_1_0__0 ) )
                    {
                    // InternalTempor.g:1268:2: ( ( rule__DelFin__Group_1_0_1_0__0 ) )
                    // InternalTempor.g:1269:3: ( rule__DelFin__Group_1_0_1_0__0 )
                    {
                     before(grammarAccess.getDelFinAccess().getGroup_1_0_1_0()); 
                    // InternalTempor.g:1270:3: ( rule__DelFin__Group_1_0_1_0__0 )
                    // InternalTempor.g:1270:4: rule__DelFin__Group_1_0_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DelFin__Group_1_0_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDelFinAccess().getGroup_1_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTempor.g:1274:2: ( ( rule__DelFin__Group_1_0_1_1__0 ) )
                    {
                    // InternalTempor.g:1274:2: ( ( rule__DelFin__Group_1_0_1_1__0 ) )
                    // InternalTempor.g:1275:3: ( rule__DelFin__Group_1_0_1_1__0 )
                    {
                     before(grammarAccess.getDelFinAccess().getGroup_1_0_1_1()); 
                    // InternalTempor.g:1276:3: ( rule__DelFin__Group_1_0_1_1__0 )
                    // InternalTempor.g:1276:4: rule__DelFin__Group_1_0_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DelFin__Group_1_0_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDelFinAccess().getGroup_1_0_1_1()); 

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
    // $ANTLR end "rule__DelFin__Alternatives_1_0_1"


    // $ANTLR start "rule__EquOperator__Alternatives"
    // InternalTempor.g:1284:1: rule__EquOperator__Alternatives : ( ( ( '==' ) ) | ( ( '<>' ) ) );
    public final void rule__EquOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:1288:1: ( ( ( '==' ) ) | ( ( '<>' ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            else if ( (LA17_0==31) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalTempor.g:1289:2: ( ( '==' ) )
                    {
                    // InternalTempor.g:1289:2: ( ( '==' ) )
                    // InternalTempor.g:1290:3: ( '==' )
                    {
                     before(grammarAccess.getEquOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                    // InternalTempor.g:1291:3: ( '==' )
                    // InternalTempor.g:1291:4: '=='
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getEquOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTempor.g:1295:2: ( ( '<>' ) )
                    {
                    // InternalTempor.g:1295:2: ( ( '<>' ) )
                    // InternalTempor.g:1296:3: ( '<>' )
                    {
                     before(grammarAccess.getEquOperatorAccess().getNOT_EQUALEnumLiteralDeclaration_1()); 
                    // InternalTempor.g:1297:3: ( '<>' )
                    // InternalTempor.g:1297:4: '<>'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getEquOperatorAccess().getNOT_EQUALEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__EquOperator__Alternatives"


    // $ANTLR start "rule__CompOperator__Alternatives"
    // InternalTempor.g:1305:1: rule__CompOperator__Alternatives : ( ( ( '<=' ) ) | ( ( '>=' ) ) | ( ( '<' ) ) | ( ( '>' ) ) );
    public final void rule__CompOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:1309:1: ( ( ( '<=' ) ) | ( ( '>=' ) ) | ( ( '<' ) ) | ( ( '>' ) ) )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt18=1;
                }
                break;
            case 33:
                {
                alt18=2;
                }
                break;
            case 34:
                {
                alt18=3;
                }
                break;
            case 35:
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalTempor.g:1310:2: ( ( '<=' ) )
                    {
                    // InternalTempor.g:1310:2: ( ( '<=' ) )
                    // InternalTempor.g:1311:3: ( '<=' )
                    {
                     before(grammarAccess.getCompOperatorAccess().getLESS_EQUEnumLiteralDeclaration_0()); 
                    // InternalTempor.g:1312:3: ( '<=' )
                    // InternalTempor.g:1312:4: '<='
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getCompOperatorAccess().getLESS_EQUEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTempor.g:1316:2: ( ( '>=' ) )
                    {
                    // InternalTempor.g:1316:2: ( ( '>=' ) )
                    // InternalTempor.g:1317:3: ( '>=' )
                    {
                     before(grammarAccess.getCompOperatorAccess().getGREATER_EQUEnumLiteralDeclaration_1()); 
                    // InternalTempor.g:1318:3: ( '>=' )
                    // InternalTempor.g:1318:4: '>='
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getCompOperatorAccess().getGREATER_EQUEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTempor.g:1322:2: ( ( '<' ) )
                    {
                    // InternalTempor.g:1322:2: ( ( '<' ) )
                    // InternalTempor.g:1323:3: ( '<' )
                    {
                     before(grammarAccess.getCompOperatorAccess().getLESSEnumLiteralDeclaration_2()); 
                    // InternalTempor.g:1324:3: ( '<' )
                    // InternalTempor.g:1324:4: '<'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getCompOperatorAccess().getLESSEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTempor.g:1328:2: ( ( '>' ) )
                    {
                    // InternalTempor.g:1328:2: ( ( '>' ) )
                    // InternalTempor.g:1329:3: ( '>' )
                    {
                     before(grammarAccess.getCompOperatorAccess().getGREATEREnumLiteralDeclaration_3()); 
                    // InternalTempor.g:1330:3: ( '>' )
                    // InternalTempor.g:1330:4: '>'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getCompOperatorAccess().getGREATEREnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__CompOperator__Alternatives"


    // $ANTLR start "rule__DeclVarInput__Group__0"
    // InternalTempor.g:1338:1: rule__DeclVarInput__Group__0 : rule__DeclVarInput__Group__0__Impl rule__DeclVarInput__Group__1 ;
    public final void rule__DeclVarInput__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:1342:1: ( rule__DeclVarInput__Group__0__Impl rule__DeclVarInput__Group__1 )
            // InternalTempor.g:1343:2: rule__DeclVarInput__Group__0__Impl rule__DeclVarInput__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DeclVarInput__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclVarInput__Group__1();

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
    // $ANTLR end "rule__DeclVarInput__Group__0"


    // $ANTLR start "rule__DeclVarInput__Group__0__Impl"
    // InternalTempor.g:1350:1: rule__DeclVarInput__Group__0__Impl : ( () ) ;
    public final void rule__DeclVarInput__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:1354:1: ( ( () ) )
            // InternalTempor.g:1355:1: ( () )
            {
            // InternalTempor.g:1355:1: ( () )
            // InternalTempor.g:1356:2: ()
            {
             before(grammarAccess.getDeclVarInputAccess().getDeclVarInputAction_0()); 
            // InternalTempor.g:1357:2: ()
            // InternalTempor.g:1357:3: 
            {
            }

             after(grammarAccess.getDeclVarInputAccess().getDeclVarInputAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclVarInput__Group__0__Impl"


    // $ANTLR start "rule__DeclVarInput__Group__1"
    // InternalTempor.g:1365:1: rule__DeclVarInput__Group__1 : rule__DeclVarInput__Group__1__Impl rule__DeclVarInput__Group__2 ;
    public final void rule__DeclVarInput__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:1369:1: ( rule__DeclVarInput__Group__1__Impl rule__DeclVarInput__Group__2 )
            // InternalTempor.g:1370:2: rule__DeclVarInput__Group__1__Impl rule__DeclVarInput__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__DeclVarInput__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclVarInput__Group__2();

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
    // $ANTLR end "rule__DeclVarInput__Group__1"


    // $ANTLR start "rule__DeclVarInput__Group__1__Impl"
    // InternalTempor.g:1377:1: rule__DeclVarInput__Group__1__Impl : ( 'VAR_INPUT' ) ;
    public final void rule__DeclVarInput__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:1381:1: ( ( 'VAR_INPUT' ) )
            // InternalTempor.g:1382:1: ( 'VAR_INPUT' )
            {
            // InternalTempor.g:1382:1: ( 'VAR_INPUT' )
            // InternalTempor.g:1383:2: 'VAR_INPUT'
            {
             before(grammarAccess.getDeclVarInputAccess().getVAR_INPUTKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getDeclVarInputAccess().getVAR_INPUTKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclVarInput__Group__1__Impl"


    // $ANTLR start "rule__DeclVarInput__Group__2"
    // InternalTempor.g:1392:1: rule__DeclVarInput__Group__2 : rule__DeclVarInput__Group__2__Impl rule__DeclVarInput__Group__3 ;
    public final void rule__DeclVarInput__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:1396:1: ( rule__DeclVarInput__Group__2__Impl rule__DeclVarInput__Group__3 )
            // InternalTempor.g:1397:2: rule__DeclVarInput__Group__2__Impl rule__DeclVarInput__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__DeclVarInput__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclVarInput__Group__3();

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
    // $ANTLR end "rule__DeclVarInput__Group__2"


    // $ANTLR start "rule__DeclVarInput__Group__2__Impl"
    // InternalTempor.g:1404:1: rule__DeclVarInput__Group__2__Impl : ( ( ( rule__DeclVarInput__Group_2__0 ) ) ( ( rule__DeclVarInput__Group_2__0 )* ) ) ;
    public final void rule__DeclVarInput__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:1408:1: ( ( ( ( rule__DeclVarInput__Group_2__0 ) ) ( ( rule__DeclVarInput__Group_2__0 )* ) ) )
            // InternalTempor.g:1409:1: ( ( ( rule__DeclVarInput__Group_2__0 ) ) ( ( rule__DeclVarInput__Group_2__0 )* ) )
            {
            // InternalTempor.g:1409:1: ( ( ( rule__DeclVarInput__Group_2__0 ) ) ( ( rule__DeclVarInput__Group_2__0 )* ) )
            // InternalTempor.g:1410:2: ( ( rule__DeclVarInput__Group_2__0 ) ) ( ( rule__DeclVarInput__Group_2__0 )* )
            {
            // InternalTempor.g:1410:2: ( ( rule__DeclVarInput__Group_2__0 ) )
            // InternalTempor.g:1411:3: ( rule__DeclVarInput__Group_2__0 )
            {
             before(grammarAccess.getDeclVarInputAccess().getGroup_2()); 
            // InternalTempor.g:1412:3: ( rule__DeclVarInput__Group_2__0 )
            // InternalTempor.g:1412:4: rule__DeclVarInput__Group_2__0
            {
            pushFollow(FOLLOW_7);
            rule__DeclVarInput__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getDeclVarInputAccess().getGroup_2()); 

            }

            // InternalTempor.g:1415:2: ( ( rule__DeclVarInput__Group_2__0 )* )
            // InternalTempor.g:1416:3: ( rule__DeclVarInput__Group_2__0 )*
            {
             before(grammarAccess.getDeclVarInputAccess().getGroup_2()); 
            // InternalTempor.g:1417:3: ( rule__DeclVarInput__Group_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalTempor.g:1417:4: rule__DeclVarInput__Group_2__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__DeclVarInput__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getDeclVarInputAccess().getGroup_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclVarInput__Group__2__Impl"


    // $ANTLR start "rule__DeclVarInput__Group__3"
    // InternalTempor.g:1426:1: rule__DeclVarInput__Group__3 : rule__DeclVarInput__Group__3__Impl ;
    public final void rule__DeclVarInput__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:1430:1: ( rule__DeclVarInput__Group__3__Impl )
            // InternalTempor.g:1431:2: rule__DeclVarInput__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeclVarInput__Group__3__Impl();

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
    // $ANTLR end "rule__DeclVarInput__Group__3"


    // $ANTLR start "rule__DeclVarInput__Group__3__Impl"
    // InternalTempor.g:1437:1: rule__DeclVarInput__Group__3__Impl : ( 'END_VAR' ) ;
    public final void rule__DeclVarInput__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:1441:1: ( ( 'END_VAR' ) )
            // InternalTempor.g:1442:1: ( 'END_VAR' )
            {
            // InternalTempor.g:1442:1: ( 'END_VAR' )
            // InternalTempor.g:1443:2: 'END_VAR'
            {
             before(grammarAccess.getDeclVarInputAccess().getEND_VARKeyword_3()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getDeclVarInputAccess().getEND_VARKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclVarInput__Group__3__Impl"


    // $ANTLR start "rule__DeclVarInput__Group_2__0"
    // InternalTempor.g:1453:1: rule__DeclVarInput__Group_2__0 : rule__DeclVarInput__Group_2__0__Impl rule__DeclVarInput__Group_2__1 ;
    public final void rule__DeclVarInput__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:1457:1: ( rule__DeclVarInput__Group_2__0__Impl rule__DeclVarInput__Group_2__1 )
            // InternalTempor.g:1458:2: rule__DeclVarInput__Group_2__0__Impl rule__DeclVarInput__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__DeclVarInput__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclVarInput__Group_2__1();

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
    // $ANTLR end "rule__DeclVarInput__Group_2__0"


    // $ANTLR start "rule__DeclVarInput__Group_2__0__Impl"
    // InternalTempor.g:1465:1: rule__DeclVarInput__Group_2__0__Impl : ( ( rule__DeclVarInput__VarDeclsAssignment_2_0 ) ) ;
    public final void rule__DeclVarInput__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:1469:1: ( ( ( rule__DeclVarInput__VarDeclsAssignment_2_0 ) ) )
            // InternalTempor.g:1470:1: ( ( rule__DeclVarInput__VarDeclsAssignment_2_0 ) )
            {
            // InternalTempor.g:1470:1: ( ( rule__DeclVarInput__VarDeclsAssignment_2_0 ) )
            // InternalTempor.g:1471:2: ( rule__DeclVarInput__VarDeclsAssignment_2_0 )
            {
             before(grammarAccess.getDeclVarInputAccess().getVarDeclsAssignment_2_0()); 
            // InternalTempor.g:1472:2: ( rule__DeclVarInput__VarDeclsAssignment_2_0 )
            // InternalTempor.g:1472:3: rule__DeclVarInput__VarDeclsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__DeclVarInput__VarDeclsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getDeclVarInputAccess().getVarDeclsAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclVarInput__Group_2__0__Impl"


    // $ANTLR start "rule__DeclVarInput__Group_2__1"
    // InternalTempor.g:1480:1: rule__DeclVarInput__Group_2__1 : rule__DeclVarInput__Group_2__1__Impl ;
    public final void rule__DeclVarInput__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:1484:1: ( rule__DeclVarInput__Group_2__1__Impl )
            // InternalTempor.g:1485:2: rule__DeclVarInput__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeclVarInput__Group_2__1__Impl();

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
    // $ANTLR end "rule__DeclVarInput__Group_2__1"


    // $ANTLR start "rule__DeclVarInput__Group_2__1__Impl"
    // InternalTempor.g:1491:1: rule__DeclVarInput__Group_2__1__Impl : ( ';' ) ;
    public final void rule__DeclVarInput__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:1495:1: ( ( ';' ) )
            // InternalTempor.g:1496:1: ( ';' )
            {
            // InternalTempor.g:1496:1: ( ';' )
            // InternalTempor.g:1497:2: ';'
            {
             before(grammarAccess.getDeclVarInputAccess().getSemicolonKeyword_2_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getDeclVarInputAccess().getSemicolonKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclVarInput__Group_2__1__Impl"


    // $ANTLR start "rule__DeclVarOutput__Group__0"
    // InternalTempor.g:1507:1: rule__DeclVarOutput__Group__0 : rule__DeclVarOutput__Group__0__Impl rule__DeclVarOutput__Group__1 ;
    public final void rule__DeclVarOutput__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:1511:1: ( rule__DeclVarOutput__Group__0__Impl rule__DeclVarOutput__Group__1 )
            // InternalTempor.g:1512:2: rule__DeclVarOutput__Group__0__Impl rule__DeclVarOutput__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__DeclVarOutput__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclVarOutput__Group__1();

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
    // $ANTLR end "rule__DeclVarOutput__Group__0"


    // $ANTLR start "rule__DeclVarOutput__Group__0__Impl"
    // InternalTempor.g:1519:1: rule__DeclVarOutput__Group__0__Impl : ( () ) ;
    public final void rule__DeclVarOutput__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:1523:1: ( ( () ) )
            // InternalTempor.g:1524:1: ( () )
            {
            // InternalTempor.g:1524:1: ( () )
            // InternalTempor.g:1525:2: ()
            {
             before(grammarAccess.getDeclVarOutputAccess().getDeclVarOutputAction_0()); 
            // InternalTempor.g:1526:2: ()
            // InternalTempor.g:1526:3: 
            {
            }

             after(grammarAccess.getDeclVarOutputAccess().getDeclVarOutputAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclVarOutput__Group__0__Impl"


    // $ANTLR start "rule__DeclVarOutput__Group__1"
    // InternalTempor.g:1534:1: rule__DeclVarOutput__Group__1 : rule__DeclVarOutput__Group__1__Impl rule__DeclVarOutput__Group__2 ;
    public final void rule__DeclVarOutput__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:1538:1: ( rule__DeclVarOutput__Group__1__Impl rule__DeclVarOutput__Group__2 )
            // InternalTempor.g:1539:2: rule__DeclVarOutput__Group__1__Impl rule__DeclVarOutput__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__DeclVarOutput__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclVarOutput__Group__2();

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
    // $ANTLR end "rule__DeclVarOutput__Group__1"


    // $ANTLR start "rule__DeclVarOutput__Group__1__Impl"
    // InternalTempor.g:1546:1: rule__DeclVarOutput__Group__1__Impl : ( 'VAR_OUTPUT' ) ;
    public final void rule__DeclVarOutput__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:1550:1: ( ( 'VAR_OUTPUT' ) )
            // InternalTempor.g:1551:1: ( 'VAR_OUTPUT' )
            {
            // InternalTempor.g:1551:1: ( 'VAR_OUTPUT' )
            // InternalTempor.g:1552:2: 'VAR_OUTPUT'
            {
             before(grammarAccess.getDeclVarOutputAccess().getVAR_OUTPUTKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getDeclVarOutputAccess().getVAR_OUTPUTKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclVarOutput__Group__1__Impl"


    // $ANTLR start "rule__DeclVarOutput__Group__2"
    // InternalTempor.g:1561:1: rule__DeclVarOutput__Group__2 : rule__DeclVarOutput__Group__2__Impl rule__DeclVarOutput__Group__3 ;
    public final void rule__DeclVarOutput__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:1565:1: ( rule__DeclVarOutput__Group__2__Impl rule__DeclVarOutput__Group__3 )
            // InternalTempor.g:1566:2: rule__DeclVarOutput__Group__2__Impl rule__DeclVarOutput__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__DeclVarOutput__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclVarOutput__Group__3();

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
    // $ANTLR end "rule__DeclVarOutput__Group__2"


    // $ANTLR start "rule__DeclVarOutput__Group__2__Impl"
    // InternalTempor.g:1573:1: rule__DeclVarOutput__Group__2__Impl : ( ( ( rule__DeclVarOutput__Group_2__0 ) ) ( ( rule__DeclVarOutput__Group_2__0 )* ) ) ;
    public final void rule__DeclVarOutput__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:1577:1: ( ( ( ( rule__DeclVarOutput__Group_2__0 ) ) ( ( rule__DeclVarOutput__Group_2__0 )* ) ) )
            // InternalTempor.g:1578:1: ( ( ( rule__DeclVarOutput__Group_2__0 ) ) ( ( rule__DeclVarOutput__Group_2__0 )* ) )
            {
            // InternalTempor.g:1578:1: ( ( ( rule__DeclVarOutput__Group_2__0 ) ) ( ( rule__DeclVarOutput__Group_2__0 )* ) )
            // InternalTempor.g:1579:2: ( ( rule__DeclVarOutput__Group_2__0 ) ) ( ( rule__DeclVarOutput__Group_2__0 )* )
            {
            // InternalTempor.g:1579:2: ( ( rule__DeclVarOutput__Group_2__0 ) )
            // InternalTempor.g:1580:3: ( rule__DeclVarOutput__Group_2__0 )
            {
             before(grammarAccess.getDeclVarOutputAccess().getGroup_2()); 
            // InternalTempor.g:1581:3: ( rule__DeclVarOutput__Group_2__0 )
            // InternalTempor.g:1581:4: rule__DeclVarOutput__Group_2__0
            {
            pushFollow(FOLLOW_7);
            rule__DeclVarOutput__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getDeclVarOutputAccess().getGroup_2()); 

            }

            // InternalTempor.g:1584:2: ( ( rule__DeclVarOutput__Group_2__0 )* )
            // InternalTempor.g:1585:3: ( rule__DeclVarOutput__Group_2__0 )*
            {
             before(grammarAccess.getDeclVarOutputAccess().getGroup_2()); 
            // InternalTempor.g:1586:3: ( rule__DeclVarOutput__Group_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalTempor.g:1586:4: rule__DeclVarOutput__Group_2__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__DeclVarOutput__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getDeclVarOutputAccess().getGroup_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclVarOutput__Group__2__Impl"


    // $ANTLR start "rule__DeclVarOutput__Group__3"
    // InternalTempor.g:1595:1: rule__DeclVarOutput__Group__3 : rule__DeclVarOutput__Group__3__Impl ;
    public final void rule__DeclVarOutput__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:1599:1: ( rule__DeclVarOutput__Group__3__Impl )
            // InternalTempor.g:1600:2: rule__DeclVarOutput__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeclVarOutput__Group__3__Impl();

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
    // $ANTLR end "rule__DeclVarOutput__Group__3"


    // $ANTLR start "rule__DeclVarOutput__Group__3__Impl"
    // InternalTempor.g:1606:1: rule__DeclVarOutput__Group__3__Impl : ( 'END_VAR' ) ;
    public final void rule__DeclVarOutput__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:1610:1: ( ( 'END_VAR' ) )
            // InternalTempor.g:1611:1: ( 'END_VAR' )
            {
            // InternalTempor.g:1611:1: ( 'END_VAR' )
            // InternalTempor.g:1612:2: 'END_VAR'
            {
             before(grammarAccess.getDeclVarOutputAccess().getEND_VARKeyword_3()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getDeclVarOutputAccess().getEND_VARKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclVarOutput__Group__3__Impl"


    // $ANTLR start "rule__DeclVarOutput__Group_2__0"
    // InternalTempor.g:1622:1: rule__DeclVarOutput__Group_2__0 : rule__DeclVarOutput__Group_2__0__Impl rule__DeclVarOutput__Group_2__1 ;
    public final void rule__DeclVarOutput__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:1626:1: ( rule__DeclVarOutput__Group_2__0__Impl rule__DeclVarOutput__Group_2__1 )
            // InternalTempor.g:1627:2: rule__DeclVarOutput__Group_2__0__Impl rule__DeclVarOutput__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__DeclVarOutput__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclVarOutput__Group_2__1();

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
    // $ANTLR end "rule__DeclVarOutput__Group_2__0"


    // $ANTLR start "rule__DeclVarOutput__Group_2__0__Impl"
    // InternalTempor.g:1634:1: rule__DeclVarOutput__Group_2__0__Impl : ( ( rule__DeclVarOutput__VarDeclsAssignment_2_0 ) ) ;
    public final void rule__DeclVarOutput__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:1638:1: ( ( ( rule__DeclVarOutput__VarDeclsAssignment_2_0 ) ) )
            // InternalTempor.g:1639:1: ( ( rule__DeclVarOutput__VarDeclsAssignment_2_0 ) )
            {
            // InternalTempor.g:1639:1: ( ( rule__DeclVarOutput__VarDeclsAssignment_2_0 ) )
            // InternalTempor.g:1640:2: ( rule__DeclVarOutput__VarDeclsAssignment_2_0 )
            {
             before(grammarAccess.getDeclVarOutputAccess().getVarDeclsAssignment_2_0()); 
            // InternalTempor.g:1641:2: ( rule__DeclVarOutput__VarDeclsAssignment_2_0 )
            // InternalTempor.g:1641:3: rule__DeclVarOutput__VarDeclsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__DeclVarOutput__VarDeclsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getDeclVarOutputAccess().getVarDeclsAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclVarOutput__Group_2__0__Impl"


    // $ANTLR start "rule__DeclVarOutput__Group_2__1"
    // InternalTempor.g:1649:1: rule__DeclVarOutput__Group_2__1 : rule__DeclVarOutput__Group_2__1__Impl ;
    public final void rule__DeclVarOutput__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:1653:1: ( rule__DeclVarOutput__Group_2__1__Impl )
            // InternalTempor.g:1654:2: rule__DeclVarOutput__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeclVarOutput__Group_2__1__Impl();

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
    // $ANTLR end "rule__DeclVarOutput__Group_2__1"


    // $ANTLR start "rule__DeclVarOutput__Group_2__1__Impl"
    // InternalTempor.g:1660:1: rule__DeclVarOutput__Group_2__1__Impl : ( ';' ) ;
    public final void rule__DeclVarOutput__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:1664:1: ( ( ';' ) )
            // InternalTempor.g:1665:1: ( ';' )
            {
            // InternalTempor.g:1665:1: ( ';' )
            // InternalTempor.g:1666:2: ';'
            {
             before(grammarAccess.getDeclVarOutputAccess().getSemicolonKeyword_2_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getDeclVarOutputAccess().getSemicolonKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclVarOutput__Group_2__1__Impl"


    // $ANTLR start "rule__VarDeclaration__Group__0"
    // InternalTempor.g:1676:1: rule__VarDeclaration__Group__0 : rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1 ;
    public final void rule__VarDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:1680:1: ( rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1 )
            // InternalTempor.g:1681:2: rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__VarDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group__1();

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
    // $ANTLR end "rule__VarDeclaration__Group__0"


    // $ANTLR start "rule__VarDeclaration__Group__0__Impl"
    // InternalTempor.g:1688:1: rule__VarDeclaration__Group__0__Impl : ( ( rule__VarDeclaration__NameAssignment_0 ) ) ;
    public final void rule__VarDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:1692:1: ( ( ( rule__VarDeclaration__NameAssignment_0 ) ) )
            // InternalTempor.g:1693:1: ( ( rule__VarDeclaration__NameAssignment_0 ) )
            {
            // InternalTempor.g:1693:1: ( ( rule__VarDeclaration__NameAssignment_0 ) )
            // InternalTempor.g:1694:2: ( rule__VarDeclaration__NameAssignment_0 )
            {
             before(grammarAccess.getVarDeclarationAccess().getNameAssignment_0()); 
            // InternalTempor.g:1695:2: ( rule__VarDeclaration__NameAssignment_0 )
            // InternalTempor.g:1695:3: rule__VarDeclaration__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVarDeclarationAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group__0__Impl"


    // $ANTLR start "rule__VarDeclaration__Group__1"
    // InternalTempor.g:1703:1: rule__VarDeclaration__Group__1 : rule__VarDeclaration__Group__1__Impl rule__VarDeclaration__Group__2 ;
    public final void rule__VarDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:1707:1: ( rule__VarDeclaration__Group__1__Impl rule__VarDeclaration__Group__2 )
            // InternalTempor.g:1708:2: rule__VarDeclaration__Group__1__Impl rule__VarDeclaration__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__VarDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group__2();

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
    // $ANTLR end "rule__VarDeclaration__Group__1"


    // $ANTLR start "rule__VarDeclaration__Group__1__Impl"
    // InternalTempor.g:1715:1: rule__VarDeclaration__Group__1__Impl : ( ':' ) ;
    public final void rule__VarDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:1719:1: ( ( ':' ) )
            // InternalTempor.g:1720:1: ( ':' )
            {
            // InternalTempor.g:1720:1: ( ':' )
            // InternalTempor.g:1721:2: ':'
            {
             before(grammarAccess.getVarDeclarationAccess().getColonKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getVarDeclarationAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group__1__Impl"


    // $ANTLR start "rule__VarDeclaration__Group__2"
    // InternalTempor.g:1730:1: rule__VarDeclaration__Group__2 : rule__VarDeclaration__Group__2__Impl ;
    public final void rule__VarDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:1734:1: ( rule__VarDeclaration__Group__2__Impl )
            // InternalTempor.g:1735:2: rule__VarDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group__2__Impl();

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
    // $ANTLR end "rule__VarDeclaration__Group__2"


    // $ANTLR start "rule__VarDeclaration__Group__2__Impl"
    // InternalTempor.g:1741:1: rule__VarDeclaration__Group__2__Impl : ( ( rule__VarDeclaration__TypeAssignment_2 ) ) ;
    public final void rule__VarDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:1745:1: ( ( ( rule__VarDeclaration__TypeAssignment_2 ) ) )
            // InternalTempor.g:1746:1: ( ( rule__VarDeclaration__TypeAssignment_2 ) )
            {
            // InternalTempor.g:1746:1: ( ( rule__VarDeclaration__TypeAssignment_2 ) )
            // InternalTempor.g:1747:2: ( rule__VarDeclaration__TypeAssignment_2 )
            {
             before(grammarAccess.getVarDeclarationAccess().getTypeAssignment_2()); 
            // InternalTempor.g:1748:2: ( rule__VarDeclaration__TypeAssignment_2 )
            // InternalTempor.g:1748:3: rule__VarDeclaration__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVarDeclarationAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group__2__Impl"


    // $ANTLR start "rule__SentDeclaration__Group__0"
    // InternalTempor.g:1757:1: rule__SentDeclaration__Group__0 : rule__SentDeclaration__Group__0__Impl rule__SentDeclaration__Group__1 ;
    public final void rule__SentDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:1761:1: ( rule__SentDeclaration__Group__0__Impl rule__SentDeclaration__Group__1 )
            // InternalTempor.g:1762:2: rule__SentDeclaration__Group__0__Impl rule__SentDeclaration__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__SentDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SentDeclaration__Group__1();

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
    // $ANTLR end "rule__SentDeclaration__Group__0"


    // $ANTLR start "rule__SentDeclaration__Group__0__Impl"
    // InternalTempor.g:1769:1: rule__SentDeclaration__Group__0__Impl : ( () ) ;
    public final void rule__SentDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:1773:1: ( ( () ) )
            // InternalTempor.g:1774:1: ( () )
            {
            // InternalTempor.g:1774:1: ( () )
            // InternalTempor.g:1775:2: ()
            {
             before(grammarAccess.getSentDeclarationAccess().getSentDeclarationAction_0()); 
            // InternalTempor.g:1776:2: ()
            // InternalTempor.g:1776:3: 
            {
            }

             after(grammarAccess.getSentDeclarationAccess().getSentDeclarationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentDeclaration__Group__0__Impl"


    // $ANTLR start "rule__SentDeclaration__Group__1"
    // InternalTempor.g:1784:1: rule__SentDeclaration__Group__1 : rule__SentDeclaration__Group__1__Impl rule__SentDeclaration__Group__2 ;
    public final void rule__SentDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:1788:1: ( rule__SentDeclaration__Group__1__Impl rule__SentDeclaration__Group__2 )
            // InternalTempor.g:1789:2: rule__SentDeclaration__Group__1__Impl rule__SentDeclaration__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__SentDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SentDeclaration__Group__2();

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
    // $ANTLR end "rule__SentDeclaration__Group__1"


    // $ANTLR start "rule__SentDeclaration__Group__1__Impl"
    // InternalTempor.g:1796:1: rule__SentDeclaration__Group__1__Impl : ( 'SENTENCE' ) ;
    public final void rule__SentDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:1800:1: ( ( 'SENTENCE' ) )
            // InternalTempor.g:1801:1: ( 'SENTENCE' )
            {
            // InternalTempor.g:1801:1: ( 'SENTENCE' )
            // InternalTempor.g:1802:2: 'SENTENCE'
            {
             before(grammarAccess.getSentDeclarationAccess().getSENTENCEKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getSentDeclarationAccess().getSENTENCEKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentDeclaration__Group__1__Impl"


    // $ANTLR start "rule__SentDeclaration__Group__2"
    // InternalTempor.g:1811:1: rule__SentDeclaration__Group__2 : rule__SentDeclaration__Group__2__Impl rule__SentDeclaration__Group__3 ;
    public final void rule__SentDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:1815:1: ( rule__SentDeclaration__Group__2__Impl rule__SentDeclaration__Group__3 )
            // InternalTempor.g:1816:2: rule__SentDeclaration__Group__2__Impl rule__SentDeclaration__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__SentDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SentDeclaration__Group__3();

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
    // $ANTLR end "rule__SentDeclaration__Group__2"


    // $ANTLR start "rule__SentDeclaration__Group__2__Impl"
    // InternalTempor.g:1823:1: rule__SentDeclaration__Group__2__Impl : ( ( rule__SentDeclaration__DeclarationNameAssignment_2 ) ) ;
    public final void rule__SentDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:1827:1: ( ( ( rule__SentDeclaration__DeclarationNameAssignment_2 ) ) )
            // InternalTempor.g:1828:1: ( ( rule__SentDeclaration__DeclarationNameAssignment_2 ) )
            {
            // InternalTempor.g:1828:1: ( ( rule__SentDeclaration__DeclarationNameAssignment_2 ) )
            // InternalTempor.g:1829:2: ( rule__SentDeclaration__DeclarationNameAssignment_2 )
            {
             before(grammarAccess.getSentDeclarationAccess().getDeclarationNameAssignment_2()); 
            // InternalTempor.g:1830:2: ( rule__SentDeclaration__DeclarationNameAssignment_2 )
            // InternalTempor.g:1830:3: rule__SentDeclaration__DeclarationNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SentDeclaration__DeclarationNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSentDeclarationAccess().getDeclarationNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentDeclaration__Group__2__Impl"


    // $ANTLR start "rule__SentDeclaration__Group__3"
    // InternalTempor.g:1838:1: rule__SentDeclaration__Group__3 : rule__SentDeclaration__Group__3__Impl rule__SentDeclaration__Group__4 ;
    public final void rule__SentDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:1842:1: ( rule__SentDeclaration__Group__3__Impl rule__SentDeclaration__Group__4 )
            // InternalTempor.g:1843:2: rule__SentDeclaration__Group__3__Impl rule__SentDeclaration__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__SentDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SentDeclaration__Group__4();

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
    // $ANTLR end "rule__SentDeclaration__Group__3"


    // $ANTLR start "rule__SentDeclaration__Group__3__Impl"
    // InternalTempor.g:1850:1: rule__SentDeclaration__Group__3__Impl : ( ( rule__SentDeclaration__SentenceDeclarationAssignment_3 ) ) ;
    public final void rule__SentDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:1854:1: ( ( ( rule__SentDeclaration__SentenceDeclarationAssignment_3 ) ) )
            // InternalTempor.g:1855:1: ( ( rule__SentDeclaration__SentenceDeclarationAssignment_3 ) )
            {
            // InternalTempor.g:1855:1: ( ( rule__SentDeclaration__SentenceDeclarationAssignment_3 ) )
            // InternalTempor.g:1856:2: ( rule__SentDeclaration__SentenceDeclarationAssignment_3 )
            {
             before(grammarAccess.getSentDeclarationAccess().getSentenceDeclarationAssignment_3()); 
            // InternalTempor.g:1857:2: ( rule__SentDeclaration__SentenceDeclarationAssignment_3 )
            // InternalTempor.g:1857:3: rule__SentDeclaration__SentenceDeclarationAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SentDeclaration__SentenceDeclarationAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSentDeclarationAccess().getSentenceDeclarationAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentDeclaration__Group__3__Impl"


    // $ANTLR start "rule__SentDeclaration__Group__4"
    // InternalTempor.g:1865:1: rule__SentDeclaration__Group__4 : rule__SentDeclaration__Group__4__Impl ;
    public final void rule__SentDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:1869:1: ( rule__SentDeclaration__Group__4__Impl )
            // InternalTempor.g:1870:2: rule__SentDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SentDeclaration__Group__4__Impl();

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
    // $ANTLR end "rule__SentDeclaration__Group__4"


    // $ANTLR start "rule__SentDeclaration__Group__4__Impl"
    // InternalTempor.g:1876:1: rule__SentDeclaration__Group__4__Impl : ( 'END_SENTENCE' ) ;
    public final void rule__SentDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:1880:1: ( ( 'END_SENTENCE' ) )
            // InternalTempor.g:1881:1: ( 'END_SENTENCE' )
            {
            // InternalTempor.g:1881:1: ( 'END_SENTENCE' )
            // InternalTempor.g:1882:2: 'END_SENTENCE'
            {
             before(grammarAccess.getSentDeclarationAccess().getEND_SENTENCEKeyword_4()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getSentDeclarationAccess().getEND_SENTENCEKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentDeclaration__Group__4__Impl"


    // $ANTLR start "rule__SentenceDeclaration__Group__0"
    // InternalTempor.g:1892:1: rule__SentenceDeclaration__Group__0 : rule__SentenceDeclaration__Group__0__Impl rule__SentenceDeclaration__Group__1 ;
    public final void rule__SentenceDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:1896:1: ( rule__SentenceDeclaration__Group__0__Impl rule__SentenceDeclaration__Group__1 )
            // InternalTempor.g:1897:2: rule__SentenceDeclaration__Group__0__Impl rule__SentenceDeclaration__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__SentenceDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SentenceDeclaration__Group__1();

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
    // $ANTLR end "rule__SentenceDeclaration__Group__0"


    // $ANTLR start "rule__SentenceDeclaration__Group__0__Impl"
    // InternalTempor.g:1904:1: rule__SentenceDeclaration__Group__0__Impl : ( () ) ;
    public final void rule__SentenceDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:1908:1: ( ( () ) )
            // InternalTempor.g:1909:1: ( () )
            {
            // InternalTempor.g:1909:1: ( () )
            // InternalTempor.g:1910:2: ()
            {
             before(grammarAccess.getSentenceDeclarationAccess().getSentenceDeclarationAction_0()); 
            // InternalTempor.g:1911:2: ()
            // InternalTempor.g:1911:3: 
            {
            }

             after(grammarAccess.getSentenceDeclarationAccess().getSentenceDeclarationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentenceDeclaration__Group__0__Impl"


    // $ANTLR start "rule__SentenceDeclaration__Group__1"
    // InternalTempor.g:1919:1: rule__SentenceDeclaration__Group__1 : rule__SentenceDeclaration__Group__1__Impl rule__SentenceDeclaration__Group__2 ;
    public final void rule__SentenceDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:1923:1: ( rule__SentenceDeclaration__Group__1__Impl rule__SentenceDeclaration__Group__2 )
            // InternalTempor.g:1924:2: rule__SentenceDeclaration__Group__1__Impl rule__SentenceDeclaration__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__SentenceDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SentenceDeclaration__Group__2();

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
    // $ANTLR end "rule__SentenceDeclaration__Group__1"


    // $ANTLR start "rule__SentenceDeclaration__Group__1__Impl"
    // InternalTempor.g:1931:1: rule__SentenceDeclaration__Group__1__Impl : ( ( rule__SentenceDeclaration__NameAssignment_1 ) ) ;
    public final void rule__SentenceDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:1935:1: ( ( ( rule__SentenceDeclaration__NameAssignment_1 ) ) )
            // InternalTempor.g:1936:1: ( ( rule__SentenceDeclaration__NameAssignment_1 ) )
            {
            // InternalTempor.g:1936:1: ( ( rule__SentenceDeclaration__NameAssignment_1 ) )
            // InternalTempor.g:1937:2: ( rule__SentenceDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getSentenceDeclarationAccess().getNameAssignment_1()); 
            // InternalTempor.g:1938:2: ( rule__SentenceDeclaration__NameAssignment_1 )
            // InternalTempor.g:1938:3: rule__SentenceDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SentenceDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSentenceDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentenceDeclaration__Group__1__Impl"


    // $ANTLR start "rule__SentenceDeclaration__Group__2"
    // InternalTempor.g:1946:1: rule__SentenceDeclaration__Group__2 : rule__SentenceDeclaration__Group__2__Impl rule__SentenceDeclaration__Group__3 ;
    public final void rule__SentenceDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:1950:1: ( rule__SentenceDeclaration__Group__2__Impl rule__SentenceDeclaration__Group__3 )
            // InternalTempor.g:1951:2: rule__SentenceDeclaration__Group__2__Impl rule__SentenceDeclaration__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__SentenceDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SentenceDeclaration__Group__3();

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
    // $ANTLR end "rule__SentenceDeclaration__Group__2"


    // $ANTLR start "rule__SentenceDeclaration__Group__2__Impl"
    // InternalTempor.g:1958:1: rule__SentenceDeclaration__Group__2__Impl : ( '=' ) ;
    public final void rule__SentenceDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:1962:1: ( ( '=' ) )
            // InternalTempor.g:1963:1: ( '=' )
            {
            // InternalTempor.g:1963:1: ( '=' )
            // InternalTempor.g:1964:2: '='
            {
             before(grammarAccess.getSentenceDeclarationAccess().getEqualsSignKeyword_2()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getSentenceDeclarationAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentenceDeclaration__Group__2__Impl"


    // $ANTLR start "rule__SentenceDeclaration__Group__3"
    // InternalTempor.g:1973:1: rule__SentenceDeclaration__Group__3 : rule__SentenceDeclaration__Group__3__Impl ;
    public final void rule__SentenceDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:1977:1: ( rule__SentenceDeclaration__Group__3__Impl )
            // InternalTempor.g:1978:2: rule__SentenceDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SentenceDeclaration__Group__3__Impl();

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
    // $ANTLR end "rule__SentenceDeclaration__Group__3"


    // $ANTLR start "rule__SentenceDeclaration__Group__3__Impl"
    // InternalTempor.g:1984:1: rule__SentenceDeclaration__Group__3__Impl : ( ( rule__SentenceDeclaration__LogicExpressionAssignment_3 ) ) ;
    public final void rule__SentenceDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:1988:1: ( ( ( rule__SentenceDeclaration__LogicExpressionAssignment_3 ) ) )
            // InternalTempor.g:1989:1: ( ( rule__SentenceDeclaration__LogicExpressionAssignment_3 ) )
            {
            // InternalTempor.g:1989:1: ( ( rule__SentenceDeclaration__LogicExpressionAssignment_3 ) )
            // InternalTempor.g:1990:2: ( rule__SentenceDeclaration__LogicExpressionAssignment_3 )
            {
             before(grammarAccess.getSentenceDeclarationAccess().getLogicExpressionAssignment_3()); 
            // InternalTempor.g:1991:2: ( rule__SentenceDeclaration__LogicExpressionAssignment_3 )
            // InternalTempor.g:1991:3: rule__SentenceDeclaration__LogicExpressionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SentenceDeclaration__LogicExpressionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSentenceDeclarationAccess().getLogicExpressionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentenceDeclaration__Group__3__Impl"


    // $ANTLR start "rule__Expression__Group__0"
    // InternalTempor.g:2000:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2004:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalTempor.g:2005:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group__1();

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
    // $ANTLR end "rule__Expression__Group__0"


    // $ANTLR start "rule__Expression__Group__0__Impl"
    // InternalTempor.g:2012:1: rule__Expression__Group__0__Impl : ( ruleXorExpression ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2016:1: ( ( ruleXorExpression ) )
            // InternalTempor.g:2017:1: ( ruleXorExpression )
            {
            // InternalTempor.g:2017:1: ( ruleXorExpression )
            // InternalTempor.g:2018:2: ruleXorExpression
            {
             before(grammarAccess.getExpressionAccess().getXorExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleXorExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getXorExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0__Impl"


    // $ANTLR start "rule__Expression__Group__1"
    // InternalTempor.g:2027:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2031:1: ( rule__Expression__Group__1__Impl )
            // InternalTempor.g:2032:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__1__Impl();

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
    // $ANTLR end "rule__Expression__Group__1"


    // $ANTLR start "rule__Expression__Group__1__Impl"
    // InternalTempor.g:2038:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )* ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2042:1: ( ( ( rule__Expression__Group_1__0 )* ) )
            // InternalTempor.g:2043:1: ( ( rule__Expression__Group_1__0 )* )
            {
            // InternalTempor.g:2043:1: ( ( rule__Expression__Group_1__0 )* )
            // InternalTempor.g:2044:2: ( rule__Expression__Group_1__0 )*
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // InternalTempor.g:2045:2: ( rule__Expression__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_OR_OPERATOR) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalTempor.g:2045:3: rule__Expression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Expression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1__Impl"


    // $ANTLR start "rule__Expression__Group_1__0"
    // InternalTempor.g:2054:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2058:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalTempor.g:2059:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_17);
            rule__Expression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__1();

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
    // $ANTLR end "rule__Expression__Group_1__0"


    // $ANTLR start "rule__Expression__Group_1__0__Impl"
    // InternalTempor.g:2066:1: rule__Expression__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2070:1: ( ( () ) )
            // InternalTempor.g:2071:1: ( () )
            {
            // InternalTempor.g:2071:1: ( () )
            // InternalTempor.g:2072:2: ()
            {
             before(grammarAccess.getExpressionAccess().getExpressionLeftAction_1_0()); 
            // InternalTempor.g:2073:2: ()
            // InternalTempor.g:2073:3: 
            {
            }

             after(grammarAccess.getExpressionAccess().getExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0__Impl"


    // $ANTLR start "rule__Expression__Group_1__1"
    // InternalTempor.g:2081:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2085:1: ( rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 )
            // InternalTempor.g:2086:2: rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2
            {
            pushFollow(FOLLOW_16);
            rule__Expression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__2();

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
    // $ANTLR end "rule__Expression__Group_1__1"


    // $ANTLR start "rule__Expression__Group_1__1__Impl"
    // InternalTempor.g:2093:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__OrOpAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2097:1: ( ( ( rule__Expression__OrOpAssignment_1_1 ) ) )
            // InternalTempor.g:2098:1: ( ( rule__Expression__OrOpAssignment_1_1 ) )
            {
            // InternalTempor.g:2098:1: ( ( rule__Expression__OrOpAssignment_1_1 ) )
            // InternalTempor.g:2099:2: ( rule__Expression__OrOpAssignment_1_1 )
            {
             before(grammarAccess.getExpressionAccess().getOrOpAssignment_1_1()); 
            // InternalTempor.g:2100:2: ( rule__Expression__OrOpAssignment_1_1 )
            // InternalTempor.g:2100:3: rule__Expression__OrOpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression__OrOpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getOrOpAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__1__Impl"


    // $ANTLR start "rule__Expression__Group_1__2"
    // InternalTempor.g:2108:1: rule__Expression__Group_1__2 : rule__Expression__Group_1__2__Impl ;
    public final void rule__Expression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2112:1: ( rule__Expression__Group_1__2__Impl )
            // InternalTempor.g:2113:2: rule__Expression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__2__Impl();

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
    // $ANTLR end "rule__Expression__Group_1__2"


    // $ANTLR start "rule__Expression__Group_1__2__Impl"
    // InternalTempor.g:2119:1: rule__Expression__Group_1__2__Impl : ( ( rule__Expression__RightAssignment_1_2 ) ) ;
    public final void rule__Expression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2123:1: ( ( ( rule__Expression__RightAssignment_1_2 ) ) )
            // InternalTempor.g:2124:1: ( ( rule__Expression__RightAssignment_1_2 ) )
            {
            // InternalTempor.g:2124:1: ( ( rule__Expression__RightAssignment_1_2 ) )
            // InternalTempor.g:2125:2: ( rule__Expression__RightAssignment_1_2 )
            {
             before(grammarAccess.getExpressionAccess().getRightAssignment_1_2()); 
            // InternalTempor.g:2126:2: ( rule__Expression__RightAssignment_1_2 )
            // InternalTempor.g:2126:3: rule__Expression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Expression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__2__Impl"


    // $ANTLR start "rule__XorExpression__Group__0"
    // InternalTempor.g:2135:1: rule__XorExpression__Group__0 : rule__XorExpression__Group__0__Impl rule__XorExpression__Group__1 ;
    public final void rule__XorExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2139:1: ( rule__XorExpression__Group__0__Impl rule__XorExpression__Group__1 )
            // InternalTempor.g:2140:2: rule__XorExpression__Group__0__Impl rule__XorExpression__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__XorExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XorExpression__Group__1();

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
    // $ANTLR end "rule__XorExpression__Group__0"


    // $ANTLR start "rule__XorExpression__Group__0__Impl"
    // InternalTempor.g:2147:1: rule__XorExpression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__XorExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2151:1: ( ( ruleAndExpression ) )
            // InternalTempor.g:2152:1: ( ruleAndExpression )
            {
            // InternalTempor.g:2152:1: ( ruleAndExpression )
            // InternalTempor.g:2153:2: ruleAndExpression
            {
             before(grammarAccess.getXorExpressionAccess().getAndExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getXorExpressionAccess().getAndExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpression__Group__0__Impl"


    // $ANTLR start "rule__XorExpression__Group__1"
    // InternalTempor.g:2162:1: rule__XorExpression__Group__1 : rule__XorExpression__Group__1__Impl ;
    public final void rule__XorExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2166:1: ( rule__XorExpression__Group__1__Impl )
            // InternalTempor.g:2167:2: rule__XorExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XorExpression__Group__1__Impl();

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
    // $ANTLR end "rule__XorExpression__Group__1"


    // $ANTLR start "rule__XorExpression__Group__1__Impl"
    // InternalTempor.g:2173:1: rule__XorExpression__Group__1__Impl : ( ( rule__XorExpression__Group_1__0 )* ) ;
    public final void rule__XorExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2177:1: ( ( ( rule__XorExpression__Group_1__0 )* ) )
            // InternalTempor.g:2178:1: ( ( rule__XorExpression__Group_1__0 )* )
            {
            // InternalTempor.g:2178:1: ( ( rule__XorExpression__Group_1__0 )* )
            // InternalTempor.g:2179:2: ( rule__XorExpression__Group_1__0 )*
            {
             before(grammarAccess.getXorExpressionAccess().getGroup_1()); 
            // InternalTempor.g:2180:2: ( rule__XorExpression__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==16) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalTempor.g:2180:3: rule__XorExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__XorExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getXorExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpression__Group__1__Impl"


    // $ANTLR start "rule__XorExpression__Group_1__0"
    // InternalTempor.g:2189:1: rule__XorExpression__Group_1__0 : rule__XorExpression__Group_1__0__Impl rule__XorExpression__Group_1__1 ;
    public final void rule__XorExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2193:1: ( rule__XorExpression__Group_1__0__Impl rule__XorExpression__Group_1__1 )
            // InternalTempor.g:2194:2: rule__XorExpression__Group_1__0__Impl rule__XorExpression__Group_1__1
            {
            pushFollow(FOLLOW_19);
            rule__XorExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XorExpression__Group_1__1();

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
    // $ANTLR end "rule__XorExpression__Group_1__0"


    // $ANTLR start "rule__XorExpression__Group_1__0__Impl"
    // InternalTempor.g:2201:1: rule__XorExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__XorExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2205:1: ( ( () ) )
            // InternalTempor.g:2206:1: ( () )
            {
            // InternalTempor.g:2206:1: ( () )
            // InternalTempor.g:2207:2: ()
            {
             before(grammarAccess.getXorExpressionAccess().getXorExpressionLeftAction_1_0()); 
            // InternalTempor.g:2208:2: ()
            // InternalTempor.g:2208:3: 
            {
            }

             after(grammarAccess.getXorExpressionAccess().getXorExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpression__Group_1__0__Impl"


    // $ANTLR start "rule__XorExpression__Group_1__1"
    // InternalTempor.g:2216:1: rule__XorExpression__Group_1__1 : rule__XorExpression__Group_1__1__Impl rule__XorExpression__Group_1__2 ;
    public final void rule__XorExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2220:1: ( rule__XorExpression__Group_1__1__Impl rule__XorExpression__Group_1__2 )
            // InternalTempor.g:2221:2: rule__XorExpression__Group_1__1__Impl rule__XorExpression__Group_1__2
            {
            pushFollow(FOLLOW_16);
            rule__XorExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XorExpression__Group_1__2();

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
    // $ANTLR end "rule__XorExpression__Group_1__1"


    // $ANTLR start "rule__XorExpression__Group_1__1__Impl"
    // InternalTempor.g:2228:1: rule__XorExpression__Group_1__1__Impl : ( ruleXOR_OPERATOR ) ;
    public final void rule__XorExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2232:1: ( ( ruleXOR_OPERATOR ) )
            // InternalTempor.g:2233:1: ( ruleXOR_OPERATOR )
            {
            // InternalTempor.g:2233:1: ( ruleXOR_OPERATOR )
            // InternalTempor.g:2234:2: ruleXOR_OPERATOR
            {
             before(grammarAccess.getXorExpressionAccess().getXOR_OPERATORParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleXOR_OPERATOR();

            state._fsp--;

             after(grammarAccess.getXorExpressionAccess().getXOR_OPERATORParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpression__Group_1__1__Impl"


    // $ANTLR start "rule__XorExpression__Group_1__2"
    // InternalTempor.g:2243:1: rule__XorExpression__Group_1__2 : rule__XorExpression__Group_1__2__Impl ;
    public final void rule__XorExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2247:1: ( rule__XorExpression__Group_1__2__Impl )
            // InternalTempor.g:2248:2: rule__XorExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XorExpression__Group_1__2__Impl();

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
    // $ANTLR end "rule__XorExpression__Group_1__2"


    // $ANTLR start "rule__XorExpression__Group_1__2__Impl"
    // InternalTempor.g:2254:1: rule__XorExpression__Group_1__2__Impl : ( ( rule__XorExpression__RightAssignment_1_2 ) ) ;
    public final void rule__XorExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2258:1: ( ( ( rule__XorExpression__RightAssignment_1_2 ) ) )
            // InternalTempor.g:2259:1: ( ( rule__XorExpression__RightAssignment_1_2 ) )
            {
            // InternalTempor.g:2259:1: ( ( rule__XorExpression__RightAssignment_1_2 ) )
            // InternalTempor.g:2260:2: ( rule__XorExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getXorExpressionAccess().getRightAssignment_1_2()); 
            // InternalTempor.g:2261:2: ( rule__XorExpression__RightAssignment_1_2 )
            // InternalTempor.g:2261:3: rule__XorExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__XorExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getXorExpressionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpression__Group_1__2__Impl"


    // $ANTLR start "rule__AndExpression__Group__0"
    // InternalTempor.g:2270:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2274:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // InternalTempor.g:2275:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__AndExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__1();

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
    // $ANTLR end "rule__AndExpression__Group__0"


    // $ANTLR start "rule__AndExpression__Group__0__Impl"
    // InternalTempor.g:2282:1: rule__AndExpression__Group__0__Impl : ( ruleCompExpression ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2286:1: ( ( ruleCompExpression ) )
            // InternalTempor.g:2287:1: ( ruleCompExpression )
            {
            // InternalTempor.g:2287:1: ( ruleCompExpression )
            // InternalTempor.g:2288:2: ruleCompExpression
            {
             before(grammarAccess.getAndExpressionAccess().getCompExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleCompExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionAccess().getCompExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__0__Impl"


    // $ANTLR start "rule__AndExpression__Group__1"
    // InternalTempor.g:2297:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2301:1: ( rule__AndExpression__Group__1__Impl )
            // InternalTempor.g:2302:2: rule__AndExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__1__Impl();

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
    // $ANTLR end "rule__AndExpression__Group__1"


    // $ANTLR start "rule__AndExpression__Group__1__Impl"
    // InternalTempor.g:2308:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2312:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // InternalTempor.g:2313:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // InternalTempor.g:2313:1: ( ( rule__AndExpression__Group_1__0 )* )
            // InternalTempor.g:2314:2: ( rule__AndExpression__Group_1__0 )*
            {
             before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            // InternalTempor.g:2315:2: ( rule__AndExpression__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==21) ) {
                    alt23=1;
                }
                else if ( (LA23_0==22) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalTempor.g:2315:3: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__AndExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getAndExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__1__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__0"
    // InternalTempor.g:2324:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2328:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // InternalTempor.g:2329:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
            {
            pushFollow(FOLLOW_21);
            rule__AndExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1__1();

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
    // $ANTLR end "rule__AndExpression__Group_1__0"


    // $ANTLR start "rule__AndExpression__Group_1__0__Impl"
    // InternalTempor.g:2336:1: rule__AndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2340:1: ( ( () ) )
            // InternalTempor.g:2341:1: ( () )
            {
            // InternalTempor.g:2341:1: ( () )
            // InternalTempor.g:2342:2: ()
            {
             before(grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0()); 
            // InternalTempor.g:2343:2: ()
            // InternalTempor.g:2343:3: 
            {
            }

             after(grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__0__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__1"
    // InternalTempor.g:2351:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2355:1: ( rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 )
            // InternalTempor.g:2356:2: rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2
            {
            pushFollow(FOLLOW_16);
            rule__AndExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1__2();

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
    // $ANTLR end "rule__AndExpression__Group_1__1"


    // $ANTLR start "rule__AndExpression__Group_1__1__Impl"
    // InternalTempor.g:2363:1: rule__AndExpression__Group_1__1__Impl : ( ( rule__AndExpression__AndOpAssignment_1_1 ) ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2367:1: ( ( ( rule__AndExpression__AndOpAssignment_1_1 ) ) )
            // InternalTempor.g:2368:1: ( ( rule__AndExpression__AndOpAssignment_1_1 ) )
            {
            // InternalTempor.g:2368:1: ( ( rule__AndExpression__AndOpAssignment_1_1 ) )
            // InternalTempor.g:2369:2: ( rule__AndExpression__AndOpAssignment_1_1 )
            {
             before(grammarAccess.getAndExpressionAccess().getAndOpAssignment_1_1()); 
            // InternalTempor.g:2370:2: ( rule__AndExpression__AndOpAssignment_1_1 )
            // InternalTempor.g:2370:3: rule__AndExpression__AndOpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__AndOpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getAndOpAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__1__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__2"
    // InternalTempor.g:2378:1: rule__AndExpression__Group_1__2 : rule__AndExpression__Group_1__2__Impl ;
    public final void rule__AndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2382:1: ( rule__AndExpression__Group_1__2__Impl )
            // InternalTempor.g:2383:2: rule__AndExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1__2__Impl();

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
    // $ANTLR end "rule__AndExpression__Group_1__2"


    // $ANTLR start "rule__AndExpression__Group_1__2__Impl"
    // InternalTempor.g:2389:1: rule__AndExpression__Group_1__2__Impl : ( ( rule__AndExpression__RightAssignment_1_2 ) ) ;
    public final void rule__AndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2393:1: ( ( ( rule__AndExpression__RightAssignment_1_2 ) ) )
            // InternalTempor.g:2394:1: ( ( rule__AndExpression__RightAssignment_1_2 ) )
            {
            // InternalTempor.g:2394:1: ( ( rule__AndExpression__RightAssignment_1_2 ) )
            // InternalTempor.g:2395:2: ( rule__AndExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndExpressionAccess().getRightAssignment_1_2()); 
            // InternalTempor.g:2396:2: ( rule__AndExpression__RightAssignment_1_2 )
            // InternalTempor.g:2396:3: rule__AndExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__2__Impl"


    // $ANTLR start "rule__CompExpression__Group__0"
    // InternalTempor.g:2405:1: rule__CompExpression__Group__0 : rule__CompExpression__Group__0__Impl rule__CompExpression__Group__1 ;
    public final void rule__CompExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2409:1: ( rule__CompExpression__Group__0__Impl rule__CompExpression__Group__1 )
            // InternalTempor.g:2410:2: rule__CompExpression__Group__0__Impl rule__CompExpression__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__CompExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompExpression__Group__1();

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
    // $ANTLR end "rule__CompExpression__Group__0"


    // $ANTLR start "rule__CompExpression__Group__0__Impl"
    // InternalTempor.g:2417:1: rule__CompExpression__Group__0__Impl : ( ruleEquExpression ) ;
    public final void rule__CompExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2421:1: ( ( ruleEquExpression ) )
            // InternalTempor.g:2422:1: ( ruleEquExpression )
            {
            // InternalTempor.g:2422:1: ( ruleEquExpression )
            // InternalTempor.g:2423:2: ruleEquExpression
            {
             before(grammarAccess.getCompExpressionAccess().getEquExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEquExpression();

            state._fsp--;

             after(grammarAccess.getCompExpressionAccess().getEquExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompExpression__Group__0__Impl"


    // $ANTLR start "rule__CompExpression__Group__1"
    // InternalTempor.g:2432:1: rule__CompExpression__Group__1 : rule__CompExpression__Group__1__Impl ;
    public final void rule__CompExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2436:1: ( rule__CompExpression__Group__1__Impl )
            // InternalTempor.g:2437:2: rule__CompExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompExpression__Group__1__Impl();

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
    // $ANTLR end "rule__CompExpression__Group__1"


    // $ANTLR start "rule__CompExpression__Group__1__Impl"
    // InternalTempor.g:2443:1: rule__CompExpression__Group__1__Impl : ( ( rule__CompExpression__Group_1__0 )* ) ;
    public final void rule__CompExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2447:1: ( ( ( rule__CompExpression__Group_1__0 )* ) )
            // InternalTempor.g:2448:1: ( ( rule__CompExpression__Group_1__0 )* )
            {
            // InternalTempor.g:2448:1: ( ( rule__CompExpression__Group_1__0 )* )
            // InternalTempor.g:2449:2: ( rule__CompExpression__Group_1__0 )*
            {
             before(grammarAccess.getCompExpressionAccess().getGroup_1()); 
            // InternalTempor.g:2450:2: ( rule__CompExpression__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                switch ( input.LA(1) ) {
                case 32:
                    {
                    alt24=1;
                    }
                    break;
                case 33:
                    {
                    alt24=1;
                    }
                    break;
                case 34:
                    {
                    alt24=1;
                    }
                    break;
                case 35:
                    {
                    alt24=1;
                    }
                    break;

                }

                switch (alt24) {
            	case 1 :
            	    // InternalTempor.g:2450:3: rule__CompExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__CompExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getCompExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompExpression__Group__1__Impl"


    // $ANTLR start "rule__CompExpression__Group_1__0"
    // InternalTempor.g:2459:1: rule__CompExpression__Group_1__0 : rule__CompExpression__Group_1__0__Impl rule__CompExpression__Group_1__1 ;
    public final void rule__CompExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2463:1: ( rule__CompExpression__Group_1__0__Impl rule__CompExpression__Group_1__1 )
            // InternalTempor.g:2464:2: rule__CompExpression__Group_1__0__Impl rule__CompExpression__Group_1__1
            {
            pushFollow(FOLLOW_23);
            rule__CompExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompExpression__Group_1__1();

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
    // $ANTLR end "rule__CompExpression__Group_1__0"


    // $ANTLR start "rule__CompExpression__Group_1__0__Impl"
    // InternalTempor.g:2471:1: rule__CompExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__CompExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2475:1: ( ( () ) )
            // InternalTempor.g:2476:1: ( () )
            {
            // InternalTempor.g:2476:1: ( () )
            // InternalTempor.g:2477:2: ()
            {
             before(grammarAccess.getCompExpressionAccess().getCompExpressionLeftAction_1_0()); 
            // InternalTempor.g:2478:2: ()
            // InternalTempor.g:2478:3: 
            {
            }

             after(grammarAccess.getCompExpressionAccess().getCompExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompExpression__Group_1__0__Impl"


    // $ANTLR start "rule__CompExpression__Group_1__1"
    // InternalTempor.g:2486:1: rule__CompExpression__Group_1__1 : rule__CompExpression__Group_1__1__Impl rule__CompExpression__Group_1__2 ;
    public final void rule__CompExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2490:1: ( rule__CompExpression__Group_1__1__Impl rule__CompExpression__Group_1__2 )
            // InternalTempor.g:2491:2: rule__CompExpression__Group_1__1__Impl rule__CompExpression__Group_1__2
            {
            pushFollow(FOLLOW_16);
            rule__CompExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompExpression__Group_1__2();

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
    // $ANTLR end "rule__CompExpression__Group_1__1"


    // $ANTLR start "rule__CompExpression__Group_1__1__Impl"
    // InternalTempor.g:2498:1: rule__CompExpression__Group_1__1__Impl : ( ( rule__CompExpression__CompOpAssignment_1_1 ) ) ;
    public final void rule__CompExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2502:1: ( ( ( rule__CompExpression__CompOpAssignment_1_1 ) ) )
            // InternalTempor.g:2503:1: ( ( rule__CompExpression__CompOpAssignment_1_1 ) )
            {
            // InternalTempor.g:2503:1: ( ( rule__CompExpression__CompOpAssignment_1_1 ) )
            // InternalTempor.g:2504:2: ( rule__CompExpression__CompOpAssignment_1_1 )
            {
             before(grammarAccess.getCompExpressionAccess().getCompOpAssignment_1_1()); 
            // InternalTempor.g:2505:2: ( rule__CompExpression__CompOpAssignment_1_1 )
            // InternalTempor.g:2505:3: rule__CompExpression__CompOpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CompExpression__CompOpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCompExpressionAccess().getCompOpAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompExpression__Group_1__1__Impl"


    // $ANTLR start "rule__CompExpression__Group_1__2"
    // InternalTempor.g:2513:1: rule__CompExpression__Group_1__2 : rule__CompExpression__Group_1__2__Impl ;
    public final void rule__CompExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2517:1: ( rule__CompExpression__Group_1__2__Impl )
            // InternalTempor.g:2518:2: rule__CompExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompExpression__Group_1__2__Impl();

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
    // $ANTLR end "rule__CompExpression__Group_1__2"


    // $ANTLR start "rule__CompExpression__Group_1__2__Impl"
    // InternalTempor.g:2524:1: rule__CompExpression__Group_1__2__Impl : ( ( rule__CompExpression__RightAssignment_1_2 ) ) ;
    public final void rule__CompExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2528:1: ( ( ( rule__CompExpression__RightAssignment_1_2 ) ) )
            // InternalTempor.g:2529:1: ( ( rule__CompExpression__RightAssignment_1_2 ) )
            {
            // InternalTempor.g:2529:1: ( ( rule__CompExpression__RightAssignment_1_2 ) )
            // InternalTempor.g:2530:2: ( rule__CompExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getCompExpressionAccess().getRightAssignment_1_2()); 
            // InternalTempor.g:2531:2: ( rule__CompExpression__RightAssignment_1_2 )
            // InternalTempor.g:2531:3: rule__CompExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__CompExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getCompExpressionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompExpression__Group_1__2__Impl"


    // $ANTLR start "rule__EquExpression__Group__0"
    // InternalTempor.g:2540:1: rule__EquExpression__Group__0 : rule__EquExpression__Group__0__Impl rule__EquExpression__Group__1 ;
    public final void rule__EquExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2544:1: ( rule__EquExpression__Group__0__Impl rule__EquExpression__Group__1 )
            // InternalTempor.g:2545:2: rule__EquExpression__Group__0__Impl rule__EquExpression__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__EquExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EquExpression__Group__1();

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
    // $ANTLR end "rule__EquExpression__Group__0"


    // $ANTLR start "rule__EquExpression__Group__0__Impl"
    // InternalTempor.g:2552:1: rule__EquExpression__Group__0__Impl : ( ruleUnExpression ) ;
    public final void rule__EquExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2556:1: ( ( ruleUnExpression ) )
            // InternalTempor.g:2557:1: ( ruleUnExpression )
            {
            // InternalTempor.g:2557:1: ( ruleUnExpression )
            // InternalTempor.g:2558:2: ruleUnExpression
            {
             before(grammarAccess.getEquExpressionAccess().getUnExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleUnExpression();

            state._fsp--;

             after(grammarAccess.getEquExpressionAccess().getUnExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EquExpression__Group__0__Impl"


    // $ANTLR start "rule__EquExpression__Group__1"
    // InternalTempor.g:2567:1: rule__EquExpression__Group__1 : rule__EquExpression__Group__1__Impl ;
    public final void rule__EquExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2571:1: ( rule__EquExpression__Group__1__Impl )
            // InternalTempor.g:2572:2: rule__EquExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EquExpression__Group__1__Impl();

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
    // $ANTLR end "rule__EquExpression__Group__1"


    // $ANTLR start "rule__EquExpression__Group__1__Impl"
    // InternalTempor.g:2578:1: rule__EquExpression__Group__1__Impl : ( ( rule__EquExpression__Group_1__0 )* ) ;
    public final void rule__EquExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2582:1: ( ( ( rule__EquExpression__Group_1__0 )* ) )
            // InternalTempor.g:2583:1: ( ( rule__EquExpression__Group_1__0 )* )
            {
            // InternalTempor.g:2583:1: ( ( rule__EquExpression__Group_1__0 )* )
            // InternalTempor.g:2584:2: ( rule__EquExpression__Group_1__0 )*
            {
             before(grammarAccess.getEquExpressionAccess().getGroup_1()); 
            // InternalTempor.g:2585:2: ( rule__EquExpression__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=30 && LA25_0<=31)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalTempor.g:2585:3: rule__EquExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__EquExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getEquExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EquExpression__Group__1__Impl"


    // $ANTLR start "rule__EquExpression__Group_1__0"
    // InternalTempor.g:2594:1: rule__EquExpression__Group_1__0 : rule__EquExpression__Group_1__0__Impl rule__EquExpression__Group_1__1 ;
    public final void rule__EquExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2598:1: ( rule__EquExpression__Group_1__0__Impl rule__EquExpression__Group_1__1 )
            // InternalTempor.g:2599:2: rule__EquExpression__Group_1__0__Impl rule__EquExpression__Group_1__1
            {
            pushFollow(FOLLOW_25);
            rule__EquExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EquExpression__Group_1__1();

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
    // $ANTLR end "rule__EquExpression__Group_1__0"


    // $ANTLR start "rule__EquExpression__Group_1__0__Impl"
    // InternalTempor.g:2606:1: rule__EquExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__EquExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2610:1: ( ( () ) )
            // InternalTempor.g:2611:1: ( () )
            {
            // InternalTempor.g:2611:1: ( () )
            // InternalTempor.g:2612:2: ()
            {
             before(grammarAccess.getEquExpressionAccess().getEquExpressionLeftAction_1_0()); 
            // InternalTempor.g:2613:2: ()
            // InternalTempor.g:2613:3: 
            {
            }

             after(grammarAccess.getEquExpressionAccess().getEquExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EquExpression__Group_1__0__Impl"


    // $ANTLR start "rule__EquExpression__Group_1__1"
    // InternalTempor.g:2621:1: rule__EquExpression__Group_1__1 : rule__EquExpression__Group_1__1__Impl rule__EquExpression__Group_1__2 ;
    public final void rule__EquExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2625:1: ( rule__EquExpression__Group_1__1__Impl rule__EquExpression__Group_1__2 )
            // InternalTempor.g:2626:2: rule__EquExpression__Group_1__1__Impl rule__EquExpression__Group_1__2
            {
            pushFollow(FOLLOW_16);
            rule__EquExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EquExpression__Group_1__2();

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
    // $ANTLR end "rule__EquExpression__Group_1__1"


    // $ANTLR start "rule__EquExpression__Group_1__1__Impl"
    // InternalTempor.g:2633:1: rule__EquExpression__Group_1__1__Impl : ( ( rule__EquExpression__EquOpAssignment_1_1 ) ) ;
    public final void rule__EquExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2637:1: ( ( ( rule__EquExpression__EquOpAssignment_1_1 ) ) )
            // InternalTempor.g:2638:1: ( ( rule__EquExpression__EquOpAssignment_1_1 ) )
            {
            // InternalTempor.g:2638:1: ( ( rule__EquExpression__EquOpAssignment_1_1 ) )
            // InternalTempor.g:2639:2: ( rule__EquExpression__EquOpAssignment_1_1 )
            {
             before(grammarAccess.getEquExpressionAccess().getEquOpAssignment_1_1()); 
            // InternalTempor.g:2640:2: ( rule__EquExpression__EquOpAssignment_1_1 )
            // InternalTempor.g:2640:3: rule__EquExpression__EquOpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__EquExpression__EquOpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEquExpressionAccess().getEquOpAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EquExpression__Group_1__1__Impl"


    // $ANTLR start "rule__EquExpression__Group_1__2"
    // InternalTempor.g:2648:1: rule__EquExpression__Group_1__2 : rule__EquExpression__Group_1__2__Impl ;
    public final void rule__EquExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2652:1: ( rule__EquExpression__Group_1__2__Impl )
            // InternalTempor.g:2653:2: rule__EquExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EquExpression__Group_1__2__Impl();

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
    // $ANTLR end "rule__EquExpression__Group_1__2"


    // $ANTLR start "rule__EquExpression__Group_1__2__Impl"
    // InternalTempor.g:2659:1: rule__EquExpression__Group_1__2__Impl : ( ( rule__EquExpression__RightAssignment_1_2 ) ) ;
    public final void rule__EquExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2663:1: ( ( ( rule__EquExpression__RightAssignment_1_2 ) ) )
            // InternalTempor.g:2664:1: ( ( rule__EquExpression__RightAssignment_1_2 ) )
            {
            // InternalTempor.g:2664:1: ( ( rule__EquExpression__RightAssignment_1_2 ) )
            // InternalTempor.g:2665:2: ( rule__EquExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getEquExpressionAccess().getRightAssignment_1_2()); 
            // InternalTempor.g:2666:2: ( rule__EquExpression__RightAssignment_1_2 )
            // InternalTempor.g:2666:3: rule__EquExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__EquExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEquExpressionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EquExpression__Group_1__2__Impl"


    // $ANTLR start "rule__UnExpression__Group_1__0"
    // InternalTempor.g:2675:1: rule__UnExpression__Group_1__0 : rule__UnExpression__Group_1__0__Impl rule__UnExpression__Group_1__1 ;
    public final void rule__UnExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2679:1: ( rule__UnExpression__Group_1__0__Impl rule__UnExpression__Group_1__1 )
            // InternalTempor.g:2680:2: rule__UnExpression__Group_1__0__Impl rule__UnExpression__Group_1__1
            {
            pushFollow(FOLLOW_27);
            rule__UnExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnExpression__Group_1__1();

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
    // $ANTLR end "rule__UnExpression__Group_1__0"


    // $ANTLR start "rule__UnExpression__Group_1__0__Impl"
    // InternalTempor.g:2687:1: rule__UnExpression__Group_1__0__Impl : ( ( rule__UnExpression__UnOpAssignment_1_0 ) ) ;
    public final void rule__UnExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2691:1: ( ( ( rule__UnExpression__UnOpAssignment_1_0 ) ) )
            // InternalTempor.g:2692:1: ( ( rule__UnExpression__UnOpAssignment_1_0 ) )
            {
            // InternalTempor.g:2692:1: ( ( rule__UnExpression__UnOpAssignment_1_0 ) )
            // InternalTempor.g:2693:2: ( rule__UnExpression__UnOpAssignment_1_0 )
            {
             before(grammarAccess.getUnExpressionAccess().getUnOpAssignment_1_0()); 
            // InternalTempor.g:2694:2: ( rule__UnExpression__UnOpAssignment_1_0 )
            // InternalTempor.g:2694:3: rule__UnExpression__UnOpAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__UnExpression__UnOpAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getUnExpressionAccess().getUnOpAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnExpression__Group_1__0__Impl"


    // $ANTLR start "rule__UnExpression__Group_1__1"
    // InternalTempor.g:2702:1: rule__UnExpression__Group_1__1 : rule__UnExpression__Group_1__1__Impl ;
    public final void rule__UnExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2706:1: ( rule__UnExpression__Group_1__1__Impl )
            // InternalTempor.g:2707:2: rule__UnExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnExpression__Group_1__1__Impl();

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
    // $ANTLR end "rule__UnExpression__Group_1__1"


    // $ANTLR start "rule__UnExpression__Group_1__1__Impl"
    // InternalTempor.g:2713:1: rule__UnExpression__Group_1__1__Impl : ( ( rule__UnExpression__RightAssignment_1_1 ) ) ;
    public final void rule__UnExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2717:1: ( ( ( rule__UnExpression__RightAssignment_1_1 ) ) )
            // InternalTempor.g:2718:1: ( ( rule__UnExpression__RightAssignment_1_1 ) )
            {
            // InternalTempor.g:2718:1: ( ( rule__UnExpression__RightAssignment_1_1 ) )
            // InternalTempor.g:2719:2: ( rule__UnExpression__RightAssignment_1_1 )
            {
             before(grammarAccess.getUnExpressionAccess().getRightAssignment_1_1()); 
            // InternalTempor.g:2720:2: ( rule__UnExpression__RightAssignment_1_1 )
            // InternalTempor.g:2720:3: rule__UnExpression__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__UnExpression__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getUnExpressionAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnExpression__Group_1__1__Impl"


    // $ANTLR start "rule__TauExpression__Group__0"
    // InternalTempor.g:2729:1: rule__TauExpression__Group__0 : rule__TauExpression__Group__0__Impl rule__TauExpression__Group__1 ;
    public final void rule__TauExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2733:1: ( rule__TauExpression__Group__0__Impl rule__TauExpression__Group__1 )
            // InternalTempor.g:2734:2: rule__TauExpression__Group__0__Impl rule__TauExpression__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__TauExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TauExpression__Group__1();

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
    // $ANTLR end "rule__TauExpression__Group__0"


    // $ANTLR start "rule__TauExpression__Group__0__Impl"
    // InternalTempor.g:2741:1: rule__TauExpression__Group__0__Impl : ( 'TAU' ) ;
    public final void rule__TauExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2745:1: ( ( 'TAU' ) )
            // InternalTempor.g:2746:1: ( 'TAU' )
            {
            // InternalTempor.g:2746:1: ( 'TAU' )
            // InternalTempor.g:2747:2: 'TAU'
            {
             before(grammarAccess.getTauExpressionAccess().getTAUKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getTauExpressionAccess().getTAUKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TauExpression__Group__0__Impl"


    // $ANTLR start "rule__TauExpression__Group__1"
    // InternalTempor.g:2756:1: rule__TauExpression__Group__1 : rule__TauExpression__Group__1__Impl rule__TauExpression__Group__2 ;
    public final void rule__TauExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2760:1: ( rule__TauExpression__Group__1__Impl rule__TauExpression__Group__2 )
            // InternalTempor.g:2761:2: rule__TauExpression__Group__1__Impl rule__TauExpression__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__TauExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TauExpression__Group__2();

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
    // $ANTLR end "rule__TauExpression__Group__1"


    // $ANTLR start "rule__TauExpression__Group__1__Impl"
    // InternalTempor.g:2768:1: rule__TauExpression__Group__1__Impl : ( '(' ) ;
    public final void rule__TauExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2772:1: ( ( '(' ) )
            // InternalTempor.g:2773:1: ( '(' )
            {
            // InternalTempor.g:2773:1: ( '(' )
            // InternalTempor.g:2774:2: '('
            {
             before(grammarAccess.getTauExpressionAccess().getLeftParenthesisKeyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getTauExpressionAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TauExpression__Group__1__Impl"


    // $ANTLR start "rule__TauExpression__Group__2"
    // InternalTempor.g:2783:1: rule__TauExpression__Group__2 : rule__TauExpression__Group__2__Impl rule__TauExpression__Group__3 ;
    public final void rule__TauExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2787:1: ( rule__TauExpression__Group__2__Impl rule__TauExpression__Group__3 )
            // InternalTempor.g:2788:2: rule__TauExpression__Group__2__Impl rule__TauExpression__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__TauExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TauExpression__Group__3();

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
    // $ANTLR end "rule__TauExpression__Group__2"


    // $ANTLR start "rule__TauExpression__Group__2__Impl"
    // InternalTempor.g:2795:1: rule__TauExpression__Group__2__Impl : ( ( rule__TauExpression__TimeAssignment_2 ) ) ;
    public final void rule__TauExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2799:1: ( ( ( rule__TauExpression__TimeAssignment_2 ) ) )
            // InternalTempor.g:2800:1: ( ( rule__TauExpression__TimeAssignment_2 ) )
            {
            // InternalTempor.g:2800:1: ( ( rule__TauExpression__TimeAssignment_2 ) )
            // InternalTempor.g:2801:2: ( rule__TauExpression__TimeAssignment_2 )
            {
             before(grammarAccess.getTauExpressionAccess().getTimeAssignment_2()); 
            // InternalTempor.g:2802:2: ( rule__TauExpression__TimeAssignment_2 )
            // InternalTempor.g:2802:3: rule__TauExpression__TimeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TauExpression__TimeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTauExpressionAccess().getTimeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TauExpression__Group__2__Impl"


    // $ANTLR start "rule__TauExpression__Group__3"
    // InternalTempor.g:2810:1: rule__TauExpression__Group__3 : rule__TauExpression__Group__3__Impl ;
    public final void rule__TauExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2814:1: ( rule__TauExpression__Group__3__Impl )
            // InternalTempor.g:2815:2: rule__TauExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TauExpression__Group__3__Impl();

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
    // $ANTLR end "rule__TauExpression__Group__3"


    // $ANTLR start "rule__TauExpression__Group__3__Impl"
    // InternalTempor.g:2821:1: rule__TauExpression__Group__3__Impl : ( ')' ) ;
    public final void rule__TauExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2825:1: ( ( ')' ) )
            // InternalTempor.g:2826:1: ( ')' )
            {
            // InternalTempor.g:2826:1: ( ')' )
            // InternalTempor.g:2827:2: ')'
            {
             before(grammarAccess.getTauExpressionAccess().getRightParenthesisKeyword_3()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getTauExpressionAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TauExpression__Group__3__Impl"


    // $ANTLR start "rule__TimeLiteral__Group__0"
    // InternalTempor.g:2837:1: rule__TimeLiteral__Group__0 : rule__TimeLiteral__Group__0__Impl rule__TimeLiteral__Group__1 ;
    public final void rule__TimeLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2841:1: ( rule__TimeLiteral__Group__0__Impl rule__TimeLiteral__Group__1 )
            // InternalTempor.g:2842:2: rule__TimeLiteral__Group__0__Impl rule__TimeLiteral__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__TimeLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeLiteral__Group__1();

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
    // $ANTLR end "rule__TimeLiteral__Group__0"


    // $ANTLR start "rule__TimeLiteral__Group__0__Impl"
    // InternalTempor.g:2849:1: rule__TimeLiteral__Group__0__Impl : ( ruleTIME_PREF_LITERAL ) ;
    public final void rule__TimeLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2853:1: ( ( ruleTIME_PREF_LITERAL ) )
            // InternalTempor.g:2854:1: ( ruleTIME_PREF_LITERAL )
            {
            // InternalTempor.g:2854:1: ( ruleTIME_PREF_LITERAL )
            // InternalTempor.g:2855:2: ruleTIME_PREF_LITERAL
            {
             before(grammarAccess.getTimeLiteralAccess().getTIME_PREF_LITERALParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleTIME_PREF_LITERAL();

            state._fsp--;

             after(grammarAccess.getTimeLiteralAccess().getTIME_PREF_LITERALParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeLiteral__Group__0__Impl"


    // $ANTLR start "rule__TimeLiteral__Group__1"
    // InternalTempor.g:2864:1: rule__TimeLiteral__Group__1 : rule__TimeLiteral__Group__1__Impl ;
    public final void rule__TimeLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2868:1: ( rule__TimeLiteral__Group__1__Impl )
            // InternalTempor.g:2869:2: rule__TimeLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TimeLiteral__Group__1__Impl();

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
    // $ANTLR end "rule__TimeLiteral__Group__1"


    // $ANTLR start "rule__TimeLiteral__Group__1__Impl"
    // InternalTempor.g:2875:1: rule__TimeLiteral__Group__1__Impl : ( ( rule__TimeLiteral__IntervalAssignment_1 ) ) ;
    public final void rule__TimeLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2879:1: ( ( ( rule__TimeLiteral__IntervalAssignment_1 ) ) )
            // InternalTempor.g:2880:1: ( ( rule__TimeLiteral__IntervalAssignment_1 ) )
            {
            // InternalTempor.g:2880:1: ( ( rule__TimeLiteral__IntervalAssignment_1 ) )
            // InternalTempor.g:2881:2: ( rule__TimeLiteral__IntervalAssignment_1 )
            {
             before(grammarAccess.getTimeLiteralAccess().getIntervalAssignment_1()); 
            // InternalTempor.g:2882:2: ( rule__TimeLiteral__IntervalAssignment_1 )
            // InternalTempor.g:2882:3: rule__TimeLiteral__IntervalAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TimeLiteral__IntervalAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTimeLiteralAccess().getIntervalAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeLiteral__Group__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_3__0"
    // InternalTempor.g:2891:1: rule__PrimaryExpression__Group_3__0 : rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1 ;
    public final void rule__PrimaryExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2895:1: ( rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1 )
            // InternalTempor.g:2896:2: rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1
            {
            pushFollow(FOLLOW_16);
            rule__PrimaryExpression__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_3__1();

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
    // $ANTLR end "rule__PrimaryExpression__Group_3__0"


    // $ANTLR start "rule__PrimaryExpression__Group_3__0__Impl"
    // InternalTempor.g:2903:1: rule__PrimaryExpression__Group_3__0__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2907:1: ( ( '(' ) )
            // InternalTempor.g:2908:1: ( '(' )
            {
            // InternalTempor.g:2908:1: ( '(' )
            // InternalTempor.g:2909:2: '('
            {
             before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_3__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_3__1"
    // InternalTempor.g:2918:1: rule__PrimaryExpression__Group_3__1 : rule__PrimaryExpression__Group_3__1__Impl rule__PrimaryExpression__Group_3__2 ;
    public final void rule__PrimaryExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2922:1: ( rule__PrimaryExpression__Group_3__1__Impl rule__PrimaryExpression__Group_3__2 )
            // InternalTempor.g:2923:2: rule__PrimaryExpression__Group_3__1__Impl rule__PrimaryExpression__Group_3__2
            {
            pushFollow(FOLLOW_30);
            rule__PrimaryExpression__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_3__2();

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
    // $ANTLR end "rule__PrimaryExpression__Group_3__1"


    // $ANTLR start "rule__PrimaryExpression__Group_3__1__Impl"
    // InternalTempor.g:2930:1: rule__PrimaryExpression__Group_3__1__Impl : ( ( rule__PrimaryExpression__NestExprAssignment_3_1 ) ) ;
    public final void rule__PrimaryExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2934:1: ( ( ( rule__PrimaryExpression__NestExprAssignment_3_1 ) ) )
            // InternalTempor.g:2935:1: ( ( rule__PrimaryExpression__NestExprAssignment_3_1 ) )
            {
            // InternalTempor.g:2935:1: ( ( rule__PrimaryExpression__NestExprAssignment_3_1 ) )
            // InternalTempor.g:2936:2: ( rule__PrimaryExpression__NestExprAssignment_3_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getNestExprAssignment_3_1()); 
            // InternalTempor.g:2937:2: ( rule__PrimaryExpression__NestExprAssignment_3_1 )
            // InternalTempor.g:2937:3: rule__PrimaryExpression__NestExprAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__NestExprAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getNestExprAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_3__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_3__2"
    // InternalTempor.g:2945:1: rule__PrimaryExpression__Group_3__2 : rule__PrimaryExpression__Group_3__2__Impl ;
    public final void rule__PrimaryExpression__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2949:1: ( rule__PrimaryExpression__Group_3__2__Impl )
            // InternalTempor.g:2950:2: rule__PrimaryExpression__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_3__2__Impl();

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
    // $ANTLR end "rule__PrimaryExpression__Group_3__2"


    // $ANTLR start "rule__PrimaryExpression__Group_3__2__Impl"
    // InternalTempor.g:2956:1: rule__PrimaryExpression__Group_3__2__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2960:1: ( ( ')' ) )
            // InternalTempor.g:2961:1: ( ')' )
            {
            // InternalTempor.g:2961:1: ( ')' )
            // InternalTempor.g:2962:2: ')'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_3_2()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_3__2__Impl"


    // $ANTLR start "rule__ReqDeclaration__Group__0"
    // InternalTempor.g:2972:1: rule__ReqDeclaration__Group__0 : rule__ReqDeclaration__Group__0__Impl rule__ReqDeclaration__Group__1 ;
    public final void rule__ReqDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2976:1: ( rule__ReqDeclaration__Group__0__Impl rule__ReqDeclaration__Group__1 )
            // InternalTempor.g:2977:2: rule__ReqDeclaration__Group__0__Impl rule__ReqDeclaration__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ReqDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReqDeclaration__Group__1();

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
    // $ANTLR end "rule__ReqDeclaration__Group__0"


    // $ANTLR start "rule__ReqDeclaration__Group__0__Impl"
    // InternalTempor.g:2984:1: rule__ReqDeclaration__Group__0__Impl : ( 'REQUIREMENT' ) ;
    public final void rule__ReqDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:2988:1: ( ( 'REQUIREMENT' ) )
            // InternalTempor.g:2989:1: ( 'REQUIREMENT' )
            {
            // InternalTempor.g:2989:1: ( 'REQUIREMENT' )
            // InternalTempor.g:2990:2: 'REQUIREMENT'
            {
             before(grammarAccess.getReqDeclarationAccess().getREQUIREMENTKeyword_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getReqDeclarationAccess().getREQUIREMENTKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReqDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ReqDeclaration__Group__1"
    // InternalTempor.g:2999:1: rule__ReqDeclaration__Group__1 : rule__ReqDeclaration__Group__1__Impl rule__ReqDeclaration__Group__2 ;
    public final void rule__ReqDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3003:1: ( rule__ReqDeclaration__Group__1__Impl rule__ReqDeclaration__Group__2 )
            // InternalTempor.g:3004:2: rule__ReqDeclaration__Group__1__Impl rule__ReqDeclaration__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__ReqDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReqDeclaration__Group__2();

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
    // $ANTLR end "rule__ReqDeclaration__Group__1"


    // $ANTLR start "rule__ReqDeclaration__Group__1__Impl"
    // InternalTempor.g:3011:1: rule__ReqDeclaration__Group__1__Impl : ( ( rule__ReqDeclaration__NameAssignment_1 ) ) ;
    public final void rule__ReqDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3015:1: ( ( ( rule__ReqDeclaration__NameAssignment_1 ) ) )
            // InternalTempor.g:3016:1: ( ( rule__ReqDeclaration__NameAssignment_1 ) )
            {
            // InternalTempor.g:3016:1: ( ( rule__ReqDeclaration__NameAssignment_1 ) )
            // InternalTempor.g:3017:2: ( rule__ReqDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getReqDeclarationAccess().getNameAssignment_1()); 
            // InternalTempor.g:3018:2: ( rule__ReqDeclaration__NameAssignment_1 )
            // InternalTempor.g:3018:3: rule__ReqDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ReqDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReqDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReqDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ReqDeclaration__Group__2"
    // InternalTempor.g:3026:1: rule__ReqDeclaration__Group__2 : rule__ReqDeclaration__Group__2__Impl rule__ReqDeclaration__Group__3 ;
    public final void rule__ReqDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3030:1: ( rule__ReqDeclaration__Group__2__Impl rule__ReqDeclaration__Group__3 )
            // InternalTempor.g:3031:2: rule__ReqDeclaration__Group__2__Impl rule__ReqDeclaration__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__ReqDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReqDeclaration__Group__3();

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
    // $ANTLR end "rule__ReqDeclaration__Group__2"


    // $ANTLR start "rule__ReqDeclaration__Group__2__Impl"
    // InternalTempor.g:3038:1: rule__ReqDeclaration__Group__2__Impl : ( ( rule__ReqDeclaration__RequirementAssignment_2 ) ) ;
    public final void rule__ReqDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3042:1: ( ( ( rule__ReqDeclaration__RequirementAssignment_2 ) ) )
            // InternalTempor.g:3043:1: ( ( rule__ReqDeclaration__RequirementAssignment_2 ) )
            {
            // InternalTempor.g:3043:1: ( ( rule__ReqDeclaration__RequirementAssignment_2 ) )
            // InternalTempor.g:3044:2: ( rule__ReqDeclaration__RequirementAssignment_2 )
            {
             before(grammarAccess.getReqDeclarationAccess().getRequirementAssignment_2()); 
            // InternalTempor.g:3045:2: ( rule__ReqDeclaration__RequirementAssignment_2 )
            // InternalTempor.g:3045:3: rule__ReqDeclaration__RequirementAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ReqDeclaration__RequirementAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getReqDeclarationAccess().getRequirementAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReqDeclaration__Group__2__Impl"


    // $ANTLR start "rule__ReqDeclaration__Group__3"
    // InternalTempor.g:3053:1: rule__ReqDeclaration__Group__3 : rule__ReqDeclaration__Group__3__Impl ;
    public final void rule__ReqDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3057:1: ( rule__ReqDeclaration__Group__3__Impl )
            // InternalTempor.g:3058:2: rule__ReqDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReqDeclaration__Group__3__Impl();

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
    // $ANTLR end "rule__ReqDeclaration__Group__3"


    // $ANTLR start "rule__ReqDeclaration__Group__3__Impl"
    // InternalTempor.g:3064:1: rule__ReqDeclaration__Group__3__Impl : ( 'END_REQUIREMENT' ) ;
    public final void rule__ReqDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3068:1: ( ( 'END_REQUIREMENT' ) )
            // InternalTempor.g:3069:1: ( 'END_REQUIREMENT' )
            {
            // InternalTempor.g:3069:1: ( 'END_REQUIREMENT' )
            // InternalTempor.g:3070:2: 'END_REQUIREMENT'
            {
             before(grammarAccess.getReqDeclarationAccess().getEND_REQUIREMENTKeyword_3()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getReqDeclarationAccess().getEND_REQUIREMENTKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReqDeclaration__Group__3__Impl"


    // $ANTLR start "rule__Requirement__Group__0"
    // InternalTempor.g:3080:1: rule__Requirement__Group__0 : rule__Requirement__Group__0__Impl rule__Requirement__Group__1 ;
    public final void rule__Requirement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3084:1: ( rule__Requirement__Group__0__Impl rule__Requirement__Group__1 )
            // InternalTempor.g:3085:2: rule__Requirement__Group__0__Impl rule__Requirement__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__Requirement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Requirement__Group__1();

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
    // $ANTLR end "rule__Requirement__Group__0"


    // $ANTLR start "rule__Requirement__Group__0__Impl"
    // InternalTempor.g:3092:1: rule__Requirement__Group__0__Impl : ( ( rule__Requirement__Alternatives_0 ) ) ;
    public final void rule__Requirement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3096:1: ( ( ( rule__Requirement__Alternatives_0 ) ) )
            // InternalTempor.g:3097:1: ( ( rule__Requirement__Alternatives_0 ) )
            {
            // InternalTempor.g:3097:1: ( ( rule__Requirement__Alternatives_0 ) )
            // InternalTempor.g:3098:2: ( rule__Requirement__Alternatives_0 )
            {
             before(grammarAccess.getRequirementAccess().getAlternatives_0()); 
            // InternalTempor.g:3099:2: ( rule__Requirement__Alternatives_0 )
            // InternalTempor.g:3099:3: rule__Requirement__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Requirement__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getRequirementAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group__0__Impl"


    // $ANTLR start "rule__Requirement__Group__1"
    // InternalTempor.g:3107:1: rule__Requirement__Group__1 : rule__Requirement__Group__1__Impl ;
    public final void rule__Requirement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3111:1: ( rule__Requirement__Group__1__Impl )
            // InternalTempor.g:3112:2: rule__Requirement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Requirement__Group__1__Impl();

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
    // $ANTLR end "rule__Requirement__Group__1"


    // $ANTLR start "rule__Requirement__Group__1__Impl"
    // InternalTempor.g:3118:1: rule__Requirement__Group__1__Impl : ( '.' ) ;
    public final void rule__Requirement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3122:1: ( ( '.' ) )
            // InternalTempor.g:3123:1: ( '.' )
            {
            // InternalTempor.g:3123:1: ( '.' )
            // InternalTempor.g:3124:2: '.'
            {
             before(grammarAccess.getRequirementAccess().getFullStopKeyword_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getRequirementAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group__1__Impl"


    // $ANTLR start "rule__Trig__Group__0"
    // InternalTempor.g:3134:1: rule__Trig__Group__0 : rule__Trig__Group__0__Impl rule__Trig__Group__1 ;
    public final void rule__Trig__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3138:1: ( rule__Trig__Group__0__Impl rule__Trig__Group__1 )
            // InternalTempor.g:3139:2: rule__Trig__Group__0__Impl rule__Trig__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__Trig__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Trig__Group__1();

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
    // $ANTLR end "rule__Trig__Group__0"


    // $ANTLR start "rule__Trig__Group__0__Impl"
    // InternalTempor.g:3146:1: rule__Trig__Group__0__Impl : ( ( rule__Trig__Alternatives_0 ) ) ;
    public final void rule__Trig__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3150:1: ( ( ( rule__Trig__Alternatives_0 ) ) )
            // InternalTempor.g:3151:1: ( ( rule__Trig__Alternatives_0 ) )
            {
            // InternalTempor.g:3151:1: ( ( rule__Trig__Alternatives_0 ) )
            // InternalTempor.g:3152:2: ( rule__Trig__Alternatives_0 )
            {
             before(grammarAccess.getTrigAccess().getAlternatives_0()); 
            // InternalTempor.g:3153:2: ( rule__Trig__Alternatives_0 )
            // InternalTempor.g:3153:3: rule__Trig__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Trig__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getTrigAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trig__Group__0__Impl"


    // $ANTLR start "rule__Trig__Group__1"
    // InternalTempor.g:3161:1: rule__Trig__Group__1 : rule__Trig__Group__1__Impl ;
    public final void rule__Trig__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3165:1: ( rule__Trig__Group__1__Impl )
            // InternalTempor.g:3166:2: rule__Trig__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Trig__Group__1__Impl();

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
    // $ANTLR end "rule__Trig__Group__1"


    // $ANTLR start "rule__Trig__Group__1__Impl"
    // InternalTempor.g:3172:1: rule__Trig__Group__1__Impl : ( ( rule__Trig__Alternatives_1 ) ) ;
    public final void rule__Trig__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3176:1: ( ( ( rule__Trig__Alternatives_1 ) ) )
            // InternalTempor.g:3177:1: ( ( rule__Trig__Alternatives_1 ) )
            {
            // InternalTempor.g:3177:1: ( ( rule__Trig__Alternatives_1 ) )
            // InternalTempor.g:3178:2: ( rule__Trig__Alternatives_1 )
            {
             before(grammarAccess.getTrigAccess().getAlternatives_1()); 
            // InternalTempor.g:3179:2: ( rule__Trig__Alternatives_1 )
            // InternalTempor.g:3179:3: rule__Trig__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Trig__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getTrigAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trig__Group__1__Impl"


    // $ANTLR start "rule__Trig__Group_0_0__0"
    // InternalTempor.g:3188:1: rule__Trig__Group_0_0__0 : rule__Trig__Group_0_0__0__Impl rule__Trig__Group_0_0__1 ;
    public final void rule__Trig__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3192:1: ( rule__Trig__Group_0_0__0__Impl rule__Trig__Group_0_0__1 )
            // InternalTempor.g:3193:2: rule__Trig__Group_0_0__0__Impl rule__Trig__Group_0_0__1
            {
            pushFollow(FOLLOW_13);
            rule__Trig__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Trig__Group_0_0__1();

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
    // $ANTLR end "rule__Trig__Group_0_0__0"


    // $ANTLR start "rule__Trig__Group_0_0__0__Impl"
    // InternalTempor.g:3200:1: rule__Trig__Group_0_0__0__Impl : ( 'After' ) ;
    public final void rule__Trig__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3204:1: ( ( 'After' ) )
            // InternalTempor.g:3205:1: ( 'After' )
            {
            // InternalTempor.g:3205:1: ( 'After' )
            // InternalTempor.g:3206:2: 'After'
            {
             before(grammarAccess.getTrigAccess().getAfterKeyword_0_0_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getTrigAccess().getAfterKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trig__Group_0_0__0__Impl"


    // $ANTLR start "rule__Trig__Group_0_0__1"
    // InternalTempor.g:3215:1: rule__Trig__Group_0_0__1 : rule__Trig__Group_0_0__1__Impl rule__Trig__Group_0_0__2 ;
    public final void rule__Trig__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3219:1: ( rule__Trig__Group_0_0__1__Impl rule__Trig__Group_0_0__2 )
            // InternalTempor.g:3220:2: rule__Trig__Group_0_0__1__Impl rule__Trig__Group_0_0__2
            {
            pushFollow(FOLLOW_36);
            rule__Trig__Group_0_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Trig__Group_0_0__2();

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
    // $ANTLR end "rule__Trig__Group_0_0__1"


    // $ANTLR start "rule__Trig__Group_0_0__1__Impl"
    // InternalTempor.g:3227:1: rule__Trig__Group_0_0__1__Impl : ( ( rule__Trig__NameAssignment_0_0_1 ) ) ;
    public final void rule__Trig__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3231:1: ( ( ( rule__Trig__NameAssignment_0_0_1 ) ) )
            // InternalTempor.g:3232:1: ( ( rule__Trig__NameAssignment_0_0_1 ) )
            {
            // InternalTempor.g:3232:1: ( ( rule__Trig__NameAssignment_0_0_1 ) )
            // InternalTempor.g:3233:2: ( rule__Trig__NameAssignment_0_0_1 )
            {
             before(grammarAccess.getTrigAccess().getNameAssignment_0_0_1()); 
            // InternalTempor.g:3234:2: ( rule__Trig__NameAssignment_0_0_1 )
            // InternalTempor.g:3234:3: rule__Trig__NameAssignment_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Trig__NameAssignment_0_0_1();

            state._fsp--;


            }

             after(grammarAccess.getTrigAccess().getNameAssignment_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trig__Group_0_0__1__Impl"


    // $ANTLR start "rule__Trig__Group_0_0__2"
    // InternalTempor.g:3242:1: rule__Trig__Group_0_0__2 : rule__Trig__Group_0_0__2__Impl ;
    public final void rule__Trig__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3246:1: ( rule__Trig__Group_0_0__2__Impl )
            // InternalTempor.g:3247:2: rule__Trig__Group_0_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Trig__Group_0_0__2__Impl();

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
    // $ANTLR end "rule__Trig__Group_0_0__2"


    // $ANTLR start "rule__Trig__Group_0_0__2__Impl"
    // InternalTempor.g:3253:1: rule__Trig__Group_0_0__2__Impl : ( ruleCOMMA ) ;
    public final void rule__Trig__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3257:1: ( ( ruleCOMMA ) )
            // InternalTempor.g:3258:1: ( ruleCOMMA )
            {
            // InternalTempor.g:3258:1: ( ruleCOMMA )
            // InternalTempor.g:3259:2: ruleCOMMA
            {
             before(grammarAccess.getTrigAccess().getCOMMAParserRuleCall_0_0_2()); 
            pushFollow(FOLLOW_2);
            ruleCOMMA();

            state._fsp--;

             after(grammarAccess.getTrigAccess().getCOMMAParserRuleCall_0_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trig__Group_0_0__2__Impl"


    // $ANTLR start "rule__Inv__Group__0"
    // InternalTempor.g:3269:1: rule__Inv__Group__0 : rule__Inv__Group__0__Impl rule__Inv__Group__1 ;
    public final void rule__Inv__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3273:1: ( rule__Inv__Group__0__Impl rule__Inv__Group__1 )
            // InternalTempor.g:3274:2: rule__Inv__Group__0__Impl rule__Inv__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Inv__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inv__Group__1();

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
    // $ANTLR end "rule__Inv__Group__0"


    // $ANTLR start "rule__Inv__Group__0__Impl"
    // InternalTempor.g:3281:1: rule__Inv__Group__0__Impl : ( () ) ;
    public final void rule__Inv__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3285:1: ( ( () ) )
            // InternalTempor.g:3286:1: ( () )
            {
            // InternalTempor.g:3286:1: ( () )
            // InternalTempor.g:3287:2: ()
            {
             before(grammarAccess.getInvAccess().getInvAction_0()); 
            // InternalTempor.g:3288:2: ()
            // InternalTempor.g:3288:3: 
            {
            }

             after(grammarAccess.getInvAccess().getInvAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inv__Group__0__Impl"


    // $ANTLR start "rule__Inv__Group__1"
    // InternalTempor.g:3296:1: rule__Inv__Group__1 : rule__Inv__Group__1__Impl rule__Inv__Group__2 ;
    public final void rule__Inv__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3300:1: ( rule__Inv__Group__1__Impl rule__Inv__Group__2 )
            // InternalTempor.g:3301:2: rule__Inv__Group__1__Impl rule__Inv__Group__2
            {
            pushFollow(FOLLOW_37);
            rule__Inv__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inv__Group__2();

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
    // $ANTLR end "rule__Inv__Group__1"


    // $ANTLR start "rule__Inv__Group__1__Impl"
    // InternalTempor.g:3308:1: rule__Inv__Group__1__Impl : ( ( rule__Inv__InvAssignment_1 ) ) ;
    public final void rule__Inv__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3312:1: ( ( ( rule__Inv__InvAssignment_1 ) ) )
            // InternalTempor.g:3313:1: ( ( rule__Inv__InvAssignment_1 ) )
            {
            // InternalTempor.g:3313:1: ( ( rule__Inv__InvAssignment_1 ) )
            // InternalTempor.g:3314:2: ( rule__Inv__InvAssignment_1 )
            {
             before(grammarAccess.getInvAccess().getInvAssignment_1()); 
            // InternalTempor.g:3315:2: ( rule__Inv__InvAssignment_1 )
            // InternalTempor.g:3315:3: rule__Inv__InvAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Inv__InvAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInvAccess().getInvAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inv__Group__1__Impl"


    // $ANTLR start "rule__Inv__Group__2"
    // InternalTempor.g:3323:1: rule__Inv__Group__2 : rule__Inv__Group__2__Impl ;
    public final void rule__Inv__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3327:1: ( rule__Inv__Group__2__Impl )
            // InternalTempor.g:3328:2: rule__Inv__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Inv__Group__2__Impl();

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
    // $ANTLR end "rule__Inv__Group__2"


    // $ANTLR start "rule__Inv__Group__2__Impl"
    // InternalTempor.g:3334:1: rule__Inv__Group__2__Impl : ( ( rule__Inv__Alternatives_2 )? ) ;
    public final void rule__Inv__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3338:1: ( ( ( rule__Inv__Alternatives_2 )? ) )
            // InternalTempor.g:3339:1: ( ( rule__Inv__Alternatives_2 )? )
            {
            // InternalTempor.g:3339:1: ( ( rule__Inv__Alternatives_2 )? )
            // InternalTempor.g:3340:2: ( rule__Inv__Alternatives_2 )?
            {
             before(grammarAccess.getInvAccess().getAlternatives_2()); 
            // InternalTempor.g:3341:2: ( rule__Inv__Alternatives_2 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==18||LA26_0==51) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalTempor.g:3341:3: rule__Inv__Alternatives_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Inv__Alternatives_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInvAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inv__Group__2__Impl"


    // $ANTLR start "rule__Inv__Group_2_0__0"
    // InternalTempor.g:3350:1: rule__Inv__Group_2_0__0 : rule__Inv__Group_2_0__0__Impl rule__Inv__Group_2_0__1 ;
    public final void rule__Inv__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3354:1: ( rule__Inv__Group_2_0__0__Impl rule__Inv__Group_2_0__1 )
            // InternalTempor.g:3355:2: rule__Inv__Group_2_0__0__Impl rule__Inv__Group_2_0__1
            {
            pushFollow(FOLLOW_35);
            rule__Inv__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inv__Group_2_0__1();

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
    // $ANTLR end "rule__Inv__Group_2_0__0"


    // $ANTLR start "rule__Inv__Group_2_0__0__Impl"
    // InternalTempor.g:3362:1: rule__Inv__Group_2_0__0__Impl : ( ruleCOMMA ) ;
    public final void rule__Inv__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3366:1: ( ( ruleCOMMA ) )
            // InternalTempor.g:3367:1: ( ruleCOMMA )
            {
            // InternalTempor.g:3367:1: ( ruleCOMMA )
            // InternalTempor.g:3368:2: ruleCOMMA
            {
             before(grammarAccess.getInvAccess().getCOMMAParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCOMMA();

            state._fsp--;

             after(grammarAccess.getInvAccess().getCOMMAParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inv__Group_2_0__0__Impl"


    // $ANTLR start "rule__Inv__Group_2_0__1"
    // InternalTempor.g:3377:1: rule__Inv__Group_2_0__1 : rule__Inv__Group_2_0__1__Impl ;
    public final void rule__Inv__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3381:1: ( rule__Inv__Group_2_0__1__Impl )
            // InternalTempor.g:3382:2: rule__Inv__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Inv__Group_2_0__1__Impl();

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
    // $ANTLR end "rule__Inv__Group_2_0__1"


    // $ANTLR start "rule__Inv__Group_2_0__1__Impl"
    // InternalTempor.g:3388:1: rule__Inv__Group_2_0__1__Impl : ( ( rule__Inv__Delay_finalAssignment_2_0_1 ) ) ;
    public final void rule__Inv__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3392:1: ( ( ( rule__Inv__Delay_finalAssignment_2_0_1 ) ) )
            // InternalTempor.g:3393:1: ( ( rule__Inv__Delay_finalAssignment_2_0_1 ) )
            {
            // InternalTempor.g:3393:1: ( ( rule__Inv__Delay_finalAssignment_2_0_1 ) )
            // InternalTempor.g:3394:2: ( rule__Inv__Delay_finalAssignment_2_0_1 )
            {
             before(grammarAccess.getInvAccess().getDelay_finalAssignment_2_0_1()); 
            // InternalTempor.g:3395:2: ( rule__Inv__Delay_finalAssignment_2_0_1 )
            // InternalTempor.g:3395:3: rule__Inv__Delay_finalAssignment_2_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Inv__Delay_finalAssignment_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getInvAccess().getDelay_finalAssignment_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inv__Group_2_0__1__Impl"


    // $ANTLR start "rule__Inv__Group_2_1__0"
    // InternalTempor.g:3404:1: rule__Inv__Group_2_1__0 : rule__Inv__Group_2_1__0__Impl rule__Inv__Group_2_1__1 ;
    public final void rule__Inv__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3408:1: ( rule__Inv__Group_2_1__0__Impl rule__Inv__Group_2_1__1 )
            // InternalTempor.g:3409:2: rule__Inv__Group_2_1__0__Impl rule__Inv__Group_2_1__1
            {
            pushFollow(FOLLOW_38);
            rule__Inv__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inv__Group_2_1__1();

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
    // $ANTLR end "rule__Inv__Group_2_1__0"


    // $ANTLR start "rule__Inv__Group_2_1__0__Impl"
    // InternalTempor.g:3416:1: rule__Inv__Group_2_1__0__Impl : ( 'should' ) ;
    public final void rule__Inv__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3420:1: ( ( 'should' ) )
            // InternalTempor.g:3421:1: ( 'should' )
            {
            // InternalTempor.g:3421:1: ( 'should' )
            // InternalTempor.g:3422:2: 'should'
            {
             before(grammarAccess.getInvAccess().getShouldKeyword_2_1_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getInvAccess().getShouldKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inv__Group_2_1__0__Impl"


    // $ANTLR start "rule__Inv__Group_2_1__1"
    // InternalTempor.g:3431:1: rule__Inv__Group_2_1__1 : rule__Inv__Group_2_1__1__Impl rule__Inv__Group_2_1__2 ;
    public final void rule__Inv__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3435:1: ( rule__Inv__Group_2_1__1__Impl rule__Inv__Group_2_1__2 )
            // InternalTempor.g:3436:2: rule__Inv__Group_2_1__1__Impl rule__Inv__Group_2_1__2
            {
            pushFollow(FOLLOW_39);
            rule__Inv__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inv__Group_2_1__2();

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
    // $ANTLR end "rule__Inv__Group_2_1__1"


    // $ANTLR start "rule__Inv__Group_2_1__1__Impl"
    // InternalTempor.g:3443:1: rule__Inv__Group_2_1__1__Impl : ( 'remain' ) ;
    public final void rule__Inv__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3447:1: ( ( 'remain' ) )
            // InternalTempor.g:3448:1: ( 'remain' )
            {
            // InternalTempor.g:3448:1: ( 'remain' )
            // InternalTempor.g:3449:2: 'remain'
            {
             before(grammarAccess.getInvAccess().getRemainKeyword_2_1_1()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getInvAccess().getRemainKeyword_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inv__Group_2_1__1__Impl"


    // $ANTLR start "rule__Inv__Group_2_1__2"
    // InternalTempor.g:3458:1: rule__Inv__Group_2_1__2 : rule__Inv__Group_2_1__2__Impl rule__Inv__Group_2_1__3 ;
    public final void rule__Inv__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3462:1: ( rule__Inv__Group_2_1__2__Impl rule__Inv__Group_2_1__3 )
            // InternalTempor.g:3463:2: rule__Inv__Group_2_1__2__Impl rule__Inv__Group_2_1__3
            {
            pushFollow(FOLLOW_40);
            rule__Inv__Group_2_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inv__Group_2_1__3();

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
    // $ANTLR end "rule__Inv__Group_2_1__2"


    // $ANTLR start "rule__Inv__Group_2_1__2__Impl"
    // InternalTempor.g:3470:1: rule__Inv__Group_2_1__2__Impl : ( 'valid' ) ;
    public final void rule__Inv__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3474:1: ( ( 'valid' ) )
            // InternalTempor.g:3475:1: ( 'valid' )
            {
            // InternalTempor.g:3475:1: ( 'valid' )
            // InternalTempor.g:3476:2: 'valid'
            {
             before(grammarAccess.getInvAccess().getValidKeyword_2_1_2()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getInvAccess().getValidKeyword_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inv__Group_2_1__2__Impl"


    // $ANTLR start "rule__Inv__Group_2_1__3"
    // InternalTempor.g:3485:1: rule__Inv__Group_2_1__3 : rule__Inv__Group_2_1__3__Impl rule__Inv__Group_2_1__4 ;
    public final void rule__Inv__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3489:1: ( rule__Inv__Group_2_1__3__Impl rule__Inv__Group_2_1__4 )
            // InternalTempor.g:3490:2: rule__Inv__Group_2_1__3__Impl rule__Inv__Group_2_1__4
            {
            pushFollow(FOLLOW_41);
            rule__Inv__Group_2_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inv__Group_2_1__4();

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
    // $ANTLR end "rule__Inv__Group_2_1__3"


    // $ANTLR start "rule__Inv__Group_2_1__3__Impl"
    // InternalTempor.g:3497:1: rule__Inv__Group_2_1__3__Impl : ( 'until' ) ;
    public final void rule__Inv__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3501:1: ( ( 'until' ) )
            // InternalTempor.g:3502:1: ( 'until' )
            {
            // InternalTempor.g:3502:1: ( 'until' )
            // InternalTempor.g:3503:2: 'until'
            {
             before(grammarAccess.getInvAccess().getUntilKeyword_2_1_3()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getInvAccess().getUntilKeyword_2_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inv__Group_2_1__3__Impl"


    // $ANTLR start "rule__Inv__Group_2_1__4"
    // InternalTempor.g:3512:1: rule__Inv__Group_2_1__4 : rule__Inv__Group_2_1__4__Impl ;
    public final void rule__Inv__Group_2_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3516:1: ( rule__Inv__Group_2_1__4__Impl )
            // InternalTempor.g:3517:2: rule__Inv__Group_2_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Inv__Group_2_1__4__Impl();

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
    // $ANTLR end "rule__Inv__Group_2_1__4"


    // $ANTLR start "rule__Inv__Group_2_1__4__Impl"
    // InternalTempor.g:3523:1: rule__Inv__Group_2_1__4__Impl : ( ( rule__Inv__Release_reactionAssignment_2_1_4 ) ) ;
    public final void rule__Inv__Group_2_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3527:1: ( ( ( rule__Inv__Release_reactionAssignment_2_1_4 ) ) )
            // InternalTempor.g:3528:1: ( ( rule__Inv__Release_reactionAssignment_2_1_4 ) )
            {
            // InternalTempor.g:3528:1: ( ( rule__Inv__Release_reactionAssignment_2_1_4 ) )
            // InternalTempor.g:3529:2: ( rule__Inv__Release_reactionAssignment_2_1_4 )
            {
             before(grammarAccess.getInvAccess().getRelease_reactionAssignment_2_1_4()); 
            // InternalTempor.g:3530:2: ( rule__Inv__Release_reactionAssignment_2_1_4 )
            // InternalTempor.g:3530:3: rule__Inv__Release_reactionAssignment_2_1_4
            {
            pushFollow(FOLLOW_2);
            rule__Inv__Release_reactionAssignment_2_1_4();

            state._fsp--;


            }

             after(grammarAccess.getInvAccess().getRelease_reactionAssignment_2_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inv__Group_2_1__4__Impl"


    // $ANTLR start "rule__Inv_always__Group__0"
    // InternalTempor.g:3539:1: rule__Inv_always__Group__0 : rule__Inv_always__Group__0__Impl rule__Inv_always__Group__1 ;
    public final void rule__Inv_always__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3543:1: ( rule__Inv_always__Group__0__Impl rule__Inv_always__Group__1 )
            // InternalTempor.g:3544:2: rule__Inv_always__Group__0__Impl rule__Inv_always__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__Inv_always__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inv_always__Group__1();

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
    // $ANTLR end "rule__Inv_always__Group__0"


    // $ANTLR start "rule__Inv_always__Group__0__Impl"
    // InternalTempor.g:3551:1: rule__Inv_always__Group__0__Impl : ( () ) ;
    public final void rule__Inv_always__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3555:1: ( ( () ) )
            // InternalTempor.g:3556:1: ( () )
            {
            // InternalTempor.g:3556:1: ( () )
            // InternalTempor.g:3557:2: ()
            {
             before(grammarAccess.getInv_alwaysAccess().getInv_alwaysAction_0()); 
            // InternalTempor.g:3558:2: ()
            // InternalTempor.g:3558:3: 
            {
            }

             after(grammarAccess.getInv_alwaysAccess().getInv_alwaysAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inv_always__Group__0__Impl"


    // $ANTLR start "rule__Inv_always__Group__1"
    // InternalTempor.g:3566:1: rule__Inv_always__Group__1 : rule__Inv_always__Group__1__Impl ;
    public final void rule__Inv_always__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3570:1: ( rule__Inv_always__Group__1__Impl )
            // InternalTempor.g:3571:2: rule__Inv_always__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Inv_always__Group__1__Impl();

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
    // $ANTLR end "rule__Inv_always__Group__1"


    // $ANTLR start "rule__Inv_always__Group__1__Impl"
    // InternalTempor.g:3577:1: rule__Inv_always__Group__1__Impl : ( ( rule__Inv_always__Group_1__0 ) ) ;
    public final void rule__Inv_always__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3581:1: ( ( ( rule__Inv_always__Group_1__0 ) ) )
            // InternalTempor.g:3582:1: ( ( rule__Inv_always__Group_1__0 ) )
            {
            // InternalTempor.g:3582:1: ( ( rule__Inv_always__Group_1__0 ) )
            // InternalTempor.g:3583:2: ( rule__Inv_always__Group_1__0 )
            {
             before(grammarAccess.getInv_alwaysAccess().getGroup_1()); 
            // InternalTempor.g:3584:2: ( rule__Inv_always__Group_1__0 )
            // InternalTempor.g:3584:3: rule__Inv_always__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Inv_always__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getInv_alwaysAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inv_always__Group__1__Impl"


    // $ANTLR start "rule__Inv_always__Group_1__0"
    // InternalTempor.g:3593:1: rule__Inv_always__Group_1__0 : rule__Inv_always__Group_1__0__Impl rule__Inv_always__Group_1__1 ;
    public final void rule__Inv_always__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3597:1: ( rule__Inv_always__Group_1__0__Impl rule__Inv_always__Group_1__1 )
            // InternalTempor.g:3598:2: rule__Inv_always__Group_1__0__Impl rule__Inv_always__Group_1__1
            {
            pushFollow(FOLLOW_42);
            rule__Inv_always__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inv_always__Group_1__1();

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
    // $ANTLR end "rule__Inv_always__Group_1__0"


    // $ANTLR start "rule__Inv_always__Group_1__0__Impl"
    // InternalTempor.g:3605:1: rule__Inv_always__Group_1__0__Impl : ( ( rule__Inv_always__InvAssignment_1_0 ) ) ;
    public final void rule__Inv_always__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3609:1: ( ( ( rule__Inv_always__InvAssignment_1_0 ) ) )
            // InternalTempor.g:3610:1: ( ( rule__Inv_always__InvAssignment_1_0 ) )
            {
            // InternalTempor.g:3610:1: ( ( rule__Inv_always__InvAssignment_1_0 ) )
            // InternalTempor.g:3611:2: ( rule__Inv_always__InvAssignment_1_0 )
            {
             before(grammarAccess.getInv_alwaysAccess().getInvAssignment_1_0()); 
            // InternalTempor.g:3612:2: ( rule__Inv_always__InvAssignment_1_0 )
            // InternalTempor.g:3612:3: rule__Inv_always__InvAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Inv_always__InvAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getInv_alwaysAccess().getInvAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inv_always__Group_1__0__Impl"


    // $ANTLR start "rule__Inv_always__Group_1__1"
    // InternalTempor.g:3620:1: rule__Inv_always__Group_1__1 : rule__Inv_always__Group_1__1__Impl rule__Inv_always__Group_1__2 ;
    public final void rule__Inv_always__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3624:1: ( rule__Inv_always__Group_1__1__Impl rule__Inv_always__Group_1__2 )
            // InternalTempor.g:3625:2: rule__Inv_always__Group_1__1__Impl rule__Inv_always__Group_1__2
            {
            pushFollow(FOLLOW_43);
            rule__Inv_always__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inv_always__Group_1__2();

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
    // $ANTLR end "rule__Inv_always__Group_1__1"


    // $ANTLR start "rule__Inv_always__Group_1__1__Impl"
    // InternalTempor.g:3632:1: rule__Inv_always__Group_1__1__Impl : ( 'should' ) ;
    public final void rule__Inv_always__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3636:1: ( ( 'should' ) )
            // InternalTempor.g:3637:1: ( 'should' )
            {
            // InternalTempor.g:3637:1: ( 'should' )
            // InternalTempor.g:3638:2: 'should'
            {
             before(grammarAccess.getInv_alwaysAccess().getShouldKeyword_1_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getInv_alwaysAccess().getShouldKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inv_always__Group_1__1__Impl"


    // $ANTLR start "rule__Inv_always__Group_1__2"
    // InternalTempor.g:3647:1: rule__Inv_always__Group_1__2 : rule__Inv_always__Group_1__2__Impl rule__Inv_always__Group_1__3 ;
    public final void rule__Inv_always__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3651:1: ( rule__Inv_always__Group_1__2__Impl rule__Inv_always__Group_1__3 )
            // InternalTempor.g:3652:2: rule__Inv_always__Group_1__2__Impl rule__Inv_always__Group_1__3
            {
            pushFollow(FOLLOW_38);
            rule__Inv_always__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inv_always__Group_1__3();

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
    // $ANTLR end "rule__Inv_always__Group_1__2"


    // $ANTLR start "rule__Inv_always__Group_1__2__Impl"
    // InternalTempor.g:3659:1: rule__Inv_always__Group_1__2__Impl : ( 'always' ) ;
    public final void rule__Inv_always__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3663:1: ( ( 'always' ) )
            // InternalTempor.g:3664:1: ( 'always' )
            {
            // InternalTempor.g:3664:1: ( 'always' )
            // InternalTempor.g:3665:2: 'always'
            {
             before(grammarAccess.getInv_alwaysAccess().getAlwaysKeyword_1_2()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getInv_alwaysAccess().getAlwaysKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inv_always__Group_1__2__Impl"


    // $ANTLR start "rule__Inv_always__Group_1__3"
    // InternalTempor.g:3674:1: rule__Inv_always__Group_1__3 : rule__Inv_always__Group_1__3__Impl rule__Inv_always__Group_1__4 ;
    public final void rule__Inv_always__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3678:1: ( rule__Inv_always__Group_1__3__Impl rule__Inv_always__Group_1__4 )
            // InternalTempor.g:3679:2: rule__Inv_always__Group_1__3__Impl rule__Inv_always__Group_1__4
            {
            pushFollow(FOLLOW_39);
            rule__Inv_always__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inv_always__Group_1__4();

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
    // $ANTLR end "rule__Inv_always__Group_1__3"


    // $ANTLR start "rule__Inv_always__Group_1__3__Impl"
    // InternalTempor.g:3686:1: rule__Inv_always__Group_1__3__Impl : ( 'remain' ) ;
    public final void rule__Inv_always__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3690:1: ( ( 'remain' ) )
            // InternalTempor.g:3691:1: ( 'remain' )
            {
            // InternalTempor.g:3691:1: ( 'remain' )
            // InternalTempor.g:3692:2: 'remain'
            {
             before(grammarAccess.getInv_alwaysAccess().getRemainKeyword_1_3()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getInv_alwaysAccess().getRemainKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inv_always__Group_1__3__Impl"


    // $ANTLR start "rule__Inv_always__Group_1__4"
    // InternalTempor.g:3701:1: rule__Inv_always__Group_1__4 : rule__Inv_always__Group_1__4__Impl rule__Inv_always__Group_1__5 ;
    public final void rule__Inv_always__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3705:1: ( rule__Inv_always__Group_1__4__Impl rule__Inv_always__Group_1__5 )
            // InternalTempor.g:3706:2: rule__Inv_always__Group_1__4__Impl rule__Inv_always__Group_1__5
            {
            pushFollow(FOLLOW_40);
            rule__Inv_always__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inv_always__Group_1__5();

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
    // $ANTLR end "rule__Inv_always__Group_1__4"


    // $ANTLR start "rule__Inv_always__Group_1__4__Impl"
    // InternalTempor.g:3713:1: rule__Inv_always__Group_1__4__Impl : ( 'valid' ) ;
    public final void rule__Inv_always__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3717:1: ( ( 'valid' ) )
            // InternalTempor.g:3718:1: ( 'valid' )
            {
            // InternalTempor.g:3718:1: ( 'valid' )
            // InternalTempor.g:3719:2: 'valid'
            {
             before(grammarAccess.getInv_alwaysAccess().getValidKeyword_1_4()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getInv_alwaysAccess().getValidKeyword_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inv_always__Group_1__4__Impl"


    // $ANTLR start "rule__Inv_always__Group_1__5"
    // InternalTempor.g:3728:1: rule__Inv_always__Group_1__5 : rule__Inv_always__Group_1__5__Impl rule__Inv_always__Group_1__6 ;
    public final void rule__Inv_always__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3732:1: ( rule__Inv_always__Group_1__5__Impl rule__Inv_always__Group_1__6 )
            // InternalTempor.g:3733:2: rule__Inv_always__Group_1__5__Impl rule__Inv_always__Group_1__6
            {
            pushFollow(FOLLOW_41);
            rule__Inv_always__Group_1__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inv_always__Group_1__6();

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
    // $ANTLR end "rule__Inv_always__Group_1__5"


    // $ANTLR start "rule__Inv_always__Group_1__5__Impl"
    // InternalTempor.g:3740:1: rule__Inv_always__Group_1__5__Impl : ( 'until' ) ;
    public final void rule__Inv_always__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3744:1: ( ( 'until' ) )
            // InternalTempor.g:3745:1: ( 'until' )
            {
            // InternalTempor.g:3745:1: ( 'until' )
            // InternalTempor.g:3746:2: 'until'
            {
             before(grammarAccess.getInv_alwaysAccess().getUntilKeyword_1_5()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getInv_alwaysAccess().getUntilKeyword_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inv_always__Group_1__5__Impl"


    // $ANTLR start "rule__Inv_always__Group_1__6"
    // InternalTempor.g:3755:1: rule__Inv_always__Group_1__6 : rule__Inv_always__Group_1__6__Impl ;
    public final void rule__Inv_always__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3759:1: ( rule__Inv_always__Group_1__6__Impl )
            // InternalTempor.g:3760:2: rule__Inv_always__Group_1__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Inv_always__Group_1__6__Impl();

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
    // $ANTLR end "rule__Inv_always__Group_1__6"


    // $ANTLR start "rule__Inv_always__Group_1__6__Impl"
    // InternalTempor.g:3766:1: rule__Inv_always__Group_1__6__Impl : ( ( rule__Inv_always__Release_reactionAssignment_1_6 ) ) ;
    public final void rule__Inv_always__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3770:1: ( ( ( rule__Inv_always__Release_reactionAssignment_1_6 ) ) )
            // InternalTempor.g:3771:1: ( ( rule__Inv_always__Release_reactionAssignment_1_6 ) )
            {
            // InternalTempor.g:3771:1: ( ( rule__Inv_always__Release_reactionAssignment_1_6 ) )
            // InternalTempor.g:3772:2: ( rule__Inv_always__Release_reactionAssignment_1_6 )
            {
             before(grammarAccess.getInv_alwaysAccess().getRelease_reactionAssignment_1_6()); 
            // InternalTempor.g:3773:2: ( rule__Inv_always__Release_reactionAssignment_1_6 )
            // InternalTempor.g:3773:3: rule__Inv_always__Release_reactionAssignment_1_6
            {
            pushFollow(FOLLOW_2);
            rule__Inv_always__Release_reactionAssignment_1_6();

            state._fsp--;


            }

             after(grammarAccess.getInv_alwaysAccess().getRelease_reactionAssignment_1_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inv_always__Group_1__6__Impl"


    // $ANTLR start "rule__RelRea__Group_0__0"
    // InternalTempor.g:3782:1: rule__RelRea__Group_0__0 : rule__RelRea__Group_0__0__Impl rule__RelRea__Group_0__1 ;
    public final void rule__RelRea__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3786:1: ( rule__RelRea__Group_0__0__Impl rule__RelRea__Group_0__1 )
            // InternalTempor.g:3787:2: rule__RelRea__Group_0__0__Impl rule__RelRea__Group_0__1
            {
            pushFollow(FOLLOW_44);
            rule__RelRea__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelRea__Group_0__1();

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
    // $ANTLR end "rule__RelRea__Group_0__0"


    // $ANTLR start "rule__RelRea__Group_0__0__Impl"
    // InternalTempor.g:3794:1: rule__RelRea__Group_0__0__Impl : ( () ) ;
    public final void rule__RelRea__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3798:1: ( ( () ) )
            // InternalTempor.g:3799:1: ( () )
            {
            // InternalTempor.g:3799:1: ( () )
            // InternalTempor.g:3800:2: ()
            {
             before(grammarAccess.getRelReaAccess().getRelAction_0_0()); 
            // InternalTempor.g:3801:2: ()
            // InternalTempor.g:3801:3: 
            {
            }

             after(grammarAccess.getRelReaAccess().getRelAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__Group_0__0__Impl"


    // $ANTLR start "rule__RelRea__Group_0__1"
    // InternalTempor.g:3809:1: rule__RelRea__Group_0__1 : rule__RelRea__Group_0__1__Impl ;
    public final void rule__RelRea__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3813:1: ( rule__RelRea__Group_0__1__Impl )
            // InternalTempor.g:3814:2: rule__RelRea__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelRea__Group_0__1__Impl();

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
    // $ANTLR end "rule__RelRea__Group_0__1"


    // $ANTLR start "rule__RelRea__Group_0__1__Impl"
    // InternalTempor.g:3820:1: rule__RelRea__Group_0__1__Impl : ( ( rule__RelRea__Group_0_1__0 ) ) ;
    public final void rule__RelRea__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3824:1: ( ( ( rule__RelRea__Group_0_1__0 ) ) )
            // InternalTempor.g:3825:1: ( ( rule__RelRea__Group_0_1__0 ) )
            {
            // InternalTempor.g:3825:1: ( ( rule__RelRea__Group_0_1__0 ) )
            // InternalTempor.g:3826:2: ( rule__RelRea__Group_0_1__0 )
            {
             before(grammarAccess.getRelReaAccess().getGroup_0_1()); 
            // InternalTempor.g:3827:2: ( rule__RelRea__Group_0_1__0 )
            // InternalTempor.g:3827:3: rule__RelRea__Group_0_1__0
            {
            pushFollow(FOLLOW_2);
            rule__RelRea__Group_0_1__0();

            state._fsp--;


            }

             after(grammarAccess.getRelReaAccess().getGroup_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__Group_0__1__Impl"


    // $ANTLR start "rule__RelRea__Group_0_1__0"
    // InternalTempor.g:3836:1: rule__RelRea__Group_0_1__0 : rule__RelRea__Group_0_1__0__Impl rule__RelRea__Group_0_1__1 ;
    public final void rule__RelRea__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3840:1: ( rule__RelRea__Group_0_1__0__Impl rule__RelRea__Group_0_1__1 )
            // InternalTempor.g:3841:2: rule__RelRea__Group_0_1__0__Impl rule__RelRea__Group_0_1__1
            {
            pushFollow(FOLLOW_13);
            rule__RelRea__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelRea__Group_0_1__1();

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
    // $ANTLR end "rule__RelRea__Group_0_1__0"


    // $ANTLR start "rule__RelRea__Group_0_1__0__Impl"
    // InternalTempor.g:3848:1: rule__RelRea__Group_0_1__0__Impl : ( 'either' ) ;
    public final void rule__RelRea__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3852:1: ( ( 'either' ) )
            // InternalTempor.g:3853:1: ( 'either' )
            {
            // InternalTempor.g:3853:1: ( 'either' )
            // InternalTempor.g:3854:2: 'either'
            {
             before(grammarAccess.getRelReaAccess().getEitherKeyword_0_1_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getRelReaAccess().getEitherKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__Group_0_1__0__Impl"


    // $ANTLR start "rule__RelRea__Group_0_1__1"
    // InternalTempor.g:3863:1: rule__RelRea__Group_0_1__1 : rule__RelRea__Group_0_1__1__Impl rule__RelRea__Group_0_1__2 ;
    public final void rule__RelRea__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3867:1: ( rule__RelRea__Group_0_1__1__Impl rule__RelRea__Group_0_1__2 )
            // InternalTempor.g:3868:2: rule__RelRea__Group_0_1__1__Impl rule__RelRea__Group_0_1__2
            {
            pushFollow(FOLLOW_45);
            rule__RelRea__Group_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelRea__Group_0_1__2();

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
    // $ANTLR end "rule__RelRea__Group_0_1__1"


    // $ANTLR start "rule__RelRea__Group_0_1__1__Impl"
    // InternalTempor.g:3875:1: rule__RelRea__Group_0_1__1__Impl : ( ( rule__RelRea__RelAssignment_0_1_1 ) ) ;
    public final void rule__RelRea__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3879:1: ( ( ( rule__RelRea__RelAssignment_0_1_1 ) ) )
            // InternalTempor.g:3880:1: ( ( rule__RelRea__RelAssignment_0_1_1 ) )
            {
            // InternalTempor.g:3880:1: ( ( rule__RelRea__RelAssignment_0_1_1 ) )
            // InternalTempor.g:3881:2: ( rule__RelRea__RelAssignment_0_1_1 )
            {
             before(grammarAccess.getRelReaAccess().getRelAssignment_0_1_1()); 
            // InternalTempor.g:3882:2: ( rule__RelRea__RelAssignment_0_1_1 )
            // InternalTempor.g:3882:3: rule__RelRea__RelAssignment_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__RelRea__RelAssignment_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRelReaAccess().getRelAssignment_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__Group_0_1__1__Impl"


    // $ANTLR start "rule__RelRea__Group_0_1__2"
    // InternalTempor.g:3890:1: rule__RelRea__Group_0_1__2 : rule__RelRea__Group_0_1__2__Impl rule__RelRea__Group_0_1__3 ;
    public final void rule__RelRea__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3894:1: ( rule__RelRea__Group_0_1__2__Impl rule__RelRea__Group_0_1__3 )
            // InternalTempor.g:3895:2: rule__RelRea__Group_0_1__2__Impl rule__RelRea__Group_0_1__3
            {
            pushFollow(FOLLOW_46);
            rule__RelRea__Group_0_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelRea__Group_0_1__3();

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
    // $ANTLR end "rule__RelRea__Group_0_1__2"


    // $ANTLR start "rule__RelRea__Group_0_1__2__Impl"
    // InternalTempor.g:3902:1: rule__RelRea__Group_0_1__2__Impl : ( 'or' ) ;
    public final void rule__RelRea__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3906:1: ( ( 'or' ) )
            // InternalTempor.g:3907:1: ( 'or' )
            {
            // InternalTempor.g:3907:1: ( 'or' )
            // InternalTempor.g:3908:2: 'or'
            {
             before(grammarAccess.getRelReaAccess().getOrKeyword_0_1_2()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getRelReaAccess().getOrKeyword_0_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__Group_0_1__2__Impl"


    // $ANTLR start "rule__RelRea__Group_0_1__3"
    // InternalTempor.g:3917:1: rule__RelRea__Group_0_1__3 : rule__RelRea__Group_0_1__3__Impl rule__RelRea__Group_0_1__4 ;
    public final void rule__RelRea__Group_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3921:1: ( rule__RelRea__Group_0_1__3__Impl rule__RelRea__Group_0_1__4 )
            // InternalTempor.g:3922:2: rule__RelRea__Group_0_1__3__Impl rule__RelRea__Group_0_1__4
            {
            pushFollow(FOLLOW_36);
            rule__RelRea__Group_0_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelRea__Group_0_1__4();

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
    // $ANTLR end "rule__RelRea__Group_0_1__3"


    // $ANTLR start "rule__RelRea__Group_0_1__3__Impl"
    // InternalTempor.g:3929:1: rule__RelRea__Group_0_1__3__Impl : ( ( rule__RelRea__ReactionAssignment_0_1_3 ) ) ;
    public final void rule__RelRea__Group_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3933:1: ( ( ( rule__RelRea__ReactionAssignment_0_1_3 ) ) )
            // InternalTempor.g:3934:1: ( ( rule__RelRea__ReactionAssignment_0_1_3 ) )
            {
            // InternalTempor.g:3934:1: ( ( rule__RelRea__ReactionAssignment_0_1_3 ) )
            // InternalTempor.g:3935:2: ( rule__RelRea__ReactionAssignment_0_1_3 )
            {
             before(grammarAccess.getRelReaAccess().getReactionAssignment_0_1_3()); 
            // InternalTempor.g:3936:2: ( rule__RelRea__ReactionAssignment_0_1_3 )
            // InternalTempor.g:3936:3: rule__RelRea__ReactionAssignment_0_1_3
            {
            pushFollow(FOLLOW_2);
            rule__RelRea__ReactionAssignment_0_1_3();

            state._fsp--;


            }

             after(grammarAccess.getRelReaAccess().getReactionAssignment_0_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__Group_0_1__3__Impl"


    // $ANTLR start "rule__RelRea__Group_0_1__4"
    // InternalTempor.g:3944:1: rule__RelRea__Group_0_1__4 : rule__RelRea__Group_0_1__4__Impl ;
    public final void rule__RelRea__Group_0_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3948:1: ( rule__RelRea__Group_0_1__4__Impl )
            // InternalTempor.g:3949:2: rule__RelRea__Group_0_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelRea__Group_0_1__4__Impl();

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
    // $ANTLR end "rule__RelRea__Group_0_1__4"


    // $ANTLR start "rule__RelRea__Group_0_1__4__Impl"
    // InternalTempor.g:3955:1: rule__RelRea__Group_0_1__4__Impl : ( ( rule__RelRea__Group_0_1_4__0 )? ) ;
    public final void rule__RelRea__Group_0_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3959:1: ( ( ( rule__RelRea__Group_0_1_4__0 )? ) )
            // InternalTempor.g:3960:1: ( ( rule__RelRea__Group_0_1_4__0 )? )
            {
            // InternalTempor.g:3960:1: ( ( rule__RelRea__Group_0_1_4__0 )? )
            // InternalTempor.g:3961:2: ( rule__RelRea__Group_0_1_4__0 )?
            {
             before(grammarAccess.getRelReaAccess().getGroup_0_1_4()); 
            // InternalTempor.g:3962:2: ( rule__RelRea__Group_0_1_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==18) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalTempor.g:3962:3: rule__RelRea__Group_0_1_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RelRea__Group_0_1_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelReaAccess().getGroup_0_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__Group_0_1__4__Impl"


    // $ANTLR start "rule__RelRea__Group_0_1_4__0"
    // InternalTempor.g:3971:1: rule__RelRea__Group_0_1_4__0 : rule__RelRea__Group_0_1_4__0__Impl rule__RelRea__Group_0_1_4__1 ;
    public final void rule__RelRea__Group_0_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3975:1: ( rule__RelRea__Group_0_1_4__0__Impl rule__RelRea__Group_0_1_4__1 )
            // InternalTempor.g:3976:2: rule__RelRea__Group_0_1_4__0__Impl rule__RelRea__Group_0_1_4__1
            {
            pushFollow(FOLLOW_35);
            rule__RelRea__Group_0_1_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelRea__Group_0_1_4__1();

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
    // $ANTLR end "rule__RelRea__Group_0_1_4__0"


    // $ANTLR start "rule__RelRea__Group_0_1_4__0__Impl"
    // InternalTempor.g:3983:1: rule__RelRea__Group_0_1_4__0__Impl : ( ruleCOMMA ) ;
    public final void rule__RelRea__Group_0_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:3987:1: ( ( ruleCOMMA ) )
            // InternalTempor.g:3988:1: ( ruleCOMMA )
            {
            // InternalTempor.g:3988:1: ( ruleCOMMA )
            // InternalTempor.g:3989:2: ruleCOMMA
            {
             before(grammarAccess.getRelReaAccess().getCOMMAParserRuleCall_0_1_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCOMMA();

            state._fsp--;

             after(grammarAccess.getRelReaAccess().getCOMMAParserRuleCall_0_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__Group_0_1_4__0__Impl"


    // $ANTLR start "rule__RelRea__Group_0_1_4__1"
    // InternalTempor.g:3998:1: rule__RelRea__Group_0_1_4__1 : rule__RelRea__Group_0_1_4__1__Impl ;
    public final void rule__RelRea__Group_0_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4002:1: ( rule__RelRea__Group_0_1_4__1__Impl )
            // InternalTempor.g:4003:2: rule__RelRea__Group_0_1_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelRea__Group_0_1_4__1__Impl();

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
    // $ANTLR end "rule__RelRea__Group_0_1_4__1"


    // $ANTLR start "rule__RelRea__Group_0_1_4__1__Impl"
    // InternalTempor.g:4009:1: rule__RelRea__Group_0_1_4__1__Impl : ( ( rule__RelRea__Delay_finalAssignment_0_1_4_1 ) ) ;
    public final void rule__RelRea__Group_0_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4013:1: ( ( ( rule__RelRea__Delay_finalAssignment_0_1_4_1 ) ) )
            // InternalTempor.g:4014:1: ( ( rule__RelRea__Delay_finalAssignment_0_1_4_1 ) )
            {
            // InternalTempor.g:4014:1: ( ( rule__RelRea__Delay_finalAssignment_0_1_4_1 ) )
            // InternalTempor.g:4015:2: ( rule__RelRea__Delay_finalAssignment_0_1_4_1 )
            {
             before(grammarAccess.getRelReaAccess().getDelay_finalAssignment_0_1_4_1()); 
            // InternalTempor.g:4016:2: ( rule__RelRea__Delay_finalAssignment_0_1_4_1 )
            // InternalTempor.g:4016:3: rule__RelRea__Delay_finalAssignment_0_1_4_1
            {
            pushFollow(FOLLOW_2);
            rule__RelRea__Delay_finalAssignment_0_1_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRelReaAccess().getDelay_finalAssignment_0_1_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__Group_0_1_4__1__Impl"


    // $ANTLR start "rule__RelRea__Group_1__0"
    // InternalTempor.g:4025:1: rule__RelRea__Group_1__0 : rule__RelRea__Group_1__0__Impl rule__RelRea__Group_1__1 ;
    public final void rule__RelRea__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4029:1: ( rule__RelRea__Group_1__0__Impl rule__RelRea__Group_1__1 )
            // InternalTempor.g:4030:2: rule__RelRea__Group_1__0__Impl rule__RelRea__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__RelRea__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelRea__Group_1__1();

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
    // $ANTLR end "rule__RelRea__Group_1__0"


    // $ANTLR start "rule__RelRea__Group_1__0__Impl"
    // InternalTempor.g:4037:1: rule__RelRea__Group_1__0__Impl : ( () ) ;
    public final void rule__RelRea__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4041:1: ( ( () ) )
            // InternalTempor.g:4042:1: ( () )
            {
            // InternalTempor.g:4042:1: ( () )
            // InternalTempor.g:4043:2: ()
            {
             before(grammarAccess.getRelReaAccess().getRelAction_1_0()); 
            // InternalTempor.g:4044:2: ()
            // InternalTempor.g:4044:3: 
            {
            }

             after(grammarAccess.getRelReaAccess().getRelAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__Group_1__0__Impl"


    // $ANTLR start "rule__RelRea__Group_1__1"
    // InternalTempor.g:4052:1: rule__RelRea__Group_1__1 : rule__RelRea__Group_1__1__Impl ;
    public final void rule__RelRea__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4056:1: ( rule__RelRea__Group_1__1__Impl )
            // InternalTempor.g:4057:2: rule__RelRea__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelRea__Group_1__1__Impl();

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
    // $ANTLR end "rule__RelRea__Group_1__1"


    // $ANTLR start "rule__RelRea__Group_1__1__Impl"
    // InternalTempor.g:4063:1: rule__RelRea__Group_1__1__Impl : ( ( rule__RelRea__RelAssignment_1_1 ) ) ;
    public final void rule__RelRea__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4067:1: ( ( ( rule__RelRea__RelAssignment_1_1 ) ) )
            // InternalTempor.g:4068:1: ( ( rule__RelRea__RelAssignment_1_1 ) )
            {
            // InternalTempor.g:4068:1: ( ( rule__RelRea__RelAssignment_1_1 ) )
            // InternalTempor.g:4069:2: ( rule__RelRea__RelAssignment_1_1 )
            {
             before(grammarAccess.getRelReaAccess().getRelAssignment_1_1()); 
            // InternalTempor.g:4070:2: ( rule__RelRea__RelAssignment_1_1 )
            // InternalTempor.g:4070:3: rule__RelRea__RelAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__RelRea__RelAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRelReaAccess().getRelAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__Group_1__1__Impl"


    // $ANTLR start "rule__RelRea__Group_2__0"
    // InternalTempor.g:4079:1: rule__RelRea__Group_2__0 : rule__RelRea__Group_2__0__Impl rule__RelRea__Group_2__1 ;
    public final void rule__RelRea__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4083:1: ( rule__RelRea__Group_2__0__Impl rule__RelRea__Group_2__1 )
            // InternalTempor.g:4084:2: rule__RelRea__Group_2__0__Impl rule__RelRea__Group_2__1
            {
            pushFollow(FOLLOW_46);
            rule__RelRea__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelRea__Group_2__1();

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
    // $ANTLR end "rule__RelRea__Group_2__0"


    // $ANTLR start "rule__RelRea__Group_2__0__Impl"
    // InternalTempor.g:4091:1: rule__RelRea__Group_2__0__Impl : ( () ) ;
    public final void rule__RelRea__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4095:1: ( ( () ) )
            // InternalTempor.g:4096:1: ( () )
            {
            // InternalTempor.g:4096:1: ( () )
            // InternalTempor.g:4097:2: ()
            {
             before(grammarAccess.getRelReaAccess().getReaAction_2_0()); 
            // InternalTempor.g:4098:2: ()
            // InternalTempor.g:4098:3: 
            {
            }

             after(grammarAccess.getRelReaAccess().getReaAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__Group_2__0__Impl"


    // $ANTLR start "rule__RelRea__Group_2__1"
    // InternalTempor.g:4106:1: rule__RelRea__Group_2__1 : rule__RelRea__Group_2__1__Impl ;
    public final void rule__RelRea__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4110:1: ( rule__RelRea__Group_2__1__Impl )
            // InternalTempor.g:4111:2: rule__RelRea__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelRea__Group_2__1__Impl();

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
    // $ANTLR end "rule__RelRea__Group_2__1"


    // $ANTLR start "rule__RelRea__Group_2__1__Impl"
    // InternalTempor.g:4117:1: rule__RelRea__Group_2__1__Impl : ( ( rule__RelRea__Group_2_1__0 ) ) ;
    public final void rule__RelRea__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4121:1: ( ( ( rule__RelRea__Group_2_1__0 ) ) )
            // InternalTempor.g:4122:1: ( ( rule__RelRea__Group_2_1__0 ) )
            {
            // InternalTempor.g:4122:1: ( ( rule__RelRea__Group_2_1__0 ) )
            // InternalTempor.g:4123:2: ( rule__RelRea__Group_2_1__0 )
            {
             before(grammarAccess.getRelReaAccess().getGroup_2_1()); 
            // InternalTempor.g:4124:2: ( rule__RelRea__Group_2_1__0 )
            // InternalTempor.g:4124:3: rule__RelRea__Group_2_1__0
            {
            pushFollow(FOLLOW_2);
            rule__RelRea__Group_2_1__0();

            state._fsp--;


            }

             after(grammarAccess.getRelReaAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__Group_2__1__Impl"


    // $ANTLR start "rule__RelRea__Group_2_1__0"
    // InternalTempor.g:4133:1: rule__RelRea__Group_2_1__0 : rule__RelRea__Group_2_1__0__Impl rule__RelRea__Group_2_1__1 ;
    public final void rule__RelRea__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4137:1: ( rule__RelRea__Group_2_1__0__Impl rule__RelRea__Group_2_1__1 )
            // InternalTempor.g:4138:2: rule__RelRea__Group_2_1__0__Impl rule__RelRea__Group_2_1__1
            {
            pushFollow(FOLLOW_36);
            rule__RelRea__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelRea__Group_2_1__1();

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
    // $ANTLR end "rule__RelRea__Group_2_1__0"


    // $ANTLR start "rule__RelRea__Group_2_1__0__Impl"
    // InternalTempor.g:4145:1: rule__RelRea__Group_2_1__0__Impl : ( ( rule__RelRea__ReactionAssignment_2_1_0 ) ) ;
    public final void rule__RelRea__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4149:1: ( ( ( rule__RelRea__ReactionAssignment_2_1_0 ) ) )
            // InternalTempor.g:4150:1: ( ( rule__RelRea__ReactionAssignment_2_1_0 ) )
            {
            // InternalTempor.g:4150:1: ( ( rule__RelRea__ReactionAssignment_2_1_0 ) )
            // InternalTempor.g:4151:2: ( rule__RelRea__ReactionAssignment_2_1_0 )
            {
             before(grammarAccess.getRelReaAccess().getReactionAssignment_2_1_0()); 
            // InternalTempor.g:4152:2: ( rule__RelRea__ReactionAssignment_2_1_0 )
            // InternalTempor.g:4152:3: rule__RelRea__ReactionAssignment_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__RelRea__ReactionAssignment_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getRelReaAccess().getReactionAssignment_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__Group_2_1__0__Impl"


    // $ANTLR start "rule__RelRea__Group_2_1__1"
    // InternalTempor.g:4160:1: rule__RelRea__Group_2_1__1 : rule__RelRea__Group_2_1__1__Impl ;
    public final void rule__RelRea__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4164:1: ( rule__RelRea__Group_2_1__1__Impl )
            // InternalTempor.g:4165:2: rule__RelRea__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelRea__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__RelRea__Group_2_1__1"


    // $ANTLR start "rule__RelRea__Group_2_1__1__Impl"
    // InternalTempor.g:4171:1: rule__RelRea__Group_2_1__1__Impl : ( ( rule__RelRea__Group_2_1_1__0 )? ) ;
    public final void rule__RelRea__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4175:1: ( ( ( rule__RelRea__Group_2_1_1__0 )? ) )
            // InternalTempor.g:4176:1: ( ( rule__RelRea__Group_2_1_1__0 )? )
            {
            // InternalTempor.g:4176:1: ( ( rule__RelRea__Group_2_1_1__0 )? )
            // InternalTempor.g:4177:2: ( rule__RelRea__Group_2_1_1__0 )?
            {
             before(grammarAccess.getRelReaAccess().getGroup_2_1_1()); 
            // InternalTempor.g:4178:2: ( rule__RelRea__Group_2_1_1__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==18) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalTempor.g:4178:3: rule__RelRea__Group_2_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RelRea__Group_2_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelReaAccess().getGroup_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__Group_2_1__1__Impl"


    // $ANTLR start "rule__RelRea__Group_2_1_1__0"
    // InternalTempor.g:4187:1: rule__RelRea__Group_2_1_1__0 : rule__RelRea__Group_2_1_1__0__Impl rule__RelRea__Group_2_1_1__1 ;
    public final void rule__RelRea__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4191:1: ( rule__RelRea__Group_2_1_1__0__Impl rule__RelRea__Group_2_1_1__1 )
            // InternalTempor.g:4192:2: rule__RelRea__Group_2_1_1__0__Impl rule__RelRea__Group_2_1_1__1
            {
            pushFollow(FOLLOW_35);
            rule__RelRea__Group_2_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelRea__Group_2_1_1__1();

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
    // $ANTLR end "rule__RelRea__Group_2_1_1__0"


    // $ANTLR start "rule__RelRea__Group_2_1_1__0__Impl"
    // InternalTempor.g:4199:1: rule__RelRea__Group_2_1_1__0__Impl : ( ruleCOMMA ) ;
    public final void rule__RelRea__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4203:1: ( ( ruleCOMMA ) )
            // InternalTempor.g:4204:1: ( ruleCOMMA )
            {
            // InternalTempor.g:4204:1: ( ruleCOMMA )
            // InternalTempor.g:4205:2: ruleCOMMA
            {
             before(grammarAccess.getRelReaAccess().getCOMMAParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCOMMA();

            state._fsp--;

             after(grammarAccess.getRelReaAccess().getCOMMAParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__Group_2_1_1__0__Impl"


    // $ANTLR start "rule__RelRea__Group_2_1_1__1"
    // InternalTempor.g:4214:1: rule__RelRea__Group_2_1_1__1 : rule__RelRea__Group_2_1_1__1__Impl ;
    public final void rule__RelRea__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4218:1: ( rule__RelRea__Group_2_1_1__1__Impl )
            // InternalTempor.g:4219:2: rule__RelRea__Group_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelRea__Group_2_1_1__1__Impl();

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
    // $ANTLR end "rule__RelRea__Group_2_1_1__1"


    // $ANTLR start "rule__RelRea__Group_2_1_1__1__Impl"
    // InternalTempor.g:4225:1: rule__RelRea__Group_2_1_1__1__Impl : ( ( rule__RelRea__Delay_finalAssignment_2_1_1_1 ) ) ;
    public final void rule__RelRea__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4229:1: ( ( ( rule__RelRea__Delay_finalAssignment_2_1_1_1 ) ) )
            // InternalTempor.g:4230:1: ( ( rule__RelRea__Delay_finalAssignment_2_1_1_1 ) )
            {
            // InternalTempor.g:4230:1: ( ( rule__RelRea__Delay_finalAssignment_2_1_1_1 ) )
            // InternalTempor.g:4231:2: ( rule__RelRea__Delay_finalAssignment_2_1_1_1 )
            {
             before(grammarAccess.getRelReaAccess().getDelay_finalAssignment_2_1_1_1()); 
            // InternalTempor.g:4232:2: ( rule__RelRea__Delay_finalAssignment_2_1_1_1 )
            // InternalTempor.g:4232:3: rule__RelRea__Delay_finalAssignment_2_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__RelRea__Delay_finalAssignment_2_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRelReaAccess().getDelay_finalAssignment_2_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__Group_2_1_1__1__Impl"


    // $ANTLR start "rule__RelRea__Group_3__0"
    // InternalTempor.g:4241:1: rule__RelRea__Group_3__0 : rule__RelRea__Group_3__0__Impl rule__RelRea__Group_3__1 ;
    public final void rule__RelRea__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4245:1: ( rule__RelRea__Group_3__0__Impl rule__RelRea__Group_3__1 )
            // InternalTempor.g:4246:2: rule__RelRea__Group_3__0__Impl rule__RelRea__Group_3__1
            {
            pushFollow(FOLLOW_41);
            rule__RelRea__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelRea__Group_3__1();

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
    // $ANTLR end "rule__RelRea__Group_3__0"


    // $ANTLR start "rule__RelRea__Group_3__0__Impl"
    // InternalTempor.g:4253:1: rule__RelRea__Group_3__0__Impl : ( () ) ;
    public final void rule__RelRea__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4257:1: ( ( () ) )
            // InternalTempor.g:4258:1: ( () )
            {
            // InternalTempor.g:4258:1: ( () )
            // InternalTempor.g:4259:2: ()
            {
             before(grammarAccess.getRelReaAccess().getReaAction_3_0()); 
            // InternalTempor.g:4260:2: ()
            // InternalTempor.g:4260:3: 
            {
            }

             after(grammarAccess.getRelReaAccess().getReaAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__Group_3__0__Impl"


    // $ANTLR start "rule__RelRea__Group_3__1"
    // InternalTempor.g:4268:1: rule__RelRea__Group_3__1 : rule__RelRea__Group_3__1__Impl ;
    public final void rule__RelRea__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4272:1: ( rule__RelRea__Group_3__1__Impl )
            // InternalTempor.g:4273:2: rule__RelRea__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelRea__Group_3__1__Impl();

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
    // $ANTLR end "rule__RelRea__Group_3__1"


    // $ANTLR start "rule__RelRea__Group_3__1__Impl"
    // InternalTempor.g:4279:1: rule__RelRea__Group_3__1__Impl : ( ( rule__RelRea__Group_3_1__0 ) ) ;
    public final void rule__RelRea__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4283:1: ( ( ( rule__RelRea__Group_3_1__0 ) ) )
            // InternalTempor.g:4284:1: ( ( rule__RelRea__Group_3_1__0 ) )
            {
            // InternalTempor.g:4284:1: ( ( rule__RelRea__Group_3_1__0 ) )
            // InternalTempor.g:4285:2: ( rule__RelRea__Group_3_1__0 )
            {
             before(grammarAccess.getRelReaAccess().getGroup_3_1()); 
            // InternalTempor.g:4286:2: ( rule__RelRea__Group_3_1__0 )
            // InternalTempor.g:4286:3: rule__RelRea__Group_3_1__0
            {
            pushFollow(FOLLOW_2);
            rule__RelRea__Group_3_1__0();

            state._fsp--;


            }

             after(grammarAccess.getRelReaAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__Group_3__1__Impl"


    // $ANTLR start "rule__RelRea__Group_3_1__0"
    // InternalTempor.g:4295:1: rule__RelRea__Group_3_1__0 : rule__RelRea__Group_3_1__0__Impl rule__RelRea__Group_3_1__1 ;
    public final void rule__RelRea__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4299:1: ( rule__RelRea__Group_3_1__0__Impl rule__RelRea__Group_3_1__1 )
            // InternalTempor.g:4300:2: rule__RelRea__Group_3_1__0__Impl rule__RelRea__Group_3_1__1
            {
            pushFollow(FOLLOW_47);
            rule__RelRea__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelRea__Group_3_1__1();

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
    // $ANTLR end "rule__RelRea__Group_3_1__0"


    // $ANTLR start "rule__RelRea__Group_3_1__0__Impl"
    // InternalTempor.g:4307:1: rule__RelRea__Group_3_1__0__Impl : ( 'Reaction' ) ;
    public final void rule__RelRea__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4311:1: ( ( 'Reaction' ) )
            // InternalTempor.g:4312:1: ( 'Reaction' )
            {
            // InternalTempor.g:4312:1: ( 'Reaction' )
            // InternalTempor.g:4313:2: 'Reaction'
            {
             before(grammarAccess.getRelReaAccess().getReactionKeyword_3_1_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getRelReaAccess().getReactionKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__Group_3_1__0__Impl"


    // $ANTLR start "rule__RelRea__Group_3_1__1"
    // InternalTempor.g:4322:1: rule__RelRea__Group_3_1__1 : rule__RelRea__Group_3_1__1__Impl rule__RelRea__Group_3_1__2 ;
    public final void rule__RelRea__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4326:1: ( rule__RelRea__Group_3_1__1__Impl rule__RelRea__Group_3_1__2 )
            // InternalTempor.g:4327:2: rule__RelRea__Group_3_1__1__Impl rule__RelRea__Group_3_1__2
            {
            pushFollow(FOLLOW_43);
            rule__RelRea__Group_3_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelRea__Group_3_1__2();

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
    // $ANTLR end "rule__RelRea__Group_3_1__1"


    // $ANTLR start "rule__RelRea__Group_3_1__1__Impl"
    // InternalTempor.g:4334:1: rule__RelRea__Group_3_1__1__Impl : ( 'is' ) ;
    public final void rule__RelRea__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4338:1: ( ( 'is' ) )
            // InternalTempor.g:4339:1: ( 'is' )
            {
            // InternalTempor.g:4339:1: ( 'is' )
            // InternalTempor.g:4340:2: 'is'
            {
             before(grammarAccess.getRelReaAccess().getIsKeyword_3_1_1()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getRelReaAccess().getIsKeyword_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__Group_3_1__1__Impl"


    // $ANTLR start "rule__RelRea__Group_3_1__2"
    // InternalTempor.g:4349:1: rule__RelRea__Group_3_1__2 : rule__RelRea__Group_3_1__2__Impl rule__RelRea__Group_3_1__3 ;
    public final void rule__RelRea__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4353:1: ( rule__RelRea__Group_3_1__2__Impl rule__RelRea__Group_3_1__3 )
            // InternalTempor.g:4354:2: rule__RelRea__Group_3_1__2__Impl rule__RelRea__Group_3_1__3
            {
            pushFollow(FOLLOW_13);
            rule__RelRea__Group_3_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelRea__Group_3_1__3();

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
    // $ANTLR end "rule__RelRea__Group_3_1__2"


    // $ANTLR start "rule__RelRea__Group_3_1__2__Impl"
    // InternalTempor.g:4361:1: rule__RelRea__Group_3_1__2__Impl : ( 'always' ) ;
    public final void rule__RelRea__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4365:1: ( ( 'always' ) )
            // InternalTempor.g:4366:1: ( 'always' )
            {
            // InternalTempor.g:4366:1: ( 'always' )
            // InternalTempor.g:4367:2: 'always'
            {
             before(grammarAccess.getRelReaAccess().getAlwaysKeyword_3_1_2()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getRelReaAccess().getAlwaysKeyword_3_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__Group_3_1__2__Impl"


    // $ANTLR start "rule__RelRea__Group_3_1__3"
    // InternalTempor.g:4376:1: rule__RelRea__Group_3_1__3 : rule__RelRea__Group_3_1__3__Impl rule__RelRea__Group_3_1__4 ;
    public final void rule__RelRea__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4380:1: ( rule__RelRea__Group_3_1__3__Impl rule__RelRea__Group_3_1__4 )
            // InternalTempor.g:4381:2: rule__RelRea__Group_3_1__3__Impl rule__RelRea__Group_3_1__4
            {
            pushFollow(FOLLOW_36);
            rule__RelRea__Group_3_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelRea__Group_3_1__4();

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
    // $ANTLR end "rule__RelRea__Group_3_1__3"


    // $ANTLR start "rule__RelRea__Group_3_1__3__Impl"
    // InternalTempor.g:4388:1: rule__RelRea__Group_3_1__3__Impl : ( ( rule__RelRea__ReaAssignment_3_1_3 ) ) ;
    public final void rule__RelRea__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4392:1: ( ( ( rule__RelRea__ReaAssignment_3_1_3 ) ) )
            // InternalTempor.g:4393:1: ( ( rule__RelRea__ReaAssignment_3_1_3 ) )
            {
            // InternalTempor.g:4393:1: ( ( rule__RelRea__ReaAssignment_3_1_3 ) )
            // InternalTempor.g:4394:2: ( rule__RelRea__ReaAssignment_3_1_3 )
            {
             before(grammarAccess.getRelReaAccess().getReaAssignment_3_1_3()); 
            // InternalTempor.g:4395:2: ( rule__RelRea__ReaAssignment_3_1_3 )
            // InternalTempor.g:4395:3: rule__RelRea__ReaAssignment_3_1_3
            {
            pushFollow(FOLLOW_2);
            rule__RelRea__ReaAssignment_3_1_3();

            state._fsp--;


            }

             after(grammarAccess.getRelReaAccess().getReaAssignment_3_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__Group_3_1__3__Impl"


    // $ANTLR start "rule__RelRea__Group_3_1__4"
    // InternalTempor.g:4403:1: rule__RelRea__Group_3_1__4 : rule__RelRea__Group_3_1__4__Impl ;
    public final void rule__RelRea__Group_3_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4407:1: ( rule__RelRea__Group_3_1__4__Impl )
            // InternalTempor.g:4408:2: rule__RelRea__Group_3_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelRea__Group_3_1__4__Impl();

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
    // $ANTLR end "rule__RelRea__Group_3_1__4"


    // $ANTLR start "rule__RelRea__Group_3_1__4__Impl"
    // InternalTempor.g:4414:1: rule__RelRea__Group_3_1__4__Impl : ( ( rule__RelRea__Group_3_1_4__0 )? ) ;
    public final void rule__RelRea__Group_3_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4418:1: ( ( ( rule__RelRea__Group_3_1_4__0 )? ) )
            // InternalTempor.g:4419:1: ( ( rule__RelRea__Group_3_1_4__0 )? )
            {
            // InternalTempor.g:4419:1: ( ( rule__RelRea__Group_3_1_4__0 )? )
            // InternalTempor.g:4420:2: ( rule__RelRea__Group_3_1_4__0 )?
            {
             before(grammarAccess.getRelReaAccess().getGroup_3_1_4()); 
            // InternalTempor.g:4421:2: ( rule__RelRea__Group_3_1_4__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==18) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalTempor.g:4421:3: rule__RelRea__Group_3_1_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RelRea__Group_3_1_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelReaAccess().getGroup_3_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__Group_3_1__4__Impl"


    // $ANTLR start "rule__RelRea__Group_3_1_4__0"
    // InternalTempor.g:4430:1: rule__RelRea__Group_3_1_4__0 : rule__RelRea__Group_3_1_4__0__Impl rule__RelRea__Group_3_1_4__1 ;
    public final void rule__RelRea__Group_3_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4434:1: ( rule__RelRea__Group_3_1_4__0__Impl rule__RelRea__Group_3_1_4__1 )
            // InternalTempor.g:4435:2: rule__RelRea__Group_3_1_4__0__Impl rule__RelRea__Group_3_1_4__1
            {
            pushFollow(FOLLOW_35);
            rule__RelRea__Group_3_1_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelRea__Group_3_1_4__1();

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
    // $ANTLR end "rule__RelRea__Group_3_1_4__0"


    // $ANTLR start "rule__RelRea__Group_3_1_4__0__Impl"
    // InternalTempor.g:4442:1: rule__RelRea__Group_3_1_4__0__Impl : ( ruleCOMMA ) ;
    public final void rule__RelRea__Group_3_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4446:1: ( ( ruleCOMMA ) )
            // InternalTempor.g:4447:1: ( ruleCOMMA )
            {
            // InternalTempor.g:4447:1: ( ruleCOMMA )
            // InternalTempor.g:4448:2: ruleCOMMA
            {
             before(grammarAccess.getRelReaAccess().getCOMMAParserRuleCall_3_1_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCOMMA();

            state._fsp--;

             after(grammarAccess.getRelReaAccess().getCOMMAParserRuleCall_3_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__Group_3_1_4__0__Impl"


    // $ANTLR start "rule__RelRea__Group_3_1_4__1"
    // InternalTempor.g:4457:1: rule__RelRea__Group_3_1_4__1 : rule__RelRea__Group_3_1_4__1__Impl ;
    public final void rule__RelRea__Group_3_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4461:1: ( rule__RelRea__Group_3_1_4__1__Impl )
            // InternalTempor.g:4462:2: rule__RelRea__Group_3_1_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelRea__Group_3_1_4__1__Impl();

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
    // $ANTLR end "rule__RelRea__Group_3_1_4__1"


    // $ANTLR start "rule__RelRea__Group_3_1_4__1__Impl"
    // InternalTempor.g:4468:1: rule__RelRea__Group_3_1_4__1__Impl : ( ( rule__RelRea__Delay_finalAssignment_3_1_4_1 ) ) ;
    public final void rule__RelRea__Group_3_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4472:1: ( ( ( rule__RelRea__Delay_finalAssignment_3_1_4_1 ) ) )
            // InternalTempor.g:4473:1: ( ( rule__RelRea__Delay_finalAssignment_3_1_4_1 ) )
            {
            // InternalTempor.g:4473:1: ( ( rule__RelRea__Delay_finalAssignment_3_1_4_1 ) )
            // InternalTempor.g:4474:2: ( rule__RelRea__Delay_finalAssignment_3_1_4_1 )
            {
             before(grammarAccess.getRelReaAccess().getDelay_finalAssignment_3_1_4_1()); 
            // InternalTempor.g:4475:2: ( rule__RelRea__Delay_finalAssignment_3_1_4_1 )
            // InternalTempor.g:4475:3: rule__RelRea__Delay_finalAssignment_3_1_4_1
            {
            pushFollow(FOLLOW_2);
            rule__RelRea__Delay_finalAssignment_3_1_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRelReaAccess().getDelay_finalAssignment_3_1_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__Group_3_1_4__1__Impl"


    // $ANTLR start "rule__Rea__Group__0"
    // InternalTempor.g:4484:1: rule__Rea__Group__0 : rule__Rea__Group__0__Impl rule__Rea__Group__1 ;
    public final void rule__Rea__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4488:1: ( rule__Rea__Group__0__Impl rule__Rea__Group__1 )
            // InternalTempor.g:4489:2: rule__Rea__Group__0__Impl rule__Rea__Group__1
            {
            pushFollow(FOLLOW_46);
            rule__Rea__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rea__Group__1();

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
    // $ANTLR end "rule__Rea__Group__0"


    // $ANTLR start "rule__Rea__Group__0__Impl"
    // InternalTempor.g:4496:1: rule__Rea__Group__0__Impl : ( () ) ;
    public final void rule__Rea__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4500:1: ( ( () ) )
            // InternalTempor.g:4501:1: ( () )
            {
            // InternalTempor.g:4501:1: ( () )
            // InternalTempor.g:4502:2: ()
            {
             before(grammarAccess.getReaAccess().getReaAction_0()); 
            // InternalTempor.g:4503:2: ()
            // InternalTempor.g:4503:3: 
            {
            }

             after(grammarAccess.getReaAccess().getReaAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rea__Group__0__Impl"


    // $ANTLR start "rule__Rea__Group__1"
    // InternalTempor.g:4511:1: rule__Rea__Group__1 : rule__Rea__Group__1__Impl rule__Rea__Group__2 ;
    public final void rule__Rea__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4515:1: ( rule__Rea__Group__1__Impl rule__Rea__Group__2 )
            // InternalTempor.g:4516:2: rule__Rea__Group__1__Impl rule__Rea__Group__2
            {
            pushFollow(FOLLOW_47);
            rule__Rea__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rea__Group__2();

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
    // $ANTLR end "rule__Rea__Group__1"


    // $ANTLR start "rule__Rea__Group__1__Impl"
    // InternalTempor.g:4523:1: rule__Rea__Group__1__Impl : ( 'reaction' ) ;
    public final void rule__Rea__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4527:1: ( ( 'reaction' ) )
            // InternalTempor.g:4528:1: ( 'reaction' )
            {
            // InternalTempor.g:4528:1: ( 'reaction' )
            // InternalTempor.g:4529:2: 'reaction'
            {
             before(grammarAccess.getReaAccess().getReactionKeyword_1()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getReaAccess().getReactionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rea__Group__1__Impl"


    // $ANTLR start "rule__Rea__Group__2"
    // InternalTempor.g:4538:1: rule__Rea__Group__2 : rule__Rea__Group__2__Impl rule__Rea__Group__3 ;
    public final void rule__Rea__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4542:1: ( rule__Rea__Group__2__Impl rule__Rea__Group__3 )
            // InternalTempor.g:4543:2: rule__Rea__Group__2__Impl rule__Rea__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Rea__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rea__Group__3();

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
    // $ANTLR end "rule__Rea__Group__2"


    // $ANTLR start "rule__Rea__Group__2__Impl"
    // InternalTempor.g:4550:1: rule__Rea__Group__2__Impl : ( 'is' ) ;
    public final void rule__Rea__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4554:1: ( ( 'is' ) )
            // InternalTempor.g:4555:1: ( 'is' )
            {
            // InternalTempor.g:4555:1: ( 'is' )
            // InternalTempor.g:4556:2: 'is'
            {
             before(grammarAccess.getReaAccess().getIsKeyword_2()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getReaAccess().getIsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rea__Group__2__Impl"


    // $ANTLR start "rule__Rea__Group__3"
    // InternalTempor.g:4565:1: rule__Rea__Group__3 : rule__Rea__Group__3__Impl ;
    public final void rule__Rea__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4569:1: ( rule__Rea__Group__3__Impl )
            // InternalTempor.g:4570:2: rule__Rea__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rea__Group__3__Impl();

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
    // $ANTLR end "rule__Rea__Group__3"


    // $ANTLR start "rule__Rea__Group__3__Impl"
    // InternalTempor.g:4576:1: rule__Rea__Group__3__Impl : ( ( rule__Rea__ReaAssignment_3 ) ) ;
    public final void rule__Rea__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4580:1: ( ( ( rule__Rea__ReaAssignment_3 ) ) )
            // InternalTempor.g:4581:1: ( ( rule__Rea__ReaAssignment_3 ) )
            {
            // InternalTempor.g:4581:1: ( ( rule__Rea__ReaAssignment_3 ) )
            // InternalTempor.g:4582:2: ( rule__Rea__ReaAssignment_3 )
            {
             before(grammarAccess.getReaAccess().getReaAssignment_3()); 
            // InternalTempor.g:4583:2: ( rule__Rea__ReaAssignment_3 )
            // InternalTempor.g:4583:3: rule__Rea__ReaAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Rea__ReaAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getReaAccess().getReaAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rea__Group__3__Impl"


    // $ANTLR start "rule__DelFin__Group__0"
    // InternalTempor.g:4592:1: rule__DelFin__Group__0 : rule__DelFin__Group__0__Impl rule__DelFin__Group__1 ;
    public final void rule__DelFin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4596:1: ( rule__DelFin__Group__0__Impl rule__DelFin__Group__1 )
            // InternalTempor.g:4597:2: rule__DelFin__Group__0__Impl rule__DelFin__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__DelFin__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DelFin__Group__1();

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
    // $ANTLR end "rule__DelFin__Group__0"


    // $ANTLR start "rule__DelFin__Group__0__Impl"
    // InternalTempor.g:4604:1: rule__DelFin__Group__0__Impl : ( () ) ;
    public final void rule__DelFin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4608:1: ( ( () ) )
            // InternalTempor.g:4609:1: ( () )
            {
            // InternalTempor.g:4609:1: ( () )
            // InternalTempor.g:4610:2: ()
            {
             before(grammarAccess.getDelFinAccess().getDelFinAction_0()); 
            // InternalTempor.g:4611:2: ()
            // InternalTempor.g:4611:3: 
            {
            }

             after(grammarAccess.getDelFinAccess().getDelFinAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelFin__Group__0__Impl"


    // $ANTLR start "rule__DelFin__Group__1"
    // InternalTempor.g:4619:1: rule__DelFin__Group__1 : rule__DelFin__Group__1__Impl ;
    public final void rule__DelFin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4623:1: ( rule__DelFin__Group__1__Impl )
            // InternalTempor.g:4624:2: rule__DelFin__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DelFin__Group__1__Impl();

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
    // $ANTLR end "rule__DelFin__Group__1"


    // $ANTLR start "rule__DelFin__Group__1__Impl"
    // InternalTempor.g:4630:1: rule__DelFin__Group__1__Impl : ( ( rule__DelFin__Alternatives_1 ) ) ;
    public final void rule__DelFin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4634:1: ( ( ( rule__DelFin__Alternatives_1 ) ) )
            // InternalTempor.g:4635:1: ( ( rule__DelFin__Alternatives_1 ) )
            {
            // InternalTempor.g:4635:1: ( ( rule__DelFin__Alternatives_1 ) )
            // InternalTempor.g:4636:2: ( rule__DelFin__Alternatives_1 )
            {
             before(grammarAccess.getDelFinAccess().getAlternatives_1()); 
            // InternalTempor.g:4637:2: ( rule__DelFin__Alternatives_1 )
            // InternalTempor.g:4637:3: rule__DelFin__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__DelFin__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getDelFinAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelFin__Group__1__Impl"


    // $ANTLR start "rule__DelFin__Group_1_0__0"
    // InternalTempor.g:4646:1: rule__DelFin__Group_1_0__0 : rule__DelFin__Group_1_0__0__Impl rule__DelFin__Group_1_0__1 ;
    public final void rule__DelFin__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4650:1: ( rule__DelFin__Group_1_0__0__Impl rule__DelFin__Group_1_0__1 )
            // InternalTempor.g:4651:2: rule__DelFin__Group_1_0__0__Impl rule__DelFin__Group_1_0__1
            {
            pushFollow(FOLLOW_48);
            rule__DelFin__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DelFin__Group_1_0__1();

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
    // $ANTLR end "rule__DelFin__Group_1_0__0"


    // $ANTLR start "rule__DelFin__Group_1_0__0__Impl"
    // InternalTempor.g:4658:1: rule__DelFin__Group_1_0__0__Impl : ( ( rule__DelFin__Group_1_0_0__0 ) ) ;
    public final void rule__DelFin__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4662:1: ( ( ( rule__DelFin__Group_1_0_0__0 ) ) )
            // InternalTempor.g:4663:1: ( ( rule__DelFin__Group_1_0_0__0 ) )
            {
            // InternalTempor.g:4663:1: ( ( rule__DelFin__Group_1_0_0__0 ) )
            // InternalTempor.g:4664:2: ( rule__DelFin__Group_1_0_0__0 )
            {
             before(grammarAccess.getDelFinAccess().getGroup_1_0_0()); 
            // InternalTempor.g:4665:2: ( rule__DelFin__Group_1_0_0__0 )
            // InternalTempor.g:4665:3: rule__DelFin__Group_1_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__DelFin__Group_1_0_0__0();

            state._fsp--;


            }

             after(grammarAccess.getDelFinAccess().getGroup_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelFin__Group_1_0__0__Impl"


    // $ANTLR start "rule__DelFin__Group_1_0__1"
    // InternalTempor.g:4673:1: rule__DelFin__Group_1_0__1 : rule__DelFin__Group_1_0__1__Impl ;
    public final void rule__DelFin__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4677:1: ( rule__DelFin__Group_1_0__1__Impl )
            // InternalTempor.g:4678:2: rule__DelFin__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DelFin__Group_1_0__1__Impl();

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
    // $ANTLR end "rule__DelFin__Group_1_0__1"


    // $ANTLR start "rule__DelFin__Group_1_0__1__Impl"
    // InternalTempor.g:4684:1: rule__DelFin__Group_1_0__1__Impl : ( ( rule__DelFin__Alternatives_1_0_1 ) ) ;
    public final void rule__DelFin__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4688:1: ( ( ( rule__DelFin__Alternatives_1_0_1 ) ) )
            // InternalTempor.g:4689:1: ( ( rule__DelFin__Alternatives_1_0_1 ) )
            {
            // InternalTempor.g:4689:1: ( ( rule__DelFin__Alternatives_1_0_1 ) )
            // InternalTempor.g:4690:2: ( rule__DelFin__Alternatives_1_0_1 )
            {
             before(grammarAccess.getDelFinAccess().getAlternatives_1_0_1()); 
            // InternalTempor.g:4691:2: ( rule__DelFin__Alternatives_1_0_1 )
            // InternalTempor.g:4691:3: rule__DelFin__Alternatives_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__DelFin__Alternatives_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getDelFinAccess().getAlternatives_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelFin__Group_1_0__1__Impl"


    // $ANTLR start "rule__DelFin__Group_1_0_0__0"
    // InternalTempor.g:4700:1: rule__DelFin__Group_1_0_0__0 : rule__DelFin__Group_1_0_0__0__Impl rule__DelFin__Group_1_0_0__1 ;
    public final void rule__DelFin__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4704:1: ( rule__DelFin__Group_1_0_0__0__Impl rule__DelFin__Group_1_0_0__1 )
            // InternalTempor.g:4705:2: rule__DelFin__Group_1_0_0__0__Impl rule__DelFin__Group_1_0_0__1
            {
            pushFollow(FOLLOW_49);
            rule__DelFin__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DelFin__Group_1_0_0__1();

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
    // $ANTLR end "rule__DelFin__Group_1_0_0__0"


    // $ANTLR start "rule__DelFin__Group_1_0_0__0__Impl"
    // InternalTempor.g:4712:1: rule__DelFin__Group_1_0_0__0__Impl : ( 'which' ) ;
    public final void rule__DelFin__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4716:1: ( ( 'which' ) )
            // InternalTempor.g:4717:1: ( 'which' )
            {
            // InternalTempor.g:4717:1: ( 'which' )
            // InternalTempor.g:4718:2: 'which'
            {
             before(grammarAccess.getDelFinAccess().getWhichKeyword_1_0_0_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getDelFinAccess().getWhichKeyword_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelFin__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__DelFin__Group_1_0_0__1"
    // InternalTempor.g:4727:1: rule__DelFin__Group_1_0_0__1 : rule__DelFin__Group_1_0_0__1__Impl rule__DelFin__Group_1_0_0__2 ;
    public final void rule__DelFin__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4731:1: ( rule__DelFin__Group_1_0_0__1__Impl rule__DelFin__Group_1_0_0__2 )
            // InternalTempor.g:4732:2: rule__DelFin__Group_1_0_0__1__Impl rule__DelFin__Group_1_0_0__2
            {
            pushFollow(FOLLOW_50);
            rule__DelFin__Group_1_0_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DelFin__Group_1_0_0__2();

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
    // $ANTLR end "rule__DelFin__Group_1_0_0__1"


    // $ANTLR start "rule__DelFin__Group_1_0_0__1__Impl"
    // InternalTempor.g:4739:1: rule__DelFin__Group_1_0_0__1__Impl : ( 'must' ) ;
    public final void rule__DelFin__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4743:1: ( ( 'must' ) )
            // InternalTempor.g:4744:1: ( 'must' )
            {
            // InternalTempor.g:4744:1: ( 'must' )
            // InternalTempor.g:4745:2: 'must'
            {
             before(grammarAccess.getDelFinAccess().getMustKeyword_1_0_0_1()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getDelFinAccess().getMustKeyword_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelFin__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__DelFin__Group_1_0_0__2"
    // InternalTempor.g:4754:1: rule__DelFin__Group_1_0_0__2 : rule__DelFin__Group_1_0_0__2__Impl ;
    public final void rule__DelFin__Group_1_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4758:1: ( rule__DelFin__Group_1_0_0__2__Impl )
            // InternalTempor.g:4759:2: rule__DelFin__Group_1_0_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DelFin__Group_1_0_0__2__Impl();

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
    // $ANTLR end "rule__DelFin__Group_1_0_0__2"


    // $ANTLR start "rule__DelFin__Group_1_0_0__2__Impl"
    // InternalTempor.g:4765:1: rule__DelFin__Group_1_0_0__2__Impl : ( 'occur' ) ;
    public final void rule__DelFin__Group_1_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4769:1: ( ( 'occur' ) )
            // InternalTempor.g:4770:1: ( 'occur' )
            {
            // InternalTempor.g:4770:1: ( 'occur' )
            // InternalTempor.g:4771:2: 'occur'
            {
             before(grammarAccess.getDelFinAccess().getOccurKeyword_1_0_0_2()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getDelFinAccess().getOccurKeyword_1_0_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelFin__Group_1_0_0__2__Impl"


    // $ANTLR start "rule__DelFin__Group_1_0_1_0__0"
    // InternalTempor.g:4781:1: rule__DelFin__Group_1_0_1_0__0 : rule__DelFin__Group_1_0_1_0__0__Impl rule__DelFin__Group_1_0_1_0__1 ;
    public final void rule__DelFin__Group_1_0_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4785:1: ( rule__DelFin__Group_1_0_1_0__0__Impl rule__DelFin__Group_1_0_1_0__1 )
            // InternalTempor.g:4786:2: rule__DelFin__Group_1_0_1_0__0__Impl rule__DelFin__Group_1_0_1_0__1
            {
            pushFollow(FOLLOW_51);
            rule__DelFin__Group_1_0_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DelFin__Group_1_0_1_0__1();

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
    // $ANTLR end "rule__DelFin__Group_1_0_1_0__0"


    // $ANTLR start "rule__DelFin__Group_1_0_1_0__0__Impl"
    // InternalTempor.g:4793:1: rule__DelFin__Group_1_0_1_0__0__Impl : ( ( rule__DelFin__DelayAssignment_1_0_1_0_0 ) ) ;
    public final void rule__DelFin__Group_1_0_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4797:1: ( ( ( rule__DelFin__DelayAssignment_1_0_1_0_0 ) ) )
            // InternalTempor.g:4798:1: ( ( rule__DelFin__DelayAssignment_1_0_1_0_0 ) )
            {
            // InternalTempor.g:4798:1: ( ( rule__DelFin__DelayAssignment_1_0_1_0_0 ) )
            // InternalTempor.g:4799:2: ( rule__DelFin__DelayAssignment_1_0_1_0_0 )
            {
             before(grammarAccess.getDelFinAccess().getDelayAssignment_1_0_1_0_0()); 
            // InternalTempor.g:4800:2: ( rule__DelFin__DelayAssignment_1_0_1_0_0 )
            // InternalTempor.g:4800:3: rule__DelFin__DelayAssignment_1_0_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__DelFin__DelayAssignment_1_0_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getDelFinAccess().getDelayAssignment_1_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelFin__Group_1_0_1_0__0__Impl"


    // $ANTLR start "rule__DelFin__Group_1_0_1_0__1"
    // InternalTempor.g:4808:1: rule__DelFin__Group_1_0_1_0__1 : rule__DelFin__Group_1_0_1_0__1__Impl ;
    public final void rule__DelFin__Group_1_0_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4812:1: ( rule__DelFin__Group_1_0_1_0__1__Impl )
            // InternalTempor.g:4813:2: rule__DelFin__Group_1_0_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DelFin__Group_1_0_1_0__1__Impl();

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
    // $ANTLR end "rule__DelFin__Group_1_0_1_0__1"


    // $ANTLR start "rule__DelFin__Group_1_0_1_0__1__Impl"
    // InternalTempor.g:4819:1: rule__DelFin__Group_1_0_1_0__1__Impl : ( ( rule__DelFin__Group_1_0_1_0_1__0 )? ) ;
    public final void rule__DelFin__Group_1_0_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4823:1: ( ( ( rule__DelFin__Group_1_0_1_0_1__0 )? ) )
            // InternalTempor.g:4824:1: ( ( rule__DelFin__Group_1_0_1_0_1__0 )? )
            {
            // InternalTempor.g:4824:1: ( ( rule__DelFin__Group_1_0_1_0_1__0 )? )
            // InternalTempor.g:4825:2: ( rule__DelFin__Group_1_0_1_0_1__0 )?
            {
             before(grammarAccess.getDelFinAccess().getGroup_1_0_1_0_1()); 
            // InternalTempor.g:4826:2: ( rule__DelFin__Group_1_0_1_0_1__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==64) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalTempor.g:4826:3: rule__DelFin__Group_1_0_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DelFin__Group_1_0_1_0_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDelFinAccess().getGroup_1_0_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelFin__Group_1_0_1_0__1__Impl"


    // $ANTLR start "rule__DelFin__Group_1_0_1_0_1__0"
    // InternalTempor.g:4835:1: rule__DelFin__Group_1_0_1_0_1__0 : rule__DelFin__Group_1_0_1_0_1__0__Impl rule__DelFin__Group_1_0_1_0_1__1 ;
    public final void rule__DelFin__Group_1_0_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4839:1: ( rule__DelFin__Group_1_0_1_0_1__0__Impl rule__DelFin__Group_1_0_1_0_1__1 )
            // InternalTempor.g:4840:2: rule__DelFin__Group_1_0_1_0_1__0__Impl rule__DelFin__Group_1_0_1_0_1__1
            {
            pushFollow(FOLLOW_13);
            rule__DelFin__Group_1_0_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DelFin__Group_1_0_1_0_1__1();

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
    // $ANTLR end "rule__DelFin__Group_1_0_1_0_1__0"


    // $ANTLR start "rule__DelFin__Group_1_0_1_0_1__0__Impl"
    // InternalTempor.g:4847:1: rule__DelFin__Group_1_0_1_0_1__0__Impl : ( 'from' ) ;
    public final void rule__DelFin__Group_1_0_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4851:1: ( ( 'from' ) )
            // InternalTempor.g:4852:1: ( 'from' )
            {
            // InternalTempor.g:4852:1: ( 'from' )
            // InternalTempor.g:4853:2: 'from'
            {
             before(grammarAccess.getDelFinAccess().getFromKeyword_1_0_1_0_1_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getDelFinAccess().getFromKeyword_1_0_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelFin__Group_1_0_1_0_1__0__Impl"


    // $ANTLR start "rule__DelFin__Group_1_0_1_0_1__1"
    // InternalTempor.g:4862:1: rule__DelFin__Group_1_0_1_0_1__1 : rule__DelFin__Group_1_0_1_0_1__1__Impl ;
    public final void rule__DelFin__Group_1_0_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4866:1: ( rule__DelFin__Group_1_0_1_0_1__1__Impl )
            // InternalTempor.g:4867:2: rule__DelFin__Group_1_0_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DelFin__Group_1_0_1_0_1__1__Impl();

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
    // $ANTLR end "rule__DelFin__Group_1_0_1_0_1__1"


    // $ANTLR start "rule__DelFin__Group_1_0_1_0_1__1__Impl"
    // InternalTempor.g:4873:1: rule__DelFin__Group_1_0_1_0_1__1__Impl : ( ( rule__DelFin__FinAssignment_1_0_1_0_1_1 ) ) ;
    public final void rule__DelFin__Group_1_0_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4877:1: ( ( ( rule__DelFin__FinAssignment_1_0_1_0_1_1 ) ) )
            // InternalTempor.g:4878:1: ( ( rule__DelFin__FinAssignment_1_0_1_0_1_1 ) )
            {
            // InternalTempor.g:4878:1: ( ( rule__DelFin__FinAssignment_1_0_1_0_1_1 ) )
            // InternalTempor.g:4879:2: ( rule__DelFin__FinAssignment_1_0_1_0_1_1 )
            {
             before(grammarAccess.getDelFinAccess().getFinAssignment_1_0_1_0_1_1()); 
            // InternalTempor.g:4880:2: ( rule__DelFin__FinAssignment_1_0_1_0_1_1 )
            // InternalTempor.g:4880:3: rule__DelFin__FinAssignment_1_0_1_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DelFin__FinAssignment_1_0_1_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDelFinAccess().getFinAssignment_1_0_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelFin__Group_1_0_1_0_1__1__Impl"


    // $ANTLR start "rule__DelFin__Group_1_0_1_1__0"
    // InternalTempor.g:4889:1: rule__DelFin__Group_1_0_1_1__0 : rule__DelFin__Group_1_0_1_1__0__Impl rule__DelFin__Group_1_0_1_1__1 ;
    public final void rule__DelFin__Group_1_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4893:1: ( rule__DelFin__Group_1_0_1_1__0__Impl rule__DelFin__Group_1_0_1_1__1 )
            // InternalTempor.g:4894:2: rule__DelFin__Group_1_0_1_1__0__Impl rule__DelFin__Group_1_0_1_1__1
            {
            pushFollow(FOLLOW_48);
            rule__DelFin__Group_1_0_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DelFin__Group_1_0_1_1__1();

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
    // $ANTLR end "rule__DelFin__Group_1_0_1_1__0"


    // $ANTLR start "rule__DelFin__Group_1_0_1_1__0__Impl"
    // InternalTempor.g:4901:1: rule__DelFin__Group_1_0_1_1__0__Impl : ( ( rule__DelFin__ImmAssignment_1_0_1_1_0 )? ) ;
    public final void rule__DelFin__Group_1_0_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4905:1: ( ( ( rule__DelFin__ImmAssignment_1_0_1_1_0 )? ) )
            // InternalTempor.g:4906:1: ( ( rule__DelFin__ImmAssignment_1_0_1_1_0 )? )
            {
            // InternalTempor.g:4906:1: ( ( rule__DelFin__ImmAssignment_1_0_1_1_0 )? )
            // InternalTempor.g:4907:2: ( rule__DelFin__ImmAssignment_1_0_1_1_0 )?
            {
             before(grammarAccess.getDelFinAccess().getImmAssignment_1_0_1_1_0()); 
            // InternalTempor.g:4908:2: ( rule__DelFin__ImmAssignment_1_0_1_1_0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==67) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalTempor.g:4908:3: rule__DelFin__ImmAssignment_1_0_1_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DelFin__ImmAssignment_1_0_1_1_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDelFinAccess().getImmAssignment_1_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelFin__Group_1_0_1_1__0__Impl"


    // $ANTLR start "rule__DelFin__Group_1_0_1_1__1"
    // InternalTempor.g:4916:1: rule__DelFin__Group_1_0_1_1__1 : rule__DelFin__Group_1_0_1_1__1__Impl rule__DelFin__Group_1_0_1_1__2 ;
    public final void rule__DelFin__Group_1_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4920:1: ( rule__DelFin__Group_1_0_1_1__1__Impl rule__DelFin__Group_1_0_1_1__2 )
            // InternalTempor.g:4921:2: rule__DelFin__Group_1_0_1_1__1__Impl rule__DelFin__Group_1_0_1_1__2
            {
            pushFollow(FOLLOW_13);
            rule__DelFin__Group_1_0_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DelFin__Group_1_0_1_1__2();

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
    // $ANTLR end "rule__DelFin__Group_1_0_1_1__1"


    // $ANTLR start "rule__DelFin__Group_1_0_1_1__1__Impl"
    // InternalTempor.g:4928:1: rule__DelFin__Group_1_0_1_1__1__Impl : ( 'after' ) ;
    public final void rule__DelFin__Group_1_0_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4932:1: ( ( 'after' ) )
            // InternalTempor.g:4933:1: ( 'after' )
            {
            // InternalTempor.g:4933:1: ( 'after' )
            // InternalTempor.g:4934:2: 'after'
            {
             before(grammarAccess.getDelFinAccess().getAfterKeyword_1_0_1_1_1()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getDelFinAccess().getAfterKeyword_1_0_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelFin__Group_1_0_1_1__1__Impl"


    // $ANTLR start "rule__DelFin__Group_1_0_1_1__2"
    // InternalTempor.g:4943:1: rule__DelFin__Group_1_0_1_1__2 : rule__DelFin__Group_1_0_1_1__2__Impl ;
    public final void rule__DelFin__Group_1_0_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4947:1: ( rule__DelFin__Group_1_0_1_1__2__Impl )
            // InternalTempor.g:4948:2: rule__DelFin__Group_1_0_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DelFin__Group_1_0_1_1__2__Impl();

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
    // $ANTLR end "rule__DelFin__Group_1_0_1_1__2"


    // $ANTLR start "rule__DelFin__Group_1_0_1_1__2__Impl"
    // InternalTempor.g:4954:1: rule__DelFin__Group_1_0_1_1__2__Impl : ( ( rule__DelFin__FinAssignment_1_0_1_1_2 ) ) ;
    public final void rule__DelFin__Group_1_0_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4958:1: ( ( ( rule__DelFin__FinAssignment_1_0_1_1_2 ) ) )
            // InternalTempor.g:4959:1: ( ( rule__DelFin__FinAssignment_1_0_1_1_2 ) )
            {
            // InternalTempor.g:4959:1: ( ( rule__DelFin__FinAssignment_1_0_1_1_2 ) )
            // InternalTempor.g:4960:2: ( rule__DelFin__FinAssignment_1_0_1_1_2 )
            {
             before(grammarAccess.getDelFinAccess().getFinAssignment_1_0_1_1_2()); 
            // InternalTempor.g:4961:2: ( rule__DelFin__FinAssignment_1_0_1_1_2 )
            // InternalTempor.g:4961:3: rule__DelFin__FinAssignment_1_0_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__DelFin__FinAssignment_1_0_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getDelFinAccess().getFinAssignment_1_0_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelFin__Group_1_0_1_1__2__Impl"


    // $ANTLR start "rule__Delay__Group__0"
    // InternalTempor.g:4970:1: rule__Delay__Group__0 : rule__Delay__Group__0__Impl rule__Delay__Group__1 ;
    public final void rule__Delay__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4974:1: ( rule__Delay__Group__0__Impl rule__Delay__Group__1 )
            // InternalTempor.g:4975:2: rule__Delay__Group__0__Impl rule__Delay__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Delay__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delay__Group__1();

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
    // $ANTLR end "rule__Delay__Group__0"


    // $ANTLR start "rule__Delay__Group__0__Impl"
    // InternalTempor.g:4982:1: rule__Delay__Group__0__Impl : ( 'within' ) ;
    public final void rule__Delay__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:4986:1: ( ( 'within' ) )
            // InternalTempor.g:4987:1: ( 'within' )
            {
            // InternalTempor.g:4987:1: ( 'within' )
            // InternalTempor.g:4988:2: 'within'
            {
             before(grammarAccess.getDelayAccess().getWithinKeyword_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getDelayAccess().getWithinKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delay__Group__0__Impl"


    // $ANTLR start "rule__Delay__Group__1"
    // InternalTempor.g:4997:1: rule__Delay__Group__1 : rule__Delay__Group__1__Impl rule__Delay__Group__2 ;
    public final void rule__Delay__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:5001:1: ( rule__Delay__Group__1__Impl rule__Delay__Group__2 )
            // InternalTempor.g:5002:2: rule__Delay__Group__1__Impl rule__Delay__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Delay__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delay__Group__2();

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
    // $ANTLR end "rule__Delay__Group__1"


    // $ANTLR start "rule__Delay__Group__1__Impl"
    // InternalTempor.g:5009:1: rule__Delay__Group__1__Impl : ( () ) ;
    public final void rule__Delay__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:5013:1: ( ( () ) )
            // InternalTempor.g:5014:1: ( () )
            {
            // InternalTempor.g:5014:1: ( () )
            // InternalTempor.g:5015:2: ()
            {
             before(grammarAccess.getDelayAccess().getDelayAction_1()); 
            // InternalTempor.g:5016:2: ()
            // InternalTempor.g:5016:3: 
            {
            }

             after(grammarAccess.getDelayAccess().getDelayAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delay__Group__1__Impl"


    // $ANTLR start "rule__Delay__Group__2"
    // InternalTempor.g:5024:1: rule__Delay__Group__2 : rule__Delay__Group__2__Impl ;
    public final void rule__Delay__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:5028:1: ( rule__Delay__Group__2__Impl )
            // InternalTempor.g:5029:2: rule__Delay__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Delay__Group__2__Impl();

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
    // $ANTLR end "rule__Delay__Group__2"


    // $ANTLR start "rule__Delay__Group__2__Impl"
    // InternalTempor.g:5035:1: rule__Delay__Group__2__Impl : ( ( rule__Delay__DelAssignment_2 ) ) ;
    public final void rule__Delay__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:5039:1: ( ( ( rule__Delay__DelAssignment_2 ) ) )
            // InternalTempor.g:5040:1: ( ( rule__Delay__DelAssignment_2 ) )
            {
            // InternalTempor.g:5040:1: ( ( rule__Delay__DelAssignment_2 ) )
            // InternalTempor.g:5041:2: ( rule__Delay__DelAssignment_2 )
            {
             before(grammarAccess.getDelayAccess().getDelAssignment_2()); 
            // InternalTempor.g:5042:2: ( rule__Delay__DelAssignment_2 )
            // InternalTempor.g:5042:3: rule__Delay__DelAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Delay__DelAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDelayAccess().getDelAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delay__Group__2__Impl"


    // $ANTLR start "rule__Model__DeclVarInputAssignment_0"
    // InternalTempor.g:5051:1: rule__Model__DeclVarInputAssignment_0 : ( ruleDeclVarInput ) ;
    public final void rule__Model__DeclVarInputAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:5055:1: ( ( ruleDeclVarInput ) )
            // InternalTempor.g:5056:2: ( ruleDeclVarInput )
            {
            // InternalTempor.g:5056:2: ( ruleDeclVarInput )
            // InternalTempor.g:5057:3: ruleDeclVarInput
            {
             before(grammarAccess.getModelAccess().getDeclVarInputDeclVarInputParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDeclVarInput();

            state._fsp--;

             after(grammarAccess.getModelAccess().getDeclVarInputDeclVarInputParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__DeclVarInputAssignment_0"


    // $ANTLR start "rule__Model__DeclVarOutputAssignment_1"
    // InternalTempor.g:5066:1: rule__Model__DeclVarOutputAssignment_1 : ( ruleDeclVarOutput ) ;
    public final void rule__Model__DeclVarOutputAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:5070:1: ( ( ruleDeclVarOutput ) )
            // InternalTempor.g:5071:2: ( ruleDeclVarOutput )
            {
            // InternalTempor.g:5071:2: ( ruleDeclVarOutput )
            // InternalTempor.g:5072:3: ruleDeclVarOutput
            {
             before(grammarAccess.getModelAccess().getDeclVarOutputDeclVarOutputParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDeclVarOutput();

            state._fsp--;

             after(grammarAccess.getModelAccess().getDeclVarOutputDeclVarOutputParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__DeclVarOutputAssignment_1"


    // $ANTLR start "rule__Model__SentDeclarationAssignment_2"
    // InternalTempor.g:5081:1: rule__Model__SentDeclarationAssignment_2 : ( ruleSentDeclaration ) ;
    public final void rule__Model__SentDeclarationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:5085:1: ( ( ruleSentDeclaration ) )
            // InternalTempor.g:5086:2: ( ruleSentDeclaration )
            {
            // InternalTempor.g:5086:2: ( ruleSentDeclaration )
            // InternalTempor.g:5087:3: ruleSentDeclaration
            {
             before(grammarAccess.getModelAccess().getSentDeclarationSentDeclarationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSentDeclaration();

            state._fsp--;

             after(grammarAccess.getModelAccess().getSentDeclarationSentDeclarationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__SentDeclarationAssignment_2"


    // $ANTLR start "rule__Model__ReqDeclarationAssignment_3"
    // InternalTempor.g:5096:1: rule__Model__ReqDeclarationAssignment_3 : ( ruleReqDeclaration ) ;
    public final void rule__Model__ReqDeclarationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:5100:1: ( ( ruleReqDeclaration ) )
            // InternalTempor.g:5101:2: ( ruleReqDeclaration )
            {
            // InternalTempor.g:5101:2: ( ruleReqDeclaration )
            // InternalTempor.g:5102:3: ruleReqDeclaration
            {
             before(grammarAccess.getModelAccess().getReqDeclarationReqDeclarationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleReqDeclaration();

            state._fsp--;

             after(grammarAccess.getModelAccess().getReqDeclarationReqDeclarationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ReqDeclarationAssignment_3"


    // $ANTLR start "rule__DeclVarInput__VarDeclsAssignment_2_0"
    // InternalTempor.g:5111:1: rule__DeclVarInput__VarDeclsAssignment_2_0 : ( ruleVarDeclaration ) ;
    public final void rule__DeclVarInput__VarDeclsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:5115:1: ( ( ruleVarDeclaration ) )
            // InternalTempor.g:5116:2: ( ruleVarDeclaration )
            {
            // InternalTempor.g:5116:2: ( ruleVarDeclaration )
            // InternalTempor.g:5117:3: ruleVarDeclaration
            {
             before(grammarAccess.getDeclVarInputAccess().getVarDeclsVarDeclarationParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVarDeclaration();

            state._fsp--;

             after(grammarAccess.getDeclVarInputAccess().getVarDeclsVarDeclarationParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclVarInput__VarDeclsAssignment_2_0"


    // $ANTLR start "rule__DeclVarOutput__VarDeclsAssignment_2_0"
    // InternalTempor.g:5126:1: rule__DeclVarOutput__VarDeclsAssignment_2_0 : ( ruleVarDeclaration ) ;
    public final void rule__DeclVarOutput__VarDeclsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:5130:1: ( ( ruleVarDeclaration ) )
            // InternalTempor.g:5131:2: ( ruleVarDeclaration )
            {
            // InternalTempor.g:5131:2: ( ruleVarDeclaration )
            // InternalTempor.g:5132:3: ruleVarDeclaration
            {
             before(grammarAccess.getDeclVarOutputAccess().getVarDeclsVarDeclarationParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVarDeclaration();

            state._fsp--;

             after(grammarAccess.getDeclVarOutputAccess().getVarDeclsVarDeclarationParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclVarOutput__VarDeclsAssignment_2_0"


    // $ANTLR start "rule__VarDeclaration__NameAssignment_0"
    // InternalTempor.g:5141:1: rule__VarDeclaration__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__VarDeclaration__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:5145:1: ( ( RULE_ID ) )
            // InternalTempor.g:5146:2: ( RULE_ID )
            {
            // InternalTempor.g:5146:2: ( RULE_ID )
            // InternalTempor.g:5147:3: RULE_ID
            {
             before(grammarAccess.getVarDeclarationAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVarDeclarationAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__NameAssignment_0"


    // $ANTLR start "rule__VarDeclaration__TypeAssignment_2"
    // InternalTempor.g:5156:1: rule__VarDeclaration__TypeAssignment_2 : ( ruleVariableType ) ;
    public final void rule__VarDeclaration__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:5160:1: ( ( ruleVariableType ) )
            // InternalTempor.g:5161:2: ( ruleVariableType )
            {
            // InternalTempor.g:5161:2: ( ruleVariableType )
            // InternalTempor.g:5162:3: ruleVariableType
            {
             before(grammarAccess.getVarDeclarationAccess().getTypeVariableTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVariableType();

            state._fsp--;

             after(grammarAccess.getVarDeclarationAccess().getTypeVariableTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__TypeAssignment_2"


    // $ANTLR start "rule__SentDeclaration__DeclarationNameAssignment_2"
    // InternalTempor.g:5171:1: rule__SentDeclaration__DeclarationNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__SentDeclaration__DeclarationNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:5175:1: ( ( RULE_ID ) )
            // InternalTempor.g:5176:2: ( RULE_ID )
            {
            // InternalTempor.g:5176:2: ( RULE_ID )
            // InternalTempor.g:5177:3: RULE_ID
            {
             before(grammarAccess.getSentDeclarationAccess().getDeclarationNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSentDeclarationAccess().getDeclarationNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentDeclaration__DeclarationNameAssignment_2"


    // $ANTLR start "rule__SentDeclaration__SentenceDeclarationAssignment_3"
    // InternalTempor.g:5186:1: rule__SentDeclaration__SentenceDeclarationAssignment_3 : ( ruleSentenceDeclaration ) ;
    public final void rule__SentDeclaration__SentenceDeclarationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:5190:1: ( ( ruleSentenceDeclaration ) )
            // InternalTempor.g:5191:2: ( ruleSentenceDeclaration )
            {
            // InternalTempor.g:5191:2: ( ruleSentenceDeclaration )
            // InternalTempor.g:5192:3: ruleSentenceDeclaration
            {
             before(grammarAccess.getSentDeclarationAccess().getSentenceDeclarationSentenceDeclarationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSentenceDeclaration();

            state._fsp--;

             after(grammarAccess.getSentDeclarationAccess().getSentenceDeclarationSentenceDeclarationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentDeclaration__SentenceDeclarationAssignment_3"


    // $ANTLR start "rule__SentenceDeclaration__NameAssignment_1"
    // InternalTempor.g:5201:1: rule__SentenceDeclaration__NameAssignment_1 : ( ruleSentence ) ;
    public final void rule__SentenceDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:5205:1: ( ( ruleSentence ) )
            // InternalTempor.g:5206:2: ( ruleSentence )
            {
            // InternalTempor.g:5206:2: ( ruleSentence )
            // InternalTempor.g:5207:3: ruleSentence
            {
             before(grammarAccess.getSentenceDeclarationAccess().getNameSentenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getSentenceDeclarationAccess().getNameSentenceParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentenceDeclaration__NameAssignment_1"


    // $ANTLR start "rule__SentenceDeclaration__LogicExpressionAssignment_3"
    // InternalTempor.g:5216:1: rule__SentenceDeclaration__LogicExpressionAssignment_3 : ( ruleExpression ) ;
    public final void rule__SentenceDeclaration__LogicExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:5220:1: ( ( ruleExpression ) )
            // InternalTempor.g:5221:2: ( ruleExpression )
            {
            // InternalTempor.g:5221:2: ( ruleExpression )
            // InternalTempor.g:5222:3: ruleExpression
            {
             before(grammarAccess.getSentenceDeclarationAccess().getLogicExpressionExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getSentenceDeclarationAccess().getLogicExpressionExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentenceDeclaration__LogicExpressionAssignment_3"


    // $ANTLR start "rule__Expression__OrOpAssignment_1_1"
    // InternalTempor.g:5231:1: rule__Expression__OrOpAssignment_1_1 : ( RULE_OR_OPERATOR ) ;
    public final void rule__Expression__OrOpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:5235:1: ( ( RULE_OR_OPERATOR ) )
            // InternalTempor.g:5236:2: ( RULE_OR_OPERATOR )
            {
            // InternalTempor.g:5236:2: ( RULE_OR_OPERATOR )
            // InternalTempor.g:5237:3: RULE_OR_OPERATOR
            {
             before(grammarAccess.getExpressionAccess().getOrOpOR_OPERATORTerminalRuleCall_1_1_0()); 
            match(input,RULE_OR_OPERATOR,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getOrOpOR_OPERATORTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__OrOpAssignment_1_1"


    // $ANTLR start "rule__Expression__RightAssignment_1_2"
    // InternalTempor.g:5246:1: rule__Expression__RightAssignment_1_2 : ( ruleXorExpression ) ;
    public final void rule__Expression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:5250:1: ( ( ruleXorExpression ) )
            // InternalTempor.g:5251:2: ( ruleXorExpression )
            {
            // InternalTempor.g:5251:2: ( ruleXorExpression )
            // InternalTempor.g:5252:3: ruleXorExpression
            {
             before(grammarAccess.getExpressionAccess().getRightXorExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleXorExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getRightXorExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__RightAssignment_1_2"


    // $ANTLR start "rule__XorExpression__RightAssignment_1_2"
    // InternalTempor.g:5261:1: rule__XorExpression__RightAssignment_1_2 : ( ruleAndExpression ) ;
    public final void rule__XorExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:5265:1: ( ( ruleAndExpression ) )
            // InternalTempor.g:5266:2: ( ruleAndExpression )
            {
            // InternalTempor.g:5266:2: ( ruleAndExpression )
            // InternalTempor.g:5267:3: ruleAndExpression
            {
             before(grammarAccess.getXorExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getXorExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpression__RightAssignment_1_2"


    // $ANTLR start "rule__AndExpression__AndOpAssignment_1_1"
    // InternalTempor.g:5276:1: rule__AndExpression__AndOpAssignment_1_1 : ( ruleAND_OPERATOR ) ;
    public final void rule__AndExpression__AndOpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:5280:1: ( ( ruleAND_OPERATOR ) )
            // InternalTempor.g:5281:2: ( ruleAND_OPERATOR )
            {
            // InternalTempor.g:5281:2: ( ruleAND_OPERATOR )
            // InternalTempor.g:5282:3: ruleAND_OPERATOR
            {
             before(grammarAccess.getAndExpressionAccess().getAndOpAND_OPERATORParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAND_OPERATOR();

            state._fsp--;

             after(grammarAccess.getAndExpressionAccess().getAndOpAND_OPERATORParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__AndOpAssignment_1_1"


    // $ANTLR start "rule__AndExpression__RightAssignment_1_2"
    // InternalTempor.g:5291:1: rule__AndExpression__RightAssignment_1_2 : ( ruleCompExpression ) ;
    public final void rule__AndExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:5295:1: ( ( ruleCompExpression ) )
            // InternalTempor.g:5296:2: ( ruleCompExpression )
            {
            // InternalTempor.g:5296:2: ( ruleCompExpression )
            // InternalTempor.g:5297:3: ruleCompExpression
            {
             before(grammarAccess.getAndExpressionAccess().getRightCompExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCompExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionAccess().getRightCompExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__RightAssignment_1_2"


    // $ANTLR start "rule__CompExpression__CompOpAssignment_1_1"
    // InternalTempor.g:5306:1: rule__CompExpression__CompOpAssignment_1_1 : ( ruleCompOperator ) ;
    public final void rule__CompExpression__CompOpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:5310:1: ( ( ruleCompOperator ) )
            // InternalTempor.g:5311:2: ( ruleCompOperator )
            {
            // InternalTempor.g:5311:2: ( ruleCompOperator )
            // InternalTempor.g:5312:3: ruleCompOperator
            {
             before(grammarAccess.getCompExpressionAccess().getCompOpCompOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCompOperator();

            state._fsp--;

             after(grammarAccess.getCompExpressionAccess().getCompOpCompOperatorEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompExpression__CompOpAssignment_1_1"


    // $ANTLR start "rule__CompExpression__RightAssignment_1_2"
    // InternalTempor.g:5321:1: rule__CompExpression__RightAssignment_1_2 : ( ruleAndExpression ) ;
    public final void rule__CompExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:5325:1: ( ( ruleAndExpression ) )
            // InternalTempor.g:5326:2: ( ruleAndExpression )
            {
            // InternalTempor.g:5326:2: ( ruleAndExpression )
            // InternalTempor.g:5327:3: ruleAndExpression
            {
             before(grammarAccess.getCompExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getCompExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompExpression__RightAssignment_1_2"


    // $ANTLR start "rule__EquExpression__EquOpAssignment_1_1"
    // InternalTempor.g:5336:1: rule__EquExpression__EquOpAssignment_1_1 : ( ruleEquOperator ) ;
    public final void rule__EquExpression__EquOpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:5340:1: ( ( ruleEquOperator ) )
            // InternalTempor.g:5341:2: ( ruleEquOperator )
            {
            // InternalTempor.g:5341:2: ( ruleEquOperator )
            // InternalTempor.g:5342:3: ruleEquOperator
            {
             before(grammarAccess.getEquExpressionAccess().getEquOpEquOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEquOperator();

            state._fsp--;

             after(grammarAccess.getEquExpressionAccess().getEquOpEquOperatorEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EquExpression__EquOpAssignment_1_1"


    // $ANTLR start "rule__EquExpression__RightAssignment_1_2"
    // InternalTempor.g:5351:1: rule__EquExpression__RightAssignment_1_2 : ( ruleUnExpression ) ;
    public final void rule__EquExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:5355:1: ( ( ruleUnExpression ) )
            // InternalTempor.g:5356:2: ( ruleUnExpression )
            {
            // InternalTempor.g:5356:2: ( ruleUnExpression )
            // InternalTempor.g:5357:3: ruleUnExpression
            {
             before(grammarAccess.getEquExpressionAccess().getRightUnExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUnExpression();

            state._fsp--;

             after(grammarAccess.getEquExpressionAccess().getRightUnExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EquExpression__RightAssignment_1_2"


    // $ANTLR start "rule__UnExpression__UnOpAssignment_1_0"
    // InternalTempor.g:5366:1: rule__UnExpression__UnOpAssignment_1_0 : ( ruleUnOperator ) ;
    public final void rule__UnExpression__UnOpAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:5370:1: ( ( ruleUnOperator ) )
            // InternalTempor.g:5371:2: ( ruleUnOperator )
            {
            // InternalTempor.g:5371:2: ( ruleUnOperator )
            // InternalTempor.g:5372:3: ruleUnOperator
            {
             before(grammarAccess.getUnExpressionAccess().getUnOpUnOperatorParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleUnOperator();

            state._fsp--;

             after(grammarAccess.getUnExpressionAccess().getUnOpUnOperatorParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnExpression__UnOpAssignment_1_0"


    // $ANTLR start "rule__UnExpression__RightAssignment_1_1"
    // InternalTempor.g:5381:1: rule__UnExpression__RightAssignment_1_1 : ( rulePrimaryExpression ) ;
    public final void rule__UnExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:5385:1: ( ( rulePrimaryExpression ) )
            // InternalTempor.g:5386:2: ( rulePrimaryExpression )
            {
            // InternalTempor.g:5386:2: ( rulePrimaryExpression )
            // InternalTempor.g:5387:3: rulePrimaryExpression
            {
             before(grammarAccess.getUnExpressionAccess().getRightPrimaryExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getUnExpressionAccess().getRightPrimaryExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnExpression__RightAssignment_1_1"


    // $ANTLR start "rule__TauExpression__TimeAssignment_2"
    // InternalTempor.g:5396:1: rule__TauExpression__TimeAssignment_2 : ( ruleTimeLiteral ) ;
    public final void rule__TauExpression__TimeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:5400:1: ( ( ruleTimeLiteral ) )
            // InternalTempor.g:5401:2: ( ruleTimeLiteral )
            {
            // InternalTempor.g:5401:2: ( ruleTimeLiteral )
            // InternalTempor.g:5402:3: ruleTimeLiteral
            {
             before(grammarAccess.getTauExpressionAccess().getTimeTimeLiteralParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTimeLiteral();

            state._fsp--;

             after(grammarAccess.getTauExpressionAccess().getTimeTimeLiteralParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TauExpression__TimeAssignment_2"


    // $ANTLR start "rule__TimeLiteral__IntervalAssignment_1"
    // InternalTempor.g:5411:1: rule__TimeLiteral__IntervalAssignment_1 : ( RULE_INTERVAL ) ;
    public final void rule__TimeLiteral__IntervalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:5415:1: ( ( RULE_INTERVAL ) )
            // InternalTempor.g:5416:2: ( RULE_INTERVAL )
            {
            // InternalTempor.g:5416:2: ( RULE_INTERVAL )
            // InternalTempor.g:5417:3: RULE_INTERVAL
            {
             before(grammarAccess.getTimeLiteralAccess().getIntervalINTERVALTerminalRuleCall_1_0()); 
            match(input,RULE_INTERVAL,FOLLOW_2); 
             after(grammarAccess.getTimeLiteralAccess().getIntervalINTERVALTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeLiteral__IntervalAssignment_1"


    // $ANTLR start "rule__PrimaryExpression__NameAssignment_0"
    // InternalTempor.g:5426:1: rule__PrimaryExpression__NameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__PrimaryExpression__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:5430:1: ( ( ( RULE_ID ) ) )
            // InternalTempor.g:5431:2: ( ( RULE_ID ) )
            {
            // InternalTempor.g:5431:2: ( ( RULE_ID ) )
            // InternalTempor.g:5432:3: ( RULE_ID )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getNameVarDeclarationCrossReference_0_0()); 
            // InternalTempor.g:5433:3: ( RULE_ID )
            // InternalTempor.g:5434:4: RULE_ID
            {
             before(grammarAccess.getPrimaryExpressionAccess().getNameVarDeclarationIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getNameVarDeclarationIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getPrimaryExpressionAccess().getNameVarDeclarationCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__NameAssignment_0"


    // $ANTLR start "rule__PrimaryExpression__ConstantAssignment_1"
    // InternalTempor.g:5445:1: rule__PrimaryExpression__ConstantAssignment_1 : ( ruleConstant ) ;
    public final void rule__PrimaryExpression__ConstantAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:5449:1: ( ( ruleConstant ) )
            // InternalTempor.g:5450:2: ( ruleConstant )
            {
            // InternalTempor.g:5450:2: ( ruleConstant )
            // InternalTempor.g:5451:3: ruleConstant
            {
             before(grammarAccess.getPrimaryExpressionAccess().getConstantConstantParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConstant();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getConstantConstantParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__ConstantAssignment_1"


    // $ANTLR start "rule__PrimaryExpression__TauAssignment_2"
    // InternalTempor.g:5460:1: rule__PrimaryExpression__TauAssignment_2 : ( ruleTauExpression ) ;
    public final void rule__PrimaryExpression__TauAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:5464:1: ( ( ruleTauExpression ) )
            // InternalTempor.g:5465:2: ( ruleTauExpression )
            {
            // InternalTempor.g:5465:2: ( ruleTauExpression )
            // InternalTempor.g:5466:3: ruleTauExpression
            {
             before(grammarAccess.getPrimaryExpressionAccess().getTauTauExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTauExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getTauTauExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__TauAssignment_2"


    // $ANTLR start "rule__PrimaryExpression__NestExprAssignment_3_1"
    // InternalTempor.g:5475:1: rule__PrimaryExpression__NestExprAssignment_3_1 : ( ruleExpression ) ;
    public final void rule__PrimaryExpression__NestExprAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:5479:1: ( ( ruleExpression ) )
            // InternalTempor.g:5480:2: ( ruleExpression )
            {
            // InternalTempor.g:5480:2: ( ruleExpression )
            // InternalTempor.g:5481:3: ruleExpression
            {
             before(grammarAccess.getPrimaryExpressionAccess().getNestExprExpressionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getNestExprExpressionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__NestExprAssignment_3_1"


    // $ANTLR start "rule__ReqDeclaration__NameAssignment_1"
    // InternalTempor.g:5490:1: rule__ReqDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ReqDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:5494:1: ( ( RULE_ID ) )
            // InternalTempor.g:5495:2: ( RULE_ID )
            {
            // InternalTempor.g:5495:2: ( RULE_ID )
            // InternalTempor.g:5496:3: RULE_ID
            {
             before(grammarAccess.getReqDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReqDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReqDeclaration__NameAssignment_1"


    // $ANTLR start "rule__ReqDeclaration__RequirementAssignment_2"
    // InternalTempor.g:5505:1: rule__ReqDeclaration__RequirementAssignment_2 : ( ruleRequirement ) ;
    public final void rule__ReqDeclaration__RequirementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:5509:1: ( ( ruleRequirement ) )
            // InternalTempor.g:5510:2: ( ruleRequirement )
            {
            // InternalTempor.g:5510:2: ( ruleRequirement )
            // InternalTempor.g:5511:3: ruleRequirement
            {
             before(grammarAccess.getReqDeclarationAccess().getRequirementRequirementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRequirement();

            state._fsp--;

             after(grammarAccess.getReqDeclarationAccess().getRequirementRequirementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReqDeclaration__RequirementAssignment_2"


    // $ANTLR start "rule__Requirement__TriggerAssignment_0_0"
    // InternalTempor.g:5520:1: rule__Requirement__TriggerAssignment_0_0 : ( ruleTrig ) ;
    public final void rule__Requirement__TriggerAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:5524:1: ( ( ruleTrig ) )
            // InternalTempor.g:5525:2: ( ruleTrig )
            {
            // InternalTempor.g:5525:2: ( ruleTrig )
            // InternalTempor.g:5526:3: ruleTrig
            {
             before(grammarAccess.getRequirementAccess().getTriggerTrigParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTrig();

            state._fsp--;

             after(grammarAccess.getRequirementAccess().getTriggerTrigParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__TriggerAssignment_0_0"


    // $ANTLR start "rule__Requirement__InvariantAssignment_0_1"
    // InternalTempor.g:5535:1: rule__Requirement__InvariantAssignment_0_1 : ( ruleInv_always ) ;
    public final void rule__Requirement__InvariantAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:5539:1: ( ( ruleInv_always ) )
            // InternalTempor.g:5540:2: ( ruleInv_always )
            {
            // InternalTempor.g:5540:2: ( ruleInv_always )
            // InternalTempor.g:5541:3: ruleInv_always
            {
             before(grammarAccess.getRequirementAccess().getInvariantInv_alwaysParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInv_always();

            state._fsp--;

             after(grammarAccess.getRequirementAccess().getInvariantInv_alwaysParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__InvariantAssignment_0_1"


    // $ANTLR start "rule__Trig__NameAssignment_0_0_1"
    // InternalTempor.g:5550:1: rule__Trig__NameAssignment_0_0_1 : ( ( ruleSentence ) ) ;
    public final void rule__Trig__NameAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:5554:1: ( ( ( ruleSentence ) ) )
            // InternalTempor.g:5555:2: ( ( ruleSentence ) )
            {
            // InternalTempor.g:5555:2: ( ( ruleSentence ) )
            // InternalTempor.g:5556:3: ( ruleSentence )
            {
             before(grammarAccess.getTrigAccess().getNameSentenceDeclarationCrossReference_0_0_1_0()); 
            // InternalTempor.g:5557:3: ( ruleSentence )
            // InternalTempor.g:5558:4: ruleSentence
            {
             before(grammarAccess.getTrigAccess().getNameSentenceDeclarationSentenceParserRuleCall_0_0_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getTrigAccess().getNameSentenceDeclarationSentenceParserRuleCall_0_0_1_0_1()); 

            }

             after(grammarAccess.getTrigAccess().getNameSentenceDeclarationCrossReference_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trig__NameAssignment_0_0_1"


    // $ANTLR start "rule__Trig__InvariantAssignment_1_0"
    // InternalTempor.g:5569:1: rule__Trig__InvariantAssignment_1_0 : ( ruleInv ) ;
    public final void rule__Trig__InvariantAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:5573:1: ( ( ruleInv ) )
            // InternalTempor.g:5574:2: ( ruleInv )
            {
            // InternalTempor.g:5574:2: ( ruleInv )
            // InternalTempor.g:5575:3: ruleInv
            {
             before(grammarAccess.getTrigAccess().getInvariantInvParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleInv();

            state._fsp--;

             after(grammarAccess.getTrigAccess().getInvariantInvParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trig__InvariantAssignment_1_0"


    // $ANTLR start "rule__Trig__Release_reactionAssignment_1_1"
    // InternalTempor.g:5584:1: rule__Trig__Release_reactionAssignment_1_1 : ( ruleRelRea ) ;
    public final void rule__Trig__Release_reactionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:5588:1: ( ( ruleRelRea ) )
            // InternalTempor.g:5589:2: ( ruleRelRea )
            {
            // InternalTempor.g:5589:2: ( ruleRelRea )
            // InternalTempor.g:5590:3: ruleRelRea
            {
             before(grammarAccess.getTrigAccess().getRelease_reactionRelReaParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRelRea();

            state._fsp--;

             after(grammarAccess.getTrigAccess().getRelease_reactionRelReaParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trig__Release_reactionAssignment_1_1"


    // $ANTLR start "rule__Trig__Delay_finalAssignment_1_2"
    // InternalTempor.g:5599:1: rule__Trig__Delay_finalAssignment_1_2 : ( ruleDelFin ) ;
    public final void rule__Trig__Delay_finalAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:5603:1: ( ( ruleDelFin ) )
            // InternalTempor.g:5604:2: ( ruleDelFin )
            {
            // InternalTempor.g:5604:2: ( ruleDelFin )
            // InternalTempor.g:5605:3: ruleDelFin
            {
             before(grammarAccess.getTrigAccess().getDelay_finalDelFinParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDelFin();

            state._fsp--;

             after(grammarAccess.getTrigAccess().getDelay_finalDelFinParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trig__Delay_finalAssignment_1_2"


    // $ANTLR start "rule__Inv__InvAssignment_1"
    // InternalTempor.g:5614:1: rule__Inv__InvAssignment_1 : ( ( ruleSentence ) ) ;
    public final void rule__Inv__InvAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:5618:1: ( ( ( ruleSentence ) ) )
            // InternalTempor.g:5619:2: ( ( ruleSentence ) )
            {
            // InternalTempor.g:5619:2: ( ( ruleSentence ) )
            // InternalTempor.g:5620:3: ( ruleSentence )
            {
             before(grammarAccess.getInvAccess().getInvSentenceDeclarationCrossReference_1_0()); 
            // InternalTempor.g:5621:3: ( ruleSentence )
            // InternalTempor.g:5622:4: ruleSentence
            {
             before(grammarAccess.getInvAccess().getInvSentenceDeclarationSentenceParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getInvAccess().getInvSentenceDeclarationSentenceParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getInvAccess().getInvSentenceDeclarationCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inv__InvAssignment_1"


    // $ANTLR start "rule__Inv__Delay_finalAssignment_2_0_1"
    // InternalTempor.g:5633:1: rule__Inv__Delay_finalAssignment_2_0_1 : ( ruleDelFin ) ;
    public final void rule__Inv__Delay_finalAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:5637:1: ( ( ruleDelFin ) )
            // InternalTempor.g:5638:2: ( ruleDelFin )
            {
            // InternalTempor.g:5638:2: ( ruleDelFin )
            // InternalTempor.g:5639:3: ruleDelFin
            {
             before(grammarAccess.getInvAccess().getDelay_finalDelFinParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDelFin();

            state._fsp--;

             after(grammarAccess.getInvAccess().getDelay_finalDelFinParserRuleCall_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inv__Delay_finalAssignment_2_0_1"


    // $ANTLR start "rule__Inv__Release_reactionAssignment_2_1_4"
    // InternalTempor.g:5648:1: rule__Inv__Release_reactionAssignment_2_1_4 : ( ruleRelRea ) ;
    public final void rule__Inv__Release_reactionAssignment_2_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:5652:1: ( ( ruleRelRea ) )
            // InternalTempor.g:5653:2: ( ruleRelRea )
            {
            // InternalTempor.g:5653:2: ( ruleRelRea )
            // InternalTempor.g:5654:3: ruleRelRea
            {
             before(grammarAccess.getInvAccess().getRelease_reactionRelReaParserRuleCall_2_1_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRelRea();

            state._fsp--;

             after(grammarAccess.getInvAccess().getRelease_reactionRelReaParserRuleCall_2_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inv__Release_reactionAssignment_2_1_4"


    // $ANTLR start "rule__Inv_always__InvAssignment_1_0"
    // InternalTempor.g:5663:1: rule__Inv_always__InvAssignment_1_0 : ( ( ruleSentence ) ) ;
    public final void rule__Inv_always__InvAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:5667:1: ( ( ( ruleSentence ) ) )
            // InternalTempor.g:5668:2: ( ( ruleSentence ) )
            {
            // InternalTempor.g:5668:2: ( ( ruleSentence ) )
            // InternalTempor.g:5669:3: ( ruleSentence )
            {
             before(grammarAccess.getInv_alwaysAccess().getInvSentenceDeclarationCrossReference_1_0_0()); 
            // InternalTempor.g:5670:3: ( ruleSentence )
            // InternalTempor.g:5671:4: ruleSentence
            {
             before(grammarAccess.getInv_alwaysAccess().getInvSentenceDeclarationSentenceParserRuleCall_1_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getInv_alwaysAccess().getInvSentenceDeclarationSentenceParserRuleCall_1_0_0_1()); 

            }

             after(grammarAccess.getInv_alwaysAccess().getInvSentenceDeclarationCrossReference_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inv_always__InvAssignment_1_0"


    // $ANTLR start "rule__Inv_always__Release_reactionAssignment_1_6"
    // InternalTempor.g:5682:1: rule__Inv_always__Release_reactionAssignment_1_6 : ( ruleRelRea ) ;
    public final void rule__Inv_always__Release_reactionAssignment_1_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:5686:1: ( ( ruleRelRea ) )
            // InternalTempor.g:5687:2: ( ruleRelRea )
            {
            // InternalTempor.g:5687:2: ( ruleRelRea )
            // InternalTempor.g:5688:3: ruleRelRea
            {
             before(grammarAccess.getInv_alwaysAccess().getRelease_reactionRelReaParserRuleCall_1_6_0()); 
            pushFollow(FOLLOW_2);
            ruleRelRea();

            state._fsp--;

             after(grammarAccess.getInv_alwaysAccess().getRelease_reactionRelReaParserRuleCall_1_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inv_always__Release_reactionAssignment_1_6"


    // $ANTLR start "rule__RelRea__RelAssignment_0_1_1"
    // InternalTempor.g:5697:1: rule__RelRea__RelAssignment_0_1_1 : ( ( ruleSentence ) ) ;
    public final void rule__RelRea__RelAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:5701:1: ( ( ( ruleSentence ) ) )
            // InternalTempor.g:5702:2: ( ( ruleSentence ) )
            {
            // InternalTempor.g:5702:2: ( ( ruleSentence ) )
            // InternalTempor.g:5703:3: ( ruleSentence )
            {
             before(grammarAccess.getRelReaAccess().getRelSentenceDeclarationCrossReference_0_1_1_0()); 
            // InternalTempor.g:5704:3: ( ruleSentence )
            // InternalTempor.g:5705:4: ruleSentence
            {
             before(grammarAccess.getRelReaAccess().getRelSentenceDeclarationSentenceParserRuleCall_0_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getRelReaAccess().getRelSentenceDeclarationSentenceParserRuleCall_0_1_1_0_1()); 

            }

             after(grammarAccess.getRelReaAccess().getRelSentenceDeclarationCrossReference_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__RelAssignment_0_1_1"


    // $ANTLR start "rule__RelRea__ReactionAssignment_0_1_3"
    // InternalTempor.g:5716:1: rule__RelRea__ReactionAssignment_0_1_3 : ( ruleRea ) ;
    public final void rule__RelRea__ReactionAssignment_0_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:5720:1: ( ( ruleRea ) )
            // InternalTempor.g:5721:2: ( ruleRea )
            {
            // InternalTempor.g:5721:2: ( ruleRea )
            // InternalTempor.g:5722:3: ruleRea
            {
             before(grammarAccess.getRelReaAccess().getReactionReaParserRuleCall_0_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRea();

            state._fsp--;

             after(grammarAccess.getRelReaAccess().getReactionReaParserRuleCall_0_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__ReactionAssignment_0_1_3"


    // $ANTLR start "rule__RelRea__Delay_finalAssignment_0_1_4_1"
    // InternalTempor.g:5731:1: rule__RelRea__Delay_finalAssignment_0_1_4_1 : ( ruleDelFin ) ;
    public final void rule__RelRea__Delay_finalAssignment_0_1_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:5735:1: ( ( ruleDelFin ) )
            // InternalTempor.g:5736:2: ( ruleDelFin )
            {
            // InternalTempor.g:5736:2: ( ruleDelFin )
            // InternalTempor.g:5737:3: ruleDelFin
            {
             before(grammarAccess.getRelReaAccess().getDelay_finalDelFinParserRuleCall_0_1_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDelFin();

            state._fsp--;

             after(grammarAccess.getRelReaAccess().getDelay_finalDelFinParserRuleCall_0_1_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__Delay_finalAssignment_0_1_4_1"


    // $ANTLR start "rule__RelRea__RelAssignment_1_1"
    // InternalTempor.g:5746:1: rule__RelRea__RelAssignment_1_1 : ( ( ruleSentence ) ) ;
    public final void rule__RelRea__RelAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:5750:1: ( ( ( ruleSentence ) ) )
            // InternalTempor.g:5751:2: ( ( ruleSentence ) )
            {
            // InternalTempor.g:5751:2: ( ( ruleSentence ) )
            // InternalTempor.g:5752:3: ( ruleSentence )
            {
             before(grammarAccess.getRelReaAccess().getRelSentenceDeclarationCrossReference_1_1_0()); 
            // InternalTempor.g:5753:3: ( ruleSentence )
            // InternalTempor.g:5754:4: ruleSentence
            {
             before(grammarAccess.getRelReaAccess().getRelSentenceDeclarationSentenceParserRuleCall_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getRelReaAccess().getRelSentenceDeclarationSentenceParserRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getRelReaAccess().getRelSentenceDeclarationCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__RelAssignment_1_1"


    // $ANTLR start "rule__RelRea__ReactionAssignment_2_1_0"
    // InternalTempor.g:5765:1: rule__RelRea__ReactionAssignment_2_1_0 : ( ruleRea ) ;
    public final void rule__RelRea__ReactionAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:5769:1: ( ( ruleRea ) )
            // InternalTempor.g:5770:2: ( ruleRea )
            {
            // InternalTempor.g:5770:2: ( ruleRea )
            // InternalTempor.g:5771:3: ruleRea
            {
             before(grammarAccess.getRelReaAccess().getReactionReaParserRuleCall_2_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRea();

            state._fsp--;

             after(grammarAccess.getRelReaAccess().getReactionReaParserRuleCall_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__ReactionAssignment_2_1_0"


    // $ANTLR start "rule__RelRea__Delay_finalAssignment_2_1_1_1"
    // InternalTempor.g:5780:1: rule__RelRea__Delay_finalAssignment_2_1_1_1 : ( ruleDelFin ) ;
    public final void rule__RelRea__Delay_finalAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:5784:1: ( ( ruleDelFin ) )
            // InternalTempor.g:5785:2: ( ruleDelFin )
            {
            // InternalTempor.g:5785:2: ( ruleDelFin )
            // InternalTempor.g:5786:3: ruleDelFin
            {
             before(grammarAccess.getRelReaAccess().getDelay_finalDelFinParserRuleCall_2_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDelFin();

            state._fsp--;

             after(grammarAccess.getRelReaAccess().getDelay_finalDelFinParserRuleCall_2_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__Delay_finalAssignment_2_1_1_1"


    // $ANTLR start "rule__RelRea__ReaAssignment_3_1_3"
    // InternalTempor.g:5795:1: rule__RelRea__ReaAssignment_3_1_3 : ( ( ruleSentence ) ) ;
    public final void rule__RelRea__ReaAssignment_3_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:5799:1: ( ( ( ruleSentence ) ) )
            // InternalTempor.g:5800:2: ( ( ruleSentence ) )
            {
            // InternalTempor.g:5800:2: ( ( ruleSentence ) )
            // InternalTempor.g:5801:3: ( ruleSentence )
            {
             before(grammarAccess.getRelReaAccess().getReaSentenceDeclarationCrossReference_3_1_3_0()); 
            // InternalTempor.g:5802:3: ( ruleSentence )
            // InternalTempor.g:5803:4: ruleSentence
            {
             before(grammarAccess.getRelReaAccess().getReaSentenceDeclarationSentenceParserRuleCall_3_1_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getRelReaAccess().getReaSentenceDeclarationSentenceParserRuleCall_3_1_3_0_1()); 

            }

             after(grammarAccess.getRelReaAccess().getReaSentenceDeclarationCrossReference_3_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__ReaAssignment_3_1_3"


    // $ANTLR start "rule__RelRea__Delay_finalAssignment_3_1_4_1"
    // InternalTempor.g:5814:1: rule__RelRea__Delay_finalAssignment_3_1_4_1 : ( ruleDelFin ) ;
    public final void rule__RelRea__Delay_finalAssignment_3_1_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:5818:1: ( ( ruleDelFin ) )
            // InternalTempor.g:5819:2: ( ruleDelFin )
            {
            // InternalTempor.g:5819:2: ( ruleDelFin )
            // InternalTempor.g:5820:3: ruleDelFin
            {
             before(grammarAccess.getRelReaAccess().getDelay_finalDelFinParserRuleCall_3_1_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDelFin();

            state._fsp--;

             after(grammarAccess.getRelReaAccess().getDelay_finalDelFinParserRuleCall_3_1_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__Delay_finalAssignment_3_1_4_1"


    // $ANTLR start "rule__Rea__ReaAssignment_3"
    // InternalTempor.g:5829:1: rule__Rea__ReaAssignment_3 : ( ( ruleSentence ) ) ;
    public final void rule__Rea__ReaAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:5833:1: ( ( ( ruleSentence ) ) )
            // InternalTempor.g:5834:2: ( ( ruleSentence ) )
            {
            // InternalTempor.g:5834:2: ( ( ruleSentence ) )
            // InternalTempor.g:5835:3: ( ruleSentence )
            {
             before(grammarAccess.getReaAccess().getReaSentenceDeclarationCrossReference_3_0()); 
            // InternalTempor.g:5836:3: ( ruleSentence )
            // InternalTempor.g:5837:4: ruleSentence
            {
             before(grammarAccess.getReaAccess().getReaSentenceDeclarationSentenceParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getReaAccess().getReaSentenceDeclarationSentenceParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getReaAccess().getReaSentenceDeclarationCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rea__ReaAssignment_3"


    // $ANTLR start "rule__DelFin__DelayAssignment_1_0_1_0_0"
    // InternalTempor.g:5848:1: rule__DelFin__DelayAssignment_1_0_1_0_0 : ( ruleDelay ) ;
    public final void rule__DelFin__DelayAssignment_1_0_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:5852:1: ( ( ruleDelay ) )
            // InternalTempor.g:5853:2: ( ruleDelay )
            {
            // InternalTempor.g:5853:2: ( ruleDelay )
            // InternalTempor.g:5854:3: ruleDelay
            {
             before(grammarAccess.getDelFinAccess().getDelayDelayParserRuleCall_1_0_1_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDelay();

            state._fsp--;

             after(grammarAccess.getDelFinAccess().getDelayDelayParserRuleCall_1_0_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelFin__DelayAssignment_1_0_1_0_0"


    // $ANTLR start "rule__DelFin__FinAssignment_1_0_1_0_1_1"
    // InternalTempor.g:5863:1: rule__DelFin__FinAssignment_1_0_1_0_1_1 : ( ( ruleSentence ) ) ;
    public final void rule__DelFin__FinAssignment_1_0_1_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:5867:1: ( ( ( ruleSentence ) ) )
            // InternalTempor.g:5868:2: ( ( ruleSentence ) )
            {
            // InternalTempor.g:5868:2: ( ( ruleSentence ) )
            // InternalTempor.g:5869:3: ( ruleSentence )
            {
             before(grammarAccess.getDelFinAccess().getFinSentenceDeclarationCrossReference_1_0_1_0_1_1_0()); 
            // InternalTempor.g:5870:3: ( ruleSentence )
            // InternalTempor.g:5871:4: ruleSentence
            {
             before(grammarAccess.getDelFinAccess().getFinSentenceDeclarationSentenceParserRuleCall_1_0_1_0_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getDelFinAccess().getFinSentenceDeclarationSentenceParserRuleCall_1_0_1_0_1_1_0_1()); 

            }

             after(grammarAccess.getDelFinAccess().getFinSentenceDeclarationCrossReference_1_0_1_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelFin__FinAssignment_1_0_1_0_1_1"


    // $ANTLR start "rule__DelFin__ImmAssignment_1_0_1_1_0"
    // InternalTempor.g:5882:1: rule__DelFin__ImmAssignment_1_0_1_1_0 : ( ( 'immediately' ) ) ;
    public final void rule__DelFin__ImmAssignment_1_0_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:5886:1: ( ( ( 'immediately' ) ) )
            // InternalTempor.g:5887:2: ( ( 'immediately' ) )
            {
            // InternalTempor.g:5887:2: ( ( 'immediately' ) )
            // InternalTempor.g:5888:3: ( 'immediately' )
            {
             before(grammarAccess.getDelFinAccess().getImmImmediatelyKeyword_1_0_1_1_0_0()); 
            // InternalTempor.g:5889:3: ( 'immediately' )
            // InternalTempor.g:5890:4: 'immediately'
            {
             before(grammarAccess.getDelFinAccess().getImmImmediatelyKeyword_1_0_1_1_0_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getDelFinAccess().getImmImmediatelyKeyword_1_0_1_1_0_0()); 

            }

             after(grammarAccess.getDelFinAccess().getImmImmediatelyKeyword_1_0_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelFin__ImmAssignment_1_0_1_1_0"


    // $ANTLR start "rule__DelFin__FinAssignment_1_0_1_1_2"
    // InternalTempor.g:5901:1: rule__DelFin__FinAssignment_1_0_1_1_2 : ( ( ruleSentence ) ) ;
    public final void rule__DelFin__FinAssignment_1_0_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:5905:1: ( ( ( ruleSentence ) ) )
            // InternalTempor.g:5906:2: ( ( ruleSentence ) )
            {
            // InternalTempor.g:5906:2: ( ( ruleSentence ) )
            // InternalTempor.g:5907:3: ( ruleSentence )
            {
             before(grammarAccess.getDelFinAccess().getFinSentenceDeclarationCrossReference_1_0_1_1_2_0()); 
            // InternalTempor.g:5908:3: ( ruleSentence )
            // InternalTempor.g:5909:4: ruleSentence
            {
             before(grammarAccess.getDelFinAccess().getFinSentenceDeclarationSentenceParserRuleCall_1_0_1_1_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getDelFinAccess().getFinSentenceDeclarationSentenceParserRuleCall_1_0_1_1_2_0_1()); 

            }

             after(grammarAccess.getDelFinAccess().getFinSentenceDeclarationCrossReference_1_0_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelFin__FinAssignment_1_0_1_1_2"


    // $ANTLR start "rule__DelFin__FinAssignment_1_1"
    // InternalTempor.g:5920:1: rule__DelFin__FinAssignment_1_1 : ( ( ruleSentence ) ) ;
    public final void rule__DelFin__FinAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:5924:1: ( ( ( ruleSentence ) ) )
            // InternalTempor.g:5925:2: ( ( ruleSentence ) )
            {
            // InternalTempor.g:5925:2: ( ( ruleSentence ) )
            // InternalTempor.g:5926:3: ( ruleSentence )
            {
             before(grammarAccess.getDelFinAccess().getFinSentenceDeclarationCrossReference_1_1_0()); 
            // InternalTempor.g:5927:3: ( ruleSentence )
            // InternalTempor.g:5928:4: ruleSentence
            {
             before(grammarAccess.getDelFinAccess().getFinSentenceDeclarationSentenceParserRuleCall_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getDelFinAccess().getFinSentenceDeclarationSentenceParserRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getDelFinAccess().getFinSentenceDeclarationCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelFin__FinAssignment_1_1"


    // $ANTLR start "rule__Delay__DelAssignment_2"
    // InternalTempor.g:5939:1: rule__Delay__DelAssignment_2 : ( ( ruleSentence ) ) ;
    public final void rule__Delay__DelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTempor.g:5943:1: ( ( ( ruleSentence ) ) )
            // InternalTempor.g:5944:2: ( ( ruleSentence ) )
            {
            // InternalTempor.g:5944:2: ( ( ruleSentence ) )
            // InternalTempor.g:5945:3: ( ruleSentence )
            {
             before(grammarAccess.getDelayAccess().getDelSentenceDeclarationCrossReference_2_0()); 
            // InternalTempor.g:5946:3: ( ruleSentence )
            // InternalTempor.g:5947:4: ruleSentence
            {
             before(grammarAccess.getDelayAccess().getDelSentenceDeclarationSentenceParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getDelayAccess().getDelSentenceDeclarationSentenceParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getDelayAccess().getDelSentenceDeclarationCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delay__DelAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000829000000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000030001F8000E0L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000F00000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000F00000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00003000000000E0L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0004000020000010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x3500000000000010L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0008000000040000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x1500000000000010L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000EL});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});

}
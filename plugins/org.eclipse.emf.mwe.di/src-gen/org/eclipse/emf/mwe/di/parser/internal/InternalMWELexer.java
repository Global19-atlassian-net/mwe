// $ANTLR 3.0.1 ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g 2008-06-13 08:21:39

package org.eclipse.emf.mwe.di.parser.internal;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalMWELexer extends Lexer {
    public static final int T21=21;
    public static final int RULE_ML_COMMENT=7;
    public static final int T14=14;
    public static final int RULE_ID=4;
    public static final int T22=22;
    public static final int RULE_STRING=5;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T20=20;
    public static final int T18=18;
    public static final int RULE_WS=9;
    public static final int T15=15;
    public static final int RULE_INT=6;
    public static final int EOF=-1;
    public static final int T17=17;
    public static final int Tokens=23;
    public static final int RULE_ANY_OTHER=11;
    public static final int T16=16;
    public static final int RULE_SL_COMMENT=8;
    public static final int T19=19;
    public static final int RULE_LEXER_BODY=10;


      public Token nextToken() {
            while (true) {
                this.token = null;
                this.channel = Token.DEFAULT_CHANNEL;
                this.tokenStartCharIndex = input.index();
                this.tokenStartCharPositionInLine = input.getCharPositionInLine();
                this.tokenStartLine = input.getLine();
                this.text = null;
                if ( input.LA(1)==CharStream.EOF ) {
                    return Token.EOF_TOKEN;
                }
                try {
                    mTokens();
                    if ( this.token==null ) {
                        emit();
                    }
                    else if ( this.token==Token.SKIP_TOKEN ) {
                        continue;
                    }
                    return this.token;
                }
                catch (RecognitionException re) {
                    reportError(re);
                    if ( re instanceof NoViableAltException ) { recover(re); }
                                    // create token that holds mismatched char
                    Token t = new CommonToken(input, Token.INVALID_TOKEN_TYPE,
                                              Token.HIDDEN_CHANNEL,
                                              this.tokenStartCharIndex,
                                              getCharIndex()-1);
                    t.setLine(this.tokenStartLine);
                    t.setCharPositionInLine(this.tokenStartCharPositionInLine);
                    emit(t);
                    return this.token;
                }
            }
        }

    public InternalMWELexer() {;} 
    public InternalMWELexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g"; }

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:45:5: ( 'property' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:45:7: 'property'
            {
            match("property"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:46:5: ( '=' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:46:7: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:47:5: ( ';' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:47:7: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:48:5: ( 'properties' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:48:7: 'properties'
            {
            match("properties"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:49:5: ( 'id' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:49:7: 'id'
            {
            match("id"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:50:5: ( '{' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:50:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:51:5: ( '}' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:51:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:52:5: ( 'file' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:52:7: 'file'
            {
            match("file"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:53:5: ( 'idRef' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:53:7: 'idRef'
            {
            match("idRef"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:54:5: ( '+=' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:54:7: '+='
            {
            match("+="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:55:5: ( '.' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:55:7: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:494:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:494:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:494:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:494:12: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:494:41: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:496:10: ( ( '0' .. '9' )+ )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:496:12: ( '0' .. '9' )+
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:496:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:496:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:498:13: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\"' ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("498:1: RULE_STRING : ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\"' ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )* '\\'' );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:498:15: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\"' ) )* '\"'
                    {
                    match('\"'); 
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:498:19: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\"' ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFE')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:498:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:498:65: ~ ( '\\\\' | '\"' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:498:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )* '\\''
                    {
                    match('\''); 
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:498:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFE')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:498:93: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:498:137: ~ ( '\\\\' | '\\'' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:500:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:500:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:500:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFE')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFE')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:500:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 

            channel=HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:502:17: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:502:19: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:502:24: (~ ( '\\n' | '\\r' ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:502:24: ~ ( '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:502:38: ( '\\r' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\r') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:502:38: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            channel=HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:504:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:504:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:504:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\t' && LA10_0<='\n')||LA10_0=='\r'||LA10_0==' ') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            channel=HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_LEXER_BODY
    public final void mRULE_LEXER_BODY() throws RecognitionException {
        try {
            int _type = RULE_LEXER_BODY;
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:506:17: ( '<#' ( '.' )* '#>' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:506:19: '<#' ( '.' )* '#>'
            {
            match("<#"); 

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:506:24: ( '.' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='.') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:506:24: '.'
            	    {
            	    match('.'); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            match("#>"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_LEXER_BODY

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:508:16: ( . )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:508:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:1:8: ( T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_LEXER_BODY | RULE_ANY_OTHER )
        int alt12=19;
        int LA12_0 = input.LA(1);

        if ( (LA12_0=='p') ) {
            int LA12_1 = input.LA(2);

            if ( (LA12_1=='r') ) {
                int LA12_19 = input.LA(3);

                if ( (LA12_19=='o') ) {
                    int LA12_35 = input.LA(4);

                    if ( (LA12_35=='p') ) {
                        int LA12_39 = input.LA(5);

                        if ( (LA12_39=='e') ) {
                            int LA12_42 = input.LA(6);

                            if ( (LA12_42=='r') ) {
                                int LA12_45 = input.LA(7);

                                if ( (LA12_45=='t') ) {
                                    switch ( input.LA(8) ) {
                                    case 'i':
                                        {
                                        int LA12_48 = input.LA(9);

                                        if ( (LA12_48=='e') ) {
                                            int LA12_50 = input.LA(10);

                                            if ( (LA12_50=='s') ) {
                                                int LA12_52 = input.LA(11);

                                                if ( ((LA12_52>='0' && LA12_52<='9')||(LA12_52>='A' && LA12_52<='Z')||LA12_52=='_'||(LA12_52>='a' && LA12_52<='z')) ) {
                                                    alt12=12;
                                                }
                                                else {
                                                    alt12=4;}
                                            }
                                            else {
                                                alt12=12;}
                                        }
                                        else {
                                            alt12=12;}
                                        }
                                        break;
                                    case 'y':
                                        {
                                        int LA12_49 = input.LA(9);

                                        if ( ((LA12_49>='0' && LA12_49<='9')||(LA12_49>='A' && LA12_49<='Z')||LA12_49=='_'||(LA12_49>='a' && LA12_49<='z')) ) {
                                            alt12=12;
                                        }
                                        else {
                                            alt12=1;}
                                        }
                                        break;
                                    default:
                                        alt12=12;}

                                }
                                else {
                                    alt12=12;}
                            }
                            else {
                                alt12=12;}
                        }
                        else {
                            alt12=12;}
                    }
                    else {
                        alt12=12;}
                }
                else {
                    alt12=12;}
            }
            else {
                alt12=12;}
        }
        else if ( (LA12_0=='=') ) {
            alt12=2;
        }
        else if ( (LA12_0==';') ) {
            alt12=3;
        }
        else if ( (LA12_0=='i') ) {
            int LA12_4 = input.LA(2);

            if ( (LA12_4=='d') ) {
                switch ( input.LA(3) ) {
                case 'R':
                    {
                    int LA12_36 = input.LA(4);

                    if ( (LA12_36=='e') ) {
                        int LA12_40 = input.LA(5);

                        if ( (LA12_40=='f') ) {
                            int LA12_43 = input.LA(6);

                            if ( ((LA12_43>='0' && LA12_43<='9')||(LA12_43>='A' && LA12_43<='Z')||LA12_43=='_'||(LA12_43>='a' && LA12_43<='z')) ) {
                                alt12=12;
                            }
                            else {
                                alt12=9;}
                        }
                        else {
                            alt12=12;}
                    }
                    else {
                        alt12=12;}
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                case '_':
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt12=12;
                    }
                    break;
                default:
                    alt12=5;}

            }
            else {
                alt12=12;}
        }
        else if ( (LA12_0=='{') ) {
            alt12=6;
        }
        else if ( (LA12_0=='}') ) {
            alt12=7;
        }
        else if ( (LA12_0=='f') ) {
            int LA12_7 = input.LA(2);

            if ( (LA12_7=='i') ) {
                int LA12_26 = input.LA(3);

                if ( (LA12_26=='l') ) {
                    int LA12_38 = input.LA(4);

                    if ( (LA12_38=='e') ) {
                        int LA12_41 = input.LA(5);

                        if ( ((LA12_41>='0' && LA12_41<='9')||(LA12_41>='A' && LA12_41<='Z')||LA12_41=='_'||(LA12_41>='a' && LA12_41<='z')) ) {
                            alt12=12;
                        }
                        else {
                            alt12=8;}
                    }
                    else {
                        alt12=12;}
                }
                else {
                    alt12=12;}
            }
            else {
                alt12=12;}
        }
        else if ( (LA12_0=='+') ) {
            int LA12_8 = input.LA(2);

            if ( (LA12_8=='=') ) {
                alt12=10;
            }
            else {
                alt12=19;}
        }
        else if ( (LA12_0=='.') ) {
            alt12=11;
        }
        else if ( (LA12_0=='^') ) {
            int LA12_10 = input.LA(2);

            if ( ((LA12_10>='A' && LA12_10<='Z')||LA12_10=='_'||(LA12_10>='a' && LA12_10<='z')) ) {
                alt12=12;
            }
            else {
                alt12=19;}
        }
        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='e')||(LA12_0>='g' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='o')||(LA12_0>='q' && LA12_0<='z')) ) {
            alt12=12;
        }
        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {
            alt12=13;
        }
        else if ( (LA12_0=='\"') ) {
            int LA12_13 = input.LA(2);

            if ( ((LA12_13>='\u0000' && LA12_13<='\uFFFE')) ) {
                alt12=14;
            }
            else {
                alt12=19;}
        }
        else if ( (LA12_0=='\'') ) {
            int LA12_14 = input.LA(2);

            if ( ((LA12_14>='\u0000' && LA12_14<='\uFFFE')) ) {
                alt12=14;
            }
            else {
                alt12=19;}
        }
        else if ( (LA12_0=='/') ) {
            switch ( input.LA(2) ) {
            case '/':
                {
                alt12=16;
                }
                break;
            case '*':
                {
                alt12=15;
                }
                break;
            default:
                alt12=19;}

        }
        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
            alt12=17;
        }
        else if ( (LA12_0=='<') ) {
            int LA12_17 = input.LA(2);

            if ( (LA12_17=='#') ) {
                alt12=18;
            }
            else {
                alt12=19;}
        }
        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='*')||(LA12_0>=',' && LA12_0<='-')||LA12_0==':'||(LA12_0>='>' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFE')) ) {
            alt12=19;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_LEXER_BODY | RULE_ANY_OTHER );", 12, 0, input);

            throw nvae;
        }
        switch (alt12) {
            case 1 :
                // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:1:10: T12
                {
                mT12(); 

                }
                break;
            case 2 :
                // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:1:14: T13
                {
                mT13(); 

                }
                break;
            case 3 :
                // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:1:18: T14
                {
                mT14(); 

                }
                break;
            case 4 :
                // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:1:22: T15
                {
                mT15(); 

                }
                break;
            case 5 :
                // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:1:26: T16
                {
                mT16(); 

                }
                break;
            case 6 :
                // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:1:30: T17
                {
                mT17(); 

                }
                break;
            case 7 :
                // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:1:34: T18
                {
                mT18(); 

                }
                break;
            case 8 :
                // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:1:38: T19
                {
                mT19(); 

                }
                break;
            case 9 :
                // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:1:42: T20
                {
                mT20(); 

                }
                break;
            case 10 :
                // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:1:46: T21
                {
                mT21(); 

                }
                break;
            case 11 :
                // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:1:50: T22
                {
                mT22(); 

                }
                break;
            case 12 :
                // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:1:54: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 13 :
                // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:1:62: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 14 :
                // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:1:71: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 15 :
                // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:1:83: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 16 :
                // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:1:99: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 17 :
                // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:1:115: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 18 :
                // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:1:123: RULE_LEXER_BODY
                {
                mRULE_LEXER_BODY(); 

                }
                break;
            case 19 :
                // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:1:139: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}
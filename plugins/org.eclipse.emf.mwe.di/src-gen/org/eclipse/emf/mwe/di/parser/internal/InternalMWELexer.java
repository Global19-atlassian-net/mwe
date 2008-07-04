// $ANTLR 3.0.1 ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g 2008-07-04 13:33:26

package org.eclipse.emf.mwe.di.parser.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalMWELexer extends Lexer {
    public static final int T21=21;
    public static final int RULE_ML_COMMENT=7;
    public static final int T14=14;
    public static final int RULE_ID=5;
    public static final int T22=22;
    public static final int RULE_STRING=4;
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
    public InternalMWELexer() {;} 
    public InternalMWELexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g"; }

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:10:5: ( 'import' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:10:7: 'import'
            {
            match("import"); 


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
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:11:5: ( '.' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:11:7: '.'
            {
            match('.'); 

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
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:12:5: ( '*' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:12:7: '*'
            {
            match('*'); 

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
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:13:5: ( ';' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:13:7: ';'
            {
            match(';'); 

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
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:14:5: ( 'var' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:14:7: 'var'
            {
            match("var"); 


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
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:15:5: ( '=' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:15:7: '='
            {
            match('='); 

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
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:16:5: ( 'file' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:16:7: 'file'
            {
            match("file"); 


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
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:17:5: ( ':' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:17:7: ':'
            {
            match(':'); 

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
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:18:5: ( '{' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:18:7: '{'
            {
            match('{'); 

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
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:19:5: ( '}' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:19:7: '}'
            {
            match('}'); 

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
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:20:5: ( '+=' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:20:7: '+='
            {
            match("+="); 


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
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:726:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:726:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:726:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:726:12: '^'
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

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:726:41: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:728:10: ( ( '0' .. '9' )+ )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:728:12: ( '0' .. '9' )+
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:728:12: ( '0' .. '9' )+
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
            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:728:13: '0' .. '9'
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
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:730:13: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\"' ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )* '\\'' )
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
                    new NoViableAltException("730:1: RULE_STRING : ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\"' ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )* '\\'' );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:730:15: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\"' ) )* '\"'
                    {
                    match('\"'); 
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:730:19: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\"' ) )*
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
                    	    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:730:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    	    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:730:65: ~ ( '\\\\' | '\"' )
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
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:730:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )* '\\''
                    {
                    match('\''); 
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:730:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )*
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
                    	    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:730:93: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    	    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:730:137: ~ ( '\\\\' | '\\'' )
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
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:732:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:732:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:732:24: ( options {greedy=false; } : . )*
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
            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:732:52: .
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
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:734:17: ( '//' (~ ( '\\n' | '\\r' ) )* ( ( options {greedy=true; } : '\\r\\n' | '\\r' | '\\n' ) )? )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:734:19: '//' (~ ( '\\n' | '\\r' ) )* ( ( options {greedy=true; } : '\\r\\n' | '\\r' | '\\n' ) )?
            {
            match("//"); 

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:734:24: (~ ( '\\n' | '\\r' ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:734:26: ~ ( '\\n' | '\\r' )
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

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:734:41: ( ( options {greedy=true; } : '\\r\\n' | '\\r' | '\\n' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:734:42: ( options {greedy=true; } : '\\r\\n' | '\\r' | '\\n' )
                    {
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:734:42: ( options {greedy=true; } : '\\r\\n' | '\\r' | '\\n' )
                    int alt9=3;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        int LA9_1 = input.LA(2);

                        if ( (LA9_1=='\n') ) {
                            alt9=1;
                        }
                        else {
                            alt9=2;}
                    }
                    else if ( (LA9_0=='\n') ) {
                        alt9=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("734:42: ( options {greedy=true; } : '\\r\\n' | '\\r' | '\\n' )", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:734:65: '\\r\\n'
                            {
                            match("\r\n"); 


                            }
                            break;
                        case 2 :
                            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:734:74: '\\r'
                            {
                            match('\r'); 

                            }
                            break;
                        case 3 :
                            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:734:81: '\\n'
                            {
                            match('\n'); 

                            }
                            break;

                    }


                    }
                    break;

            }

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
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:736:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:736:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:736:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:738:17: ( '<#' ( '.' )* '#>' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:738:19: '<#' ( '.' )* '#>'
            {
            match("<#"); 

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:738:24: ( '.' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='.') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:738:24: '.'
            	    {
            	    match('.'); 

            	    }
            	    break;

            	default :
            	    break loop12;
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
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:740:16: ( . )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:740:18: .
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
        int alt13=19;
        int LA13_0 = input.LA(1);

        if ( (LA13_0=='i') ) {
            int LA13_1 = input.LA(2);

            if ( (LA13_1=='m') ) {
                int LA13_21 = input.LA(3);

                if ( (LA13_21=='p') ) {
                    int LA13_39 = input.LA(4);

                    if ( (LA13_39=='o') ) {
                        int LA13_42 = input.LA(5);

                        if ( (LA13_42=='r') ) {
                            int LA13_45 = input.LA(6);

                            if ( (LA13_45=='t') ) {
                                int LA13_47 = input.LA(7);

                                if ( ((LA13_47>='0' && LA13_47<='9')||(LA13_47>='A' && LA13_47<='Z')||LA13_47=='_'||(LA13_47>='a' && LA13_47<='z')) ) {
                                    alt13=12;
                                }
                                else {
                                    alt13=1;}
                            }
                            else {
                                alt13=12;}
                        }
                        else {
                            alt13=12;}
                    }
                    else {
                        alt13=12;}
                }
                else {
                    alt13=12;}
            }
            else {
                alt13=12;}
        }
        else if ( (LA13_0=='.') ) {
            alt13=2;
        }
        else if ( (LA13_0=='*') ) {
            alt13=3;
        }
        else if ( (LA13_0==';') ) {
            alt13=4;
        }
        else if ( (LA13_0=='v') ) {
            int LA13_5 = input.LA(2);

            if ( (LA13_5=='a') ) {
                int LA13_26 = input.LA(3);

                if ( (LA13_26=='r') ) {
                    int LA13_40 = input.LA(4);

                    if ( ((LA13_40>='0' && LA13_40<='9')||(LA13_40>='A' && LA13_40<='Z')||LA13_40=='_'||(LA13_40>='a' && LA13_40<='z')) ) {
                        alt13=12;
                    }
                    else {
                        alt13=5;}
                }
                else {
                    alt13=12;}
            }
            else {
                alt13=12;}
        }
        else if ( (LA13_0=='=') ) {
            alt13=6;
        }
        else if ( (LA13_0=='f') ) {
            int LA13_7 = input.LA(2);

            if ( (LA13_7=='i') ) {
                int LA13_28 = input.LA(3);

                if ( (LA13_28=='l') ) {
                    int LA13_41 = input.LA(4);

                    if ( (LA13_41=='e') ) {
                        int LA13_44 = input.LA(5);

                        if ( ((LA13_44>='0' && LA13_44<='9')||(LA13_44>='A' && LA13_44<='Z')||LA13_44=='_'||(LA13_44>='a' && LA13_44<='z')) ) {
                            alt13=12;
                        }
                        else {
                            alt13=7;}
                    }
                    else {
                        alt13=12;}
                }
                else {
                    alt13=12;}
            }
            else {
                alt13=12;}
        }
        else if ( (LA13_0==':') ) {
            alt13=8;
        }
        else if ( (LA13_0=='{') ) {
            alt13=9;
        }
        else if ( (LA13_0=='}') ) {
            alt13=10;
        }
        else if ( (LA13_0=='+') ) {
            int LA13_11 = input.LA(2);

            if ( (LA13_11=='=') ) {
                alt13=11;
            }
            else {
                alt13=19;}
        }
        else if ( (LA13_0=='^') ) {
            int LA13_12 = input.LA(2);

            if ( ((LA13_12>='A' && LA13_12<='Z')||LA13_12=='_'||(LA13_12>='a' && LA13_12<='z')) ) {
                alt13=12;
            }
            else {
                alt13=19;}
        }
        else if ( ((LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='e')||(LA13_0>='g' && LA13_0<='h')||(LA13_0>='j' && LA13_0<='u')||(LA13_0>='w' && LA13_0<='z')) ) {
            alt13=12;
        }
        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {
            alt13=13;
        }
        else if ( (LA13_0=='\"') ) {
            int LA13_15 = input.LA(2);

            if ( ((LA13_15>='\u0000' && LA13_15<='\uFFFE')) ) {
                alt13=14;
            }
            else {
                alt13=19;}
        }
        else if ( (LA13_0=='\'') ) {
            int LA13_16 = input.LA(2);

            if ( ((LA13_16>='\u0000' && LA13_16<='\uFFFE')) ) {
                alt13=14;
            }
            else {
                alt13=19;}
        }
        else if ( (LA13_0=='/') ) {
            switch ( input.LA(2) ) {
            case '*':
                {
                alt13=15;
                }
                break;
            case '/':
                {
                alt13=16;
                }
                break;
            default:
                alt13=19;}

        }
        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
            alt13=17;
        }
        else if ( (LA13_0=='<') ) {
            int LA13_19 = input.LA(2);

            if ( (LA13_19=='#') ) {
                alt13=18;
            }
            else {
                alt13=19;}
        }
        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='(' && LA13_0<=')')||(LA13_0>=',' && LA13_0<='-')||(LA13_0>='>' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||LA13_0=='|'||(LA13_0>='~' && LA13_0<='\uFFFE')) ) {
            alt13=19;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_LEXER_BODY | RULE_ANY_OTHER );", 13, 0, input);

            throw nvae;
        }
        switch (alt13) {
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
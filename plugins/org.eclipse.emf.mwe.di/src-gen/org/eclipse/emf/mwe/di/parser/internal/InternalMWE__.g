lexer grammar InternalMWE;
@members {

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
}
@header {
package org.eclipse.emf.mwe.di.parser.internal;
}

T12 : 'property' ;
T13 : '=' ;
T14 : ';' ;
T15 : 'properties' ;
T16 : 'id' ;
T17 : '{' ;
T18 : '}' ;
T19 : 'file' ;
T20 : 'idRef' ;
T21 : '+=' ;
T22 : '.' ;

// $ANTLR src "./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g" 524
RULE_ID : ('^')?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g" 526
RULE_INT : ('0'..'9')+;

// $ANTLR src "./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g" 528
RULE_STRING : '"' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'"') )* '"' | '\'' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'\'') )* '\'';

// $ANTLR src "./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g" 530
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;};

// $ANTLR src "./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g" 532
RULE_SL_COMMENT : '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;};

// $ANTLR src "./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g" 534
RULE_WS : (' '|'\t'|'\r'|'\n')+ {$channel=HIDDEN;};

// $ANTLR src "./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g" 536
RULE_LEXER_BODY : '<#' '.'* '#>';

// $ANTLR src "./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g" 538
RULE_ANY_OTHER : .;



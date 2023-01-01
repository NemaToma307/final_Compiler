
/* Lexer */


lexer grammar projectLexer;



INPUT_D_Q_N  :  '"'WS NUM WS'"'  | '"'NUM'"' | '"'NUM WS'"' | '"'WS NUM '"';
INPUT_D_Q_I  :  '"'WS ID WS '"'  | '"'ID'"'  | '"' ID WS '"'| '"'WS ID  '"';



QOUT : '"';



NUM_BOOL : TRUE | FALSE;


AT: '@';
MINUS :'-';
PLUS : '+';
MULTI : '*' ;
DIVIDE : '/';
LINE_COMMENT : '//';
COMMENTSTART : '/* ';
COMMENTEND : '*/ ';
COMMA : ','  ;

/*BACKSLASH : '/';*/
ARRAYRIGHT:']';
ARRAYLEFT:'[';
CURLERIGHT :'}';
CURLELEFT :'{';
HRIGHT:')';
HLEFT :'(';
UNDERSCORE : '_';
QUISTION : '?';
EXCLAMATION:'!';
AND : '&&';
OR : '||' ;
DOT : '.';
LOGIC_SIGNS :' '* ('&&' | '||') ' '*;

SINGLS : '>' | '<' | '==' | '!=' | '<= ' | '=>'  ;
PLUSORMINUS : '++' | '--' ;

/* Data type */
VAR      : 'var';
CONST    : 'const';
FINAL    : 'final';
DYNAMIC  : 'dynamic';
INT      : 'int';
STRING   : 'String';
FLOAT    : 'float';
DOUBLE   : 'double';
LIST     : 'list';
MAPS     : 'map';
SET      : 'Set';
HASH     : 'Hash';
INTEGER  : 'Integer';
ARRAY    : 'array';
BOOLEAN  : 'bool';

/* Data type */

/* Kayword */

MAIN     : 'main';
VOID     : 'void';
CLASS    : 'class';
ABSTRACT : 'abstract';
THIS     : 'this';
SWITCH   : 'switch';
CASE     : 'case' ;
IMPORT   : 'import';
SUPER    : 'super';
EXTENDS  : 'extends';
NEW      : 'new' ;
PRINT    : 'print';
BREAK    : 'break';
CONTINUE : 'continue';
WHILE    : 'while';
RETURN   : 'return';
THEN     : 'then';
DEFAULT  :'default';
STATIC   :'static';
DO       : 'do';
TRY      : 'try';
CATCH    : 'catch';
THROW    : 'throw';
ELSE     : 'else';
//IS       : 'is' ;
ENUM     : 'enum';
WITH     : 'with' ;
ONPRESSED :'onPressed';
FIT :'fit';
BOXFIT :'BoxFit';
FILL:'fill';
APPBAR :'appBar';
APPBAR_CHILD : 'AppBar';
TITLE:'title';
BACHCOLOR :'backgroundColor';
COLOR : 'Colors';
RED :'red';
GREEN : 'green';

/* Kayword */

/* flutter */

STATEFULLWIDGET :'StatefulWidget' ;
STATELESSWIDGET: 'StatelessWidget' ;
WIDGET : 'widget';
BUILD_WIDGET  : 'Widget build(BuildContext context)';
STACK  : 'Stack';
COLUMN : 'Column';
ROW    : 'Row';
BODY   : 'body';
CHILD  : 'child';
CHILDREN : 'children';
CONTEXT : 'context';
CONTAINER :'Container';
TEXTBUTTON:'TextButton';
TEXT : 'Text';
EXPANDED :'Expanded';
SIZEDBOX : 'SizedBox';
HIGHT :'height';
WIDTH :'width';
IMAGE : 'Image';
IMAGE_CHILD : 'image';
ASSET : 'asset';
FILE : 'file';
NETWOK : 'netwok';
ASSETSIMAGE:'AssetImage';
IMAGE_INPUT_ASSET : '"' 'assets/'ID'.jpg' '"'      |'"' 'assets/'ID'.png''"'
                  | '"' 'assets/'ID NUM'.jpg' '"'  |'"' 'assets/'ID NUM'.png''"'
                  | '"' 'assets/'NUM ID'.jpg' '"'  |'"' 'assets/'NUM ID'.png''"'

                   ;

OVERRIDE : '@override'
      ;
SCAFFOLD : 'Scaffold' ;
LISTVIEW : 'ListView';
PADDING  : 'Padding';
VERTICAL : 'vertical';
HORISANTAL :'horizontal';
LEFT : 'left';
TOP : 'top';
RIGHT :'right';
BOTTOM: 'bottom';
PAD_ALL : 'padding : const EdgeInsets.all' ;
PAD_SYM : 'padding : const EdgeInsets.symmetric';
PAD_ON  : 'padding : const EdgeInsets.only';



/* flutter */

NUM_FLOAT :  NUM+ DOT NUM* ;
NUM_DOUBLE : NUM+ DOT NUM*    ;
TRUE : 'true';
FALSE : 'false';
TOWPOINT : ':';
SEMECOLON :';';
EQUAL    : '=' ;
FOR :'for';
IF : 'if';



ID : [a-zA-Z]+ ;
NUM: '0'| '-'?[1-9] [0-9]*;
WS : [ \t\n\r]+  -> skip;
//COMMENT: '--' ~[\n\r]* -> skip;
STRINGWITHQOYCHAR : ('a'..'z' )+;
//STRINGWITHQOYNUM : '0'..'9'+ ;
WHITESPACE : ' '+  ;




fragment UPPERCASE : [A-Z] ;
fragment LOWERCASE : [a-z] ;


fragment S : ('S'|'s') ;
fragment A : ('A'|'a') ;
fragment Y : ('Y'|'y') ;
fragment H : ('H'|'h') ;
fragment O : ('O'|'o') ;
fragment U : ('U'|'u') ;
fragment T : ('T'|'t') ;
fragment F : ('F'|'f') ;
fragment R : ('R'|'r') ;



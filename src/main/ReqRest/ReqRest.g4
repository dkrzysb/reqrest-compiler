grammar ReqRest;

/* parser rules */
program : Start statement* Finish EOF;
statement : initialization | assignment | ifStatement | whileLoop | print | load | httpMethods | newLine;
expression : Minus expression #unaryMinusExpression
| expression op=(Add | Subtract | Multiply | Divide)  expression #arithmeticExpression
| expression op=(GreaterThan | GreaterOrEqual | LowerThan | LowerOrEqual) expression #relationalExpression
| expression op=(Equal | NotEqual) expression #equalityExpression
| expression And expression #andExpression
| expression Or expression #orExpression
| Not expression #notExpression
| atom #atomExpression;
atom : OpeningParenthesis expression ClosingParenthesis #complexExpression
| (Integer | Float) #numberAtom
| (True | False) #booleanAtom
| ID #idAtom
| String #stringAtom;
httpMethods : httpGet | httpPost | httpPut | httpPatch | httpDelete;
httpGet : HttpGet OpeningParenthesis String ClosingParenthesis ExpressionEnd;
httpPost : HttpPost OpeningParenthesis String Comma String ClosingParenthesis ExpressionEnd;
httpPut : HttpPut OpeningParenthesis String Comma String ClosingParenthesis ExpressionEnd;
httpPatch : HttpPatch OpeningParenthesis String Comma String ClosingParenthesis ExpressionEnd;
httpDelete : HttpDelete OpeningParenthesis String ClosingParenthesis ExpressionEnd;
initialization : Definition ID Assign (expression ExpressionEnd | httpMethods);
assignment : ID Assign (expression ExpressionEnd | httpMethods);
print : Print OpeningParenthesis expression ClosingParenthesis ExpressionEnd;
load : Load OpeningParenthesis ID ClosingParenthesis ExpressionEnd;
newLine: NewLine ExpressionEnd;
ifStatement : If conditionBlock (Elsif conditionBlock)* (Else statementBlock)?;
conditionBlock : OpeningParenthesis expression ClosingParenthesis statementBlock;
statementBlock : OpeningCurlyBracket statement* ClosingCurlyBracket | statement;
whileLoop : While OpeningParenthesis expression ClosingParenthesis statementBlock;

/* lexer rules */
Start : 'go';
Finish : 'finish';
If : 'if';
Elsif : 'elsif';
Else : 'else';
While: 'while';
Load : 'load';
Print : 'print';
Assign : '=';
Add : 'add';
Subtract : 'subtract';
Multiply : 'multiply';
Divide : 'divide';
Equal : 'eq';
NotEqual : 'neq';
GreaterThan : 'gt';
LowerThan : 'lt';
GreaterOrEqual : 'ge';
LowerOrEqual : 'le';
Not : '~';
And : '&&';
Or : '||';
ExpressionEnd : '#';
HttpGet : 'get';
HttpPost : 'post';
HttpPut : 'put';
HttpPatch : 'patch';
HttpDelete : 'delete';
OpeningParenthesis : '(';
ClosingParenthesis : ')';
OpeningCurlyBracket : '{';
ClosingCurlyBracket : '}';
Definition : 'def';
Comma : ',';
NewLine: 'newline';
True : 'true';
False : 'false';
ID : [a-zA-Z]+[a-zA-Z0-9_]*;
Minus: '-';
Integer : [0-9]+;
Float : [0-9]+ '.' [0-9]*;
String : '"' (~["\r\n] | '""')* '"';
Comment : '#' ~[\r\n]* -> skip;
Whitespaces : [ \n\t\r] -> skip;

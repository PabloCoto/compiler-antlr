// ************  User Code  ********************

package scanner;
import parser.Parser;
import ast.AbstractASTNode;
import error.Err;
import error.ErrorHandler;

@SuppressWarnings("unused")

%%
// ************  Options ********************

// % debug // * For debugging purposes
%byaccj
%class Scanner
%public
%unicode
%line
%column

%{
// ************  Fields and methods ********************

// * To get the line number
public int getLine() { 
	// * JFlex starts in zero
	return yyline+1;
}

// * To get the column number
public int getColumn() { 
	// * JFlex starts in zero
	return yycolumn+1;
}

// * Semantic value of the token
private Object yylval;
public Object getYylval() {
	return this.yylval;
}

// * CHAR CONSTANT METHOD
	public char convertToChar(String text){
		char[]chars = text.toCharArray();
		if(chars[1]=='\\'){
				if(chars[2]=='n'){
					return '\n';
				}else if(chars[2]=='t'){
					return '\t';
				}else if(isIntNexts(chars)){
					String aux ="";
					for(int i =2;i<chars.length;i++){
						aux+=chars[i];
					}
					return (char)Integer.parseInt(aux);
				}
		}else{
			return chars[1];
		}
		return 0;
		
	}

	private boolean isIntNexts(char[] c) {
		for (int i = 2; i < c.length; i++) {
			if (Character.isDigit(c[i])) {
				return false;
			}
		}
		return true;
	}

%}

// ************  Macros ********************
INT_CONSTANT = 0|[1-9][0-9]*  
ASCII = 0|[1-9][0-9]?|1[0-9][0-9]|2[0-4][0-9]|25[0-6]
LETTER = [a-zA-Z������������]
IDENTS = {LETTER}({LETTER}*{INT_CONSTANT}*)*
COMMENT = "//" . *	
COMMENT_MULTILINE = "/*" ~ "*/"
OPERATOR = [+\-*%/\[\]\.<>=!\^\(\)]
SEPARATORS = [{};,]
EXPONENT = [eE](\-|"+")?{INT_CONSTANT}
REAL_CONSTANT=({INT_CONSTANT}{EXPONENT}?(\.)?)|(\.{INT_CONSTANT}{EXPONENT}?)|({INT_CONSTANT}\.{INT_CONSTANT}{EXPONENT}?)
CHAR_CONSTANT =\'(\\{ASCII}|.|\\n|\\t)\'
BLANKS = (\t|\n|" "|\r)

%%
// ************  Lexical Rules ********************
// * COMMENTS

{COMMENT}		{}
{COMMENT_MULTILINE}	{}

// * DOUBLE OPERATORS

"**"	{return Parser.POW;}
"=="	{return Parser.EQ;}
"<="	{return Parser.L_EQ;}
">="	{return Parser.G_EQ;}
"!="	{return Parser.NOT_EQ;}
"&&"	{return Parser.AND;}
"||"	{return Parser.OR;}
//AMPLIACION INC_DEC
"++"	{return Parser.INC;}
"--"	{return Parser.DEC;}



// * KEYWORDS

read	{return Parser.READ;}
write	{return Parser.WRITE;}
while	{return Parser.WHILE;}
if		{return Parser.IF;}
else	{return Parser.ELSE;}
int		{return Parser.INT;}	
double	{return Parser.DOUBLE;}
char	{return Parser.CHAR;}
struct	{return Parser.STRUCT;}
return	{return Parser.RETURN;}
void	{return Parser.VOID;}
main	{return Parser.MAIN;}


// * OPERATORS
{OPERATOR}		{this.yylval = yytext();
					return (int)yytext().charAt(0);}
					
// * IDs
{IDENTS}		{this.yylval = yytext();
				return Parser.ID;}

// * Char constant
{CHAR_CONSTANT}		{this.yylval = convertToChar(yytext());
				return Parser.CHAR_CONSTANT;}

// * Separators
{SEPARATORS}		{this.yylval = yytext();
						return (int)yytext().charAt(0);}
						// * Integer constant
{INT_CONSTANT}		{this.yylval = new Integer(yytext());
         			  return Parser.INT_CONSTANT;}
         			  
// * Real Constants
{REAL_CONSTANT}		{this.yylval = new Double(yytext());
				return Parser.REAL_CONSTANT;}

// * DO NOTHING
{BLANKS}		{}
.			{ErrorHandler.getInstance().addError(new Err(getLine(), getColumn(),("Lexical error -> " + yytext().toString())));}





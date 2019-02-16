//### This file created by BYACC 1.8(/Java extension  1.15)
//### Java capabilities added 7 Jan 97, Bob Jamison
//### Updated : 27 Nov 97  -- Bob Jamison, Joe Nieten
//###           01 Jan 98  -- Bob Jamison -- fixed generic semantic constructor
//###           01 Jun 99  -- Bob Jamison -- added Runnable support
//###           06 Aug 00  -- Bob Jamison -- made state variables class-global
//###           03 Jan 01  -- Bob Jamison -- improved flags, tracing
//###           16 May 01  -- Bob Jamison -- added custom stack sizing
//###           04 Mar 02  -- Yuval Oren  -- improved java performance, added options
//###           14 Mar 02  -- Tomas Hurka -- -d support, static initializer workaround
//### Please send bug reports to tom@hukatronic.cz
//### static char yysccsid[] = "@(#)yaccpar	1.8 (Berkeley) 01/20/90";



package parser;



//#line 2 "../../src/parser/parser.y"
/* * Java declarations*/
/*   This code is copied in the beginning of the generated Java file*/
import scanner.Scanner;
import java.util.ArrayList;
import java.util.List;

import ast.*;
import error.Err;
import error.ErrorHandler;
import ast.definition.DefField;
import ast.definition.DefFunc;
import ast.definition.DefVar;
import ast.definition.Definition;
import ast.expression.ArrayAccess;
import ast.expression.InvocationExp;
import ast.expression.Cast;
import ast.expression.Expression;
import ast.expression.LiteralChar;
import ast.expression.LiteralInt;
import ast.expression.LiteralReal;
import ast.expression.StructAccess;
import ast.expression.Variable;
import ast.expression.PunteroValueAccess;
import ast.expression.PunteroAddressAccess;
import ast.expression.binary.ArithmeticOperation;
import ast.expression.binary.CompOperation;
import ast.expression.binary.LogicOperation;
import ast.expression.unary.UnaryMinus;
import ast.expression.unary.UnaryNot;
import ast.statement.Assignment;
import ast.statement.InvocationSt;
import ast.statement.IfElse;
import ast.statement.Read;
import ast.statement.Return;
import ast.statement.Statement;
import ast.statement.While;
import ast.statement.Write;
import ast.type.ArrayType;
import ast.type.CharType;
import ast.type.FuncType;
import ast.type.IntType;
import ast.type.StructType;
import ast.type.Type;
import ast.type.VoidType;
import ast.type.RealType;
import ast.type.PunteroType;
//#line 64 "Parser.java"




public class Parser
{

boolean yydebug;        //do I want debug output?
int yynerrs;            //number of errors so far
int yyerrflag;          //was there an error?
int yychar;             //the current working character

//########## MESSAGES ##########
//###############################################################
// method: debug
//###############################################################
void debug(String msg)
{
  if (yydebug)
    System.out.println(msg);
}

//########## STATE STACK ##########
final static int YYSTACKSIZE = 500;  //maximum stack size
int statestk[] = new int[YYSTACKSIZE]; //state stack
int stateptr;
int stateptrmax;                     //highest index of stackptr
int statemax;                        //state when highest index reached
//###############################################################
// methods: state stack push,pop,drop,peek
//###############################################################
final void state_push(int state)
{
  try {
		stateptr++;
		statestk[stateptr]=state;
	 }
	 catch (ArrayIndexOutOfBoundsException e) {
     int oldsize = statestk.length;
     int newsize = oldsize * 2;
     int[] newstack = new int[newsize];
     System.arraycopy(statestk,0,newstack,0,oldsize);
     statestk = newstack;
     statestk[stateptr]=state;
  }
}
final int state_pop()
{
  return statestk[stateptr--];
}
final void state_drop(int cnt)
{
  stateptr -= cnt; 
}
final int state_peek(int relative)
{
  return statestk[stateptr-relative];
}
//###############################################################
// method: init_stacks : allocate and prepare stacks
//###############################################################
final boolean init_stacks()
{
  stateptr = -1;
  val_init();
  return true;
}
//###############################################################
// method: dump_stacks : show n levels of the stacks
//###############################################################
void dump_stacks(int count)
{
int i;
  System.out.println("=index==state====value=     s:"+stateptr+"  v:"+valptr);
  for (i=0;i<count;i++)
    System.out.println(" "+i+"    "+statestk[i]+"      "+valstk[i]);
  System.out.println("======================");
}


//########## SEMANTIC VALUES ##########
//## **user defined:Object
String   yytext;//user variable to return contextual strings
Object yyval; //used to return semantic vals from action routines
Object yylval;//the 'lval' (result) I got from yylex()
Object valstk[] = new Object[YYSTACKSIZE];
int valptr;
//###############################################################
// methods: value stack push,pop,drop,peek.
//###############################################################
final void val_init()
{
  yyval=new Object();
  yylval=new Object();
  valptr=-1;
}
final void val_push(Object val)
{
  try {
    valptr++;
    valstk[valptr]=val;
  }
  catch (ArrayIndexOutOfBoundsException e) {
    int oldsize = valstk.length;
    int newsize = oldsize*2;
    Object[] newstack = new Object[newsize];
    System.arraycopy(valstk,0,newstack,0,oldsize);
    valstk = newstack;
    valstk[valptr]=val;
  }
}
final Object val_pop()
{
  return valstk[valptr--];
}
final void val_drop(int cnt)
{
  valptr -= cnt;
}
final Object val_peek(int relative)
{
  return valstk[valptr-relative];
}
final Object dup_yyval(Object val)
{
  return val;
}
//#### end semantic value section ####
public final static short INT_CONSTANT=257;
public final static short REAL_CONSTANT=258;
public final static short EQ=259;
public final static short POW=260;
public final static short VOID=261;
public final static short OR=262;
public final static short RETURN=263;
public final static short ID=264;
public final static short DOUBLE=265;
public final static short WRITE=266;
public final static short ELSE=267;
public final static short IF=268;
public final static short CHAR=269;
public final static short STRUCT=270;
public final static short READ=271;
public final static short AND=272;
public final static short NOT_EQ=273;
public final static short WHILE=274;
public final static short G_EQ=275;
public final static short INT=276;
public final static short L_EQ=277;
public final static short MAIN=278;
public final static short CHAR_CONSTANT=279;
public final static short INC=280;
public final static short DEC=281;
public final static short ACCESO=282;
public final static short ACCESO2=283;
public final static short LESSTHANELSE=284;
public final static short CAST=285;
public final static short UNARY_MINUS=286;
public final static short YYERRCODE=256;
final static short yylhs[] = {                           -1,
    0,    3,    3,    1,    1,    4,    4,    4,    4,   11,
   12,   12,   13,   13,    9,    2,    5,    5,   17,   17,
   16,   16,    6,    6,    6,    8,   14,   14,   14,   14,
   10,    7,    7,   15,   15,   18,   18,   18,   18,   18,
   18,   18,   22,   22,   21,   21,   21,   21,   21,   21,
   23,   23,   20,   20,   19,   19,   19,   19,   19,   19,
   19,   19,   19,   19,   19,   19,   19,   19,   19,   19,
   19,   19,   19,   19,   19,   19,   19,   19,   19,   19,
};
final static short yylen[] = {                            2,
    2,    1,    1,    2,    0,    3,    3,    3,    3,    1,
    2,    0,    4,    0,    4,    8,    9,    9,    4,    2,
    1,    0,    1,    1,    1,    4,    1,    1,    1,    1,
    2,    3,    1,    2,    0,    3,    3,    3,    1,    1,
    4,    5,    7,    5,   11,    9,    9,    7,    7,    5,
    1,    0,    3,    1,    3,    3,    3,    3,    3,    3,
    3,    3,    3,    3,    3,    3,    3,    4,    4,    3,
    4,    2,    3,    2,    1,    1,    1,    1,    2,    2,
};
final static short yydefred[] = {                         5,
    0,    0,    0,   24,   25,    0,   23,    1,    4,    2,
    3,    0,    0,    0,    0,    0,    0,    0,   14,    0,
    0,   33,    0,    0,    0,   31,    0,    0,    0,    0,
    0,    6,    0,    7,    8,    9,    0,    0,    0,    0,
    0,   15,   27,   28,   29,   30,    0,    0,   32,   26,
   20,    0,    0,   12,    0,    0,   12,    0,    0,   13,
   12,    0,   19,   10,    0,   11,    0,    0,    0,   75,
   78,    0,    0,    0,    0,    0,    0,   77,    0,    0,
    0,    0,   16,    0,   34,    0,   39,   40,    0,   18,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
   17,    0,   36,    0,    0,   38,    0,    0,   37,    0,
    0,   73,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,   70,    0,    0,
    0,    0,    0,    0,   41,   69,   71,   42,   35,    0,
   35,   44,    0,    0,    0,    0,   35,   48,   43,    0,
    0,   35,   46,   47,    0,   45,
};
final static short yydgoto[] = {                          1,
    2,    8,    9,   64,   11,   65,   21,   13,   14,   15,
   66,   59,   30,   16,   67,   39,   40,   85,   86,  124,
   87,   88,  125,
};
final static short yysindex[] = {                         0,
    0, -140, -232,    0,    0,  -95,    0,    0,    0,    0,
    0, -229, -220, -220, -220,  -31,   18,   28,    0,   40,
  -30,    0,  -10,   23,   34,    0, -183, -171,   60, -122,
 -171,    0, -160,    0,    0,    0,   30, -150,   91,   96,
   -7,    0,    0,    0,    0,    0,  -27,  104,    0,    0,
    0,   14, -171,    0,   63,   26,    0, -112,  -76,    0,
    0,  -76,    0,    0, -220,    0,  -33,  -76,  -15,    0,
    0,  340,  110,  340,  117,  340,  119,    0,  340,  340,
  340,  302,    0,  340,    0,  688,    0,    0,    3,    0,
  120,  709,  340,  962,   80,  340,   83,  340,  990,  -29,
  -29,  123,  741,  -29,  340,  340,  340,  340,  340,  340,
  340,  340,  340,  340,  340,  340,  340,  340,  340, -103,
    0,  340,    0,  122,  127,    0,  340,  769,    0,  840,
  340,    0, 1017,  990,  990, 1017,  174,  174,  852,  174,
  174,    5,    5,  -29,  -29,  -29,  812,    0,  130,  114,
  962,   21,   39,  -29,    0,    0,    0,    0,    0,  -91,
    0,    0,   57,   75,   93,  -89,    0,    0,    0,  113,
  132,    0,    0,    0,  150,    0,
};
final static short yyrindex[] = {                         0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,  -22,  -20,  -18,  -16,    0,    0,    0,    0,   97,
    0,    0,    0,    0,    0,    0,    0,  138,    0,    0,
  138,    0,    0,    0,    0,    0,    0,    0,    0,  140,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,  168,    0,
    0,  168,    0,    0,  -22,    0,    0,  168,    0,    0,
    0,    0,  873,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
  407,    0,   91,   47,    0,    0,    0,    0,  -40,  433,
  442,    0,    0,  532,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,   91,    0,  143,    0,    0,    0,    0,    0,    0,
    0,    0,  979,  -28,   -4, 1014, 1007, 1103,    0, 1125,
 1149, 1060, 1095,  568,  594,  603,    0,    0,    0,  930,
   59,    0,    0,  679,    0,    0,    0,    0,    0,  266,
    0,    0,    0,    0,    0,  284,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,
};
final static short yygindex[] = {                         0,
    0,    0,    0,  183,    0,   81,   72,  156,  157,  161,
    0,  -55,    0,  166,    8,  171,    0, -114, 1233,  -66,
    0,    0,   77,
};
final static int YYTABLESIZE=1426;
static short yytable[];
static { yytable();}
static void yytable(){
yytable = new short[]{                         79,
   74,   62,   42,   74,   84,   68,   82,   95,   81,   97,
   26,   80,   67,   33,   26,   67,  120,   79,   74,   27,
   74,   28,   84,   29,   82,   30,   81,   19,   32,   80,
   67,   17,   67,   33,   20,   79,   66,  160,  162,   66,
   84,  118,   82,   22,   81,   18,  116,   80,   34,  168,
  120,  117,   74,   79,   66,  173,   66,   28,   84,   27,
   82,  119,   81,   27,   67,   80,   33,   29,   27,   69,
   28,   79,   29,   37,   30,   89,   84,   33,   82,   31,
   81,   35,   12,   80,   23,   24,   25,   54,   66,   79,
   54,   83,   36,    4,   84,  119,   82,    5,   81,   53,
   41,   80,   53,   49,    7,   54,   33,   79,   38,   90,
   43,   38,   84,   51,   82,   54,   81,   53,   55,   80,
    3,   60,   50,  127,    4,   79,  127,  121,    5,    6,
   84,   52,   82,   58,   81,    7,   57,   80,  126,   53,
   33,  129,    4,  159,   56,   79,    5,    6,   61,   93,
   84,   63,   82,    7,   81,   33,   96,   80,   98,  122,
  148,  161,  102,  131,   79,  127,  163,  150,  165,   84,
  157,   82,  158,   81,  171,  164,   80,  170,   22,  175,
   21,  166,   79,   51,   10,   44,   45,   84,    4,   82,
   46,   81,    5,    6,   80,   47,    0,  167,  149,    7,
   35,   48,    0,    0,    0,   35,    0,   35,    0,   35,
  118,    0,   35,    0,    0,  116,  114,  169,  115,  120,
  117,   74,    0,   70,   71,    0,    0,    0,    0,   72,
   73,   74,   74,   67,   75,  172,   22,   76,    0,    0,
   77,   70,   71,   67,    0,   78,    0,   72,   73,    0,
   74,    0,   75,    0,    0,   76,  174,   66,   77,   70,
   71,    0,    0,   78,  119,   72,   73,   66,   74,    0,
   75,    0,    0,   76,  176,    0,   77,   70,   71,    0,
    0,   78,    0,   72,   73,    0,   74,    0,   75,    0,
    0,   76,   35,    0,   77,   70,   71,    0,   50,   78,
    0,   72,   73,   50,   74,   50,   75,   50,    0,   76,
   50,    0,   77,   70,   71,    0,   49,   78,    0,   72,
   73,   49,   74,   49,   75,   49,    0,   76,   49,    0,
   77,   70,   71,    0,   79,   78,    0,   72,   73,   84,
   74,   82,   75,   81,    0,   76,   80,    0,   77,   70,
   71,    0,    0,   78,    0,   72,   73,    0,   74,    0,
   75,    0,    0,   76,    0,    0,   77,    0,    0,   70,
   71,   78,   79,    0,    0,   72,   73,   84,   74,   82,
   75,   81,    0,   76,   80,    0,   77,    0,   70,   71,
   50,   78,    0,    0,   72,   73,    0,   74,    0,   75,
    0,    0,   76,    0,    0,   77,   70,   71,   49,    0,
   78,    0,   72,   73,    0,   74,    0,   75,    0,    0,
   76,    0,    0,   77,   35,   35,    0,    0,   78,    0,
   35,   35,    0,   35,    0,   35,    0,    0,   35,    0,
    0,   35,    0,   76,    0,    0,   35,   76,   76,   76,
   76,   76,   76,   76,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,   76,   76,   76,   76,   72,
    0,    0,    0,   72,   72,   72,   72,   72,   80,   72,
    0,    0,   80,   80,   80,   80,   80,    0,   80,    0,
    0,   72,   72,   72,   72,    0,    0,   76,    0,   76,
   80,   80,   80,   80,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,   50,   50,    0,   72,    0,    0,   50,   50,
    0,   50,    0,   50,   80,    0,   50,    0,    0,   50,
   49,   49,    0,    0,   50,    0,   49,   49,    0,   49,
    0,   49,    0,    0,   49,    0,    0,   49,   70,   71,
    0,    0,   49,    0,    0,   91,    4,    0,   79,    0,
    5,    0,   79,   79,   79,   79,   79,    7,   79,    0,
   78,    0,    0,    0,    0,    0,    0,    0,    0,    0,
   79,   79,   79,   79,    0,    0,   70,   71,    0,    0,
    0,    0,    0,   91,   56,    0,    0,    0,   56,   56,
   56,   56,   56,    0,   56,    0,    0,    0,   78,    0,
    0,    0,    0,    0,   79,    0,   56,   56,   56,   56,
   57,    0,    0,    0,   57,   57,   57,   57,   57,   59,
   57,    0,    0,   59,   59,   59,   59,   59,    0,   59,
    0,    0,   57,   57,   57,   57,    0,    0,    0,    0,
   56,   59,   59,   59,   59,   76,    0,    0,   76,    0,
    0,    0,    0,    0,    0,    0,    0,    0,   76,   76,
    0,   76,    0,   76,    0,    0,   57,    0,    0,    0,
    0,   72,    0,    0,   72,   59,    0,    0,    0,    0,
   80,    0,    0,   80,   72,   72,    0,   72,    0,   72,
    0,    0,    0,   80,   80,   68,   80,    0,   80,   68,
   68,   68,   68,   68,  118,   68,    0,    0,    0,  116,
  114,    0,  115,  120,  117,    0,    0,   68,   68,   68,
   68,    0,    0,    0,    0,  118,    0,  113,  111,  112,
  116,  114,    0,  115,  120,  117,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,  123,  113,    0,
  112,   68,    0,    0,    0,    0,    0,  118,  119,    0,
    0,  132,  116,  114,    0,  115,  120,  117,    0,    0,
   79,    0,    0,   79,    0,    0,    0,    0,    0,  119,
  113,    0,  112,   79,   79,  118,   79,    0,   79,  152,
  116,  114,    0,  115,  120,  117,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,   56,    0,  113,   56,
  112,  119,    0,    0,    0,    0,    0,    0,    0,   56,
   56,    0,   56,    0,   56,    0,    0,    0,  118,    0,
    0,    0,   57,  116,  114,   57,  115,  120,  117,  119,
    0,   59,    0,    0,   59,   57,   57,    0,   57,    0,
   57,  113,    0,  112,   59,   59,  118,   59,    0,   59,
  153,  116,  114,    0,  115,  120,  117,    0,  118,    0,
    0,    0,    0,  116,  114,    0,  115,  120,  117,  113,
    0,  112,  119,    0,  156,    0,    0,    0,    0,   76,
  155,  113,    0,  112,   76,   76,    0,   76,   76,   76,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
  119,    0,   76,   76,   76,    0,    0,   68,    0,    0,
   68,    0,  119,    0,    0,    0,  105,    0,    0,  106,
   68,   68,    0,   68,    0,   68,    0,    0,    0,  107,
  108,    0,  109,   76,  110,    0,   71,  105,    0,    0,
  106,   71,   71,    0,   71,   71,   71,    0,    0,    0,
  107,  108,    0,  109,    0,  110,    0,    0,    0,   71,
   71,   71,    0,    0,    0,    0,    0,    0,  118,  105,
    0,    0,  106,  116,  114,    0,  115,  120,  117,    0,
    0,    0,  107,  108,    0,  109,    0,  110,    0,   60,
   71,  113,   60,  112,    0,    0,  118,  105,    0,    0,
  106,  116,  114,    0,  115,  120,  117,   60,    0,   60,
  107,  108,    0,  109,    0,  110,    0,   65,    0,  113,
   65,  112,  119,  118,   61,    0,    0,   61,  116,  114,
    0,  115,  120,  117,    0,   65,   65,   65,   65,    0,
  105,   60,   61,  106,   61,    0,  113,    0,  112,    0,
  119,    0,    0,  107,  108,    0,  109,    0,  110,    0,
    0,    0,    0,    0,    0,    0,    0,    0,  105,   65,
   55,  106,   55,   55,   55,    0,   61,  119,    0,    0,
  105,  107,  108,  106,  109,    0,  110,    0,   55,   55,
   55,   55,    0,  107,  108,    0,  109,    0,  110,    0,
    0,   76,    0,    0,   76,   58,    0,   58,   58,   58,
    0,    0,    0,   64,   76,   76,   64,   76,    0,   76,
    0,    0,   55,   58,   58,   58,   58,    0,    0,    0,
    0,   64,   64,   64,   64,   62,    0,    0,   62,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,   62,   62,   62,   62,   58,   71,   63,
    0,   71,   63,    0,    0,   64,    0,    0,    0,    0,
    0,   71,   71,    0,   71,    0,   71,   63,   63,   63,
   63,    0,    0,    0,    0,    0,    0,   62,    0,    0,
  105,    0,    0,  106,    0,    0,    0,    0,    0,    0,
    0,    0,    0,  107,  108,    0,  109,   60,  110,    0,
   60,   63,    0,    0,    0,    0,    0,    0,  105,    0,
   60,   60,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,  108,    0,  109,   65,  110,    0,   65,    0,
    0,    0,   61,    0,    0,   61,    0,    0,   65,   65,
    0,   65,    0,   65,    0,   61,   61,    0,    0,    0,
    0,  109,    0,  110,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,   92,    0,   94,    0,   94,    0,
    0,   99,  100,  101,  103,    0,  104,    0,   55,    0,
    0,   55,    0,    0,    0,   94,    0,    0,  128,    0,
  130,   55,   55,    0,   55,    0,   55,  133,  134,  135,
  136,  137,  138,  139,  140,  141,  142,  143,  144,  145,
  146,  147,    0,   58,   94,    0,   58,    0,    0,  151,
    0,   64,    0,  154,   64,    0,   58,   58,    0,   58,
    0,   58,    0,    0,   64,   64,    0,   64,    0,   64,
    0,    0,    0,   62,    0,    0,   62,    0,    0,    0,
    0,    0,    0,    0,    0,    0,   62,   62,    0,   62,
    0,   62,    0,    0,    0,    0,    0,   63,    0,    0,
   63,    0,    0,    0,    0,    0,    0,    0,    0,    0,
   63,   63,    0,   63,    0,   63,
};
}
static short yycheck[];
static { yycheck(); }
static void yycheck() {
yycheck = new short[] {                         33,
   41,   57,  125,   44,   38,   61,   40,   74,   42,   76,
   42,   45,   41,   44,   42,   44,   46,   33,   59,   42,
   61,   42,   38,   42,   40,   42,   42,  123,   59,   45,
   59,  264,   61,   44,  264,   33,   41,  152,  153,   44,
   38,   37,   40,  264,   42,  278,   42,   45,   59,  164,
   46,   47,   93,   33,   59,  170,   61,   40,   38,   91,
   40,   91,   42,   91,   93,   45,   44,   40,   91,   62,
   91,   33,   91,  257,   91,   68,   38,   44,   40,   40,
   42,   59,    2,   45,   13,   14,   15,   41,   93,   33,
   44,  125,   59,  265,   38,   91,   40,  269,   42,   41,
   41,   45,   44,  264,  276,   59,   44,   33,   28,  125,
   30,   31,   38,  264,   40,  123,   42,   59,   47,   45,
  261,   59,   93,   44,  265,   33,   44,  125,  269,  270,
   38,   41,   40,   53,   42,  276,  123,   45,   59,   44,
   44,   59,  265,  123,   41,   33,  269,  270,  123,   40,
   38,  264,   40,  276,   42,   59,   40,   45,   40,   40,
  264,  123,   82,   41,   33,   44,  159,   41,  161,   38,
   41,   40,   59,   42,  167,  267,   45,  267,   41,  172,
   41,  125,   33,   41,    2,   30,   30,   38,  265,   40,
   30,   42,  269,  270,   45,   30,   -1,  123,  122,  276,
   33,   31,   -1,   -1,   -1,   38,   -1,   40,   -1,   42,
   37,   -1,   45,   -1,   -1,   42,   43,  125,   45,   46,
   47,  262,   -1,  257,  258,   -1,   -1,   -1,   -1,  263,
  264,  272,  266,  262,  268,  123,  264,  271,   -1,   -1,
  274,  257,  258,  272,   -1,  279,   -1,  263,  264,   -1,
  266,   -1,  268,   -1,   -1,  271,  125,  262,  274,  257,
  258,   -1,   -1,  279,   91,  263,  264,  272,  266,   -1,
  268,   -1,   -1,  271,  125,   -1,  274,  257,  258,   -1,
   -1,  279,   -1,  263,  264,   -1,  266,   -1,  268,   -1,
   -1,  271,  125,   -1,  274,  257,  258,   -1,   33,  279,
   -1,  263,  264,   38,  266,   40,  268,   42,   -1,  271,
   45,   -1,  274,  257,  258,   -1,   33,  279,   -1,  263,
  264,   38,  266,   40,  268,   42,   -1,  271,   45,   -1,
  274,  257,  258,   -1,   33,  279,   -1,  263,  264,   38,
  266,   40,  268,   42,   -1,  271,   45,   -1,  274,  257,
  258,   -1,   -1,  279,   -1,  263,  264,   -1,  266,   -1,
  268,   -1,   -1,  271,   -1,   -1,  274,   -1,   -1,  257,
  258,  279,   33,   -1,   -1,  263,  264,   38,  266,   40,
  268,   42,   -1,  271,   45,   -1,  274,   -1,  257,  258,
  125,  279,   -1,   -1,  263,  264,   -1,  266,   -1,  268,
   -1,   -1,  271,   -1,   -1,  274,  257,  258,  125,   -1,
  279,   -1,  263,  264,   -1,  266,   -1,  268,   -1,   -1,
  271,   -1,   -1,  274,  257,  258,   -1,   -1,  279,   -1,
  263,  264,   -1,  266,   -1,  268,   -1,   -1,  271,   -1,
   -1,  274,   -1,   37,   -1,   -1,  279,   41,   42,   43,
   44,   45,   46,   47,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   59,   60,   61,   62,   37,
   -1,   -1,   -1,   41,   42,   43,   44,   45,   37,   47,
   -1,   -1,   41,   42,   43,   44,   45,   -1,   47,   -1,
   -1,   59,   60,   61,   62,   -1,   -1,   91,   -1,   93,
   59,   60,   61,   62,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,  257,  258,   -1,   93,   -1,   -1,  263,  264,
   -1,  266,   -1,  268,   93,   -1,  271,   -1,   -1,  274,
  257,  258,   -1,   -1,  279,   -1,  263,  264,   -1,  266,
   -1,  268,   -1,   -1,  271,   -1,   -1,  274,  257,  258,
   -1,   -1,  279,   -1,   -1,  264,  265,   -1,   37,   -1,
  269,   -1,   41,   42,   43,   44,   45,  276,   47,   -1,
  279,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   59,   60,   61,   62,   -1,   -1,  257,  258,   -1,   -1,
   -1,   -1,   -1,  264,   37,   -1,   -1,   -1,   41,   42,
   43,   44,   45,   -1,   47,   -1,   -1,   -1,  279,   -1,
   -1,   -1,   -1,   -1,   93,   -1,   59,   60,   61,   62,
   37,   -1,   -1,   -1,   41,   42,   43,   44,   45,   37,
   47,   -1,   -1,   41,   42,   43,   44,   45,   -1,   47,
   -1,   -1,   59,   60,   61,   62,   -1,   -1,   -1,   -1,
   93,   59,   60,   61,   62,  259,   -1,   -1,  262,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,  272,  273,
   -1,  275,   -1,  277,   -1,   -1,   93,   -1,   -1,   -1,
   -1,  259,   -1,   -1,  262,   93,   -1,   -1,   -1,   -1,
  259,   -1,   -1,  262,  272,  273,   -1,  275,   -1,  277,
   -1,   -1,   -1,  272,  273,   37,  275,   -1,  277,   41,
   42,   43,   44,   45,   37,   47,   -1,   -1,   -1,   42,
   43,   -1,   45,   46,   47,   -1,   -1,   59,   60,   61,
   62,   -1,   -1,   -1,   -1,   37,   -1,   60,   61,   62,
   42,   43,   -1,   45,   46,   47,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   59,   60,   -1,
   62,   93,   -1,   -1,   -1,   -1,   -1,   37,   91,   -1,
   -1,   41,   42,   43,   -1,   45,   46,   47,   -1,   -1,
  259,   -1,   -1,  262,   -1,   -1,   -1,   -1,   -1,   91,
   60,   -1,   62,  272,  273,   37,  275,   -1,  277,   41,
   42,   43,   -1,   45,   46,   47,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,  259,   -1,   60,  262,
   62,   91,   -1,   -1,   -1,   -1,   -1,   -1,   -1,  272,
  273,   -1,  275,   -1,  277,   -1,   -1,   -1,   37,   -1,
   -1,   -1,  259,   42,   43,  262,   45,   46,   47,   91,
   -1,  259,   -1,   -1,  262,  272,  273,   -1,  275,   -1,
  277,   60,   -1,   62,  272,  273,   37,  275,   -1,  277,
   41,   42,   43,   -1,   45,   46,   47,   -1,   37,   -1,
   -1,   -1,   -1,   42,   43,   -1,   45,   46,   47,   60,
   -1,   62,   91,   -1,   93,   -1,   -1,   -1,   -1,   37,
   59,   60,   -1,   62,   42,   43,   -1,   45,   46,   47,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   91,   -1,   60,   61,   62,   -1,   -1,  259,   -1,   -1,
  262,   -1,   91,   -1,   -1,   -1,  259,   -1,   -1,  262,
  272,  273,   -1,  275,   -1,  277,   -1,   -1,   -1,  272,
  273,   -1,  275,   91,  277,   -1,   37,  259,   -1,   -1,
  262,   42,   43,   -1,   45,   46,   47,   -1,   -1,   -1,
  272,  273,   -1,  275,   -1,  277,   -1,   -1,   -1,   60,
   61,   62,   -1,   -1,   -1,   -1,   -1,   -1,   37,  259,
   -1,   -1,  262,   42,   43,   -1,   45,   46,   47,   -1,
   -1,   -1,  272,  273,   -1,  275,   -1,  277,   -1,   41,
   91,   60,   44,   62,   -1,   -1,   37,  259,   -1,   -1,
  262,   42,   43,   -1,   45,   46,   47,   59,   -1,   61,
  272,  273,   -1,  275,   -1,  277,   -1,   41,   -1,   60,
   44,   62,   91,   37,   41,   -1,   -1,   44,   42,   43,
   -1,   45,   46,   47,   -1,   59,   60,   61,   62,   -1,
  259,   93,   59,  262,   61,   -1,   60,   -1,   62,   -1,
   91,   -1,   -1,  272,  273,   -1,  275,   -1,  277,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,  259,   93,
   41,  262,   43,   44,   45,   -1,   93,   91,   -1,   -1,
  259,  272,  273,  262,  275,   -1,  277,   -1,   59,   60,
   61,   62,   -1,  272,  273,   -1,  275,   -1,  277,   -1,
   -1,  259,   -1,   -1,  262,   41,   -1,   43,   44,   45,
   -1,   -1,   -1,   41,  272,  273,   44,  275,   -1,  277,
   -1,   -1,   93,   59,   60,   61,   62,   -1,   -1,   -1,
   -1,   59,   60,   61,   62,   41,   -1,   -1,   44,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   59,   60,   61,   62,   93,  259,   41,
   -1,  262,   44,   -1,   -1,   93,   -1,   -1,   -1,   -1,
   -1,  272,  273,   -1,  275,   -1,  277,   59,   60,   61,
   62,   -1,   -1,   -1,   -1,   -1,   -1,   93,   -1,   -1,
  259,   -1,   -1,  262,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,  272,  273,   -1,  275,  259,  277,   -1,
  262,   93,   -1,   -1,   -1,   -1,   -1,   -1,  259,   -1,
  272,  273,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,  273,   -1,  275,  259,  277,   -1,  262,   -1,
   -1,   -1,  259,   -1,   -1,  262,   -1,   -1,  272,  273,
   -1,  275,   -1,  277,   -1,  272,  273,   -1,   -1,   -1,
   -1,  275,   -1,  277,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   72,   -1,   74,   -1,   76,   -1,
   -1,   79,   80,   81,   82,   -1,   84,   -1,  259,   -1,
   -1,  262,   -1,   -1,   -1,   93,   -1,   -1,   96,   -1,
   98,  272,  273,   -1,  275,   -1,  277,  105,  106,  107,
  108,  109,  110,  111,  112,  113,  114,  115,  116,  117,
  118,  119,   -1,  259,  122,   -1,  262,   -1,   -1,  127,
   -1,  259,   -1,  131,  262,   -1,  272,  273,   -1,  275,
   -1,  277,   -1,   -1,  272,  273,   -1,  275,   -1,  277,
   -1,   -1,   -1,  259,   -1,   -1,  262,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,  272,  273,   -1,  275,
   -1,  277,   -1,   -1,   -1,   -1,   -1,  259,   -1,   -1,
  262,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
  272,  273,   -1,  275,   -1,  277,
};
}
final static short YYFINAL=1;
final static short YYMAXTOKEN=286;
final static String yyname[] = {
"end-of-file",null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,"'!'",null,null,null,"'%'","'&'",null,"'('","')'","'*'","'+'",
"','","'-'","'.'","'/'",null,null,null,null,null,null,null,null,null,null,null,
"';'","'<'","'='","'>'",null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,"'['",null,"']'",null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,"'{'",null,"'}'",null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,"INT_CONSTANT","REAL_CONSTANT",
"EQ","POW","VOID","OR","RETURN","ID","DOUBLE","WRITE","ELSE","IF","CHAR",
"STRUCT","READ","AND","NOT_EQ","WHILE","G_EQ","INT","L_EQ","MAIN",
"CHAR_CONSTANT","INC","DEC","ACCESO","ACCESO2","LESSTHANELSE","CAST",
"UNARY_MINUS",
};
final static String yyrule[] = {
"$accept : program",
"program : opt_def_glob_var main",
"glob_def : var_def",
"glob_def : func_def",
"opt_def_glob_var : opt_def_glob_var glob_def",
"opt_def_glob_var :",
"var_def : p_type list_ident ';'",
"var_def : array list_ident ';'",
"var_def : struct_type list_ident ';'",
"var_def : puntero list_ident ';'",
"local_var_def : var_def",
"opt_list_local_var : opt_list_local_var local_var_def",
"opt_list_local_var :",
"opt_list_fields : opt_list_fields type list_ident ';'",
"opt_list_fields :",
"struct_type : STRUCT '{' opt_list_fields '}'",
"main : VOID MAIN '(' ')' '{' opt_list_local_var statements '}'",
"func_def : p_type ID '(' opt_list_param ')' '{' opt_list_local_var statements '}'",
"func_def : VOID ID '(' opt_list_param ')' '{' opt_list_local_var statements '}'",
"list_param : list_param ',' p_type ID",
"list_param : p_type ID",
"opt_list_param : list_param",
"opt_list_param :",
"p_type : INT",
"p_type : DOUBLE",
"p_type : CHAR",
"array : type '[' INT_CONSTANT ']'",
"type : p_type",
"type : array",
"type : struct_type",
"type : puntero",
"puntero : type '*'",
"list_ident : list_ident ',' ID",
"list_ident : ID",
"statements : statements statement",
"statements :",
"statement : RETURN exp ';'",
"statement : READ list_exp ';'",
"statement : WRITE list_exp ';'",
"statement : if_else",
"statement : while",
"statement : exp '=' exp ';'",
"statement : ID '(' opt_list_exp ')' ';'",
"while : WHILE '(' exp ')' '{' statements '}'",
"while : WHILE '(' exp ')' statement",
"if_else : IF '(' exp ')' '{' statements '}' ELSE '{' statements '}'",
"if_else : IF '(' exp ')' '{' statements '}' ELSE statement",
"if_else : IF '(' exp ')' statement ELSE '{' statements '}'",
"if_else : IF '(' exp ')' statement ELSE statement",
"if_else : IF '(' exp ')' '{' statements '}'",
"if_else : IF '(' exp ')' statement",
"opt_list_exp : list_exp",
"opt_list_exp :",
"list_exp : list_exp ',' exp",
"list_exp : exp",
"exp : exp '+' exp",
"exp : exp '*' exp",
"exp : exp '/' exp",
"exp : exp '-' exp",
"exp : exp '%' exp",
"exp : exp EQ exp",
"exp : exp NOT_EQ exp",
"exp : exp '>' exp",
"exp : exp '<' exp",
"exp : exp L_EQ exp",
"exp : exp G_EQ exp",
"exp : exp AND exp",
"exp : exp OR exp",
"exp : '(' p_type ')' exp",
"exp : exp '[' exp ']'",
"exp : exp '.' ID",
"exp : ID '(' opt_list_exp ')'",
"exp : '-' exp",
"exp : '(' exp ')'",
"exp : '!' exp",
"exp : INT_CONSTANT",
"exp : ID",
"exp : CHAR_CONSTANT",
"exp : REAL_CONSTANT",
"exp : '&' exp",
"exp : '*' exp",
};

//#line 236 "../../src/parser/parser.y"

// * Code
//   Members of the generated Parser class
// We must implement at least:
// - int yylex()
// - void yyerror(String)

// * Lexical analyzer
private Scanner scanner;

// * Invocation to the scanner
private int yylex () {
    int token=0;
    try { 
		token=scanner.yylex();
		this.yylval = scanner.getYylval(); 
    } catch(Throwable e) {
	    System.err.println ("Lexical error in line " + scanner.getLine()+
		" and column "+scanner.getColumn()+":\n\t"+e); 
    }
    return token;
}

// * Syntax error handler
public void yyerror (String error) {
ErrorHandler.getInstance().addError(new Err(scanner.getLine(), scanner.getColumn(),
				"Syntax error -> " + yylex() + " (" + scanner.yytext() + ")"));
}

// * Constructor
public Parser(Scanner scanner) {
	this.scanner= scanner;
	//this.yydebug = true;
}

private ArrayType getArrayDef(Type type, int length, int line) {
	if(type instanceof ArrayType) {
		Type head = type;
		Type prev = type;
		Type actual = ((ArrayType)type).getTypeOf();
		while(actual instanceof ArrayType) {
			prev = actual;
			actual = ((ArrayType)actual).getTypeOf();
		}
		actual = (Type) new ArrayType(line, scanner.getColumn(), actual, length);
		((ArrayType)prev).setTypeOf(actual);
		
		return (ArrayType)head;
	
	} else {
		return new ArrayType(line, scanner.getColumn(), type, length);
	}
}

private void addVarDefs(List<Definition> defsList, Type type, List<String> idents, int line) {
	for(String id : idents) {
		defsList.add(new DefVar(line, scanner.getColumn(), type, id));
	}
}

private void addVarDefs(List<Definition> defsList, StructType type, List<String> idents, int line) {
	for(String id : idents) {
		defsList.add(new DefVar(line, scanner.getColumn(), new StructType(type.getLine(), type.getColumn(), type.getFieldsDefinitions(), id), id));
	}
}

private void mergeDefs(List<Definition> defsA, Object defB) {
	if(defB instanceof List) {
		for(Definition def : (List<Definition>)defB) {
			defsA.add(def);
		}
	}
	else {
		defsA.add((Definition)defB);
	}
}


private void addFieldDefs(List<Definition> defsList, Type type, List<String> idents, int line) {
	for(String s : idents) {
		defsList.add(new DefField(line, scanner.getColumn(), type, s));
	}
}
private ASTNode root;

public ASTNode getRoot() {
	return this.root;
}

//AMPLIACION
private PunteroType getPunteroDef(Type type, int line){
	
	if(type instanceof PunteroType) {
		Type head = type;
		Type prev = type;
		Type actual = ((PunteroType)type).getTypeOf();
		while(actual instanceof PunteroType) {
			prev = actual;
			actual = ((PunteroType)actual).getTypeOf();
		}
		actual = (Type) new PunteroType(line, scanner.getColumn(), actual);
		((PunteroType)prev).setTypeOf(actual);
		
		return (PunteroType)head;
	
	} else {
		return new PunteroType(line, scanner.getColumn(), type);
	}
}

//#line 773 "Parser.java"
//###############################################################
// method: yylexdebug : check lexer state
//###############################################################
void yylexdebug(int state,int ch)
{
String s=null;
  if (ch < 0) ch=0;
  if (ch <= YYMAXTOKEN) //check index bounds
     s = yyname[ch];    //now get it
  if (s==null)
    s = "illegal-symbol";
  debug("state "+state+", reading "+ch+" ("+s+")");
}





//The following are now global, to aid in error reporting
int yyn;       //next next thing to do
int yym;       //
int yystate;   //current parsing state from state table
String yys;    //current token string


//###############################################################
// method: yyparse : parse input and execute indicated items
//###############################################################
int yyparse()
{
boolean doaction;
  init_stacks();
  yynerrs = 0;
  yyerrflag = 0;
  yychar = -1;          //impossible char forces a read
  yystate=0;            //initial state
  state_push(yystate);  //save it
  val_push(yylval);     //save empty value
  while (true) //until parsing is done, either correctly, or w/error
    {
    doaction=true;
    if (yydebug) debug("loop"); 
    //#### NEXT ACTION (from reduction table)
    for (yyn=yydefred[yystate];yyn==0;yyn=yydefred[yystate])
      {
      if (yydebug) debug("yyn:"+yyn+"  state:"+yystate+"  yychar:"+yychar);
      if (yychar < 0)      //we want a char?
        {
        yychar = yylex();  //get next token
        if (yydebug) debug(" next yychar:"+yychar);
        //#### ERROR CHECK ####
        if (yychar < 0)    //it it didn't work/error
          {
          yychar = 0;      //change it to default string (no -1!)
          if (yydebug)
            yylexdebug(yystate,yychar);
          }
        }//yychar<0
      yyn = yysindex[yystate];  //get amount to shift by (shift index)
      if ((yyn != 0) && (yyn += yychar) >= 0 &&
          yyn <= YYTABLESIZE && yycheck[yyn] == yychar)
        {
        if (yydebug)
          debug("state "+yystate+", shifting to state "+yytable[yyn]);
        //#### NEXT STATE ####
        yystate = yytable[yyn];//we are in a new state
        state_push(yystate);   //save it
        val_push(yylval);      //push our lval as the input for next rule
        yychar = -1;           //since we have 'eaten' a token, say we need another
        if (yyerrflag > 0)     //have we recovered an error?
           --yyerrflag;        //give ourselves credit
        doaction=false;        //but don't process yet
        break;   //quit the yyn=0 loop
        }

    yyn = yyrindex[yystate];  //reduce
    if ((yyn !=0 ) && (yyn += yychar) >= 0 &&
            yyn <= YYTABLESIZE && yycheck[yyn] == yychar)
      {   //we reduced!
      if (yydebug) debug("reduce");
      yyn = yytable[yyn];
      doaction=true; //get ready to execute
      break;         //drop down to actions
      }
    else //ERROR RECOVERY
      {
      if (yyerrflag==0)
        {
        yyerror("syntax error");
        yynerrs++;
        }
      if (yyerrflag < 3) //low error count?
        {
        yyerrflag = 3;
        while (true)   //do until break
          {
          if (stateptr<0)   //check for under & overflow here
            {
            yyerror("stack underflow. aborting...");  //note lower case 's'
            return 1;
            }
          yyn = yysindex[state_peek(0)];
          if ((yyn != 0) && (yyn += YYERRCODE) >= 0 &&
                    yyn <= YYTABLESIZE && yycheck[yyn] == YYERRCODE)
            {
            if (yydebug)
              debug("state "+state_peek(0)+", error recovery shifting to state "+yytable[yyn]+" ");
            yystate = yytable[yyn];
            state_push(yystate);
            val_push(yylval);
            doaction=false;
            break;
            }
          else
            {
            if (yydebug)
              debug("error recovery discarding state "+state_peek(0)+" ");
            if (stateptr<0)   //check for under & overflow here
              {
              yyerror("Stack underflow. aborting...");  //capital 'S'
              return 1;
              }
            state_pop();
            val_pop();
            }
          }
        }
      else            //discard this token
        {
        if (yychar == 0)
          return 1; //yyabort
        if (yydebug)
          {
          yys = null;
          if (yychar <= YYMAXTOKEN) yys = yyname[yychar];
          if (yys == null) yys = "illegal-symbol";
          debug("state "+yystate+", error recovery discards token "+yychar+" ("+yys+")");
          }
        yychar = -1;  //read another
        }
      }//end error recovery
    }//yyn=0 loop
    if (!doaction)   //any reason not to proceed?
      continue;      //skip action
    yym = yylen[yyn];          //get count of terminals on rhs
    if (yydebug)
      debug("state "+yystate+", reducing "+yym+" by rule "+yyn+" ("+yyrule[yyn]+")");
    if (yym>0)                 //if count of rhs not 'nil'
      yyval = val_peek(yym-1); //get current semantic value
    yyval = dup_yyval(yyval); //duplicate yyval if ParserVal is used as semantic value
    switch(yyn)
      {
//########## USER-SUPPLIED ACTIONS ##########
case 1:
//#line 101 "../../src/parser/parser.y"
{ ((List<Definition>)val_peek(1)).add((Definition)val_peek(0)); this.root = new Program(scanner.getLine(), scanner.getColumn(), (List<Definition>)val_peek(1)); }
break;
case 2:
//#line 104 "../../src/parser/parser.y"
{ yyval = val_peek(0); }
break;
case 3:
//#line 105 "../../src/parser/parser.y"
{ yyval = val_peek(0); }
break;
case 4:
//#line 108 "../../src/parser/parser.y"
{ yyval = val_peek(1); mergeDefs((List<Definition>)yyval, val_peek(0)); }
break;
case 5:
//#line 109 "../../src/parser/parser.y"
{ yyval = new ArrayList<Definition>(); }
break;
case 6:
//#line 112 "../../src/parser/parser.y"
{ yyval = new ArrayList<Definition>(); addVarDefs((List<Definition>)yyval, (Type)val_peek(2), (List<String>)val_peek(1), scanner.getLine()); }
break;
case 7:
//#line 113 "../../src/parser/parser.y"
{ yyval = new ArrayList<Definition>(); addVarDefs((List<Definition>)yyval, (Type)val_peek(2), (List<String>)val_peek(1), scanner.getLine()); }
break;
case 8:
//#line 114 "../../src/parser/parser.y"
{ yyval = new ArrayList<Definition>(); addVarDefs((List<Definition>)yyval, (StructType)val_peek(2), (List<String>)val_peek(1), scanner.getLine());}
break;
case 9:
//#line 115 "../../src/parser/parser.y"
{ yyval = new ArrayList<Definition>(); addVarDefs((List<Definition>)yyval, (PunteroType)val_peek(2), (List<String>)val_peek(1), scanner.getLine());}
break;
case 10:
//#line 119 "../../src/parser/parser.y"
{yyval = val_peek(0);}
break;
case 11:
//#line 122 "../../src/parser/parser.y"
{ yyval = val_peek(1); mergeDefs((List<Definition>)yyval, val_peek(0)); }
break;
case 12:
//#line 123 "../../src/parser/parser.y"
{ yyval = new ArrayList<Definition>(); }
break;
case 13:
//#line 126 "../../src/parser/parser.y"
{ yyval = val_peek(3); addFieldDefs((List<Definition>)yyval, (Type)val_peek(2), (List<String>)val_peek(1), scanner.getLine()); }
break;
case 14:
//#line 127 "../../src/parser/parser.y"
{ yyval = new ArrayList<Definition>(); }
break;
case 15:
//#line 131 "../../src/parser/parser.y"
{ yyval = new StructType(scanner.getLine(), scanner.getColumn(), (List<Definition>)val_peek(1));}
break;
case 16:
//#line 134 "../../src/parser/parser.y"
{ yyval = new DefFunc(scanner.getLine(), scanner.getColumn(),(Type) new FuncType(scanner.getLine(), scanner.getColumn(), (Type)VoidType.getInstance(), (List<Definition>) new ArrayList()), "main", (List<Definition>)val_peek(2), (List<Statement>)val_peek(1)); }
break;
case 17:
//#line 137 "../../src/parser/parser.y"
{ yyval = new DefFunc(scanner.getLine(), scanner.getColumn(), (Type)new FuncType(scanner.getLine(), scanner.getColumn(), (Type)val_peek(8), (List<Definition>)val_peek(5)), (String)val_peek(7), (List<Definition>)val_peek(2), (List<Statement>)val_peek(1)); }
break;
case 18:
//#line 138 "../../src/parser/parser.y"
{ yyval = new DefFunc(scanner.getLine(), scanner.getColumn(),(Type) new FuncType(scanner.getLine(), scanner.getColumn(), (Type)VoidType.getInstance(), (List<Definition>)val_peek(5)), (String)val_peek(7), (List<Definition>)val_peek(2), (List<Statement>)val_peek(1)); }
break;
case 19:
//#line 143 "../../src/parser/parser.y"
{ ((List<Definition>)yyval).add(new DefVar(scanner.getLine(), scanner.getColumn(), (Type)val_peek(1), (String)val_peek(0))); yyval = val_peek(3); }
break;
case 20:
//#line 144 "../../src/parser/parser.y"
{ yyval = new ArrayList<Definition>();((List<Definition>)yyval).add(new DefVar(scanner.getLine(), scanner.getColumn(), (Type)val_peek(1), (String)val_peek(0))); }
break;
case 21:
//#line 147 "../../src/parser/parser.y"
{ yyval = val_peek(0);}
break;
case 22:
//#line 148 "../../src/parser/parser.y"
{ yyval = new ArrayList<Definition>(); }
break;
case 23:
//#line 151 "../../src/parser/parser.y"
{ yyval = IntType.getInstance(); }
break;
case 24:
//#line 152 "../../src/parser/parser.y"
{ yyval = RealType.getInstance(); }
break;
case 25:
//#line 153 "../../src/parser/parser.y"
{ yyval = CharType.getInstance(); }
break;
case 26:
//#line 156 "../../src/parser/parser.y"
{ yyval = getArrayDef((Type)val_peek(3), (Integer)val_peek(1), scanner.getLine()); }
break;
case 27:
//#line 159 "../../src/parser/parser.y"
{ yyval = val_peek(0);}
break;
case 28:
//#line 160 "../../src/parser/parser.y"
{ yyval = val_peek(0);}
break;
case 29:
//#line 161 "../../src/parser/parser.y"
{ yyval = val_peek(0);}
break;
case 30:
//#line 163 "../../src/parser/parser.y"
{ yyval = val_peek(0);}
break;
case 31:
//#line 166 "../../src/parser/parser.y"
{ yyval = getPunteroDef((Type)val_peek(1), scanner.getLine());}
break;
case 32:
//#line 169 "../../src/parser/parser.y"
{ ((List<String>)yyval).add((String)val_peek(0)); yyval = val_peek(2);  }
break;
case 33:
//#line 170 "../../src/parser/parser.y"
{ yyval = new ArrayList<String>(); ((List<String>)yyval).add((String)val_peek(0)); }
break;
case 34:
//#line 173 "../../src/parser/parser.y"
{ ((List<Statement>)yyval).add((Statement)val_peek(0)); yyval = val_peek(1); }
break;
case 35:
//#line 174 "../../src/parser/parser.y"
{ yyval = new ArrayList<Statement>(); }
break;
case 36:
//#line 177 "../../src/parser/parser.y"
{ yyval = new Return(scanner.getLine(), scanner.getColumn(), (Expression)val_peek(1)); }
break;
case 37:
//#line 178 "../../src/parser/parser.y"
{ yyval = new Read(scanner.getLine(), scanner.getColumn(), (List<Expression>)val_peek(1)); }
break;
case 38:
//#line 179 "../../src/parser/parser.y"
{ yyval = new Write(scanner.getLine(), scanner.getColumn(), (List<Expression>)val_peek(1)); }
break;
case 39:
//#line 180 "../../src/parser/parser.y"
{ yyval = val_peek(0);}
break;
case 40:
//#line 181 "../../src/parser/parser.y"
{ yyval = val_peek(0);}
break;
case 41:
//#line 182 "../../src/parser/parser.y"
{ yyval = new Assignment(scanner.getLine(), scanner.getColumn(), (Expression)val_peek(3), (Expression)val_peek(1)); }
break;
case 42:
//#line 183 "../../src/parser/parser.y"
{ yyval = new InvocationSt(scanner.getLine(), scanner.getColumn(), (String)val_peek(4), (List<Expression>)val_peek(2)); }
break;
case 43:
//#line 186 "../../src/parser/parser.y"
{ yyval = new While(scanner.getLine(), scanner.getColumn(), (Expression)val_peek(4), (List<Statement>)val_peek(1)); }
break;
case 44:
//#line 187 "../../src/parser/parser.y"
{ yyval = new While(scanner.getLine(), scanner.getColumn(), (Expression)val_peek(2), (Statement)val_peek(0)); }
break;
case 45:
//#line 190 "../../src/parser/parser.y"
{ yyval = new IfElse(scanner.getLine(), scanner.getColumn(), (Expression)val_peek(8), (List<Statement>)val_peek(5), (List<Statement>)val_peek(1)); }
break;
case 46:
//#line 191 "../../src/parser/parser.y"
{ yyval = new IfElse(scanner.getLine(), scanner.getColumn(), (Expression)val_peek(6), (List<Statement>)val_peek(3), (Statement)val_peek(0)); }
break;
case 47:
//#line 192 "../../src/parser/parser.y"
{ yyval = new IfElse(scanner.getLine(), scanner.getColumn(), (Expression)val_peek(6), (Statement)val_peek(4), (List<Statement>)val_peek(1)); }
break;
case 48:
//#line 193 "../../src/parser/parser.y"
{ yyval = new IfElse(scanner.getLine(), scanner.getColumn(), (Expression)val_peek(4), (Statement)val_peek(2), (Statement)val_peek(0)); }
break;
case 49:
//#line 194 "../../src/parser/parser.y"
{ yyval = new IfElse(scanner.getLine(), scanner.getColumn(), (Expression)val_peek(4), (List<Statement>)val_peek(1), new ArrayList()); }
break;
case 50:
//#line 195 "../../src/parser/parser.y"
{ yyval = new IfElse(scanner.getLine(), scanner.getColumn(), (Expression)val_peek(2), (Statement)val_peek(0), new ArrayList()); }
break;
case 51:
//#line 198 "../../src/parser/parser.y"
{ yyval = val_peek(0); }
break;
case 52:
//#line 199 "../../src/parser/parser.y"
{ yyval = new ArrayList<Expression>(); }
break;
case 53:
//#line 202 "../../src/parser/parser.y"
{ yyval = val_peek(2); ((List<Expression>)yyval).add((Expression)val_peek(0)); }
break;
case 54:
//#line 203 "../../src/parser/parser.y"
{ yyval = new ArrayList<Expression>(); ((List<Expression>)yyval).add((Expression)val_peek(0)); }
break;
case 55:
//#line 206 "../../src/parser/parser.y"
{ yyval = new ArithmeticOperation(scanner.getLine(), scanner.getColumn(), (Expression)val_peek(2), (Expression)val_peek(0), "+"); }
break;
case 56:
//#line 207 "../../src/parser/parser.y"
{ yyval = new ArithmeticOperation(scanner.getLine(), scanner.getColumn(), (Expression)val_peek(2), (Expression)val_peek(0), "*"); }
break;
case 57:
//#line 208 "../../src/parser/parser.y"
{ yyval = new ArithmeticOperation(scanner.getLine(), scanner.getColumn(), (Expression)val_peek(2), (Expression)val_peek(0), "/"); }
break;
case 58:
//#line 209 "../../src/parser/parser.y"
{ yyval = new ArithmeticOperation(scanner.getLine(), scanner.getColumn(), (Expression)val_peek(2), (Expression)val_peek(0), "-"); }
break;
case 59:
//#line 210 "../../src/parser/parser.y"
{ yyval = new ArithmeticOperation(scanner.getLine(), scanner.getColumn(), (Expression)val_peek(2), (Expression)val_peek(0), "%"); }
break;
case 60:
//#line 211 "../../src/parser/parser.y"
{ yyval = new CompOperation(scanner.getLine(), scanner.getColumn(), (Expression)val_peek(2), (Expression)val_peek(0), "=="); }
break;
case 61:
//#line 212 "../../src/parser/parser.y"
{ yyval = new CompOperation(scanner.getLine(), scanner.getColumn(), (Expression)val_peek(2), (Expression)val_peek(0), "!="); }
break;
case 62:
//#line 213 "../../src/parser/parser.y"
{ yyval = new CompOperation(scanner.getLine(), scanner.getColumn(), (Expression)val_peek(2), (Expression)val_peek(0), ">"); }
break;
case 63:
//#line 214 "../../src/parser/parser.y"
{ yyval = new CompOperation(scanner.getLine(), scanner.getColumn(), (Expression)val_peek(2), (Expression)val_peek(0), "<"); }
break;
case 64:
//#line 215 "../../src/parser/parser.y"
{ yyval = new CompOperation(scanner.getLine(), scanner.getColumn(), (Expression)val_peek(2), (Expression)val_peek(0), "<="); }
break;
case 65:
//#line 216 "../../src/parser/parser.y"
{ yyval = new CompOperation(scanner.getLine(), scanner.getColumn(), (Expression)val_peek(2), (Expression)val_peek(0), ">="); }
break;
case 66:
//#line 217 "../../src/parser/parser.y"
{ yyval = new LogicOperation(scanner.getLine(), scanner.getColumn(), (Expression)val_peek(2), (Expression)val_peek(0), "&&"); }
break;
case 67:
//#line 218 "../../src/parser/parser.y"
{ yyval = new LogicOperation(scanner.getLine(), scanner.getColumn(), (Expression)val_peek(2), (Expression)val_peek(0), "||"); }
break;
case 68:
//#line 219 "../../src/parser/parser.y"
{ yyval = new Cast(scanner.getLine(), scanner.getColumn(), (Type)val_peek(2), (Expression)val_peek(0)); }
break;
case 69:
//#line 220 "../../src/parser/parser.y"
{ yyval = new ArrayAccess(scanner.getLine(), scanner.getColumn(), (Expression)val_peek(3), (Expression)val_peek(1)); }
break;
case 70:
//#line 221 "../../src/parser/parser.y"
{ yyval = new StructAccess(scanner.getLine(), scanner.getColumn(), (Expression)val_peek(2), (String)val_peek(0)); }
break;
case 71:
//#line 222 "../../src/parser/parser.y"
{ yyval = new InvocationExp(scanner.getLine(), scanner.getColumn(), (String)val_peek(3), (List<Expression>)val_peek(1)); }
break;
case 72:
//#line 223 "../../src/parser/parser.y"
{ yyval = new UnaryMinus(scanner.getLine(), scanner.getColumn(), (Expression)val_peek(0)); }
break;
case 73:
//#line 224 "../../src/parser/parser.y"
{ yyval = val_peek(1); }
break;
case 74:
//#line 225 "../../src/parser/parser.y"
{ yyval = new UnaryNot(scanner.getLine(), scanner.getColumn(), (Expression)val_peek(0)); }
break;
case 75:
//#line 226 "../../src/parser/parser.y"
{ yyval = new LiteralInt(scanner.getLine(), scanner.getColumn(), (Integer)val_peek(0)); }
break;
case 76:
//#line 227 "../../src/parser/parser.y"
{ yyval = new Variable(scanner.getLine(), scanner.getColumn(), (String)val_peek(0)); }
break;
case 77:
//#line 228 "../../src/parser/parser.y"
{ yyval = new LiteralChar(scanner.getLine(), scanner.getColumn(), (Character)val_peek(0)); }
break;
case 78:
//#line 229 "../../src/parser/parser.y"
{ yyval = new LiteralReal(scanner.getLine(), scanner.getColumn(), (Double)val_peek(0)); }
break;
case 79:
//#line 231 "../../src/parser/parser.y"
{ yyval = new PunteroAddressAccess(scanner.getLine(), scanner.getColumn(), (Expression)val_peek(0)); }
break;
case 80:
//#line 232 "../../src/parser/parser.y"
{ yyval = new PunteroValueAccess(scanner.getLine(), scanner.getColumn(), (Expression)val_peek(0)); }
break;
//#line 1242 "Parser.java"
//########## END OF USER-SUPPLIED ACTIONS ##########
    }//switch
    //#### Now let's reduce... ####
    if (yydebug) debug("reduce");
    state_drop(yym);             //we just reduced yylen states
    yystate = state_peek(0);     //get new state
    val_drop(yym);               //corresponding value drop
    yym = yylhs[yyn];            //select next TERMINAL(on lhs)
    if (yystate == 0 && yym == 0)//done? 'rest' state and at first TERMINAL
      {
      if (yydebug) debug("After reduction, shifting from state 0 to state "+YYFINAL+"");
      yystate = YYFINAL;         //explicitly say we're done
      state_push(YYFINAL);       //and save it
      val_push(yyval);           //also save the semantic value of parsing
      if (yychar < 0)            //we want another character?
        {
        yychar = yylex();        //get next character
        if (yychar<0) yychar=0;  //clean, if necessary
        if (yydebug)
          yylexdebug(yystate,yychar);
        }
      if (yychar == 0)          //Good exit (if lex returns 0 ;-)
         break;                 //quit the loop--all DONE
      }//if yystate
    else                        //else not done yet
      {                         //get next state and push, for next yydefred[]
      yyn = yygindex[yym];      //find out where to go
      if ((yyn != 0) && (yyn += yystate) >= 0 &&
            yyn <= YYTABLESIZE && yycheck[yyn] == yystate)
        yystate = yytable[yyn]; //get new state
      else
        yystate = yydgoto[yym]; //else go to new defred
      if (yydebug) debug("after reduction, shifting from state "+state_peek(0)+" to state "+yystate+"");
      state_push(yystate);     //going again, so push state & val...
      val_push(yyval);         //for next action
      }
    }//main loop
  return 0;//yyaccept!!
}
//## end of method parse() ######################################



//## run() --- for Thread #######################################
/**
 * A default run method, used for operating this parser
 * object in the background.  It is intended for extending Thread
 * or implementing Runnable.  Turn off with -Jnorun .
 */
public void run()
{
  yyparse();
}
//## end of method run() ########################################



//## Constructors ###############################################
/**
 * Default constructor.  Turn off with -Jnoconstruct .

 */
public Parser()
{
  //nothing to do
}


/**
 * Create a parser, setting the debug to true or false.
 * @param debugMe true for debugging, false for no debug.
 */
public Parser(boolean debugMe)
{
  yydebug=debugMe;
}
//###############################################################



}
//################### END OF CLASS ##############################

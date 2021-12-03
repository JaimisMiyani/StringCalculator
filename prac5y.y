%{
#include <stdio.h>
#include <stdlib.h>
void yyerror(char *str);
int yylex();
extern float values[20];
%}
%union
{
int ival;
float fval;
}
%right '='
%left '+' '-'
%left '*' '/'
%token ';'
%token <ival> NUM
%token <ival> ID
%token <fval> FNUM
%type <fval> E
%%
SS  :  SS  S
       |  S
;
S   :  E ';'  { printf("answer is %f\n", $1);}
E   :  E '+' E { $$ = $1 + $3; }
  | E '/' E {$$ = $1 / $3;}
  | E '*' E {$$ = $1 * $3;}
  | E '-' E {$$ = $1 - $3;}
  | ID '=' E { values[$1]=$3; $$=values[$1]; } 
  | NUM { $$=$1;}
  | FNUM {$$=$1;}
  | ID { $$=values[$1];}
  ;
%%
int main()
{
yyparse();
return 0;
}
void yyerror(char *str)
{
printf("Syntax Error:%s\n",str);
}
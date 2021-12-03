%{
#include "y.tab.h"
#include <string.h>
int cnt=0;
char names[20][8]={0};
float values[20]={0};
%}
%%
[0-9]+ {yylval.ival=atoi(yytext); return NUM;}
[0-9]*"."[0-9]+ {yylval.fval=atof(yytext); return FNUM;}
[-+*/;=] {return yytext[0];}
([_a-zA-Z][0-9]*)+ {yylval.ival=lookup(yytext); return ID;}

%%

int lookup (char str[])
{
int i;
for(i=0;i<cnt;i++)
 {
   if(strcmp(names[i],str)==0)
	return i;
 }
strcpy(names[i],str);
cnt++;
return i;
}
int yywrap(){return(1);}
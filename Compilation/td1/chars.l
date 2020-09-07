%{
#include<ctype.h>
%}
char [^\"]
chars \"(\\.|{char})*\"
%%
{chars} {for(char *s = yytext; *s; s++){
        putchar(toupper(*s));
}}

%%
int main(){return yylex();}
int yywrap(){return 1;}





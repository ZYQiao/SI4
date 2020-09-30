

%{
#include <ctype.h>
%}
signe      [+-]
digit      [0-9]
nombre     {digit}+
exposant   [eE]{signe}?{digit}+

reel        {signe}?(({nombre}\.?{digit}*)|\.{nombre}){exposant}?


%%
{reel}     printf("<NOMBRE '%s'>", yytext);
.|\n       ECHO;

%%
int main() {
    return yylex();
}
int yywrap() { 
    return 1; 
}

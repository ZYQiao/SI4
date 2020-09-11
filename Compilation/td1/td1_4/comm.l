%{
#include <ctype.h>
%}
%option noyywrap
%%
\"(\\.|[^\"])*\" ECHO;
"/*"([^*]|[*]*[^*/])*"*/" putc(' ', yyout);
"//"(.)* putc(' ', yyout);
%%
int main() {
    return yylex();
}

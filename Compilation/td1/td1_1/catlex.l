

%{
#include <ctype.h>
%}

%option noyywrap

%%
[a-z]  {putchar(toupper(yytext[0]));}
.|\n    ECHO;

%%
int main() {
    return yylex();
}

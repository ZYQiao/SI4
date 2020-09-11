

%{
#include <ctype.h>
%}
char [^\"]
chars \"(\\.|{char})*\"
char4 ^\s\*.*
char3 ^\/\*
char2 \/\*.*\*\/
char1 \/\/(.)*
%option noyywrap

%%
{chars} {for(char *s = yytext; *s; s++){
        putchar(*s);
}}

{char1} {for(char *s = yytext; *s; s++){}}

{char2} {for(char *s = yytext; *s; s++){}}

{char3} {for(char *s = yytext; *s; s++){}}

{char4} {for(char *s = yytext; *s; s++){putchar(toupper(*s));}}

%%
int main() {
    return yylex();
}

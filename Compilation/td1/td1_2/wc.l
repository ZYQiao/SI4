%{
#include <ctype.h>
int char_count = 0, word_count = 0, line_count = 0;
%}
char [A-Za-z\_\'\.\"\,0-9]
word {char}+
delim [" "\n\t]
line [\n]
%option noyywrap
%%
{word}  {word_count++; char_count+=strlen(yytext);} 
{line}  {line_count++; char_count++;}
.   {char_count++;}
%%
int main(){
    yylex();
    printf("%d\t%d\t%d\n",line_count, word_count, char_count++);
    return 1;
}


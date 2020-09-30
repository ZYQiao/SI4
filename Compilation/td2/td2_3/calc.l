/*
 *  calc.l              -- Un lexical simple pour une calculette avec variables
*/

%{
#include <stdio.h>
#include "calc.h"
%}

%option noyywrap

%%
[0-9]+                  { yylval.val = atoi(yytext); return NUMBER; }
[a-zA-Z]+               { yylval.var = strdup(yytext); return IDENT; }

"+"                     { return PLUS;  }
"-"                     { return MINUS; }
"*"                     { return MULT;  }
"/"                     { return DIV;   }
"("                     { return OPEN;  }
")"                     { return CLOSE; }
"="                     { return EQUAL; }
\n                      { return EOL; }



[ \t]                   { }
.                       { fprintf(stderr, "Unexpected character %c (%d)\n",
                                          *yytext, *yytext); }
%%

%{
#include "y.tab.h"
%}

%%
x|y[a]+    { return yytext; }
.          { return 0; /* end when meet everything else */ }
%%

int yywrap(void) { 
    return 1;
}
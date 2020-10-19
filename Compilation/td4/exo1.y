%{
#include <ctype.h>
int yylex(void)
%}



%%

S   :   S 'a'         { printf("regle 1"); }
    |   'x'           { printf("regle 2"); }
    |   'y'           { printf("regle 3"); }
    ;


%%
yylex();
yyerror();

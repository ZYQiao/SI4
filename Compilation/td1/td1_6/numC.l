
%{
  #include <stdlib.h>
%}

%%
0x[0-9a-fA-F]+          { printf("Hexadecimal: %d\n", strtol(yytext+2, NULL, 16)); }
0[0-7]*                 { printf("Octal: %d\n", strtol(yytext, NULL, 8)); }
[1-9][0-9]*             { printf("Decimal: %d\n", strtol(yytext, NULL, 10)); }

  /* Les autres caractÃ¨res */
.|\n                    { ; }
%%

int main()   { return yylex(); }
int yywrap() { return 1; }
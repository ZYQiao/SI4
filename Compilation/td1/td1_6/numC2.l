
%{
  #include <stdlib.h>
  int value = 0;
%}

%x      OCTAL DEC HEXA

%%
"0x"                    { value = 0; BEGIN HEXA; }
<HEXA>[0-9]             { value = 16 * value + *yytext - '0'; }
<HEXA>[a-f]             { value = 16 * value + *yytext - 'a' + 10; }
<HEXA>[A-F]             { value = 16 * value + *yytext - 'A' + 10; }
<HEXA>[^0-9a-fA-F]      { printf("Héxadécimal: %d\n", value); BEGIN INITIAL; }

"0"                     { value = 0; BEGIN OCTAL; }
<OCTAL>[0-7]            { value = 8 * value + *yytext - '0'; }
<OCTAL>[^0-7]           { printf("Octal: %d\n", value); BEGIN INITIAL; }

[1-9]                   { value = *yytext - '0'; BEGIN DEC; }
<DEC>[0-9]              { value = 10 * value + *yytext - '0'; }
<DEC>[^0-9]             { printf("Décimal: %d\n", value); BEGIN INITIAL; }

  /* Les autres caractères */
.|\n                    { ; }
%%

int main()   { return yylex(); }
int yywrap() { return 1; }
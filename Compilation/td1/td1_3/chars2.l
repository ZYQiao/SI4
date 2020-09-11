%{
  #include <ctype.h>
%}
%x STRING

%%
\"                { putchar('"'); BEGIN STRING; }
<STRING>\"        { putchar('"'); BEGIN INITIAL; }
<STRING>\\.       { printf("%s", yytext); }
<STRING>.         { putchar(toupper(*yytext)); }

.|\n                 { ECHO; }

%%

int main()   { return yylex(); }
int yywrap() { return 1; }

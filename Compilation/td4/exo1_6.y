%{
  #include <stdio.h>
  #include <ctype.h>

  void yyerror(const char* msg);
  int yylex(void);
  void prompt(void);

  int lineno = 0;
%}

%%
G:              G S '\n'                { printf("Analysis OK\n"); prompt();}
        |       /* empty */
        ;

S:              S 'a'                   { printf("Règle S -> Sa (r1)\n"); }
        |       'x'                     { printf("Règle S -> x  (r2)\n"); }
        |       'y'                     { printf("Règle S -> y  (r3)\n"); }
        ;

%%
int main() {
    prompt();
    return yyparse(); 
}

void yyerror(const char* msg) {
    // Ici le token est toujours un caractère (càd un entier < 256) 
    // puisque nous n'avons pas encore utilisé de directive %token
    fprintf(stderr, "Error: line %d. Token: %c", lineno, yychar);
    fprintf(stderr, " %s\n", msg);
    main();
    
}

int yylex(void) {
    int c;

    do
        c =getchar();
    while (c == ' ' || c == '\t');

    return c;
}

void prompt(void) {
  fflush(stdout);
  printf("[%d]\n", lineno+=1);
  
}
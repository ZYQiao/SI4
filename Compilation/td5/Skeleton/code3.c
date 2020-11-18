/*
 * code2.c 	-- Production of code for a stack machine
 *
 * Copyright © 2015 Erick Gallesio - I3S-CNRS/Polytech Nice-Sophia <eg@unice.fr>
 *
 *           Author: Erick Gallesio [eg@unice.fr]
 *    Creation date: 22-Oct-2015 22:48 (eg)
 * Last file update:  4-Nov-2015 17:09 (eg)
 */

#include <stdio.h>
#include <string.h>
#include <stdlib.h>

#include "calc.h"
#include "syntax.h"



#define PROD1N(k,v)	 printf("\tbox%d [label=\"%g\",fillcolor=\"tomato\"]\n",k,v)  // v is a number
#define PROD1I(k,v)	 printf("\tbox%d [label=\"%s\",fillcolor=\"peru\"]\n",k,v)   // v is a ident
#define PROD1O(k,v)	 printf("\tbox%d [label=\"[%s]\",fillcolor=\"turquoise4\"]\n",k,v) // v is a opreator
#define PROD1B(k1,k2)	 printf("\t\tbox%d -> box%d;\n",k1,k2) // k2 is the son of the k1
// ----------------------------------------------------------------------
//    Graph machine
// ---------------------------------------------------------------------
int k = 0;

void my_type(ast_node *op){
  switch (AST_KIND(op)) {
    case k_ident:
      PROD1I(++k,VAR_NAME(op));
      break;
    case k_number:
      PROD1N(++k,NUMBER_VALUE(op));
      break;
    default:
      break;
    }
}

void eval(ast_node *n) {  
  if(!n) return;
  
  switch (AST_KIND(n)) {
    case k_number : 
      PROD1N(++k,NUMBER_VALUE(n));
      break;
    case k_ident :
      PROD1I(++k,VAR_NAME(n));
      break;
    case k_operator: {
      ast_node **op = OPER_OPERANDS(n);
      int arity     = OPER_ARITY(n);

      switch (OPER_OPERATOR(n)) {
      /* Expressions */
        case UMINUS:	  {
          int t = ++k;
          PROD1O(t,"_");
          PROD1N(++k,NUMBER_VALUE(op[0]));
          PROD1B(t,t+1);
          break;
        }
        case '+':       {
          int t = ++k;
          PROD1O(t,"+");
          my_type(op[0]);
          PROD1B(t,t+1);
          int t1 = k;
          my_type(op[1]);
          PROD1B(t,++t1);
          break;  
        }
        case '-':       {
          int t = ++k;
          PROD1O(t,"-");
          my_type(op[0]);
          PROD1B(t,t+1);
          int t1 = k;
          my_type(op[1]);
          PROD1B(t,++t1);
          break;   
        }
        case '*':       {
          int t = ++k;
          PROD1O(t,"*");
          my_type(op[0]);
          PROD1B(t,t+1);
          int t1 = k;
          my_type(op[1]);
          PROD1B(t,++t1);
          break;  
        }
        case '/':       {
          int t = ++k;
          PROD1O(t,"/");
          my_type(op[0]);
          PROD1B(t,t+1);
          int t1 = k;
          my_type(op[1]);
          PROD1B(t,++t1);
          break;   
        }     
        case '>':       {  
          int t = ++k;
          PROD1O(t,">");
          my_type(op[0]);
          PROD1B(t,t+1);
          int t1 = k;
          my_type(op[1]);
          PROD1B(t,++t1);
          break; 
        }
        case GE:        {
          int t = ++k;
          PROD1O(t,">=");
          my_type(op[0]);
          PROD1B(t,t+1);
          int t1 = k;
          my_type(op[1]);
          PROD1B(t,++t1);
          break; 
        }
        case '<': 
        {
          int t = ++k;
          PROD1O(t,"<");
          my_type(op[0]);
          PROD1B(t,t+1);
          int t1 = k;
          my_type(op[1]);
          PROD1B(t,++t1);
          break; 
        } 
        case LE:        {
          int t = ++k;
          PROD1O(t,"<=");
          my_type(op[0]);
          PROD1B(t,t+1);
          int t1 = k;
          my_type(op[1]);
          PROD1B(t,++t1);
          break; 
        }
        case NE:        {
          int t = ++k;
          PROD1O(t,"!=");
          my_type(op[0]);
          PROD1B(t,t+1);
          int t1 = k;
          my_type(op[1]);
          PROD1B(t,++t1);
          break; 
        }
        case EQ:        {
          int t = ++k;
          PROD1O(t,"==");
          my_type(op[0]);
          PROD1B(t,t+1);
          int t1 = k;
          my_type(op[1]);
          PROD1B(t,++t1);
          break; 
        }
        case KWHILE:    {
          int t = ++k;
          PROD1O(t,"while");
          eval(op[0]);
          PROD1B(t,t+1);
          int t1 = k;
          eval(op[1]);
          PROD1B(t,++t1);
          break;
        }
        case KIF:       {
          int t = ++k;
          PROD1O(t,"if");
          eval(op[0]);
          PROD1B(t,t+1);
          int t1 = k;
          eval(op[1]);
          PROD1B(t,++t1);
          if (arity > 2) {
            int t2 = k;
            eval(op[2]);
            PROD1B(t,++t2);
          }

          break; 
        } 

      /* Statements */
        	case ';':	    {
            if (arity == 0) {
              break;
            }else {
              int t = ++k;
              PROD1O(t,";");
              eval(op[0]);
              PROD1B(t,t+1);
              int t1 = k;
              eval(op[1]);
              PROD1B(t,++t1);
              break;
            }
          }
          case KPRINT:  {
            int t = ++k;
            PROD1O(t,"print");
            eval(op[0]);
            PROD1B(t,t+1);
            break;
          }
          case '=':     {
            int t = ++k;
            PROD1O(t,"=");
            eval(op[0]);
            PROD1B(t,t+1);
            int t1 = k;
            eval(op[1]);
            PROD1B(t,++t1);
            break;
          }
          default:      {      
            error_msg("Houston, we have a problem: unattended token %d",
            OPER_OPERATOR(n));
            return;
          }
      }
    
    }
      
    default:
      return;
  }
}

// ----------------------------------------------------------------------
//		Code production
//			This version produces a dot file
// ---------------------------------------------------------------------
void produce_code(ast_node *n) {
  printf("digraph E{\n");
  printf("\tnode [style=\"filled\"];\n");
  eval(n); 
  printf("}\n");
}

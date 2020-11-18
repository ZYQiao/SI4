/*
 * code2.c 	-- Production of code for a stack machine
 *
 * Copyright © 2015 Erick Gallesio - I3S-CNRS/Polytech Nice-Sophia <eg@unice.fr>
 *
 *           Author: Erick Gallesio [eg@unice.fr]
 *    Creation date: 21-Oct-2015 15:31 (eg)
 * Last file update:  4-Nov-2015 17:06 (eg)
 */

#include <stdio.h>
#include <string.h>
#include <stdlib.h>

#include "calc.h"
#include "syntax.h"

// ----------------------------------------------------------------------
//		Utilities
// ---------------------------------------------------------------------
#define LABEL(n)	 printf("L%03d:\n", n);	        // output a label

#define PROD0(op)	 printf("\t%s\n", op)
#define PROD1F(op,v)	 printf("\t%s\t%g\n", op, v)    // v is a float
#define PROD1S(op,v)	 printf("\t%s\t%s\n", op, v)    // v is a string
#define PROD1L(op,v)	 printf("\t%s\tL%03d\n", op, v) // v is a label

int k = -1;
void my_type(ast_node *op){
  switch (AST_KIND(op)) {
    case k_ident:
      PROD1S("load",VAR_NAME(op));
      break;
    case k_number:
      PROD1F("push",NUMBER_VALUE(op));
      break;
    default:
      break;
    }
}


// ----------------------------------------------------------------------
//    Stack machine
// ---------------------------------------------------------------------
void eval(ast_node *n) {  
  if(!n) return;
  
  switch (AST_KIND(n)) {
    case k_number : 
      PROD1F("push",NUMBER_VALUE(n));
      break;
    case k_ident :
      PROD1S("store",VAR_NAME(n));
      break;
    case k_operator: {
      ast_node **op = OPER_OPERANDS(n);
      int arity     = OPER_ARITY(n);

      switch (OPER_OPERATOR(n)) {
      /* Expressions */
        case UMINUS:	  {
          PROD1F("push",NUMBER_VALUE(op[0]));
          PROD0("negate");
          break;
        }
        case '+':       {
          my_type(op[0]);
          my_type(op[1]);
          PROD0("add");
          break;  
        }
        case '-':       {
          my_type(op[0]);
          my_type(op[1]);
          PROD0("sub"); 
          break; 
        }
        case '*':       {
          my_type(op[0]);
          my_type(op[1]);
          PROD0("mul");  
          break;
        }
        case '/':       {
          my_type(op[0]);
          my_type(op[1]);
          PROD0("div"); 
          break; 
        }     
        case '>':       {  
          my_type(op[0]);
          my_type(op[1]);
          PROD0("cmpge");  
          break;
        }
        case GE:        {
          my_type(op[0]);
          my_type(op[1]);
          PROD0("cmpgt");  
          break;
        }
        case '<': 
        {
          my_type(op[0]);
          my_type(op[1]);
          PROD0("cmple");  
          break;
        } 
        case LE:        {
          my_type(op[0]);
          my_type(op[1]);
          PROD0("cmplt");  
          break;
        }
        case NE:        {
          my_type(op[0]);
          my_type(op[1]);
          PROD0("cmpnt");  
          break;
        }
        case EQ:        {
          my_type(op[0]);
          my_type(op[1]);
          PROD0("cmpet");  
          break;
        }
        case KWHILE:    {
          k++;
          LABEL(k);
          eval(op[0]);
          PROD1L("jumpz",++k);
          eval(op[1]);
          PROD1L("jump",k-1);
          LABEL(k);
          break;
        }
        case KIF:       {
          eval(op[0]);
          PROD1L("jumpz",++k);
          int t = k;
          eval(op[1]);
          if(OPER_OPERATOR(op[1]) != KIF && OPER_OPERATOR(op[1]) !=  KWHILE)
            PROD1L("jump",k+1);
          LABEL(t);
          if (arity > 2) {
            eval(op[2]);
            LABEL(++k);
          }

          break; 
        } 

      /* Statements */
        	case ';':	    {
            if (arity == 0) {
              break;
            }else {
              eval(op[0]);
              eval(op[1]);
              break;
            }
          }
          case KPRINT:  {
            eval(op[0]);
            PROD0("print");
            break;
          }
          case '=':     {
            eval(op[1]);
            PROD1S("store",VAR_NAME(op[0]));
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
//			This version produces code for a stack machine
// ---------------------------------------------------------------------
void produce_code(ast_node *n) {
  eval(n);
}

//=======================================================================
//class Expression
//      Specification and implementation
//-----------------------------------------------------------------------
// Julien DeAntoni (inspired from Jean-Paul Rigault course)
// April 2010
//=======================================================================

#include "Unary_Minus.h"
int Unary_Expr::eval() {
    return 0-op->eval();
}
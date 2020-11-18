//=======================================================================
//class Expression
//      Specification and implementation
//-----------------------------------------------------------------------
// Julien DeAntoni (inspired from Jean-Paul Rigault course)
// April 2010
//=======================================================================


#include "Constant.h"

Constant& Constant::operator=(int v) {
    Constant c(v);
    return c;
}
//=======================================================================
//class Expression
//      Specification and implementation
//-----------------------------------------------------------------------
// Julien DeAntoni (inspired from Jean-Paul Rigault course)
// April 2010
//=======================================================================


#include "Constant.h"
int Constant::eval() {return val;}
Constant Constant::operator=(int v) {
    return Constant(v);
}
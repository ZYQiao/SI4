#include <iostream>
#include "A.h"
using namespace std;

int main() {
    A clock(1,2,3);
    string s = "ouch";

    string * pt_s = new string(s);

    std::cout << "Hello, World!" << std::endl;
    return 0;
}

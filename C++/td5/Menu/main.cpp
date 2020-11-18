#include <iostream>
#include "WalkingMenu.h"
#include "SimpleMenuItem.h"
int main() {
    Menu m("LE MENU");
    MenuItem m1("emacs");
    MenuItem m2("htop");
    WalkingMenu m3("COMMUNICATIONS");
    MenuItem m4("quitter");
    MenuItem m5("pidgin");
    MenuItem m6("thunderbird");
    SimpleMenuItem m7("rsync my home",&m);
    MenuItem m8("traceroute");

    m.addItem(&m1);
    m.addItem(&m2);
    m.addItem(&m3);
    m.addItem(&m4);

    m3.addItem(&m5);
    m3.addItem(&m6);
    m3.addItem(&m7);
    m3.addItem(&m8);
    m.activate();

    return 0;
}

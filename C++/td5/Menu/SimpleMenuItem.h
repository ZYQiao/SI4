//
// Created by ZHAO YUQIAO on 10/11/2020.
//

#ifndef MENU_SIMPLEMENUITEM_H
#define MENU_SIMPLEMENUITEM_H
#include "MenuItem.h"

#include <utility>
#include "iostream"
#include "Menu.h"

using namespace std;

class SimpleMenuItem: public MenuItem{
private:
    Menu* lastMenu;
public:
    SimpleMenuItem()= default;
    explicit SimpleMenuItem(string t,Menu* m = nullptr):MenuItem(t){lastMenu = m;}
    void execute() override{
            cout<<" ************** Execution de "+text<<endl;
            lastMenu->activate();
    }
};
#endif //MENU_SIMPLEMENUITEM_H

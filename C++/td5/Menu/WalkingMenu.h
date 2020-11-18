//
// Created by ZHAO YUQIAO on 10/11/2020.
//

#ifndef MENU_WALKINGMENU_H
#define MENU_WALKINGMENU_H
#include "iostream"
#include "MenuItem.h"
#include "Menu.h"
using namespace std;

class WalkingMenu: public Menu,public MenuItem{
protected:

public:
    WalkingMenu(const string& t):Menu(t),MenuItem(t){}

    string getText() override{
        return text+" ->";
    }

    string getTitle(){
        return text+" ->";
    }



    void activate(){
        while (true) {
            int op = input();
            if(op<0||op>ms.size()-1){
                throw "input error";
            }else if(ms[op]->getText() == "rsync my home"){
                ms[op]->execute();
                break;
            } else{
                ms[op]->execute();
            }
        }
    }

    void execute() override{
            activate();
    }




};
#endif //MENU_WALKINGMENU_H

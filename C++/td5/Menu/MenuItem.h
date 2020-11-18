//
// Created by ZHAO YUQIAO on 10/11/2020.
//

#ifndef MENU_MENUITEM_H
#define MENU_MENUITEM_H

#include <utility>

#include "iostream"
using namespace std;

class MenuItem{
public:
    string text;
    MenuItem()= default;
    MenuItem(string t):text(t){}

    virtual void execute(){
        string str = text;
        transform(str.begin(), str.end(), str.begin(), ::toupper);
        cout<<"  ************** Execution de "+ str<<endl;
    }

    virtual string getText(){return text;}

};


#endif //MENU_MENUITEM_H

//
// Created by ZHAO YUQIAO on 10/11/2020.
//

#ifndef MENU_MENU_H
#define MENU_MENU_H
#include <utility>

#include "iostream"
#include "MenuItem.h"
#include "vector"
using namespace std;
class Menu{
protected:
    vector<MenuItem*> ms;
public:
    string title;
    Menu()= default;
    explicit Menu(string t):title(std::move(t)){}

    virtual void addItem(MenuItem *m){
        ms.push_back(m);
    }

    static string& clearHeadTailSpace(string &str)
    {
        if (str.empty())
        {
            return str;
        }

        str.erase(0,str.find_first_not_of('\"'));
        str.erase(str.find_last_not_of('\"') + 1);
        return str;
    }

    int input(){
        cout << title << endl;
        for (int i = 0; i < ms.size(); i++) {
            cout << i << "- " << ms[i]->getText() << endl;
        }
        string str;
        cout<<"Votre choix? ";
        cin>>str;
        clearHeadTailSpace(str);
        return stoi(str);
    }

    virtual void activate(){
        while (true) {
            int op = input();
            if(op<0||op>ms.size()-1){
                throw "input error";
            }else if(ms[op]->getText() == "quitter"){
                ms[op]->execute();
                exit(0);
            } else{
                ms[op]->execute();
            }
        }
    }




};
#endif //MENU_MENU_H

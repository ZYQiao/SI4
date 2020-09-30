//
// Created by ZHAO YUQIAO on 2020/9/28.
//
#include "Person.h"
#include "iostream"
#include "algorithm"
using namespace std;

bool is_element_in_vector(vector<Person> v,Person &element){
    for(int i = 0; i < v.size(); i++){
        if(v[i].getName() == element.getName() && v[i].getGender() == element.getGender())
            return true;
    }
    return false;
}

Person::Person(string n, Gender g):name(n),gender(g){
    partner = nullptr;
    parent = {};
    child = {};
}
void Person::breakUp() {
    partner = nullptr;
}
string Person::getGender() {
    switch (gender) {
        case 0:
            return "Male";
        case 1:
            return "Female";
    }
    return NULL;
}

string Person::toString() {
    string s;
    s.append(getName());
    s.append(" ");
    s.append(getGender());
    s.append(" ");
    return s;
}
Person* Person::getPartner(){return partner;}
vector<Person> Person::getChild(){return child;}
vector<Person> Person::getParent(){return parent;}

bool Partner(Person &p1,Person &p2) {
    if(&p1 == &p2) return false;
    if(is_element_in_vector(p1.getChild(),p2)) return false;
    if(is_element_in_vector(p2.getChild(),p1)) return false;
    if(is_element_in_vector(p1.getParent(),p2)) return false;
    if(is_element_in_vector(p2.getParent(),p1)) return false;
    p1.setPartner(&p2);
    p2.setPartner(&p1);
    return true;
}

bool Divorce(Person &p1,Person &p2){
    if(p1.getPartner() == &p2 && p2.getPartner() == &p1){
        p1.setPartner(nullptr);
        p2.setPartner(nullptr);
        return true;
    }
    return false;
}


bool setChild(Person &p1,Person &c) {
    if(&c == &p1) return false;
    if(&c == p1.getPartner()) return false;
    if(is_element_in_vector(p1.getParent(),c)) return false;
    if(is_element_in_vector(c.getChild(),p1)) return false;
    if(c.getParent().size() >= 2) return false;
    p1.setChild(c);
    c.setParent(p1);
    return true;
}





ostream& operator<<(ostream &os, Person &p){
    string partner,children,parent;
    if(p.getPartner() != nullptr){
        partner = (*p.getPartner()).toString();
    } else  partner = "no partner";
    if(!p.getChild().empty()){
        for(Person child : p.getChild())
            children.append(child.toString());
    } else children = "no child";
    if(!p.getParent().empty()){
        for(Person p : p.getParent())
            parent.append(p.toString());
    } else parent = "no parent";
    os<<"name: "<<p.getName()<<"\ngender: "<<p.getGender()<<"\npartner: "<<partner<<"\nchildren: "<<children<<"\nparent: "<<parent<<endl;
    return os;
}



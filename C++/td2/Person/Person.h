//
// Created by ZHAO YUQIAO on 2020/9/28.
//

#ifndef PERSON_PERSON_H
#define PERSON_PERSON_H
#include "string"
#include "vector"
using namespace std;

class Person{

public:
    enum Gender{Male,Female};
    Person(string n, Gender g);
    string getName(){return name;}
    string getGender();
    void setPartner(Person *p){partner = p;};
    void setChild(Person &c){child.push_back(c);};
    void setParent(Person &p){parent.push_back(p);};
    Person* getPartner();
    vector<Person> getChild();
    vector<Person> getParent();
    string toString();
    void breakUp();
    bool check();
private:
    string name;
    Gender gender;
    Person *partner;
    vector<Person> parent;
    vector<Person> child;

};




#endif //PERSON_PERSON_H

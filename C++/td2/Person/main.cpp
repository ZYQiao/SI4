//
// Created by ZHAO YUQIAO on 2020/9/28.
//
#include<iostream>
#include "Person.cpp"

using namespace std;

int main(){
    Person Charles("Charles",Person::Male);
    Person Amandine("Amandine",Person::Female);
    Person Sylvie("Sylvie",Person::Female);
    Person Jeff("Jeff",Person::Male);
    Person Fred("Fred",Person::Male);
    Person Regis("Regis",Person::Female);
    Person Marie("Marie",Person::Male);
    Person Pedro("Pedro",Person::Male);
    Person Benoit("Benoit",Person::Male);
    Partner(Charles,Amandine);
    setChild(Charles,Fred);
    setChild(Amandine,Fred);
    cout<<Charles<<Amandine<<Sylvie<<Jeff<<Fred<<Regis<<Marie<<Pedro<<Benoit<<endl;
    Divorce(Charles,Amandine);
    Partner(Charles,Sylvie);
    setChild(Charles,Regis);
    setChild(Sylvie,Regis);
    cout<<Charles<<Amandine<<Sylvie<<Jeff<<Fred<<Regis<<Marie<<Pedro<<Benoit<<endl;
    Partner(Amandine,Jeff);
    setChild(Amandine,Marie);
    setChild(Amandine,Pedro);
    setChild(Jeff,Marie);
    setChild(Jeff,Pedro);
    cout<<Charles<<Amandine<<Sylvie<<Jeff<<Fred<<Regis<<Marie<<Pedro<<Benoit<<endl;
    Partner(Marie,Regis);
    setChild(Marie,Benoit);
    setChild(Regis,Benoit);
    cout<<Charles<<Amandine<<Sylvie<<Jeff<<Fred<<Regis<<Marie<<Pedro<<Benoit<<endl;

    return 0;
}


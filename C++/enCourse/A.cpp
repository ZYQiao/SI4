//
// Created by ZHAO YUQIAO on 2020/9/28.
//

#include "A.h"
using namespace std;

void A::setHour(int h) {hour = h;}
void A::setMin(int m) {min = m;}
void A::setSecond(int s) {second = s;}
A::A(int h, int m, int s) :hour(h),min(m),second(s){}
A::A():hour(0),min(0),second(0){}
int A::getHour() const{return hour;}
int A::getMin() const{return min;}
int A::getSecond() const{return second;}
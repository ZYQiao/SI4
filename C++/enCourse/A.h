//
// Created by ZHAO YUQIAO on 2020/9/28.
//

#ifndef ENCOURSE_A_H
#define ENCOURSE_A_H


class A {
private:
    int hour,min,second;
public:
    A();
    A(int h, int m, int s);
    void setHour(int h);
    void setMin(int m);
    void setSecond(int s);

    int getHour() const;

    int getMin() const;

    int getSecond() const;
};


#endif //ENCOURSE_A_H

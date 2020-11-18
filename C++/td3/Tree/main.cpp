#include <iostream>

using namespace std;
class Point{

public:
    int x,y;
    char* name;
    Point(int x=0, int y=0, char* name= nullptr){
        this->x = x;
        this->y = y;
        this->name = name;
    }
    Point(Point &p){
        x = p.x;
        y = p.y;
        name = new char[strlen(p.name)];
        strcpy(name,p.name);
    }
};
int main() {
    Point p1(1,1,"string");
    Point p2 = p1;
    Point p3;
    p3 = p1;
    std::cout<<p1.name<<std::endl;
    std::cout<<p2.name<<std::endl;
    std::cout<<p3.name<<std::endl;
//    std::cout<<sizeof(p1)<<sizeof(p2)<<sizeof(p3)<<std::endl;
    std::cout << "Hello, World!" << std::endl;
    return 0;
}

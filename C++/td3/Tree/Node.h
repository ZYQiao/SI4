//
// Created by ZHAO YUQIAO on 19/10/2020.
//

#ifndef TREE_NODE_H
#define TREE_NODE_H
#include "iostream"
using namespace std;

template <typename T>
class Node {
private:
    Node *left, *right;
    T val;

public:
    Node(T v = T()){
        left = nullptr;
        right = nullptr;
        val = v;
    }

    void operator=(Node n){
        Node my_l(n.get_left()->get_val()), my_r(n.get_right()->get_val());
        val = n.get_val();
        left = &my_l;
        right = &my_r;
    }
    void set_val(int v);
    void set_left(Node &node);
    void set_right(Node node);
    void remove_all_children();
    T get_val();
    bool have_left();
    bool have_right();
    Node* get_left();
    Node* get_right();
    friend ostream& operator<<(std::ostream& os, const Node & n){
        os<<"val: "<<n.val<<"\nn.left: "<<n.left<<"\nn.right: "<<n.right<<endl;
        return os;
    }
};


#endif //TREE_NODE_H

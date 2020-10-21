//
// Created by ZHAO YUQIAO on 05/10/2020.
//

#ifndef TREE_TREE_H
#define TREE_TREE_H
#include "vector"
#include "iostream"

using namespace std;


class Node{
private:
    Node *left, *right;
    int val;
public:
    Node(int v = -1,Node *l = nullptr,Node *r = nullptr){
        left = l;
        right = r;
        val = v;
    }

    void operator=(Node n){
        val = n.get_val();
        if(n.have_left()){
            Node my_l (n.get_left()->get_val());
            left = &my_l;
        } else{
            left = nullptr;
        }
        if(n.have_right()){
            Node my_r(*n.get_right());
            right = &my_r;
        } else{
            right = nullptr;
        }
    }

    friend ostream& operator<<(ostream& os, Node& n){
        os<<"val: "<<n.get_val()<<" left: "<<n.get_left()<<" right: "<<n.get_right()<<endl;
        return os;
    }
    void set_val(int v){val = v;}
    void set_left(Node &node){left = &node;}
    void set_right(Node &node){right = &node;}
    void remove_all_children(){left = nullptr;right = nullptr;}
    int get_val(){return val;}
    bool have_left(){return left != nullptr;}
    bool have_right(){return right != nullptr;}
    Node* get_left(){return left;}
    Node* get_right(){return right;}
};


class Tree {
private:
    Node root;
    int depth;
public:
    Tree(){Node node;}
    Tree(Node node,int d = 0){root = node;depth = d;}
    Node get_root(){return root;}
    void set_root(Node &node){root = node;}
    void add(Node &node);
    Node* get_leaf(Node *root);
    vector<Node> parcours_infixe();
    int get_depth(){return depth;}


};




#endif //TREE_TREE_H

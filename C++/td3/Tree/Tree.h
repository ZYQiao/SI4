//
// Created by ZHAO YUQIAO on 05/10/2020.
//

#ifndef TREE_TREE_H
#define TREE_TREE_H
#include "vector"
#include "iostream"

using namespace std;

template <typename T>
class Node{
private:
    Node<T> *left, *right;
    T val;
public:
//    Node(){
//        val = NULL;
//        left = nullptr;
//        right = nullptr;
//    }
    Node(T v,Node *l = nullptr,Node *r = nullptr){
        Node my_l = *l,my_r = *r;
        left = &my_l;
        right = &my_r;
        val = v;
    }

    void operator=(Node n){
        Node my_l (*n.get_left()), my_r(*n.get_right());
        val = n.get_val();
        left = &my_l;
        right = &my_r;
    }

    friend std::ostream& operator<<(std::ostream& os, const Node<T>& n);
    void set_val(int v){val = v;}
    void set_left(Node &node){left = &node;}
    void set_right(Node &node){right = &node;}
    void remove_all_children(){left = nullptr;right = nullptr;}
    T get_val(){return val;}
    bool have_left(){return left != nullptr;}
    bool have_right(){return right != nullptr;}
    Node* get_left(){return left;}
    Node* get_right(){return right;}
};

template <typename T>
class Tree {
private:
    Node<T> root;
    int depth;
public:
    Tree(){Node<T> node;}
    Tree(Node<T> node,int d = 0){root = node;depth = d;}
    Node<T> get_root(){return root;}
    void set_root(Node<T> &node){root = node;}
    void add(Node<T> &node);
    Node<T>* get_leaf(Node<T> *root);
    vector<Node<T>> parcours_infixe();
    int get_depth(){return depth;}


};




#endif //TREE_TREE_H

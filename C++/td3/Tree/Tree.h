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
    Node(int v=-1,Node *l = nullptr,Node *r = nullptr){
        left = l;
        right = r;
        val = v;
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
    Tree(){root = NULL;depth = 0;}
    Tree(Node &node){root = node;}
    Node get_root(){return root;}
    void set_root(Node &node){root = node;}
    void add(Node &node);
    Node* get_leaf(Node *root);
    vector<Node> parcours_infixe();
    int get_depth(){return depth;}


};




#endif //TREE_TREE_H

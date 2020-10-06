//
// Created by ZHAO YUQIAO on 05/10/2020.
//

#include "Tree.h"
void Tree::add(Node &node){
    Node *tmp = get_leaf(&root);
    if(!tmp->have_left()) {
        tmp->set_left(node);
    }else if(!tmp->have_right()){
        tmp->set_right(node);
    }
}

Node* Tree::get_leaf(Node *rt){
    if(!rt->have_left() || !rt->have_right()) return rt;
    if(rt->have_left()) return rt = get_leaf(rt->get_left());
    if(rt->have_right()) return rt = get_leaf(rt->get_right());
}

vector<Node> Tree::parcours_infixe() {
    vector<Node> v,s;
    Node tmp = root;
    v.push_back(tmp);
    while(!v.empty()) {
        while (tmp.have_left()) {
            tmp = *tmp.get_left();
            v.push_back(tmp);
        }
        while (!tmp.have_right()){
            s.push_back(tmp);
            v.pop_back();
            tmp = v.back();
        }
        if(v.empty()) return s;
        s.push_back(tmp);
        v.pop_back();
        tmp = *tmp.get_right();
        v.push_back(tmp);
    }

}
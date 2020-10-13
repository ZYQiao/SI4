//
// Created by ZHAO YUQIAO on 05/10/2020.
//

#include "Tree.h"
template <typename T>
void Tree<T>::add(Node<T> &node){
    Node<T> *tmp = get_leaf(&root);
    if(!tmp->have_left()) {
        tmp->set_left(node);
    }else if(!tmp->have_right()){
        tmp->set_right(node);
    }
}
template <typename T>
Node<T>* Tree<T>::get_leaf(Node<T> *rt){
    if(!rt->have_left() || !rt->have_right()) return rt;
    if(rt->have_left()) return rt = get_leaf(rt->get_left());
    if(rt->have_right()) return rt = get_leaf(rt->get_right());
}

template <typename T>
vector<Node<T>> Tree<T>::parcours_infixe() {
    vector<Node<T>> v,s;
    Node<T> tmp = root;
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

template <typename T>
std::ostream& operator<<(std::ostream& os, const Node<T>& n){
    os<<"val: "<<n.val<<" left: "<<n.left->get_val()<<" right: "<<n.right->get_val()<<endl;
    return os;
}
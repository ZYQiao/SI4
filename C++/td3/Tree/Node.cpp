//
// Created by ZHAO YUQIAO on 19/10/2020.
//

#include "Node.h"
template <typename T>
void Node<T>::set_val(int v){
    val = v;
}

template <typename T>
void Node<T>::set_left(Node &node){
    left = new Node(node.get_val());
    delete left;
}

//template <typename T>
//void Node<T>::set_right(Node node){
//    Node<T> right_node(node.get_val());
//    right = &node;
//}

//template <typename T>
//void Node<T>::remove_all_children(){
//    left = nullptr;right = nullptr;
//}

template <typename T>
T Node<T>::get_val(){
    return val;
}

template <typename T>
bool Node<T>::have_left(){
    return left != nullptr;
}

template <typename T>
bool Node<T>::have_right(){
    return right != nullptr;
}

template <typename T>
Node<T>* Node<T>::get_left(){
    return left;
}

template <class T>
Node<T>* Node<T>::get_right(){
    return right;
}

#include <iostream>
#include "Tree.cpp"

using namespace std;

int main() {
    Node<int> node1(1);
    Node<int> node2(2);
    Node<int> node3(3);
    Node<int> node4(4);
    Node<int> node5(5);
    Node<int> node6(6);
    Node<int> node7(7);
    Node<int> node8(8);
    Node<int> node9(9);
    Node<int> node10(10);
    Node<int> node11(11);


//    node1.set_left(node2);
//    node1.set_right(node3);
//    node2.set_left(node4);
//    node2.set_right(node5);
//    node5.set_left(node7);
//    node5.set_right(node8);
//    node3.set_right(node6);
//    node6.set_left(node9);
cout<<node1;
    Tree<int> tree(node1);
    tree.add(node2);
    tree.add(node3);
    tree.add(node4);
    tree.add(node5);
    tree.add(node6);
    tree.add(node7);
    tree.add(node8);
    tree.add(node9);
    tree.add(node10);
    tree.add(node11);

    vector<Node<int>> v = tree.parcours_infixe();
    for(Node<int> n: v) {
        cout << n.get_val() << " ";
    }
    cout<<endl;



    return 0;
}

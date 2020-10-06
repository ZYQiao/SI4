#include <iostream>
#include "Tree.cpp"

using namespace std;

int main() {
    Node node1(1);
    Node node2(2);
    Node node3(3);
    Node node4(4);
    Node node5(5);
    Node node6(6);
    Node node7(7);
    Node node8(8);
    Node node9(9);
    Node node10(10);
    Node node11(11);


//    node1.set_left(node2);
//    node1.set_right(node3);
//    node2.set_left(node4);
//    node2.set_right(node5);
//    node5.set_left(node7);
//    node5.set_right(node8);
//    node3.set_right(node6);
//    node6.set_left(node9);

    Tree tree;
    tree.set_root(node1);
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
//    cout<<node1.get_val()<<node1.get_left().get_val()<<node1.get_right().get_val()<<endl;
    vector<Node> v = tree.parcours_infixe();
    for(Node n: v) {
        cout << n.get_val() << " ";
    }
    cout<<endl;

    return 0;
}

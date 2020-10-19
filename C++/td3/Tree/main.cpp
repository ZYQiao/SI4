#include <iostream>
#include "Node.h"
int main() {
    Node<int> node1(1);
    Node<int> node2(2);
    node1.set_left(node2);

    return 0;
}

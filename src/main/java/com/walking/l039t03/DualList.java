package com.walking.l039t03;


public class DualList<T> {

    public Node<T> nodeFirst;
    public Node<T> nodeLast;

    public class Node<T> {
        public Node<T> prev;
        public Node<T> next;
        public T element;

        public Node(Node<T> prev, Node<T> next, T element) {
            this.prev = prev;
            this.next = next;
            this.element = element;
        }
    }

    public DualList() {
        nodeLast = new Node<>(nodeFirst, null, null);
        nodeFirst = new Node<>(null, nodeLast, null);
    }

    public void reverse() {
        Node<T> temp = null;
        Node<T> current = nodeFirst;

        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        if (temp != null) {
            nodeFirst = temp.prev;
        }
    }

    public void remove(T element) {
        Node<T> current = nodeFirst;
        while (current.next != null) {
            if (current.next.element.equals(element)) {

                current.next = current.next.next;

            }
            current = current.next;
        }
    }

    public void add(T element) {
        Node<T> newNode = new Node<>(nodeLast, null, element);
        nodeLast.next = newNode;
        nodeLast = newNode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<T> currentNode = nodeFirst;
        while (currentNode.next != null) {
            if (currentNode.element != null) {
                sb.append(currentNode.element).append("\n");
            }
            currentNode = currentNode.next;
        }
        return sb.toString();
    }


}

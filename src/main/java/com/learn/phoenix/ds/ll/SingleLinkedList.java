package com.learn.phoenix.ds.ll;

public class SingleLinkedList {
    private Node head;

    public void traverse() {
        if (null == head) {
            System.out.println("no list found");
        } else {
            Node node = head;
            while (null != node.getNext()) {
                System.out.println(node.getData());
                node = node.getNext();
            }
            System.out.println("Last Node " + node.getData());
        }
    }

    /**
     * Add new node to linked list
     *
     * @param data
     */
    public void add(int data) {
        if (null == head) {
            head = new Node();
            head.setData(data);
            System.out.println("Added the first head node: " + data);
        } else {
            Node lastNode = head;
            while (null != lastNode.getNext()) {
                lastNode = lastNode.getNext();
            }
            Node node = new Node();
            node.setData(data);
            lastNode.setNext(node);
            System.out.println("Added the new node: " + data);
        }
    }

    /**
     * Delete the data from the list
     *
     * @param data
     */
    public void delete(int data) {
        if (null == head) {
            System.out.println("no list found");
        } else {
            if (head.getData() == data) {
                head = null;
                System.out.println("now list is empty");
            } else {
                Node currentNode = head;
                Node prevNode = head;
                while (null != currentNode.getNext()) {
                    if (data == currentNode.getData()) {
                        System.out.println("deleting node having data: " + currentNode.getData());
                         prevNode.setNext(currentNode.getNext());
                        break;
                    }
                    prevNode = currentNode;
                    currentNode = currentNode.getNext();
                }
            }
        }
    }

    public static void main(String[] args) {
        SingleLinkedList linkedList = new SingleLinkedList();
        for (int index = 0; index < 10; index++) {
            linkedList.add(index);
        }

        linkedList.traverse();

        linkedList.delete(5);

        linkedList.traverse();
    }
}

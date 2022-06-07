/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

public class NodeLinkedList<T> {

    private NodeLinkedList<T> next;
    private NodeLinkedList<T> prev;
    private T dataLinkedList;

    public NodeLinkedList(T data) {
        next = null;
        prev = null;
        this.dataLinkedList = data;
    }

    public NodeLinkedList<T> getNext() {
        return next;
    }

    public void setNext(NodeLinkedList<T> next) {
        this.next = next;
    }

    public NodeLinkedList<T> getPrev() {
        return prev;
    }

    public void setPrev(NodeLinkedList<T> prev) {
        this.prev = prev;
    }

    public T getData() {
        return dataLinkedList;
    }

    public void setData(T data) {
        this.dataLinkedList = data;
    }

}

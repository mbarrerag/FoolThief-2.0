package logic;


public class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int length;

    LinkedList() {
        head = null;
        tail = null;
        length = 0;
    }

    public int size() {
        return length;
    }
    
    public boolean itsEmpty() {
        return head == null;
    }

    public void makeEmpty() {
        head = null;
        tail = null;
    }

    public void addFirst(T data) {
        Node<T> node = new Node<T>(data);
        if (head == null) {
            head = node;
            tail = head;
        } else {
            node.setNext(head);
            head.setPrev(node);
            head = node;
        }
    }

    public void add(T data) {
        Node<T> node = new Node<T>(data);
        if (head == null) {
            head = node;
            tail = head;
        } else {
            tail.setNext(node);
            node.setPrev(tail);
            tail = node;
        }
        length++;
    }

    public void add(T data, int index) {
        if (index == length) {
            add(data);
        } else if (index == 0) {
            addFirst(data);
        } else if (index > 0 && index <= (length - 1)) {
            Node<T> node = new Node<T>(data);
            if (head == null) {
                head = node;
                tail = head;
            } else {
                Node<T> pointer = head;
                int counter = 0;
                while ((counter < (index - 1)) && (pointer.getNext() != null)) {
                    pointer = pointer.getNext();
                    counter++;
                }
                node.setNext(pointer.getNext());
                pointer.getNext().setPrev(node);
                pointer.setNext(node);
                node.setPrev(pointer);
            }
        }
        length++;
    }

    public T getFirst() {
        if (head == null) {
            return null;
        } else {
            return head.getData();
        }
    }

    public T get(int index) {
        if (index == length) {
            getLast();
        } else if (index >= 0 && index <= (length - 1)) {
            Node<T> pointer = head;
            int counter = 0;
            while ((counter < index) && (pointer.getNext() != null)) {
                pointer = pointer.getNext();
                counter++;
            }
            if (counter != index) {
                return null;
            }
            else if (counter == index) {
                return pointer.getData();
            }
        }
        return null;
    }

    public T getLast() {
        if (head == null) {
            return null;
        } else {
            return tail.getData();
        }
    }

    public void removeFirst() {
        if (head != null) {
            head = head.getNext();
            length--;
        }
    }

    public void remove(int index) {
        if (head != null) {
            if (index == 0) {
                removeFirst();
            } else if (index == length - 1) {
                removeLast();
            } else if ((index > 0) && (index < length)) {
                Node<T> pointer = head;
                int counter = 0;
                while ((counter < index - 1) && (pointer.getNext() != null)) {
                    pointer = pointer.getNext();
                    counter++;
                }
                Node<T> temp = pointer.getNext();
                pointer.setNext(temp.getNext());
                temp.getNext().setPrev(pointer);
                temp.setNext(null);
                temp.setPrev(null);
            }
        }
    }

    public void removeLast() {
        if (head != null) {
            Node<T> last = tail;
            tail = tail.getPrev();
            tail.setNext(null);
            last.setPrev(null);
            length--;
        }
    }
}

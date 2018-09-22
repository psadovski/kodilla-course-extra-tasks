package com.kodilla.extratasks.dll;

import java.util.Objects;

public class DoubleLinkedList implements DoubleList {
    private Entry head;
    private Entry tail;
    private int size;

    private class Entry {
        private Object elem;
        private Entry next;
        private Entry prev;

        public Entry(Object elem) {
            this.elem = elem;
        }

        public Object getElem() {
            return this.elem;
        }

        public void setElem(Object elem) {
            this.elem = elem;
        }

        public Entry getNext() {
            return this.next;
        }

        public void setNext(Entry next) {
            this.next = next;
        }

        public Entry getPrev() {
            return this.prev;
        }

        public void setPrev(Entry prev) {
            this.prev = prev;
        }
    }

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public Entry getHead() {
        return this.head;
    }

    public Entry getTail() {
        return this.tail;
    }

    public int getSize() {
        return this.size;
    }

    @Override
    public int size() {
        return getSize();
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public boolean contains(Object var1) {
        boolean containElem = false;
        Entry current = getHead();

        while (!containElem && current != null) {
            if (current.getElem().equals(var1)) {
                containElem = true;
            } else {
                current = current.getNext();
            }
        }
        return containElem;
    }

    @Override
    public void add(Object var1) {
        Entry currentNode = getHead();
        if (isEmpty()) {
         Object currentElem = currentNode.setElem(var1);
        }
        else {
            currentNode.setNext(var1);
        }
        this.size++;
    }

    @Override
    public boolean remove(Object var1) {
        Entry currentNode = getHead();

        while (currentNode != null) {
            Object currentElem = currentNode.getElem();
            if (currentElem.equals(var1)) {
                remove(currentNode);
            }
            currentNode = currentNode.getNext();
        }
        return true;
    }

    @Override
    public Object get(int var1) {
        if (var1 > this.size - 1) {
            return new IndexOutOfBoundsException("DoublyLinkedList is of size " + this.size);
        }

        Object obj = get(var1);
        return obj;
    }

    public int indexOf(Object var1) {
        return 7;
    }

    @Override
    public void clear() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DoubleLinkedList that = (DoubleLinkedList) o;
        return size == that.size &&
                Objects.equals(head, that.head) &&
                Objects.equals(tail, that.tail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(head, tail, size);
    }
}

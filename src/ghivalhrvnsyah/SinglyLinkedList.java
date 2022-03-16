package ghivalhrvnsyah;

import java.util.NoSuchElementException;

public class SinglyLinkedList<E> {
    private ListNode<E> firstNode; //heed
    private ListNode<E> lastNode; //tail
    private String nama;

    public SinglyLinkedList(){

        this("Linked List");
    }
    public SinglyLinkedList(String listNama){
        nama = listNama;
        firstNode = lastNode = null; //Head % Tail Node SinglyLinkedList
    }
    private boolean isEmpty(){ //node yang belum diisi data

        return firstNode == null;
    }
    public void insertAtFront(E insertItem){
        ListNode newNode = new ListNode(insertItem);

        if(isEmpty()){
            firstNode = lastNode = new ListNode<E>(insertItem);
        }else{
        newNode.next = firstNode;
        firstNode = newNode;

        }
    }public void insertAtBehind(E insertItem){ //menambahkan data dibelakang
        ListNode newNode = new ListNode(insertItem);

        if(isEmpty()){
            firstNode = lastNode = new ListNode<E>(insertItem);
        }else{
        lastNode.next = newNode;
        lastNode = newNode;

        }


    }
    public E removeFromBehind() throws NoSuchElementException{
        if(isEmpty()){
            System.out.println("Data Tidak Ditemukan!");
        }
        E removedItem = lastNode.data;

        if (firstNode == lastNode){
            firstNode = lastNode = null;

        }else{
            ListNode<E> current = firstNode;

            while(current.next != lastNode){
                current = current.next;
            }
            lastNode = current;
            current.next = null;
        }
        return removedItem;
    }
    public void printData(){
        if(isEmpty()) {
            System.out.println("Data Tidak Ditemukan");
            return;
        }
        ListNode<E> current = firstNode;
        while(current != null){
            System.out.printf("%ss", current.data);
            current = current.next;
        }
        System.out.println();
    }

}

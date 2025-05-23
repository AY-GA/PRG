package lekce_25;

public class ObousmernySeznam {
    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;

    public void addPolozka(int x) {
        Node newNode = new Node(x);
        if (head == null) head = tail = newNode;
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void throwEven() {
        Node current = head;
        while (current != null) {
            if (current.data % 2 == 0) {
                if (current.prev != null) current.prev.next = current.next;
                else head = current.next;

                if (current.next != null) current.next.prev = current.prev;
                else tail = current.prev;
            }
            current = current.next;
        }
    }

    public static void main(String[] args) {
        ObousmernySeznam s = new ObousmernySeznam();
        s.addPolozka(13);
        s.addPolozka(7);
        s.addPolozka(8);
        s.addPolozka(10);

        System.out.println("Před vyhozením sudých:");
        s.print();

        s.throwEven();

        System.out.println("Po vyhození sudých:");
        s.print();
    }
}

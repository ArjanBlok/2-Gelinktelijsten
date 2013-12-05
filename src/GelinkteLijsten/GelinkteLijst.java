package GelinkteLijsten;

public class GelinkteLijst {

    /**
     * Alleen de gelinkte lijst heeft toegang tot de node
     */
    private class Node {

        //Dit is de data die je opslaat
        int data;

        // referenties/pijlen naar de volgende en vorige nodes
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;

        }
    }

    private Node last;
    private Node head;
    private int size;

    public GelinkteLijst() {
    }

    int getFirst() {
        return head.data;
    }

    int getLast() {
        return last.data; // dummy
    }

    /**
     * Voeg toe aan de voorkant
     */
    void insertFirst(int number) {
        if (head == null) {
            head = new Node(number, null);

            size = 1;
            last = head;
        } else {
            Node newNode;
            newNode = new Node(number, head.next);
            //Set newnode first
            newNode.next = head;
            head = newNode;
            size++;
        }

    }

    /**
     * Voeg toe aan de achterkant
     */
    void insertLast(int number) {
        if (last == null && head == null) {
            insertFirst(number);
        } else {
            Node newNode;
            newNode = new Node(number, null);
            //Set newnode first
            last.next = newNode;
            last = newNode;
            size++;
        }
    }

    /**
     * Voeg toe voor een ander element
     */
    void insertBefore(int number, int before) {
        Node nodeFound = null;
        for (Node p = head; p != null; p = p.next) {
            if (p.data < before) {
                nodeFound = p;
            } else {
                break;
            }
        }

        if (nodeFound == null) {
            nodeFound = head;
        }

        Node newNode;
        newNode = new Node(number, nodeFound.next);

        nodeFound.next = newNode;  
        if (newNode.next == null){
            last = newNode;
        }
    }

    /**
     * Voeg toe na een ander element
     */
    void insertAfter(int number, int after) {
        Node nodeFound = null;
        for (Node p = head; p != null; p = p.next) {
            if (p.data < after) {
                nodeFound = p.next;
            } else {
                break;
            }
        }

        if (nodeFound == null) {
            nodeFound = head;
        }
        Node newNode = new Node(number, nodeFound.next);

        nodeFound.next = newNode;  
        if (newNode.next == null){
            last = newNode;
        }
        size++;
    }

    /**
     * Verwijder een element
     *
     * @param data
     */
    void remove(int data) {
        for (Node p = head; p.next != null; p = p.next) {
            if (p.next.data == data){
                p.next = p.next.next;
                
                if (p.next == null){
                    last = p;
                }
                break;
            }
       }
       
       size = size - 1;
    }

    /**
     *
     * @param current
     * @return
     */
    boolean isFirst(Node current) {
        return current == head; //dummy
    }

    /**
     *
     * @param current
     * @return
     */
    boolean isLast(Node current) {
        return current.next != null; //dummy	
    }

    /**
     * Het aantal elementen in de gelinkte lijst
     *
     * @return
     */
    int getSize() {
        return size;
    }

    String print() {
        String result = "";
        if (head.next == null) {
            result = Integer.toString(head.data);
        } else {
            for (Node p = head; p != null; p = p.next) {
                result = result + p.data + ",";
            }
        }
        return result;
    }
}

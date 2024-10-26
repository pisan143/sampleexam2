public class IntNode {
    // value stored in Node
    private int data = 0;

    // the next node that comes after this one
    private IntNode next = null;

    // default constructor
    public IntNode() {
    }

    // constructor with data
    public IntNode(int data) {
        this.data = data;
    }

    // constructor with data and next Node
    public IntNode(int data, IntNode next) {
        this.data = data;
        this.next = next;
    }

    // getter for data of Node
    public int getData() {
        return data;
    }

    // getter for next Node after this one
    public IntNode getNext() {
        return next;
    }

    // setter for next Node after this one
    public void setNext(IntNode next) {
        this.next = next;
    }

    // default way of printing a node
    // if a node has a next node following it:
    // [10|->]
    // if a node does not have a node following it:
    // [10|\]
    public String toString() {
        String s = "[" + data + "|";
        if (next == null) {
            s += "\\]";
        } else {
            s += "->]";
        }
        return s;
    }

    /******************************************
     * Below methods are all static
     * They work on IntNode, but cannot access 'this'
     ******************************************/

    // count the number of nodes starting from given Node
    public static int count(IntNode curr) {
        int num = 0;
        while (curr != null) {
            num++;
            curr = curr.getNext();
        }
        return num;
    }

    // count recursively the number of nodes starting from given Node
    public static int countR(IntNode curr) {
        if (curr == null) {
            return 0;
        }
        return 1 + countR(curr.getNext());
    }

    // print all the Nodes starting from given Node
    public static void printAll(IntNode head) {
        while (head != null) {
            System.out.print(head);
            head = head.getNext();
        }
        System.out.println();
    }

    // add a new node at the end of the list with given head
    public static void addToEnd(IntNode head, IntNode newNode) {
        assert (head != null);
        while (head.getNext() != null) {
            head = head.getNext();
        }
        head.setNext(newNode);
    }

    // add a new node to the beginning of the list with given head
    // the *new* head is returned
    public static IntNode addToBeginning(IntNode oldHead, IntNode newNode) {
        newNode.setNext(oldHead);
        return newNode;
    }

    // add a new node in a sorted way, increasing in value
    public static IntNode addSorted(IntNode oldHead, IntNode newNode) {
        assert (oldHead != null);
        if (newNode.getData() <= oldHead.getData()) {
            return addToBeginning(oldHead, newNode);
        }
        IntNode curr = oldHead;
        while (curr.getNext() != null &&
                curr.getNext().getData() < newNode.getData()) {
            curr = curr.getNext();
        }
        curr.setNext(newNode);
        return oldHead;
    }

    // remove the node if found
    public static IntNode remove(IntNode head, int data) {
        if (head.getData() == data) {
            return head.getNext();
        }
        IntNode prev = null;
        IntNode curr = head;
        while (curr != null && curr.getData() != data) {
            prev = curr;
            curr = curr.getNext();
        }
        if (curr != null) {
            prev.setNext(curr.getNext());
        }
        return head;
    }

    // combine two linked lists and return new head
    public static IntNode combine(IntNode a, IntNode b) {
        if (a == null) {
            return b;
        }
        if (b == null) {
            return a;
        }
        // find the last element of a
        IntNode curr = a;
        while (curr.getNext() != null) {
            curr = curr.getNext();
        }
        curr.setNext(b);
        return a;
    }

    public static void testLinkedList() {
        IntNode n1 = new IntNode(1);
        IntNode n2 = new IntNode(2, n1);
        IntNode n3 = new IntNode(3, n2);
        IntNode n4 = new IntNode(4, n3);
        IntNode n5 = new IntNode(5, n4);
        System.out.println("n3 = " + n3);
        printAll(n5);
        System.out.println("countR = " + countR(n5));
        System.out.println("count = " + count(n5));
        addToEnd(n5, new IntNode(10));
        addToEnd(n5, new IntNode(20));
        System.out.println("After adding 10 and 20 to end");
        printAll(n5);
        IntNode head = n5;
        head = addToBeginning(head, new IntNode(40));
        head = addToBeginning(head, new IntNode(50));
        System.out.println("After adding 40 and 50 to beginning");
        printAll(head);
    }

    public static void testLinkedList2() {
        IntNode head = new IntNode(10);
        addToEnd(head, new IntNode(20));
        addToEnd(head, new IntNode(30));
        addToEnd(head, new IntNode(40));
        addToEnd(head, new IntNode(50));
        head = addSorted(head, new IntNode(5));
        head = addSorted(head, new IntNode(35));
        head = addSorted(head, new IntNode(55));
        System.out.println("After adding 5, 35, and 55 sorted");
        printAll(head);
    }

    public static void testLinkedList3() {
        IntNode head = new IntNode(10);
        addToEnd(head, new IntNode(20));
        addToEnd(head, new IntNode(30));
        addToEnd(head, new IntNode(40));
        addToEnd(head, new IntNode(50));
        addToEnd(head, new IntNode(60));
        addToEnd(head, new IntNode(70));
        printAll(head);
        head = remove(head, 0);
        head = remove(head, 100);
        head = remove(head, 30);
        head = remove(head, 10);
        head = remove(head, 70);
        System.out.println("After removing 30, 10, and 70");
        printAll(head);
    }

    public static void testLinkedList4() {
        IntNode list1 = new IntNode(10);
        addToEnd(list1, new IntNode(20));
        addToEnd(list1, new IntNode(30));
        addToEnd(list1, new IntNode(40));
        addToEnd(list1, new IntNode(50));

        IntNode list2 = new IntNode(1);
        addToEnd(list2, new IntNode(2));
        addToEnd(list2, new IntNode(3));

        IntNode head = combine(list1, list2);
        System.out.println("Combining list1 and list2");
        printAll(head);
    }

    public static void testLinkedListAll() {
        testLinkedList();
        testLinkedList2();
        testLinkedList3();
        testLinkedList4();
    }
}

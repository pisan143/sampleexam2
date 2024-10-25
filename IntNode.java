public class IntNode {
    private int data;
    private IntNode next;

    public IntNode(int data) {
        this.data = data;
        this.next = null;
    }

    public IntNode(int data, IntNode next) {
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public IntNode getNext() {
        return next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(IntNode next) {
        this.next = next;
    }

    public String toString() {
        String s = "[" + data + "|";
        if (next == null) {
            s += "\\]";
        } else {
            s += "->]";
        }
        return s;
    }
}

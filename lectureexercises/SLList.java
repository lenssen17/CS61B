
public class SLList {
    public static class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    private IntNode sentinel;
    private IntNode first;
    private int size;

    public SLList(){
        sentinel = new IntNode(0, null);
        size = 0;
    }


    public SLList(int i) {
        sentinel = new IntNode(0, first);
        sentinel.next = new IntNode(i, null);
        size = 1;
    }

    public void addFirst(int i){
        first = new IntNode(i, first);
        size += 1;
    }

    public int getFirst(int i){
        return sentinel.next.item;
    }

    public int getSize(){
        return size;
    }

//    public int size(){
//        if(first.next == null){
//            return 1;
//        }
//        first.next = first.next.next;
//        return 1 + size();
//    }

//    public int size(){
//        return size(first);
//    }
//
//    public int size(IntNode p){
//        if(p.next == null){
//            return 1;
//        }
//        return 1 + size(p.next);
//    }


    public void addLast(int i){
        size += 1;
        if(sentinel.next == null){
            sentinel.next = new IntNode(i, null);
        }
        else {
            addLast(first, i);
        }
    }

    public void addLast(IntNode p, int i){
        if(p.next == null){
            p.next = new IntNode(i, null);
            return;
        }
        addLast(p.next, i);
    }

    public static void main(String[] args) {
        SLList L = new SLList();
        L.addLast(35);
        L.addFirst(10);
        System.out.print(L.getSize());
    }
}
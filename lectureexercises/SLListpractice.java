public class SLListpractice {
    public class IntNodes{
        public int item;
        public IntNodes next;
        public IntNodes(int i, IntNodes n){
            item = i;
            next = n;
        }
    }

    private int size;
    private IntNodes sentinel;
    private IntNodes first;

    public SLListpractice(){
        sentinel = new IntNodes(0, null);
    }

    public void addFirst(int i){
        sentinel.next = new IntNodes(i, sentinel.next);
        size += 1;
    }

    public int getFirst(){
        return sentinel.next.item;
    }

    public void addLast(int i){
        IntNodes p = sentinel;
        while (p.next != null){
            p = p.next;
        }
        p.next = new IntNodes(i, null);
    }

    public static void main(String[] args) {
        SLListpractice L = new SLListpractice();
        L.addFirst(15);
        L.addFirst(10);
        L.addLast(20);
        System.out.print(L.getFirst());
    }
}

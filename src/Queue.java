public class Queue {
    public char q[];
    public int getLoc, putLoc;

    Queue (int size) {
        q = new char[size];
        getLoc = putLoc = 0;
    }

    public void put (char ch) {
        if (putLoc == q.length) {
            System.out.println("Очередь заполнена ");
            return;
        }
        q[putLoc++] = ch;
    }

    public char get() {
        if (getLoc == putLoc) {
            System.out.println("Очередь пуста ");
            return (char) 0;
        }
        return q[getLoc++];
    }
}

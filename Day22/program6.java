/*
Concept:
Synchronization on shared object.
*/

class Message {
    synchronized void print(String msg) {
        System.out.println(msg);
    }
}

class SyncDemo2 {
    public static void main(String[] args) {
        Message m = new Message();

        Thread t1 = new Thread(() -> m.print("Hello"));
        Thread t2 = new Thread(() -> m.print("World"));

        t1.start();
        t2.start();
    }
}

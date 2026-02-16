class ThreadDemo5 extends Thread {
    public void run() {
        System.out.println("Thread running...");
    }
}
class Client5{

    public static void main(String[] args) throws Exception {
        ThreadDemo5 t = new ThreadDemo5();
        t.start();
        t.join();

        System.out.println("Main thread resumes");
    }
}

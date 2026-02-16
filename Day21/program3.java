class ThreadDemo3 extends Thread{
        public void run(){
                System.out.println("Thread Create : "+Thread.currentThread().getName());
        }
}
class Client3{
        public static void main(String[] args){
                ThreadDemo3 t = new ThreadDemo3();
                t.start();
		
		ThreadDemo3 t2 = new ThreadDemo3();
		t2.start();
                System.out.println("Main thread : "+Thread.currentThread().getName());
        }
}

class ThreadDemo1 extends Thread{
	public void run(){
		System.out.println("Thread Create : "+Thread.currentThread().getName());
	}
}
class Client1{
	public static void main(String[] args){
		ThreadDemo1 t = new ThreadDemo1();
		t.start();
		System.out.println("Main thread : "+Thread.currentThread().getName());
	}
}

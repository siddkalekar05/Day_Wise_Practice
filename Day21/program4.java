class ThreadDemo4 extends Thread{
        public void run(){
                for(int i=0;i<=5;i++){
			try{
				System.out.println("Current Thread : "+Thread.currentThread().getName());
				Thread.sleep(2000);
			}catch(Exception e){
			}
        }
}
}
class Client4{
        public static void main(String[] args){
                ThreadDemo4 t = new ThreadDemo4();
                t.start();
                System.out.println("Main thread : "+Thread.currentThread().getName());
        }
}

/*
Day 21 — Multithreading

Concept:
Creating thread using Runnable Interface.
*/

class ThreadDemo2 implements Runnable{ 
        public void run(){
                System.out.println("Thread Create : "+Thread.currentThread().getName());
        }
}
class Client2{
        public static void main(String[] args){
                Thread t = new Thread(new ThreadDemo2());
                t.start();
                System.out.println("Main thread : "+Thread.currentThread().getName());
        }
}

public class priority  extends Thread{
    public void run() {
        System.out.println("Running: " + Thread.currentThread().getName());
        System.out.println("Priority: " + Thread.currentThread().getPriority());
    }



    public static void main(String[] args) {

        priority t1 = new priority();
        priority t2 = new priority();
        priority t3 = new priority();

        t1.setPriority(Thread.MIN_PRIORITY);   
        t2.setPriority(Thread.NORM_PRIORITY);  
        t3.setPriority(Thread.MAX_PRIORITY);   

        t1.start();
        t2.start();
        t3.start();
    }
}

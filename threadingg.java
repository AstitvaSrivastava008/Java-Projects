/*class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();  // starts the thread
    }
}*/

/*class threadingg implements Runnable {
    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        threadingg t1 = new threadingg();
        Thread thread = new Thread(t1);
        thread.start();  // starts the thread
    }
}
    */


/*class Demo extends Thread {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(3000);
            } catch(Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        Demo t1 = new Demo();
        t1.start();
    }
}*/

class Demo extends Thread {
    public void run() {
        for(int i = 1; i <= 3; i++) {
            for(int j = 1; j <= 3; j++) {
                System.out.println(Thread.currentThread().getName() 
                                   + " i=" + i + " j=" + j);
            }
        }
    }

    public static void main(String[] args) {
        Demo t1 = new Demo();
        Demo t2 = new Demo();

        t1.start();
        t2.start();
    }
}
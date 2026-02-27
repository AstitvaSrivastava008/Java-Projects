/*class demon extends Thread{
    public void run(){
        System.out.println("thread is running");
    }
    public static void main(String[] args) {
        demon t1=new demon();
        t1.start();
    }
}*/
class demon implements Runnable{
    public void run(){
        for(int i=0;i<=5;i++){
            for(int j=0;j<=5;j++){
                //System.out.println("i="+i+" j="+j);
                System.out.println(Thread.currentThread().getName() 
                                   + " i=" + i + " j=" + j);
                                   System.out.println("thread is running");
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){
            System.out.println(e);
        }
            }
        
        }
    }
    public static void main(String[] args) {
        demon t1=new demon();
        demon t2=new demon();
        Thread thread=new Thread(t1);
        Thread thread2=new Thread(t2);
        thread.start();
        thread2.start();
    }
}
public class file_download extends Thread {
    private String filename;
    file_download(String filename) {
        this.filename = filename;
    }
    public void run(){
        for(int i=0;i<=5;i++){
        System.out.println("Downloading "+i*20 + "% ");
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){}
    }
            System.out.println("Download completed: " + filename);
}
        
        public static void main(String[] args) {
            file_download f1 = new file_download("file1.txt");
            file_download f2 = new file_download("file2.txt");
            f1.start();
            f2.start();
        }
    
}

package core;



public class Test {
    public static void main(String[] args) throws Exception {
        System.out.println("T1");
        Thread.sleep(100);
        new Thread(new T()).start();
    }





}
class T implements Runnable{
    @Override
    public void run() {
        System.out.println("T2");
    }
}
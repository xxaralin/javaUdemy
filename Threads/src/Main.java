public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.activeCount());

        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().isAlive());

        Thread2 thread2=new Thread2();
        thread2.start();
        System.out.println(thread2.isAlive());

        for (int i =3;i>0;i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("GOOO");
    }
}
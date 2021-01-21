package chap1;

public class Demo03 {
    public static void main(String[] args) {
        Thread t = new Demo03Thread();
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main的for循环：" + i);
        }
    }

}

class Demo03Thread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("run 的for循环：" + i);
        }
    }

}

//main的for循环：0
//run 的for循环：0
//run 的for循环：1
//run 的for循环：2
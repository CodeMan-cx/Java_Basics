package Practice_Demo1;
/*《代码题》
1、
创建多线程对象，开启多线程。
在子线程中输出1-100之间的偶数，主线程输出1-100之间的奇数。*/
public class Pracrice_Demo1 {
    public static void main(String[] args) {
        MyThread mt=new MyThread();

        Thread t=new Thread(mt);

        t.start();

        for (int i = 1; i <=100 ; i++) {
            if (i%2==1){
                System.out.println(i);
            }
        }
    }
}

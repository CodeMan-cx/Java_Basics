package ProducerAndCustomer_Demo;

public class Box {
    private int milk;

    private boolean state = false;

    public synchronized void put(int milk) {
        if (state) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.milk = milk;
        System.out.println("生产者把第" + this.milk + "瓶牛奶放进奶箱");
        state = true;
        notifyAll();
    }

    public synchronized void get() {
        if (!state) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("消费者拿到第" + this.milk + "瓶牛奶");
        state = false;
        notifyAll();
    }
}

package app;

/**
 * Created by sifu on 2017/4/9.
 */
//生产者
public class Producers implements Runnable {
    Shared shared = null;

    public Producers(Shared shared) {
        this.shared = shared;
    }

    private synchronized void produc() {
        for (int i = 0; i < 50; i++) {
            if (i % 2 == 0) {
                shared.setNS("小明", "男");
            } else {
                shared.setNS("小红", "女");
            }
        }
    }

    public void run() {
        produc();
    }
}

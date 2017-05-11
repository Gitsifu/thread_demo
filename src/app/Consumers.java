package app;

/**
 * Created by sifu on 2017/4/9.
 */
//消费者
public class Consumers implements Runnable {
    Shared shared = null;

    public Consumers(Shared shared) {
        this.shared = shared;
    }

    public void run() {
        for (int i = 0; i < 50; i++) {
            shared.getNS();
        }
    }
}

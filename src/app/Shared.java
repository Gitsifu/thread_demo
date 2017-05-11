package app;

/**
 * Created by sifu on 2017/4/9.
 */
//共享资源
public class Shared {
    private String name;
    private String sex;
    private boolean what = true;

    public synchronized void setNS(String name, String sex) {
        try {
            if (!what) {
                this.wait();//该线程等待
            }
            this.name = name;
            this.sex = sex;
            what = false;
            this.notify();//唤醒其他线程
        } catch (InterruptedException e) {
        }
    }

    public synchronized void getNS() {
        try {
            if (what) {
                this.wait();
            }
            System.out.println(this.name + "-" + this.sex);
            what = true;
            this.notify();
        } catch (InterruptedException e) {
        }
    }
}

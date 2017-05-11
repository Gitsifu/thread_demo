package app;

/**
 * Created by sifu on 2017/4/9.
 */
//测试类
public class AppDemo {
    public static void main(String[] args)
    {
        Shared shared = new Shared();
        new Thread(new Producers(shared)).start();
        new Thread(new Consumers(shared)).start();
    }
}

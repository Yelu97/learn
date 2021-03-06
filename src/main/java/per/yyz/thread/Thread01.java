package per.yyz.thread;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: YYZ
 * @CreateTime: 2020-11-18 23:01
 * @Description:
 */

public class Thread01 extends Thread {

    public static void main(String[] args) {

        Thread01 thread01 = new Thread01();
        thread01.start();

        for (int i = 0; i < 1000; i++) {
            System.out.printf("**主线程输出**%d \n", i);
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.printf("--子线程输出--%d \n", i);
            ;
        }
    }
}

package cn.icodening.leetcode.util;

import java.util.concurrent.CompletableFuture;

/**
 * @author icodening
 * @date 2021.05.12
 */
public class TimeTool {

    public static void checkWithSync(String title, Runnable runnable) {
        System.out.println(title + " begin......");
        long begin = System.currentTimeMillis();
        runnable.run();
        long end = System.currentTimeMillis();
        System.out.println(title + " finish......");
        System.out.println(title + " cost: " + (end - begin) + " ms.");
    }

    public static void checkWithAsync(String title, Runnable runnable) {
        System.out.println(title + " start......");
        long begin = System.currentTimeMillis();
        CompletableFuture.runAsync(runnable)
                .whenComplete((v, ex) -> {
            long end = System.currentTimeMillis();
            System.out.println(title + " finish......");
            System.out.println(title + " cost: " + (end - begin) + " ms.");
        });
    }
}

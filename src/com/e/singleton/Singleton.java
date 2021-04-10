package com.e.singleton;

public class Singleton {
    private volatile static Singleton uniqueInstance;//volatile 能保证多线程下也能实时正确处理这个变量
    private Singleton(){}

    public static Singleton getInstance(){
        if(uniqueInstance == null){
            // 如果还没创建，就再次检查，synchronized作用是同步，迫使每个线程进入这个方法时先等待其它线路离开该方法。
            synchronized (Singleton.class){
                if(uniqueInstance == null){
                    uniqueInstance = new Singleton();
                }
            }
        }

        return uniqueInstance;
    }
}

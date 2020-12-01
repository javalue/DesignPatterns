package com.example.designpatterns.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author tong.xu
 * @date 2020/12/1.
 * description：
 *
 * 读锁共享
 * 读写锁允许多个线程同时读取共享变量，读线程访问共享变量时，必须持有对应的读锁，读锁可以被多个线程持有。
 *
 *
 * 写锁排他
 * 读写锁一次只允许一个线程更新共享变量，写线程访问共享变量时，必须持有对应的写锁，写锁在任一时刻只能被一个线程持有。
 *
 *
 * 可以降级
 * 读写锁是一个支持降级的可重入锁，也就是一个线程在持有写锁的情况下，可以继续获取对应的读锁。
 * 这样我们可以在修改变量后，在其他地方读取该变量，并执行其他操作。
 *
 *
 * 不能升级
 * 读写锁不支持升级，读线程只有释放了读锁才能申请写锁
 *
 *
 * 三种保障
 * 读写锁虽然允许多个线程读取共享变量，但是由于写锁的特性，它同样能保障原子性、可见性和有序性。
 *
 *
 * 适用场景
 * 读写锁会带来额外的开销，只有满足下面两个条件，读写锁才是合适的选择
 *
 * 读操作比写操作频繁很多
 * 读取共享变量的线程持有锁的时间较长
 *
 * 作者：灯不利多
 * 链接：https://juejin.cn/post/6844903909178212359
 * 来源：掘金
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class WriteReadLock {

    public static void main(String[] args) {

        write1();
        write2();
        read1();
        read2();
    }

    private static final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private static final Lock readLock = readWriteLock.readLock();
    private static final Lock writeLock = readWriteLock.writeLock();

    private static void write1() {
        writeLock.lock();
        System.out.println("写线程1获取了写锁");
        try {
            System.out.println("写线程1开始执行操作");
            try {
                Thread.sleep(3 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } finally {
            writeLock.unlock();
            System.out.println("写线程1释放了写锁");
        }
    }

    private static void write2() {
        writeLock.lock();
        System.out.println("写线程2获取了写锁");
        try {
            System.out.println("写线程2开始执行操作");
        } finally {
            writeLock.unlock();
            System.out.println("写线程2释放了写锁");
        }
    }

    private static void read1() {
        readLock.lock();
        System.out.println("读线程1获取了读锁");
        try {
            System.out.println("读线程1开始执行操作");
            Thread.sleep(3 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            readLock.unlock();
            System.out.println("读线程1释放了读锁");
        }
    }

    private static void read2() {
        readLock.lock();
        System.out.println("读线程2获取了读锁");
        try {
            System.out.println("读线程2开始执行操作");
            Thread.sleep(3 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            readLock.unlock();
            System.out.println("读线程2释放了读锁");
        }
    }
}
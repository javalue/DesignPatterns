package com.example.designpatterns.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author tong.xu
 * @date 2020/12/1.
 * description：
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
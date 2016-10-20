package main.com.sshkim.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class StudyThread {

    public static void main(String[] args) throws InterruptedException {
	// write your code here
        ExecutorService executor = Executors.newFixedThreadPool(5);
        Future future = executor.submit(() -> "test");

        System.out.println(future);
        try {
            System.out.println(future.get());
        } catch (ExecutionException e) {
        }
    }
}

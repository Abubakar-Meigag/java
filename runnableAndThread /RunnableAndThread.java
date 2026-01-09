/*
 * RUNNABLE AND THREAD WORKING TOGETHER IN JAVA
 * ============================================
 *
 * CONCEPT:
 * --------
 * In Java, there are two main ways to create threads:
 * 1. Extend Thread class (inheritance approach)
 * 2. Implement Runnable interface (composition approach) - PREFERRED
 *
 * This example demonstrates approach #2 using Runnable with Thread.
 *
 * WHY RUNNABLE + THREAD?
 * ----------------------
 * - Runnable is a functional interface with a single method: run()
 * - It defines the TASK (what code should execute in the thread)
 * - Thread is the class that provides the execution mechanism (how to run it)
 * - Separation of concerns: task definition vs. thread management
 *
 * ADVANTAGES OF RUNNABLE OVER EXTENDING THREAD:
 * ----------------------------------------------
 * 1. Multiple Inheritance: Your class can extend another class while implementing Runnable
 * 2. Code Reusability: Same Runnable can be passed to multiple threads
 * 3. Better Design: Separates the task from the thread mechanism
 * 4. Thread Pool Compatible: Runnable objects work with ExecutorService and thread pools
 *
 * USE CASES:
 * ----------
 * - Background tasks (file downloads, data processing)
 * - Concurrent operations (multiple API calls simultaneously)
 * - Responsive UI applications (keep UI responsive while processing)
 * - Server applications (handle multiple client requests concurrently)
 * - Parallel computations (process large datasets in chunks)
 *
 * HOW IT WORKS:
 * -------------
 * 1. Create Runnable object (defines the task)
 * 2. Pass Runnable to Thread constructor
 * 3. Call start() on Thread (creates new thread and calls run())
 * 4. Both threads execute concurrently (parallel execution)
 */

public class RunnableAndThread {

      public static void main(String[] args) {

            Runnable obj1 = () -> {
                  int i = 0;
                  while (i < 5) {
                        System.out.println("hi");
                        try {
                              Thread.sleep(10);
                        } catch (InterruptedException e) {
                              e.printStackTrace();
                        }
                        i++;
                  }
            };

            Runnable obj2 = () -> {
                  int i = 0;
                  while (i < 5) {
                        System.out.println("hello");
                        try {
                              Thread.sleep(10);
                        } catch (InterruptedException e) {
                              e.printStackTrace();
                        }
                        i++;
                  }
            };

            Thread t1 = new Thread(obj1);
            Thread t2 = new Thread(obj2);

            t1.start();
            t2.start();
      }
}

package raceCondition;

/*
 * RACE CONDITION AND THREAD SYNCHRONIZATION DEMONSTRATION
 *
 * Thread Basics:
 * - A thread is a lightweight process that allows concurrent execution of code
 * - Multiple threads can run simultaneously, sharing the same memory space
 * - Threads enable parallel processing and improve application performance
 * - Each thread has its own call stack but shares heap memory with other threads
 *
 * Race Condition:
 * - Occurs when multiple threads access and modify shared data concurrently
 * - The final result depends on the unpredictable timing of thread execution
 * - Without synchronization, threads can interfere with each other's operations
 * - Example: Two threads incrementing the same counter can produce incorrect results
 *
 * Mutation (Shared State Modification):
 * - Mutation refers to changing the state of an object or variable
 * - In multi-threaded environments, concurrent mutations can lead to data inconsistency
 * - When one thread reads a value while another is modifying it, data corruption occurs
 * - The increment operation (count++) involves: read, modify, write - not atomic
 *
 * Synchronized Keyword:
 * - Ensures that only one thread can execute a synchronized method at a time
 * - Creates a mutual exclusion (mutex) lock on the object
 * - When a thread enters a synchronized method, it acquires the lock
 * - Other threads must wait until the lock is released before entering
 * - Prevents race conditions by serializing access to shared resources
 * - Guarantees thread-safe mutation of shared state
 *
 * How This Demo Works:
 * - Two threads (t1 and t2) each increment a shared counter 10,000 times
 * - Without 'synchronized', the result would be unpredictable (less than 20,000)
 * - With 'synchronized' on increment(), the result is always exactly 20,000
 * - The join() method ensures main thread waits for both threads to complete
 */

class Counter {

      int count;
      public synchronized void increment(){
            count++;
      }
}

public class RaceCondition {

      public static void main(String[] args) {

            Counter c = new Counter();

            Runnable obj1 = () -> {
                  int i = 0;
                  while (i < 10000) {
                        c.increment();
                        i++;
                  }
            };

            Runnable obj2 = () -> {
                  int i = 0;
                  while (i < 10000) {
                        c.increment();
                        i++;
                  }
            };

            Thread t1 = new Thread(obj1);
            Thread t2 = new Thread(obj2);

            t1.start();
            t2.start();

            try {
                  t1.join();
                  t2.join();
            } catch (InterruptedException e) {
                  e.printStackTrace();
            }

            System.out.println(c.count);
            
      }

}

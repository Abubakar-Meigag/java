package stringBuffer;

public class MyStringBuffer {
     
      public static void main(String a[]){

            // Strings by default are immutable in Java
            // we use StringBuffer class to create mutable strings to enable modification of string without creating new object
            StringBuffer sb = new StringBuffer("Hello");
            System.out.println(sb.capacity());
            sb.append(" World");
            System.out.println(sb);
            System.out.println("string lenght are: " + sb.length());
            System.out.println(sb.capacity());


            // StringBuilder is similar to StringBuffer but not synchronized
            // hence faster than StringBuffer
            // but not thread safe, that means multiple threads cannot access it simultaneously
            // and to avoid data inconsistency we use StringBuffer in multi-threaded environment
            StringBuilder sbb = new StringBuilder("Hi");
            System.out.println(sbb.capacity());
            sbb.append(" There");
            System.out.println(sbb);
            System.out.println("string lenght are: " + sbb.length());
            System.out.println(sbb.capacity());
      }
}

package enhancedLoop;

class Student {
      int no;
      String name;
      int marks;
}
public class Enhanced {

      public static void main(String a[]){

            Student s1 = new Student();
            s1.no = 1;
            s1.name = "Jon";
            s1.marks = 98;

            Student s2 = new Student();
            s2.no = 2;
            s2.name = "Ali";
            s2.marks = 70;
            
            Student s3 = new Student();
            s3.no = 3;
            s3.name = "Bob";
            s3.marks = 82;

            Student students[] = new Student[3];
            students[0] = s1;
            students[1] = s2;
            students[2] = s3;

            for(Student stud: students){
                  System.out.println(stud.name +": " + stud.marks);
            }

       } 
      
}

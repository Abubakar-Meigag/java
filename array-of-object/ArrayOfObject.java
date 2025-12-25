class Student {
      int no;
      String name;
      int marks;
}


public class ArrayOfObject {
	 public static void main(String a[]){

            Student s1 = new Student();
            s1.no = 1;
            s1.name = "Beko";
            s1.marks = 98;

            Student s2 = new Student();
            s2.no = 2;
            s2.name = "Allen";
            s2.marks = 78;
            
            Student s3 = new Student();
            s3.no = 3;
            s3.name = "Bob";
            s3.marks = 88;

            Student Students[] = new Student[3];
            Students[0] = s1;
            Students[1] = s2;
            Students[2] = s3;

            for(int i = 0;  i < Students.length; i++){
                  System.out.println(Students[i].name +": " + Students[i].marks);
            }

       } 
}

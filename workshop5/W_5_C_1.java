package workshop5;

import java.net.SocketTimeoutException;
import java.util.jar.Attributes.Name;

class student{
    String name;
    int Rollno;
}
public class W_5_C_1 {
    public static void main(String[] args) {
         student s1= new student();
         student s2= new student();
         s1.name="john";
         s2.Rollno=2;
         System.out.println("The name of student is "+ s1.name);
         System.out.println("The roll no of john is "+s2.Rollno);

    }
}

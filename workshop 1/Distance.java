
import java.util.Scanner;
public class Distance{
public static void main (String []args){
Scanner in = new Scanner (System.in);
System.out.print("Insert Distance in Kilometer=");
int Distance = in.nextInt();
double Mile= Distance*1.6;
System.out.println("Distance in mile is: " +Mile);
}
}

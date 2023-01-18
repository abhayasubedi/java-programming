import java.util.Scanner;
class c4{
    public static void main(String[]args){
        double p=0 ,g=0 ,m=0;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the first Subject:");
        int a= in.nextInt();
        System.out.print("Enter the second Subject:");
        int b=in.nextInt();
        System.out.print("Enter the third subject:");
        int c=in.nextInt();
        System.out.print("Enter the fourth Subject:");
        int d=in.nextInt();
        System.out.print("Enter the fifth Subject:");
        int e=in.nextInt();
        m=a+b+c+d+e;
        p=(m/500.0)*100.0;
        g=(p/100.0)*4;
        System.out.println("The total marks is "+m+"."+"The percentage is"+p+"."+"The grade is"+g+".");
       
       
    }
}
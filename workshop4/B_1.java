package workshop4;

import java.util.Scanner;
class B_1{
public static void main(String[] args){
int a[]={1,2,3,4};
Scanner s=new Scanner(System.in);
System.out.println("Enter a number");
int any=s.nextInt();
if(a[0]==any||a[1]==any||a[2]==any||a[3]==any){
System.out.println("The number is present");
}
else{
System.out.println("The number is not present");
}
}
}

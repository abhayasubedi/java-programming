import java.util.Scanner;
class d3{
    public static void main(String[]args){
        Scanner abc=new Scanner(System.in);
        int value=abc.nextInt();
        System.out.println("please enter time in Second");
        int totalmin=value/60;
        int sec=value%60;
        int hours=totalmin/60;
        int mymin= totalmin%60;
        System.out.println(hours+"hours"+mymin+"mins"+sec+"seconds");
       
    }
}
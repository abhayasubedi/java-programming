import java.util.Scanner;

class d2{

    public static void main(String[] args){

        Scanner s=new Scanner(System.in);

        System.out.println("Enter the floor");

        int a=s.nextInt();

        if(a<=13){

            System.out.println("the number of floors is:"+(a));

        }

        else{

            System.out.println("the number of floors is:"+(a-1));

        }

    }

}

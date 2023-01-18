
import java.util.Scanner;

class b7c{

    public static void main(String[] args){

        Scanner s=new Scanner(System.in);

        System.out.println("Enter the number of college credits earned");

        int a=s.nextInt();

        if(a>=90){

            System.out.println("Senior Status is");

        }

        else if(a>=60){

            System.out.println("Junior Status is");

        }

        else if(a>=30){

            System.out.println("Sophomore Status is");

        }

        else {

            System.out.println("Freshman Status is");

        }

    }

}
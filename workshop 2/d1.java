import java.util.Scanner;

class d1{

    public static void main(String[] args){

        Scanner s=new Scanner(System.in);

        System.out.println("Enter the number of copies to be printed");

        float a=s.nextFloat();

        if(a<=99){

            System.out.println("$0.30 per copy and total price:"+(a*0.30));

        }

        else if(a>99&&a<=499){

            System.out.println("$0.28 per copy and total price:"+(a*0.28));

        }

        else if(a>499&&a<=799){

            System.out.println("$0.27 per copy and total price:"+(a*0.27));

        }

        else if(a>799&&a<=1000){

            System.out.println("$0.26 per copy and total price:"+(a*0.26));

        }

        else{

            System.out.println("$0.25 per copy and total price:"+(a*0.25));

        }

    }

}
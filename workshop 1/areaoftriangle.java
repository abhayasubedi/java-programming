import java.util.Scanner;
public class areaoftriangle {
    public static void main(String[] args){
    try (Scanner area = new Scanner(System.in)) {
        System.out.println("Insert breath ");
        int b= area.nextInt();
        System.out.println("Insert height");
        int h= area.nextInt();
        int areaoftriangle= (b*h)/2;
System.out.println(areaoftriangle);
    }
    }
}

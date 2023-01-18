package workshop5;
class employee{
String name="Shishir";
int age=18;
Long number= 9813876767L;
String Address="Kalanki";
int Salary=40000;
}
public class W_5_C_3 {
    public static void main(String[] args) {
        employee n= new employee();
       
        System.out.println("The name of the Employee is "+n.name+"\nThe age of the employee is "+ n.age+"\n The number of the empolyeee is "+ n.number+"\n The address of the employee is "+ n.Address+" \n The salary of the Employee is "+n.Salary );

    }
}

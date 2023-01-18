public class C2 {
    public static void main(String[] args) {
        int num;
        int product =1;
        String a =System.console().readLine("Enter First number");
num = Integer.parseInt(a);
while(num !=0){
    a= System.console().readLine("Enter first number");
    num =Integer.parseInt(a);
    product =product*num;

}
System.out.printf("product=%d",product);
    }
}

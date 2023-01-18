package workshop5;

public class Savings {
    public static void interest(float p,float t,float r){
        float SI=(p*t*r)/100;
        System.out.println("Simple interest is:"+SI);
        }
        public static void main(String[] args){
        Savings s=new Savings();
        s.interest(40,5,2);
        }
}

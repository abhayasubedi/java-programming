package workshop5;

public class rect {
    public static void area(int side,int sideb){
        System.out.println("area is "+(side*sideb));
        System.out.println("perimeter is:"+2*(side+sideb));
        }
        public static void main(String[] args){
        rect s=new rect();
        s.area(6,4);
        }
}

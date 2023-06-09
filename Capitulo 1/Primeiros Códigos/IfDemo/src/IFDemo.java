public class IFDemo{
    public static void main(String[] args){
        int a, b,c;

        a = 2;
        b = 3;

        if(a < b) System.out.println("a is less than b");
        if(a == b) System.out.println("you won't see this");
        System.out.println();
        //        if(a < b) System.out.println("a is less than b
        //        else System.out.println("a is not less than b");
        //        System.out.println();
        c = a - b;
        System.out.println("c contains -1");
        if(c >= 0) System.out.println("c is non-negative");
        if(c < 0) System.out.println("c is negative");
        System.out.println();
        c = b - a;
        System.out.println("c contains 1");
        if(c >= 0) System.out.println("c is non-negative");
        if(c < 0) System.out.println("c is negative");
        //        System.out.println();
        //        if(a >= b) System.out.println("a is greater than or equal to b");
        //        if(a <= b) System.out.println("a is less than or equal to b");
        //        if(a == b) System.out.println("a is equal to b");
        //        if(a != b) System.out.println("a is not equal to b");
        //        if(a < b) System.out.println("this won't be displayed");
        //        if(a > b) System.out.println("this won't be displayed");
        //        System.out.println();
        //        if(a <= b) System.out.println("a is less than or equal to b");
        //        if(a >= b) System.out.println("a is greater than or equal to b");
    }
}

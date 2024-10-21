public class Swapping2Numbers {
    public static void main(String[] args) {
        int  a=10, b=20;
        System.out.println("Before swapping values are.."+a+" "+b);

        // logic1 - Third variable
        // int t=a; 
        // a=b; 
        // b=t;

        //logic2 - use + & - without using third varaibles
        // a=a+b;
        // b=a-b;
        // a=a-b;
        
        // logic3 - bitwise XOR (^)
        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println("After swapping values are.."+a+" "+b);
    }
    
}

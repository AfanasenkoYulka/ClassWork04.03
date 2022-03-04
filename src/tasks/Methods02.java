package tasks;

import java.util.Arrays;

public class Methods02 {
    public static void main(String[] args) {
        System.out.println(factorial(4));
        System.out.println(factorial(3));
        System.out.println(isEven(3));
        int a=1, b=2;
        int[] result = swap(a,b);
        //System.out.println("a="+a+", b="+b);
        System.out.printf("a=%d, b=%d%n",a,b);
        System.out.println(Arrays.toString(result));


    }

    /*
    1!=1; 2!=2; 3!=6; 4!=1*2*3*4=24;

     */
    static int factorial(int n){
        int result = 1;
        for (int i=1; i<=n; i++)
            result*=i;
        return result;
    }

    static boolean isEven(int n){
        if(n%2==0) return true;
        else return false;
    }
    static int max(int a, int b){
        if (b>a) return b;
        else return a;
    }
    static int[] swap(int a, int b) {
        int temp;
        temp = a; a=b; b=temp;
        int [] result = new int[2];
        result[0] = a;
        result[1] = b;
        return result;

    }
}

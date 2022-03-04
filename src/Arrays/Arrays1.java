package Arrays;

import java.util.Arrays;
import java.util.Random;

public class Arrays1 {
    public static void main(String[] args) {
        int size = 10;
        int[] arr = new int[size];

        System.out.println(Arrays.toString(arr));

        //заполнить по порядку числами 1,2,......10
        for (int i=1; i<=arr.length; i++)
            arr[i-1] = i;
        System.out.println(Arrays.toString(arr));
            //i=1: 0
            //i=2: 0

        //Заполнить случайными числами
        Random random = new Random();
        for (int i=1; i<=arr.length; i++)
            arr[i-1] = random.nextInt(90)+10;
        ///0..89
        //10..99

        System.out.println(Arrays.toString(arr));
    }


}

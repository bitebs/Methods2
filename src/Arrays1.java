import java.util.Arrays;
import java.util.Random;
//class = fields, methods
public class Arrays1 {
    static int size = 10;
    static int[] arr = new int[size];
    public static void main(String[] args) {
        fillOrder();
        System.out.println(Arrays.toString(arr));
        fillRandom();
        System.out.println(Arrays.toString(arr));
        //int sum = 0;
       // for (int i=0; i<arr.length; i++)
           // sum+=arr[i];
        System.out.println(sum());
/*
        //заполнить по порядку числами 1,2,.....,10
        for (int i=1; i<=10; i++)
            arr[i-1] = i;
        System.out.println(Arrays.toString(arr));

        //заполнить случайными числами
        Random random = new Random();
        for (int i=1; i<=arr.length; i++)
            arr[i-1] = random.nextInt(100);


        System.out.println(Arrays.toString(arr));

 */
    }

    static void fillOrder(){
        for (int i=1; i<=arr.length; i++)
            arr[i-1] = i;

    }
    static void fillRandom(){
        Random random = new Random();
        for (int i=1; i<=arr.length; i++)
            arr[i-1] = random.nextInt(100);
    }
    static int sum(){
        int sum = 0;
        for (int i=0; i<arr.length; i++)
            sum+=arr[i];
        return sum;
    }
}

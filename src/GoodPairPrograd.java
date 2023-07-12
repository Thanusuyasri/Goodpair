import java.util.Scanner;

public class GoodPairPrograd {
    public static int countGoodPair(int[] array,int k)
    {
        int size= array.length;
        for(int i=0; i<size-1;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(array[i]+array[j]==k)
                {
                    return 1;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfarray=scanner.nextInt();
        int[] array = new int[sizeOfarray];
        for(int i =0 ; i < sizeOfarray ; i++)
        {
            array[i]= scanner.nextInt();
        }
        int k = scanner.nextInt();
        System.out.println(countGoodPair(array,k));
    }
}

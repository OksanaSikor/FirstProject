package lesson4.multiArrays;

//найдите максимальное значение в 2-мерном массиве.

public class Practice1 {
    public static void main(String[] args) {
        int arr[][] = {{4, 0, 5, 9},{5, 8, 9, 0},{1, 2, 3, 4},{6, 6, 6, 7}};

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[0].length; j++)
            {
                if(max < arr[i][j])
                {
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
    }
}

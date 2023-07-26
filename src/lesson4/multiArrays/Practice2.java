package lesson4.multiArrays;

//найдите сумму элементов на главной диагонали

public class Practice2 {

    public static void main(String[] args) {

        int arr[][] = {{4, 0, 5, 9}, {5, 8, 9, 0}, {1, 2, 3, 4}, {6, 6, 6, 7}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    System.out.println(arr[i][j] + " ");
                }
            }
        }

    }
}

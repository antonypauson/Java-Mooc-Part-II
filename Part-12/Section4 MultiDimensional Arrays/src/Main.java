public class Main {
    public static void main(String[] args) {
        int rows = 2;
        int cols = 3;
        int[][] myArr = new int[rows][cols];

        System.out.println("row, column, value");
        for (int row = 0; row < myArr.length; row++) {
            for (int col = 0; col < myArr[row].length; col++) {
                int value = myArr[row][col];
                System.out.println("" + row + "," + col + "," + value);
            }
        }
    }
}
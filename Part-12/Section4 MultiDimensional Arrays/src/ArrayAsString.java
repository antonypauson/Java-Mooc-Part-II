public class ArrayAsString {
    public static void main(String[] args) {
        int rows = 2;
        int cols = 3;
        int[][] matrix = new int[rows][cols];
        matrix[0][1] = 5;
        matrix[1][0] = 3;
        matrix[1][2] = 7;
        System.out.println(arrayAsString(matrix));
        int[][] matrix1 = {
                {3, 2, 7, 6},
                {2, 4, 1, 0},
                {3, 2, 1, 0}
        };
        System.out.println(arrayAsString(matrix1));

    }

    public static String arrayAsString(int[][] array) {
        StringBuilder string = new StringBuilder();
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                string.append(array[row][col]);
            }
            string.append("\n");
        }
        return String.valueOf(string);
    }
}

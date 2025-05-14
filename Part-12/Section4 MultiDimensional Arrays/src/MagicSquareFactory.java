public class MagicSquareFactory {
    private int size;
    private int[][] square;

    public MagicSquareFactory(int size) {
        this.size = size;
       square = new int[size][size];
    }

    public void createMagicSquare() {
        int centerIndex = size / 2; //to be inserted one here

        int i = 0;
        int j = centerIndex;
        int num = 1;
        int length = square.length;


       while (num <= size * size) {
           square[i][j] = num;

           int nextI;
           int nextJ;
           if (i - 1 < 0) {
               nextI = length - 1;
           } else {
               nextI = i - 1;
           }

           if (j + 1 == length) {
               nextJ = 0;
           } else {
               nextJ = j + 1;
           }

           if (square[nextI][nextJ] != 0) {
               if (i + 1 == length) {
                   i = 0;
               } else {
                   i = i + 1;
               }
           } else {
               i = nextI;
               j = nextJ;
           }
           num++;

       }
        printMagicSquare();
    }

    public void printMagicSquare() {
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < square[i].length; j++) {
                string.append(square[i][j] + " ");
            }
            string.append("\n");
        }
        System.out.println(string);
    }

    public static void main(String[] args) {
        MagicSquareFactory threeMagicSquare = new MagicSquareFactory(3);
        threeMagicSquare.createMagicSquare();

    }
}

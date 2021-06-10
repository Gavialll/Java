package XandO;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {

        while (true) {
            System.out.println("- New Game -");
            gameStart();
        }
    }

    public static void gameStart() {
        Scanner scanner = new Scanner(System.in);
        String[][] mas = {{" ", " ", " "},
                          {" ", " ", " "},
                          {" ", " ", " "}};

        tablePrint(mas);

        boolean b = true;
        int i = 0;
        while (b) {
            System.out.print("Введіть комірку: ");
            String[] text = scanner.nextLine().split(",");

            int O = Integer.parseInt(text[0]);
            int I = Integer.parseInt(text[1]);

            if (mas[O][I].equals(" ")) {
                if ((i % 2) == 0) mas[O][I] = "X";
                else mas[O][I] = "O";
                i++;
            } else System.out.println("Комірка зайнята\n");
            tablePrint(mas);

            //

            for (int j = 0; j < mas.length; j++) {
                int[] horizontal = ifMasHorizontal(j, mas);
                int[] vertical = ifMasVertical(j, mas);

                if (horizontal[0] == 3 || vertical[0] == 3) {
                    System.out.println("Win X");
                    b = false;
                }
                if (horizontal[1] == 3 || vertical[1] == 3) {
                    b = false;
                    System.out.println("Win O");
                }
            }
            int[] diagonal = ifMasDiagonal(mas);
            int[] diagonal1 = ifMasDiagonal1(mas);
            if (diagonal[0] == 3 || diagonal1[0] == 3) {
                System.out.println("Win X");
            }
            if (diagonal[1] == 3 || diagonal1[1] == 3) {
                System.out.println("Win O");
            }
        }
    }

    public static void tablePrint(String[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {

                System.out.print(mas[i][j]);
                if (!(j == 2)) System.out.print(" | ");
            }
            if (i <= 1) System.out.println("\n----------");
        }
        System.out.println();
        System.out.println();
    }

    public static int[] ifMasHorizontal(int i, String[][] mas) {

        int x = 0;
        int y = 0;
        for (int j = 0; j < mas.length; j++) {
            if (mas[i][j].equals("X")) x++;
            if (mas[i][j].equals("O")) y++;
        }
        int[] a = {x, y};
        return a;
    }

    public static int[] ifMasVertical(int i, String[][] mas) {

        int x = 0;
        int y = 0;
        for (int j = 0; j < mas.length; j++) {
            if (mas[j][i].equals("X")) x++;
            if (mas[j][i].equals("O")) y++;
        }
        int[] a = {x, y};
        return a;
    }

    public static int[] ifMasDiagonal(String[][] mas) {

        int x = 0;
        int y = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i][i].equals("X")) x++;
            if (mas[i][i].equals("O")) y++;
        }
        int[] a = {x, y};
        return a;
    }

    public static int[] ifMasDiagonal1(String[][] mas) {

        int x = 0;
        int y = 0;
        for (int j = mas.length -1; j >= 0; j--) {
            for (int i = 0; i < mas.length; i++) {
                if (mas[i][j].equals("X")) x++;
                if (mas[i][j].equals("O")) y++;
            }
        }
        int[] a = {x, y};
        return a;
    }
}

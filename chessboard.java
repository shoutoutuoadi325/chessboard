import java.util.Scanner;

public class chessboard {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] chessboard = new char[5][5];// 注意：定义时写arr[5][5]，实际上是arr[0][0]-arr[4][4]
        int i = 0, j = 0;
        for (i = 0; i < 5; i++) {
            String tempString = sc.nextLine();
            for (int k = j = 0; j < 5; j++, k += 2) {
                chessboard[i][j] = tempString.charAt(k);
            }
        }
        final String tuichu = "exit";
        final String shuchu = "print";
        while (true) {
            String input = sc.nextLine();
            if (input.equals(tuichu)) {// 输入exit的情况（已检验正确）
                break;
            } else {
                if (input.equals(shuchu))// 输入print的情况（已检验正确）
                {
                    for (i = 0; i < 5; i++) {
                        for (j = 0; j < 5; j++)
                            System.out.print(chessboard[i][j] + "\t");
                        System.out.println();
                    }
                } else {
                    if (input.startsWith("at")) {
                        int x = Integer.parseInt(String.valueOf(input.charAt(3)));// 注意是3
                        // Integer.parseInt(str)是将一个字符串转换为int类型的基本方法
                        // String.valueOf()是将()类型转换为String类型的基本方法
                        // charAt()是返回指定索引处的字符
                        int y = Integer.parseInt(String.valueOf(input.charAt(5)));// 注意是5
                        if (x > 0 && x < 4 && y > 0 && y < 4) {
                            System.out.printf("[(%d,%d,%c),(%d,%d,%c),(%d,%d,%c),(%d,%d,%c),(%d,%d,%c)]",
                                    x, y, chessboard[x][y],
                                    x - 1, y, chessboard[x - 1][y],
                                    x + 1, y, chessboard[x + 1][y],
                                    x, y - 1, chessboard[x][y - 1],
                                    x, y + 1, chessboard[x][y + 1]);
                        }
                        if (x == 0 && y == 0) {
                            System.out.printf("[(%d,%d,%c),(%d,%d,%c),(%d,%d,%c)]",
                                    x, y, chessboard[x][y],
                                    x + 1, y, chessboard[x + 1][y],
                                    x, y + 1, chessboard[x][y + 1]);
                        }
                        if (x == 0 && y == 4) {
                            System.out.printf("[(%d,%d,%c),(%d,%d,%c),(%d,%d,%c)]",
                                    x, y, chessboard[x][y],
                                    x + 1, y, chessboard[x + 1][y],
                                    x, y - 1, chessboard[x][y - 1]);
                        }
                        if (x == 4 && y == 0) {
                            System.out.printf("[(%d,%d,%c),(%d,%d,%c),(%d,%d,%c)]",
                                    x, y, chessboard[x][y],
                                    x - 1, y, chessboard[x - 1][y],
                                    x, y + 1, chessboard[x][y + 1]);
                        }
                        if (x == 4 && y == 4) {
                            System.out.printf("[(%d,%d,%c),(%d,%d,%c),(%d,%d,%c)]",
                                    x, y, chessboard[x][y],
                                    x - 1, y, chessboard[x - 1][y],
                                    x, y - 1, chessboard[x][y - 1]);
                        }
                        if (x == 0 && y > 0 && y < 4) {
                            System.out.printf("[(%d,%d,%c),(%d,%d,%c),(%d,%d,%c),(%d,%d,%c)]",
                                    x, y, chessboard[x][y],
                                    x + 1, y, chessboard[x + 1][y],
                                    x, y - 1, chessboard[x][y - 1],
                                    x, y + 1, chessboard[x][y + 1]);
                        }
                        if (x == 4 && y > 0 && y < 4) {
                            System.out.printf("[(%d,%d,%c),(%d,%d,%c),(%d,%d,%c),(%d,%d,%c)]",
                                    x, y, chessboard[x][y],
                                    x - 1, y, chessboard[x - 1][y],
                                    x, y - 1, chessboard[x][y - 1],
                                    x, y + 1, chessboard[x][y + 1]);
                        }
                        if (y == 0 && x > 0 && x < 4) {
                            System.out.printf("[(%d,%d,%c),(%d,%d,%c),(%d,%d,%c),(%d,%d,%c)]",
                                    x, y, chessboard[x][y],
                                    x - 1, y, chessboard[x - 1][y],
                                    x + 1, y, chessboard[x + 1][y],
                                    x, y + 1, chessboard[x][y + 1]);
                        }
                        if (y == 4 && x > 0 && x < 4) {
                            System.out.printf("[(%d,%d,%c),(%d,%d,%c),(%d,%d,%c),(%d,%d,%c)]",
                                    x, y, chessboard[x][y],
                                    x - 1, y, chessboard[x - 1][y],
                                    x + 1, y, chessboard[x + 1][y],
                                    x, y - 1, chessboard[x][y - 1]);
                        }

                    } else {
                        System.out.println("Invalid input");
                    }
                }

            }
        }
    }
}
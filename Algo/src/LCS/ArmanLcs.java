package LCS;




import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 18101707
 * @author 18101330
 */
public class ArmanLcs {
 
    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    static String common = "";
 
    static String find(int i, int j, int[][] dir, char[] ch1) {
        if (dir[i][j] == 1) {
            common = ch1[i - 1] + common;
            find(i - 1, j - 1, dir, ch1);
        }
        if (dir[i][j] == 2) {
            find(i - 1, j, dir, ch1);
        }
        if (dir[i][j] == 3) {
            find(i, j - 1, dir, ch1);
        }
        if (dir[i][j] == 0) {
            return common;
        }
        return "";
    }
 
    public static String LCS(String s1, String s2) {
        common = "";
        int[][] matrix = new int[s1.length() + 1][s2.length() + 1];
        int[][] dir = new int[s1.length() + 1][s2.length() + 1];
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        for (int i = 0; i < ch1.length; i++) {
            for (int j = 0; j < ch2.length; j++) {
                if (ch1[i] == ch2[j]) {
                    matrix[i + 1][j + 1] = matrix[i][j] + 1;
                    dir[i + 1][j + 1] = 1;
                } else {
                    if (matrix[i + 1][j] == matrix[i][j + 1]) {
                        matrix[i + 1][j + 1] = matrix[i][j + 1];
                        dir[i + 1][j + 1] = 2;
                    } else {
                        matrix[i + 1][j + 1] = Math.max(matrix[i + 1][j], matrix[i][j + 1]);
                        if (matrix[i + 1][j] > matrix[i][j + 1]) {
                            dir[i + 1][j + 1] = 3;
                        } else {
                            dir[i + 1][j + 1] = 2;
                        }
                    }
                }
            }
        }
 
        find(ch1.length, ch2.length, dir, ch1);
        return common;
    }
 
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("D:\\Algo\\src\\LCS\\input.txt");
        Scanner sc = new Scanner(f);
        int numberOfString = sc.nextInt();
        sc.nextLine();
        String[] str = new String[numberOfString];
        for (int count = 0; count < numberOfString; count++) {
            str[count] = sc.nextLine();
        }
        String temp
                = "";
        for (int i = 0; i < numberOfString - 1; i++) {
            if (i == 0) {
                temp = LCS(str[i], str[i + 1]);
            } else {
                temp = LCS(temp, str[i + 1]);
            }
        }
        System.out.println(temp);
    }
 
}

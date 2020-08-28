package niuke.huawei.problem51_60;

import java.util.Scanner;

public class Solution52 {
    public static void main(String[] args) {
            Scanner cin = new Scanner(System.in);
            while (cin.hasNext()) {
                String s1 = " " + cin.next(), s2 = " " + cin.next();
                System.out.println(calStringDistance(s1, s2));
            }
        }

        public static int calStringDistance(String charA, String charB) {
            int n = charA.length(), m = charB.length();
            int[][] lev = new int[n][m];
            int cost;
            for (int i = 0; i < n; i++) lev[i][0] = i;
            for (int j = 0; j < m; j++) lev[0][j] = j;
            for (int i = 1; i < n; i++) {
                for (int j = 1; j < m; j++) {
                    char ch1 = charA.charAt(i), ch2 = charB.charAt(j);
                    if (ch1 == ch2) cost = 0;
                    else cost = 1;
                    lev[i][j] = getMin(lev[i - 1][j] + 1, lev[i][j - 1] + 1, lev[i - 1][j - 1] + cost);
                }
            }
            return lev[n - 1][m - 1];
        }

        public static int getMin(int a, int b, int c) {
            a = Math.min(a, b);
            b = Math.min(b, c);
            return Math.min(a, b);
        }
    }



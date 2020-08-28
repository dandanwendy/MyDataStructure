package niuke.huawei.problem101_110;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution104{
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        //sc.nextLine();
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<String[]> list = new ArrayList<>();

        *//*for(int i=0;i<n;i++){
            String s = sc.nextLine();
            list.add(stringPut(s));
        }*//*
        while(n>0){
            String s = sc.nextLine();
            list.add(stringPut(s));
            n--;
        }

        for(int j=0;j<list.size();j++){
            String[] res = list.get(j);
            for(int i=0;i<res.length;i++){
                System.out.println(res[i]);
            }
        }
    }

    public static String[] stringPut(String string){
        int num0= 8- (string.length()%8);
        if(num0!=8){
            for(int i=0;i<num0;i++){
                string = string+'0';
            }
        }
        //System.out.println(string);
        //int num = string.length()%8==0?string.length()/8 : string.length()/8+1;
        int num = string.length()/8;
        String[] s = new String[num];

        for(int i=0;i<num;i++){
            s[i] =string.substring(i*8,i*8+8);
        }

        return s;

    }*/


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = Integer.parseInt(scanner.nextLine());
            while (n > 0) {
                String string = scanner.nextLine();

                int num0= 8- (string.length()%8);
                if(num0!=8){
                    for(int i=0;i<num0;i++){
                        string = string+'0';
                    }
                }

                int num = string.length()/8;
                //String[] s = new String[num];

                for(int i=0;i<num;i++){
                    System.out.println(string.substring(i*8,i*8+8));
                }
                n--;
            }
        }
        scanner.close();
    }
}

package leetcode.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {

    //1
   /* public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int index = s.lastIndexOf(" ");
        String c = s.substring(index+1);
        System.out.println(c.length());
    }*/

 /*   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s="";
        while(input.hasNextLine()){
            s=input.nextLine();

            System.out.println(s.length()-1-s.lastIndexOf(" "));
        }
    }*/

    //2
    //注意不区分大小写
  /*  public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String s = input.nextLine().toUpperCase();
        char a = input.nextLine().toUpperCase().charAt(0);
        int sum=0;
        if(s != null && s.length() > 0){
            for(int i =0;i<s.length();i++){
                if(s.charAt(i)==a){
                    sum+=1;
                }
            }
        }
        System.out.println(sum);
    }*/

    //3
   /* public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int num = input.nextInt();
            ArrayList<Integer> list = new ArrayList<Integer>();

            for (int i = 0; i < num; i++) {
                int a = input.nextInt();
                list.add(a);
            }

            for(int i=0;i<num-1;i++){
                for(int j=i+1;j<num;j++){
                    if(list.get(i).equals(list.get(j))){
                        list.remove(j);
                        num--;
                        j--;
                    }
                }
            }

            Collections.sort(list);
            for(Integer i : list){
                System.out.println(i);
            }
        }
    }
*/

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();
        String s2 = input.nextLine();

        int s1remain = s1.length()%8;
        if(s1remain!=0){
            for(int i=0;i<8-s1remain;i++){
                s1=s1+'0';
            }
        }
        int s2remain = s2.length()%8;
        if(s2remain!=0){
            for(int i=0;i<8-s2remain;i++){
                s2=s2+'0';
            }
        }
        String[] sa = new String[(s1+s2).length()/8];
        for(int i =0;i<(s1+s2).length()/8;i++){
            sa[i]=(s1+s2).substring(i*8,i*8+8);
        }
        for( String i : sa){
            System.out.println(i);
        }

    }

}
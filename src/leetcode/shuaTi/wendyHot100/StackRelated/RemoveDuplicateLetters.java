package leetcode.shuaTi.wendyHot100.StackRelated;

import java.util.ArrayList;

public class RemoveDuplicateLetters {
    public static void main(String[] args) {
        System.out.println(removeDuplicateLetters("cbacdcbc"));
    }
    public static String removeDuplicateLetters(String s) {
        ArrayList<Character> list = new ArrayList();
        Character tail = s.charAt(0);
        if(s.length()==0) return "";

        for(int i=0;i<s.length();i++){
            if(list.isEmpty()){
                list.add(s.charAt(i));
                tail = s.charAt(i);
                continue;
            }

            if(list.contains(s.charAt(i))) continue;

            while(s.indexOf(tail, i) != -1 && !list.isEmpty() && tail>s.charAt(i)){
                    list.remove(Character.valueOf(tail));
                    if(!list.isEmpty()){
                        tail = list.get(list.size()-1);
                    }
                }
            list.add(s.charAt(i));
            tail = s.charAt(i);
            }


        String s1 = "";
        for(Character c:list){
            s1=s1+c;
        }
        return s1;
    }
}
/*public static String removeDuplicateLetters(String s) {
        ArrayList<Character> list = new ArrayList();
        Character tail = s.charAt(0);

        for(int i=0;i<s.length();i++){
            if(list.isEmpty()){
                list.add(s.charAt(i));
            }

            if(list.contains(s.charAt(i)) && s.charAt(i)<tail){
                 if(s.indexOf(tail, i) != -1){
                     list.remove(Character.valueOf(tail));
                     list.add(s.charAt(i));
                 }else{
                     /*list.remove(Character.valueOf(s.charAt(i)));
                     list.add(s.charAt(i));
                 }


                         tail = s.charAt(i);
                         }else if(!list.contains(s.charAt(i))){
                         if(s.indexOf(tail, i) != -1){
                         list.remove(Character.valueOf(tail));
                         list.add(s.charAt(i));
                         }else{
                         list.remove(Character.valueOf(s.charAt(i)));
                         list.add(s.charAt(i));
                         }
                         tail = s.charAt(i);

                         }
                         }
                         String s1 = "";
                         for(Character c:list){
                         s1=s1+c;
                         }
                         return s1;
                         }*/
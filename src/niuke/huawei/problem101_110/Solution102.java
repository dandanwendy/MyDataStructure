package niuke.huawei.problem101_110;

import java.util.*;

public class Solution102 {
    /*public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String str = in.next();
            int[] mat = new int[128];
            for(int i=0;i<str.length();i++){
                if((str.charAt(i)>='a' && str.charAt(i)<='z')||(str.charAt(i)>='A' && str.charAt(i)<='Z')||(str.charAt(i)>='0' && str.charAt(i)<='9'||str.charAt(i)==' ')){
                    int pos = str.charAt(i);
                    mat[pos]++;
                }
            }

            String res = "";
            for(int j=127;j>0;j--){
                for(int k=0;k<128;k++){
                    if(mat[k]==j)
                        res+=(char)k;
                }
            }
            System.out.println(res);
        }
        in.close();
    }*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            Map<Character, Integer> map = new TreeMap<>();
            String val = sc.nextLine();
            for (int i = 0; i < val.length(); i++) {
                char tmp = val.charAt(i);
                if (!map.containsKey(tmp)) map.put(tmp, 1);
                else map.put(tmp, map.get(tmp) + 1);
            }
            List<Map.Entry<Character, Integer>> lst = new ArrayList<>(map.entrySet());
            Collections.sort(lst, new Comparator<Map.Entry<Character, Integer>>() {
                @Override
                public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                    return o1.getValue() == o2.getValue() ? o1.getKey() - o2.getKey() : o2.getValue() - o1.getValue();
                }
            });
            for (Map.Entry<Character, Integer> m : lst) {
                System.out.print(m.getKey());
            }
            System.out.println();
        }
    }

    private static void show(Map<Character, Integer> m) {
        for (Map.Entry<Character, Integer> m1 : m.entrySet()) {
            System.out.println(m1.getKey() + ";" + m1.getValue());
        }
    }
}

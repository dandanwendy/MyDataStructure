package niuke.huawei.problem91_100;

import java.util.*;

//此题注意添加候选人的顺序要与输入一致
//为保证顺序，选择LinkedHashMap
public class Solution94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int person_num = sc.nextInt();

            sc.nextLine();
            String s1 = sc.nextLine();
            String[] s = s1.split(" ");
            List<String> list = new ArrayList<>();
            for(int i=0;i<person_num;i++){
                list.add(s[i]);
            }

            int poll_num  = sc.nextInt();

            sc.nextLine();
            String polls = sc.nextLine();
            String[] poll = polls.split(" ");

            Map<String,Integer> map = new LinkedHashMap<>();

            int valid = 0;
            for(int i=0;i<list.size();i++){
                map.put(list.get(i),0);
                for(int j=0;j<poll.length;j++){
                    if(poll[j].equals(list.get(i))){
                        map.put(list.get(i),map.get(list.get(i))+1);
                        valid +=1;
                    }
                }
            }


            /*for(int i=0;i<poll.length;i++){
                if(list.contains(poll[i])){
                    if(map.containsKey(poll[i])){
                        map.put(poll[i],map.get(poll[i])+1);
                    }else{
                        map.put(poll[i],1);
                    }
                }else{
                    if(map.containsKey("Invalid")){
                        map.put("Invalid",map.get("Invalid")+1);
                    }else{
                        map.put("Invalid",1);
                    }
                }
            }*/

            for(String string :map.keySet()){
                System.out.println(string+":"+map.get(string));
            }
            System.out.println("Invalid"+" : "+(poll.length-valid));
        }
    }
}

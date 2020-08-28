package niuke.huawei.huawei2016;


import java.util.*;

public class Test {
    static Map<String,Integer> map = new LinkedHashMap<>();
    static List<String> list2 = new LinkedList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list1 = new LinkedList<>();

       /* while (sc.hasNext()){
            String s = sc.nextLine();
            list1.add(s);
        }*/
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            if(s == null || "".equals(s)) break;
            list1.add(s);
        }
        String[] errors = new String[list1.size()];
        for(int i=0;i<list1.size();i++){
            errors[i] = list1.get(i);
        }
        infoError(errors);
        list2.forEach(items->{
            System.out.println(items);
        });
    }

    public static void infoError(String[] errors){
        for(int i=0;i<errors.length;i++){
            String[] file = errors[i].split("\\\\");
            if(map.containsKey(file[file.length-1])){
                map.put(file[file.length-1],map.get(file[file.length-1])+1);
            }else{
                map.put(file[file.length-1],1);
            }
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        for(int i=0;i<8;i++){
            String[] info = list.get(i).getKey().split(" ");
            if(info[0].length()>16){
                info[0] = info[0].substring(info[0].length()-16);
            }
            list2.add(info[0]+" "+info[1]+" "+list.get(i).getValue());
        }

        /*for(String s:map.keySet()){
            String[] info = s.split(" ");
            if(info[0].length()>16){
                info[0] = info[0].substring(info[0].length()-16);
            }
            list2.add(info[0]+" "+info[1]+" "+map.get(s));
        }*/
    }
}

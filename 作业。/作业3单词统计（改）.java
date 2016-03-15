import java.util.ArrayList; 
import java.util.Collections; 
import java.util.Comparator; 
import java.util.HashMap; 
import java.util.List; 
import java.util.Map; 
import java.util.StringTokenizer; 
import java.util.Map.Entry; 
import java.util.Scanner;
   
   
   
public class zhongyi {
    public static void main(String arg[]) {
        Map<String, Integer> map=
        //用于统计各单词的个数
        new HashMap<String, Integer>();
        String sentence="Word is case insensitive, i.e. “file”, “FILE”"
                         + "and “File” are considered the same word."; 
        //大写字母转化为小写
        sentence=sentence.toLowerCase();                     
        //将字符串分解成一个个的标记 
        StringTokenizer token=new StringTokenizer(sentence);  
        while (token.hasMoreTokens()) {
            //单词用这些分隔符 分开
            String word=token.nextToken(", “”?.!:\"\"''\n"); 
            int count;   
            //HashMap不允许重复的key，用这个特性，去统计单词的个数
            if (map.containsKey(word)) {                        
                count=map.get(word); 
                //如果已有这个单词则设置它的数量加1
                map.put(word, count + 1);                       
            } else {
                //如果没有这个单词则新填入数量为1 
                map.put(word, 1);
            }                                              
        } 
            //调用函数并输出      
            sort(map);                                           
    } 
 
public static void sort(Map<String, Integer> map) {
    List<Map.Entry<String, Integer>> infoIds =
    new ArrayList<Map.Entry<String, Integer>>(map.entrySet());  
    for ( int i = 0; i < infoIds.size(); i++) {
        Entry<String, Integer> id = infoIds.get(i);
        //字符大于等于4输出
        if (id.getKey().length()>=4) {                      
         System.out.println(id.getKey() + ":" + id.getValue()); 
        }
        
    } 
     
 
}
} 
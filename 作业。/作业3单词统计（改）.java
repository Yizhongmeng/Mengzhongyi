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
        //����ͳ�Ƹ����ʵĸ���
        new HashMap<String, Integer>();
        String sentence="Word is case insensitive, i.e. ��file��, ��FILE��"
                         + "and ��File�� are considered the same word."; 
        //��д��ĸת��ΪСд
        sentence=sentence.toLowerCase();                     
        //���ַ����ֽ��һ�����ı�� 
        StringTokenizer token=new StringTokenizer(sentence);  
        while (token.hasMoreTokens()) {
            //��������Щ�ָ��� �ֿ�
            String word=token.nextToken(", ����?.!:\"\"''\n"); 
            int count;   
            //HashMap�������ظ���key����������ԣ�ȥͳ�Ƶ��ʵĸ���
            if (map.containsKey(word)) {                        
                count=map.get(word); 
                //������������������������������1
                map.put(word, count + 1);                       
            } else {
                //���û���������������������Ϊ1 
                map.put(word, 1);
            }                                              
        } 
            //���ú��������      
            sort(map);                                           
    } 
 
public static void sort(Map<String, Integer> map) {
    List<Map.Entry<String, Integer>> infoIds =
    new ArrayList<Map.Entry<String, Integer>>(map.entrySet());  
    for ( int i = 0; i < infoIds.size(); i++) {
        Entry<String, Integer> id = infoIds.get(i);
        //�ַ����ڵ���4���
        if (id.getKey().length()>=4) {                      
         System.out.println(id.getKey() + ":" + id.getValue()); 
        }
        
    } 
     
 
}
} 
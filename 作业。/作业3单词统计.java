import java.util.ArrayList;  
import java.util.Collections;  
import java.util.Comparator;  
import java.util.HashMap;  
import java.util.List;  
import java.util.Map;  
import java.util.StringTokenizer;  
import java.util.Map.Entry;  
import java.util.Scanner;
  
  
  
public class zhongyi
{  
	
   public static void main(String arg[])
    {  
       
    	Map<String,Integer> map=new HashMap<String,Integer>();//����ͳ�Ƹ������ʵĸ��� 
        String sentence="Beware,beware!he'll cheat'ithout scruple,who can without fear.";  
        sentence=sentence.toLowerCase();
        StringTokenizer token=new StringTokenizer(sentence);  //���ַ����ֽ��һ�����ı��  
       
        while(token.hasMoreTokens())
        {                                                    
          String word=token.nextToken(", ����?.!:\"\"''\n");    //��������Щ�ָ��� �ֿ�
          int count;    
          if(map.containsKey(word))                           //HashMap�������ظ���key����������ԣ�ȥͳ�Ƶ��ʵĸ���  
          {     
            count=map.get(word);  
            map.put(word, count+1);                           //���HashMap����������ʣ�����������������1  
          }  
           else  
             map.put(word, 1);                                //���û��������ʣ��������룬����Ϊ1  
        }  
        sort(map);                                            //���ú��������  
    }  

  public static void sort(Map<String,Integer> map)
    {  
      List<Map.Entry<String, Integer>> infoIds = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());   
         for (int i = 0; i < infoIds.size(); i++)
         {                                                     //���  
            Entry<String, Integer> id = infoIds.get(i); 
            if(id.getKey().length()>=4)                        //�ַ����ڵ���4���
            System.out.println(id.getKey()+":"+id.getValue());  
       
         }  
    

    }  
}  

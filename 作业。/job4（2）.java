package Mzy;

import java.util.Map;  
import java.util.StringTokenizer;  
import java.util.Map.Entry; 
import java.util.ArrayList;  
import java.util.HashMap;  
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Collections;  
import java.util.Comparator;
import java.io.BufferedReader;
import java.io.File;
import java.util.Scanner;
import java.io.FileReader;
   
public class Mzy { 
	public static String txt2String(File file) {
		String result = "";
		try {
			//构造一个BufferedReader类来读取文件
			BufferedReader br = new BufferedReader(new FileReader(file));
			String s = null;
		    //使用readLine方法，一次读一行
		    while((s = br.readLine())!=null) {
		    result = result + "\n" +s;
		    }
		    br.close();    
		} catch(Exception e) {
		    e.printStackTrace();
		  }
		    return result;
    }

public static void main(String arg[]) {   
	System.out.println("请输入文件名");
	Scanner in = new Scanner(System.in);
    String str = in.next();
    System.out.println("查找的单词为:");
    String s1 = in.next();
    Scanner in1 = new Scanner(System.in);
    File file=new File("F:\\"+str+".txt");
    String sentence= txt2String(file); 
    //英文句子存放的地方
    in.close();
    Map<String,Integer> map=new HashMap<String,Integer>();  
    String turn_sentence= sentence.toLowerCase();//大小写转换语句
    StringTokenizer token=new StringTokenizer(turn_sentence); 
    //遍历改英文句子
    while(token.hasMoreTokens()) {   
       String word=token.nextToken(", :\"\"’!- — ;  《》.“”");  
       if(map.containsKey(word)){      
           int count=map.get(word);  
           map.put(word, count+1);     
       }  
       else  
           map.put(word, 1);          
    }  
   small(map,s1);                        
}  



public static boolean isNumeric(String str) {//判断是否为单词
    Pattern pattern = Pattern.compile("[0-9]*");
    Matcher isNum = pattern.matcher(str.charAt(0)+"");
    if (!isNum.matches()) {
    return false;
    }
    return true;
}


//输出函数
public static void small(Map<String,Integer> map,String s2) { 
   List<Map.Entry<String, Integer>> infoids = 
		   new ArrayList<Map.Entry<String, Integer>>(map.entrySet());   
   Collections.sort(infoids, new Comparator<Map.Entry<String, Integer>>() {    
       public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {     
           return (o2.getValue() - o1.getValue());     
       }     
   });
   long len=infoids.size();
   int error=0;
   for (int i = 0; i <len; i++) {   
       Entry<String, Integer> id =infoids.get(i);  
       if(id.getKey().length()>3){
    	 String s3 = id.getKey();
    	 if(s3.equals(s2 )) { 	   
             error++;
    		 System.out.println(id.getKey()+"出现的次数为:"+id.getValue());
           
           }

       }
   }  
   if(error==0) System.out.println("没有这个单词！");
   
   
}  
}



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
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.io.BufferedWriter;
   
public class Mzy { 
	public static String txt2String(File file){
		String result = "";
		      try{
		          BufferedReader br = new BufferedReader(new FileReader(file));//构造一个BufferedReader类来读取文件
		          String s = null;
		          while((s = br.readLine())!=null){//使用readLine方法，一次读一行
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
     File file=new File("E:\\"+str+".txt");
     String sentence= txt2String(file); 
     in.close();//英文句子存放的地方
     Map<String,Integer> map=new HashMap<String,Integer>();  
     String turn_sentence= sentence.toLowerCase();//大小写转换语句
     StringTokenizer token=new StringTokenizer(turn_sentence); 
     while(token.hasMoreTokens()){   //遍历改英文句子
       String word=token.nextToken(", :\"\"’!- — ;  《》.“”");  
       if(word.length()>=4)
       if(map.containsKey(word)) {      
          int count=map.get(word);  
          map.put(word, count+1);     
       } else { 
          map.put(word, 1); 
       }         
     }  
     small(map);                        
}  

public static boolean isNumeric(String str) {//判断是否为单词
 Pattern pattern = Pattern.compile("[0-9]*");
 Matcher isNum = pattern.matcher(str.charAt(0)+"");
 if (!isNum.matches()) {
   return false;
 }
 return true;
}

public static void small(Map<String,Integer> map) {  //输出函数
   List<Map.Entry<String, Integer>> infoids = 
		   new ArrayList<Map.Entry<String, Integer>>(map.entrySet());   
   Collections.sort(infoids, new Comparator<Map.Entry<String, Integer>>() {     //排序
       public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {     
           return (o2.getValue() - o1.getValue());     
       }     
   });
   long len=infoids.size();
   for (int i = 0; i <len; i++) {   
       Entry<String, Integer> id =infoids.get(i);  
       
    	   try{
    		    File file=new File("F:\\Result1.txt ");
    		    FileOutputStream fos = new FileOutputStream(file,true);
    		    OutputStreamWriter osw = new OutputStreamWriter(fos);
    		    BufferedWriter bw = new BufferedWriter(osw);
    		    bw.write(id.getKey()+":"+id.getValue());
    		    bw.write("\r\n");
    		    bw.close();

    		    } catch(Exception e) {
    		   
    		    }
       System.out.println(id.getKey()+":"+id.getValue()); 
   }
   
}  
}




	

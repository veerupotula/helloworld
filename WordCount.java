package com.capita.file;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;


public class WordCount 
{
   public static void main(String[] args) throws Exception 
   {
      int cnt=0;
      String s;
      String[] buffer; 
      File f1= new File("C:\\csvfile.csv");
      FileReader fr = new FileReader(f1);
      BufferedReader bfr = new BufferedReader(fr);
      Scanner sc = new Scanner(System.in);
      String wrd= "@TheOnion";
       
           

      while((s=bfr.readLine())!=null)   
      {
         buffer=s.split(" ");  
          for (String chr : buffer) 
          {
                 if (chr.equals(wrd))   
                 {
                   cnt++;    
                 }
          }
      }
      if(cnt==0)  
      {
         System.out.println("Word not found!");
      }
      else
      {
         System.out.println("Word : "+wrd+"found! Count : "+cnt);
      }
      
         fr.close();
   }


}
package com.capita.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSVExample2 {
	public static void main(String[] args) {
		String line = "";
		String splitBy = ",";
		int count = 0;
		String wrd = "@RealDaveBarton";

		try {
         //parsing a CSV file into BufferedReader class constructor  
			BufferedReader br = new BufferedReader(new FileReader("C:\\csvfile.csv"));
			while ((line = br.readLine()) != null) // returns a Boolean value
			{
				String[] columnNo = line.split(splitBy); // use comma as separator
				//System.out.println(columnNo[0] + columnNo[1] + columnNo[2]);
				if (columnNo[2].contains(wrd)) {
					count++;
				}
			}
		      if(count==0)  
		      {
		         System.out.println("Word not found!");
		      }
		      else
		      {
		         System.out.println("Word : "+wrd+"found! Count : "+count);
		      }

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
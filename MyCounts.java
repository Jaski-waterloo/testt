import java.io.File;
import java.util.Scanner;
import java.lang.Math;

import java.io.*;

public static class MyCounts
{
	public static String giveCount(String word) throws Exception
	  {
		  
			  File file = new File("temp/part-r-00000");
			  Scanner sc = new Scanner(file);
		  while (sc.hasNextLine())
                {
                        String temp = sc.nextLine();
                  
                        String yo = "";
                String[] arrOfStr = temp.split("\t");

                if(arrOfStr[0].equals(word))
			return(arrOfStr[1]);
		  }
		   return("No");
	   }
     public static void main(String[] Args) throws Exception{
     System.out.println(Integer.parseInt(giveCount("a")));
     }
}

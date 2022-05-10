import java.util.Scanner;
import java.io.File;
import java.io.IOException;
    
public class IndexOfV
	{

		public static void main(String[] args) throws IOException
			{
				Scanner file = new Scanner(new File( "IndexOfV.txt" ));
			        
			  
			     
			    while (file.hasNext())
			    	  {
			    		  String letter = file.nextLine();  
			    		  int index = letter.indexOf("v");
			    		  System.out.println(index/2);
			    	  }
			          

			}

	}

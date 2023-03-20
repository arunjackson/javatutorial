package com.javatutorial.java;
import java.util.*;

public class tutorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     inputing i =  new inputing();
	     i.dis();
		
	   int x;
	   Scanner sc = new Scanner(System.in);
       x =sc.nextInt();
       
	     
	  switchh s = new switchh();
	  s.answers(x);
	  
	  System.out.println("RETURN TO MAIN MENU ");
	  System.out.println(" ");
	  System.out.println("press 1 to learn more    "  + "   " + " press 2 to EXIT " );
	  int y;
	 
      y =sc.nextInt();
            
      if(y==1)
      {
    	  tutorial.main(args);
      }
      else 
      {
    	  System.out.println( "       Keep Learning       "); 
      }
      
	  sc.close();
		    		
		}

}

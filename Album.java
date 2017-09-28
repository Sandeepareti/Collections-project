package album;
import java.util.Scanner;
public class Album {
	
	

	public static void main(String[] args) {
				   
		    { 
		        String s1 = "song"; 
				String s2 = "melodies";
				s = new Scanner(System.in);
		        while(true)
		        {
		            System.out.println("music store");
		            System.out.println("Choose 1 for melodies:");
		            System.out.println("Choose 2 for classic:");
		            System.out.println("Choose 3 for fast:");
		            System.out.println("Choose 4 for EXIT:");
		            System.out.print("Choose the operation you want to perform:");
		            int n = s.nextInt();
		            switch(n)
		            {
		                case 1:
		                System.out.print("Enter 1 for melodies:-");
		               
		                if(s1 == s2)
		                {
		                    
		                    System.out.println("Please view melodies");
		                }
		                else
		                {
		                    System.out.println("Incorrect choice");
		                }
		                System.out.println("");
		                break;
		 
		                case 2:
		                System.out.print("Enter 2 for classic :");
		                s2 = s.toString();
		              
		                System.out.println("You selected classicmusic");
		                System.out.println("");
		                break;
		 
		                case 3:
		                System.out.println("fastbeat:");
		                System.out.println("");
		                break;
		 
		                case 4:
		                System.exit(0);
		            }
		        }
		    }
		}



	}



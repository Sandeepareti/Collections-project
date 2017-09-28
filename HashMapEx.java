import java.io.*;
import java.util.*;
import java.util.HashMap;
class Book1{
	String directorname,str;
	String heroname;
	int numberofshares;
	int id;
	public Book1(String name, String movie, int nos) {

		this.directorname = name;
		this.heroname = movie;
		this.numberofshares = nos;
	}
	 
}
public class HashMapEx
{
public static void main(String args[]) throws IOException
{
	int i=4,size=10;
	Map <Integer,Book1> map=new HashMap <Integer,Book1> ();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	//menu
	System.out.println("\t\t\tmusic store");
	while(true)
	{
		System.out.println("1.view :");
		System.out.println("2.Add :");
		System.out.println("3.Buy :");
		System.out.println("enter your choice :");
		int n = Integer.parseInt(br.readLine());
		String directorname;
		String Heroname;
		//int i=4,size=10;
		switch(n)
		{
		case 1: 
	//	Book1 b1=new Book1("DSP","atd",32); 
		//Book1 b2=new Book1("MS","Indra",31); 
//		Book1 b3=new Book1("BS","SSS",46);
		//Adding Books to map 
		//map.put(1,b1); 
		//map.put(2,b2); 
		//map.put(3,b3); 

		//Traversing map 
		for(Map.Entry<Integer, Book1> entry:map.entrySet()){ 
		int key=entry.getKey(); 
		Book1 b=entry.getValue(); 
		System.out.print(key + ":"); 
		System.out.println(b.directorname + " " + b.heroname + " " + b.numberofshares); 
		}
			break;
			
			
			
			
		case 2: System.out.println("enter directorname :");
        directorname = br.readLine();
        System.out.println("enter hero name :");
        Heroname = br.readLine();
        System.out.println("enter number of shares");
        int numberofshares = Integer.parseInt(br.readLine());

        if(i<size)
        {
        	Book1 bb=new Book1(directorname,Heroname,numberofshares);
	        	map.put(i, bb);
	        	i++;
        }
        
        for(Map.Entry<Integer, Book1> entry:map.entrySet())
        { 
    		int key=entry.getKey(); 
    		Book1 b=entry.getValue(); 
    		System.out.print(key + ":"); 
    		System.out.println(b.directorname + " " + b.heroname + " " + b.numberofshares);     
        }System.out.println("ÿour record has been added: ");
        break;
        
        
        
        
		case 3:
			System.out.println("Enter key to delete");
			int key1=Integer.parseInt(br.readLine());
			
			
            for(Map.Entry<Integer, Book1> entry:map.entrySet()){
            	int k=entry.getKey();
            	Book1 bb=entry.getValue();
            	if(key1==k)
            	{
            		bb.numberofshares=bb.numberofshares-1;
            	}
            }
            
            
			System.out.println("After buying  :");
			System.out.println();
			for(Map.Entry<Integer, Book1> entry:map.entrySet()){ 
	    		int key=entry.getKey(); 
	    		Book1 b=entry.getValue(); 
	    		System.out.print(key + ":"); 
	    		System.out.println(b.directorname + " " + b.heroname + " " + b.numberofshares);
	    	
			}   
		
		}
		
	}
}
}

package com.greatlearning.Driver;

import java.util.Scanner;

import com.greatlearning.LinkedList.LinkedList;

public class Main 
{
    public static void main(String[] args)
    {
 
       Scanner scan = new Scanner(System.in);
       int totalFloors ;
       System.out.println("enter the total no of floors in the building");
       totalFloors = scan.nextInt();
       System.out.println();
       int[] floors = new int[totalFloors];
       for(int i = 0 ; i < floors.length ;i++)
       {
    	   System.out.println("enter the floor size given on day : " + (i + 1));
    	   floors[i] = scan.nextInt();

       }
	   System.out.println();
       int currentFloor = totalFloors ;
       LinkedList llist = new LinkedList();
       System.out.println("The order of construction is as follows");
       System.out.println();
       for(int i = 0 ; i < floors.length ;i++)
       {
    	   if(floors[i] == currentFloor)
    	   {
    		   System.out.println("Day: " + (i + 1));
    		   System.out.print(floors[i] + " ");
    		   boolean isFound = true ;
    		   while(isFound)
    		   {
    			   currentFloor = currentFloor - 1 ;
    			   if (llist.search(llist.head, currentFloor))
    			   {
    				   System.out.print(currentFloor + " ");
    			   }
    			   else
    			   {
    				   isFound = false ;
    			   }
    		   }
    		   
    	   }
    	   else
    	   {
    		   llist.push(floors[i]);
    		   System.out.println("Day: " + (i + 1));
    	   }
    	   System.out.println();
       }
       

    }


}

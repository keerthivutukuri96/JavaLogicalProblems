package myproblems;

import java.util.Scanner;



public class CheckOrder{
   static boolean alphabetical_order(String my_str){
      int str_len = my_str.length();
      for (int i = 1; i < str_len; i++){
         if (my_str.charAt(i) < my_str.charAt(i - 1)){
        	 System.out.println(my_str.charAt(i));
        	 System.out.println(my_str.charAt(i-1));
            return false;
         }
      }
      return true;
   }
   static public void main(String[] args){
      System.out.println("enter your string");
      Scanner sc = new Scanner(System.in);
      String my_str = sc.nextLine();
      if (alphabetical_order(my_str)){
         System.out.println("The letters are in alphabetical order.");
      } else{
         System.out.println("The letters are not in alphabetical order.");
      }
   }
}

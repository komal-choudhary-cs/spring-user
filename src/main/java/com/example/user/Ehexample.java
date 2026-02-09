package com.example.user;

public class Ehexample {

    public static void main(String[] args) {
        try {
//        	int a=10/0;
            int arr[] = { 1, 2, 3 };
            System.out.println(arr[1]);
            
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is invalid!");
        } catch (Exception e) {
            System.out.println("Something went wrong");
        } finally {
            System.out.println("always execute");
       }
   }
}

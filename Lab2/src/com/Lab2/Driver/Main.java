package com.Lab2.Driver;
import java.util.Scanner;
import java.util.Arrays;
import com.Lab2.SecondProblem.*;

public class Main {

	public static void main(String[] args) {
		
		MergeSortImplementstion mergeSortImplementation = new MergeSortImplementstion();
		
	   NotesCount notescount = new NotesCount();
	   
	   System.out.println("Enter the size of currency denominations ");
	   
	   Scanner sc = new Scanner(System.in);
	   
	   int size = sc.nextInt();
	   
	   int[] notes = new int[size];
	   
	   System.out.println("Enter the currency denominatin value ");
	   
	   for(int i = 0; i <size; i++) {
		   
		   //do not enter zero
		   
		   notes[i] = sc.nextInt();
		   
		   System.out.println("Enter the amount you want to pay ");
		   
		   int amount = sc.nextInt();
		   
		   mergeSortImplementation.sort(notes,0,notes.length-1);
		   
		   notescount.notesCountImplementation(notes, amount);
	   }
	   
	}

}

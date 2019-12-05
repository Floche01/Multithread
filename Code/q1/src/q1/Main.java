package q1;

import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread[] threads = new MyThread[13];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a line:");
		String line = sc.nextLine().toUpperCase();
		
		int letter = 65;
		
		for(int i = 0; i < 13; i++){
			threads[i] = new MyThread((char)letter++, (char)letter++, line);
		}


	}
	
}

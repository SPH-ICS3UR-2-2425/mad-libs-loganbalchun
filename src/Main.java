import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		/*
		 * MadLibs Program
		 * Author: 
		 * Class: ICS3U
		 * Date: Sept. 16, 2024
		 * Make a program that asks for 10 inputs
		 * reads them into variables, and then prints out a story
		 * Make sure to include Strings, ints, and doubles!
		 */
		
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to Mad Libs!");
		System.out.println("What's your name?");
		String name = in.nextLine();
		System.out.println("Enter your favourite sport: ");
		String sport1 = in.nextLine();
		System.out.println("Enter the country you are from: ");
		String place = in.nextLine();
		System.out.println("Enter a random date: ");
		String date = in.nextLine();
		System.out.println("Who is your favourite music artist or band?");
		String song = in.nextLine();
		System.out.println("Who is your favourite athlete from the sport you previously mentioned?");
		String athlete = in.nextLine();
		in.nextLine();//flush the buffer
		System.out.println("How old are you?");
		int age = in.nextInt();
		
		
		System.out.println("On "+date+", "+name+" was walking down the streets of "+place+" while listening to "+song+". "+name+" was on their phone searching up "+sport1+" highlights, and out of nowhere, they bumped into "+athlete+" ");
	
		
	}

}

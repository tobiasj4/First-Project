
public class Song {
	/*
	 * CS312 Assignment 1.
	 * On my honor, Jacob Tobias, this programming assignment is my own work.
	 * Section Number: 50585
	 *
	 * A program to print out the lyrics to the
	 * children's song, "There was an old woman".
	 *
	 *  Name: Jacob Tobias
	 *  email address: tobiasslugger@gmail.com
	 *  UTEID: jwt943	
	 *  Section 5 digit ID: 50585
	 *  Grader name: Professor Roman Hennandex
	 *  Number of slip days used on this assignment: 0
	 */
	public static void main(String[] args) {
		verseOne();
		verseTwo();
		verseThree();
		verseFour();
		verseFive();
		verseSix();
		verseSeven();
		verseEight();
		
	}
	/*
	 * Each method that starts out with "inner" contains the third sentence in each verse
	 * and then each method after the first has the phrase that the previous method had in it, with 
	 * the repeating end to the song as well.
	 */
	public static void end(){
		System.out.println("I don't know why she swallowed that fly,");
		System.out.println("Perhaps she'll die.");
		System.out.println();
	}
	public static void inner2(){
		System.out.println("She swallowed the spider to catch the fly,");
		end();
	}
	public static void inner3(){
		System.out.println("She swallowed the bird to catch the spider,");
		inner2();
	}
	public static void inner4(){
		System.out.println("She swallowed the cat to catch the bird,");
		inner3();
	}
	public static void inner5(){
		System.out.println("She swallowed the dog to catch the cat,");
		inner4();
	}
	public static void inner6(){
		System.out.println("She swallowed the goat to catch the dog,");
		inner5();
	}
	public static void inner7(){
		System.out.println("She swallowed the cow to catch the goat,");
		inner6();
	}
	
	public static void verseOne(){
		System.out.println("There was an old woman who swallowed a fly.");
		end();
	}
	public static void verseTwo(){
		System.out.println("There was an old woman who swallowed a spider,");
		System.out.println("That wriggled and iggled and jiggled inside her.");
		inner2();
	}
	public static void verseThree(){
		System.out.println("There was an old woman who swallowed a bird,");
		System.out.println("How absurd to swallow a bird.");
		inner3();
	}
	public static void verseFour(){
		System.out.println("There was an old woman who swallowed a cat,");
		System.out.println("Imagine that to swallow a cat.");
		inner4();
	}
	public static void verseFive(){
		System.out.println("There was an old woman who swallowed a dog,");
		System.out.println("What a hog to swallow a dog.");
		inner5();
	}
	public static void verseSix(){
		System.out.println("There was an old woman who swallowed a goat,");
		System.out.println("She just opened her throat to swallow a goat.");
		inner6();
	}
	public static void verseSeven(){
		System.out.println("There was an old woman who swallowed a cow,");
		System.out.println("I don't know how she swallowed a cow.");
		inner7();
	}
	public static void verseEight(){
		System.out.println("There was an old woman who swallowed a horse,");
		System.out.println("She died of course.");
		System.out.println();
	}
}

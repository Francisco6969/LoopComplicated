package looptyloop;
import java.util.Random;
import java.util.Scanner;
public class LoopComplicated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		Random rnd=new Random();

		int hi;
		int low; 
		int hi2=0;
		System.out.println("Hi, time to make a time table.");
		System.out.println("What is the biggest number you want?");
		hi=in.nextInt();
		System.out.println("What is the biggest number you want?");
		low=in.nextInt();
		if (hi<low) {
			hi=low;
			low=hi2;
			System.out.println("Sorry but I was told to make this idiot proof");
		}
		while (hi<low) {
		System.out.print(low);
		while (hi<low) 
			System.out.print(low++); 
		}
			

	}
}

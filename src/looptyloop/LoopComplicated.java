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
		System.out.println("What is the smallest number you want?");
		low=in.nextInt();
		System.out.println("What is the biggest number you want?");
		hi=in.nextInt();
		if (hi<low) {
			hi2=hi;
			hi=low;
			low=hi2;
			System.out.println("Sorry but I was told to make this idiot proof");
		}
		System.out.print("\t");
		for (int x=low;x<=hi;x++) { 
			System.out.print(x+"\t");
		
		}
		System.out.println();
		System.out.println("\t");
		for (int y=low;y<=hi;y++) {
			System.out.print(y+"\t");
			for (int x=low;x<=hi;x++) {
				System.out.print(x*y+"\t");
			}
			System.out.println();
			System.out.println();
		}
		
	}


}


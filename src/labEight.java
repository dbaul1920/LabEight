import java.util.Scanner;

public class labEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to Comerica Park! How many bats will your player take?");
		Scanner input=new Scanner(System.in);
		int numOfBats =input.nextInt();
		long[][] hitsArray = new long[numOfBats][];
		
		// for loop FOR EACH time at bat, determine hit
				for (int i = 0; i < hitsArray.length; i++) {
					System.out.print("How did they do at bat? Enter 0 - Out, 1 - Single, 2 - Double, 3- Triple, 4 - Home Run ");
					Scanner input2=new Scanner(System.in);
					int hit =input2.nextInt();//how did they do?
					
			
					}

				

		

				}//end main

		
	}//end class

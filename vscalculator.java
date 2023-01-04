import java.util.Scanner;
class calculator{
	public static void main(String args[]){
		try (Scanner scan = new Scanner (System.in)) {
			System.out.println("choose your operation");
			System.out.println("1 for addition");
			System.out.println("2 for subtraction");
			System.out.println("3 for multiplication");
			System.out.println("4 for division");

			int choose=scan.nextInt();

			System.out.println("enter two numbers");
			int x= scan.nextInt();
			int y= scan.nextInt();

			if(choose ==1){
				System.out.println("the answer is: "+add(x,y));
			}
			else if(choose ==2){
				System.out.println("the answer is: "+sub(x,y));
			}
			else if(choose ==3){
				System.out.println("the answer is: "+mul(x,y));
			}
			else{
				System.out.println("the answer is: "+div(x,y));
			}
		}
	}
	public static int add(int x, int y){
		int n;
		n=x+y;
		return n;

	}
	public static int sub(int x, int y){
		int n;
		n=x-y;
		return n;
	}
	public static int mul(int x, int y){
		int n;
		n=x*y;
		return n;
	}
	public static int div(int x, int y){
		int n;
		n=x/y;
		return n;

	}
}
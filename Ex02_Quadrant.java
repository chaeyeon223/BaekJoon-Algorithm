import java.util.Scanner;

public class Ex02_Quadrant {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int Quadrant;
		
		if (x>0 && y>0) {
			Quadrant=1;
			System.out.println(Quadrant);
		}else if(x<0 && y>0) {
			Quadrant=2;
			System.out.println(Quadrant);
		}else if(x<0 && y<0) {
			Quadrant=3;
			System.out.println(Quadrant);
		}else if(x>0 && y<0) {
			Quadrant=4;
			System.out.println(Quadrant);
		}

	}

}

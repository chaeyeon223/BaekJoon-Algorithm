import java.util.Scanner;
public class Ex05_average {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int sum=0;
		int average=0;
		int score=0;
		for(int i=0;i<5;i++) {
			score=sc.nextInt();
			if(score<40) {
				score=40;
			}
			sum+=score;
		}
		average=sum/5;
		System.out.println(average);
	}
}



import java.util.Scanner;

public class Ex13_Average_maybe {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int caseNum=sc.nextInt(); //테스트 케이스 개수 입력받기
		double rate=0;
		for(int i=0;i<caseNum;i++){
			int[] scoreArr=new int[sc.nextInt()]; //각 케이스마다 학생의 수 입력받기
			
			int sum=0;
			for(int j=0;j<scoreArr.length;j++) {
				scoreArr[j]=sc.nextInt();
				sum+=scoreArr[j];
			}
			int avg=sum/scoreArr.length;
			int highsc=0;
			for(int j=0;j<scoreArr.length;j++) {
				if(scoreArr[j]>avg) {
					highsc++;
				}
			}
			System.out.printf("%.3f",100.0*highsc/scoreArr.length);
			System.out.println("%");
			
		}
		sc.close();

	}

}

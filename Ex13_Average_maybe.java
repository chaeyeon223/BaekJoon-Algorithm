import java.util.Scanner;

public class Ex13_Average_maybe {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int caseNum=sc.nextInt(); //�׽�Ʈ ���̽� ���� �Է¹ޱ�
		double rate=0;
		for(int i=0;i<caseNum;i++){
			int[] scoreArr=new int[sc.nextInt()]; //�� ���̽����� �л��� �� �Է¹ޱ�
			
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

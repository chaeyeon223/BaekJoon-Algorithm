import java.util.Scanner;

public class Ex10_Fraction {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		int num=sc.nextInt(); //���° �������� �Է¹ޱ�
		int line=1; //�밢��
		int sum=0;

		//�Է¹��� ����  14��� ?? 1+2+3+4+5 5��° �ٿ� �ִ� 4��° ģ��
		//line-(15-14)
		//8�̶�� ? 1+2+3+4
		//line-(10-8)
		
		//�� �Է��� �������� sum
		//line������ 1+2+3+4
		
		while(true) {
			sum+=line;
			if(num<=sum) {
				int a=line-(sum-num); //line�� ���°
				int b=line+1-a;
				if(line%2==0) {
					System.out.println(a+"/"+b);
				}else {
					System.out.println(b+"/"+a);
				}
				break;
			}
			line++;
		}
		

		
	}
}

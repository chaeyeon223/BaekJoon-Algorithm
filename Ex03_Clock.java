		//���� > 45 �̸� �׳� ��-45    H : �״�� / M : -45
		//���� < 45 �̸�     H : -1 / M : +15
		//�ð� = 0 �̸� �ð��� 23
import java.util.Scanner;

public class Ex03_Clock {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int hour=sc.nextInt();
		int minute=sc.nextInt();
		if (minute>=45) {
			minute-=45;
		}else {
			minute+=15;
			if(hour==0) {
				hour=23;
			}else {
				hour-=1;
			}

		}
		
		System.out.println(hour+" "+minute);
	}
}

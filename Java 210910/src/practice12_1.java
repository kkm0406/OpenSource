import java.util.Scanner;

public class practice12_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String ch;
		int a, b;
		System.out.print("���� ");
		a = sc.nextInt();
		ch = sc.next();
		b= sc.nextInt();
		int sum = 0;
		
		if(ch.equals("+")) {
			sum = a+b;
		}
		else if(ch.equals("-"))
			sum = a-b;
		else if(ch.equals("*"))
			sum = a*b;
		else if(ch.equals("/")) {
			if(b==0) {
				System.out.print("0���� ���� �� �����ϴ�");
				return;
			}
			else
				sum = a/b;
		}
		
		System.out.print(a+ch+b+"�� ��� ����� "+sum);
		
		sc.close();
	}

}

import java.util.Scanner;

public class practice12_2 {

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
		
		switch(ch) {
		case "+":
			sum = a+b;
			break;
		case "-":
			sum = a-b;
			break;
		case "*":
			sum = a*b;
			break;
		case "/":
			if(b==0) {
				System.out.print("0���� ���� �� �����ϴ�");
				return;
			}
			else
				sum = a/b;
			break;
		default:
			break;
		}
		
		System.out.print(a+ch+b+"�� ��� ����� "+sum);
		
		sc.close();
	}
}

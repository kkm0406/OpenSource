import java.util.Scanner;
public class practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("2�ڸ��� ���� �Է�(10~99): ");
		int num = sc.nextInt();
		int a = num/10;
		int b = num%10;
		if(a==b) {
			System.out.print("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�");
		}
		else {
			System.out.print("No! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�");
		}
		
		sc.close();
	}

}

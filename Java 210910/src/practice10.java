import java.util.Scanner;

public class practice10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x1, y1, r1, x2, y2, r2;
		System.out.print("ù��° ���� �߽ɰ� ������: ");
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		r1 = sc.nextInt();
		System.out.print("�ι�° ���� �߽ɰ� ������: ");
		x2 = sc.nextInt();
		y2 = sc.nextInt();
		r2 = sc.nextInt();
		
		double rdist = r1+r2;
		double dist  = Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2);
		dist = Math.sqrt(dist);
		if(rdist>=dist)
			System.out.print("�� ���� ���� ��ģ��");
		else
			System.out.print("�� ���� ���� ��ġġ �ʴ´�");
		
		sc.close();
	}

}

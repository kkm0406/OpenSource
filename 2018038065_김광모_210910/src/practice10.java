import java.util.Scanner;

public class practice10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x1, y1, r1, x2, y2, r2;
		System.out.print("첫번째 원의 중심과 반지름: ");
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		r1 = sc.nextInt();
		System.out.print("두번째 원의 중심과 반지름: ");
		x2 = sc.nextInt();
		y2 = sc.nextInt();
		r2 = sc.nextInt();
		
		double rdist = r1+r2;
		double dist  = Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2);
		dist = Math.sqrt(dist);
		if(rdist>=dist)
			System.out.print("두 원은 서로 겹친다");
		else
			System.out.print("두 원은 서로 겹치치 않는다");
		
		sc.close();
	}

}

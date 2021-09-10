import java.util.Scanner;
public class practice8 {

	public static boolean inRect(int x, int y, int a1, int b1, int a2, int b2) {
		if((x>=a1&&x<=a2) && (y>=b1&&y<=b2))
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("x1, y1, x2, y2를 입력하세요: ");
		
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		
		int rectx1 = 100, rectx2 = 200, recty1 = 100, recty2 = 200;
		
		boolean flag1 = inRect(x1, y1, rectx1, recty1, rectx2, recty2);
		boolean flag2 = inRect(x2, y2, rectx1, recty1, rectx2, recty2);
		
		if((flag1||flag2) == true)
			System.out.println("충돌");
		else
			System.out.println("충돌하지 않음");
		
		sc.close();
	}

}

import java.util.Scanner;

public class example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하세요: ");
		int money = sc.nextInt();
		int arr[] = new int[8];
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		for(int i=0;i<unit.length;i++) {
			arr[i] = money/unit[i];
			money = money-(unit[i]*(money/unit[i]));
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i] != 0) {
				System.out.println(unit[i]+"원 짜리: "+arr[i]+"개");
			}
		}
		sc.close();
	}

}

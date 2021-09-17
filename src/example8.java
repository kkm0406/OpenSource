import java.util.ArrayList;
import java.util.Scanner;

public class example8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 몇개: ");
		int num = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0;i<num;i++) {
			arr.add((int)(Math.random()*100+1));
			for(int j=0;j<i;j++) {
				if(arr.get(i) == arr.get(j)) {
					arr.remove(i);
					i--;
				}
			}
		}
		for(int i=0;i<arr.size();i++) {
			System.out.print(arr.get(i)+" ");
		}
		sc.close();
	}

}

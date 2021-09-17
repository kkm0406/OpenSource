
public class example10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [][] = new int[4][4];
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
					arr[i][j] = (int)(Math.random()*10+1);
			}
		}
		for(int n=0;n<6;n++) {
			int i = (int)(Math.random()*4);
			int j = (int)(Math.random()*4);
			if(arr[i][j]!=0)
				arr[i][j]=0;
			else
				n--;
		}
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}

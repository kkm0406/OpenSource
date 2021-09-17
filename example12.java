public class example12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = new int[args.length];
		for(int i=0;i<num.length;i++) {
			try {
				num[i] = Integer.parseInt(args[i]);
			}
			catch(NumberFormatException e) {
			}
		}
		int sum = 0;
		for(int i=0;i<num.length;i++)
			sum+=num[i];
		System.out.print(sum);
	}

}

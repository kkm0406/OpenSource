import java.util.Scanner;

public class example2 {

    public static class Grade{
        private int math;
        private int science;
        private int english;

        Grade(int a, int b, int c){
            this.math = a;
            this.science = b;
            this.english = c;
        }
        public float average(){
            float average = 0;
            average = (math+science+english)/3;
            return average;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력: ");
        int math = sc.nextInt();
        int science = sc.nextInt();
        int english = sc.nextInt();

        Grade me = new Grade(math, science, english);
        System.out.print("평균은: "+me.average());

        sc.close();
    }
}

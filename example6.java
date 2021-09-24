import java.sql.Array;
import java.util.Scanner;

class Circle{
    public double x;
    public double y;
    public double r;

    Circle(double x, double y, double r){
        this.x = x;
        this.y = y;
        this.r = r;
    }
    public double show(){
        double area = r*r*3.14;
        return area;
    }

}

public class example6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c [] = new Circle[3];
        double area [] = new double[3];
        for(int i=0;i<3;i++){
            System.out.print("x, y, radius >>");
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            double r = sc.nextDouble();
            c[i] = new Circle(x, y, r);
            area[i] = c[i].show();
        }

        if(area[0]>=area[1]){
            if(area[0]>=area[2] || area[1]>=area[2])
                System.out.println("가장 면적이 큰 원은 ("+c[0].x+", "+c[0].y+")"+c[0].r);
            if(area[2]>=area[0])
                System.out.println("가장 면적이 큰 원은 ("+c[2].x+", "+c[2].y+")"+c[2].r);
        }
        else {
            if(area[2]>=area[1])
                System.out.println("가장 면적이 큰 원은 ("+c[2].x+", "+c[2].y+")"+c[2].r);
            else
                System.out.println("가장 면적이 큰 원은 ("+c[1].x+", "+c[1].y+")"+c[1].r);
        }

        sc.close();


    }
}

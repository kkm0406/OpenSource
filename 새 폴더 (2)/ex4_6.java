class circle {
    int radius;
    public circle(int radius) {
        this.radius = radius;
    }
    public double getArea() {
        return 3.14*radius*radius;
    }
}

public class ex4_6 {
    public static void main(String[] args) {
        circle [] c;
        c = new circle[5];
        for(int i=0; i<c.length; i++)
            c[i] = new circle(i);
        for(int i=0; i<c.length; i++)
            System.out.print((int)(c[i].getArea()) + " ");
    }
}

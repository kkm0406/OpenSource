class circle1 {
    int radius;
    String name;

    public circle1() { // 매개 변수 없는 생성자
        radius = 1;
        name = ""; // radius의 초기값은 1
    }

    public circle1(int r, String n) { // 매개 변수를 가진 생성자
        radius = r;
        name = n;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }
}
    public class ex4_3 {
        public static void main(String[] args) {
            circle1 pizza = new circle1(10, "자바피자"); // Circle 객체 생성, 반지름 10
            double area = pizza.getArea();
            System.out.println(pizza.name + "의 면적은 " + area);
            circle1 donut = new circle1(); // Circle 객체 생성, 반지름 1
            donut.name = "도넛피자";
            area = donut.getArea();
            System.out.println(donut.name + "의 면적은 " + area);
        }
    }


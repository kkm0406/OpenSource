public class ex4_1 {
    public static class CIRCLE{
        int radius;
        String name;

        public CIRCLE() {}

        public double getArea(){
            return radius*radius*3.14;
        }
    }
    public static void main(String[] args) {
        CIRCLE pizza;
        pizza = new CIRCLE();
        pizza.radius = 10;
        pizza.name = "자바피자";
        double area = pizza.getArea();
        System.out.println(pizza.name+"의 면적은 "+area);

        CIRCLE donut = new CIRCLE();
        donut.radius = 2;
        donut.name = "자바도넛";
        area = donut.getArea();
        System.out.println(donut.name+"의 면적은 "+area);
    }
}

public class Main {
    public static void main(String[] args) {
        //printName("john");
        //printName("johan");

        System.out.println(calcCircleArea(1.));
        System.out.println(sum(1, 2));
    }

    static void hello() {
        System.out.println("hello");
    }

    static void printName(String name) {
        System.out.println(name);
    }

    static double calcCircleArea(double r) {
        double area = Math.PI * r * r;
        //return  area;
        return Math.PI * r * r;
    }

    static double calcCircleArea(int r) {
        double area = Math.PI * r * r;
        //return  area;
        return (int) Math.PI * r * r;
    }

    static  int sum(int a, int b){
        return a+b;
    }

}

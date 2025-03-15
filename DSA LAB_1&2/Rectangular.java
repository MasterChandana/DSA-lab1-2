class Rectangular {
    static double l = 10.0;
    static double w = 5.0;

    public double area() {
        return l * w;
    }

    public double perimeter() {
        return 2 * (l + w);

    }

    public static void main(String[] args) {
        Rectangular m = new Rectangular();
        double x = m.area();
        double y = m.perimeter();
        System.out.println("area" + x);

        System.out.println("perimeter" + y);
    }
}

public class Main {
    public static void main(String[] args) {

        Point p1 = new Point(10, 10);
        Point p2 = new Point(20, 20);
        Point p3 = new Point(10, 10);

        System.out.println("p1 = " + p1);

        System.out.println("p1 == p2 ? " + p1.equals(p2));
        System.out.println("p1 == p3 ? " + p1.equals(p3));

        System.out.println("""
                p1 hashCode = %s
                p3 hashCode = %s
                p4 hashCode = %s
                """ //
                .formatted( //
                        p1.hashCode(), //
                        p2.hashCode(), //
                        p3.hashCode()));

    }

}
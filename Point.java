
public record Point(int x, int y) implements Comparable<Point> {

    public double norm() {
        return Math.sqrt(x * x + y * y);
    }

    //TODO fixcomparable method Double.compare....
}
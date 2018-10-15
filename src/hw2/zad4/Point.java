package hw2.zad4;

public class Point implements Comparable<Point> {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    @Override
    public boolean equals(Object ob) {
        if (ob != null && ob instanceof Point) {
            Point t = (Point) ob;
            return t.x == x && t.y == y;
        }
        return false;
    }

    @Override
    public int compareTo(Point o) {
        if (x - o.x > 0 || y - o.y > 0)
            return 1;
        else if (y - o.y < 0 || x - o.x < 0)
            return -1;
        else
            return 0;
    }
}

package shape;

import java.util.ArrayList;

public class Polygon implements Shape {
    private ArrayList<Line> lines;

    public Polygon(ArrayList<Line> lines) {
        this.lines = lines;
    }

    public ArrayList<Line> getLines() {
        return lines;
    }

    public void setLines(ArrayList<Line> lines) {
        this.lines = lines;
    }
}

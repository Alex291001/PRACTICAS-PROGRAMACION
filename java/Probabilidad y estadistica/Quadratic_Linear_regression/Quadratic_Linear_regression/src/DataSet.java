public class DataSet {

    private int[] x;
    private int[] y;


    public DataSet() {
        x = new int[]{1, 1, 1, 1, 1};
        y = new int[]{1, 21, 41, 69, 105};
    }

    public int[] getX() {
        return this.x;
    }

    public int[] getY() {
        return this.y;
    }
}

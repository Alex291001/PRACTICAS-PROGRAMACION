public class DataSet {

    private int[] x;
    private int[] y;


    public DataSet() {
        x = new int[]{1, 2, 3, 4, 5};
        y = new int[]{9, 21, 41, 69, 105};
    }

    public int[] getX() {
        return this.x;
    }

    public int[] getY() {
        return this.y;
    }
}

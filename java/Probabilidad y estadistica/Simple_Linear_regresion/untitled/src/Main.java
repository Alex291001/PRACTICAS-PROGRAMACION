
public class Main {
    public static void main(String[] nousan) {
        DataSet ds = new DataSet();
        DiscreteMaths dm = new DiscreteMaths();
        SimpleLinearRegresion slr= new SimpleLinearRegresion();
        Object b0= slr.SimpleLinearRegresion(dm, ds.getX(), ds.getY(), 0);
        Object b1= slr.SimpleLinearRegresion(dm, ds.getX(), ds.getY(), 1);





        System.out.println("B1 =" + b1);
        System.out.println("B0 =" + b0);

    }
}
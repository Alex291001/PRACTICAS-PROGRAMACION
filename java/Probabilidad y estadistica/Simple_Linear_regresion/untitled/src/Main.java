
public class Main {
    public static void main(String[] nousan) {
        DataSet ds = new DataSet();
        DiscreteMaths dm = new DiscreteMaths();
        double nSumXY = dm.NsumYX(ds.getX(), ds.getY());
        double sumXSumY = dm.sumX(ds.getX()) * dm.sumY(ds.getY());
        double NsumXYmenosSumXSumY = nSumXY - sumXSumY;
        double NSumPowX = dm.powX(ds.getX());
        double b1 = NsumXYmenosSumXSumY / (NSumPowX - Math.pow(dm.sumX(ds.getX()), 2));
    //Proceso para encontrar B0
        double SigYimB1SigXi= dm.sumY(ds.getY())-(b1*dm.sumX(ds.getX()));
        double b0=SigYimB1SigXi/ds.getX().length;




        System.out.println("B1 =" + b1);
        System.out.println("B0 =" + b0);

    }
}
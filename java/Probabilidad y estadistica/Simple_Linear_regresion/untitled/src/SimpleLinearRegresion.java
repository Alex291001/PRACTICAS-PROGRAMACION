public class SimpleLinearRegresion {

    public SimpleLinearRegresion(){}

    public Object SimpleLinearRegresion(DiscreteMaths dm,int[] x,int[] y,int opc){
       //Proceso para encontrar B1
        double nSumXY = dm.NsumYX(x, y);
        double sumXSumY = dm.sumX(x) * dm.sumY(y);
        double NsumXYmenosSumXSumY = nSumXY - sumXSumY;
        double NSumPowX = dm.powX(x);
        double b1 = NsumXYmenosSumXSumY / (NSumPowX - Math.pow(dm.sumX(x), 2));
        //Proceso para encontrar B0
        double SigYimB1SigXi= dm.sumY(y)-(b1*dm.sumX(x));
        double b0=SigYimB1SigXi/x.length;

        switch (opc){
            case 0:
                return b0;

            case 1:
                return b1;
        }


        return null;
    }
}

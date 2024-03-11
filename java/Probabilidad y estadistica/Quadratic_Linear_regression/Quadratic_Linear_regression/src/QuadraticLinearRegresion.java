public class QuadraticLinearRegresion {
    public QuadraticLinearRegresion(){
    }

    public Object QuadraticLinearRegresion(DiscreteMaths n,int opc){
        double dt = 0.0;
        double SumX, SumY, SumX2, SumX3, SumX4, SumXY, SumX2Y, ds,r;

        SumX = n.SumX();
        SumY = n.SumY();
        SumX2 = n.SumX2();
        SumX3 = n.SumX3();
        SumX4 = n.SumX4();
        SumXY = n.SumXY();
        SumX2Y = n.SumX2Y();

        ds = (n.getX().length * SumX2 * SumX4) + (SumX * SumX3 * SumX2) + (SumX2 * SumX * SumX3) - (SumX2 * SumX2 * SumX2) - (SumX3 * SumX3 * n.getX().length) - (SumX4 * SumX * SumX);

        switch (opc) {

            case 0: //Para B0

                if (ds!=0){
                    r = ((SumY * SumX2 * SumX4) + (SumX * SumX3 * SumX2Y) + (SumX2 * SumXY * SumX3)) -( (SumX2Y * SumX2 * SumX2) + (SumX3 * SumX3 * SumY) + (SumX4 * SumXY * SumX));

                    dt=r/ds;} else return null;

                break;

            case 1://Para B1
                if (ds!=0){
                    r = (n.getX().length * SumXY * SumX4) + (SumY * SumX3 * SumX2) + (SumX2 * SumX * SumX2Y) - (SumX2 * SumXY * SumX2) - (n.getX().length * SumX2Y * SumX3) - (SumX4 * SumX * SumY);
                    dt=r/ds;

                }else return null;


                break;
            case 2://Para B2
                if (ds!=0){
                    r = (n.getX().length * SumX2 * SumX2Y) + (SumX * SumXY * SumX2) + (SumY * SumX * SumX3) - (SumX2 * SumX2 * SumY) - (n.getX().length * SumX3 * SumXY) - (SumX2Y * SumX * SumX);

                    dt=r/ds;
                } else return null;
                break;
        }


        return dt;
    }
}

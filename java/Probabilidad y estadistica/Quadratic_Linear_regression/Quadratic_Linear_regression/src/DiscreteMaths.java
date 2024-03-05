public class DiscreteMaths {

    int sum = 0;
    private int[] x, y;

    public Object DiscreteMaths(int[] x, int[] y, int n) {
        double dt = 0.0;
        double SumX, SumY, SumX2, SumX3, SumX4, SumXY, SumX2Y, ds,r;

        this.x = x;
        this.y = y;

        SumX = SumX(x);
        SumY = SumY(y);
        SumX2 = SumX2(x);
        SumX3 = SumX3(x);
        SumX4 = SumX4(x);
        SumXY = SumXY(x, y);
        SumX2Y = SumX2Y(x, y);
        ds = (x.length * SumX2 * SumX) + (SumX * SumX3 * SumX2) + (SumX2 * SumX * SumX3) - (SumX2 * SumX2 * SumX2) - (SumX3 * SumX3 * x.length) - (SumX4 * SumX * SumX);
        System.out.println(ds);
        switch (n) {

            case 0: //Para B0

                if (ds!=0){
                r = (SumY * SumX2 * SumX4) + (SumX * SumX3 * SumX2Y) + (SumX2 * SumXY * SumX3) - (SumX2Y * SumX2 * SumX2) - (SumX3 * SumX3 * SumY) - (SumX4 * SumXY * SumX);
                dt=r/ds;} else return null;

                break;

            case 1://Para B1
                if (ds!=0){
                r = (x.length * SumXY * SumX4) + (SumY * SumX3 * SumX2) + (SumX2 * SumX * SumX2Y) - (SumX2 * SumXY * SumX2) - (x.length * SumX2Y * SumX3) - (SumX4 * SumX * SumY);
                dt=r/ds;

                }else return null;


                break;
            case 2://Para B2
                if (ds!=0){
                r = (x.length * SumX2 * SumX2Y) + (SumX * SumXY * SumX2) + (SumY * SumX * SumX3) - (SumX * SumX2 * SumY) - (x.length * SumX3 * SumXY) - (SumX2Y * SumX * SumX);
                dt=r/ds;
                } else return null;
                break;
        }


        return dt;
    }

    public int SumX(int[] n) {
        sum = 0;
        for (int i : n)
            sum += i;

        System.out.println("SumX= " + sum);

        return sum;

    }

    public int SumY(int[] n) {
        sum = 0;
        for (int i : n)
            sum += i;

        System.out.println("SumY= " + sum);
        return sum;
    }

    public int SumX2(int[] n) {
        sum = 0;
        for (int i : n)
            sum += Math.pow(i, 2);

        System.out.println("SumX2= " + sum);
        return sum;

    }

    public int SumX3(int[] n) {
        sum = 0;
        for (int i : n)
            sum += Math.pow(i, 3);

        System.out.println("SumX3= " + sum);
        return sum;
    }

    public int SumX4(int[] n) {
        sum = 0;
        for (int i : n)
            sum += Math.pow(i, 4);
        System.out.println("SumX4= " + sum);
        return sum;

    }

    public int SumXY(int[] x, int[] y) {
        sum = 0;
        int s = 0;

        for (int i : x) {
            // System.out.println("i= "+i+" y[s]= "+y[s]);
            sum += (i) * y[s];
            s++;
        }

        System.out.println("SumXY= " + sum);
        return sum;

    }

    public int SumX2Y(int[] x, int[] y) {
        sum = 0;
        int s = 0;
        for (int i : x) {

            sum += Math.pow(i, 2) * y[s];
            s++;
        }
        System.out.println("SumX2Y= " + sum);
        return sum;

    }


}

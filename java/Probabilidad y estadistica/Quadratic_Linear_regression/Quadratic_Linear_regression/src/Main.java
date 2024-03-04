//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] nousan) {
        Object B0,B1,B2;
        DataSet ds= new DataSet();
        DiscreteMaths dm = new DiscreteMaths();
        B0=dm.DiscreteMaths(ds.getX(),ds.getY(),0);
        B1=dm.DiscreteMaths(ds.getX(),ds.getY(),1);
        B2=dm.DiscreteMaths(ds.getX(),ds.getY(),2);

        System.out.println("DB0= "+B0);
        System.out.println("DB1= "+B1);
        System.out.println("DB2= "+B2);



    }
}
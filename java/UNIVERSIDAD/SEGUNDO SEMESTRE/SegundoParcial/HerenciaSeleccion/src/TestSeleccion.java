import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TestSeleccion {

    public ArrayList<SeleccionFutbol> seleccion = new ArrayList<SeleccionFutbol>();
    public static Scanner lector = new Scanner(System.in);

    public static void main(String[] args) {


        int opc;

        do {

            System.out.println("*********************MENU*********************");
            System.out.println("1) Agregar Futbolista ");
            System.out.println("2) Agregar Entrenador");
            System.out.println("3) Agregar Masajista");
            System.out.println("4) Buscar Futbolista");
            System.out.println("5) Buscar Entrenador");
            System.out.println("6) Buscar Masajista");
            System.out.println("0)Salir");
            System.out.println("************************************************");
            opc = lector.nextInt();
            switch (opc){
                case 1:

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;

                case 0:
                    System.out.println("Saliendo");
                    break;

            }



        } while (opc != 0);


    }
}

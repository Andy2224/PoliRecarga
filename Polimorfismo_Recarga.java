
package polimorfismo_recarga;

/**
 *
 * @author Andrés Mogollón
 */
class Fallas{
    int TipoFalla(int numFalla){
        return numFalla;
    }
    float TipoFalla(float numFalla){
        return numFalla;
    }
    String TipoFalla(String numFalla){
        return numFalla;
    }
    char TipoFalla(char numFalla){
        return numFalla;
    }

}
public class Polimorfismo_Recarga {

    public static void main(String[] args) {
        Fallas fail=new Fallas();
        Fallas fail0=new Fallas();
        Fallas fail1=new Fallas();
        Fallas fail2=new Fallas();

        System.out.println("\t\t\tUNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE");
        System.out.println("\t\t\t\t    SEDE LATACUNGA");
        System.out.println("Nombre:Andrés Mogollón S.");
        System.out.println("Materia:Programación");
        System.out.println("NRC: 7450");
        System.out.println("\t\t\tPolimorfismo con Recarga\n");

        System.out.println("Clasificación de la Falla\n ");

        int Falla1;
        fail.TipoFalla(1001);
        Falla1=fail.TipoFalla(1001);
        System.out.println("Tipo de Falla Binario: "+Falla1);

        double Falla2;
        fail0.TipoFalla(64);
        Falla2=fail0.TipoFalla(64);
        System.out.println("Tipo de Falla : "+Falla2);

        String Falla3;
        fail1.TipoFalla("Falla en Cojinete");
        Falla3="Falla en Cojinete";
        System.out.println("Tipo de Falla: "+Falla3);

        char Falla4;
        fail2.TipoFalla('c');
        Falla4='c';
        System.out.println("Tipo de Falla: "+Falla4);
    }

}

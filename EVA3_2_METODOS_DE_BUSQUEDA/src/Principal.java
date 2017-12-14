
import java.util.Scanner;

/**
 *
 * @author EL CACTO
 */
public class Principal {

   
    public static void main(String[] args) {
   int[] iArreglo = new int[13];
        for (int i = 0; i < iArreglo.length; i++) {
            iArreglo[i] = (int) (Math.random() * 100);
        }
        imprimirArreglo(iArreglo);
        Scanner scBusca = new Scanner(System.in);
        System.out.println("Valor a buscar");
        int iVal = scBusca.nextInt();
        System.out.println("El valor " + iVal + " esta en la posicion: " + binarySearch(iArreglo, iVal));
    }

    public static void imprimirArreglo(int[] Arreglo) {
        for (int i : Arreglo) {
            System.out.print("[" + i + "]");
        }
        System.out.println("");
    }

   

    //METODO DE BUSQUEDA BINARIA
    public static int binarySearch(int arreglo[], int iValBus) {
        return binSearch(arreglo, iValBus, 0, arreglo.length - 1);
    }

    private static int binSearch(int arreglo[], int iValBus, int iLo, int iHi) {
        int iPos = -1;
        int iMid = iLo + ((iHi - iLo) / 2);//CALCULAMOSS EL PUNTO MEDIO
        if (iLo <= iHi) {
            if (iValBus == arreglo[iMid]) {
                iPos = iMid;
            } else if (iValBus > arreglo[iMid]) {
                iPos = binSearch(arreglo, iValBus, iMid + 1, iHi);
            } else if (iValBus < arreglo[iMid]) {
                iPos = binSearch(arreglo, iValBus, iLo, iMid - 1);
            }
        }
        return iPos;
    }
    
    //METODO DE BUSQUEDA SECUENCIAL 
     public static  int busquedaSecuencial(int vector[], int Elem){
            for (int i = 0; i < vector.length; ++i)
                if (vector[i] == Elem)
                    return i;
            return -1;
      }
}
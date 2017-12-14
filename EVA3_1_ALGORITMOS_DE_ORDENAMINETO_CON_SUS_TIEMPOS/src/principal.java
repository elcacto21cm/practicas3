/**
 *
 * @author EL Cacto
 */
public class principal {

    public static void main(String[] args) {
  
        System.out.println("arreglo tamaño 10");
        porInsertion(10);
        porSelection(10);
        porBubble(10);
        porQuick(10);
    }

    public static void porInsertion(int a) {
        int arreglo[];
        for (int i = 0; i < 10; i++) {
            arreglo = new int[a];
            for (int j = 0; j < arreglo.length; j++) {
                arreglo[j] = (int) (Math.random() * 10);
            }
            imprimirArreglo(arreglo);
            long lIni = System.nanoTime();
            insertionSort(arreglo);
            long lFin = System.nanoTime();
            long tiempoTotal = lFin - lIni;
            imprimirArreglo(arreglo);
            System.out.println("Tiempo Insertion Sort en arreglo numero " + i + " de tamaño " + a + " : " + tiempoTotal);
        }
    }

    public static void porSelection(int a) {
        int arreglo[];
        for (int i = 0; i < 10; i++) {
            arreglo = new int[a];
            for (int j = 0; j < arreglo.length; j++) {
                arreglo[j] = (int) (Math.random() * 10);
            }
            imprimirArreglo(arreglo);
            long lIni = System.nanoTime();
            selectionSort(arreglo);
            long lFin = System.nanoTime();
            long tiempoTotal = lFin - lIni;
            imprimirArreglo(arreglo);
            System.out.println("Tiempo Selection Sort en arreglo numero " + i + " de tamaño " + a + " : " + tiempoTotal);
        }
    }

    public static void porBubble(int a) {
        int arreglo[];
        for (int i = 0; i < 10; i++) {
            arreglo = new int[a];
            for (int j = 0; j < arreglo.length; j++) {
                arreglo[j] = (int) (Math.random() * 10);
            }
            imprimirArreglo(arreglo);
            long lIni = System.nanoTime();
            bubbleSort(arreglo);
            long lFin = System.nanoTime();
            long tiempoTotal = lFin - lIni;
            imprimirArreglo(arreglo);
            System.out.println("Tiempo BubbleSort en arreglo numero " + i + " de tamaño " + a + " : " + tiempoTotal);
        }
    }

    public static void porQuick(int a) {
        int arreglo[];
        for (int i = 0; i < 10; i++) {
            arreglo = new int[a];
            for (int j = 0; j < arreglo.length; j++) {
                arreglo[j] = (int) (Math.random() * 10);
            }
            imprimirArreglo(arreglo);
            long lIni = System.nanoTime();
            quickSort(arreglo);
            long lFin = System.nanoTime();
            long tiempoTotal = lFin - lIni;
            imprimirArreglo(arreglo);
            System.out.println("Tiempo QuickSort en arreglo numero " + i + " de tamaño " + a + " : " + tiempoTotal);
        }
    }

    public static void imprimirArreglo(int[] Arreglo) {
        for (int i : Arreglo) {
            System.out.print("[" + i + "]");
        }
        System.out.println("");
    }
    
    //para intercambiar balores en el array
    public static void intercambiar(int[] a, int i, int j) {
        int aux = a[i];
        a[i] = a[j];
        a[j] = aux;
    }


    //SELECTION SORT
    public static void selectionSort(int[] Arreglo) {
        for (int i = 0; i < Arreglo.length; i++) {
            int min = Arreglo[i];
            int pM = i;
            for (int j = i + 1; j < Arreglo.length; j++) {
                if (Arreglo[j] < min) {
                    min = Arreglo[j];
                    pM = j;
                }
            }
            Arreglo[pM] = Arreglo[i];
            Arreglo[i] = min;
        }
    }
    //BUBBLE
    public static void bubbleSort(int a[]) {
        int i, j;
        for (i = 0; i < a.length - 1; i++) {
            for (j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    intercambiar(a, i, j);
                }
            }
        }
    }

    // INSERTION
    public static void insertionSort(int[] a) {
        int i, j;
        int aux;
        for (i = 1; i < a.length; i++) {

       
            j = i;
            aux = a[i];
            while (j > 0 && aux < a[j - 1]) {

                a[j] = a[j - 1];
                j--;
            }

            a[j] = aux;
        }
    }

    

    // QUICK
    public static void quickSort(int a[]) {
        quick(a, 0, a.length - 1);
    }

    private static void quick(int a[], int primero, int ultimo) {
        int i, j, central;
        double pivote;
        central = (primero + ultimo) / 2;
        pivote = a[central];
        i = primero;
        j = ultimo;

        do {
            while (a[i] < pivote) {
                i++;
            }
            while (a[j] > pivote) {
                j--;
            }
            if (i <= j) {
                intercambiar(a, i, j);
                i++;
                j--;
            }
        } while (i <= j);

        if (primero < j) {
            quick(a, primero, j); 
        }

        if (i < ultimo) {
            quick(a, i, ultimo); 
        }
    }
     

}
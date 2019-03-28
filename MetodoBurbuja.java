import java.io.*;
 
public class MetodoBurbuja
{
    public static void main(String arg[]) throws IOException
    {
        /*creación del objeto para leer por teclado*/
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        /*tamaño de array*/
        System.out.print("\n Número de Datos a Insertar : ");
        int tam = Integer.parseInt(in.readLine());
        /*creación del array*/
        int arr[] = new int[tam];
        System.out.println();
        /*lectura del array*/
        int j = 0;
        for (int i = 0 ; i < arr.length;i++)
        {
            j+=1;
            System.out.print("Elemento " + j + " : ");
            arr[i] = Integer.parseInt(in.readLine());
        }
        burbuja(arr);
    }
 
    static void burbuja(int array[])
    {
        for(int i = 0; i < array.length - 1; i++)
        {
            for(int j = 0; j < array.length - 1; j++)
            {
                if (array[j] < array[j + 1])
                {
                    int tmp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        for(int i = 0;i < array.length; i++)
        {
            System.out.print(array[i]+"\n");
        }
    }
}
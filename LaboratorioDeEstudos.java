import java.util.ArrayList;
import java.util.Scanner;

import unitins.atvdd_recursividade.MetodoRecursivo;

class PlantaPredio{
    String endereco;
    String cor;    

}

public class LaboratorioDeEstudos {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner scan = new Scanner(System.in);

        // ArrayList <PlantaPredio> lista = new ArrayList<PlantaPredio>();
        
        // // LinkedList <PlantaPredio> lista2 = new LinkedList<PlantaPredio>();

        // ArrayTins <PlantaPredio> listaTins = new ArrayTins<PlantaPredio>();

        // System.out.println(lista.isEmpty());
        // System.out.println(listaTins.isEmpty());

        // System.out.println(lista.size());
        // System.out.println(listaTins.size());

        // lista.add(new PlantaPredio());
        // lista.add(new PlantaPredio());

        // listaTins.add(new PlantaPredio());
        // listaTins.add(new PlantaPredio());

        // System.out.println(lista.isEmpty());
        // System.out.println(listaTins.isEmpty());

        // System.out.println(lista.size());
        // System.out.println(listaTins.size());

        // System.out.println(lista);
        // System.out.println(listaTins);

        // System.out.println(listaTins.get(0));
        // System.out.println(listaTins.get(1));
        // System.out.println(listaTins.get(2));



        System.out.println("Forneça a string");
        String text = scan.nextLine();
        MetodoRecursivo.AnagramGen("", text);
        // System.out.println(text);
        
    }
}
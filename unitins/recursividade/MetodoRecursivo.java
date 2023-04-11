package unitins.recursividade;

import java.util.Scanner;

public class MetodoRecursivo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // System.out.println(fatorial(10));
        
        // System.out.println(fibonacci(8));

        // System.out.println(potencia(2, 5));

        // int [] vet = {2,9,11,15,28,33,40,51,64,76,77,82,94};
        // int indice = binarySearch(vet, 76, 0, 13);
        // System.out.println(indice);


        System.out.println("Forneça a string");
        String text = scan.nextLine();
        AnagramGen("", text);

    }
    public static void AnagramGen(String prefix, String word){
        if(word.length() <= 1)System.out.println( prefix + word);
        else{
            for(int i = 0; i < word.length(); i++){
                String newString = word.substring(0, i) + word.substring(i+1);
                AnagramGen(prefix + word.charAt(i), newString);
            }
        }
    }
    public static int binarySearch(int [] vet, int key, int prev, int next){
        int aux;
        if(prev > next) return -1; 
        aux = (prev + next)/2;
        if(vet[aux] == key) return aux;
        if(vet[aux] < key ) {
            return binarySearch(vet, key, aux+1, next);
        }
        else{
            return binarySearch(vet, key, prev, aux -1);
        }
        
    }

    public static double potencia(double num, int exp){
        if(exp == 0) return 1.0;
        return num* potencia(num, exp-1);
    }

    public static long fibonacci(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return fibonacci(n-1) + fibonacci(n -2);
    }

    public static int fatorial(int num){
        if(num == 0) return 1;
        else return num*fatorial(num -1);
    }
    
}



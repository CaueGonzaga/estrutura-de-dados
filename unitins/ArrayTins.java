package unitins;

public class ArrayTins <T>{
    
    private final int SIZE = 10;// variavel que vai adicionar posições novas ao executar o método resize
    private T[] array =  null; // T[] variável genérica que é substituida pelo Object em tempo de compilação
    private int lastPosition = 0;

    public ArrayTins(){
        array = (T[])new Object[SIZE];
    }

    public T get(int position){
        if(position < 0 || position >= lastPosition){
            throw new ArrayIndexOutOfBoundsException();
        }
        return array[position];
    }

    public String toString(){
        String result = "[";

        for (int position = 0; position < lastPosition; position++){
            result += array[position] + ",";
        }
        result += "]";
        return result;
    }
    public void add(T newElement){

        if(lastPosition == array.length){
            resize();
        }

        array[lastPosition] = newElement;
        lastPosition++;
    }
    public boolean isEmpty(){
        return lastPosition == 0 ? true : false; /// = return lastPosition == 0;
    }

    public int size(){

        return lastPosition;
    }

    private void resize(){

        T[] resizeArray = (T[]) new Object[array.length + SIZE];

        for(int position = 0; position < array.length; position++){
            resizeArray[position] = array[position];

        }
        array = resizeArray;
        System.gc();
    }

}

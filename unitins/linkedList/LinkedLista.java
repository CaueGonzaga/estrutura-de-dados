package unitins.linkedList;

public class LinkedLista<T> {
    
    private Node<T> head;
    private Node<T> lastPosition;
    private int size = 0;

    public int getSize(){
        return this.size;
    }

    public void add(T element){
        Node<T> newElement = new Node<T>(element);
        if(this.size == 0){
            this.head = newElement;
        }else{
            this.lastPosition.setNext(newElement);
        }
        this.lastPosition = newElement;
        this.size++;
    }


    @Override
    public String toString() {
        if(this.size ==0 ) return "[]";

        StringBuilder builder = new StringBuilder("[");

        Node<T> auxNode = this.head;

        for(int i=0; i < this.size -1; i++){
            builder.append(auxNode.getElement()).append(",");
            auxNode = auxNode.getNext();
        }
        builder.append(auxNode.getElement()).append("]");
        
        // builder.append(auxNode.getElement()).append(",");
        // while(auxNode.getNext() != null){
        //     auxNode = auxNode.getNext();
        //     builder.append(auxNode.getElement()).append(",");
        // }
        // return "LinkedList [ Head = " + head + "]\n";
        return builder.toString();
    }
     
}

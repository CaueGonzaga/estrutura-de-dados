package unitins.testes;

import unitins.linkedList.LinkedLista;

public class LinkedListTeste {
    public static void main(String[] args) {
        
        LinkedLista<Integer> list = new LinkedLista<>();

        list.add(1);

        // System.out.println("Tamanho da lista = " + list.getSize());
        // System.out.println(list);

        list.add(2);
        // System.out.println(list);

        list.add(3);
        System.out.println(list);

    }
}

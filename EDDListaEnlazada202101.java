
package eddlistaenlazada202101;

import java.util.LinkedList;

public class EDDListaEnlazada202101 {

    public static void main(String[] args) {
        LinkedList<String> listaheroes = new LinkedList<>();
        
        LinkedList<Paciente> listapacientes = new LinkedList<>();
        listapacientes.add(new Paciente("Jose", "Perez", 4588852, 30));
        

        //insercion
        listaheroes.add("Hulk");
        listaheroes.add("Iron man");
        listaheroes.add("cap america");
        listaheroes.add("Pantera negra");
        
        //insercion en desorden
        listaheroes.add(3, "Thor");
        
        //si esta vacia
        System.out.println(""+listaheroes.isEmpty());
        
        //tamaño de la lista
        int tam = listaheroes.size();
        
        //recorrido
        int i=0;
        while(i<tam){
            System.out.print("["+listaheroes.get(i)+"]->");
            i++;
        }
        
        System.out.println("");
        //eliminar
        listaheroes.remove(1);
        
        i=0;
        tam = listaheroes.size();
        while(i<tam){
            System.out.print("["+listaheroes.get(i)+"]->");
            i++;
        }
        
    }
    
}

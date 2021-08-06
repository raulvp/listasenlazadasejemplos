
package ejerciciolistasenlazadas2021;

import java.util.LinkedList;

public class EjercicioListasEnlazadas2021 {

  static LinkedList <Automovil> listaautos = new LinkedList<>();
    public static void main(String[] args) {
        //LinkedList <Automovil> listaautos = new LinkedList<>();
        /*1 para pequeños
        2 medianos
        3. grandes*/
        listaautos.add(new Automovil("p001", 1));
        listaautos.add(new Automovil("p002", 1));
        listaautos.add(new Automovil("p003", 2));
        listaautos.add(new Automovil("p004", 2));
        listaautos.add(new Automovil("p005", 2));
        listaautos.add(new Automovil("p006", 3));
        listaautos.add(new Automovil("p007", 3));
        
        //insertar auto de acuerdo al tamaño
         insertarAuto(new Automovil("p008", 2));
         insertarAuto(new Automovil("p009", 3));
         insertarAuto(new Automovil("p010", 1));
         insertarAuto(new Automovil("p011", 2));
         mostrarLista();
         //System.out.println(""+listaautos.isEmpty());
         
    }
    
    public static void insertarAuto(Automovil auto){
        //considerando que la lista esta ordenada 
        //se procede a insertar los nuevos autos como lleguen
        int tamAuto = auto.getTam();
        if(tamAuto==3){
            listaautos.addLast(auto);
        }else{
            //if(!listaautos.isEmpty()){
            for(int i=0;i<listaautos.size();i++){
                    int tam2 = listaautos.get(i).getTam();
                    if(tamAuto==1&&tam2==2){
                        listaautos.add(i, auto);
                        break;
                    }else if(tamAuto==2&&tam2==3){
                        listaautos.add(i, auto);
                        break;
                    }
            }
            
        }
    }
    
    public static void  mostrarLista(){
        for(int i=0; i<listaautos.size();i++){
            System.out.println("Cod Auto: "
                    +listaautos.get(i).codAuto
                    +" tam de auto: "+listaautos.get(i).getTam());
        }
    }
    
}

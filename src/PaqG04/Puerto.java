package PaqG04;

import java.io.Serializable;

public class Puerto implements Serializable {
    private Hub[] hubs;

    public Puerto(){
        //Inicializo los hubs
        hubs=new Hub[3];
        for(int i=0;i<3;i++){
            hubs[i]=new Hub(10,12);
        }
    }

    public String toString(){
        String resultado="";
        for(int i=0;i<3;i++){
            resultado+=hubs[i].toString()+"\n";
        }
        return resultado;
    }

    public String apilar(int nHub,Contenedor contenedor){
        if(hubs[nHub].apilarContenedor(contenedor)){
            return "El contenedor ha sido apilado con éxito";
        }
        return "El hub número:"+nHub+" está lleno";
    }

}

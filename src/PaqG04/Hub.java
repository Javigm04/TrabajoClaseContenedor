package PaqG04;

import java.util.Objects;

public class Hub {

    Contenedor[][] contenedores;

    public Hub(int filas, int columnas){
        contenedores=new Contenedor[filas][columnas];
    }

    public Contenedor getContenedor(int fila, int columna){
        if(fila<0 || fila> contenedores.length || columna<0 || columna> contenedores[0].length){
            return null;
        }
        return contenedores[fila][columna];
    }

    public String toString(){
       String resultado="";
        for(int f=0;f<contenedores.length;f++){
            for(int c=0;c<contenedores[f].length;c++){
                if(contenedores[f][c]==null){
                    resultado+="L ";
                }else{
                    resultado+="O ";
                }
            }
            resultado+="\n";
        }
        return resultado;
    }
    public void apilarContenedor(Contenedor contenedor) {
        int cont=0;
        if(contenedor.prioridad<=0 || contenedor.prioridad>=4){
            return;
        }
        if (contenedor != null) {
            if (contenedor.prioridad == 1) {
                for (int c = 0; c < contenedores[0].length; c++) {
                    for (int f = contenedores.length-1; f >= 0; f--) {
                        if (contenedores[f][c] == null) {
                            contenedores[f][c] = contenedor;
                            return;
                        }
                    }
                }
            } else {
                if (contenedor.prioridad == 2) {
                    for (int c = 1; c < contenedores[0].length; c++) {
                        for (int f = contenedores.length-1; f >= 0; f--) {
                            if (contenedores[f][c] == null) {
                                contenedores[f][c] = contenedor;
                                return;
                            }
                        }

                    }
                } else {
                        for (int c = 2; c < contenedores[0].length; c++) {
                            for (int f = contenedores.length-1; f >= 0; f--) {
                                if (contenedores[f][c] == null) {
                                    contenedores[f][c] = contenedor;
                                    return;
                                }
                                }
                            }
                        }
                    }
                }
            }

            public Contenedor desapilar(int columna) {
                if (columna < 0 || columna > contenedores[0].length) {
                    return null;
                }
                for (int f = 0; f < contenedores.length; f++) {
                    if (contenedores [f][columna] != null) {
                        Contenedor aux = contenedores[f][columna];
                        contenedores[f][columna] = null;
                        return aux;
                    }
                }
                return null;
            }
            public String mostrarDatos(int id){
                String resultado="";
                for(int f=0;f< contenedores.length; f++){
                    for (int c = 0; c < contenedores[f].length; c++) {
                        if(contenedores[f][c]!=null){
                            if(contenedores[f][c].id==id){
                                resultado+="Id: "+contenedores[f][c].id+"\n";
                                resultado+="Peso: "+contenedores[f][c].peso+"\n";
                                resultado+="Pais: "+contenedores[f][c].pais+"\n";
                                resultado+="Control de aduanas: "+contenedores[f][c].aduanas+"\n";
                                resultado+="Prioridad: "+contenedores[f][c].prioridad+"\n";
                                resultado+="Descripción: "+contenedores[f][c].descripcion+"\n";
                                resultado+="Empresa que lo envía: "+contenedores[f][c].empresaEnvia+"\n";
                                resultado+="Empresa que lo recibe: "+contenedores[f][c].empresaRecibe+"\n";
                                return resultado;
                        }
                    }
                    }
                }
                return "No existe ningún contenedor con el identificador "+id;
    }
    public String calcularContenedoresDeterminadoPais(String pais){
        if(pais==null){
            return "El país es nulo, no se puede comprobar";
        }
        int cont=0;
        for(int f=0;f< contenedores.length; f++){
            for (int c = 0; c < contenedores[f].length; c++) {
                if(contenedores[f][c]!=null) {
                    if (Objects.equals(contenedores[f][c].pais, pais)) {
                        cont++;
                    }
                }
            }
            }
        return "El número de contenedores que pertenece al país "+pais+" es: "+cont;
    }
}

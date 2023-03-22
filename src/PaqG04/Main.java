package PaqG04;

public class Main {
    public static void main(String[] args) {

        Hub Valencia=new Hub(10,12);
        Contenedor contenedor1=new Contenedor(1,10,"Africa",true,1,"Hola",
                "kljnljk","dsañkjgjh");
        Contenedor contenedor2=new Contenedor(2,100,"España",true,2,"Hola",
                "kljnljk","dsañkjgjh");
        Contenedor contenedor3=new Contenedor(3,10,"España",false,3,"Cosas",
                "empresa1","empresa5");
        Contenedor contenedor4=new Contenedor(40,10,"Alemania",true,4,"Hola",
                "kljnljk","dsañkjgjh");
        System.out.println(contenedor4.getPrioridad());
        Valencia.apilarContenedor(contenedor1);
        Valencia.apilarContenedor(contenedor2);
        Valencia.apilarContenedor(contenedor3);
        Valencia.apilarContenedor(contenedor4);
        System.out.println(Valencia.toString());
        Contenedor auxiliar=Valencia.desapilar(1);
        System.out.println("Se ha desapilado el contenedor con id "+auxiliar.id);
        System.out.println(Valencia.toString());
        Valencia.mostrarDatos(3);
        Valencia.mostrarDatos(40);
        Valencia.apilarContenedor(auxiliar);
        Valencia.calcularContenedoresDeterminadoPais("España");
        Valencia.calcularContenedoresDeterminadoPais("Africa");
        Valencia.calcularContenedoresDeterminadoPais("Francia");
    }
}
package CreandoAndo;

import CreandoAndo.SeresCielo.Angels;
import CreandoAndo.SeresCielo.Aves;
import CreandoAndo.SeresTierra.Animales;
import CreandoAndo.SeresTierra.Humano;

public class Main {
    public static void main(String[] args) {
        /*
        con el metodo de crearSeresVivos creo las diferentetes
        intancias para las clases
         */

        System.out.println("Vamos a crear instancias de las clases Animales - Aves - Angeles - Humano");

        System.out.println("");
        CreadorSeresVivos creando = new CreadorSeresVivos();

        Humano humano1 = (Humano) creando.crearSeresVivos("Humano" );
        humano1.volar();
        humano1.cambiarDimension();
        humano1.crecer();
        humano1.morir();
        System.out.println("");

        Animales animal1 =  (Animales) creando.crearSeresVivos("animal");
        animal1.reproducirse();
        animal1.caminar();
        animal1.respawnear();
        animal1.morir();
        animal1.reproducirse();
        System.out.println("");

        //animal1.volar(); no puedo usar este metodo porque no tengo acceso a el

        Aves ave1 = (Aves) creando.crearSeresVivos("ave");
        ave1.planear();
        ave1.caminar();
        ave1.crecer();
        ave1.reproducirse();
        System.out.println("");


        Angels angel1 = (Angels) creando.crearSeresVivos("angel");
        angel1.reproducirse();
        angel1.planear();
        angel1.morir();


    }
}

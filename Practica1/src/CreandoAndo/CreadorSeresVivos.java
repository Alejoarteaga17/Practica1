package CreandoAndo;

import CreandoAndo.SeresCielo.Angels;
import CreandoAndo.SeresCielo.Aves;
import CreandoAndo.SeresTierra.Animales;
import CreandoAndo.SeresTierra.Humano;

public class CreadorSeresVivos implements Creador {

    @Override
    public SeresVivos crearSeresVivos(String tipoSer) {
         if( tipoSer.toLowerCase()=="humano"){

             return new Humano();

         } else if (tipoSer.toLowerCase()=="animal") {
             return new Animales();

         } else if (tipoSer.toLowerCase()=="ave") {
             return new Aves();

         } else if (tipoSer.toLowerCase()=="angel") {
             return new Angels();

         }else {
             throw new IllegalArgumentException("El tipo de ser ingresado no ha sido encontrado ("+ tipoSer+")");
         }
    }


//    public static void main(String[] args) {
//        System.out.println("\n ");
//
//        Humano humano1 = new Humano();
//        humano1.volar();
//        humano1.cambiarDimension();
//        humano1.planear();
//        System.out.println("\n ");
//
//        Animales animal1= new Animales();
//        animal1.reproducirse();
//        animal1.crecer();
//        animal1.morir();
//        animal1.nacer();
//        animal1.respawnear();
//        System.out.println("\n ");
//        //animal1.volar();
//        // este metodo no está disponible para las clases de son solo seres de tierra
//
//        Aves ave1 = new Aves();
//        ave1.cambiarDimension();
//        ave1.reproducirse();
//        ave1.volar();
//        System.out.println("\n ");
//
//        Angels angel1 = new Angels();
//        angel1.reproducirse();
//        angel1.planear();
//        angel1.morir();
//
//    }

}

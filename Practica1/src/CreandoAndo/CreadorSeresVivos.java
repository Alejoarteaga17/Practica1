package CreandoAndo;

import CreandoAndo.SeresCielo.Angels;
import CreandoAndo.SeresCielo.Aves;
import CreandoAndo.SeresTierra.Animales;
import CreandoAndo.SeresTierra.Humano;

public class CreadorSeresVivos implements Creador {

    @Override
    public SeresVivos crearSeresVivos(String tipoSer) {
         if(tipoSer.toLowerCase().equals("humano")){
             return new Humano();

         } else if (tipoSer.toLowerCase().equals("animal")) {
             return new Animales();

         } else if (tipoSer.toLowerCase().equals("ave")) {
             return new Aves();

         } else if (tipoSer.toLowerCase().equals("angel")) {
             return new Angels();

         }else {
             throw new IllegalArgumentException("El tipo de ser ingresado no ha sido encontrado ("+ tipoSer+")");
         }
    }


}

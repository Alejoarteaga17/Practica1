package CreandoAndo.SeresCielo;

import CreandoAndo.SeresTierra.SerTierra;
import CreandoAndo.SeresVivos;
public class Angels extends SeresVivos implements SerCielo, SerTierra {
    @Override
    public void volar() {
        System.out.println("Volando como un angel");
    }

    @Override
    public void cambiarDimension() {
        System.out.println("Cambio de dimension Rapidamente desde Angel");
    }

    @Override
    public void planear() {
        System.out.println("Puedo planear con alas de angel");

    }

    @Override
    public void nacer() {
        System.out.println("Nací magicamente porque soy Angel");

    }

    @Override
    public void crecer() {
        System.out.println("Creciendo modo angel");
    }

    @Override
    public void reproducirse() {
        System.out.println("No me reproduzco soy un angel");

    }

    @Override
    public void respawnear() {
        System.out.println("Si spawneo, soy un Angel");

    }

    @Override
    public void morir() {
        System.out.println("Un Angel muere a los 1000 años");

    }

    @Override
    public void caminar() {
        System.out.println("Bajo a la tierra y camino como un Angel");
    }
}

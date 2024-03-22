package CreandoAndo.SeresTierra;
//Override modifica la funcionalidad de los metodos en las diferentes clases(Polimorfismo?)

import CreandoAndo.SeresCielo.SerCielo;
import CreandoAndo.SeresVivos;

public class Humano extends SeresVivos implements SerTierra, SerCielo {

    @Override
    public void volar() {
        System.out.println("Vuelo en avion caro como Humano");

    }

    @Override
    public void cambiarDimension() {
        System.out.println("Cambio de dimension a la velocidad de la luz  como Humano");

    }

    @Override
    public void planear() {
        System.out.println("Planeando en humano");

    }

    @Override
    public void respawnear() {
        System.out.println("Juego maincraf y respawneo como Humano");

    }

    @Override
    public void nacer() {
        System.out.println("Naciendo por cesarea en Humano");

    }

    @Override
    public void crecer() {
        System.out.println("Soy una persona muy alta");

    }

    @Override
    public void reproducirse() {
        System.out.println("Tengo 7 hijos hombres y les gusta el azul");

    }

    @Override
    public void morir() {
        System.out.println("Me mori a los 100 años");

    }

    @Override
    public void caminar() {
        System.out.println("Caminando como un humano");
    }
}


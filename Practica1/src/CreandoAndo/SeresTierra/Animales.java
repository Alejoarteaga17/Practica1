package CreandoAndo.SeresTierra;

import CreandoAndo.SeresVivos;
//Es hija de seresVivos, implementa las otras dos  y por esto
//tiene que sobreescribir los metodos
public class Animales extends SeresVivos implements SerTierra {
    @Override
    public void respawnear() {
        System.out.println("Respawneo como animal?");

    }

    @Override
    public void nacer() {
        System.out.println("Me demore 12 meses en nacer como Animal");

    }

    @Override
    public void crecer() {
        System.out.println("Creciendo y creciendo como Animal");

    }

    @Override
    public void reproducirse() {
        System.out.println("Me reproduzco como un conejo en Animal");

    }

    @Override
    public void morir() {
        System.out.println("Me muero :| en Animal");

    }
}

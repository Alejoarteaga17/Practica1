package CreandoAndo.SeresCielo;

import CreandoAndo.SeresTierra.SerTierra;
import CreandoAndo.SeresVivos;

//Es hija de seresVivos, implementa las otras dos  y por esto
//tiene que sobreescribir los metodos
public class Aves extends SeresVivos implements SerCielo, SerTierra {
    @Override
    public void volar() {
        System.out.println("Volando como Ave");
    }

    @Override
    public void cambiarDimension() {
        System.out.println("Cambiando de Dimension birds mode");
    }

    @Override
    public void planear() {
        System.out.println("Planeando como un pajaro");
    }

    @Override
    public void nacer() {
        System.out.println("Rompendo el cascaron com Ave");

    }

    @Override
    public void crecer() {
        System.out.println("Dejando el nido");

    }

    @Override
    public void respawnear() {
        System.out.println("soy un ave y respawneo ");
    }

    @Override
    public void reproducirse() {
        System.out.println("Poninedo mas huevos como ave");

    }

    @Override
    public void morir() {
        System.out.println("Descansa en paz pajaro");

    }

    @Override
    public void caminar() {
        System.out.println("Caminando en dos patas en Ave");
    }
}

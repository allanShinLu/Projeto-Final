package RPG.Personagens;

import RPG.Habilidades.Normal.Atacar;
import RPG.Habilidades.Normal.Proteger;

public class Druida extends Persona implements Proteger, Atacar, Agradecimento {
    public Druida(double dano, double vida, double velocidade, double destreza, double defesa, double mana) {
        super(dano, vida, velocidade, destreza, defesa, mana);
    }

    @Override
    public void AdicionarPersonagem(){
        System.out.println("Você escolheu o Drúida!!");
    }
    @Override
    public void MostrarInfo(){
        System.out.println("Ataque: " + dano);
        System.out.println("Defesa: " + defesa);
        System.out.println("Vida: " + vida);
        System.out.println("Velocidade: " + velocidade);
        System.out.println("Destreza: " + destreza);
        System.out.println("Mana: " + mana);
    }
    @Override
    public void AtacarInimigo(){
        System.out.println("Voce atacou o inimigo");
    }
    @Override
    public void AtacarNPC(){
        System.out.println("Voce atacou o NPC");
    }
    @Override
    public void AtacarAliado(){
        System.out.println("Voce atacou o seu Aliado");
    }
    @Override
    public void Protege(){
        System.out.println("Voce protegeu o aliado");
    }
    @Override
    public void Obrigado(){
        System.out.println("As forças da natureza estarão conosco" + "\n");
    }
}

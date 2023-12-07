package RPG.Habilidades.Especial;

public class ArqueiroH {
    double dano;

    public double ChuvaDeFlechas(double dano){ //Reduz velocidade do oponente e causa 10 + (200% do ataque) de dano
        this.dano = dano;
        return dano;
    }
    public double FlechaPerfurante(double dano){// reduz a armadura em 40% por 3 rodadas e causa 15 + (250%) de dano
        this.dano = dano;
        return dano;
    }
    public double FlechaDeApollo(double dano){// causa 30 + (350%) de dano
        this.dano = dano;
        return dano;
    }

}

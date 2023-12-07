package RPG.Habilidades.Especial;

public class FeiticeiroH {

    double dano;

    public double GlaceEterno(double dano){ //causa 20 + (250%) e atordoa o inimigo por 2 rounds
        this.dano = dano;
        return dano;
    }

    public double Inferno(double dano){ // causa 20 + (250%) de dano e queima o alvo por 2 rounds
        this.dano = dano;
        return dano;
    }

    public double Singularidade(double dano){ // Causa 40 + (300%) de dano
        this.dano = dano;
        return dano;
    }

}

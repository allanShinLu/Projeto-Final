package RPG.Habilidades.Especial;

public class BarbaroH {

    double dano;
    public void Berseker(){ // Aumenta todos os Status em 40% e fica imparavel
    }
    public double VortexTrovejante(double dano){ //Gira 6 vezes causando 10 + (150%) de dano por giro, tem 10% de chance de acertar um aliado
        this.dano = dano;
        return dano;
    }
    public double CortaMontanhas(double dano){ // Causa 40 + (250%) de dano ignorando armadura
        this.dano = dano;
        return dano;
    }
}

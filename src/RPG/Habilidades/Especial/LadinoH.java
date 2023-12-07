package RPG.Habilidades.Especial;

public class LadinoH {

    double dano;

    public double DecapitacaoPenumbrante(double dano){ // Causa 40 + (200%) de dano
        this.dano = dano;
        return dano;
    }
    public double CorteVazio(double dano){ // Causa 30 + (150%) de dano e reduz em 40% a armadura do alvo
        this.dano = dano;
        return dano;
    }
    public void AuraNegra(){ // Aumenta destreza, velocidade e ataque em 70% por 4 rodadas

    }
}

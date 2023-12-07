package RPG.Habilidades.Especial;

public class DruidaH {

    double dano;

    public double FuriaSelvagem(double dano){ // Causa 20 + (200%) de dano e atordoa o inimigo por 2 rodadas
        this.dano = dano;
        return dano;
    }
    public void UrsoRuja(){ // Aumenta Ataque, vida e defesa em 70
    }
    public double ChamadoDaFloresta(double dano){ // Causa 30 + (150%) + (1-6x) de dano
        this.dano = dano;
        return dano;
    }
}

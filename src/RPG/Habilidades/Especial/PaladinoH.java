package RPG.Habilidades.Especial;

public class PaladinoH {

    double dano;

    public void BencaoCelestial(){} // Cura voce e seus aliados em 20
    public double JulgamentoDivino(double dano){ // canaliza por 1 round e causa 30 + (250%) de dano
        this.dano = dano;
        return dano;
    }
    public void RefugioCelestial(){}//aumenta sua defesa e vida em 30 e aumenta a defesa e vida dos aliados em 10
}

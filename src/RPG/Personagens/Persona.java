package RPG.Personagens;

public abstract class Persona {

    protected double dano;
    protected double vida;
    protected double velocidade;
    protected double destreza;
    protected double defesa;
    protected double mana;
    private String nome;
    private String raca;


    public Persona(double dano, double vida, double velocidade, double destreza, double defesa, double mana) {
        this.dano = dano;
        this.vida = vida;
        this.velocidade = velocidade;
        this.destreza = destreza;
        this.defesa = defesa;
        this.mana = mana;
    }

    public void MostrarInfo(){
        System.out.println(nome);
    };

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public void AdicionarPersonagem() {
        System.out.println(nome + " escolheu o personagem de raça" + raca);
    }
}

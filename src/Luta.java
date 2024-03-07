import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;


    public Luta(){
        this.setRounds(0);
    }
    private void setDesafiado(Lutador des){
        this.desafiado = des;
    }

    private Lutador getDesafiado(){
        return this.desafiado;
    }

    private void setDefiante(Lutador de){
        this.desafiante = de;
    }

    private Lutador getDesafiante(){
        return this.desafiante;
    }

    private void setRounds(int r){
        this.rounds = r;
    }

    private int getRounds(){
        return this.rounds;
    }

    private void setAprovada(boolean a){
        this.aprovada = a;
    }

    private boolean getAprovada(){
        return this.aprovada;
    }

    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria() == l2.getCategoria() && l1 != l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void Lutar(){
        if(this.aprovada == true){
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();

            Random aleatorio = new Random();

            int vencedor = aleatorio.nextInt(3); //0 1 2

            switch(vencedor) {
                case 0:
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("Vitoria do " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("Vitoria do " + this.desafiante.getNome());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
        } else{
            System.out.println("A luta não pode acontecer!");
        }
    }
}

package ultraemojicombat;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    //Métodos
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    
    public void lutar(){
        double indice1 = 0, indice2 = 0;
        if(aprovada){
            desafiado.apresentar();
            desafiante.apresentar();
            indice1 = desafiado.getAltura()*desafiado.getPeso()+Math.random()*50;
            indice2 = desafiante.getAltura()*desafiante.getPeso()+Math.random()*50;
            if(indice1 > indice2){
                desafiado.ganharLuta();
                desafiante.perderLuta();
                System.out.println(desafiado.getNome() + " ganhou!!");
            }else if(indice1 < indice2){
                desafiado.perderLuta();
                desafiante.ganharLuta();
                System.out.println(desafiante.getNome() + " ganhou!!");
            }else{
                desafiado.empatarLuta();
                desafiante.empatarLuta();
                System.out.println(desafiado.getNome() + " e " + desafiante.getNome() + " empataram!!");
            }
        }
    }
    // Métodos especiais

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}

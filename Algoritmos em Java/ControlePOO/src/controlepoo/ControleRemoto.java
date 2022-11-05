package controlepoo;

public class ControleRemoto implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = true;
        this.tocando = false;
    }
    //Métodos especiais
    private int getVolume() {
        return volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    //Métodos abstratos

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Está ligado? " + isLigado());
        System.out.println("Volume: " + getVolume());
        for(int i = 0; i< getVolume(); i += 10){
            System.out.print("|");
        }
        System.out.println("");
        System.out.println("Está tocando? " + isTocando());
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando o menu...");
    }

    @Override
    public void maisVolume() {
        if(this.isLigado() && this.getVolume()<= 100){
            this.setVolume(this.getVolume() + 1);
        }else{
            System.out.println("Impossível aumentar volume.");
        }
    }

    @Override
    public void menosVolume() {
        if(this.isLigado() && this.getVolume()>= 0){
            this.setVolume(this.getVolume() - 1);
        }else{
            System.out.println("Impossível diminuir o volume.");
        }
    }
    @Override
    public void ligarMudo() {
        if(this.isLigado() && this.getVolume()>0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(isLigado() && getVolume() == 0){
            setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.isLigado() && !this.isTocando()){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.isLigado() && this.isTocando()){
            this.setTocando(false);
        }
    }
    
}
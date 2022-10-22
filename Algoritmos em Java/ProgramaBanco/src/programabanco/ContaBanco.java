/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programabanco;
/**
 *
 * @author bruno
 */
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public ContaBanco(String tipo, String dono) {
        this.tipo = tipo;
        this.dono = dono;
        numConta = (int)(10000+Math.random()*(99999-10000));
        this.saldo = 0;
        this.status = false;
    }
    
    public void abrirConta(){
        this.status = true;
    }
    
    public double fecharConta(){
        if(status == true && saldo >= 0){
            System.out.printf("Conta encerrada. %.2f sacados.");
            this.setStatus(false);
        }
        if(status == false)
            System.out.println("Não é possível fechar uma conta que ainda não foi aberta.");
        if(saldo < 0)
            System.out.println("Ainda há dívidas pendentes. Impossível fechar a conta.");
        return this.sacar(saldo);
    }
    
    public void depositar(double valor){
        if(status == true && valor>0)
            this.saldo += valor;
    }
    
    public double sacar(double valor){
        if(status == true && saldo>0 && valor <= saldo){
            this.saldo -= valor;
        }else if(valor < 0){
            System.out.println("Não é possível sacar valores negativos. ");
        }else if(valor > saldo){
            System.out.println("Não é possível sacar acima do seu saldo. ");
        }
        return this.saldo;
    }
    
    public void pagarMensal(){
        if(tipo.equals("cc")){
            this.saldo -= 12;
        }else if(tipo.equals("cp")){
            this.saldo -= 20;
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if(tipo == "cp"){
            this.tipo = tipo;
            this.saldo += 150;
        }else if(tipo == "cc"){
            this.tipo = tipo;
            this.saldo += 50;
        }
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void mostraStatus(){
        System.out.println("--------------- STATUS ---------------");
        System.out.println("Dono da conta: " + this.getDono() + ", Num: " + getNumConta());
        System.out.println("Tipo da conta: " + this.getTipo());
        System.out.println("Saldo: R$" + this.getSaldo());
        String statusConta = (this.isStatus() == true)?("Aberta"):("Fechada");
        System.out.println("Status: " + statusConta);
    }
}

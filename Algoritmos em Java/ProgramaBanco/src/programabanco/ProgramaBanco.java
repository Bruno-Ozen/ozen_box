/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programabanco;

import java.util.Scanner;
/**
 *
 * @author bruno
 */
public class ProgramaBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leitor = new Scanner(System.in);
        String resposta;
        String tipoConta, nomeDono;
        System.out.println("------ SIMULADOR DE BANCO ------");
        System.out.println("Digite: ");
        System.out.println("[s] - Para abrir uma conta no banco; ");
        System.out.println("[n] - Para encerrar o programa. ");
        resposta = leitor.nextLine();
        if(resposta.equals("s")){
            System.out.println("Qual tipo de conta você deseja? ");
            System.out.println("[cc] - Conta corrente; ");
            System.out.println("[cp] - Conta poupança. ");
            tipoConta = leitor.nextLine();
            System.out.println("Qual é o nome do dono da conta? ");
            nomeDono = leitor.nextLine();
            ContaBanco conta = new ContaBanco(tipoConta, nomeDono);
            conta.abrirConta();
            while(conta.isStatus()){
                conta.mostraStatus();
                System.out.println("\nDigite:");
                System.out.println("[1] - Para sacar dinheiro; ");
                System.out.println("[2] - Para depositar dinheiro; ");
                System.out.println("[3] - Para pagar a mensalidade; ");
                System.out.println("[4] - Para encerrar a sua conta. ");
                resposta = leitor.nextLine();
                switch(resposta){
                    case "1":
                        System.out.println("Quanto deseja sacar? (R$): ");
                        conta.sacar(leitor.nextDouble());
                        break;
                    case "2":
                        System.out.println("Quanto deseja depositar (R$): ");
                        conta.depositar(leitor.nextDouble());
                        break;
                    case "3":
                        conta.pagarMensal();
                        break;
                    case "4":
                        conta.fecharConta();
                        break;
                }
            }
        }
        System.out.println("Obrigado por usar nosso programa :)");
    }
}

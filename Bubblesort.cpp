#include <stdio.h>
#include <locale.h>

//ORGANIZADOR DE VETORES (Ordem crescente)

int main()
{
    int vetor[5];
    int aux;
    setlocale(LC_ALL, "Portuguese");
    //Leitura dos valores
    for(int cont = 0; cont<5; cont++){
        printf("Digite um valor: ");
        scanf("%d", &vetor[cont]);
    }
    //Bubble sort
    for(int n = 0; n<5; n++){
        for(int cont = 0; cont<4; cont++){
            if(vetor[cont] > vetor[cont+1]){
                aux = vetor[cont];
                vetor[cont] = vetor[cont+1];
                vetor[cont+1] = aux;
            }
        }
    }
    //Saída dos dados
    for(int cont = 0; cont < 5; cont++){
        printf("Posição %d= %d\n", cont, vetor[cont]);
    }
}

using System;

namespace Reversor_de_palavras
{
    class Program
    {
        static void Main(string[] args)
        {
            //REVERSOR DE PALAVRAS
            string palavra = "";
            char[] nome;
            char aux;
            int indice = 1;
            Console.WriteLine("Digite uma palavra: ");
            palavra = Console.ReadLine();
            nome = palavra.ToCharArray();
            for (int cont1 = 0; cont1 < palavra.Length; cont1++)
            {
                for (int cont2 = 0; cont2 < palavra.Length - indice; cont2++)
                {
                    aux = nome[cont2];
                    nome[cont2] = nome[cont2 + 1];
                    nome[cont2 + 1] = aux;
                }
                indice++;
            }
            palavra = new string(nome);
            Console.WriteLine(palavra);
            Console.ReadLine();
        }
    }
}
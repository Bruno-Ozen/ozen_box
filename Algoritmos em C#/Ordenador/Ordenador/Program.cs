public class Ordenador
{
    public static void Main(String[] args){
        int []vetor = new int[5];
        int elemento, i;
        ConsoleKeyInfo key;
        for (int n = 0; n < 5; n++)
        {
            Console.WriteLine("Digite um número: ");
            vetor[n] = Convert.ToInt32(Console.ReadLine());
        }
        Console.WriteLine("Qual método de ordenação deseja? ");
        Console.WriteLine("[ I ] - Para Insertion Sort;");
        Console.WriteLine("[ S ] - Para Selection Sort.");
        key = Console.ReadKey();
        //INSERTION SORT
        if(key.Key == ConsoleKey.I){
            for (int j = 1; j < vetor.Length; j++)
            {
                elemento = vetor[j];
                i = j - 1;
                while (i >= 0 && vetor[i] > elemento)
                {
                    vetor[i + 1] = vetor[i];
                    i = i - 1;
                }
                vetor[i + 1] = elemento;
            }
        }
        //SELECTION SORT
        if (key.Key == ConsoleKey.S)
        {
            for (int cont = 0; cont <= vetor.Length - 1; cont++)
            {
                int minimo = cont;
                for (int j = cont + 1; j < vetor.Length; j++)
                {
                    if (vetor[j] < vetor[minimo])
                    {
                        minimo = j;
                    }
                }
                int temp = vetor[cont];
                vetor[cont] = vetor[minimo];
                vetor[minimo] = temp;
            }
        }
        Console.WriteLine();
        Console.WriteLine("Aqui está o vetor ordenado :)");
        foreach(int saida in vetor)
        {
            Console.WriteLine(saida);
        }
        Console.ReadLine();
    }
}
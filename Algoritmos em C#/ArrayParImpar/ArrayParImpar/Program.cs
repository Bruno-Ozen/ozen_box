using static System.Console;
public class ArrayParImpar
{
    public static void Main(string[] args)
    {
        int[] numeros = new int[10];
        List<int> par = new List<int>();
        List<int> impar = new List<int>();
        for (int i = 0; i < numeros.Length; i++)
        {
            WriteLine("Digite um número: ");
            numeros[i] = Convert.ToInt32(ReadLine());
            if (numeros[i] % 2 == 0)
            {
                par.Add(numeros[i]);
            }
            else if (numeros[i] % 2 == 1)
            {
                impar.Add(numeros[i]);
            }
        }
        Clear();
        par.Sort();
        impar.Sort();
        Array.Sort(numeros);
        WriteLine("---------- NÚMEROS DIGITADOS ----------");
        foreach (int i in numeros)
        {
            WriteLine(i);
        }
        WriteLine();
        WriteLine("---------- NÚMEROS PARES ----------");
        foreach (int i in par)
        {
            WriteLine(i);
        }
        WriteLine();
        WriteLine("---------- NÚMEROS ÍMPARES ----------");
        foreach (int i in impar)
        {
            WriteLine(i);
        }
        ReadLine();
    }
}

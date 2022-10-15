using static System.Console;
public class PostoSimulator
{
    public static void Main(string[] args)
    {
        double litros;
        double precoG = 3.30;
        double precoA = 2.90;
        double descontoG = 0;
        double descontoA = 0;
        double total = 0;
        ConsoleKeyInfo key;
        WriteLine("Digite quantos litros de combustível deseja: ");
        litros = Convert.ToInt32(Console.ReadLine());
        if (litros <= 20)
        {
            descontoA = 0.97;
            descontoG = 0.96;
        }
        else if (litros > 20)
        {
            descontoA = 0.95;
            descontoG = 0.94;
        }
        WriteLine("Qual tipo de combustível deseja? (A/G)");
        key = ReadKey();
        if (key.Key == ConsoleKey.A)
        {
            total = litros * precoA * descontoA;
        }
        else if (key.Key == ConsoleKey.G)
        {
            total = litros * precoG * descontoG;
        }
        WriteLine();
        WriteLine("O total a pagar é " + Math.Round(total, 2));
        ReadLine();
    }
}

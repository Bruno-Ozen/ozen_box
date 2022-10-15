using static System.Console;
public class Estudos
{
    public static void Main(string[] args)
    {
        //PROGRAMA PERITO CRIMINAL
        int contRespostas = 0;
        ConsoleKeyInfo key;
        WriteLine("Telefonou para a vítima? (s/n)");
        key = ReadKey();
        if (key.Key == ConsoleKey.S)
            contRespostas++;
        WriteLine("Esteve no local do crime? (s/n)");
        key = ReadKey();
        if (key.Key == ConsoleKey.S)
            contRespostas++;
        WriteLine("Mora perto da vítima? (s/n)");
        key = ReadKey();
        if (key.Key == ConsoleKey.S)
            contRespostas++;
        WriteLine("Devia para a vítima? (s/n)");
        key = ReadKey();
        if (key.Key == ConsoleKey.S)
            contRespostas++;
        WriteLine("Já trabalhou com a vítima? (s/n)");
        key = ReadKey();
        if (key.Key == ConsoleKey.S)
            contRespostas++;
        if (contRespostas == 2)
        {
            WriteLine("Suspeito.");
        }
        else if (contRespostas >= 3 && contRespostas <= 4)
        {
            WriteLine("Cúmplice.");
        }
        else if (contRespostas == 5)
        {
            WriteLine("Assassino.");
        }
        else
        {
            WriteLine("Inocente.");
        }
        ReadLine();
    }
}
using System;
using static System.Console;
public class Program {
    public static void Main(string[] args)
    {
        //Declaração das variáveis
        ConsoleKeyInfo key;
        List<double> notas = new List<double>();
        List<int> pos = new List<int>();
        List<double> blocos = new List<double>();
        bool ligadura = false;
        int[] compassos;
        int cont = 0;
        int qtdmedia = 0;
        double media;
        double soma = 0;
        string sequenciaNotas = "";
        compassos = new int[30];
        //Entrada das notas do usuário
        WriteLine("----------- CALCULADORA DE COMPASSO -----------");
        WriteLine("---- Pressione qualquer tecla para começar ----");
        WriteLine();
        key = ReadKey();
        while (key.Key != ConsoleKey.Enter)
        {
            WriteLine("DIGITE UMA NOTA");
            WriteLine("[Q] - (1/64) Tempos; ");
            WriteLine("[W] - (1/32) Tempos; ");
            WriteLine("[E] - (1/16) Tempos; ");
            WriteLine("[R] - (1/8)  Tempos; ");
            WriteLine("[T] - (1/4)  Tempos; ");
            WriteLine("[Y] - (1/2)  Tempos; ");
            WriteLine("[U] - (1)    Tempos; ");
            WriteLine("[I] - (2)    Tempos; ");
            WriteLine("[O] - (4)    Tempos; ");
            WriteLine("[P] - (8)    Tempos; ");
            WriteLine();
            if (ligadura == false)
            {
                WriteLine("[S] - Para ligar notas;");
                for (int i = 0; i < notas.Count; i++)
                {
                    sequenciaNotas += notas[i].ToString() + " ";
                }
                WriteLine("[ " + sequenciaNotas + " ]");
                WriteLine("[ENTER] - Para calcular o compasso;");
                WriteLine("[X] - SAIR DO PROGRAMA.");
                key = ReadKey();
                switch (key.Key)
                {
                    case ConsoleKey.Q:
                        notas.Add(0.015625);
                        break;
                    case ConsoleKey.W:
                        notas.Add(0.03125);
                        break;
                    case ConsoleKey.E:
                        notas.Add(0.0625);
                        break;
                    case ConsoleKey.R:
                        notas.Add(0.125);
                        break;
                    case ConsoleKey.T:
                        notas.Add(0.25);
                        break;
                    case ConsoleKey.Y:
                        notas.Add(0.5);
                        break;
                    case ConsoleKey.U:
                        notas.Add(1);
                        break;
                    case ConsoleKey.I:
                        notas.Add(2);
                        break;
                    case ConsoleKey.O:
                        notas.Add(4);
                        break;
                    case ConsoleKey.P:
                        notas.Add(8);
                        break;
                    case ConsoleKey.S:
                        ligadura = true;
                        break;
                }
            }
            else
            {
                double somaLigadura = 0;
                while (key.Key != ConsoleKey.X)
                {
                    WriteLine("--- LIGADURA DE NOTAS ---");
                    WriteLine("Pressione os botões referente as notas que deseja somar e após isso, pressione X para confirmar.");
                    WriteLine();
                    WriteLine("Soma: [ " + somaLigadura + " ]");
                    WriteLine("[X] - Confirmar a ligadura;.");
                    key = ReadKey();
                    switch (key.Key)
                    {
                        case ConsoleKey.Q:
                            somaLigadura += 0.015625;
                            break;
                        case ConsoleKey.W:
                            somaLigadura += 0.03125;
                            break;
                        case ConsoleKey.E:
                            somaLigadura += 0.0625;
                            break;
                        case ConsoleKey.R:
                            somaLigadura += 0.125;
                            break;
                        case ConsoleKey.T:
                            somaLigadura += 0.25;
                            break;
                        case ConsoleKey.Y:
                            somaLigadura += 0.5;
                            break;
                        case ConsoleKey.U:
                            somaLigadura += 1;
                            break;
                        case ConsoleKey.I:
                            somaLigadura += 2;
                            break;
                        case ConsoleKey.O:
                            somaLigadura += 4;
                            break;
                        case ConsoleKey.P:
                            somaLigadura += 8;
                            break;
                        case ConsoleKey.X:
                            ligadura = false;
                            break;
                    }
                    Clear();
                }
                notas.Add(somaLigadura);
            }
            sequenciaNotas = "";
            Clear();
        }
        //Marcação das possíveis barras de compasso
        for (int i = 0; i < notas.Count-1; i++)
        {
            if (notas[i] != notas[i + 1])
                pos.Add(i);
        }
        //Criação dos blocos
        for (int i = 0; i<notas.Count; i++)
        {
            for (int k = i; k < notas.Count; k++)
            {
                soma += notas[k];
                for (int j = 0; j < pos.Count; j++) {
                    if (soma >= 1 && k == pos[j] && soma-(int)soma == 0)
                    {
                        if (blocos.Contains(pos[j]) == false)
                            blocos.Add(pos[j]);
                        break;
                    }
                }
            }
            soma = 0;
        }

        //Média dos blocos
        soma = 0;
        for (int i = 0; i < notas.Count; i++)
        {
            soma += notas[i];
            if (blocos.Contains(i))
                qtdmedia++;
        }

        media = soma / qtdmedia;
        switch ((int)media)
        {
            case 1:
                WriteLine("O compasso é 5/4");
                break;
            case 2:
                WriteLine($"O compasso é {(int)media}/4");
                break;
            case 3:
                WriteLine($"O compasso é {(int)media}/4");
                break;
            default:
                WriteLine($"O compasso é {media}");
                break;
        }
        /*foreach (int comp in compassos)
        {
            WriteLine(comp);
        }*/
        foreach (var block in blocos)
        {
            WriteLine(block);
        }
    }
}
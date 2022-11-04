using System;
using static System.Console;

//ALUNO: BRUNO HENRIQUE DE PINHO

public class SistemaCadastro
{
    public List<string> nome = new List<string>();
    public List<string> celular = new List<string>();
    public List<string> cidade = new List<string>();

    public void printMenu(string[] opcoes)
    {
        foreach (string opcao in opcoes)
        {
            WriteLine(opcao);
        }

    }

    public static void Main(string[] args)
    {
        int opcao;
        SistemaCadastro sistema = new SistemaCadastro();
        string[] opcoes = {"[1] - Cadastrar fornecedor;",
                           "[2] - Editar fornecedor;" ,
                           "[3] - Excluir fornecedor" ,
                           "[4] - Listar fornecedor;" ,
                           "[5] - Sair."};
        while (true)
        {
            Clear();
            WriteLine("--- SISTEMA DE CADASTRO DE FORNECEDORES ---");
            sistema.printMenu(opcoes);
            try
            {
                opcao = Convert.ToInt32(ReadLine());
            }
            catch (System.FormatException)
            {
                WriteLine("Por favor, digite uma opção entre 1 e " + opcoes.Length);
                continue;
            }
            catch (Exception)
            {
                WriteLine("Um erro aconteceu, tente novamente!!");
                continue;
            }
            switch (opcao)
            {
                case 1:
                    sistema.Cadastrar();
                    break;
                case 2:
                    sistema.Editar();
                    break;
                case 3:
                    sistema.Excluir();
                    break;
                case 4:
                    sistema.Listar();
                    break;
                case 5:
                    Environment.Exit(0);
                    break;
            }
        }
    }
    void Cadastrar()
    {
        Clear();
        WriteLine("--- CADASTRANDO UM FORNECEDOR ---");
        WriteLine("Qual é o nome do fornecedor? ");
        this.nome.Add(ReadLine());
        WriteLine("Qual é o celular do fornecedor? ");
        this.celular.Add(ReadLine());
        WriteLine("Qual é a cidade do fornecedor? ");
        this.cidade.Add(ReadLine());
    }

    void Editar()
    {
        int index;
        Clear();
        WriteLine("--- EDITANDO UM FORNECEDOR ---");
        WriteLine("Qual é o nome do fornecedor que deseja editar? ");
        index = this.nome.IndexOf(ReadLine());
        WriteLine();
        if (index >= 0)
        {
            WriteLine("--- FORNECEDOR QUE SERÁ EDITADO ---");
            WriteLine("Nome do fornecedor: " + getNome(index));
            WriteLine("Celular do fornecedor: " + getCelular(index));
            WriteLine("Cidade do fornecedor: " + getCidade(index));
            WriteLine();
            WriteLine("Digite o novo nome do fornecedor: ");
            this.nome[index] = ReadLine();
            WriteLine("Digite o novo celular do fornecedor: ");
            this.celular[index] = ReadLine();
            WriteLine("Digite a nova cidade do fornecedor: ");
            this.cidade[index] = ReadLine();
        }
        else
        {
            WriteLine("Registro não encontrado!!");
            ReadLine();
        }
    }

    void Excluir()
    {
        int index;
        Clear();
        WriteLine("--- EXCLUIR CADASTROS ---");
        WriteLine("Qual é o nome do fornecedor que deseja deletar? ");
        index = this.nome.IndexOf(ReadLine());
        WriteLine();
        if (index >= 0)
        {
            WriteLine("--- FORNECEDOR QUE SERÁ DELETADO ---");
            WriteLine("Nome do fornecedor: " + getNome(index));
            WriteLine("Celular do fornecedor: " + getCelular(index));
            WriteLine("Cidade do fornecedor: " + getCidade(index));
            nome.RemoveAt(index);
            celular.RemoveAt(index);
            cidade.RemoveAt(index);
        }
        else
        {
            WriteLine("Registro não encontrado!!");
            ReadLine();
        }
        ReadLine();
    }

    void Listar()
    {
        Clear();
        WriteLine("--- LISTANDO FORNECEDORES ---");
        for (int i = 0; i < nome.Count; i++)
        {
            WriteLine("--- FORNECEDOR " + (i + 1) + "---");
            WriteLine("Nome: " + this.getNome(i));
            WriteLine("Celular: " + this.getCelular(i)); ;
            WriteLine("Cidade: " + this.getCidade(i));
            WriteLine();
        }
        ReadLine();
    }

    //MÉTODOS ESPECIAIS
    string getNome(int index)
    {
        return this.nome[index];
    }

    string getCelular(int index)
    {
        return this.celular[index];
    }

    string getCidade(int index)
    {
        return this.cidade[index];
    }
}
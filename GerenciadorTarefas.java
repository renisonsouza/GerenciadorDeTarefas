import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorTarefas {

    private static List<String> lista = new ArrayList<String>();

    public static void main(String[] args) {
        int num = -1;
        while (num != 0) {
            num = menu();
            switch (num) {
                case 1:
                    MostraLista();
                    break;
                case 2:
                    AdicionarTar();
                    break;
                case 3:
                    RemoveTar();
                    break;
                default:
                    System.out.println("Use uma opcao valida");
            }
        }
    }

    public static int menu() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Gerenciador de Tarefas");
        System.out.println("1. Mostrar Lista de Tarefas");
        System.out.println("2. Adicionar Tarefa na lista");
        System.out.println("3. Remover Tarefa da lista");
        System.out.print("Digite sua opcao:");
        int op = scanner.nextInt();
        return op;
    }

    public static void MostraLista() {

        System.out.println("Lista de Tarefas");
        int n = 0;
        for (String item : lista) {
            System.out.println(++n + " " + item);
        }
    }

    public static void AdicionarTar() {
        System.out.println("Adicionar Tarefa");
        System.out.print("Digite uma tarefa:");
        Scanner scanner = new Scanner(System.in);
        String tar = scanner.nextLine();
        lista.add(tar);
        MostraLista();
    }

    public static void RemoveTar() {
        System.out.println("Remover Tarefa");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual tarefa quer remover?");
        int tarefa = scanner.nextInt();
        if ((tarefa - 1) < 0 || tarefa > lista.size()) {
            System.out.println("Tarefa inexistente, digite uma opcao ente 1 e " + lista.size());
        } else {
            lista.remove(tarefa - 1);
        }
        MostraLista();
    }
}

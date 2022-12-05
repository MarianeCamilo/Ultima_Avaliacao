import java.util.Scanner;

public class Aeroporto{
    public static void main(String[] args) {

        System.out.println("Aeroporto da Mari!");
        System.out.println("Sejam bem-vindos ao Aeroporto da Mari :)");
        System.out.println("O que você deseja fazer?");
        System.out.println("Listar, incluir, alterar, excluir");
        System.out.println("1- Listar Aeronave");
        System.out.println("2- Incluir Aeronave");
        System.out.println("3- Alteração Aeronave");
        System.out.println("4- Excluir Aeronave");
        System.out.println("5- Listar Companhia");
        System.out.println("6- Incluir Companhia");
        System.out.println("7- Alterar Companhia");
        System.out.println("8- Excluir Companhia");
        System.out.println("9- Listar Hangar");
        System.out.println("10- Incluir Hangar");
        System.out.println("11- Alterar Hangar");
        System.out.println("12- Excluir Hangar");
        System.out.println("13- Listar Pista");
        System.out.println("14- Incluir Pista");
        System.out.println("15- Alterar Pista");
        System.out.println("16- Excluir Pista");
        System.out.println("17- Listar Voo");
        System.out.println("18- Incluir Voo");
        System.out.println("19- Alterar Voo");
        System.out.println("20- Excluir Voo");
        System.out.println("0- Sair do sisteminha trabalhoso");

        Scanner scanner = new Scanner(System.in);
        int escolha = 0;
        
        do {
            System.out.print("Escolha: ");
            escolha = scanner.nextInt();

            switch(escolha) {
                case 1:
                    System.out.println("Listar Aeronave");
                    System.out.println("-------------------------");
                    listarAviao();
                    listarHelicoptero();
                    listarJato();
                    }
                    break;

                case 2:
                    System.out.println("Incluir Aeromodelo");
                    System.out.println("-------------------------");
                    System.out.println("Tipo de aeronave: ");
                    char tipo = scanner.next().charAt(0);
                    switch (tipo) {
                        case 'A':
                            incluirAviao(scanner);
                            break;
                        
                        case 'H':
                            incluirHelicoptero(scanner);
                            break;

                        case 'J':
                            incluirJato(scanner);
                            break;
                        default:
                            break;

                case 3:
                    System.out.println("Excluir Aeromodelo");
                    System.out.println("-------------------------");
                    char tipoExcluir = scanner.next().charAt(0);
                    switch (tipoExcluir) {
                        case 'A':
                            excluirAviao(scanner);
                            break;
                        
                        case 'H':
                            excluirHelicoptero(scanner);
                            break;

                        case 'J':
                            excluirJato(scanner);
                            break;
                        default:
                            break;
                    }
                    break;







            } while (escolha != 0);
            scanner.close();
        }
    }

    private static void excluirJato(Scanner scanner) {
    }

    private static void excluirHelicoptero(Scanner scanner) {
    }

    private static void excluirAviao(Scanner scanner) {
    }

    private static void listarJato() {
    }

    private static void listarHelicoptero() {
    }

    private static void listarAviao() {
    }

    private static void incluirJato(Scanner scanner) {
    }

    private static void incluirHelicoptero(Scanner scanner) {
    }

    private static void incluirAviao(Scanner scanner) {
    }

}
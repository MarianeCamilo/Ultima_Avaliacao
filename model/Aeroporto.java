import java.util.Scanner;

public class Aeroporto{
    public static void main(String[] args) throws Exception {

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
                System.out.println("Listar Aeromodelo");
                System.out.println("-------------------------");
                listarAviao();
                listarHelicoptero();
                listarJato();
                break;

            case 2:
                System.out.println("Incluir Aeromodelo");
                System.out.println("-------------------------");
                System.out.println("Tipo de aeromodelo: ");
                System.out.println("A - AVIÃO  |  H - HELICÓPTERO  |  J - JATO ");
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
                }
            case 3:
                System.out.println("ALTERAR Aeromodelo");
                System.out.println("-------------------------");
                alterarAviao();
                alterarHelicoptero();
                alterarJato();
                
                break;

            case 4:
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

            case 5:
                System.out.println("Listar Companhia");
                System.out.println("-------------------------");
                listarCompanhia();
                break;
            
            case 6:
                System.out.println("Incluir Companhia");
                System.out.println("-------------------------");
                char tipoIncluir = scanner.next().charAt(0);
                incluirCompanhia(scanner);
                break;

            case 7:
                System.out.println("ALTERAR Companhia");
                System.out.println("-------------------------");
                char tipoAlterar = scanner.next().charAt(0);
                alterarCompanhia(scanner);
                break;

            case 8:
                System.out.println("Excluir Companhia");
                System.out.println("-------------------------");
                excluirCompanhia(scanner);
                break;

            case 9:
                System.out.println("Listar Hangar");
                System.out.println("-------------------------");
                listarHangar();
                break;

            case 10:
                System.out.println("Incluir Hangar");
                System.out.println("-------------------------");
                incluirHangar(scanner);
                break;

            case 11:
                System.out.println("Alterar Hangar");
                System.out.println("-------------------------");
                alterarHangar(scanner);
                break;

            case 12:
                System.out.println("Excluir Hangar");
                System.out.println("-------------------------");
                excluirHangar(scanner);
                break;

            case 13:
                System.out.println("Listar Pista");
                System.out.println("-------------------------");
                listarPista();
                break;

            case 14:
                System.out.println("Incluir Pista");
                System.out.println("-------------------------");
                incluirPista(scanner);
                break;

            case 15:
                System.out.println("Alterar Pista");
                System.out.println("-------------------------");
                alterarPista(scanner);
                break;

            case 16:
                System.out.println("Excluir Pista");
                System.out.println("-------------------------");
                excluirPista(scanner);
                break;

            case 17:
                System.out.println("Listar Voo");
                System.out.println("-------------------------");
                listarVoo();
                break;

            case 18:
                System.out.println("Incluir Voo");
                System.out.println("-------------------------");
                incluirVoo(scanner);
                break;

            case 19:
                System.out.println("Alterar Voo");
                System.out.println("-------------------------");
                alterarVoo();
                break;

            case 20:
                System.out.println("Excluir Voo");
                System.out.println("-------------------------");
                excluirVoo(scanner);
                break;
            }


        } while (escolha != 0);
        scanner.close();
    }
            private static void alterarJato() {
    }

            private static void alterarHelicoptero() {
    }

            private static void alterarAviao() {
    }

            private static void alterarCompanhia(Scanner scanner) {
    }

            private static void alterarHangar(Scanner scanner) {
    }

            private static void alterarPista(Scanner scanner) {
    }

            private static void listarJato() {
                System.out.println("Jatos");
                System.out.println("-------------------------");
                for (Jato jato : Jato.getJatos()) {
                    System.out.println(jato);
                }
            }

            private static void listarHelicoptero() {
                System.out.println("Helicopteros");
                System.out.println("-------------------------");
                for (Helicoptero helicoptero : Helicoptero.getHelicopteros()) {
                    System.out.println(helicoptero);
                }
            }

            private static void listarAviao() {
                System.out.println("Aviões");
                System.out.println("-------------------------");
                for (Aviao aviao : Aviao.getAvioes()) {
                    System.out.println(aviao);
                }
            }

            private static void incluirJato(Scanner scanner) {
                System.out.println("Cor do Jato: ");
                String cor = scanner.next();

                System.out.println("Velocidade do Jato: ");
                int velocidade = scanner.nextInt();
               
                try {
                    new Jato(); 
                    System.out.println("Jato criado!");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

            private static void incluirHelicoptero(Scanner scanner) {
                System.out.println("Cor do Helicoptero: ");
                String cor = scanner.next();

                System.out.println("Capacidade do Jato: ");
                int capacidade = scanner.nextInt();
               
                try {
                    new Helicoptero(); 
                    System.out.println("Helicoptero criado!");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

            private static void incluirAviao(Scanner scanner) throws Exception {
                System.out.println("Prefixo do Avião: ");
                String prefixo = scanner.next();

                System.out.println("Capacidade do Avião: ");
                int capacidade = scanner.nextInt();

                System.out.println("Id da Companhia: ");
                int idCompanhia = scanner.nextInt();
                Companhia companhias = Companhia.getCompanhiaById(idCompanhia);

                System.out.println("Companhia: ");
                Companhia companhia = Companhia.next();
               
                try {
                    new Helicoptero(); 
                    System.out.println("Helicoptero criado!");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

            private static void excluirVoo(Scanner scanner) {
                try {
                    System.out.println("ID Voo: ");
                    int id = scanner.nextInt();
                    Voo.excluir(id);
                    System.out.println("Voo excluído!");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
    
            private static void excluirJato(Scanner scanner) {
                try {
                    System.out.println("ID Jato");
                    int id = scanner.nextInt();
                    Jato.excluir(id);
                    System.out.println("Jato excluido!");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

            private static void excluirHelicoptero(Scanner scanner) {
                try {
                    System.out.println("ID helicoptero:");
                    int id = scanner.nextInt();
                    Helicoptero.excluir(id);
                    System.out.println("Helicoptero excluido!");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

            private static void excluirAviao(Scanner scanner) {
                try {
                    System.out.println("ID avião:");
                    int id = scanner.nextInt();
                    Helicoptero.excluir(id);
                    System.out.println("Avião excluido!");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

            private static void listarCompanhia() {
                System.out.println("Companhias");
                System.out.println("-------------------------");
                for (Companhia companhia : Companhia.getCompanhias()) {
                    System.out.println(companhia);
                }
            }

            private static void incluirCompanhia(Scanner scanner) throws Exception {
                System.out.println("Id da Companhia: ");
                int idCompanhia = scanner.nextInt();
                Companhia companhias = Companhia.getCompanhiaById(idCompanhia);

                System.out.println("Nome da companhia: ");
                String nome = scanner.next();

                System.out.println("CNPJ da companhia: ");
                String cnpj = scanner.next();
               
                try {
                    new Companhia(); //idCompanhia, nome, cnpj
                    System.out.println("Companhia criado!");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

            private static void excluirCompanhia(Scanner scanner) {
                try {
                    System.out.println("ID Companhia: ");
                    int id = scanner.nextInt();
                    Companhia.excluir(id);
                    System.out.println("Companhia excluída!");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        
        
            private static void alterarVoo() {
            }
        
        
            private static void incluirVoo(Scanner scanner) {
                try {
                    System.out.println("Id do Voo: ");
                    int idVoo = scanner.nextInt();

                    System.out.println("Número do Voo: ");
                    String numero = scanner.next();

                    System.out.println("Data do Voo: ");
                    String data = scanner.next();

                    System.out.println("Hora do Voo: ");
                    String hora = scanner.next();

                    System.out.println("Origem do Voo: ");
                    String origem = scanner.next();

                    System.out.println("Destino do Voo: ");
                    String destino = scanner.next();

                    System.out.println("Piloto do Voo: ");
                    String piloto = scanner.next();

                    System.out.println("Copiloto do Voo: ");
                    String copiloto = scanner.next();

                    System.out.println("Observacao do Voo: ");
                    String observacao = scanner.next();

                    System.out.println("Id da Pista: ");
                    int idPista = scanner.nextInt();
                    Pista pista = Pista.getPistaById(idPista);

                    System.out.println("Pista do Voo: ");
                    String Pista = scanner.next();

                    System.out.println("Id do Avião: ");
                    int idAviao = scanner.nextInt();
                    Aviao aviao = Aviao.getAviaoById(idAviao);

                    System.out.println("Avião: ");
                    String avioes = scanner.next();

                    System.out.println("Id do Helicoptero: ");
                    int idHelicoptero = scanner.nextInt();
                    Helicoptero helicoptero = Helicoptero.getHelicopteroById(idHelicoptero);

                    System.out.println("Helicoptero: ");
                    String helicopteros = scanner.next();

                    System.out.println("Id do Jato: ");
                    int idJato = scanner.nextInt();
                    Jato jato = Jato.getJatoById(idJato);

                    System.out.println("Jato: ");
                    String jatos = scanner.next();

                    new Voo(); //idVoo, numero, data, hora, origem, destino, piloto, copiloto, observacao, idPista, Pista, idAviao, idHelicoptero, idJato
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    return;
                }
            }
        
        
            private static void listarVoo() {
                System.out.println("Voos");
                System.out.println("-------------------------");
                for (Voo voo : Voo.getVoos()) {
                    System.out.println(voo);
                }
            }
            
        
            private static void excluirPista(Scanner scanner) {
                try {
                    System.out.println("ID Pista: ");
                    int id = scanner.nextInt();
                    Pista.excluir(id);
                    System.out.println("Pista excluída!");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        
        
            private static void incluirPista(Scanner scanner) throws Exception {
                System.out.println("Id da Pista: ");
                int idPista = scanner.nextInt();
                Pista pistas = Pista.getPistaById(idPista);

                System.out.println("Numero da Pista: ");
                String numero = scanner.next();
               
                try {
                    new Pista(); //idPista, numero
                    System.out.println("Pista criado!");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        
        
            private static void listarPista() {
                System.out.println("Pista");
                System.out.println("-------------------------");
                for (Pista pista : Pista.getPistas()) {
                    System.out.println(pista);
                }
            }
        
        
            private static void excluirHangar(Scanner scanner) {
                try {
                    System.out.println("ID Hangar: ");
                    int id = scanner.nextInt();
                    Hangar.excluir(id);
                    System.out.println("Hangar excluído!");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        
        
            private static void incluirHangar(Scanner scanner) throws Exception {
                System.out.println("Id do Hangar: ");
                int idHangar = scanner.nextInt();
                Hangar hangares = Hangar.getHangarById(idHangar);

                System.out.println("Local: ");
                String local = scanner.next();

                System.out.println("Id do Avião: ");
                int idAviao = scanner.nextInt();

                System.out.println("Avião: ");
                String aviao = scanner.next();
               
                try {
                    new Hangar(); //idHangar, local, idAviao, aviao
                    System.out.println("Hangar criado!");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        
        
            private static void listarHangar() {
                System.out.println("Hangares");
                System.out.println("-------------------------");
                for (Hangar hangar : Hangar.getHangares()) {
                    System.out.println(hangar);
                }
            }  
     
}    
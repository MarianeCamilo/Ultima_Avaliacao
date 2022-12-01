import java.util.ArrayList;
import java.util.Scanner;
import java.sql.Statement;
import database.DAO;

public abstract class Aviao extends Aeromodelo {
    
    private String prefixo;
    private int capacidade;
    private int idCompanhia;
    private Companhia companhia;

    public static ArrayList<Aviao> avioes = new ArrayList<Aviao>();

        protected void Aviao (String prefixo, int capacidade, int idCompanhia, Companhia companhia) {
            this.prefixo = prefixo;
            this.capacidade = capacidade;
            this. idCompanhia = idCompanhia;
            this.companhia = companhia;

            avioes.add(this);
        }

        public String getPrefixo(){
            return this.prefixo;
        }

        public void setPrefixo(String prefixo){
            this.prefixo = prefixo;
        }

        public int getCapacidade(){
            return this.capacidade;
        }

        public void setCapacidade(int capacidade){
            this.capacidade = capacidade;
        }

        public int getidCompanhia(){
            return this.idCompanhia;
        }

        public void setidCompanhia(int idCompanhia){
            this.idCompanhia = idCompanhia;
        }

        public Companhia getCompanhia(){
            return this.companhia;
        }

        public void setCompanhia(Companhia companhia){
            this.companhia = companhia;
        }

        @Override                    // para imprimir os objetos na tela
        public String toString(){
        return "Prefixo: " + this.prefixo 
        + "\n | Capacidade: " + this.capacidade
        + "\n | idCompanhia: " + this.idCompanhia
        + "\n | Companhia: " + this.companhia;
        }

        public static void insertAviaoS(Aviao aviao) {
            try{
                System.out.println("Conectando ao banco de dados");
                Conexao con = DAO.getConexao();
                Statement stm = con.createStatement();
                System.out.println("Banco de Dados conectado");
                System.out.println("Inserindo dados no banco de dados");
                stm.execute("Insert into aviao "
                    + "(marca, modelo, capacidade,companhia) VALUES "
                    + "('"+aviao.getMarca()+"', '"+aviao.getModelo()+"', '"+aviao.getCapacidade()+"', '"+aviao.getCompanhia().getId()+"')");
                System.out.println("Dados inseridos com sucesso");
                System.out.println(aviao); 
                DAO.deleteConexao();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    
        public static Aviao getAviaoUpdate(Scanner scanner) throws Exception {
            try {
                Aviao aviao = getAviao(scanner);
                System.out.println("Informe a marca do aviao");
                String marca = scanner.next();
                System.out.println("Informe o modelo do avião");
                String modelo = scanner.next();
                System.out.println("Informe a capacidade do avião");
                String capacidade = scanner.next();
                return aviao;
            } catch (Exception e) {
                throw new Exception(e.getMessage());
            }
        }
    
        public static void updateAviaoS(Aviao aviao) throws Exception {
            try {
                System.out.println("Conectando ao banco de dados");
                Conexao con = DAO.getConexao();
                Statement stm = con.createStatement();
                System.out.println("Banco de Dados conectado");
                stm.execute("UPDATE aviao SET "
                    + " marca = '" + aviao.getMarca() + "'"
                    + ", modelo = '" + aviao.getModelo() + "'"
                    + ", capacidade = '" + aviao.getCapacidade() + "'"
                    + ", id_companhia = '" + aviao.getCompanhia().getId()+ "'"
                    + " WHERE id = " + aviao.getId());
                    System.out.println("Dados atualizados com sucesso"); 
                DAO.deleteConexao();
            } catch (Exception e) {
                throw new Exception(e.getMessage());
            }
        }
    
        public static Aviao getAviao(Scanner scanner) throws Exception { 
            try {
                System.out.println("Informe o ID do aviao: ");
                int id = scanner.nextInt();
                System.out.println("Conectando ao banco de dados");
                Conexao con = DAO.getConexao();
                Statement stm = con.createStatement();
                System.out.println("Banco de Dados conectado");
    
                ResultSet rs = stm.executeQuery("SELECT * FROM aviao WHERE id = " + id);
                
                if(!rs.next()) {
                    throw new Exception("Id inválido");
                }
                
                Aviao aviao = new Aviao(rs);
                DAO.deleteConexao();
                return aviao;
            } catch (Exception e) {
                throw new Exception(e.getMessage());
            }
        }
    
        public static void deleteAviaoPS(Aviao aviao) {
            try {
                System.out.println("Conectando ao banco de dados");
                Conexao con = DAO.getConexao();
                System.out.println("Banco de Dados conectado");
                System.out.println("Deletando Dados do banco");
                PreparedStatement pStm = con.prepareStatement("DELETE FROM aviao WHERE id = ?");
                pStm.setInt(1, aviao.getId());
                System.out.println("Dados deletado com sucesso");  
                if(pStm.executeUpdate() <= 0) {
                    System.out.println("Falha na execução.");
                }
                DAO.deleteConexao();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
}



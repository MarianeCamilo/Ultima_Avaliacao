import java.util.ArrayList;
import java.util.Scanner;
import java.sql.Statement;
import database.DAO;

public class Aviao extends Aeromodelo {
    
    private Prefixo<Character, Integer> numeros;
    private int capacidade;
    private int idCompanhia;
    private Companhia companhia;

    public static ArrayList<Aviao> avioes = new ArrayList<Aviao>();
        
        public Aviao(char letras, int nextId, String marca2, String modelo2, String prefixo, int capacidade, int idCompanhia, Companhia companhia) throws Exception {
            super(nextId, marca2, modelo2);
            //Prefixo<Character,Integer> numero = new Prefixo<>(letras, numeros);
            verificaNumero(numeros);
            this.capacidade = capacidade;
            this. idCompanhia = idCompanhia;
            this.companhia = companhia;

            avioes.add(this);
        }

        private void verificaNumero(Prefixo<Character, Integer> numeros2) throws Exception{
                for (Aviao aviao : avioes) {
                    if (aviao.getNumero().equals(numeros)) {
                        throw new Exception("!");
                    }
                }
        
                return;
            }
        

        public Prefixo<Character, Integer> getNumero() {
            return numeros;
        }

        public void setNumero(Prefixo<Character, Integer> numero) {
            this.numeros = numero;
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
        return "\n | Capacidade: " + this.capacidade
        + "\n | idCompanhia: " + this.idCompanhia
        + "\n | Companhia: " + this.companhia;
        }

        public static Aviao getAviaoById(int id) throws Exception {
            for (Aviao aviao : avioes) {
                if (aviao.getId() == id) {
                    return aviao;
                }
            }
            throw new Exception("Avião não encontrada");
        }
    
        public static void excluir(int id) throws Exception {
            Aviao aviao = getAviaoById(id);
            avioes.remove(aviao);
        }


        public static Aviao[] getAvioes() {
            return null;
        }


        public static int length() {
            return 0;
        }


}
//import java.rmi.server.RemoteRef;
import java.util.ArrayList;

public class Jato extends Aeromodelo {
    
    private String cor;
    private int velocidade;

    static ArrayList<Jato> jatos = new ArrayList<Jato>();

        protected Jato(){
            super(GetId.getNextId(jatos), marca, modelo);
            this.cor = cor;
            this.velocidade = velocidade;

            jatos.add(this);
        }

        public String getCor(){
            return this.cor;
        }

        public void setCor(String cor){
            this.cor = cor;
        }

        public int getVelocidade(){
            return this.velocidade;
        }

        public void setVelocidade(int velocidade){
            this.velocidade = velocidade;
        }

        @Override                    // para imprimir os objetos na tela
        public String toString(){
        return "Cor: " + this.cor 
        + " | Velocidade: " + this.velocidade;
        }

        public static Jato getJatoById(int id) throws Exception {
            for (Jato jato : jatos) {
                if (jato.getId() == id) {
                    return jato;
                }
            }
            throw new Exception("Jato não encontrada");
        }
    
        public static void excluir(int id) throws Exception {
            Jato jato = getJatoById(id);
            jatos.remove(jato);
        }

        public static Jato[] getJatos() {
            return null;
        }

}
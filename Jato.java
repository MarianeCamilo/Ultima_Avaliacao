import java.rmi.server.RemoteRef;
import java.util.ArrayList;

public abstract class Jato {
    
    private String cor;
    private int velocidade;

    ArrayList<Jato> jatos = new ArrayList<Jato>();

        protected Jato(String cor, int velocidade){
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
}

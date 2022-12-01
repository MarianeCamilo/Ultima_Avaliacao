import java.util.ArrayList;

public abstract class Helicoptero extends Aeromodelo{

    private String cor;
    private int capacidade;

    ArrayList<Helicoptero> helicopteros = new ArrayList<Helicoptero>();

        protected Helicoptero(String cor, int capacidade){
            this.cor = cor;
            this.capacidade = capacidade;

            helicopteros.add(this);
        }

        public String getCor(){
            return this.cor;
        }

        public void setCor(String cor){
            this.cor = cor;
        }

        public int getCapacidade(){
            return this.capacidade;
        }

        public void setCapacidade(int capacidade){
            this.capacidade = capacidade;
        }

        @Override                    // para imprimir os objetos na tela
        public String toString(){
        return "Cor: " + this.cor 
        + " | Capacidade: " + this.capacidade;
        }
}

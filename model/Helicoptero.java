import java.util.ArrayList;

public class Helicoptero extends Aeromodelo{

    private String cor;
    private int capacidade;

    static ArrayList<Helicoptero> helicopteros = new ArrayList<Helicoptero>();

        protected Helicoptero(String cor, int capacidade){
            super(GetId.getNextId(helicopteros), marca, modelo);
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

        public static Helicoptero getHelicopteroById(int id) throws Exception {
            for (Helicoptero helicoptero : helicopteros) {
                if (helicoptero.getId() == id) {
                    return helicoptero;
                }
            }
            throw new Exception("Helicoptero não encontrada");
        }
    
        public static void excluir(int id) throws Exception {
            Helicoptero helicoptero = getHelicopteroById(id);
            helicopteros.remove(helicoptero);
        }
}
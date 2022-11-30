import java.util.ArrayList;

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

      /*  @Override
        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof Aviao)) {
                return false;
            }
            
            Aviao other = (Aviao) obj;
            if (this.id != other.id) {
                return false;
            }
            return true;
            }

            */
}

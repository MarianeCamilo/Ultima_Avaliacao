import java.util.ArrayList;

public class Companhia implements GetId {
    
    private int id;
    private String nome;
    private String cnpj;

    public static ArrayList<Companhia> companhias = new ArrayList<Companhia>();

         protected void Companhia (int id, String nome, String cnpj){
            this.id = id;
            this.nome = nome;
            this.cnpj = cnpj;

            companhias.add(this);
        }

        public int getId(){
            return this.id;
        }

        public void setId(int id){
            this.id = id;
        }

        public String getNome(){
            return this.nome;
        }

        public void setNome(String nome){
            this.nome = nome;
        }

        public String getCnpj(){
            return this.cnpj;
        }

        public void setCnpj(String cnpj){
            this.cnpj = cnpj;
        }

        @Override
        public String toString(){
        return "Id: " + this.id
        + "\n | Nome: " + this.nome
        + "\n | CNPJ: " + this.cnpj;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof Companhia)) {
                return false;
            }
            
            Companhia other = (Companhia) obj;
            if (this.id != other.id) {
                return false;
            }
            return true;
            }

            public static Companhia getCompanhiaById(int id) throws Exception {
                for (Companhia companhia : companhias) {
                    if (companhia.getId() == id) {
                        return companhia;
                    }
                }
                throw new Exception("Companhia não encontrada");
            }
        
            public static void excluir(int id) throws Exception {
                Companhia companhia = getCompanhiaById(id);
                companhias.remove(companhia);
            }

            public static Companhia[] getCompanhias() {
                return null;
            }

            public static Companhia next() {
                return null;
            }

}

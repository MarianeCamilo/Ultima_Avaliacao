import java.util.ArrayList;

public class Pista implements GetId {
    
    private int id;
    private String numero;

    public static ArrayList<Pista> pistas = new ArrayList<Pista>();

        protected void Pista(int id, String numero){
            this.id = id;
            this.numero = numero;

            pistas.add(this);
        }

        public int getId(){
            return this.id;
        }

        public void setId(int id){
            this.id = id;
        }

        public String getNumero(){
            return this.numero;
        }

        public void setNumero(String numero){
            this.numero = numero;
        }

        @Override
        public String toString(){
        return "Id: " + this.id
        + "\n | Número da pista: " + this.numero;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof Pista)) {
                return false;
            }
            
            Pista other = (Pista) obj;
            if (this.id != other.id) {
                return false;
            }
            return true;
            }

            public static Pista getPistaById(int id) throws Exception {
                for (Pista pista : pistas) {
                    if (pista.getId() == id) {
                        return pista;
                    }
                }
                throw new Exception("Pista não encontrada");
            }
        
            public static void excluir(int id) throws Exception {
                Pista pista = getPistaById(id);
                pistas.remove(pista);
            }

            public static Pista[] getPistas() {
                return null;
            }

}

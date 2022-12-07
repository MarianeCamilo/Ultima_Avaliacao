import java.util.ArrayList;

public class Hangar implements GetId {
    
    private int id;
    private String local;
    private int idAviao;
    private Aviao avioes;

    public static ArrayList<Hangar> hangares = new ArrayList<Hangar>();

        protected void Hangar (int id, String local, int idAviao, Aviao avioes){
            this.id = id;
            this.local = local;
            this.idAviao = idAviao;
            this.avioes = avioes;
        }

        public int getId(){
            return this.id;
        }

        public void setId(int id){
            this.id = id;
        }

        public String getLocal(){
            return this.local;
        }

        public void setLocal(String local){
            this.local = local;
        }

        public int getIdAviao(){
            return this.idAviao;
        }

        public void setIdAviao(int idAviao){
            this.idAviao = idAviao;
        }

        public Aviao getAvioes(){
            return this.avioes;
        }

        public void setAvioes(){
            this.avioes = avioes;
        }

        @Override
        public String toString(){
        return "Id: " + this.id
        + " | Local: " + this.local
        + " | IdAvião: " + this.idAviao
        + " | Avião: " + this.avioes;
        }

        public static Hangar getHangarById(int id) throws Exception {
            for (Hangar hangar : hangares) {
                if (hangar.getId() == id) {
                    return hangar;
                }
            }
            throw new Exception("Companhia não encontrada");
        }
    
        public static void excluir(int id) throws Exception {
            Hangar hangar = getHangarById(id);
            hangares.remove(hangar);
        }

        public static Hangar[] getHangares() {
            return null;
        }

}

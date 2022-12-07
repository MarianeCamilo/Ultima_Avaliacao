import java.net.NetPermission;
import java.util.ArrayList;

public class Voo implements GetId {
    
    private int id;
    private String numero;
    private String data;
    private String hora;
    private String origem;
    private String destino;
    private String piloto;
    private String copiloto;
    private String observacao;
    private int idPista;
    private Pista pista;
    private int idAviao;
    private Aviao avioes;
    private int idHelicoptero;
    private Helicoptero helicoptero;
    private int idJato;
    private Jato jatos;

    public static ArrayList<Voo> voos = new ArrayList<Voo>();



      public void Voo(int id, String numero, String data, String hora, String origem, String destino, String piloto,
         String copiloto, String observacao, int idPista, Pista pista, int idAviao, Aviao avioes, int idHelicoptero, Helicoptero helicoptero, int idJato, Jato jatos){
            this.id = id;
            this.numero = numero;
            this.data = data;
            this.hora = hora;
            this.origem = origem;
            this.destino = destino;
            this.piloto = piloto;
            this.copiloto = copiloto;
            this.observacao = observacao;
            this.idPista = idPista;
            this.pista = pista;
            this.idAviao = idAviao;
            this.avioes = avioes;
            this.idHelicoptero = idHelicoptero;
            this.helicoptero = helicoptero;
            this.idJato = idJato;
            this.jatos = jatos;
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

         public String getData(){
            return this.data;
         }

         public void setData(String data){
            this.data = data;
         }

         public String getHora(){
            return this.hora;
         }

         public void setHora(String hora){
            this.hora = hora;
         }

         public String getOrigem(){
            return this.origem;
         }

         public void setOrigem(String origem){
            this.origem = origem;
         }

         public String getDestino(){
            return this.destino;
         }

         public void setDestino(String destino){
            this.destino = destino;
         }

         public String getPiloto(){
            return this.piloto;
         }

         public void setPiloto(String piloto){
            this.piloto = piloto;
         }

         public String getCopiloto(){
            return this.copiloto;
         }

         public void setCopiloto(String copiloto){
            this.copiloto = copiloto;
         }

         public String getObservacao(){
            return this.observacao;
         }

         public void setObservacao(String observacao){
            this.observacao = observacao;
         }

        @Override
        public String toString(){
        return "Id: " + this.id
        + "\n | Número: " + this.numero
        + "\n | Data: " + this.data
        + "\n | Hora: " + this.hora
        + "\n | Origem: " + this.origem
        + "\n | Destino: " + this.destino
        + "\n | Piloto: " + this.piloto
        + "\n | Copiloto: " + this.copiloto
        + "\n | Observação: " + this.observacao
        + "\n | Id da pista: " + this.idPista
        + "\n | Pista: " + this.pista
        + "\n | Id do avião: " + this.idAviao
        + "\n | Avião: " + this.avioes
        + "\n | Id do helicóptero: " + this.idHelicoptero
        + "\n | Helicóptero: " + this.helicoptero
        + "\n | Id do jato: " + this.idJato
        + "\n | Jato: " + this.jatos;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof Voo)) {
                return false;
            }
            
            Voo other = (Voo) obj;
            if (this.id != other.id) {
                return false;
            }
            return true;
            }

            public static Voo getVooById(int id) throws Exception {
               for (Voo voo : voos) {
                   if (voo.getId() == id) {
                       return voo;
                   }
               }
               throw new Exception("Voo não encontrada");
           }
       
           public static void excluir(int id) throws Exception {
               Voo voo = getVooById(id);
               voos.remove(voo);
           }

        public static Voo[] getVoos() {
            return null;
        }
}

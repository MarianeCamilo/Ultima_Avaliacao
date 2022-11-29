import java.util.ArrayList;

public abstract class Aeremodelo {
    
    private int id;
    private String marca;
    private String modelo; // variaveis da classe

    public static ArrayList<Aeremodelo> aeromodelos = new ArrayList<Aeremodelo>(); // arraylist da classe
        
        protected void Aeromodelo (int id, String marca, String modelo){ // construtor da classe
            this.id = id;
            this.marca = marca;
            this.modelo = modelo; // objetos construidos pelo construtor

            aeromodelos.add(this);
        }

        public int getId(){ // get entrada de informação
           return this.id;
        }

        public void setId(int id){ // set saída de informção
            this.id = id;
        }

        public String getMarca(){
            return this.marca;
        }

        public void setMarca(String marca){
            this.marca = marca;
        }

        public String getModelo(){
            return this.modelo;
        }

        public void setModelo(String modelo){
            this.modelo = modelo;
        }
    
        @Override                    // para imprimir os objetos na tela
        public String toString(){
        return "Id: " + this.id 
        + " | Marca: " + this.marca
        + " | Modelo: " + this.modelo;
        }
}

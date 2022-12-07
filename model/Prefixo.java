public class Prefixo<L, N> {
    
    private L letras;
    private N numeros;
    
    public Prefixo(L letras, N numeros) {
        this.letras = letras;
        this.numeros = numeros;
    }

    public L getLetras() {
        return letras;
    }

    public void setLetras(L letras) {
        this.letras = letras;
    }

    public N getNumeros() {
        return numeros;
    }

    public void setNumeros(N numeros) {
        this.numeros = numeros;
    }

    @Override
    public String toString() {
        return letras + "-" + numeros;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Prefixo)) {
            return false;
        }
        
        Prefixo<L,N> other = (Prefixo<L,N>) obj;
        if (this.letras != other.letras || this.numeros != other.numeros) {
            return false;
        }
        return true;
    }

}

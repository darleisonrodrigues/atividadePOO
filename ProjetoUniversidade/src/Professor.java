public class Professor extends Pessoa {
    private String centro;
 
    public Professor(String cpf, String nome, int idade, String centro) {
        super(cpf, nome, idade);
        this.centro = centro;
    }
 
    public String getCentro() {
        return centro;
    }
 
    public void setCentro(String centro) {
        this.centro = centro;
    }
 
    public void darAula() {
        
    }

@Override
    public String toString() {
        return getNome();
}
 }
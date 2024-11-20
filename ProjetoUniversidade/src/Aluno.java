public abstract class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String cpf, String nome, int idade, String matricula) {
        super(cpf, nome, idade);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // Método abstrato que será implementado nas classes filhas
    public abstract void pagarMensalidade();

    @Override
    public String toString() {
        return "Aluno: " + getNome() + " (Matrícula: " + matricula + ")";
    }
}
public class Bolsista extends Aluno {
    public Bolsista(String cpf, String nome, int idade, String matricula) {
        super(cpf, nome, idade, matricula);
    }

    @Override
    public void pagarMensalidade() {
        System.out.println("Aluno bolsista " + getNome() + " pagou mensalidade com desconto!");
    }
}
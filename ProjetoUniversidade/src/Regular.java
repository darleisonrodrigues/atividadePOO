public class Regular extends Aluno {
    public Regular(String cpf, String nome, int idade, String matricula) {
        super(cpf, nome, idade, matricula);
    }

    @Override
    public void pagarMensalidade() {
        System.out.println("Aluno regular " + getNome() + " pagou mensalidade integral!");
    }
}
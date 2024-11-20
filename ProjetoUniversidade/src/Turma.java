import java.util.ArrayList;

public class Turma {
    private String codigo;
    private Disciplina disciplina;
    private Professor professor;
    private ArrayList<Aluno> alunos;

    public Turma(String codigo, Disciplina disciplina, Professor professor) {
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    public void listarAlunos() {
        System.out.println("\nLista de Alunos da Turma " + codigo + ":");
        for (Aluno aluno : alunos) {
            System.out.println("- " + aluno.toString());
        }
    }

    public void imprimirInfoTurma() {
        System.out.println("\n=== Informações da Turma " + codigo + " ===");
        System.out.println("Disciplina: " + disciplina.toString());
        System.out.println("Professor: " + professor.toString());
        listarAlunos();
        System.out.println("=====================================");
    }
}
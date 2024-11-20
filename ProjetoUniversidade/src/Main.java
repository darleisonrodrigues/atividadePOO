public class Main {
    public static void main(String[] args) {
        // Disciplinas
        Disciplina d1 = new Disciplina("POO001", "Programação Orientada a Objetos", "2024.1");
        Disciplina d2 = new Disciplina("BD001", "Banco de Dados", "2024.1");
        Disciplina d3 = new Disciplina("WEB001", "Desenvolvimento Web", "2024.1");

        // Alunos regulares
        Regular alunoRegular1 = new Regular("111.222.333-44", "Maria Lívia", 20, "2024001");
        Regular alunoRegular2 = new Regular("222.333.444-55", "Pedro Lucas", 22, "2024002");
        // Aluno bolsista
        Bolsista alunoBolsista = new Bolsista("333.444.555-66", "Ana Lima", 19, "2024003");

        // Professor
        Professor prof = new Professor("123.456.789-00", "João Silva", 45, "Centro de Computação");
 
        // Visitantes        
        Visitante v1 = new Visitante("444.555.666-77", "Carlos Souza", 30);
        Visitante v2 = new Visitante("555.666.777-88", "Ana Paula", 25);        

        // Turmas
        Turma turma1 = new Turma("T1", d1, prof);
        Turma turma2 = new Turma("T2", d2, prof);
        Turma turma3 = new Turma("T3", d3, prof);

        // Seção onde são adicionado os alunos às turmas
        turma1.adicionarAluno(alunoRegular1);
        turma1.adicionarAluno(alunoRegular2);
        turma1.adicionarAluno(alunoBolsista);
        turma2.adicionarAluno(alunoRegular1);
        turma2.adicionarAluno(alunoBolsista);

        turma3.adicionarAluno(alunoRegular2);
        turma3.adicionarAluno(alunoBolsista);

        // Imprimindo informações das turmas
        turma1.imprimirInfoTurma();
        turma2.imprimirInfoTurma();
        turma3.imprimirInfoTurma();

        // Demonstrando alguns métodos
        prof.darAula();
        alunoRegular1.pagarMensalidade();
        alunoBolsista.pagarMensalidade();
        alunoRegular1.fazerAniversario();
    }
}
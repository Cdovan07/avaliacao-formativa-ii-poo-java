public class Questao05 {
    public static void main(String[] args) {
        Aluno05 aluno1 = new Aluno05(
            "Ana Souza",
            "20260001",
            "Ciência da Computação"
        );

        Aluno05 aluno2 = new Aluno05(
            "Pedro Lima",
            "20260002",
            "Engenharia da Computação"
        );

        System.out.println("--- Aluno 1 ---");
        aluno1.exibirDados();

        System.out.println();

        System.out.println("--- Aluno 2 ---");
        aluno2.exibirDados();
    }
}
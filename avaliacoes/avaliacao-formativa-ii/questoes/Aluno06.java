public class Aluno06 {
    private String nome;
    private String matricula;
    private String curso;

    public Aluno06(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.isEmpty()) {
            System.out.println("Erro: o nome não pode ser vazio.");
        } else {
            this.nome = nome;
        }
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if (matricula.isEmpty()) {
            System.out.println("Erro: a matrícula não pode ser vazia.");
        } else {
            this.matricula = matricula;
        }
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        if (curso.isEmpty()) {
            System.out.println("Erro: o curso não pode ser vazio.");
        } else {
            this.curso = curso;
        }
    }
}
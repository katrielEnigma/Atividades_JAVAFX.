package projetos.cadastroSimples.entity;

public class Aluno {

    // Atributos principais
    private String nome;
    private Integer idade;
    private String curso;

    // Construtor padrão (útil para frameworks e inicializações flexíveis)
    public Aluno() {
    }

    // Construtor completo
    public Aluno(String nome, Integer idade, String curso) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    // Método utilitário para impressão e logs
    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", curso='" + curso + '\'' +
                '}';
    }
}

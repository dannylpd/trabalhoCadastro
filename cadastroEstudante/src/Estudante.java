public class Estudante {
    private String nome;

    private String matricula;

    private String telefone;

    private String email;

    private String endereco;

    public Estudante(String matricula, String nome, String email, String telefone, String endereco) {
        this.matricula = matricula;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String obterNome() {
        return nome;
    }

    public void atualizarNome(String nome) {
        this.nome = nome;
    }

    public String obterMatricula() {
        return matricula;
    }

    public void atualizarMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String obterTelefone() {
        return telefone;
    }

    public void atualizarTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String obterEmail() {
        return email;
    }

    public void atualizarEmail(String email) {
        this.email = email;
    }

    public String obterEndereco() {
        return endereco;
    }

    public void atualizarEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Estudante [nome=" + nome + ", matricula=" + matricula + ", telefone=" + telefone + ", email=" + email
                + ", endereco=" + endereco + "]";
    }

}

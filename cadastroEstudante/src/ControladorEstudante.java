import java.util.ArrayList;

public class ControladorEstudante {
    ArrayList<Estudante> estudantes;

    public ControladorEstudante() {
        estudantes = new ArrayList<Estudante>();
    }

    public void incluirEstudante(Estudante estudante) {
        estudantes.add(estudante);
    }

    public void excluirEstudante(String matriculaEstudante) {
        Estudante estudante = selecionarEstudantePorMatricula(matriculaEstudante);
        estudantes.remove(estudante);
    }

    public Estudante selecionarEstudantePorMatricula(String matricula) {
        Estudante estudante = null;
        for (int i = 0; i < estudantes.size(); i++) {
            if (estudantes.get(i).obterMatricula().equals(matricula)) {
                estudante = estudantes.get(i);
                break;
            }
        }
        return estudante;
    }

    public Estudante selecionarEstudantePorNome(String nome) {
        Estudante estudante = null;
        for (int i = 0; i < estudantes.size(); i++) {
            if (estudantes.get(i).obterNome().equals(nome)) {
                estudante = estudantes.get(i);
                break;
            }
        }
        return estudante;
    }

    public ArrayList<Estudante> obterEstudantes() {
        return estudantes;
    }
}
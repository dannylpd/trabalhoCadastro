import java.util.Scanner;

public class EstudanteInterface {

    private ControladorEstudante controlador;

    public EstudanteInterface() {
        controlador = new ControladorEstudante();
        exibirMenu();
    }

    public void exibirMenu() {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n Menu:");
            System.out.println("1 - Adicionar Estudante");
            System.out.println("2 - Buscar por Matrícula");
            System.out.println("3 - Buscar por Nome");
            System.out.println("4 - Remover Estudante");
            System.out.println("5 - Listar Estudantes");
            System.out.println("6 - Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Matrícula: ");
                    String matricula = scanner.nextLine();
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();
                    System.out.print("Endereço Completo: ");
                    String endereco = scanner.nextLine();

                    Estudante novoEstudante = new Estudante(matricula, nome, email, telefone, endereco);
                    controlador.incluirEstudante(novoEstudante);
                    System.out.println("Estudante cadastrado com sucesso.");
                    break;

                case 2:
                    System.out.print("Digite a matrícula: ");
                    String matriculaBusca = scanner.nextLine();
                    Estudante estudantePorMatricula = controlador.selecionarEstudantePorMatricula(matriculaBusca);
                    if (estudantePorMatricula != null) {
                        System.out.println("Estudante encontrado:");
                        System.out.println("Matrícula: " + estudantePorMatricula.obterMatricula());
                        System.out.println("Nome: " + estudantePorMatricula.obterNome());
                        System.out.println("Email: " + estudantePorMatricula.obterEmail());
                        System.out.println("Telefone: " + estudantePorMatricula.obterTelefone());
                        System.out.println("Endereço Completo: " + estudantePorMatricula.obterEndereco());
                    } else {
                        System.out.println("Estudante não encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Digite o nome: ");
                    String nomeBusca = scanner.nextLine();
                    Estudante estudantePorNome = controlador.selecionarEstudantePorNome(nomeBusca);
                    if (estudantePorNome != null) {
                        System.out.println("Estudante encontrado:");
                        System.out.println("Matrícula: " + estudantePorNome.obterMatricula());
                        System.out.println("Nome: " + estudantePorNome.obterNome());
                        System.out.println("Email: " + estudantePorNome.obterEmail());
                        System.out.println("Telefone: " + estudantePorNome.obterTelefone());
                        System.out.println("Endereço Completo: " + estudantePorNome.obterEndereco());
                    } else {
                        System.out.println("Estudante não encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Digite a matrícula do estudante a ser removido: ");
                    String matriculaParaRemover = scanner.nextLine();
                    controlador.excluirEstudante(matriculaParaRemover);
                    break;

                case 5:
                    System.out.println(controlador.obterEstudantes());
                    break;

                case 6:
                    System.out.println("Encerrando o programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
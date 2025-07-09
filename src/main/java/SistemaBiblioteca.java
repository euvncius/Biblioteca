import java.util.Scanner;

public class SistemaBiblioteca {
    public static Biblioteca biblioteca = new Biblioteca();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("🏛️  BEM-VINDO AO SISTEMA DA BIBLIOTECA! 🏛️");

        while (true) {
            mostrarMenu();
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    cadastrarLivro();
                    break;
                case 2:
                    biblioteca.listarTodosLivros();
                    break;
                case 3:
                    buscarLivro();
                    break;
                case 4:
                    emprestarLivro();
                    break;
                case 5:
                    devolverLivro();
                    break;
                case 6:
                    biblioteca.estatisticas();
                    break;
                case 7:
                    System.out.println("👋 Obrigado por usar o Sistema da Biblioteca!");
                    return;
                default:
                    System.out.println("❌ Opção inválida! Tente novamente.");
            }

            System.out.println("\nPressione ENTER para continuar...");
            scanner.nextLine();
        }
    }

    private static void cadastrarLivro() {
        System.out.println("📝 CADASTRAR NOVO LIVRO");
        System.out.println("=======================");
        System.out.print("Digite o título do livro: ");
        String titulo = scanner.nextLine();

        System.out.print("Digite o autor do livro: ");
        String autor = scanner.nextLine();

        biblioteca.adicionarLivro(titulo, autor);
    }

    private static void buscarLivro() {
        System.out.println("🔍 BUSCAR LIVRO");
        System.out.println("================");
        System.out.print("Digite o título ou autor para buscar: ");
        String termo = scanner.nextLine();
        biblioteca.buscar(termo);
    }

    private static void emprestarLivro() {
        System.out.println("📤 PEGAR LIVRO");
        System.out.println("===================");
        System.out.print("Digite o título do livro para emprestar: ");
        String titulo = scanner.nextLine();
        biblioteca.pegarLivro(titulo);
    }

    private static void devolverLivro() {
        System.out.println("📥 DEVOLVER LIVRO");
        System.out.println("==================");
        System.out.print("Digite o título do livro para devolver: ");
        String titulo = scanner.nextLine();
        biblioteca.devolverLivro(titulo);
    }

    private static void mostrarMenu() {
        System.out.println("\n" + "=========================");
        System.out.println("      MENU PRINCIPAL");
        System.out.println("=========================");
        System.out.println("1. 📝 Cadastrar um novo livro");
        System.out.println("2. 📋 Listar todos os livros");
        System.out.println("3. 🔍 Buscar livro");
        System.out.println("4. 📤 Pegar um livro");
        System.out.println("5. 📥 Devolver livro");
        System.out.println("6. 📊 Ver estatísticas");
        System.out.println("7. 🚪 Sair");
        System.out.println("=========================");
        System.out.print("Escolha uma opção: ");
    }
}
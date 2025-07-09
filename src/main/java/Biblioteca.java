import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Livro> Livros;

    public Biblioteca(){
        this.Livros = new ArrayList<>();
        adicionarLivro("O pequeno principe", "Antoine de Sant-Exupéry");
        adicionarLivro("Dom Casmurro", "Machado de Assis");
        adicionarLivro("1984", "George Orwell");
    }

    public void adicionarLivro(String titulo, String autor){
        Livro novoLivro = new Livro(titulo, autor);
        Livros.add(novoLivro);
        System.out.println("Livro '" + titulo + " adicionado com sucesso!");
    }

    public void listarTodosLivros(){
        if (Livros.isEmpty()){
            System.out.println("Não há livros na biblioteca");
        }

        System.out.println("\n📖 TODOS OS LIVROS DA BIBLIOTECA:");
        System.out.println("============");
        for (int i = 0; i < Livros.size(); i++) {
            System.out.print((i + 1) + ". ");
            Livros.get(i).mostrarInfo();
        }
    }

    public  void buscar(String titulo){
        boolean encontrou = false;
         for (Livro x : Livros){
             if (x.getTitulo().equalsIgnoreCase(titulo)){
                 System.out.println("Resultado da busca: ");
                 x.mostrarInfo();
                 encontrou = true;
             }
         }

         if (!encontrou){
             System.out.println("Nenhum livro encontrado com o titulo: " + titulo);
         }
    }

    public  void pegarLivro(String titulo){
        for (Livro x : Livros){
            if (x.getTitulo().equalsIgnoreCase(titulo)){
                if (x.getEmprestado()){
                    System.out.println("O livro " + titulo + " já está emprestado");
                    return;
                }else {
                    x.emprestar();
                    System.out.println("Livro emprestado com sucesso! Você tem até 2 semanas para retorna-lo");
                    return;
                }
            }
        }
        System.out.println("Livro '" + titulo + "' não encontrado na biblioteca");

    }

    public  void devolverLivro(String titulo){
        for (Livro x : Livros){
            if (x.getTitulo().equalsIgnoreCase(titulo)){
                if (!x.getEmprestado()){
                    System.out.println("O livro " + titulo + " nao estava emprestado");
                    return;
                }else {
                    x.devolver();
                    System.out.println("Devolução registrada, Obrigado!");
                    return;
                }
            }
        }
        System.out.println("Livro '" + titulo + "' não encontrado na biblioteca");

    }

    public void estatisticas(){
        int emprestados = 0;
        int disponiveis = 0;

        for (Livro x : Livros){
            if (x.getEmprestado()){
                emprestados++;
            }else {
                disponiveis++;
            }
        }

        System.out.println("\n📊 ESTATÍSTICAS DA BIBLIOTECA:");
        System.out.println("============================");
        System.out.println("📚 Total de livros: " + Livros.size());
        System.out.println("✅ Livros disponíveis: " + disponiveis);
        System.out.println("📤 Livros emprestados: " + emprestados);
    }



}

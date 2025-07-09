public class Livro {
    String titulo;
    String autor;
    boolean emprestado;


    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.emprestado = false;
    }

    public void mostrarInfo() {
        String status = emprestado ? "EMPRESTADO" : "DISPONÍVEL";
        System.out.println("📚 " + titulo + " - " + autor + " [" + status + "]");
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean getEmprestado() {
        return emprestado;
    }
    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public void emprestar(){
        this.emprestado=true;
    }
    public void devolver(){
        this.emprestado=false;
    }
}

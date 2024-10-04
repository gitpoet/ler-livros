public class Livro{

    private String autor;
    private String titulo;
    private int numeroPaginas;

    public Livro(String autor, String titulo, int numeroPaginas){

        this.autor = autor;
        this.titulo = titulo;
        this.numeroPaginas = numeroPaginas;

    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(){
        this.autor = autor;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(){
        this. titulo = titulo;
    }

    public int getNumeroPaginas(){
        return numeroPaginas;
    }

    public void setNumeroPaginas(){
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                '}';
    }





}
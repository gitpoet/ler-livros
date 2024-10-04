

public class Main{
    public static void main(String[] args) {
        ListLivros livros = new ListLivros();
        livros.addLivros("Carlos", "Fragmentos", 50);
        livros.addLivros("Carlos jorge", "A janela", 50);


        System.out.println(livros);
        System.out.println(livros.mediaPaginasLidas());
    }
 
}
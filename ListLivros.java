
import java.util.ArrayList;
import java.util.List;

public class ListLivros{

    private List<Livro> livros;

    public ListLivros() {
        this.livros = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "ListLivros{" +
                "ListLivros=" + livros +
                '}';
    }

    public List<Livro> addLivros(String autor, String titulo, int numeroPaginas){
         livros.add(new Livro(autor, titulo, numeroPaginas));
         return livros;
    }

    public int mediaPaginasLidas(){

         int media = 0;
         int somaPaginas = 0;
         

        if(!livros.isEmpty()){
            for(Livro p: livros){
                somaPaginas += p.getNumeroPaginas();

                media = somaPaginas / livros.size();
             }
            
        }
            return media;
       
    }

}
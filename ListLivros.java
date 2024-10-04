
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
        
        int somaPaginas = 0;
        int tamanhoLista = 0;

        if(!livros.isEmpty()){
            tamanhoLista = livros.size();
            for(Livro p: livros){
                somaPaginas += p.getNumeroPaginas();
             }
            
        }

        if (tamanhoLista > 0) {
            return somaPaginas / tamanhoLista;
        } else {
            return 0;
        }
       
    }

}
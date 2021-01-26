package projetolivro;
public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro [3];
        
        p[0] = new Pessoa("Lucas", 23, "M");
        p[1] = new Pessoa("Aline", 25, "F");
        
        l[0] = new Livro("StarWars", "LucasFilms", 300, p[0]);
        l[1] = new Livro("Amor pegando viagem", "Nando Reis", 450, p[1]);
        l[2] = new Livro("Sem Criatividade", "Irineu", 13, p[0]);
        System.out.println(l[1].detalhes());
        
    }
    
}

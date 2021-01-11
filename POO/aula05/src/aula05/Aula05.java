package aula05;
public class Aula05 {
    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco();
        c1.abrirConta("CC");
        c1.setDono("Lucas");
        c1.setNumConta(5456);
        c1.depositar(100);
        
        ContaBanco c2 = new ContaBanco();
        c2.setDono("Line");
        c2.setNumConta(6468);
        c2.abrirConta("CP");
        c2.depositar(500);
        
        
        c1.situacao();
        c2.situacao();
    }
    
}

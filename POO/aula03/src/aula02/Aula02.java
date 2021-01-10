package aula02;

public class Aula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIC CRISTAL";
        c1.cor = "AZUL";
        c1.ponta = 0.5f;
        c1.carga = 50;
        c1.destampar();        
        c1.status();
        c1.rabiscar();
    }   
}

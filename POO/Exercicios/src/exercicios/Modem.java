package exercicios;
public class Modem {
    String modelo;
    String cor;
    float MB;
    boolean ligado;
    
    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Quantidade de MB: " + this.MB);
        
    }
    void conectado() {
        this.ligado = true;
        System.out.println("Modem ativado!");
    }
    void desconectado() {
        this.ligado = false;
        System.out.println("Modem desativado");
    }
}


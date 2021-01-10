package aula04;
public class Caneta {
    private String modelo;
    private String cor;
    private float ponta;
    private boolean tampada;
    
    public Caneta(String m, float p, String c) {
        this.modelo = m;
        this.ponta = p;
        this.cor = c;
        this.tampar();
    }
    
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String m) {
        this.modelo = m;
    }
    public float getPonta(){
        return ponta;
    }
    public void setPonta(float p) {
        this.ponta = p;
    }
    public void tampar() {
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
    
    public void status() {
        System.out.println("SOBRE A CANETA");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Esta tampada? " + this.tampada);
    }
    
}




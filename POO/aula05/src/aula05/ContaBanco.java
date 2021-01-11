package aula05;
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //Método Construtor
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }   
// Métodos    
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
        } else if (t == "CP") {
            this.setSaldo(150);
        }
    }
    public void fecharConta() {
        if (this.getSaldo() > 0){
            System.out.println("Saque todo o dinheiro!");
        } else if (this.getSaldo() < 0) {
            System.out.println("Você está devendo, debito em conta");
        } else {
            this.setStatus(false);
            System.out.println("Conta Fechada");
        }
    }
    public void depositar(float v) {
        if (getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depositado em conta de " + this.getDono());
        } else {
            System.out.println("Impossível depositar em conta fechada");
        }
    }
    public void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saldo realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossível sacar, conta fechada");
        }
    }
    public void pagarMensal() {
        int v = 0;
        if (this.getTipo() == "CP"){
            v = 20;
        } else if (this.getTipo() == "CC"){
            v = 12;
        }
        if (this.getStatus()) {
            this.setSaldo(getSaldo() - v);
            System.out.println("Mensalidade paga por" + this.getDono());
        } else {
            System.out.println("Impossível pagar um conta fechada");
        }
    }
//Métodos especiais (Métodos Acessores e Modificadores)
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int n) {
        this.numConta = n;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String t) {
        this.tipo = t;
    }
    public String getDono() {
        return dono;
    }
    public void setDono(String d) {
        this.dono = d;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float s) {
        this.saldo = s;
    }
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean s) {
        this.status = s;
    }
    /*  */
    
    public void situacao() {
        System.out.println("-----------------------------");
        System.out.println("Situação da conta");
        System.out.println("Número da conta: " + getNumConta());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Dono: " + getDono());
        System.out.println("saldo: " + getSaldo());
        System.out.println("Conta aberta: " + getStatus());    
    }
}

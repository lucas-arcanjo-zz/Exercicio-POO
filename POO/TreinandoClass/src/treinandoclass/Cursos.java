package treinandoclass;
public class Cursos implements Plataforma {
    private String curso;
    private int duracao;
    private boolean matriculado;
    private Estudantes ligacao;

    public String detalhes() {
        return "Cursos{" + "curso=" + curso + ", duracao=" + duracao + 
            ", matriculado=" + matriculado + '}';
    }
    
//  Construtor

    public Cursos(String curso) {
        this.curso = curso;
        this.duracao = 0;
        this.matriculado = false;
    }

//  Métodos Getters e Setters

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public boolean isMatriculado() {
        return matriculado;
    }

    public void setMatriculado(boolean matriculado) {
        this.matriculado = matriculado;
    }

    public Estudantes getLigacao() {
        return ligacao;
    }

    public void setLigacao(Estudantes ligacao) {
        this.ligacao = ligacao;
    }
//  /   /    
    @Override
    public void consultar() {
    }

    @Override
    public void encerrar() {
    }

    @Override
    public void iniciar() {
    }

    @Override
    public void matricular() {
    }
    
    
}

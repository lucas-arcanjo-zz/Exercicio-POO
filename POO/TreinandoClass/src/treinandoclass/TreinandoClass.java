package treinandoclass;
public class TreinandoClass {
    public static void main(String[] args) {
        Cursos[] c = new Cursos[1];
        c[0] = new Cursos("Java");
        c[1] = new Cursos("POO");

        Estudantes[] e = new Estudantes[2];
        e[0] = new Estudantes("Lucas", 23, "M");
        e[1] = new Estudantes("Matheus", 28, "M");
        e[2] = new Estudantes("Giovana", 22, "F");
        System.out.println(c[1].detalhes());
    }
    
}

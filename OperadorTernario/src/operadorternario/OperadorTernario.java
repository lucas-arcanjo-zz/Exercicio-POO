/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorternario;

/**
 *
 * @author Lucas
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Utilização de Operador Ternário
        /*int n1, n2, r;
        n1 = 5;
        n2 = 16;
        r = (n1>n2)?0:1;
        System.out.println(r);*/
        // para vê se um resultado é igual ao outro é utilizado `==`
        // para vê se um resultado de um objeto é o mesmo é utilizado o método `.equals()`
        
        // Treinando
        int n1, n2;
        n1 = 44;
        n2 = 5;
        String r = (n1>n2)?"n1 é maior":"n2 é maior";
        System.out.println(r);        
        
    }
    
}

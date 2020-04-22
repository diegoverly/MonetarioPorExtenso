/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monetarioporextenso;


import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author DiegoVerly
 */
public class MonetarioPorExtenso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{

        Scanner scn = new Scanner(System.in);
        System.out.println("Digite um número: ");
        String valor = scn.nextLine();
        PorExtenso extenso = new PorExtenso();
        String extenso2 = extenso.getExtenso(valor);
        System.out.println(extenso2);
        scn.close();
        
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Erro na geração do extenso. Verificar erro:"+ e.getMessage());
        }
    }

}

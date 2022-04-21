package javaapplication1;

import javax.swing.JOptionPane;


public class JavaApplication1 {


    public static void main(String[] args) {
    String s = JOptionPane.showInputDialog("Digite sua idade");
    int i = Integer.parseInt(s);
    if (i > 17) {
        JOptionPane.showMessageDialog(null, "Maior de idade");
        
    } else{
        JOptionPane.showMessageDialog(null, "Menor de idade");
    }
    
    
    
    }
    
}

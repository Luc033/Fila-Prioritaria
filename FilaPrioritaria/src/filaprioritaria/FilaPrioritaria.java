/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package filaprioritaria;

/**
 *
 * @author morta
 *//*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author morta
 */import javax.swing.JOptionPane;
class FilaPrioritaria {
  public static void main(String[] args) {
    int Idade;

Idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do paciente."));
if (Idade< 60){
    JOptionPane.showMessageDialog(null, "Fila comum.");
  }else {
      if (Idade >= 80){
      JOptionPane.showMessageDialog(null, "Fila 80+.");
      }else{
           JOptionPane.showMessageDialog(null, "Fila prioritária.");  
           }
        }
  }
}



package ejemplodatos;
import Frm.appLuz;
import javax.swing.JOptionPane;

public class EjemploDatos {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      try {
         appLuz luz = new appLuz();
         luz.setVisible(true);
         
      } catch (Exception e) {
         JOptionPane.showMessageDialog(null,e);
      }
   }
   
}

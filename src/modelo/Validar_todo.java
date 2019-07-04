
package modelo;

/**
 *
 * @author Jhamir
 */
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTextField;
public class Validar_todo {
     public void SNumeros(JTextField CampoText)
    {
        CampoText.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e)
            {
                char c = e.getKeyChar();
                int lim=9;
                if((!Character.isDigit(c)) || CampoText.getText().length()== lim)
                {
                    System.out.println(c);
                    e.consume();
                }
            }
        });
    }
     public void SPrecio(JTextField CampoText)
    {
        CampoText.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e)
            {
                char c = e.getKeyChar();
                int lim=10;
                if((!Character.isDigit(c)) && c != '.' || CampoText.getText().length()== lim)
                {
                    System.out.println(c);
                    e.consume();
                }
                if(c=='.' && CampoText.getText().contains("."))
                {
                    e.consume();
                }
            }
        });
    }
    public void SDNI(JTextField CampoText)
    {
        CampoText.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e)
            {
                char c = e.getKeyChar();
                int lim=8;
                if((!Character.isDigit(c)) || CampoText.getText().length()== lim)
                {
                    System.out.println(c);
                    e.consume();
                }
            }
        });
    }     
      public void S2Can(JTextField CampoText)
    {
        CampoText.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e)
            {
                char c = e.getKeyChar();
                int lim=2;
                if((!Character.isDigit(c)) || CampoText.getText().length()== lim)
                {
                    System.out.println(c);
                    e.consume();
                }
            }
        });
    }
     
    public void Ruc(JTextField CampoText)
    {
        CampoText.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e)
            {
                char c = e.getKeyChar();
                int lim=11;
                if((!Character.isDigit(c)) || CampoText.getText().length()== lim)
                {
                    System.out.println(c);
                    e.consume();
                }
            }
        });
    }
    public void Cotiza(JTextField CampoText)
    {
        CampoText.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e)
            {
                char c = e.getKeyChar();
                int lim=5;
                if(CampoText.getText().length()== lim)
                {
                    System.out.println(c);
                    e.consume();
                }
            }
        });
    }
    public void SLetras(JTextField a)
    {
        a.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e)
            {
                char c = e.getKeyChar();
                if(Character.isDigit(c))
                {
                    e.consume();
                }
            }
        });
    }
    public void Email(JTextField em)
    {
        em.addKeyListener(new KeyAdapter(){
            Pattern pat = Pattern.compile("^[\\w\\-\\_\\+]+(\\.[\\w\\-\\_]+)*@([A-Za-z0-9-]\\.)+[A-Za-z]{2,4}$");
            Matcher mat = pat.matcher(em.getText());
            public void keyTyped(KeyEvent e)
            {
                if(mat.find())
                    e.consume();
            }
        });
    }
}

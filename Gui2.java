package Lab4;
import java.awt.*;
import javax.swing.*;
public class Gui2 extends JFrame
{
    JTextField jta = new JTextField(10);

    Font fnt = new Font("Courier New",Font.ITALIC,14);
    Gui2()
    {
        super("Example");
        setLayout(new FlowLayout());
        setSize(300,150);
        add(jta);
        jta.setForeground(Color.CYAN);
        jta.setFont(fnt);
        setVisible(true);
    }

    public static void main(String[]args)
    {
        new Gui2();
    }
}
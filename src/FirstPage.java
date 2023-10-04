import javax.swing.*;
import java.awt.*;

public class FirstPage extends JFrame{

    public FirstPage(){

        setSize(900,700);
        setLocation(300,150);


        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/photo-output.png"));
        Image i2 = i1.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel imgLabel = new JLabel(i3);
        add(imgLabel);
        setVisible(true);
        try{
            Thread.sleep(3000);
            setVisible(false);
            new Details();
        }
        catch(Exception e){
            e.printStackTrace();

        }

    }

    public static void main(String[] args) {
    new FirstPage();
    }
}




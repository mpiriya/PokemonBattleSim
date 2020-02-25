import javax.swing.*;
import java.awt.*;

public class PokeFrame extends JFrame {

    private JButton hello = new JButton("Hello");
    private int clickCount = 0;

    public PokeFrame(int width, int height) {
        super();
        setSize(width, height);
        /*
            cool way to get screen height width
        */
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int x = d.width / 2;
        int y = d.height / 2 - this.getHeight();
        this.setLocation(x, y);
        this.setLocationRelativeTo(null);
        
        hello.addActionListener(e -> 
            {
                clickCount++;
                if(clickCount == 1) {
                    hello.setText("I've been clicked");
                } else {
                    hello.setText("Clicked " + clickCount + " times");
                }
            });
        PokePanel pp = new PokePanel();
        pp.add(hello);
        pp.add(new ExitButton("Exit"));
        this.add(pp);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

class PokePanel extends JPanel {
    public PokePanel() {

        //label stuff
        JLabel label1 = new JLabel("why hello there");
        this.add(label1);

        //button stuff
        /*JButton button1 = new JButton();
        button1.setText("ok wack");
        this.add(button1);

        JButton button2 = new JButton("more wack");
        //removes the black border around the button
        //button2.setBorderPainted(false);

        // makes the button background transparent
        button2.setContentAreaFilled(false);
        this.add(button2);
        */
    }
}
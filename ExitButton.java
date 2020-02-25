import javax.swing.*;
import java.awt.*;

public class ExitButton extends JButton {
    public ExitButton(String text) {
        this(100, 40, text);
    }

    public ExitButton(int width, int height, String text) {
        super(text);
        setSize(width, height);
        this.addActionListener(e -> {
            System.exit(0);
        });
    }

    public void exitOnClick() {
        
    }
}
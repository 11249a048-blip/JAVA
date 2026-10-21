
import java.awt.*;
import java.awt.event.*;

public class ColorPalette extends Frame implements ActionListener {
    Button b1, b2, b3;

    ColorPalette() {
        setTitle("Color Palette");
        setSize(300, 200);
        setLayout(new FlowLayout());

        b1 = new Button("Red");
        b2 = new Button("Green");
        b3 = new Button("Blue");

        add(b1);
        add(b2);
        add(b3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1)
            setBackground(Color.RED);
        else if (e.getSource() == b2)
            setBackground(Color.GREEN);
        else if (e.getSource() == b3)
            setBackground(Color.BLUE);
    }

    public static void main(String[] args) {
        new ColorPalette();
    }
}

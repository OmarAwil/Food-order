import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener
{
    JRadioButton pizzaButton ;
    JRadioButton hamburgerButton ;
    JRadioButton hotDogButton ;

    ImageIcon pizza;
    ImageIcon hamburger;
    ImageIcon hotDog;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        pizza = new ImageIcon("pizza.png");
        hamburger = new ImageIcon("burger.jpeg");
        hotDog = new ImageIcon("hotdog.png");


        pizzaButton = new JRadioButton("Pizza");
        hamburgerButton = new JRadioButton("hamburger");
        hotDogButton = new JRadioButton("hotDog");

        ButtonGroup group = new ButtonGroup();
        group.add(pizzaButton);
        group.add(hamburgerButton);
        group.add(hotDogButton);

        pizzaButton.addActionListener(this);
        hamburgerButton.addActionListener(this);
        hotDogButton.addActionListener(this);

        pizzaButton.setIcon(pizza);
        hamburgerButton.setIcon(hamburger);
        hotDogButton.setIcon(hotDog);

        this.add(pizzaButton);
        this.add(hamburgerButton);
        this.add(hotDogButton);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ( e.getSource() == pizzaButton ){
            System.out.println("You ordered Pizza");
        }
        else if ( e.getSource() == hamburgerButton ){
            System.out.println("You ordered Hamburger");
        }
        else if ( e.getSource() == hotDogButton ){
            System.out.println("You ordered Hot Dog");
        }
    }
}


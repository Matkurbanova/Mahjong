import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mahjong implements ActionListener {

    static JButton pervaiaKnopka;
    static boolean isGameOver = false;

    public void start() {
        JFrame frame = new JFrame("MahJongGame");


        ImageIcon broccoli = new ImageIcon("images/broccoli.jpg");

        JButton button0 = new JButton();
        button0.setActionCommand("A");
        button0.setIcon(broccoli);
        button0.addActionListener(this);
        //JLabel button0 = new JLabel(broccoli);
        frame.add(button0);
        button0.setBackground(Color.YELLOW);


        ImageIcon eggplant = new ImageIcon("images/eggplant.jpg");
        JButton button1 = new JButton();
        button1.setActionCommand("B");

        button1.setIcon(eggplant);
        button1.addActionListener(this);
        frame.add(button1);
        button1.setBackground(Color.YELLOW);

        ImageIcon mango = new ImageIcon("images/mango.jpg");
        JButton button2 = new JButton();
        button2.setActionCommand("C");
        button2.setIcon(mango);
        button2.addActionListener(this);
        frame.add(button2);
        button2.setBackground(Color.YELLOW);

        ImageIcon broccoli1 = new ImageIcon("images/broccoli.jpg");
        JButton button3 = new JButton();
        button3.setActionCommand("A");
        button3.setIcon(broccoli1);
        button3.addActionListener(this);
        frame.add(button3);
        button3.setBackground(Color.YELLOW);

        ImageIcon mango1 = new ImageIcon("images/mango.jpg");
        JButton button4 = new JButton();
        button4.setActionCommand("C");
        button4.setIcon(mango1);
        button4.addActionListener(this);
        frame.add(button4);
        button4.setBackground(Color.YELLOW);

        ImageIcon turnip = new ImageIcon("images/turnip.jpg");
        JButton button5 = new JButton();
        button5.setActionCommand("D");
        button5.setIcon(turnip);
        button5.addActionListener(this);
        frame.add(button5);
        button5.setBackground(Color.YELLOW);

        ImageIcon eggplant2 = new ImageIcon("images/eggplant.jpg");
        JButton button6 = new JButton();
        button6.setActionCommand("B");
        button6.setIcon(eggplant2);
        button6.addActionListener(this);
        frame.add(button6);
        button6.setBackground(Color.YELLOW);

        ImageIcon strawberry = new ImageIcon("images/strawberry.jpg");
        JButton button7 = new JButton();
        button7.setActionCommand("E");
        button7.setIcon(strawberry);
        button7.addActionListener(this);
        frame.add(button7);
        button7.setBackground(Color.YELLOW);


        ImageIcon pumpkin = new ImageIcon("images/pumpkin.jpg");
        JButton button8 = new JButton();
        button8.setActionCommand("F");
        button8.setIcon(pumpkin);
        button8.addActionListener(this);
        frame.add(button8);
        button8.setBackground(Color.YELLOW);

        ImageIcon strawberry1 = new ImageIcon("images/strawberry.jpg");
        JButton button9 = new JButton();
        button9.setActionCommand("E");
        button9.setIcon(strawberry1);
        button9.addActionListener(this);
        frame.add(button9);
        button9.setBackground(Color.YELLOW);

        ImageIcon pumpkin1 = new ImageIcon("images/pumpkin.jpg");
        JButton button10 = new JButton();
        button10.setActionCommand("F");
        button10.setIcon(pumpkin1);
        button10.addActionListener(this);
        frame.add(button10);
        button10.setBackground(Color.YELLOW);

        ImageIcon turnip1 = new ImageIcon("images/turnip.jpg");
        JButton button11 = new JButton();
        button11.setActionCommand("D");
        button11.setIcon(turnip1);
        button11.addActionListener(this);
        frame.add(button11);
        button11.setBackground(Color.YELLOW);

        ImageIcon red_apple = new ImageIcon("images/red_apple.jpg");
        JButton button12 = new JButton();
        button12.setActionCommand("G");
        button12.setIcon(red_apple);
        button12.addActionListener(this);
        frame.add(button12);
        button12.setBackground(Color.YELLOW);

        ImageIcon tangerine = new ImageIcon("images/tangerine.jpg");
        JButton button13 = new JButton();
        button13.setActionCommand("K");
        button13.setIcon(tangerine);
        button13.addActionListener(this);
        frame.add(button13);
        button13.setBackground(Color.YELLOW);

        ImageIcon red_apple1 = new ImageIcon("images/red_apple.jpg");
        JButton button14 = new JButton();
        button14.setActionCommand("G");
        button14.setIcon(red_apple1);
        button14.addActionListener(this);
        frame.add(button14);
        button14.setBackground(Color.YELLOW);

        ImageIcon tangerine1 = new ImageIcon("images/tangerine.jpg");
        JButton button15 = new JButton();
        button15.setActionCommand("K");
        button15.setIcon(tangerine1);
        button15.addActionListener(this);
        frame.add(button15);
        button15.setBackground(Color.YELLOW);

        ImageIcon watermelon = new ImageIcon("images/watermelon.jpg");
        JButton button16 = new JButton();
        button16.setActionCommand("L");
        button16.setIcon(watermelon);
        button16.addActionListener(this);
        frame.add(button16);
        button16.setBackground(Color.YELLOW);

        ImageIcon potatoes = new ImageIcon("images/potatoes.jpg");
        JButton button17 = new JButton();
        button17.setActionCommand("M");
        button17.setIcon(potatoes);
        button17.addActionListener(this);
        frame.add(button17);
        button17.setBackground(Color.YELLOW);

        ImageIcon watermelon1 = new ImageIcon("images/watermelon.jpg");
        JButton button18 = new JButton();
        button18.setActionCommand("L");
        button18.setIcon(watermelon1);
        button18.addActionListener(this);
        frame.add(button18);
        button18.setBackground(Color.YELLOW);

        ImageIcon potatoes1 = new ImageIcon("images/potatoes.jpg");
        JButton button19 = new JButton();
        button19.setActionCommand("M");
        button19.setIcon(potatoes1);
        button19.addActionListener(this);
        frame.add(button19);
        button19.setBackground(Color.YELLOW);

        ImageIcon squash = new ImageIcon("images/squash.jpg");
        JButton button20 = new JButton();
        button20.setActionCommand("N");
        button20.setIcon(squash);
        button20.addActionListener(this);
        frame.add(button20);
        button20.setBackground(Color.YELLOW);

        ImageIcon tomato = new ImageIcon("images/tomato.jpg");
        JButton button21 = new JButton();
        button21.setActionCommand("O");
        button21.setIcon(tomato);
        button21.addActionListener(this);
        frame.add(button21);
        button21.setBackground(Color.YELLOW);

        ImageIcon lime = new ImageIcon("images/lime.jpg");
        JButton button22 = new JButton();
        button22.setActionCommand("P");
        button22.setIcon(lime);
        button22.addActionListener(this);
        frame.add(button22);
        button22.setBackground(Color.YELLOW);

        ImageIcon tomato1 = new ImageIcon("images/tomato.jpg");
        JButton button23 = new JButton();
        button23.setActionCommand("O");
        button23.setIcon(tomato1);
        button23.addActionListener(this);
        frame.add(button23);
        button23.setBackground(Color.YELLOW);

        ImageIcon plum = new ImageIcon("images/plum.jpg");
        JButton button24 = new JButton();
        button24.setActionCommand("Q");
        button24.setIcon(plum);
        button24.addActionListener(this);
        frame.add(button24);
        button24.setBackground(Color.YELLOW);

        ImageIcon lime1 = new ImageIcon("images/lime.jpg");
        JButton button25 = new JButton();
        button25.setActionCommand("P");
        button25.setIcon(lime1);
        button25.addActionListener(this);
        frame.add(button25);
        button25.setBackground(Color.YELLOW);

        ImageIcon plum1 = new ImageIcon("images/plum.jpg");
        JButton button26 = new JButton();
        button26.setActionCommand("Q");

        button26.setIcon(plum1);
        button26.addActionListener(this);
        frame.add(button26);
        button26.setBackground(Color.YELLOW);

        ImageIcon squash1 = new ImageIcon("images/squash.jpg");
        JButton button27 = new JButton();
        button27.setActionCommand("N");
        button27.setIcon(squash1);
        button27.addActionListener(this);
        frame.add(button27);
        button27.setBackground(Color.YELLOW);

        ImageIcon peach = new ImageIcon("images/peach.jpg");
        JButton button28 = new JButton();
        button28.setActionCommand("R");
        button28.setIcon(peach);
        button28.addActionListener(this);
        frame.add(button28);
        button28.setBackground(Color.YELLOW);

        ImageIcon peach1 = new ImageIcon("images/peach.jpg");
        JButton button29 = new JButton();
        button29.setActionCommand("R");
        button29.setIcon(peach1);
        button29.addActionListener(this);
        frame.add(button29);
        button29.setBackground(Color.YELLOW);


        frame.setLayout(new GridLayout(10, 10));
        frame.setSize(500, 500);
        frame.setVisible(true);


        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.DARK_GRAY);

    }

    int level = 0;

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton nazhatayaKnopka = (JButton) e.getSource();

        if (pervaiaKnopka == null) {
            pervaiaKnopka = nazhatayaKnopka;
        } else if (!pervaiaKnopka.equals(nazhatayaKnopka)
                && pervaiaKnopka.getActionCommand().equals(nazhatayaKnopka.getActionCommand())) {


            nazhatayaKnopka.setVisible(false);
            pervaiaKnopka.setVisible(false);

            pervaiaKnopka = null;
            level ++;
        } else {
            pervaiaKnopka = null;


            System.out.println(e.getActionCommand());

        }

        if(level == 15){
            isGameOver = true;

            congrat();
        } }

    public static void congrat() {
        JFrame winnerFrame = new JFrame("Congratulations! You are the best!");
        winnerFrame.setBounds(100, 100, 600, 300);
        winnerFrame.setVisible(true);
        ImageIcon ii = new ImageIcon("images/141015c.jpg");
        JLabel lable = new JLabel(ii);

        JScrollPane jsp = new JScrollPane(lable);
        winnerFrame.getContentPane().add(jsp);
        winnerFrame.setSize(300, 350);



    }

}
//try {
//java.applet.AudioClip clip =
// java.applet.Applet.newAudioClip(
//      new java.net.URL("audio/won.wav"));
//  clip.play();
//  } catch (java.net.MalformedURLException murle) {
//  System.out.println(murle);
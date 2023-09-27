import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Intro {
    static JFrame f;
    static JLabel l;
    static JButton b;
    public Intro(){
        String strig1 = "Instructions:";
        String strig2 = "This is a simple Snake game where the goal is to collect the apples " +
                "which are the red squares ";
        String strig3 = "with your snake. Collecting these apples will grow your snake and " +
                "increase your score. You must avoid ";
        String strig4 = "hitting the walls or hitting your own body, both will end the game. " +
                "To move your snake use your arrow ";
        String strig5 = "keys to move up, down, left, and right. To see your score it will be " +
                "in the name of the window and ";
        String strig6 = "updates as your play. Good luck!";
        String strig7 = "To exit this screen click anywhere on this text box.";
        f = new JFrame("Instruction");
        l = new JLabel("<html>" + strig1 + "<br/>" + strig2 + "<br/>" + strig3 + "<br/>" + strig4 + "<br/>" +
                strig5 + "<br/>" + strig6 + "<br/>" + strig7 + "<br/>" +"</html>", SwingConstants.CENTER);
        b = new JButton("Exit Button");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setContentPane(b);
        b.addActionListener(e -> f.dispose());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p = new JPanel();
        p.add(l);
        f.add(p);
        f.setSize(700, 500);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
    }
    public void run() {

    }

}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AboutUs extends JFrame implements ActionListener {

    JButton b1;
    JLabel j1;
    Font f, f1, f2;
    TextArea t1;
    String s;


    public AboutUs() {
        setLayout(null);
        JButton b1 = new JButton("Exit");
        add(b1);
        b1.setBounds(180, 430, 120, 20);
        b1.addActionListener(this);

        Font f = new Font("RALEWAY", Font.BOLD, 180);
        setFont(f);

        s = "#Problem -:" +
                " The manual system is suffering from a series of drawbacks. Since whole of the bills is to be maintained with hands " +
                "the process of keeping and maintaining the information is very tedious and lengthy to customer. It is very time consuming " +
                "and laborious process because, staff need to be visited the customers place every month to give the bills and to receive the payments" +
                " For this reason, we have provided features Present system is partially " +
                "automated (computerized), existing system is quite laborious as one must enter same" +
                " information at different places.\n" +
                "\n" +
                "#Solution -: This project system excludes the need of maintaining paper " +
                "electricity bill as all the electricity bill records are managed electronically. " +
                "Administrator doesn't have to keep a manual track of the users. " +
                "The system automatically calculates fine. Users don't have to visit to the office for " +
                "bill payment. There is no need of delivery boy for delivery bills to user's place. Thus, " +
                "it saves human efforts and resources.";


        TextArea t1 = new TextArea(s, 10, 40, Scrollbar.HORIZONTAL);
        t1.setEditable(false);
        t1.setBounds(20, 100, 450, 300);
        add(t1);

        Font f1 = new Font("RALEWAY", Font.BOLD, 16);
        t1.setFont(f1);

        Container container = this.getContentPane();
        t1 = new TextArea();

        JLabel l1 = new JLabel("About Project");
        add(l1);
        l1.setBounds(170, 10, 180, 80);
        l1.setForeground(Color.red);


        Font f2 = new Font("RALEWAY", Font.BOLD, 18);
        setFont(f2);

        setBounds(700, 220, 500, 550);
        setLayout(null);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();

    }


    public static void main(String[] args) {
        AboutUs aboutUs = new AboutUs();
        aboutUs.setVisible(true);
        //new AboutUs().setVisible(true);
    }
}

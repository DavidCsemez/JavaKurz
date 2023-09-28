package gui.niecoomne;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URI;


public class main {
    public static void main(String[] args) {

        //vytvorenie okna
        JFrame frame = new JFrame("Nieco o mne");
        frame.setMinimumSize(new Dimension(450, 300));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        frame.setContentPane(panel);

        JLabel meno = new JLabel("Meno: Dávid Csemez");
        meno.setBounds(140,0,150,20);
        panel.add(meno);

        JLabel datum=new JLabel("Datum narodenia: 24.05.2001");
        datum.setBounds(120,20,250,20);
        panel.add(datum);


        JLabel adresal= new JLabel("Adresa: Bátorove Kosihy");
        adresal.setBounds(130,40,270,20);
        panel.add(adresal);

        JLabel zamestnanie=new JLabel("Zamestnanie: " );
        zamestnanie.setBounds(10,60,100,20);
        panel.add(zamestnanie);

        JLabel skola=new JLabel("Študent vysokej školy na STU FEI v Bratislave odbor elektroenergetika");
        skola.setBounds(30,80,420,20);
        panel.add(skola);

        JLabel skusenosti=new JLabel("Skusenosti v programovany: ");
        skusenosti.setBounds(10,100,200,20);
        panel.add(skusenosti);

        JLabel program=new JLabel("Python, #C, HTML, CSS, PHP");
        program.setBounds(30,120,300,20);
        panel.add(program);

        JLabel zalubyN=new JLabel("Záluby: ");
        zalubyN.setBounds(10,140,200,20);
        panel.add(zalubyN);

        JLabel zaluby=new JLabel("hudba, filmy, PC hry");
        zaluby.setBounds(30,160,200,20);
        panel.add(zaluby);

        JLabel hyperlinkLabel = new JLabel("Adresa FB");
        hyperlinkLabel.setBounds(170,180,200,20);
        hyperlinkLabel.setForeground(Color.BLUE.darker());
        hyperlinkLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        hyperlinkLabel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                // Otvorí prehliadač s URL, keď sa klikne na hyperlink
                if (Desktop.isDesktopSupported()) {
                    try {
                        Desktop.getDesktop().browse(new URI("https://www.facebook.com/david.csemez/"));
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });

        panel.add(hyperlinkLabel);

        JLabel hyperlinkLabelI = new JLabel("Adresa IG");
        hyperlinkLabelI.setBounds(171,200,200,20);
        hyperlinkLabelI.setForeground(Color.BLUE.darker());
        hyperlinkLabelI.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        hyperlinkLabelI.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                // Otvorí prehliadač s URL, keď sa klikne na hyperlink
                if (Desktop.isDesktopSupported()) {
                    try {
                        Desktop.getDesktop().browse(new URI("https://www.instagram.com/csemez_david/"));
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });

        panel.add(hyperlinkLabelI);

        JButton btnOk = new JButton("OK");
        btnOk.setBounds(160, 220, 80, 20);

        btnOk.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(meno.getText());
                System.out.println(datum.getText());
                System.out.println(adresal.getText());
                System.out.println(zamestnanie.getText());
                System.out.println("\t"+skola.getText());
                System.out.println(skusenosti.getText());
                System.out.println("\t"+program.getText());
                System.out.println(zalubyN.getText());
                System.out.println("\t"+zaluby.getText());
                System.out.println("FB adresa: https://www.facebook.com/david.csemez/");
                System.out.println("IG adresa: https://www.instagram.com/csemez_david/");

                frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
            }
        });
        panel.add(btnOk);







        frame.pack();
        frame.setVisible(true);


    }
}

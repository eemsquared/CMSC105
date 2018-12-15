package Laboratory2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by mmcalvarez on 3/31/2017.
 */
public class GatherInput extends JFrame{
    private JTextArea menuHeader;
    private JRadioButton rbCategorical;
    private JRadioButton rbNumerical;
    private JRadioButton rbQuit;
    private JButton bOK;
    private JPanel panel;
    private ButtonGroup bg;

    GatherInput() {
        add(panel);
        setVisible(true);
        setTitle(menuHeader.getText());
        setSize(500, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        bg = new ButtonGroup();
        bg.add(rbCategorical);
        bg.add(rbNumerical);
        bg.add(rbQuit);

        bOK.setEnabled(false);
        askType();

        bOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (rbQuit.isSelected()) {
                    int i = JOptionPane.showConfirmDialog(null, "Are you sure you want to quit?", "Quit", JOptionPane.YES_NO_OPTION);
                    if (i == 0) {
                        quit();
                    } else {
                        askType();
                    }
                }else {
                    if (rbCategorical.isSelected()){
                        System.out.println("ggggg");
                       dispose();
                       new Categorical();

                    }
                }
            }
        });

        bOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (rbNumerical.isSelected()){
                    Numerical numerical = new Numerical();
                    numerical.setVisible(true);
                }
            }
        });

         /*rbQuit.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 if(rbQuit.isSelected()){
                     bOK.setEnabled(true);
                     int i = JOptionPane.showConfirmDialog(null, "Are you sure you want to quit?", "Quit", JOptionPane.YES_NO_OPTION);
                     if (i == 0) {
                         quit();
                     }
                 }
             }
         });

         rbCategorical.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 if (rbCategorical.isSelected()){
                     bOK.setEnabled(true);
                     categorical = new Categorical();
                     categorical.setVisible(true);
                     categorical.setEnabled(true);
                     categorical.setSize(600, 400);
                     categorical.setTitle("ggg");
                 }
             }
         });

         rbNumerical.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {

             }
         });*/
    }

    public void quit(){
        System.exit(0);
    }

    public void askType() {
        while (true) {
            try {
                wait();
            } catch (InterruptedException | IllegalMonitorStateException e) {

            }
            if (rbCategorical.isSelected() || rbNumerical.isSelected() || rbQuit.isSelected()) {
                bOK.setEnabled(true);
                break;
            }
        }
    }
}


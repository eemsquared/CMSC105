package Laboratory2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import static java.awt.event.KeyEvent.VK_ENTER;

/**
 * Created by mmcalvarez on 3/31/2017.
 */
public class Categorical extends JFrame{
    private JRadioButton rbNumeric;
    private JRadioButton rbAlphabetic;
    private JRadioButton rbString;
    private JButton bOK;
    private JPanel panel1;
    private JPanel panel;
    private JLabel label;
    private JTextField tfDescription;
    private JPanel panel2;
    private JLabel lSize;
    private JTextField tfSize;
    private JPanel panel3;
    private JLabel lsamples;
    private JTextField tfSamples;
    private JButton bEnter;
    private JTable tblCategorical;
    private JPanel panel4;
    private JButton bDescription;
    private JButton bSampleSize;
    private ArrayList<Object> list;
    private int choice;

    Categorical() {
        add(panel);
        panel.setVisible(true);
        panel1.setVisible(true);
        panel2.setVisible(false);
        panel3.setVisible(false);
        panel4.setVisible(false);
        setEnabled(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(500, 500);
        ButtonGroup bg = new ButtonGroup();
        bg.add(rbAlphabetic);
        bg.add(rbNumeric);
        bg.add(rbString);
        setVisible(true);

        bOK.setEnabled(false);
        askType();

        bOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (rbNumeric.isSelected()){
                    choice = 1;
                }else if (rbString.isSelected()){
                    choice = 2;
                }else if (rbAlphabetic.isSelected()){
                    choice = 3;
                }
            }
        });

        bDescription.setEnabled(true);
        askDescription();

        bDescription.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tfDescription.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter a brief description.", "Error", JOptionPane.ERROR_MESSAGE);
                }else {
                    panel2.setEnabled(true);
                    panel2.setVisible(true);
                }
            }
        });

        tfDescription.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == VK_ENTER){
                    if (tfDescription.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Please enter a brief description.", "Error", JOptionPane.ERROR_MESSAGE);
                    }else {
                        panel.setEnabled(false);
                        panel1.setVisible(true);
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        bSampleSize.setEnabled(false);
        askSampleSize();

        bSampleSize.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tfSize.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter sample size.", "Error", JOptionPane.ERROR_MESSAGE);
                }else {
                    panel3.setEnabled(true);
                    panel3.setVisible(true);
                }
            }
        });
    }


    private void createUIComponents() {
        // TODO: place custom component creation code here


        tblCategorical = new JTable();
        tblCategorical.getModel();

    }

    public void askType(){
        panel1.setEnabled(true);
        panel1.setVisible(true);
        //while (true){
            System.out.println("jsjsjs");
            if (rbAlphabetic.isSelected() || rbNumeric.isSelected() || rbString.isSelected()){
                bOK.setEnabled(true);
                //break;
          //  }
        }
    }

    public void askDescription(){
        panel1.setEnabled(true);
        panel.setVisible(true);
        while (true){
            if (!tfDescription.getText().equals("")){
                bDescription.setEnabled(true);
                break;
            }
        }
    }

    public void askSampleSize(){
        panel2.setEnabled(true);
        panel2.setVisible(true);
        while (true){
            if (!tfSize.getText().equals("")){
                bSampleSize.setEnabled(true);
                break;
            }
        }
    }
}

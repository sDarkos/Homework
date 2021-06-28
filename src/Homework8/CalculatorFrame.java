package Homework8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorFrame extends JFrame {

    private JTextField inputArea = new JTextField();

    public CalculatorFrame() {

        setTitle("Калькултор v1.0");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setBounds(100,100,300,500);

        setJMenuBar(createMenuBar());

        setLayout(new BorderLayout());

        add(jPanelTop(), BorderLayout.NORTH);

        add(jPanelBottom(),BorderLayout.CENTER);

        add(jPanelRight(), BorderLayout.EAST);

        setVisible(true);
    }

    private JPanel jPanelBottom(){

        JPanel bottom = new JPanel();
        bottom.setLayout(new GridLayout(4,4));

        DigitButtonActionListener digitButtonActionListener = new DigitButtonActionListener(inputArea);

        calcButtonActionListener calcButtonActionListener = new calcButtonActionListener(inputArea);

        for (int i = 1; i < 10; i++) {
            JButton button = new JButton(String.valueOf(i));
            button.addActionListener(digitButtonActionListener);
            bottom.add(button);
        }

        JButton clear = new JButton("C");
        clear.addActionListener(e -> inputArea.setText(""));
        bottom.add(clear);

        JButton zero = new JButton("0");
        zero.addActionListener(digitButtonActionListener);
        bottom.add(zero);

        JButton calc = new JButton("=");
        calc.addActionListener(calcButtonActionListener);
        bottom.add(calc);

        return bottom;
    }

    private  JPanel jPanelRight(){

        JPanel right = new JPanel();
        right.setLayout(new GridLayout(5,1));

        JButton plus = new JButton("+");
        plus.addActionListener(e -> inputArea.setText(inputArea.getText() + "+"));
        right.add(plus);

        JButton minus = new JButton("-");
        minus.addActionListener(e -> inputArea.setText(inputArea.getText() + "-"));
        right.add(minus);

        JButton multiplication = new JButton("*");
        multiplication.addActionListener(e -> inputArea.setText(inputArea.getText() + "*"));
        right.add(multiplication);

        JButton division = new JButton("/");
        division.addActionListener(e -> inputArea.setText(inputArea.getText() + "/"));
        right.add(division);

        JButton root = new JButton("√");
        root.addActionListener(e -> inputArea.setText(String.valueOf(Math.sqrt(Integer.parseInt(inputArea.getText())))));
        right.add(root);

        return right;
    }

    private JPanel jPanelTop(){
        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());

        top.add(inputArea, BorderLayout.NORTH);

        inputArea.setEditable(false);

        return top;
    }

    private JMenuBar createMenuBar(){
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("Файл");

        JMenuItem openItem = new JMenuItem("Открыть");
        fileMenu.add(openItem);

        JMenuItem exitItem = new JMenuItem("Выход");
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);

        return menuBar;
    }
}

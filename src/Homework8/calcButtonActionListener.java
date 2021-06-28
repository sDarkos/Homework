package Homework8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calcButtonActionListener implements ActionListener {

    private final JTextField textField;

    public calcButtonActionListener(JTextField textField) {
        this.textField = textField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        int res =0;
        int resMinus = 0;
        int resDivision = 1;
        int resMulti = 1;

        String[] plus = textField.getText().split("\\+");
        for (int i = 0; i < plus.length; i++) {
            resMinus = 0;
            String[] minus = plus[i].split("\\-");
            for (int j = 0; j < minus.length; j++) {
                String[] division = minus[j].split("\\/");
                resDivision =1;
                for (int k = 0; k < division.length; k++) {
                    String[] multi = division[k].split("\\*");
                    resMulti =1;
                    for (int l = 0; l < multi.length; l++) {
                      resMulti = Integer.parseInt(multi[l]) * resMulti;
                    }
                    division[k] = String.valueOf(resMulti);
                    resDivision = Integer.parseInt(division[k]) / resDivision;
                }
                minus[j] = String.valueOf(resDivision);
            }
            resMinus = Integer.parseInt(minus[0]);
            for (int z = 1; z < minus.length; z++){
                resMinus -= Integer.parseInt(minus[z]);
            }
            plus[i] = String.valueOf(resMinus);
            res = Integer.parseInt(plus[i]) + res;
        }
        textField.setText(String.valueOf(res));

    }

}

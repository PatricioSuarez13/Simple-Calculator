package calculator;

import javax.swing.JOptionPane;

/**
 *
 * @author Patricio Suarez
 */
public class calc extends javax.swing.JFrame {
//These are the variables that we are going to save 
//Estas son las variables las cual vamos a guardar    

    public float num1;
    public float num2;
    public String opertator;

    public calc() {
        initComponents();
        //This is for when the calculator launches, it appears on the center of the screen
        //Esto es para cuando se inicie la calculadora, aparezca en el centro de la pantalla
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CalcPanel = new javax.swing.JLabel();
        Button7 = new javax.swing.JButton();
        Button8 = new javax.swing.JButton();
        Button9 = new javax.swing.JButton();
        Button4 = new javax.swing.JButton();
        Button5 = new javax.swing.JButton();
        Button6 = new javax.swing.JButton();
        Button1 = new javax.swing.JButton();
        Button2 = new javax.swing.JButton();
        Button3 = new javax.swing.JButton();
        Button0 = new javax.swing.JButton();
        jButtonPoint = new javax.swing.JButton();
        ButtonClear = new javax.swing.JButton();
        ButtonMinus = new javax.swing.JButton();
        ButtonDiv = new javax.swing.JButton();
        ButtonPlus = new javax.swing.JButton();
        ButtonMult = new javax.swing.JButton();
        ButtonEquals = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        CalcPanel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        CalcPanel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        CalcPanel.setOpaque(true);

        Button7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Button7.setText("7");
        Button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button7ActionPerformed(evt);
            }
        });

        Button8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Button8.setText("8");
        Button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button8ActionPerformed(evt);
            }
        });

        Button9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Button9.setText("9");
        Button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button9ActionPerformed(evt);
            }
        });

        Button4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Button4.setText("4");
        Button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button4ActionPerformed(evt);
            }
        });

        Button5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Button5.setText("5");
        Button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button5ActionPerformed(evt);
            }
        });

        Button6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Button6.setText("6");
        Button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button6ActionPerformed(evt);
            }
        });

        Button1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Button1.setText("1");
        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });

        Button2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Button2.setText("2");
        Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });

        Button3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Button3.setText("3");
        Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button3ActionPerformed(evt);
            }
        });

        Button0.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Button0.setText("0");
        Button0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button0ActionPerformed(evt);
            }
        });

        jButtonPoint.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonPoint.setText(".");
        jButtonPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPointActionPerformed(evt);
            }
        });

        ButtonClear.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ButtonClear.setForeground(new java.awt.Color(255, 0, 0));
        ButtonClear.setText("C");
        ButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonClearActionPerformed(evt);
            }
        });

        ButtonMinus.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ButtonMinus.setText("-");
        ButtonMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMinusActionPerformed(evt);
            }
        });

        ButtonDiv.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ButtonDiv.setText("/");
        ButtonDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDivActionPerformed(evt);
            }
        });

        ButtonPlus.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ButtonPlus.setText("+");
        ButtonPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPlusActionPerformed(evt);
            }
        });

        ButtonMult.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ButtonMult.setText("x");
        ButtonMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMultActionPerformed(evt);
            }
        });

        ButtonEquals.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ButtonEquals.setText("=");
        ButtonEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEqualsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CalcPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Button0, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(81, 127, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ButtonMult, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ButtonDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ButtonEquals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Button7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(Button8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(Button9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Button4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(Button5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(Button6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CalcPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonMult, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Here are the events of the buttons of the calculator, it only has a click event
//Aqui estan los eventos de los botones de la calculadora, unicamente poseen eventos al ser clickkeadas
    private void Button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button6ActionPerformed
        this.CalcPanel.setText(this.CalcPanel.getText() + "6");
    }//GEN-LAST:event_Button6ActionPerformed

    private void Button0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button0ActionPerformed
        this.CalcPanel.setText(this.CalcPanel.getText() + "0");
    }//GEN-LAST:event_Button0ActionPerformed

    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1ActionPerformed
        this.CalcPanel.setText(this.CalcPanel.getText() + "1");
    }//GEN-LAST:event_Button1ActionPerformed

    private void Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button2ActionPerformed
        this.CalcPanel.setText(this.CalcPanel.getText() + "2");
    }//GEN-LAST:event_Button2ActionPerformed

    private void Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button3ActionPerformed
        this.CalcPanel.setText(this.CalcPanel.getText() + "3");
    }//GEN-LAST:event_Button3ActionPerformed

    private void Button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button4ActionPerformed
        this.CalcPanel.setText(this.CalcPanel.getText() + "4");
    }//GEN-LAST:event_Button4ActionPerformed

    private void Button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button5ActionPerformed
        this.CalcPanel.setText(this.CalcPanel.getText() + "5");
    }//GEN-LAST:event_Button5ActionPerformed

    private void Button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button7ActionPerformed
        this.CalcPanel.setText(this.CalcPanel.getText() + "7");
    }//GEN-LAST:event_Button7ActionPerformed

    private void Button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button8ActionPerformed
        this.CalcPanel.setText(this.CalcPanel.getText() + "8");
    }//GEN-LAST:event_Button8ActionPerformed

    private void Button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button9ActionPerformed
        this.CalcPanel.setText(this.CalcPanel.getText() + "9");
    }//GEN-LAST:event_Button9ActionPerformed

    private void ButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonClearActionPerformed
        this.CalcPanel.setText("");
    }//GEN-LAST:event_ButtonClearActionPerformed

    private void ButtonPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPlusActionPerformed
        this.num1 = Float.parseFloat(this.CalcPanel.getText());
        this.opertator = "+";
        this.CalcPanel.setText("");
    }//GEN-LAST:event_ButtonPlusActionPerformed

    private void ButtonEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEqualsActionPerformed
        this.num2 = Float.parseFloat(this.CalcPanel.getText());

        switch (this.opertator) {
            case "+":
                this.CalcPanel.setText(withoutZero(this.num1 + this.num2));
                break;
            case "-":
                this.CalcPanel.setText(withoutZero(this.num1 - this.num2));
                break;
            case "x":
                this.CalcPanel.setText(withoutZero(this.num1 * this.num2));
                break;
            case "/":
                if (this.num2 == 0) {
                    this.CalcPanel.setText("");
                    showErrorMessage("Cannot divide between 0");
                    this.CalcPanel.setText("");
                }
                this.CalcPanel.setText(withoutZero(this.num1 / this.num2));
                break;
        }
    }//GEN-LAST:event_ButtonEqualsActionPerformed

    private void ButtonMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMinusActionPerformed
        this.num1 = Float.parseFloat(this.CalcPanel.getText());
        this.opertator = "-";
        this.CalcPanel.setText("");
    }//GEN-LAST:event_ButtonMinusActionPerformed

    private void ButtonMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMultActionPerformed
        this.num1 = Float.parseFloat(this.CalcPanel.getText());
        this.opertator = "x";
        this.CalcPanel.setText("");
    }//GEN-LAST:event_ButtonMultActionPerformed

    private void ButtonDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDivActionPerformed
        this.num1 = Float.parseFloat(this.CalcPanel.getText());
        this.opertator = "/";
        this.CalcPanel.setText("");
    }//GEN-LAST:event_ButtonDivActionPerformed

    private void jButtonPointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPointActionPerformed
        if (!(this.CalcPanel.getText().contains("."))) {
            this.CalcPanel.setText(this.CalcPanel.getText() + ".");
        }
    }//GEN-LAST:event_jButtonPointActionPerformed
    //This public is used for when a result is a whole number, it doesent appear with their decimals
    //Este public es usado para cuando un resultado es un numero entero, no aparezca con sus decimales
    public String withoutZero(float result) {
        String comeBack = "";

        comeBack = Float.toString(result);
        if (result % 1 == 0) {
            comeBack = comeBack.substring(0, comeBack.length() - 2);
        }

        return comeBack;
    }
    //This private is used to initialize the JOptionPane for a error Message. Its only used for when we try to divide by 0.
    //Este private es usado para inicializar el JOptionPane para un mensaje de error. Solo es usado cuando uno intenta dividir entre 0.
    private static void showErrorMessage(String Message) {
        JOptionPane.showMessageDialog(null, Message, "ERROR", JOptionPane.ERROR_MESSAGE);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button0;
    private javax.swing.JButton Button1;
    private javax.swing.JButton Button2;
    private javax.swing.JButton Button3;
    private javax.swing.JButton Button4;
    private javax.swing.JButton Button5;
    private javax.swing.JButton Button6;
    private javax.swing.JButton Button7;
    private javax.swing.JButton Button8;
    private javax.swing.JButton Button9;
    private javax.swing.JButton ButtonClear;
    private javax.swing.JButton ButtonDiv;
    private javax.swing.JButton ButtonEquals;
    private javax.swing.JButton ButtonMinus;
    private javax.swing.JButton ButtonMult;
    private javax.swing.JButton ButtonPlus;
    private javax.swing.JLabel CalcPanel;
    private javax.swing.JButton jButtonPoint;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

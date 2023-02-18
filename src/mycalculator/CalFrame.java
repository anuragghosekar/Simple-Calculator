package mycalculator;

import java.awt.event.ActionEvent;

public class CalFrame extends javax.swing.JFrame {

    private String operator;
    private String firstNo;

    public CalFrame() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        sevenButton = new javax.swing.JButton();
        eightButton = new javax.swing.JButton();
        nineButton = new javax.swing.JButton();
        divideButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        fourButton = new javax.swing.JButton();
        fiveButton = new javax.swing.JButton();
        sixButton = new javax.swing.JButton();
        multiplyButton = new javax.swing.JButton();
        perButton = new javax.swing.JButton();
        oneButton = new javax.swing.JButton();
        twoButton = new javax.swing.JButton();
        threeButton = new javax.swing.JButton();
        minusButton = new javax.swing.JButton();
        rootButton = new javax.swing.JButton();
        decimalButton = new javax.swing.JButton();
        zeroButton = new javax.swing.JButton();
        doubleZeroButton = new javax.swing.JButton();
        plusButton = new javax.swing.JButton();
        equalsButton = new javax.swing.JButton();
        displayButton = new javax.swing.JPanel();
        displayField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("My Calculator");
        setBackground(new java.awt.Color(102, 102, 102));
        setName(""); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setLayout(new java.awt.GridLayout(4, 5, 10, 10));

        sevenButton.setBackground(new java.awt.Color(153, 153, 153));
        sevenButton.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        sevenButton.setText("7");
        sevenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenButtonActionPerformed(evt);
            }
        });
        jPanel1.add(sevenButton);

        eightButton.setBackground(new java.awt.Color(153, 153, 153));
        eightButton.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        eightButton.setText("8");
        eightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightButtonActionPerformed(evt);
            }
        });
        jPanel1.add(eightButton);

        nineButton.setBackground(new java.awt.Color(153, 153, 153));
        nineButton.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        nineButton.setText("9");
        nineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineButtonActionPerformed(evt);
            }
        });
        jPanel1.add(nineButton);

        divideButton.setBackground(new java.awt.Color(153, 153, 255));
        divideButton.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        divideButton.setText("/");
        divideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideButtonActionPerformed(evt);
            }
        });
        jPanel1.add(divideButton);

        jPanel2.setLayout(new java.awt.GridLayout(2, 0, 0, 10));

        backButton.setBackground(new java.awt.Color(255, 102, 102));
        backButton.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        backButton.setText("<--");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel2.add(backButton);

        clearButton.setBackground(new java.awt.Color(255, 102, 102));
        clearButton.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        clearButton.setText("AC");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        jPanel2.add(clearButton);

        jPanel1.add(jPanel2);

        fourButton.setBackground(new java.awt.Color(153, 153, 153));
        fourButton.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        fourButton.setText("4");
        fourButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourButtonActionPerformed(evt);
            }
        });
        jPanel1.add(fourButton);

        fiveButton.setBackground(new java.awt.Color(153, 153, 153));
        fiveButton.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        fiveButton.setText("5");
        fiveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveButtonActionPerformed(evt);
            }
        });
        jPanel1.add(fiveButton);

        sixButton.setBackground(new java.awt.Color(153, 153, 153));
        sixButton.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        sixButton.setText("6");
        sixButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixButtonActionPerformed(evt);
            }
        });
        jPanel1.add(sixButton);

        multiplyButton.setBackground(new java.awt.Color(153, 153, 255));
        multiplyButton.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        multiplyButton.setText("*");
        multiplyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyButtonActionPerformed(evt);
            }
        });
        jPanel1.add(multiplyButton);

        perButton.setBackground(new java.awt.Color(153, 153, 255));
        perButton.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        perButton.setText("%");
        perButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perButtonActionPerformed(evt);
            }
        });
        jPanel1.add(perButton);

        oneButton.setBackground(new java.awt.Color(153, 153, 153));
        oneButton.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        oneButton.setText("1");
        oneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneButtonActionPerformed(evt);
            }
        });
        jPanel1.add(oneButton);

        twoButton.setBackground(new java.awt.Color(153, 153, 153));
        twoButton.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        twoButton.setText("2");
        twoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoButtonActionPerformed(evt);
            }
        });
        jPanel1.add(twoButton);

        threeButton.setBackground(new java.awt.Color(153, 153, 153));
        threeButton.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        threeButton.setText("3");
        threeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeButtonActionPerformed(evt);
            }
        });
        jPanel1.add(threeButton);

        minusButton.setBackground(new java.awt.Color(153, 153, 255));
        minusButton.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        minusButton.setText("-");
        minusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusButtonActionPerformed(evt);
            }
        });
        jPanel1.add(minusButton);

        rootButton.setBackground(new java.awt.Color(153, 153, 255));
        rootButton.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        rootButton.setText("√");
        rootButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rootButtonActionPerformed(evt);
            }
        });
        jPanel1.add(rootButton);

        decimalButton.setBackground(new java.awt.Color(153, 153, 153));
        decimalButton.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        decimalButton.setText(".");
        decimalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decimalButtonActionPerformed(evt);
            }
        });
        jPanel1.add(decimalButton);

        zeroButton.setBackground(new java.awt.Color(153, 153, 153));
        zeroButton.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        zeroButton.setText("0");
        zeroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroButtonActionPerformed(evt);
            }
        });
        jPanel1.add(zeroButton);

        doubleZeroButton.setBackground(new java.awt.Color(153, 153, 153));
        doubleZeroButton.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        doubleZeroButton.setText("00");
        doubleZeroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doubleZeroButtonActionPerformed(evt);
            }
        });
        jPanel1.add(doubleZeroButton);

        plusButton.setBackground(new java.awt.Color(153, 153, 255));
        plusButton.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        plusButton.setText("+");
        plusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusButtonActionPerformed(evt);
            }
        });
        jPanel1.add(plusButton);

        equalsButton.setBackground(new java.awt.Color(153, 153, 255));
        equalsButton.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        equalsButton.setText("=");
        equalsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalsButtonActionPerformed(evt);
            }
        });
        jPanel1.add(equalsButton);

        displayButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        displayButton.setLayout(new java.awt.GridLayout(1, 1));

        displayField.setEditable(false);
        displayField.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        displayField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        displayField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayFieldActionPerformed(evt);
            }
        });
        displayField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                displayFieldKeyTyped(evt);
            }
        });
        displayButton.add(displayField);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(displayButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(displayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void eightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightButtonActionPerformed
        setNo(evt);
    }//GEN-LAST:event_eightButtonActionPerformed

    private void zeroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroButtonActionPerformed
        setNo(evt);
    }//GEN-LAST:event_zeroButtonActionPerformed

    private void doubleZeroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doubleZeroButtonActionPerformed
        setNo(evt);
    }//GEN-LAST:event_doubleZeroButtonActionPerformed

    private void oneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneButtonActionPerformed
        setNo(evt);
    }//GEN-LAST:event_oneButtonActionPerformed

    private void twoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoButtonActionPerformed
        setNo(evt);
    }//GEN-LAST:event_twoButtonActionPerformed

    private void threeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeButtonActionPerformed
        setNo(evt);
    }//GEN-LAST:event_threeButtonActionPerformed

    private void fourButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourButtonActionPerformed
        setNo(evt);
    }//GEN-LAST:event_fourButtonActionPerformed

    private void fiveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveButtonActionPerformed
        setNo(evt);
    }//GEN-LAST:event_fiveButtonActionPerformed

    private void sixButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixButtonActionPerformed
        setNo(evt);
    }//GEN-LAST:event_sixButtonActionPerformed

    private void sevenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenButtonActionPerformed
        setNo(evt);
    }//GEN-LAST:event_sevenButtonActionPerformed

    private void nineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineButtonActionPerformed
        setNo(evt);
    }//GEN-LAST:event_nineButtonActionPerformed

    private void divideButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideButtonActionPerformed
        setOperator(evt);
    }//GEN-LAST:event_divideButtonActionPerformed

    private void multiplyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyButtonActionPerformed
        setOperator(evt);
    }//GEN-LAST:event_multiplyButtonActionPerformed

    private void minusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusButtonActionPerformed
        setOperator(evt);
    }//GEN-LAST:event_minusButtonActionPerformed

    private void plusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusButtonActionPerformed
        setOperator(evt);
    }//GEN-LAST:event_plusButtonActionPerformed

    private void rootButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rootButtonActionPerformed

        try {
            long no =Long.parseLong(displayField.getText());
            displayField.setText(Math.sqrt(no) + "");
        }
        catch(NumberFormatException ex) {
            float no =Float.parseFloat(displayField.getText());
            displayField.setText(Math.sqrt(no) + "");
        }
    }//GEN-LAST:event_rootButtonActionPerformed

    private void perButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perButtonActionPerformed

    try {
        if(firstNo.isEmpty() || displayField.getText().isEmpty())
        {
        }
        else
        {
            float fno=Float.parseFloat(firstNo);
            float sno=Float.parseFloat(displayField.getText());
            
            if(operator.equals("*"))
            {
                displayField.setText((fno*sno/100) + "");
            }
        }
    }
    catch (NumberFormatException ex)
    {
        System.out.println(ex);
    }
    }//GEN-LAST:event_perButtonActionPerformed

    private void displayFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_displayFieldActionPerformed

    private void displayFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_displayFieldKeyTyped

        char ch=evt.getKeyChar();
        if(!Character.isDigit(ch))
        {
            evt.setKeyChar('\0');   // \0=null character
        }
    }//GEN-LAST:event_displayFieldKeyTyped

    private void equalsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalsButtonActionPerformed

        try {
            long fno=Long.parseLong(firstNo);
            long sno=Long.parseLong(displayField.getText());
            
                if (operator.equals("+")) {
                    displayField.setText((fno + sno) + "");
                }
                else if (operator.equals("-")) {
                    displayField.setText((fno - sno) + "");
                }

                else if (operator.equals("/")) {
                    displayField.setText(((fno * 1.0) / (sno * 1.0) + ""));
                }
                else if (operator.equals("*")) {
                    displayField.setText(fno * sno + "");
                }
            }
        catch (NumberFormatException ex)
        {
            float fno = Float.parseFloat(firstNo);
            float sno=Float.parseFloat(displayField.getText());
            
                if (operator.equals("+")) {
                    displayField.setText((fno + sno) + "");
                }
                else if (operator.equals("-")) {
                    displayField.setText((fno - sno) + "");
                }

                else if (operator.equals("/")) {
                    displayField.setText(((fno * 1.0) / (sno * 1.0) + ""));
                }
                else if (operator.equals("*")) {
                    displayField.setText(fno * sno + "");
                }
    }//GEN-LAST:event_equalsButtonActionPerformed
    }
    private void decimalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decimalButtonActionPerformed
     
            if (!displayField.getText().isEmpty() && !displayField.getText().contains("."))
            {
                 displayField.setText(displayField.getText() + ".");
            }
    }//GEN-LAST:event_decimalButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        
         firstNo= "";
        operator="";
        displayField.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed

           if(displayField.getText().length()!=0)
   {
       displayField.setText(displayField.getText().substring(0, displayField.getText().length()-1));
   }
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton decimalButton;
    private javax.swing.JPanel displayButton;
    private javax.swing.JTextField displayField;
    private javax.swing.JButton divideButton;
    private javax.swing.JButton doubleZeroButton;
    private javax.swing.JButton eightButton;
    private javax.swing.JButton equalsButton;
    private javax.swing.JButton fiveButton;
    private javax.swing.JButton fourButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton minusButton;
    private javax.swing.JButton multiplyButton;
    private javax.swing.JButton nineButton;
    private javax.swing.JButton oneButton;
    private javax.swing.JButton perButton;
    private javax.swing.JButton plusButton;
    private javax.swing.JButton rootButton;
    private javax.swing.JButton sevenButton;
    private javax.swing.JButton sixButton;
    private javax.swing.JButton threeButton;
    private javax.swing.JButton twoButton;
    private javax.swing.JButton zeroButton;
    // End of variables declaration//GEN-END:variables

    private void setNo(ActionEvent evt) {
        String strNo = evt.getActionCommand();

        String beforeNo = displayField.getText();

        if (beforeNo.equals("0") && strNo.equals("0")) {
            strNo = "";
        }
        if (beforeNo.startsWith("0") && !beforeNo.contains(".")) {
            beforeNo = "";
        }
        if (beforeNo.isEmpty() && strNo.equals("00")) {
            strNo = "0";
        }
        displayField.setText(beforeNo + strNo);
    }

    private void setOperator(ActionEvent evt) {
        String beforeNo = displayField.getText();

        if (!beforeNo.isEmpty()) {
            operator = evt.getActionCommand();
            firstNo = beforeNo;
            beforeNo = "";
            displayField.setText(beforeNo);
        }
    }
}



 
   

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc01;

import java.util.HashSet;

/**
 *
 * @author ZNR
 */
public class Calc_GUI extends javax.swing.JFrame {
    double num1;
    String ope;
            
   
    public Calc_GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        display_lbl = new javax.swing.JLabel();
        back_btn = new javax.swing.JButton();
        num1_btn = new javax.swing.JButton();
        num7_btn = new javax.swing.JButton();
        num5_btn = new javax.swing.JButton();
        num8_btn = new javax.swing.JButton();
        num4_btn = new javax.swing.JButton();
        decimal_btn = new javax.swing.JButton();
        num3_btn = new javax.swing.JButton();
        num6_btn = new javax.swing.JButton();
        num2_btn = new javax.swing.JButton();
        num0_btn = new javax.swing.JButton();
        subract_btn = new javax.swing.JButton();
        num9_btn = new javax.swing.JButton();
        add_btn = new javax.swing.JButton();
        equal_btn = new javax.swing.JButton();
        devide_btn = new javax.swing.JButton();
        multiply_btn = new javax.swing.JButton();
        clear_btn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        display_lbl.setBackground(new java.awt.Color(255, 255, 255));
        display_lbl.setFont(new java.awt.Font("Trebuchet MS", 1, 42)); // NOI18N
        display_lbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        back_btn.setFont(new java.awt.Font("Trebuchet MS", 1, 32)); // NOI18N
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });

        num1_btn.setFont(new java.awt.Font("Trebuchet MS", 1, 32)); // NOI18N
        num1_btn.setText("1");
        num1_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num1_btnActionPerformed(evt);
            }
        });

        num7_btn.setFont(new java.awt.Font("Trebuchet MS", 1, 32)); // NOI18N
        num7_btn.setText("7");
        num7_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num7_btnActionPerformed(evt);
            }
        });

        num5_btn.setFont(new java.awt.Font("Trebuchet MS", 1, 32)); // NOI18N
        num5_btn.setText("5");
        num5_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num5_btnActionPerformed(evt);
            }
        });

        num8_btn.setFont(new java.awt.Font("Trebuchet MS", 1, 32)); // NOI18N
        num8_btn.setText("8");
        num8_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num8_btnActionPerformed(evt);
            }
        });

        num4_btn.setFont(new java.awt.Font("Trebuchet MS", 1, 32)); // NOI18N
        num4_btn.setText("4");
        num4_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num4_btnActionPerformed(evt);
            }
        });

        decimal_btn.setFont(new java.awt.Font("Trebuchet MS", 1, 32)); // NOI18N
        decimal_btn.setText(".");
        decimal_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decimal_btnActionPerformed(evt);
            }
        });

        num3_btn.setFont(new java.awt.Font("Trebuchet MS", 1, 32)); // NOI18N
        num3_btn.setText("3");
        num3_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num3_btnActionPerformed(evt);
            }
        });

        num6_btn.setFont(new java.awt.Font("Trebuchet MS", 1, 32)); // NOI18N
        num6_btn.setText("6");
        num6_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num6_btnActionPerformed(evt);
            }
        });

        num2_btn.setFont(new java.awt.Font("Trebuchet MS", 1, 32)); // NOI18N
        num2_btn.setText("2");
        num2_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num2_btnActionPerformed(evt);
            }
        });

        num0_btn.setFont(new java.awt.Font("Trebuchet MS", 1, 32)); // NOI18N
        num0_btn.setText("0");
        num0_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num0_btnActionPerformed(evt);
            }
        });

        subract_btn.setFont(new java.awt.Font("Trebuchet MS", 1, 32)); // NOI18N
        subract_btn.setText("-");
        subract_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subract_btnActionPerformed(evt);
            }
        });

        num9_btn.setFont(new java.awt.Font("Trebuchet MS", 1, 32)); // NOI18N
        num9_btn.setText("9");
        num9_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num9_btnActionPerformed(evt);
            }
        });

        add_btn.setFont(new java.awt.Font("Trebuchet MS", 1, 32)); // NOI18N
        add_btn.setText("+");
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });

        equal_btn.setFont(new java.awt.Font("Trebuchet MS", 1, 32)); // NOI18N
        equal_btn.setText("=");
        equal_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equal_btnActionPerformed(evt);
            }
        });

        devide_btn.setFont(new java.awt.Font("Trebuchet MS", 1, 32)); // NOI18N
        devide_btn.setText("/");
        devide_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devide_btnActionPerformed(evt);
            }
        });

        multiply_btn.setFont(new java.awt.Font("Trebuchet MS", 1, 32)); // NOI18N
        multiply_btn.setText("*");
        multiply_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiply_btnActionPerformed(evt);
            }
        });

        clear_btn1.setFont(new java.awt.Font("Trebuchet MS", 1, 32)); // NOI18N
        clear_btn1.setText("C");
        clear_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_btn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(display_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(num7_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(num8_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(clear_btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(devide_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(multiply_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(num9_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(subract_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(num4_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(num5_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(num6_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(num1_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(num2_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(num0_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(num3_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(decimal_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(equal_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(display_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(devide_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(clear_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(multiply_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num7_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num8_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num9_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subract_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num6_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num5_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num4_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(equal_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(num2_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(num3_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(num1_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(num0_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(decimal_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subract_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subract_btnActionPerformed
   num1 = Double.valueOf(display_lbl.getText());
         display_lbl.setText("");
         ope = "-";
    }//GEN-LAST:event_subract_btnActionPerformed

    private void num9_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num9_btnActionPerformed
    display_lbl.setText(display_lbl.getText()+"9");
    }//GEN-LAST:event_num9_btnActionPerformed

    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
        num1 = Double.valueOf(display_lbl.getText());
         display_lbl.setText("");
         ope = "+";
    }//GEN-LAST:event_add_btnActionPerformed

    private void equal_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equal_btnActionPerformed
        if (ope.equals("+")) {
           double num2 = Double.valueOf(display_lbl.getText()); 
           double ans = num1 + num2;
           display_lbl.setText(String.valueOf(ans));
           
        }else if (ope.equals("-")) {
             double num2 = Double.valueOf(display_lbl.getText()); 
           double ans = num1 - num2;
           display_lbl.setText(String.valueOf(ans));
        }else if (ope.equals("*")) {
             double num2 = Double.valueOf(display_lbl.getText()); 
           double ans = num1 * num2;
           display_lbl.setText(String.valueOf(ans));
        }else if (ope.equals("/")) {
             double num2 = Double.valueOf(display_lbl.getText()); 
           double ans = num1 / num2;
           display_lbl.setText(String.valueOf(ans));
        }
    }//GEN-LAST:event_equal_btnActionPerformed

    private void devide_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devide_btnActionPerformed
   num1 = Double.valueOf(display_lbl.getText());
         display_lbl.setText("");
         ope = "/";
    }//GEN-LAST:event_devide_btnActionPerformed

    private void multiply_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiply_btnActionPerformed
   num1 = Double.valueOf(display_lbl.getText());
         display_lbl.setText("");
         ope = "*";
    }//GEN-LAST:event_multiply_btnActionPerformed

    private void num6_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num6_btnActionPerformed
     display_lbl.setText(display_lbl.getText()+"6");
    }//GEN-LAST:event_num6_btnActionPerformed

    private void num1_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num1_btnActionPerformed
  display_lbl.setText(display_lbl.getText()+"1");
        
    }//GEN-LAST:event_num1_btnActionPerformed

    private void num2_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num2_btnActionPerformed
   display_lbl.setText(display_lbl.getText()+"2");
    }//GEN-LAST:event_num2_btnActionPerformed

    private void num3_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num3_btnActionPerformed
    display_lbl.setText(display_lbl.getText()+"3");
    }//GEN-LAST:event_num3_btnActionPerformed

    private void num4_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num4_btnActionPerformed
    display_lbl.setText(display_lbl.getText()+"4");
    }//GEN-LAST:event_num4_btnActionPerformed

    private void num5_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num5_btnActionPerformed
   display_lbl.setText(display_lbl.getText()+"5");
    }//GEN-LAST:event_num5_btnActionPerformed

    private void num7_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num7_btnActionPerformed
   display_lbl.setText(display_lbl.getText()+"7");
    }//GEN-LAST:event_num7_btnActionPerformed

    private void num8_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num8_btnActionPerformed
    display_lbl.setText(display_lbl.getText()+"8");
    }//GEN-LAST:event_num8_btnActionPerformed

    private void num0_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num0_btnActionPerformed
    display_lbl.setText(display_lbl.getText()+"0");
    }//GEN-LAST:event_num0_btnActionPerformed

    private void decimal_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decimal_btnActionPerformed
   display_lbl.setText(display_lbl.getText()+".");
    }//GEN-LAST:event_decimal_btnActionPerformed

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
 
    }//GEN-LAST:event_back_btnActionPerformed

    private void clear_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_btn1ActionPerformed
      display_lbl.setText("");
    }//GEN-LAST:event_clear_btn1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calc_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calc_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calc_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calc_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calc_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_btn;
    private javax.swing.JButton back_btn;
    private javax.swing.JButton clear_btn1;
    private javax.swing.JButton decimal_btn;
    private javax.swing.JButton devide_btn;
    private javax.swing.JLabel display_lbl;
    private javax.swing.JButton equal_btn;
    private javax.swing.JButton multiply_btn;
    private javax.swing.JButton num0_btn;
    private javax.swing.JButton num1_btn;
    private javax.swing.JButton num2_btn;
    private javax.swing.JButton num3_btn;
    private javax.swing.JButton num4_btn;
    private javax.swing.JButton num5_btn;
    private javax.swing.JButton num6_btn;
    private javax.swing.JButton num7_btn;
    private javax.swing.JButton num8_btn;
    private javax.swing.JButton num9_btn;
    private javax.swing.JButton subract_btn;
    // End of variables declaration//GEN-END:variables
}


package cbtis270.programacion.eventos;

import java.awt.Color;
import Gasolina.Regular;
import Gasolina.Premium;
import Gasolina.Diesel;

public class gasolinera extends javax.swing.JFrame {

 

    public gasolinera() {
      
        initComponents();
        this.getContentPane().setBackground(Color.gray);
      jLabel3.setVisible(false);
      jButton3.setVisible(false);
      jLabel3.setVisible(false);
      jTextField4.setVisible(false);
       jTextField3.setVisible(false);
       jLabel4.setVisible(false);
      jTextField5.setVisible(false);
       
        
    }
    
    dollar d = new dollar();
    euro e = new euro();
    Diesel diesel = new Diesel(23.58f);
    Premium premium = new Premium(22.87f);
    Regular regular = new Regular(21.88f);
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblRegular = new javax.swing.JLabel();
        lblPremium = new javax.swing.JLabel();
        lblDiesel = new javax.swing.JLabel();
        lblR = new javax.swing.JLabel();
        lblP = new javax.swing.JLabel();
        lblD = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblDollar = new javax.swing.JLabel();
        lblPesos = new javax.swing.JLabel();
        lblEuros = new javax.swing.JLabel();
        lblEsc = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GASOLINERA : ERRORS");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Escoge el tipo de gasolina:");

        lblRegular.setText("1:Regular");
        lblRegular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegularMouseClicked(evt);
            }
        });

        lblPremium.setText("2:Premium");
        lblPremium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPremiumMouseClicked(evt);
            }
        });

        lblDiesel.setText("3:Diesel ");
        lblDiesel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDieselMouseClicked(evt);
            }
        });

        lblR.setText("21.88");

        lblP.setText("22.87");

        lblD.setText("23.58");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Ingresa la cantidad de litros:");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Su total en pesos es:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Su cambio en pesos es:");

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jButton1.setText("Confirmar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Confirmar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Selecciona el tipo de pago:");

        lblDollar.setText("Dollar");
        lblDollar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDollarMouseClicked(evt);
            }
        });

        lblPesos.setText("Pesos");
        lblPesos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPesosMouseClicked(evt);
            }
        });

        lblEuros.setText("Euros");
        lblEuros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEurosMouseClicked(evt);
            }
        });

        jTextField3.setEditable(false);

        jTextField4.setEditable(false);

        jButton3.setText("confirmar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextField5.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPesos, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblRegular, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(40, 40, 40)
                                    .addComponent(lblR, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lblDiesel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblD, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lblPremium, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(lblP, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(62, 62, 62)
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3))
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEsc, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11)
                            .addComponent(jLabel9)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(19, 19, 19)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDollar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEuros, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(154, 154, 154)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                    .addComponent(jTextField5))))
                        .addGap(193, 193, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegular, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPremium, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDiesel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblD, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEsc, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(19, 19, 19)
                .addComponent(lblPesos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lblDollar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(lblEuros, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(22, 22, 22)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblRegularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegularMouseClicked

 jTextField3.setVisible(true);
 lblRegular.setVisible(false);
 lblPremium.setVisible(false);
 lblP.setVisible(false);
 lblR.setVisible(false); 
 lblDiesel.setVisible(false);
  lblD.setVisible(false);
jTextField3.setText(jTextField3.getText()+ regular.getvalor()); 
 lblEsc.setText(lblEsc.getText()+ "el tipo de gasolina es:    Regular"+"\n" ); 
 
 
 
 
 
// TODO add your handling code here:
    }//GEN-LAST:event_lblRegularMouseClicked

    private void lblPremiumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPremiumMouseClicked

jTextField3.setVisible(true);
 lblRegular.setVisible(false);
 lblPremium.setVisible(false);
 lblP.setVisible(false);
 lblR.setVisible(false); 
 lblDiesel.setVisible(false);
  lblD.setVisible(false);
 
   jTextField3.setText(jTextField3.getText()+ premium.getvalor()); 
lblEsc.setText(lblEsc.getText()+ "el tipo de gasolina es"+ "\n:");
lblEsc.setText(lblEsc.getText() + "Premium"+"\n");
    }//GEN-LAST:event_lblPremiumMouseClicked

    private void lblDieselMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDieselMouseClicked
jTextField3.setVisible(true);
lblRegular.setVisible(false);
 lblPremium.setVisible(false);
 lblP.setVisible(false);
 lblR.setVisible(false); 
 lblDiesel.setVisible(false);
  lblD.setVisible(false);
   jTextField3.setText(jTextField3.getText()+ diesel.getvalor()); 
 lblEsc.setText(lblEsc.getText()+ "el tipo de gasolina es"+"\n:" ); 
  lblEsc.setText(lblEsc.getText()+"Diesel"+"\n"  );
    }//GEN-LAST:event_lblDieselMouseClicked

    private void lblPesosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPesosMouseClicked
      lblDollar.setVisible(false);
      lblEuros.setVisible(false);
       jButton3.setVisible(true);
        jButton2.setVisible(false);
        jLabel10.setText(jLabel10.getText()+ "Ingresa el pago en pesos:"+ "\n" );
// TODO add your handling code here:
    }//GEN-LAST:event_lblPesosMouseClicked

    private void lblDollarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDollarMouseClicked
jLabel4.setVisible(true);
      jTextField5.setVisible(true);
        jLabel3.setVisible(true);
      jTextField4.setVisible(true);
    
jLabel3.setVisible(true);
 jTextField4.setText(jTextField4.getText()+ d.getvalord());
 lblPesos.setVisible(false);
 lblEuros.setVisible(false);   
 jLabel4.setText(jLabel4.getText()+ "su total en dolares es:"+ "\n" ); 
 jLabel3.setText(jLabel3.getText()+ "el valor del dolar en pesos es:"+ "\n" ); 
 jLabel10.setText(jLabel10.getText()+ "Ingresa el pago en dolares:"+ "\n" );
 Double divicion = Double.parseDouble(jTextArea1.getText()) / Double.parseDouble(jTextField4.getText());
 String multi = String.valueOf(divicion);
        int index = multi.indexOf(".");
        
        String enteros = multi.substring(0, index);
        
        String preDecimales = multi.substring(index, multi.length());
        String decimales = preDecimales.substring(0, 3);
 jTextField5.setText(jTextField5.getText()+ enteros + decimales);
 
// TODO add your handling code here:
    }//GEN-LAST:event_lblDollarMouseClicked

    private void lblEurosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEurosMouseClicked
jLabel4.setVisible(true);
      jTextField5.setVisible(true);
     
     
jTextField4.setVisible(true);
jTextField4.setText(jTextField4.getText()+ e.getvalore());
jLabel3.setVisible(true);
lblPesos.setVisible(false);
lblDollar.setVisible(false);      
 jLabel4.setText(jLabel4.getText()+ "su total en euros es:"+ "\n" ); 
jLabel3.setText(jLabel3.getText()+ "el valor del euro en pesos es:"+ "\n" ); 
jLabel10.setText(jLabel10.getText()+ "Ingresa el pago en euros:"+ "\n" );
Double divicion = Double.parseDouble(jTextArea1.getText()) / Double.parseDouble(jTextField4.getText());
 String multi = String.valueOf(divicion);
        int index = multi.indexOf(".");
        
        String enteros = multi.substring(0, index);
        
        String preDecimales = multi.substring(index, multi.length());
        String decimales = preDecimales.substring(0, 3);
 jTextField5.setText(jTextField5.getText()+ enteros + decimales);
// TODO add your handling code here:
    }//GEN-LAST:event_lblEurosMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 Double multiplicacion;
        multiplicacion = Double.parseDouble(jTextField1.getText()) * Double.parseDouble(jTextField3.getText()); 
        String multi = String.valueOf(multiplicacion);
        int index = multi.indexOf(".");
        
        String enteros = multi.substring(0, index);
        
        String preDecimales = multi.substring(index, multi.length());
        String decimales = preDecimales.substring(0, 3);
        
        jTextArea1.setText(jTextArea1.getText() + enteros + decimales);  
     
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
Double cambio;
        cambio= Double.parseDouble(jTextField2.getText()) * Double.parseDouble(jTextField4.getText()) - Double.parseDouble(jTextArea1.getText()); 
        String cam = String.valueOf(cambio);
        int index = cam.indexOf(".");
        
        String enteros = cam.substring(0, index);
        
        String preDecimales =cam.substring(index, cam.length());
        String decimales = preDecimales.substring(0, 3);
        
          jTextArea2.setText(jTextArea2.getText()+ enteros + decimales); 
          
          
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       Double cambio;
        cambio= Double.parseDouble(jTextField2.getText()) - Double.parseDouble(jTextArea1.getText()); 
         String cam = String.valueOf(cambio);
        int index = cam.indexOf(".");
        
        String enteros = cam.substring(0, index);
        
        String preDecimales =cam.substring(index, cam.length());
        String decimales = preDecimales.substring(0, 3);
        
          jTextArea2.setText(jTextArea2.getText()+ enteros + decimales);  // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(gasolinera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gasolinera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gasolinera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gasolinera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gasolinera().setVisible(true);
            }
        });
       
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel lblD;
    private javax.swing.JLabel lblDiesel;
    private javax.swing.JLabel lblDollar;
    private javax.swing.JLabel lblEsc;
    private javax.swing.JLabel lblEuros;
    private javax.swing.JLabel lblP;
    private javax.swing.JLabel lblPesos;
    private javax.swing.JLabel lblPremium;
    private javax.swing.JLabel lblR;
    private javax.swing.JLabel lblRegular;
    // End of variables declaration//GEN-END:variables
}

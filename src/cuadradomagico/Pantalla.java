/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadradomagico;


import javax.swing.JOptionPane;

/**
 *
 * @author Allan
 */
public class Pantalla extends javax.swing.JFrame {

       
       boolean bandera1;

       Logica log = new Logica();

       public Pantalla() {
              initComponents();
       }

       public void validar(java.awt.event.KeyEvent evt, javax.swing.JTextField c) {
              bandera1 = false;
              char caracter = evt.getKeyChar();
              if (c.getText().length() == 1) {          ///Validacion cantidad de digitos
                     evt.consume();
                     bandera1 = true;
              }
              if (((caracter < '1')
                      || (caracter > '9'))
                      && (caracter != evt.VK_BACK_SPACE)) {    ///validacion ingreso solo numeros y que que sea del 1 al 9
                     evt.consume();
                     bandera1 = true;
              }

       }



       public void ingresoDatos(int a, int b, java.awt.event.KeyEvent evt, javax.swing.JTextField c) {
              int x = 0;
              int n = 0;
              boolean bandera2 = false;

              int y = evt.getKeyCode();
              if (y == 8) {                                    // reconocer tecla de retroceso o borrar, para remplazar numero por un 0 en la matriz 
                     log.indatos(a, b, 0);
              } else {
                     if(bandera1==false){
                     if (c.getText() != null) {

                            x = Integer.parseInt(c.getText());
                            n = x;                                                  //  Parcear  contenido del texfield y enviar para  evaluacion
                            bandera2 = log.matriz(a, b, n);
                     }

                     if (bandera2 == true) {                   
                            c.setText("");                     /// limpiar la casilla si se repite el numero ingresado

                     } else {
                            log.indatos(a, b, n);              // guardar el numero ingresado si no se repite
                     }
                     }
              }

              mostrarSuma();
       }

       public void mostrarSuma() {
              log.sumas();
             int arrResC[] =log.getArrResC();
             int arrResF[] =log.getArrResF();
             int arrResD[] =log.getArrResD();
              r1.setText("" + arrResF[0]);
              r2.setText("" + arrResF[1]);
              r3.setText("" + arrResF[2]);
              r4.setText("" + arrResD[0]);                             //// actualiza las casillas de resultado
              r5.setText("" + arrResC[2]);
              r6.setText("" + arrResC[1]);
              r7.setText("" + arrResC[0]);
              r8.setText("" + arrResD[1]);
              boolean win = log.sumaTotal();                   ///  verificar si es ganador del juego
              if (win == true) {
                     int dialogResult = JOptionPane.showConfirmDialog(rootPane, "Felicidades has ganado!!!!..." + "\n" + "Quieres salir o¿ jugar nuevamente? ");
                     if (dialogResult == JOptionPane.YES_OPTION) {
                            System.exit(0);

                     }
                     if (dialogResult == JOptionPane.NO_OPTION) {
                            limpiarCasillas();

                     }else{
                            System.exit(0);
                     }

              }
       }

       public void limpiarCasillas() {
              CuadradoMagico.main(null);                // volver a iniciar el main para tener un nuevo juego
              this.setVisible(false);
       }

       @SuppressWarnings("unchecked")
       // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
       private void initComponents() {

              jLabel1 = new javax.swing.JLabel();
              limpiar = new javax.swing.JButton();
              r1 = new javax.swing.JLabel();
              r2 = new javax.swing.JLabel();
              r3 = new javax.swing.JLabel();
              r4 = new javax.swing.JLabel();
              r5 = new javax.swing.JLabel();
              r6 = new javax.swing.JLabel();
              r7 = new javax.swing.JLabel();
              r8 = new javax.swing.JLabel();
              c1 = new javax.swing.JTextField();
              c2 = new javax.swing.JTextField();
              c3 = new javax.swing.JTextField();
              c4 = new javax.swing.JTextField();
              c5 = new javax.swing.JTextField();
              c6 = new javax.swing.JTextField();
              c7 = new javax.swing.JTextField();
              c8 = new javax.swing.JTextField();
              c9 = new javax.swing.JTextField();
              jScrollPane1 = new javax.swing.JScrollPane();
              jTextArea1 = new javax.swing.JTextArea();

              setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
              getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

              jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
              jLabel1.setForeground(new java.awt.Color(198, 132, 66));
              jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
              jLabel1.setText("Cuadrado Magico");
              jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0)));
              getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 132, 36));

              limpiar.setBackground(new java.awt.Color(231, 231, 155));
              limpiar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
              limpiar.setForeground(new java.awt.Color(198, 132, 66));
              limpiar.setText("Limpiar");
              limpiar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0)));
              limpiar.addActionListener(new java.awt.event.ActionListener() {
                     public void actionPerformed(java.awt.event.ActionEvent evt) {
                            limpiarActionPerformed(evt);
                     }
              });
              getContentPane().add(limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 102, 36));

              r1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
              r1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
              r1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
              getContentPane().add(r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 30, 30));

              r2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
              r2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
              r2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
              getContentPane().add(r2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 30, 30));

              r3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
              r3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
              r3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
              getContentPane().add(r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 30, 30));

              r4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
              r4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
              r4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
              getContentPane().add(r4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 30, 30));

              r5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
              r5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
              r5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
              getContentPane().add(r5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 30, 30));

              r6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
              r6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
              r6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
              getContentPane().add(r6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 30, 30));

              r7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
              r7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
              r7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
              getContentPane().add(r7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 30, 30));

              r8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
              r8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
              r8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
              getContentPane().add(r8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 30, 30));

              c1.setBackground(new java.awt.Color(231, 172, 87));
              c1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
              c1.setForeground(new java.awt.Color(231, 231, 155));
              c1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
              c1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0)));
              c1.addKeyListener(new java.awt.event.KeyAdapter() {
                     public void keyReleased(java.awt.event.KeyEvent evt) {
                            c1KeyReleased(evt);
                     }
                     public void keyTyped(java.awt.event.KeyEvent evt) {
                            c1KeyTyped(evt);
                     }
              });
              getContentPane().add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 70, 70));

              c2.setBackground(new java.awt.Color(231, 231, 155));
              c2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
              c2.setForeground(new java.awt.Color(231, 172, 87));
              c2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
              c2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0)));
              c2.addKeyListener(new java.awt.event.KeyAdapter() {
                     public void keyReleased(java.awt.event.KeyEvent evt) {
                            c2KeyReleased(evt);
                     }
                     public void keyTyped(java.awt.event.KeyEvent evt) {
                            c2KeyTyped(evt);
                     }
              });
              getContentPane().add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 70, 70));

              c3.setBackground(new java.awt.Color(231, 172, 87));
              c3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
              c3.setForeground(new java.awt.Color(231, 231, 155));
              c3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
              c3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0)));
              c3.addKeyListener(new java.awt.event.KeyAdapter() {
                     public void keyReleased(java.awt.event.KeyEvent evt) {
                            c3KeyReleased(evt);
                     }
                     public void keyTyped(java.awt.event.KeyEvent evt) {
                            c3KeyTyped(evt);
                     }
              });
              getContentPane().add(c3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 70, 70));

              c4.setBackground(new java.awt.Color(231, 231, 155));
              c4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
              c4.setForeground(new java.awt.Color(231, 172, 87));
              c4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
              c4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0)));
              c4.addKeyListener(new java.awt.event.KeyAdapter() {
                     public void keyReleased(java.awt.event.KeyEvent evt) {
                            c4KeyReleased(evt);
                     }
                     public void keyTyped(java.awt.event.KeyEvent evt) {
                            c4KeyTyped(evt);
                     }
              });
              getContentPane().add(c4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 70, 70));

              c5.setBackground(new java.awt.Color(231, 172, 87));
              c5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
              c5.setForeground(new java.awt.Color(231, 231, 155));
              c5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
              c5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0)));
              c5.addKeyListener(new java.awt.event.KeyAdapter() {
                     public void keyReleased(java.awt.event.KeyEvent evt) {
                            c5KeyReleased(evt);
                     }
                     public void keyTyped(java.awt.event.KeyEvent evt) {
                            c5KeyTyped(evt);
                     }
              });
              getContentPane().add(c5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 70, 70));

              c6.setBackground(new java.awt.Color(231, 231, 155));
              c6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
              c6.setForeground(new java.awt.Color(231, 172, 87));
              c6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
              c6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0)));
              c6.addKeyListener(new java.awt.event.KeyAdapter() {
                     public void keyReleased(java.awt.event.KeyEvent evt) {
                            c6KeyReleased(evt);
                     }
                     public void keyTyped(java.awt.event.KeyEvent evt) {
                            c6KeyTyped(evt);
                     }
              });
              getContentPane().add(c6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 70, 70));

              c7.setBackground(new java.awt.Color(231, 172, 87));
              c7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
              c7.setForeground(new java.awt.Color(231, 231, 155));
              c7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
              c7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0)));
              c7.addKeyListener(new java.awt.event.KeyAdapter() {
                     public void keyReleased(java.awt.event.KeyEvent evt) {
                            c7KeyReleased(evt);
                     }
                     public void keyTyped(java.awt.event.KeyEvent evt) {
                            c7KeyTyped(evt);
                     }
              });
              getContentPane().add(c7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 70, 70));

              c8.setBackground(new java.awt.Color(231, 231, 155));
              c8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
              c8.setForeground(new java.awt.Color(231, 172, 87));
              c8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
              c8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0)));
              c8.addKeyListener(new java.awt.event.KeyAdapter() {
                     public void keyReleased(java.awt.event.KeyEvent evt) {
                            c8KeyReleased(evt);
                     }
                     public void keyTyped(java.awt.event.KeyEvent evt) {
                            c8KeyTyped(evt);
                     }
              });
              getContentPane().add(c8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 70, 70));

              c9.setBackground(new java.awt.Color(231, 172, 87));
              c9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
              c9.setForeground(new java.awt.Color(231, 231, 155));
              c9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
              c9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0)));
              c9.addKeyListener(new java.awt.event.KeyAdapter() {
                     public void keyReleased(java.awt.event.KeyEvent evt) {
                            c9KeyReleased(evt);
                     }
                     public void keyTyped(java.awt.event.KeyEvent evt) {
                            c9KeyTyped(evt);
                     }
              });
              getContentPane().add(c9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 70, 70));

              jTextArea1.setEditable(false);
              jTextArea1.setBackground(new java.awt.Color(231, 231, 155));
              jTextArea1.setColumns(20);
              jTextArea1.setRows(5);
              jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 0), 4));
              jScrollPane1.setViewportView(jTextArea1);

              getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 380));

              pack();
       }// </editor-fold>//GEN-END:initComponents
              //// para cada precion de una tecla  envia a validacion el evento
       private void c1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c1KeyTyped

              validar(evt, c1);

       }//GEN-LAST:event_c1KeyTyped

       private void c2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c2KeyTyped
 
              validar(evt, c2);
       }//GEN-LAST:event_c2KeyTyped

       private void c3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c3KeyTyped

              validar(evt, c3);
       }//GEN-LAST:event_c3KeyTyped

       private void c4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c4KeyTyped
              validar(evt, c4);
       }//GEN-LAST:event_c4KeyTyped

       private void c6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c6KeyTyped
              validar(evt, c6);
       }//GEN-LAST:event_c6KeyTyped

       private void c7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c7KeyTyped
              validar(evt, c7);
       }//GEN-LAST:event_c7KeyTyped

       private void c8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c8KeyTyped
              validar(evt, c8);
       }//GEN-LAST:event_c8KeyTyped

       private void c9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c9KeyTyped
              validar(evt, c9);
       }//GEN-LAST:event_c9KeyTyped
                     
       private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
              limpiarCasillas();
       }//GEN-LAST:event_limpiarActionPerformed

       private void c5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c5KeyTyped
              validar(evt, c5);
       }//GEN-LAST:event_c5KeyTyped
                     ///key released ya que se ejecuta despues de el keytype
       private void c1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c1KeyReleased
              
              ingresoDatos(0, 0, evt, c1);
               System.out.println(c1.getX()+" "+c2.getY());
       }//GEN-LAST:event_c1KeyReleased

       private void c2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c2KeyReleased
              ingresoDatos(0, 1, evt, c2);
              
              
              System.out.println(c2.getX()+" "+c2.getY());
              
       }//GEN-LAST:event_c2KeyReleased

       private void c3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c3KeyReleased
              ingresoDatos(0, 2, evt, c3);
               System.out.println(c3.getX()+" "+c3.getY());
       }//GEN-LAST:event_c3KeyReleased

       private void c4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c4KeyReleased
              ingresoDatos(1, 0, evt, c4);
               System.out.println(c4.getX()+" "+c4.getY());
       }//GEN-LAST:event_c4KeyReleased

       private void c5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c5KeyReleased
              ingresoDatos(1, 1, evt, c5);
              System.out.println(c5.getX()+" "+c5.getY());
       }//GEN-LAST:event_c5KeyReleased

       private void c6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c6KeyReleased
              ingresoDatos(1, 2, evt, c6);
              System.out.println(c6.getX()+" "+c6.getY());
       }//GEN-LAST:event_c6KeyReleased

       private void c7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c7KeyReleased
              ingresoDatos(2, 0, evt, c7);
              System.out.println(c7.getX()+" "+c7.getY());
       }//GEN-LAST:event_c7KeyReleased

       private void c8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c8KeyReleased
              ingresoDatos(2, 1, evt, c8);
              System.out.println(c8.getX()+" "+c8.getY());
       }//GEN-LAST:event_c8KeyReleased

       private void c9KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c9KeyReleased
              ingresoDatos(2, 2, evt, c9);
              System.out.println(c9.getX()+" "+c9.getY());
       }//GEN-LAST:event_c9KeyReleased

       /**
        * @param args the command line arguments
        */
       public static void main(String args[]) {
              /*
               * Set the Nimbus look and feel
               */
              //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
               * If Nimbus (introduced in Java SE 6) is not available, stay with
               * the default look and feel. For details see
               * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
               */
              try {
                     for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                            if ("Nimbus".equals(info.getName())) {
                                   javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                   break;

                            }
                     }
              } catch (ClassNotFoundException ex) {
                     java.util.logging.Logger.getLogger(Pantalla.class
                             .getName()).log(java.util.logging.Level.SEVERE, null, ex);
              } catch (InstantiationException ex) {
                     java.util.logging.Logger.getLogger(Pantalla.class
                             .getName()).log(java.util.logging.Level.SEVERE, null, ex);
              } catch (IllegalAccessException ex) {
                     java.util.logging.Logger.getLogger(Pantalla.class
                             .getName()).log(java.util.logging.Level.SEVERE, null, ex);
              } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                     java.util.logging.Logger.getLogger(Pantalla.class
                             .getName()).log(java.util.logging.Level.SEVERE, null, ex);
              }
              //</editor-fold>
              //</editor-fold>

              /*
               * Create and display the form
               */
              java.awt.EventQueue.invokeLater(new Runnable() {
                     public void run() {
                            new Pantalla().setVisible(true);

                     }

              });
       }

       // Variables declaration - do not modify//GEN-BEGIN:variables
       private javax.swing.JTextField c1;
       private javax.swing.JTextField c2;
       private javax.swing.JTextField c3;
       private javax.swing.JTextField c4;
       private javax.swing.JTextField c5;
       private javax.swing.JTextField c6;
       private javax.swing.JTextField c7;
       private javax.swing.JTextField c8;
       private javax.swing.JTextField c9;
       private javax.swing.JLabel jLabel1;
       private javax.swing.JScrollPane jScrollPane1;
       private javax.swing.JTextArea jTextArea1;
       private javax.swing.JButton limpiar;
       private javax.swing.JLabel r1;
       private javax.swing.JLabel r2;
       private javax.swing.JLabel r3;
       private javax.swing.JLabel r4;
       private javax.swing.JLabel r5;
       private javax.swing.JLabel r6;
       private javax.swing.JLabel r7;
       private javax.swing.JLabel r8;
       // End of variables declaration//GEN-END:variables
}

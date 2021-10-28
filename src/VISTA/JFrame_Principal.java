package VISTA;

public class JFrame_Principal extends javax.swing.JFrame {

    JDialog_Agregar_Contactos objDial = new JDialog_Agregar_Contactos(this, true);
    
    public JFrame_Principal() {
        initComponents();
        setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        mnu_Salir = new javax.swing.JMenu();
        mnit_Contactos1 = new javax.swing.JMenuItem();
        mnu_Mantenimiento = new javax.swing.JMenu();
        mnit_Contactos = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mnu_Salir.setText("Archivo");
        mnu_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_SalirActionPerformed(evt);
            }
        });

        mnit_Contactos1.setText("Salir");
        mnit_Contactos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnit_Contactos1ActionPerformed(evt);
            }
        });
        mnu_Salir.add(mnit_Contactos1);

        jMenuBar2.add(mnu_Salir);

        mnu_Mantenimiento.setText("Mantenimiento");

        mnit_Contactos.setText("Contactos");
        mnit_Contactos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnit_ContactosActionPerformed(evt);
            }
        });
        mnu_Mantenimiento.add(mnit_Contactos);

        jMenuBar2.add(mnu_Mantenimiento);

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar2.add(jMenu1);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnit_ContactosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnit_ContactosActionPerformed
        dispose();
        objDial.setVisible(true);
    }//GEN-LAST:event_mnit_ContactosActionPerformed

    private void mnit_Contactos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnit_Contactos1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnit_Contactos1ActionPerformed

    private void mnu_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_SalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnu_SalirActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem mnit_Contactos;
    private javax.swing.JMenuItem mnit_Contactos1;
    private javax.swing.JMenu mnu_Mantenimiento;
    private javax.swing.JMenu mnu_Salir;
    // End of variables declaration//GEN-END:variables
}

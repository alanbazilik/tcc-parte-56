/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Sistemas_login.utilitarios;

/**
 *
 * @author Alanbazilio
 */
public class rua extends javax.swing.JFrame {

    /**
     * Creates new form cidade
     */
    public rua() {
        initComponents();
         utilitarios u = new utilitarios();
    u.inserirIcone(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tela_princial = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        estados = new javax.swing.JTextField();
        jSplitPane2 = new javax.swing.JSplitPane();
        excluir = new javax.swing.JButton();
        Alterar = new javax.swing.JButton();
        jSplitPane1 = new javax.swing.JSplitPane();
        cradastrar = new javax.swing.JButton();
        salvar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setFocusCycleRoot(false);
        setMaximumSize(new java.awt.Dimension(650, 320));
        setMinimumSize(new java.awt.Dimension(650, 320));
        setPreferredSize(new java.awt.Dimension(650, 320));
        setSize(new java.awt.Dimension(650, 320));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tela cadastro Rua");

        tela_princial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-reserva-64.png"))); // NOI18N
        tela_princial.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tela_princial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tela_princialMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 215, Short.MAX_VALUE)
                .addComponent(tela_princial)
                .addGap(188, 188, 188))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(tela_princial, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 813, 59);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Rua:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 100, 100, 25);

        estados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadosActionPerformed(evt);
            }
        });
        getContentPane().add(estados);
        estados.setBounds(80, 100, 160, 20);

        excluir.setText("desativar");
        jSplitPane2.setLeftComponent(excluir);

        Alterar.setText("Alterar");
        jSplitPane2.setRightComponent(Alterar);

        getContentPane().add(jSplitPane2);
        jSplitPane2.setBounds(10, 230, 180, 49);

        cradastrar.setText("cradastrar");
        jSplitPane1.setLeftComponent(cradastrar);

        salvar.setText("salvar");
        jSplitPane1.setRightComponent(salvar);

        getContentPane().add(jSplitPane1);
        jSplitPane1.setBounds(10, 180, 180, 51);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/thumb2-program-code-black-backgrounds-programming-background-with-program-code-code.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 60, 340, 240);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(340, 60, 300, 240);

        setSize(new java.awt.Dimension(645, 308));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tela_princialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tela_princialMouseClicked
        // TODO add your handling code here:
        Tela_principal objtel = new Tela_principal();
        objtel.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tela_princialMouseClicked

    private void estadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estadosActionPerformed

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
            java.util.logging.Logger.getLogger(rua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rua().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Alterar;
    private javax.swing.JButton cradastrar;
    private javax.swing.JTextField estados;
    private javax.swing.JButton excluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton salvar;
    private javax.swing.JLabel tela_princial;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import CTR.TelefoneTipoCTR;
import Sistemas_login.utilitarios;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alanbazilio
 */
public class tela_tipotelefone extends javax.swing.JFrame {

    /**
     * Creates new form tela_tipotelefone
     */
     ResultSet rsfunc;
   tela_tipotelefone objtel;
       public static int id_tel;
   
    String opcao;
     public static boolean button;
     int a = 1;
    public tela_tipotelefone() {
        initComponents();
        pesquisartel();
        desativarBotoes();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jttipostel = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        tipotel = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        busca = new javax.swing.JButton();
        cradastrar = new javax.swing.JButton();
        Alterar = new javax.swing.JButton();
        salvar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(599, 269));
        setMinimumSize(new java.awt.Dimension(599, 269));
        setPreferredSize(new java.awt.Dimension(599, 269));
        setSize(new java.awt.Dimension(599, 269));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("cradastro tipo telefone");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(449, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 817, 59);

        jttipostel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jttipostel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jttipostel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jttipostelMouseClicked(evt);
            }
        });
        jttipostel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jttipostelKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jttipostel);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(220, 60, 380, 210);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nome tipo de telefone:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 50, 200, 50);
        getContentPane().add(tipotel);
        tipotel.setBounds(0, 90, 220, 30);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "a????es"));

        busca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
        busca.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        busca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaActionPerformed(evt);
            }
        });

        cradastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/addition.png"))); // NOI18N
        cradastrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        cradastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cradastrarActionPerformed(evt);
            }
        });

        Alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alterar (1).png"))); // NOI18N
        Alterar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarActionPerformed(evt);
            }
        });

        salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salvar.png"))); // NOI18N
        salvar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar (1).png"))); // NOI18N
        excluir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cradastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(busca, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(salvar)
                    .addComponent(cradastrar)
                    .addComponent(busca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Alterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(excluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 140, 170, 110);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/thumb2-program-code-black-backgrounds-programming-background-with-program-code-code.jpg"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(813, 300));
        jLabel2.setMinimumSize(new java.awt.Dimension(813, 300));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 60, 1050, 240);

        setSize(new java.awt.Dimension(615, 308));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cradastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cradastrarActionPerformed
        // TODO add your handling code here:
        ativarBotoes();
        limparCampos();
        opcao = "Inserir";
        button = true;
    }//GEN-LAST:event_cradastrarActionPerformed

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        // TODO add your handling code here:
         if(opcao.equals("Inserir")){
       Inserirtel();
       pesquisartel();
       limparCampos();
       }
        desativarBotoes();
    }//GEN-LAST:event_salvarActionPerformed

    private void buscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaActionPerformed
        pesquisartel();
    }//GEN-LAST:event_buscaActionPerformed

    private void AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarActionPerformed
        Alterartel();
        pesquisartel();
    }//GEN-LAST:event_AlterarActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
        // TODO add your handling code here:
          String [] options = new String[] {"Sim","N??o"};

        Object ret = JOptionPane.showOptionDialog
        (null, "Tem certeza que deseja excluir: "
            + tipotel.getText() + "?","AVISO", JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        if(options[Integer.valueOf(ret.toString())].equals("Sim"))
        {
            Excluirtel();
            limparCampos();
        }
    }//GEN-LAST:event_excluirActionPerformed

    private void jttipostelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jttipostelKeyPressed
           int linha = jttipostel.getSelectedRow();
            
           
            this.tipotel.setText((String) jttipostel.getValueAt(linha, 1));
            id_tel = (int) jttipostel.getValueAt(linha, 0);
            opcao="Alterar";
            ativarBotoes();
    }//GEN-LAST:event_jttipostelKeyPressed

    private void jttipostelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jttipostelMouseClicked
        
          if(evt.getClickCount() == 2)
        {
            int linha = jttipostel.getSelectedRow();
            
       
            this.tipotel.setText((String) jttipostel.getValueAt(linha, 0));
           
            
            tela_tipotelefone.button = 
           (boolean) jttipostel.getValueAt(linha, 0);
                    
            this.dispose();
        }
    }//GEN-LAST:event_jttipostelMouseClicked

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
            java.util.logging.Logger.getLogger(tela_tipotelefone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_tipotelefone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_tipotelefone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_tipotelefone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_tipotelefone().setVisible(true);
            }
        });
    }
public void desativarBotoes()
    {
        salvar.setEnabled(false);
        tipotel.setEnabled(false);
    }
    
    public void ativarBotoes()
    {
        salvar.setEnabled(true);
        tipotel.setEnabled(true);
    }
    
 public void Inserirtel()
    {
        TelefoneTipoCTR objfunc = new TelefoneTipoCTR();
        
        objfunc.InseretelCTR(tipotel.getText());
    }
  public void limparCampos()
    {
    tipotel.setText("");
    }
  
  public void pesquisartel()
    {
         TelefoneTipoCTR objfunc = new TelefoneTipoCTR();
        rsfunc = objfunc.PesquisartelCTR(tipotel.getText());
        
        preenche_item();
        
    }
 public void Alterartel()
    {
      
        int linha = jttipostel.getSelectedRow();
        
        TelefoneTipoCTR objcli = new TelefoneTipoCTR();
        
        objcli.AlteratelCTR(tipotel.getText(),id_tel);
    }     
  
  public void preenche_item()
    {
     String [] colunas = {"Codigo","Nome"};
        
        String [][] linhas ={};
        
        DefaultTableModel tablemodel = new DefaultTableModel(linhas,colunas)
        {
            public boolean CelulaEditavel(int rowIndex, int mColIndex)
            {
                return true;
            }
        };
        
        Vector <Vector> dados = new Vector();
        
        try {
            while(rsfunc.next())
            {
                Vector regVetor = new Vector();
                
                regVetor.add(rsfunc.getInt("codtipotel"));
                regVetor.add(rsfunc.getString("nometipotel"));
                dados.add(regVetor);
                tablemodel.addRow(regVetor);
            }
            jttipostel.setModel(tablemodel);
            
        } catch (SQLException ex) {
            Logger.getLogger(Bairros.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         
    }
     public void Excluirtel()
    {
      int linha = jttipostel.getSelectedRow();
        
        TelefoneTipoCTR objcli = new TelefoneTipoCTR();
        
        objcli.ExcluitelCTR(id_tel);
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Alterar;
    private javax.swing.JButton busca;
    private javax.swing.JButton cradastrar;
    private javax.swing.JButton excluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jttipostel;
    private javax.swing.JButton salvar;
    private javax.swing.JTextField tipotel;
    // End of variables declaration//GEN-END:variables
}

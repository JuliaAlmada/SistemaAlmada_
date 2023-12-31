/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.JoaProduto;
import dao.ProdutoDAO;
import java.util.List;
import tools.Util;
import view.JDlgFuncionariosNovoIA;
import view.ProdutosControle;

/**
 *
 * @author User
 */
public class JDlgProdutoNovo extends javax.swing.JDialog {
  
    JDlgProdutoNovoIA jDlgProdutoNovoIA;
     JDlgFuncionariosNovoIA jDlgFuncionariosNovoIA;
     ProdutoDAO produtoDAO;
     ProdutosControle produtoControle;
     JoaProduto produto;
    /**
     * Creates new form JDlgProdutoNovo
     */
    public JDlgProdutoNovo(java.awt.Frame parent, boolean modal) {
         super(parent, modal);
        initComponents();
        setTitle("Cadastro de Produtos");
        setLocationRelativeTo(null);
        
       jDlgProdutoNovoIA = new JDlgProdutoNovoIA(null, true);
        produtoControle = new ProdutosControle();
        produtoDAO = new ProdutoDAO();
        List lista = produtoDAO.listAll();
        produtoControle.setList(lista);
       jTable1.setModel(produtoControle);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is alway02s
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        joa_jBtnIncluir = new javax.swing.JButton();
        joa_jBtnAlterar = new javax.swing.JButton();
        joa_jBtnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        joa_jBtnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/incluir.png"))); // NOI18N
        joa_jBtnIncluir.setText("incluir");
        joa_jBtnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joa_jBtnIncluirActionPerformed(evt);
            }
        });
        jPanel1.add(joa_jBtnIncluir);

        joa_jBtnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alterar_1.png"))); // NOI18N
        joa_jBtnAlterar.setText("alterar");
        joa_jBtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joa_jBtnAlterarActionPerformed(evt);
            }
        });
        jPanel1.add(joa_jBtnAlterar);

        joa_jBtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Excluir_1.png"))); // NOI18N
        joa_jBtnExcluir.setText("excluir");
        joa_jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joa_jBtnExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(joa_jBtnExcluir);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void joa_jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jBtnIncluirActionPerformed
        // TODO add your handling code here:
       jDlgProdutoNovoIA.setTitle("Inclusão");
       jDlgProdutoNovoIA.setVisible(true);
       List lista= produtoDAO.listAll();
       produtoControle.setList(lista);
       jTable1.setModel(produtoControle);
    }//GEN-LAST:event_joa_jBtnIncluirActionPerformed

    private void joa_jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jBtnAlterarActionPerformed
        // TODO add your handling code here:
     jDlgProdutoNovoIA.setTitle("Alteração");
      int sel = jTable1.getSelectedRow();
      produto = produtoControle.getBean(sel);
      jDlgProdutoNovoIA.beanView(produto);
      
       List lista = produtoDAO.listAll();
          produtoControle.setList(lista);
          
       jDlgProdutoNovoIA.setVisible(true);
    }//GEN-LAST:event_joa_jBtnAlterarActionPerformed

    private void joa_jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jBtnExcluirActionPerformed
        // TODO add your handling code here:
       if (Util.perguntar("Deseja excluir o Produto?") == true){
           int sel = jTable1.getSelectedRow();
           produto = produtoControle.getBean(sel);
           produtoDAO.delete(produto);
           //atulizar lista no jtable
           List lista = produtoDAO.listAll();
           produtoControle.setList(lista);
        } else{
           Util.mensagem("Exclusão cancelada");
        }
         List lista = produtoDAO.listAll();
        produtoControle.setList(lista);
       jTable1.setModel(produtoControle);
    }//GEN-LAST:event_joa_jBtnExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgProdutoNovo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgProdutoNovo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgProdutoNovo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgProdutoNovo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgProdutoNovo dialog = new JDlgProdutoNovo(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton joa_jBtnAlterar;
    private javax.swing.JButton joa_jBtnExcluir;
    private javax.swing.JButton joa_jBtnIncluir;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.JoaProduto;
import bean.JoaVendaProduto;
import dao.ProdutoDAO;
import dao.VendaProdutoDAO;

import java.util.List;
import javax.swing.JOptionPane;
import tools.Util;

/**
 *
 * @author User
 */
public class JDlgIAoProduto_Vendas extends javax.swing.JDialog {

    /**
     * Creates new form JDlgInclusaoProduto_Venda
     */
    public JDlgIAoProduto_Vendas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    
       
        setLocationRelativeTo(null);

     /*   ProdutoDAO produtos_DAO = new ProdutoDAO();
        List lista = produtos_DAO.listAll();
        for (int i = 0; i < lista.size(); i++) {
            JoaProduto joaProduto= (JoaProduto) lista.get(i);
            jCboProdutos.addItem(joaProduto);
        }*/
    }

    public void desabilitar() {
        joa_jFmtTotal.setEnabled(false);

    }

   
  /*  public Vendas_produtos viewBean() {
        Vendas_produtos vendas_produtos = new Vendas_produtos();
        double unitario = Double.parseDouble(jFmtUnitario.getText());
        vendas_produtos.setProduto(jCboProdutos.getSelectedIndex());
        vendas_produtos.setValorUnitario(unitario);
        return vendas_produtos;
    }

    public void beanView(Vendas_produtos vendas_produtos) {
        jTxtQuantidade.setText(vendas_produtos.getQuantidade());
        jCboProdutos.setSelectedIndex(vendas_produtos.getProduto());
        jFmtUnitario.setText(String.valueOf(vendas_produtos.getValorUnitario()));
    }*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        joa_jCboProdutos = new javax.swing.JComboBox<JoaProduto>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        joa_jTxtQuantidade = new javax.swing.JTextField();
        joa_jFmtTotal = new javax.swing.JFormattedTextField();
        joa_jFmtUnitario = new javax.swing.JFormattedTextField();
        joa_jBtnCancelar = new javax.swing.JButton();
        joa_jBtnConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        joa_jCboProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joa_jCboProdutosActionPerformed(evt);
            }
        });

        jLabel1.setText("Produto");

        jLabel2.setText("Quantidade");

        jLabel3.setText("Valor Unitario");

        jLabel4.setText("Total");

        joa_jTxtQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joa_jTxtQuantidadeActionPerformed(evt);
            }
        });

        joa_jFmtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joa_jFmtTotalActionPerformed(evt);
            }
        });

        joa_jFmtUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joa_jFmtUnitarioActionPerformed(evt);
            }
        });

        joa_jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar.png"))); // NOI18N
        joa_jBtnCancelar.setText("Cancelar");
        joa_jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joa_jBtnCancelarActionPerformed(evt);
            }
        });

        joa_jBtnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gravar.png"))); // NOI18N
        joa_jBtnConfirmar.setText("Confirmar");
        joa_jBtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joa_jBtnConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(joa_jTxtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(joa_jFmtUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(joa_jFmtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(joa_jBtnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(joa_jBtnCancelar)
                        .addGap(134, 134, 134))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(221, 221, 221))))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(joa_jCboProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(joa_jCboProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(joa_jTxtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(joa_jFmtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(joa_jFmtUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(joa_jBtnCancelar)
                    .addComponent(joa_jBtnConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void joa_jTxtQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jTxtQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_joa_jTxtQuantidadeActionPerformed

    private void joa_jFmtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jFmtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_joa_jFmtTotalActionPerformed

    private void joa_jFmtUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jFmtUnitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_joa_jFmtUnitarioActionPerformed

    private void joa_jCboProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jCboProdutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_joa_jCboProdutosActionPerformed

    private void joa_jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jBtnCancelarActionPerformed
        // TODO add your handling code here:
       
       Util.mensagem("Cancelamento concluido");
        setVisible(false);
    }//GEN-LAST:event_joa_jBtnCancelarActionPerformed

    private void joa_jBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jBtnConfirmarActionPerformed
        // TODO add your handling code here:
       /* Vendas_produtos vendas_produtos = viewBean();
        Vendas_produtos_DAO vendas_produtos_DAO = new Vendas_produtos_DAO();
        vendas_produtos_DAO.insert(vendas_produtos);
       
        limparCampos();*/
        setVisible(false);
    }//GEN-LAST:event_joa_jBtnConfirmarActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgIAoProduto_Vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgIAoProduto_Vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgIAoProduto_Vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgIAoProduto_Vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgIAoProduto_Vendas dialog = new JDlgIAoProduto_Vendas(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton joa_jBtnCancelar;
    private javax.swing.JButton joa_jBtnConfirmar;
    private javax.swing.JComboBox<JoaProduto> joa_jCboProdutos;
    private javax.swing.JFormattedTextField joa_jFmtTotal;
    private javax.swing.JFormattedTextField joa_jFmtUnitario;
    private javax.swing.JTextField joa_jTxtQuantidade;
    // End of variables declaration//GEN-END:variables
}

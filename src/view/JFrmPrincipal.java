/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import query.JDlgConsultaFuncionarios;
import query.JDlgConsultaProduto;
import query.JDlgConsultaUsuarios;
import query.JDlgVendasConsultas;



/**
 *
 * @author u49558987859
 */
public class JFrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JFrmPrincipal
     */
    public JFrmPrincipal() {
        initComponents();
        setTitle("Sistema de Compra e Vendas de Jogos");
        setExtendedState(MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
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
        jSeparator6 = new javax.swing.JToolBar.Separator();
        joa_toolbarVendas = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        joa_toolbarFuncionarios = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        joa_toolbarClientes = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        joa_toolbarProduto = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMnuCadastros = new javax.swing.JMenu();
        jMnuClientes = new javax.swing.JMenuItem();
        jMnuUsuarios = new javax.swing.JMenuItem();
        jMnuFuncionarios = new javax.swing.JMenuItem();
        jMnuProduto = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMnuSair = new javax.swing.JMenuItem();
        jMenuMovimentos = new javax.swing.JMenu();
        jMnuVendas = new javax.swing.JMenuItem();
        jMenuMovimentos1 = new javax.swing.JMenu();
        jMnuConsUsuarios = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jSeparator6);

        joa_toolbarVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sale_icon-icons.com_51018.png"))); // NOI18N
        joa_toolbarVendas.setFocusable(false);
        joa_toolbarVendas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        joa_toolbarVendas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        joa_toolbarVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joa_toolbarVendasActionPerformed(evt);
            }
        });
        jPanel1.add(joa_toolbarVendas);
        jPanel1.add(jSeparator2);
        jPanel1.add(jSeparator7);

        joa_toolbarFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/customer-service_icon-icons.com_51012.png"))); // NOI18N
        joa_toolbarFuncionarios.setFocusable(false);
        joa_toolbarFuncionarios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        joa_toolbarFuncionarios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        joa_toolbarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joa_toolbarFuncionariosActionPerformed(evt);
            }
        });
        jPanel1.add(joa_toolbarFuncionarios);
        jPanel1.add(jSeparator5);

        joa_toolbarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/person_user_customer_man_male_man_boy_people_1687.png"))); // NOI18N
        joa_toolbarClientes.setFocusable(false);
        joa_toolbarClientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        joa_toolbarClientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        joa_toolbarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joa_toolbarClientesActionPerformed(evt);
            }
        });
        jPanel1.add(joa_toolbarClientes);
        jPanel1.add(jSeparator3);

        joa_toolbarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/GS_icon-icons.com_66597.png"))); // NOI18N
        joa_toolbarProduto.setFocusable(false);
        joa_toolbarProduto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        joa_toolbarProduto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        joa_toolbarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joa_toolbarProdutoActionPerformed(evt);
            }
        });
        jPanel1.add(joa_toolbarProduto);
        jPanel1.add(jSeparator4);

        jMnuCadastros.setMnemonic('A');
        jMnuCadastros.setText("Cadastros");

        jMnuClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMnuClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cliente_1.png"))); // NOI18N
        jMnuClientes.setMnemonic('C');
        jMnuClientes.setText("Clientes");
        jMnuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuClientesActionPerformed(evt);
            }
        });
        jMnuCadastros.add(jMnuClientes);

        jMnuUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMnuUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user_folder_20282.png"))); // NOI18N
        jMnuUsuarios.setMnemonic('U');
        jMnuUsuarios.setText("Usuarios");
        jMnuUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuUsuariosActionPerformed(evt);
            }
        });
        jMnuCadastros.add(jMnuUsuarios);

        jMnuFuncionarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMnuFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/customer-service_icon-icons.com_51012.png"))); // NOI18N
        jMnuFuncionarios.setMnemonic('F');
        jMnuFuncionarios.setText("Funcionários");
        jMnuFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuFuncionariosActionPerformed(evt);
            }
        });
        jMnuCadastros.add(jMnuFuncionarios);

        jMnuProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMnuProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/GS_icon-icons.com_66597.png"))); // NOI18N
        jMnuProduto.setMnemonic('P');
        jMnuProduto.setText("Produtos");
        jMnuProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuProdutoActionPerformed(evt);
            }
        });
        jMnuCadastros.add(jMnuProduto);
        jMnuCadastros.add(jSeparator1);

        jMnuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMnuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exit.png"))); // NOI18N
        jMnuSair.setText("Sair");
        jMnuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuSairActionPerformed(evt);
            }
        });
        jMnuCadastros.add(jMnuSair);

        jMenuBar1.add(jMnuCadastros);

        jMenuMovimentos.setMnemonic('N');
        jMenuMovimentos.setText("Movimentos");

        jMnuVendas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMnuVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sale_icon-icons.com_51018.png"))); // NOI18N
        jMnuVendas.setMnemonic('N');
        jMnuVendas.setText("Vendas");
        jMnuVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuVendasActionPerformed(evt);
            }
        });
        jMenuMovimentos.add(jMnuVendas);

        jMenuBar1.add(jMenuMovimentos);

        jMenuMovimentos1.setMnemonic('N');
        jMenuMovimentos1.setText("Consultas");

        jMnuConsUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.SHIFT_MASK));
        jMnuConsUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user_folder_20282.png"))); // NOI18N
        jMnuConsUsuarios.setText("Usuarios");
        jMnuConsUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuConsUsuariosActionPerformed(evt);
            }
        });
        jMenuMovimentos1.add(jMnuConsUsuarios);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/GS_icon-icons.com_66597.png"))); // NOI18N
        jMenuItem2.setText("Produtos");
        jMenuMovimentos1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/person_user_customer_man_male_man_boy_people_1687.png"))); // NOI18N
        jMenuItem3.setText("Clientes");
        jMenuMovimentos1.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/customer-service_icon-icons.com_51012.png"))); // NOI18N
        jMenuItem4.setText("Funcionarios");
        jMenuMovimentos1.add(jMenuItem4);

        jMenuBar1.add(jMenuMovimentos1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 322, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMnuUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuUsuariosActionPerformed
        // TODO add your handling code here:
        JDlgUsuarios jDlgUsuarios = new JDlgUsuarios(null, true);
        jDlgUsuarios.setVisible(true);
    }//GEN-LAST:event_jMnuUsuariosActionPerformed

    private void jMnuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuClientesActionPerformed
        // TODO add your handling code here:
        JDlgClientes jDlgClienteNovo = new JDlgClientes(null, true);
        jDlgClienteNovo.setVisible(true);
    }//GEN-LAST:event_jMnuClientesActionPerformed

    private void jMnuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMnuSairActionPerformed

    private void jMnuFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuFuncionariosActionPerformed
        // TODO add your handling code here:
        JDlgFuncionariosNovo jDlgFuncionariosNovo = new JDlgFuncionariosNovo(null, true);
        jDlgFuncionariosNovo.setVisible(true);
    }//GEN-LAST:event_jMnuFuncionariosActionPerformed

    private void jMnuProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuProdutoActionPerformed
        // TODO add your handling code here:
        JDlgProdutoNovo jDlgProdutoNovo = new JDlgProdutoNovo(null, true);
        jDlgProdutoNovo.setVisible(true);
    }//GEN-LAST:event_jMnuProdutoActionPerformed

    private void jMnuVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuVendasActionPerformed
        // TODO add your handling code here:
        JDlgVendas jDlgVenda = new JDlgVendas(null, true);
        jDlgVenda.setVisible(true);
    }//GEN-LAST:event_jMnuVendasActionPerformed

    private void jMnuConsUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuConsUsuariosActionPerformed
        // TODO add your handling code here:
             JDlgConsultaUsuarios jDlgConsultaUsuarios = new JDlgConsultaUsuarios(null, true);
        jDlgConsultaUsuarios.setVisible(true);
    }//GEN-LAST:event_jMnuConsUsuariosActionPerformed

    private void joa_toolbarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_toolbarProdutoActionPerformed
        // TODO add your handling code here:
         JDlgConsultaProduto jDlgProduto = new JDlgConsultaProduto(null, true);
        jDlgProduto.setVisible(true);
    }//GEN-LAST:event_joa_toolbarProdutoActionPerformed

    private void joa_toolbarVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_toolbarVendasActionPerformed
        // TODO add your handling code here:
          JDlgVendas jDlgVenda = new JDlgVendas(null, true);
          jDlgVenda.setVisible(true);
    }//GEN-LAST:event_joa_toolbarVendasActionPerformed

    private void joa_toolbarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_toolbarClientesActionPerformed
        // TODO add your handling code here:
        JDlgClientes jDlgClienteNovo = new JDlgClientes(null, true);
        jDlgClienteNovo.setVisible(true);
    }//GEN-LAST:event_joa_toolbarClientesActionPerformed

    private void joa_toolbarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_toolbarFuncionariosActionPerformed
        // TODO add your handling code here:
        JDlgConsultaFuncionarios jDlgFuncionarios = new JDlgConsultaFuncionarios(null, true);
        jDlgFuncionarios.setVisible(true);
    }//GEN-LAST:event_joa_toolbarFuncionariosActionPerformed

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
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new JFrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenu jMenuMovimentos;
    private javax.swing.JMenu jMenuMovimentos1;
    private javax.swing.JMenu jMnuCadastros;
    private javax.swing.JMenuItem jMnuClientes;
    private javax.swing.JMenuItem jMnuConsUsuarios;
    private javax.swing.JMenuItem jMnuFuncionarios;
    private javax.swing.JMenuItem jMnuProduto;
    private javax.swing.JMenuItem jMnuSair;
    private javax.swing.JMenuItem jMnuUsuarios;
    private javax.swing.JMenuItem jMnuVendas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JButton joa_toolbarClientes;
    private javax.swing.JButton joa_toolbarFuncionarios;
    private javax.swing.JButton joa_toolbarProduto;
    private javax.swing.JButton joa_toolbarVendas;
    // End of variables declaration//GEN-END:variables
}

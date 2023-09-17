/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author u49558987859
 */
public class JDlgUsuariosNovoIA extends javax.swing.JDialog {
 MaskFormatter mascaraCPF, mascaraDataNascimento;
    /**
     * Creates new form JDlgUsuariosNovoIA
     */
    public JDlgUsuariosNovoIA(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Inclusão de Usuários");
        setLocationRelativeTo(null);
         try {
            mascaraCPF = new MaskFormatter("###.###.###-##");
            mascaraDataNascimento = new MaskFormatter("##/##/####");
        } catch (ParseException ex) {
            Logger.getLogger(JDlgUsuariosNovoIA.class.getName()).log(Level.SEVERE, null, ex);
        }
        joa_jFmtCpf.setFormatterFactory(new DefaultFormatterFactory(mascaraCPF));
        joa_jFmtDataN.setFormatterFactory(new DefaultFormatterFactory(mascaraDataNascimento));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        joa_jPwfSenha = new javax.swing.JPasswordField();
        joa_jTxtCodigo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        joa_jChbAtivo = new javax.swing.JCheckBox();
        joa_jTxtNome = new javax.swing.JTextField();
        joa_jCboNivel = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        joa_jFmtCpf = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        joa_jTxtApelido = new javax.swing.JTextField();
        joa_jFmtDataN = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        joa_jBtnOk = new javax.swing.JButton();
        joa_jBtnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel7.setText("Senha");

        jLabel1.setText("Código");

        joa_jPwfSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                joa_jPwfSenhaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                joa_jPwfSenhaFocusLost(evt);
            }
        });
        joa_jPwfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joa_jPwfSenhaActionPerformed(evt);
            }
        });

        joa_jTxtCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                joa_jTxtCodigoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                joa_jTxtCodigoFocusLost(evt);
            }
        });

        jLabel8.setText("Nível");

        jLabel3.setText("Nome");

        joa_jChbAtivo.setText("Ativo");
        joa_jChbAtivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joa_jChbAtivoActionPerformed(evt);
            }
        });

        joa_jTxtNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                joa_jTxtNomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                joa_jTxtNomeFocusLost(evt);
            }
        });

        joa_jCboNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Adiministrador", "usuario" }));
        joa_jCboNivel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                joa_jCboNivelFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                joa_jCboNivelFocusLost(evt);
            }
        });

        jLabel4.setText("CPF");

        joa_jFmtCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                joa_jFmtCpfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                joa_jFmtCpfFocusLost(evt);
            }
        });

        jLabel5.setText("Apelido");

        joa_jTxtApelido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                joa_jTxtApelidoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                joa_jTxtApelidoFocusLost(evt);
            }
        });

        joa_jFmtDataN.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                joa_jFmtDataNFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                joa_jFmtDataNFocusLost(evt);
            }
        });

        jLabel6.setText("Data de nascimento");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        joa_jBtnOk.setText("OK");
        joa_jBtnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joa_jBtnOkActionPerformed(evt);
            }
        });
        jPanel1.add(joa_jBtnOk);

        joa_jBtnCancelar.setText("CANCELAR");
        joa_jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joa_jBtnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(joa_jBtnCancelar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(joa_jTxtCodigo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(joa_jTxtNome, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(joa_jTxtApelido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(joa_jFmtDataN, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(joa_jCboNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(joa_jChbAtivo))
                            .addComponent(jLabel4)
                            .addComponent(joa_jFmtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(joa_jPwfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(joa_jTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(joa_jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(joa_jTxtApelido, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(joa_jFmtDataN, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(joa_jCboNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(joa_jChbAtivo))
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(joa_jFmtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(joa_jPwfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void joa_jPwfSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_joa_jPwfSenhaFocusGained
        // TODO add your handling code here:
    
    }//GEN-LAST:event_joa_jPwfSenhaFocusGained

    private void joa_jPwfSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_joa_jPwfSenhaFocusLost
        // TODO add your handling code here:
  
    }//GEN-LAST:event_joa_jPwfSenhaFocusLost

    private void joa_jPwfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jPwfSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_joa_jPwfSenhaActionPerformed

    private void joa_jTxtCodigoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_joa_jTxtCodigoFocusGained
        // TODO add your handling code here:
     
    }//GEN-LAST:event_joa_jTxtCodigoFocusGained

    private void joa_jTxtCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_joa_jTxtCodigoFocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_joa_jTxtCodigoFocusLost

    private void joa_jChbAtivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jChbAtivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_joa_jChbAtivoActionPerformed

    private void joa_jTxtNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_joa_jTxtNomeFocusGained
  
    }//GEN-LAST:event_joa_jTxtNomeFocusGained

    private void joa_jTxtNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_joa_jTxtNomeFocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_joa_jTxtNomeFocusLost

    private void joa_jCboNivelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_joa_jCboNivelFocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_joa_jCboNivelFocusGained

    private void joa_jCboNivelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_joa_jCboNivelFocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_joa_jCboNivelFocusLost

    private void joa_jFmtCpfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_joa_jFmtCpfFocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_joa_jFmtCpfFocusGained

    private void joa_jFmtCpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_joa_jFmtCpfFocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_joa_jFmtCpfFocusLost

    private void joa_jTxtApelidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_joa_jTxtApelidoFocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_joa_jTxtApelidoFocusGained

    private void joa_jTxtApelidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_joa_jTxtApelidoFocusLost

    }//GEN-LAST:event_joa_jTxtApelidoFocusLost

    private void joa_jFmtDataNFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_joa_jFmtDataNFocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_joa_jFmtDataNFocusGained

    private void joa_jFmtDataNFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_joa_jFmtDataNFocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_joa_jFmtDataNFocusLost

    private void joa_jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jBtnCancelarActionPerformed
        setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_joa_jBtnCancelarActionPerformed

    private void joa_jBtnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jBtnOkActionPerformed
        setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_joa_jBtnOkActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgUsuariosNovoIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgUsuariosNovoIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgUsuariosNovoIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgUsuariosNovoIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgUsuariosNovoIA dialog = new JDlgUsuariosNovoIA(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton joa_jBtnCancelar;
    private javax.swing.JButton joa_jBtnOk;
    private javax.swing.JComboBox<String> joa_jCboNivel;
    private javax.swing.JCheckBox joa_jChbAtivo;
    private javax.swing.JFormattedTextField joa_jFmtCpf;
    private javax.swing.JFormattedTextField joa_jFmtDataN;
    private javax.swing.JPasswordField joa_jPwfSenha;
    private javax.swing.JTextField joa_jTxtApelido;
    private javax.swing.JTextField joa_jTxtCodigo;
    private javax.swing.JTextField joa_jTxtNome;
    // End of variables declaration//GEN-END:variables
}

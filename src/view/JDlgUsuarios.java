/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.JoaUsuario;
import dao.UsuariosDAO;
//import dao.Usuarios_DAO;
import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import tools.Util;
import view.JDlgUsuariosPesquisa;

/**
 *
 * @author u49558987859
 */
public class JDlgUsuarios extends javax.swing.JDialog {

    /**
     * Creates new form JDlgUsuarios
     */
    private boolean incluindo;
    MaskFormatter mascaraCPF, mascaraDataNascimento;
    public UsuariosDAO usuariosDAO;
    public JoaUsuario joausuarios;

    //variavel global declarada entre o construtor e a classe private boolean incluindo;
    //pode colocar em qualquer local menos no metodo
    //variável global é definida quando declaramos uma variável fora de qualquer função
    /**
     * Creates new form JDlgUsuarios
     */
    public JDlgUsuarios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        usuariosDAO = new UsuariosDAO();
        Util.habilitar(false, joa_jTxtCodigo, joa_jTxtNome, joa_jTxtApelido, joa_jFmtCpf, joa_jFmtDataN, joa_jPwfSenha, joa_jCboNivel, joa_jChbAtivo, joa_jBtnCancelar, joa_jBtnConfirmar);
        Util.habilitar(true,joa_jBtnIncluir, joa_jBtnPesquisar, joa_jBtnAlterar, joa_jBtnExcluir);
        setTitle("Cadastro de usuários");
        setLocationRelativeTo(null);
        try {
            mascaraCPF = new MaskFormatter("###.###.###-##");
            mascaraDataNascimento = new MaskFormatter("##/##/####");
        } catch (ParseException ex) {
            Logger.getLogger(JDlgUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        joa_jFmtCpf.setFormatterFactory(new DefaultFormatterFactory(mascaraCPF));
        joa_jFmtDataN.setFormatterFactory(new DefaultFormatterFactory(mascaraDataNascimento));

    }

    public JoaUsuario viewBean() {
        joausuarios = new JoaUsuario();

        /*novo jeito de converter. Apartir do Util*/
        joausuarios.setIdjoaUsuario(Util.strInt(joa_jTxtCodigo.getText()));
        joausuarios.setJoaNome(joa_jTxtNome.getText());
        joausuarios.setJoaNickname(joa_jTxtApelido.getText());
        joausuarios.setJoaDataNascimento(Util.strDate(joa_jFmtDataN.getText()));
        joausuarios.setJoaCpf(joa_jFmtCpf.getText());
        joausuarios.setJoaSenha(joa_jPwfSenha.getText());
        joausuarios.setJoaNivel(joa_jCboNivel.getSelectedIndex());
        if (joa_jChbAtivo.isSelected() == true) {
            joausuarios.setJoaAtivo("S");
        } else {
            joausuarios.setJoaAtivo("N");
        }
        return joausuarios;

    }

    public void beanView(JoaUsuario joausuarios) {

        joa_jTxtCodigo.setText(Util.intStr(joausuarios.getIdjoaUsuario()));

        joa_jFmtDataN.setText(Util.Datestr(joausuarios.getJoaDataNascimento()));
        joa_jTxtNome.setText(joausuarios.getJoaNome());
        joa_jTxtApelido.setText(joausuarios.getJoaNickname());
        joa_jFmtCpf.setText(joausuarios.getJoaCpf());
        joa_jPwfSenha.setText(joausuarios.getJoaSenha());
        joa_jCboNivel.setSelectedIndex(joausuarios.getJoaNivel());
        if (joausuarios.getJoaAtivo().equals("S") == true) {
            joa_jChbAtivo.setSelected(true);
        } else {
            joa_jChbAtivo.setSelected(false);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        joa_jTxtCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        joa_jTxtNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        joa_jFmtCpf = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        joa_jTxtApelido = new javax.swing.JTextField();
        joa_jFmtDataN = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        joa_jPwfSenha = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        joa_jChbAtivo = new javax.swing.JCheckBox();
        joa_jCboNivel = new javax.swing.JComboBox<>();
        joa_jBtnAlterar = new javax.swing.JButton();
        joa_jBtnIncluir = new javax.swing.JButton();
        joa_jBtnConfirmar = new javax.swing.JButton();
        joa_jBtnExcluir = new javax.swing.JButton();
        joa_jBtnCancelar = new javax.swing.JButton();
        joa_jBtnPesquisar = new javax.swing.JButton();

        jButton4.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Código");

        joa_jTxtCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                joa_jTxtCodigoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                joa_jTxtCodigoFocusLost(evt);
            }
        });

        jLabel3.setText("Nome");

        joa_jTxtNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                joa_jTxtNomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                joa_jTxtNomeFocusLost(evt);
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

        jLabel7.setText("Senha");

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

        jLabel8.setText("Nível");

        joa_jChbAtivo.setText("Ativo");
        joa_jChbAtivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joa_jChbAtivoActionPerformed(evt);
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

        joa_jBtnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alterar.png"))); // NOI18N
        joa_jBtnAlterar.setText("Alterar");
        joa_jBtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joa_jBtnAlterarActionPerformed(evt);
            }
        });

        joa_jBtnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/incluir_1.png"))); // NOI18N
        joa_jBtnIncluir.setText("Incluir");
        joa_jBtnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joa_jBtnIncluirActionPerformed(evt);
            }
        });

        joa_jBtnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gravar_1.png"))); // NOI18N
        joa_jBtnConfirmar.setText("Confirmar");
        joa_jBtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joa_jBtnConfirmarActionPerformed(evt);
            }
        });

        joa_jBtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Excluir.png"))); // NOI18N
        joa_jBtnExcluir.setText("Excluir");
        joa_jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joa_jBtnExcluirActionPerformed(evt);
            }
        });

        joa_jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar.png"))); // NOI18N
        joa_jBtnCancelar.setText("Cancelar");
        joa_jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joa_jBtnCancelarActionPerformed(evt);
            }
        });

        joa_jBtnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar_1.png"))); // NOI18N
        joa_jBtnPesquisar.setText("Pesquisar");
        joa_jBtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joa_jBtnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(joa_jPwfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(joa_jTxtCodigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                                .addComponent(joa_jTxtNome, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(joa_jTxtApelido, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel8)
                                            .addComponent(joa_jCboNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4)
                                            .addComponent(joa_jFmtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(joa_jFmtDataN, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(89, 89, 89)))
                                .addComponent(joa_jChbAtivo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(joa_jBtnIncluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(joa_jBtnAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(joa_jBtnExcluir)
                                .addGap(6, 6, 6)
                                .addComponent(joa_jBtnConfirmar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(joa_jBtnCancelar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(joa_jBtnPesquisar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
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
                                .addComponent(joa_jCboNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(joa_jFmtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(joa_jPwfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(joa_jChbAtivo)))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(joa_jBtnIncluir)
                    .addComponent(joa_jBtnConfirmar)
                    .addComponent(joa_jBtnExcluir)
                    .addComponent(joa_jBtnCancelar)
                    .addComponent(joa_jBtnPesquisar)
                    .addComponent(joa_jBtnAlterar))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void joa_jBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jBtnConfirmarActionPerformed
        // TODO add your handling code here:
        joausuarios = viewBean();
        // Usuarios_DAO usuarios_DAO = new Usuarios_DAO();

        if (incluindo == true) {
            usuariosDAO.insert(joausuarios);
        } else {
            usuariosDAO.update(joausuarios);
        }

        Util.limparCampos(joa_jTxtCodigo, joa_jTxtNome, joa_jTxtApelido, joa_jFmtCpf, joa_jFmtDataN, joa_jPwfSenha, joa_jCboNivel, joa_jChbAtivo);
         Util.habilitar(false, joa_jTxtCodigo, joa_jTxtNome, joa_jTxtApelido, joa_jFmtCpf, joa_jFmtDataN, joa_jPwfSenha, joa_jCboNivel, joa_jChbAtivo, joa_jBtnCancelar, joa_jBtnConfirmar);
        Util.habilitar(true,joa_jBtnIncluir, joa_jBtnPesquisar, joa_jBtnAlterar, joa_jBtnExcluir);
    }//GEN-LAST:event_joa_jBtnConfirmarActionPerformed

    private void joa_jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jBtnIncluirActionPerformed
        // TODO add your handling code here:
        incluindo = true;
        Util.habilitar(true, joa_jTxtCodigo, joa_jTxtNome, joa_jTxtApelido, joa_jFmtCpf, joa_jFmtDataN, joa_jPwfSenha, joa_jCboNivel, joa_jChbAtivo, joa_jBtnCancelar, joa_jBtnConfirmar);
        Util.habilitar(false,joa_jBtnIncluir, joa_jBtnPesquisar, joa_jBtnAlterar, joa_jBtnExcluir);
        Util.limparCampos(joa_jTxtCodigo, joa_jTxtNome, joa_jTxtApelido, joa_jFmtCpf, joa_jFmtDataN, joa_jPwfSenha, joa_jCboNivel, joa_jChbAtivo);

    }//GEN-LAST:event_joa_jBtnIncluirActionPerformed

    private void joa_jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jBtnAlterarActionPerformed
        // TODO add your handling code here:
        incluindo = false;
     Util.habilitar(false,joa_jBtnIncluir, joa_jBtnPesquisar, joa_jBtnAlterar, joa_jBtnExcluir);
    Util.habilitar(true, joa_jTxtCodigo, joa_jTxtNome, joa_jTxtApelido, joa_jFmtCpf, joa_jFmtDataN, joa_jPwfSenha, joa_jCboNivel, joa_jChbAtivo, joa_jBtnCancelar, joa_jBtnConfirmar);
    }//GEN-LAST:event_joa_jBtnAlterarActionPerformed

    private void joa_jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jBtnExcluirActionPerformed

        if (Util.perguntar("Deseja excluir o registro?") == true) {
            joausuarios = viewBean();
            usuariosDAO.delete(joausuarios);
        } else {

            Util.mensagem("Exclusão cancelada");
        }
        Util.habilitar(false, joa_jTxtCodigo, joa_jTxtNome, joa_jTxtApelido, joa_jFmtCpf, joa_jFmtDataN, joa_jPwfSenha, joa_jCboNivel, joa_jChbAtivo, joa_jBtnCancelar, joa_jBtnConfirmar);
        Util.habilitar(true,joa_jBtnIncluir, joa_jBtnPesquisar, joa_jBtnAlterar, joa_jBtnExcluir);
        Util.limparCampos(joa_jTxtCodigo, joa_jTxtNome, joa_jTxtApelido, joa_jFmtCpf, joa_jFmtDataN, joa_jPwfSenha, joa_jCboNivel, joa_jChbAtivo);

    }//GEN-LAST:event_joa_jBtnExcluirActionPerformed

    private void joa_jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jBtnCancelarActionPerformed
        // TODO add your handling code here:

        Util.mensagem("Operação cancelada");
        Util.limparCampos(joa_jTxtCodigo, joa_jTxtNome, joa_jTxtApelido, joa_jFmtCpf, joa_jFmtDataN, joa_jPwfSenha, joa_jCboNivel, joa_jChbAtivo);
        Util.habilitar(false, joa_jTxtCodigo, joa_jTxtNome, joa_jTxtApelido, joa_jFmtCpf, joa_jFmtDataN, joa_jPwfSenha, joa_jCboNivel, joa_jChbAtivo, joa_jBtnCancelar, joa_jBtnConfirmar);
        Util.habilitar(true,joa_jBtnIncluir, joa_jBtnPesquisar, joa_jBtnAlterar, joa_jBtnExcluir);
    }//GEN-LAST:event_joa_jBtnCancelarActionPerformed

    private void joa_jBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jBtnPesquisarActionPerformed

        JDlgUsuariosPesquisa jDlgUsuariosPesquisa = new JDlgUsuariosPesquisa(null, true);
        jDlgUsuariosPesquisa.setTelaAnterior(this);
        jDlgUsuariosPesquisa.setVisible(true);

    }//GEN-LAST:event_joa_jBtnPesquisarActionPerformed

    private void joa_jTxtNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_joa_jTxtNomeFocusGained
        // TODO add your handling code here:
        joa_jTxtNome.setBackground(Color.yellow);

    }//GEN-LAST:event_joa_jTxtNomeFocusGained

    private void joa_jTxtNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_joa_jTxtNomeFocusLost
        // TODO add your handling code here:
        joa_jTxtNome.setBackground(Color.white);
    }//GEN-LAST:event_joa_jTxtNomeFocusLost

    private void joa_jTxtCodigoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_joa_jTxtCodigoFocusGained
        // TODO add your handling code here:
        joa_jTxtCodigo.setBackground(Color.yellow);
    }//GEN-LAST:event_joa_jTxtCodigoFocusGained

    private void joa_jTxtCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_joa_jTxtCodigoFocusLost
        // TODO add your handling code here:
        joa_jTxtCodigo.setBackground(Color.white);
    }//GEN-LAST:event_joa_jTxtCodigoFocusLost

    private void joa_jTxtApelidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_joa_jTxtApelidoFocusGained
        // TODO add your handling code here:
        joa_jTxtApelido.setBackground(Color.yellow);
    }//GEN-LAST:event_joa_jTxtApelidoFocusGained

    private void joa_jTxtApelidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_joa_jTxtApelidoFocusLost
        // TODO add your handling code here:
        joa_jTxtApelido.setBackground(Color.white);
    }//GEN-LAST:event_joa_jTxtApelidoFocusLost

    private void joa_jFmtCpfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_joa_jFmtCpfFocusGained
        // TODO add your handling code here:
        joa_jFmtCpf.setBackground(Color.yellow);
    }//GEN-LAST:event_joa_jFmtCpfFocusGained

    private void joa_jFmtCpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_joa_jFmtCpfFocusLost
        // TODO add your handling code here:
        joa_jFmtCpf.setBackground(Color.white);
    }//GEN-LAST:event_joa_jFmtCpfFocusLost

    private void joa_jFmtDataNFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_joa_jFmtDataNFocusGained
        // TODO add your handling code here:
        joa_jFmtDataN.setBackground(Color.yellow);
    }//GEN-LAST:event_joa_jFmtDataNFocusGained

    private void joa_jFmtDataNFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_joa_jFmtDataNFocusLost
        // TODO add your handling code here:
        joa_jFmtDataN.setBackground(Color.white);
    }//GEN-LAST:event_joa_jFmtDataNFocusLost

    private void joa_jPwfSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_joa_jPwfSenhaFocusGained
        // TODO add your handling code here:
        joa_jPwfSenha.setBackground(Color.yellow);
    }//GEN-LAST:event_joa_jPwfSenhaFocusGained

    private void joa_jPwfSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_joa_jPwfSenhaFocusLost
        // TODO add your handling code here:
        joa_jPwfSenha.setBackground(Color.white);
    }//GEN-LAST:event_joa_jPwfSenhaFocusLost

    private void joa_jCboNivelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_joa_jCboNivelFocusGained
        // TODO add your handling code here:
        joa_jCboNivel.setBackground(Color.yellow);
    }//GEN-LAST:event_joa_jCboNivelFocusGained

    private void joa_jCboNivelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_joa_jCboNivelFocusLost
        // TODO add your handling code here:
        joa_jCboNivel.setBackground(Color.white);
    }//GEN-LAST:event_joa_jCboNivelFocusLost

    private void joa_jChbAtivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jChbAtivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_joa_jChbAtivoActionPerformed

    private void joa_jPwfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jPwfSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_joa_jPwfSenhaActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                JDlgUsuarios dialog = new JDlgUsuarios(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton joa_jBtnAlterar;
    private javax.swing.JButton joa_jBtnCancelar;
    private javax.swing.JButton joa_jBtnConfirmar;
    private javax.swing.JButton joa_jBtnExcluir;
    private javax.swing.JButton joa_jBtnIncluir;
    private javax.swing.JButton joa_jBtnPesquisar;
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

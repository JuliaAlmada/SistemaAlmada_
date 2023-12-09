/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.JoaFuncionario;
import dao.FuncionarioDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import tools.Util;

/**
 *
 * @author User
 */
public class JDlgFuncionariosNovoIA extends javax.swing.JDialog {

    MaskFormatter mascaraCPF, mascaraDataNascimento, mascaraCelular, mascaraTelefone, mascaraCep, mascaraCarteiraTrabalho;
    JoaFuncionario joafuncionario;
    FuncionarioDAO funcionariosDAO;
    JDlgFuncionariosNovo jDlgFuncionariosNovo;
    FuncionariosControle funcionariosControle;

    /**
     * Creates new form JDlgFuncionarios
     */
    public JDlgFuncionariosNovoIA(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        joafuncionario = new JoaFuncionario();
        funcionariosControle = new FuncionariosControle();
        try {
            mascaraCPF = new MaskFormatter("###.###.###-##");
            mascaraDataNascimento = new MaskFormatter("##/##/####");
            mascaraCelular = new MaskFormatter("(##)#####-####");
            mascaraTelefone = new MaskFormatter("(##)#####-####");
            mascaraCep = new MaskFormatter("#####-###");
            mascaraCarteiraTrabalho = new MaskFormatter("######-####-##");
        } catch (ParseException ex) {
            Logger.getLogger(JDlgFuncionariosNovoIA.class.getName()).log(Level.SEVERE, null, ex);
        }
        joa_jFmtCpf.setFormatterFactory(new DefaultFormatterFactory(mascaraCPF));
        joa_jFmtDataNascimento.setFormatterFactory(new DefaultFormatterFactory(mascaraDataNascimento));
        joa_jFmtCarteiraTrabalho.setFormatterFactory(new DefaultFormatterFactory(mascaraCarteiraTrabalho));
        joa_jFmtCep.setFormatterFactory(new DefaultFormatterFactory(mascaraCep));
        joa_jFmtTelefone.setFormatterFactory(new DefaultFormatterFactory(mascaraTelefone));
        joa_jFmtCelular.setFormatterFactory(new DefaultFormatterFactory(mascaraCelular));

    }

    public JoaFuncionario ViewBean() {
        joafuncionario.setIdjoaFuncionario(Util.strInt(joa_jTxtCodigo.getText()));
        joafuncionario.setJoaDataNascimento(Util.strDate(joa_jFmtDataNascimento.getText()));
        joafuncionario.setJoaNome(joa_jTxtNome.getText());
        joafuncionario.setJoaCpf(joa_jFmtCpf.getText());
        joafuncionario.setJoaEmail(joa_jTxtEmail.getText());
        joafuncionario.setJoaTelefone(joa_jFmtTelefone.getText());
        joafuncionario.setJoaCelular(joa_jFmtCelular.getText());
        joafuncionario.setJoaEmailReserva(joa_jTxtEmailReserva.getText());
        joafuncionario.setJoaBairro(joa_jTxtBairro.getText());
        joafuncionario.setJoaCidade(joa_jTxtCidade.getText());
        joafuncionario.setJoaPais(joa_jTxtPais.getText());
        joafuncionario.setJoaCep(joa_jFmtCep.getText());
        joafuncionario.setJoaEndereco(joa_jTxtEndereco.getText());
        joafuncionario.setJoaSexo(joa_jCboSexo1.getSelectedIndex());
        joafuncionario.setJoaCarteiraTrabalho(joa_jFmtCarteiraTrabalho.getText());
        if (joa_jChbAtivo.isSelected() == true) {
            joafuncionario.setJoaAtivo("S");
        } else {
            joafuncionario.setJoaAtivo("N");
        }

        return joafuncionario;
    }

    public void setTelaAnterior(JDlgFuncionariosNovo jDlgFuncionario) {
        this.jDlgFuncionariosNovo = jDlgFuncionario;

    }

    public void beanView(JoaFuncionario funcionarios) {
        joa_jTxtCodigo.setText(Util.intStr(funcionarios.getIdjoaFuncionario()));;
        joa_jTxtNome.setText(funcionarios.getJoaNome());
        joa_jFmtCpf.setText(funcionarios.getJoaCpf());
        joa_jTxtEmail.setText(funcionarios.getJoaEmail());
        joa_jFmtTelefone.setText(funcionarios.getJoaTelefone());
        joa_jFmtCelular.setText(funcionarios.getJoaCelular());
        joa_jTxtEmailReserva.setText(funcionarios.getJoaEmailReserva());
        joa_jFmtDataNascimento.setText(Util.Datestr(funcionarios.getJoaDataNascimento()));
        joa_jTxtBairro.setText(funcionarios.getJoaBairro());
        joa_jTxtCidade.setText(funcionarios.getJoaCidade());
        joa_jTxtPais.setText(funcionarios.getJoaPais());
        joa_jFmtCep.setText(funcionarios.getJoaCep());
        joa_jTxtEndereco.setText(funcionarios.getJoaEndereco());
        joa_jCboSexo1.setSelectedIndex(funcionarios.getJoaSexo());
        joa_jFmtCarteiraTrabalho.setText(funcionarios.getJoaCarteiraTrabalho());
        if (funcionarios.getJoaAtivo().equals("S") == true) {
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

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        joa_jTxtCidade = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        joa_jFmtDataNascimento = new javax.swing.JFormattedTextField();
        joa_jTxtPais = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        joa_jTxtBairro = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        joa_jFmtTelefone = new javax.swing.JFormattedTextField();
        joa_jTxtEndereco = new javax.swing.JTextField();
        joa_jFmtCep = new javax.swing.JFormattedTextField();
        joa_jChbAtivo = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        joa_jFmtCelular = new javax.swing.JFormattedTextField();
        joa_jFmtCpf = new javax.swing.JFormattedTextField();
        joa_jTxtNome = new javax.swing.JTextField();
        joa_jFmtCarteiraTrabalho = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        joa_jTxtEmail = new javax.swing.JTextField();
        joa_jTxtCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        joa_jTxtEmailReserva = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        joa_jBtnOk = new javax.swing.JButton();
        joa_jBtnCancelar = new javax.swing.JButton();
        joa_jCboSexo1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel5.setText("Sexo");

        jLabel6.setText("Celular");

        jLabel7.setText("Cpf");

        joa_jTxtCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joa_jTxtCidadeActionPerformed(evt);
            }
        });

        jLabel11.setText("País");

        joa_jTxtPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joa_jTxtPaisActionPerformed(evt);
            }
        });

        jLabel9.setText("Bairro");

        jLabel12.setText("Cep");

        jLabel13.setText("Telefone");

        jLabel10.setText("Cidade");

        joa_jFmtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joa_jFmtTelefoneActionPerformed(evt);
            }
        });

        joa_jTxtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joa_jTxtEnderecoActionPerformed(evt);
            }
        });

        joa_jFmtCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joa_jFmtCepActionPerformed(evt);
            }
        });

        joa_jChbAtivo.setText("Ativo ");
        joa_jChbAtivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joa_jChbAtivoActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome");

        jLabel14.setText("Carteira de Trabalho");

        joa_jFmtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joa_jFmtCpfActionPerformed(evt);
            }
        });

        joa_jFmtCarteiraTrabalho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joa_jFmtCarteiraTrabalhoActionPerformed(evt);
            }
        });

        jLabel2.setText("Email");

        jLabel15.setText("Endereço");

        jLabel8.setText("Código");

        joa_jTxtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joa_jTxtEmailActionPerformed(evt);
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

        jLabel3.setText("Email Reserva");

        joa_jTxtEmailReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joa_jTxtEmailReservaActionPerformed(evt);
            }
        });

        jLabel4.setText("Data de Nascimento");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        joa_jBtnOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ok.png"))); // NOI18N
        joa_jBtnOk.setText("OK");
        joa_jBtnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joa_jBtnOkActionPerformed(evt);
            }
        });
        jPanel1.add(joa_jBtnOk);

        joa_jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar.png"))); // NOI18N
        joa_jBtnCancelar.setText("CANCELAR");
        joa_jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joa_jBtnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(joa_jBtnCancelar);

        joa_jCboSexo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No sexo", "Feminino", "Masculino" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(joa_jCboSexo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(joa_jTxtPais, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(208, 208, 208))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(joa_jTxtEmailReserva, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                        .addComponent(joa_jTxtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(joa_jFmtDataNascimento, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(joa_jTxtNome)
                        .addComponent(joa_jFmtCelular)
                        .addComponent(joa_jFmtCpf))
                    .addGap(52, 52, 52)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel14)
                        .addComponent(joa_jFmtCarteiraTrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(140, 140, 140))
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(joa_jTxtCidade)
                            .addComponent(joa_jTxtBairro)
                            .addComponent(joa_jFmtTelefone, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(joa_jFmtCep)))
                    .addGap(42, 42, 42)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 89, Short.MAX_VALUE)
                            .addComponent(joa_jChbAtivo))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(joa_jTxtEndereco, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(joa_jTxtCodigo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGap(0, 0, Short.MAX_VALUE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(joa_jCboSexo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                .addComponent(joa_jTxtPais, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(joa_jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(joa_jFmtCarteiraTrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(26, 26, 26))
                        .addComponent(joa_jChbAtivo))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(joa_jTxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(joa_jTxtEmailReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel7))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(joa_jTxtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(joa_jTxtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(joa_jTxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(joa_jFmtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(joa_jTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGap(16, 16, 16)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel12))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(joa_jFmtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(joa_jFmtDataNascimento)))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(joa_jFmtCelular))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(joa_jFmtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(73, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void joa_jTxtCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jTxtCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_joa_jTxtCidadeActionPerformed

    private void joa_jTxtPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jTxtPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_joa_jTxtPaisActionPerformed

    private void joa_jFmtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jFmtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_joa_jFmtTelefoneActionPerformed

    private void joa_jTxtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jTxtEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_joa_jTxtEnderecoActionPerformed

    private void joa_jFmtCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jFmtCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_joa_jFmtCepActionPerformed

    private void joa_jChbAtivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jChbAtivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_joa_jChbAtivoActionPerformed

    private void joa_jFmtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jFmtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_joa_jFmtCpfActionPerformed

    private void joa_jFmtCarteiraTrabalhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jFmtCarteiraTrabalhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_joa_jFmtCarteiraTrabalhoActionPerformed

    private void joa_jTxtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jTxtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_joa_jTxtEmailActionPerformed

    private void joa_jTxtCodigoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_joa_jTxtCodigoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_joa_jTxtCodigoFocusGained

    private void joa_jTxtCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_joa_jTxtCodigoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_joa_jTxtCodigoFocusLost

    private void joa_jTxtEmailReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jTxtEmailReservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_joa_jTxtEmailReservaActionPerformed

    private void joa_jBtnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jBtnOkActionPerformed
        joafuncionario = ViewBean();
        funcionariosDAO = new FuncionarioDAO();
        if (getTitle().toUpperCase().substring(0, 1).equals("I")) {
            funcionariosDAO.insert(joafuncionario);
        } else {
            funcionariosDAO.update(joafuncionario);
        }
        Util.limparCampos(joa_jTxtCodigo, joa_jTxtNome, joa_jFmtCpf, joa_jTxtEmail, joa_jFmtTelefone, joa_jFmtCelular, joa_jTxtEmailReserva, joa_jFmtDataNascimento, joa_jTxtBairro, joa_jTxtCidade, joa_jTxtPais, joa_jTxtEndereco, joa_jFmtCep, joa_jCboSexo1, joa_jFmtCarteiraTrabalho); 
        setVisible(false);

    }//GEN-LAST:event_joa_jBtnOkActionPerformed

    private void joa_jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jBtnCancelarActionPerformed
        setVisible(false);
        Util.limparCampos(joa_jTxtCodigo, joa_jTxtNome, joa_jFmtCpf, joa_jTxtEmail, joa_jFmtTelefone, joa_jFmtCelular, joa_jTxtEmailReserva, joa_jFmtDataNascimento, joa_jTxtBairro, joa_jTxtCidade, joa_jTxtPais, joa_jTxtEndereco, joa_jFmtCep, joa_jCboSexo1, joa_jFmtCarteiraTrabalho);

        // TODO add your handling code here:
    }//GEN-LAST:event_joa_jBtnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgFuncionariosNovoIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgFuncionariosNovoIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgFuncionariosNovoIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgFuncionariosNovoIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgFuncionariosNovoIA dialog = new JDlgFuncionariosNovoIA(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton joa_jBtnCancelar;
    private javax.swing.JButton joa_jBtnOk;
    private javax.swing.JComboBox<String> joa_jCboSexo1;
    private javax.swing.JCheckBox joa_jChbAtivo;
    private javax.swing.JFormattedTextField joa_jFmtCarteiraTrabalho;
    private javax.swing.JFormattedTextField joa_jFmtCelular;
    private javax.swing.JFormattedTextField joa_jFmtCep;
    private javax.swing.JFormattedTextField joa_jFmtCpf;
    private javax.swing.JFormattedTextField joa_jFmtDataNascimento;
    private javax.swing.JFormattedTextField joa_jFmtTelefone;
    private javax.swing.JTextField joa_jTxtBairro;
    private javax.swing.JTextField joa_jTxtCidade;
    private javax.swing.JTextField joa_jTxtCodigo;
    private javax.swing.JTextField joa_jTxtEmail;
    private javax.swing.JTextField joa_jTxtEmailReserva;
    private javax.swing.JTextField joa_jTxtEndereco;
    private javax.swing.JTextField joa_jTxtNome;
    private javax.swing.JTextField joa_jTxtPais;
    // End of variables declaration//GEN-END:variables
}

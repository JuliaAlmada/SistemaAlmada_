/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.JoaCliente;
import dao.ClientesDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import tools.Util;

/**
 *
 * @author User
 */
public class JDlgClientes extends javax.swing.JDialog {

    /**
     * Creates new form JDlgCliente
     */
    private boolean incluindo;
    public  JoaCliente joaClientes;
    public ClientesDAO clientesDAO;
    
    MaskFormatter mascaraCPF, mascaraDataNascimento, mascaraCelular, mascaraTelefone, mascaraCep;
   
    public JDlgClientes(java.awt.Frame parent, boolean modal) { 
       super(parent, modal);
        initComponents();
        Util.habilitar(false, joa_jTxtCodigo1, joa_jTxtNome,
                joa_jTxtEmail, joa_jTxtEmailRes, joa_jTxtCidade, joa_jTxtBairro,
                joa_jTxtPais, joa_jTxtEndereco, joa_jFmtCelular, joa_jFmtCep, joa_jFmtCpf,
                joa_jFmtCartaoFidelidade, joa_jFmtDataN, joa_jFmtTelefone, joa_jCboSexo,
                joa_jChbAtivo ,joa_jBtnConfirmar, joa_jBtnCancelar);
        clientesDAO = new ClientesDAO();
        setTitle("Cadastro de Clientes");
        setLocationRelativeTo(null);
         try {
            mascaraCPF = new MaskFormatter("###.###.###-##");
            mascaraDataNascimento = new MaskFormatter("##/##/####");
            mascaraCelular = new MaskFormatter("(##)#####-####");
            mascaraTelefone = new MaskFormatter("(##)#####-####");
            mascaraCep = new MaskFormatter("#####-###");
        } catch (ParseException ex) {
            Logger.getLogger(JDlgClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        joa_jFmtCpf.setFormatterFactory(new DefaultFormatterFactory(mascaraCPF));
        joa_jFmtDataN.setFormatterFactory(new DefaultFormatterFactory(mascaraDataNascimento));
        joa_jFmtCelular.setFormatterFactory(new DefaultFormatterFactory(mascaraCelular));
        joa_jFmtTelefone.setFormatterFactory(new DefaultFormatterFactory(mascaraTelefone));
        joa_jFmtCep.setFormatterFactory(new DefaultFormatterFactory(mascaraCep));
    }
        public JoaCliente viewBean() {
        JoaCliente clientes = new JoaCliente();
        
        clientes.setIdjoaCliente(Util.strInt(joa_jTxtCodigo1.getText()));
        clientes.setJoaDataNascimento(Util.strDate(joa_jFmtDataN.getText()));

        //transforma string para inteiro
        clientes.setJoaNome(joa_jTxtNome.getText());
        clientes.setJoaEmail(joa_jTxtEmail.getText());
        clientes.setJoaCpf(joa_jFmtCpf.getText());
        clientes.setJoaSexo(joa_jCboSexo.getSelectedIndex());
        clientes.setJoaCelular(joa_jFmtCelular.getText());
        clientes.setJoaEmailReserva(joa_jTxtEmailRes.getText());
        clientes.setJoaEndereco(joa_jTxtEndereco.getText());
        clientes.setJoaBairro(joa_jTxtBairro.getText());
        clientes.setJoaCidade(joa_jTxtCidade.getText());
        clientes.setJoaPais(joa_jTxtPais.getText());
        clientes.setJoaCartaoFidelidade(joa_jFmtCartaoFidelidade.getText());
        clientes.setJoaCep(joa_jFmtCep.getText());
        clientes.setJoaTelefone(joa_jFmtTelefone.getText());
        clientes.setJoaSexo(joa_jCboSexo.getSelectedIndex());

        if (joa_jChbAtivo.isSelected() == true) {
            clientes.setJoaAtivo("S");
        } else {
            clientes.setJoaAtivo("N");
        }
        return clientes;
    }

    public void beanView(JoaCliente clientes) {
        joa_jTxtCodigo1.setText(Util.intStr(clientes.getIdjoaCliente()));
        joa_jFmtDataN.setText(Util.Datestr(clientes.getJoaDataNascimento()));
        joa_jTxtNome.setText(clientes.getJoaNome());
        joa_jTxtEmail.setText(clientes.getJoaEmail());
        joa_jFmtCpf.setText(clientes.getJoaCpf());
        joa_jCboSexo.setSelectedIndex(clientes.getJoaSexo());
        joa_jFmtCelular.setText(clientes.getJoaCelular());
        joa_jTxtEmailRes.setText(clientes.getJoaEmailReserva());
        joa_jTxtEndereco.setText(clientes.getJoaEndereco());
        joa_jTxtBairro.setText(clientes.getJoaBairro());
        joa_jTxtCidade.setText(clientes.getJoaCidade());
        joa_jTxtPais.setText(clientes.getJoaPais());
        joa_jFmtCartaoFidelidade.setText(clientes.getJoaCartaoFidelidade());
        joa_jFmtCep.setText(clientes.getJoaCep());
        joa_jFmtTelefone.setText(clientes.getJoaTelefone());

  if (clientes.getJoaAtivo().equals("S") == true) {
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

        joa_jChbAtivo = new javax.swing.JCheckBox();
        joa_jBtnIncluir = new javax.swing.JButton();
        joa_jFmtCpf = new javax.swing.JFormattedTextField();
        joa_jBtnAlterar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        joa_jBtnExcluir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        joa_jBtnCancelar = new javax.swing.JButton();
        joa_jFmtDataN = new javax.swing.JFormattedTextField();
        joa_jBtnPesquisar = new javax.swing.JButton();
        joa_jCboSexo = new javax.swing.JComboBox<>();
        joa_jBtnConfirmar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        joa_jFmtCartaoFidelidade = new javax.swing.JFormattedTextField();
        joa_jFmtCelular = new javax.swing.JFormattedTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        joa_jFmtTelefone = new javax.swing.JFormattedTextField();
        joa_jTxtEndereco = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        joa_jTxtBairro = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        joa_jTxtCidade = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        joa_jTxtNome = new javax.swing.JTextField();
        joa_jTxtPais = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        joa_jTxtEmail = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        joa_jFmtCep = new javax.swing.JFormattedTextField();
        joa_jTxtCodigo1 = new javax.swing.JTextField();
        joa_jTxtEmailRes = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        joa_jChbAtivo.setText("Ativo");

        joa_jBtnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/incluir.png"))); // NOI18N
        joa_jBtnIncluir.setText("Incluir");
        joa_jBtnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joa_jBtnIncluirActionPerformed(evt);
            }
        });

        joa_jBtnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alterar.png"))); // NOI18N
        joa_jBtnAlterar.setText("Alterar");
        joa_jBtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joa_jBtnAlterarActionPerformed(evt);
            }
        });

        jLabel4.setText("Email Reserva ");

        joa_jBtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Excluir.png"))); // NOI18N
        joa_jBtnExcluir.setText("Excluir");
        joa_jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joa_jBtnExcluirActionPerformed(evt);
            }
        });

        jLabel5.setText("Data de Nascimento");

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

        joa_jCboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No sexo", "Feminino", "Masculino" }));

        joa_jBtnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gravar.png"))); // NOI18N
        joa_jBtnConfirmar.setText("Confirmar");
        joa_jBtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joa_jBtnConfirmarActionPerformed(evt);
            }
        });

        jLabel6.setText("Sexo");

        jLabel15.setText("Cartão fidelidade");

        jLabel7.setText("Celular");

        joa_jFmtCartaoFidelidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joa_jFmtCartaoFidelidadeActionPerformed(evt);
            }
        });

        jLabel17.setText("Código");

        jLabel9.setText("Telefone");

        jLabel10.setText("Endereço");

        jLabel11.setText("Bairro");

        jLabel12.setText("Cidade");

        jLabel1.setText("Nome");

        jLabel13.setText("País");

        jLabel14.setText("CEP");

        jLabel2.setText("Email");

        joa_jTxtCodigo1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                joa_jTxtCodigo1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                joa_jTxtCodigo1FocusLost(evt);
            }
        });

        jLabel3.setText("CPF");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(joa_jBtnIncluir)
                        .addGap(18, 18, 18)
                        .addComponent(joa_jBtnAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(joa_jBtnExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(joa_jBtnConfirmar)
                        .addGap(18, 18, 18)
                        .addComponent(joa_jBtnCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(joa_jBtnPesquisar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(joa_jFmtCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(joa_jTxtEmailRes)
                            .addComponent(joa_jTxtEmail)
                            .addComponent(joa_jFmtDataN)
                            .addComponent(joa_jTxtNome))
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(joa_jFmtTelefone)
                            .addComponent(joa_jFmtCelular)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(joa_jCboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                                .addComponent(joa_jChbAtivo))
                            .addComponent(jLabel15)
                            .addComponent(joa_jFmtCartaoFidelidade)
                            .addComponent(jLabel17)
                            .addComponent(joa_jTxtCodigo1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(joa_jTxtCidade, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(joa_jTxtPais)
                            .addComponent(jLabel14)
                            .addComponent(joa_jFmtCep)
                            .addComponent(jLabel10)
                            .addComponent(joa_jTxtEndereco)
                            .addComponent(jLabel11)
                            .addComponent(joa_jTxtBairro))
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(joa_jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(joa_jTxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(joa_jTxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(joa_jTxtPais, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(11, 11, 11)
                                .addComponent(joa_jTxtEmailRes, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(joa_jFmtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(joa_jTxtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(joa_jFmtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(joa_jTxtCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(joa_jFmtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(joa_jFmtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(joa_jFmtCartaoFidelidade, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(joa_jFmtDataN, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(joa_jCboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(joa_jChbAtivo))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(joa_jTxtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(joa_jBtnIncluir)
                    .addComponent(joa_jBtnAlterar)
                    .addComponent(joa_jBtnExcluir)
                    .addComponent(joa_jBtnCancelar)
                    .addComponent(joa_jBtnPesquisar)
                    .addComponent(joa_jBtnConfirmar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void joa_jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jBtnIncluirActionPerformed
        // TODO add your handling code here:
        
        Util.limparCampos( joa_jTxtCodigo1,joa_jTxtNome,
                joa_jTxtEmail, joa_jTxtEmailRes, joa_jTxtCidade, joa_jTxtBairro,
                joa_jTxtPais, joa_jTxtEndereco, joa_jFmtCelular, joa_jFmtCep, joa_jFmtCpf,
                joa_jFmtCartaoFidelidade, joa_jFmtDataN, joa_jFmtTelefone, joa_jCboSexo,
                joa_jChbAtivo);
        Util.habilitar(true, joa_jTxtCodigo1,joa_jTxtNome,
                joa_jTxtEmail, joa_jTxtEmailRes, joa_jTxtCidade, joa_jTxtBairro,
                joa_jTxtPais, joa_jTxtEndereco, joa_jFmtCelular, joa_jFmtCep, joa_jFmtCpf,
                joa_jFmtCartaoFidelidade, joa_jFmtDataN, joa_jFmtTelefone, joa_jCboSexo,
                joa_jChbAtivo,  joa_jBtnConfirmar, joa_jBtnCancelar);
        Util.habilitar(false,joa_jBtnIncluir, joa_jBtnAlterar, joa_jBtnExcluir, joa_jBtnPesquisar);
        incluindo = true;
    }//GEN-LAST:event_joa_jBtnIncluirActionPerformed

    private void joa_jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jBtnAlterarActionPerformed
          Util.habilitar(true, joa_jTxtCodigo1,joa_jTxtNome,joa_jBtnExcluir,
                joa_jTxtEmail, joa_jTxtEmailRes, joa_jTxtCidade, joa_jTxtBairro,
                joa_jTxtPais, joa_jTxtEndereco, joa_jFmtCelular, joa_jFmtCep, joa_jFmtCpf,
                joa_jFmtCartaoFidelidade, joa_jFmtDataN, joa_jFmtTelefone, joa_jCboSexo,
                joa_jChbAtivo,  joa_jBtnConfirmar, joa_jBtnCancelar);
                Util.habilitar(false,joa_jBtnIncluir, joa_jBtnAlterar, joa_jBtnExcluir, joa_jBtnPesquisar);
                incluindo=false;
    }//GEN-LAST:event_joa_jBtnAlterarActionPerformed

    private void joa_jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jBtnExcluirActionPerformed
        if (Util.perguntar("Deseja excluir o registro?") == true){
           joaClientes = viewBean();
           clientesDAO.delete(joaClientes);
       }
       else {
        
            Util.mensagem("Exclusão cancelada");
        }        // TODO add your handling code here
        Util.limparCampos(joa_jTxtCodigo1,joa_jTxtNome,
                joa_jTxtEmail, joa_jTxtEmailRes, joa_jTxtCidade, joa_jTxtBairro,
                joa_jTxtPais, joa_jTxtEndereco, joa_jFmtCelular, joa_jFmtCep, joa_jFmtCpf,
                joa_jFmtCartaoFidelidade, joa_jFmtDataN, joa_jFmtTelefone, joa_jCboSexo,
                joa_jChbAtivo);
        Util.habilitar(false, joa_jTxtCodigo1,joa_jTxtNome,
                joa_jTxtEmail, joa_jTxtEmailRes, joa_jTxtCidade, joa_jTxtBairro,
                joa_jTxtPais, joa_jTxtEndereco, joa_jFmtCelular, joa_jFmtCep, joa_jFmtCpf,
                joa_jFmtCartaoFidelidade, joa_jFmtDataN, joa_jFmtTelefone, joa_jCboSexo,
                joa_jChbAtivo,joa_jBtnConfirmar, joa_jBtnCancelar);
          Util.habilitar(true,joa_jBtnIncluir, joa_jBtnAlterar, joa_jBtnExcluir, joa_jBtnPesquisar);
    }//GEN-LAST:event_joa_jBtnExcluirActionPerformed

    private void joa_jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jBtnCancelarActionPerformed
        Util.mensagem("Ação Cancelada");       // TODO add your handling code here:
        Util.limparCampos(joa_jTxtCodigo1,joa_jTxtNome,
                joa_jTxtEmail, joa_jTxtEmailRes, joa_jTxtCidade, joa_jTxtBairro,
                joa_jTxtPais, joa_jTxtEndereco, joa_jFmtCelular, joa_jFmtCep, joa_jFmtCpf,
                joa_jFmtCartaoFidelidade, joa_jFmtDataN, joa_jFmtTelefone, joa_jCboSexo,
                joa_jChbAtivo);
      Util.habilitar(false, joa_jTxtCodigo1, joa_jTxtNome,
                joa_jTxtEmail, joa_jTxtEmailRes, joa_jTxtCidade, joa_jTxtBairro,
                joa_jTxtPais, joa_jTxtEndereco, joa_jFmtCelular, joa_jFmtCep, joa_jFmtCpf,
                joa_jFmtCartaoFidelidade, joa_jFmtDataN, joa_jFmtTelefone, joa_jCboSexo,
                joa_jChbAtivo ,joa_jBtnConfirmar, joa_jBtnCancelar);
         Util.habilitar(true,joa_jBtnIncluir, joa_jBtnAlterar, joa_jBtnExcluir, joa_jBtnPesquisar);
    }//GEN-LAST:event_joa_jBtnCancelarActionPerformed

    private void joa_jBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jBtnPesquisarActionPerformed
        JDlgClientesPesquisa jDlgClientesPesquisa = new JDlgClientesPesquisa(null, true);
        jDlgClientesPesquisa.setTelaAnterior(this);
        jDlgClientesPesquisa.setVisible(true);
    }//GEN-LAST:event_joa_jBtnPesquisarActionPerformed

    private void joa_jBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jBtnConfirmarActionPerformed
         joaClientes=viewBean();
        if (incluindo ==true ){
        clientesDAO.insert(joaClientes);}
        else{
               clientesDAO.update(joaClientes);
                }
         
        Util.limparCampos(joa_jTxtCodigo1,joa_jTxtNome,
                joa_jTxtEmail, joa_jTxtEmailRes, joa_jTxtCidade, joa_jTxtBairro,
                joa_jTxtPais, joa_jTxtEndereco, joa_jFmtCelular, joa_jFmtCep, joa_jFmtCpf,
                joa_jFmtCartaoFidelidade, joa_jFmtDataN, joa_jFmtTelefone, joa_jCboSexo,
                joa_jChbAtivo, joa_jBtnIncluir, joa_jBtnExcluir, joa_jBtnAlterar, joa_jBtnPesquisar,
                joa_jBtnConfirmar, joa_jBtnCancelar);
        Util.habilitar(false, joa_jTxtCodigo1,joa_jTxtNome,
                joa_jTxtEmail, joa_jTxtEmailRes, joa_jTxtCidade, joa_jTxtBairro,
                joa_jTxtPais, joa_jTxtEndereco, joa_jFmtCelular, joa_jFmtCep, joa_jFmtCpf,
                joa_jFmtCartaoFidelidade, joa_jFmtDataN, joa_jFmtTelefone, joa_jCboSexo,
                joa_jChbAtivo, joa_jBtnCancelar,joa_jBtnConfirmar);
           Util.habilitar(true,joa_jBtnIncluir, joa_jBtnAlterar, joa_jBtnExcluir, joa_jBtnPesquisar);
    }//GEN-LAST:event_joa_jBtnConfirmarActionPerformed

    private void joa_jFmtCartaoFidelidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jFmtCartaoFidelidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_joa_jFmtCartaoFidelidadeActionPerformed

    private void joa_jTxtCodigo1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_joa_jTxtCodigo1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_joa_jTxtCodigo1FocusGained

    private void joa_jTxtCodigo1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_joa_jTxtCodigo1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_joa_jTxtCodigo1FocusLost

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
            java.util.logging.Logger.getLogger(JDlgClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgClientes dialog = new JDlgClientes(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton joa_jBtnAlterar;
    private javax.swing.JButton joa_jBtnCancelar;
    private javax.swing.JButton joa_jBtnConfirmar;
    private javax.swing.JButton joa_jBtnExcluir;
    private javax.swing.JButton joa_jBtnIncluir;
    private javax.swing.JButton joa_jBtnPesquisar;
    private javax.swing.JComboBox<String> joa_jCboSexo;
    private javax.swing.JCheckBox joa_jChbAtivo;
    private javax.swing.JFormattedTextField joa_jFmtCartaoFidelidade;
    private javax.swing.JFormattedTextField joa_jFmtCelular;
    private javax.swing.JFormattedTextField joa_jFmtCep;
    private javax.swing.JFormattedTextField joa_jFmtCpf;
    private javax.swing.JFormattedTextField joa_jFmtDataN;
    private javax.swing.JFormattedTextField joa_jFmtTelefone;
    private javax.swing.JTextField joa_jTxtBairro;
    private javax.swing.JTextField joa_jTxtCidade;
    private javax.swing.JTextField joa_jTxtCodigo1;
    private javax.swing.JTextField joa_jTxtEmail;
    private javax.swing.JTextField joa_jTxtEmailRes;
    private javax.swing.JTextField joa_jTxtEndereco;
    private javax.swing.JTextField joa_jTxtNome;
    private javax.swing.JTextField joa_jTxtPais;
    // End of variables declaration//GEN-END:variables
}

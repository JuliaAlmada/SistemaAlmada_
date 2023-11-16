/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.JoaCliente;
import bean.JoaFuncionario;
import bean.JoaVenda;
import dao.ClientesDAO;
import dao.FuncionarioDAO;
import dao.VendaDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import tools.Util;
import view.JDlgIAoProduto_Vendas;
import view.JDlgPesquisaVendas;

/**
 *
 * @author u49558987859
 */
public class JDlgVendas extends javax.swing.JDialog {

    JDlgIAoProduto_Vendas jDlgInclusaoProduto_Vendas;
    private boolean incluindo;
    /**
     * Creates new form JDlgVendas
     */
    public JDlgVendas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jDlgInclusaoProduto_Vendas = new JDlgIAoProduto_Vendas(null, true);

        setTitle("Vendas");
        setLocationRelativeTo(null);
        
        ClientesDAO clientes_DAO = new ClientesDAO();
        List lista = clientes_DAO.listAll();
        for (int i = 0; i < lista.size(); i++) {
            JoaCliente clientes = (JoaCliente) lista.get(i);
            joa_jCboClientes.addItem(clientes);
        }
        FuncionarioDAO vendedores_DAO = new FuncionarioDAO();
        List lista1 = vendedores_DAO.listAll();
        for (int i = 0; i < lista1.size(); i++) {
            JoaFuncionario funcionario = (JoaFuncionario) lista1.get(i);
            joa_jCboVendedores.addItem(funcionario);
        }

    }
    
    
     public JoaVenda viewBean() {
        JoaVenda vendas = new JoaVenda();
        int id = Integer.parseInt(joa_jTxtCodigo.getText());
        double valor = Double.parseDouble(joa_jFmtTotal.getText());
        vendas.setJoaData(Util.strDate(joa_jFmtData.getText()));
        JoaCliente clientes1 = (JoaCliente) joa_jCboClientes.getSelectedItem();
        vendas.setJoaCliente((clientes1.getIdjoaCliente()));
        JoaFuncionario funcionario1 = (JoaFuncionario) joa_jCboVendedores.getSelectedItem();
        vendas.setJoaFuncionario((funcionario1.getIdjoaFuncionario()));
        
        vendas.setIdjoaVenda(id);
        vendas.setJoaTotal(valor);
        return vendas;
    }

    public void beanView(JoaVenda vendas) {
        String id = String.valueOf(vendas.getIdjoaVenda());
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        joa_jFmtData.setText(formato.format(vendas.getJoaData()));
        joa_jTxtCodigo.setText(id);
        
       /* int idcliente = vendas.getJoaCliente();
        int idfuncionario = vendas.getJoaFuncionario();
        
        ClientesDAO clientes_DAO = new ClientesDAO();
        joa_jCboClientes.setSelectedItem(clientes_DAO.list(idcliente));
        
        FuncionarioDAO vendedores_DAO = new FuncionarioDAO();
        joa_jCboVendedores.setSelectedItem(vendedores_DAO.list(idfuncionario));*/
        
        joa_jFmtTotal.setText(String.valueOf(vendas.getJoaTotal()));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        joa_jTxtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        joa_jFmtData = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        joa_jCboClientes = new javax.swing.JComboBox<JoaCliente>();
        jLabel5 = new javax.swing.JLabel();
        joa_jBtnPesquisar = new javax.swing.JButton();
        joa_jBtnIncluir = new javax.swing.JButton();
        joa_jBtnExcluir = new javax.swing.JButton();
        joa_jBtnAlterar = new javax.swing.JButton();
        joa_jBtnCancelar = new javax.swing.JButton();
        joa_jBtnConfirmar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        joa_jBtbExcluir1 = new javax.swing.JButton();
        joa_jBtnAlterar1 = new javax.swing.JButton();
        joa_jBtnIncluir1 = new javax.swing.JButton();
        joa_jFmtTotal = new javax.swing.JFormattedTextField();
        joa_jCboVendedores = new javax.swing.JComboBox< JoaFuncionario>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Num Venda");

        joa_jTxtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joa_jTxtCodigoActionPerformed(evt);
            }
        });

        jLabel2.setText("Data");

        joa_jFmtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joa_jFmtDataActionPerformed(evt);
            }
        });

        jLabel3.setText("Cliente");

        jLabel4.setText("Vendedor");

        joa_jCboClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joa_jCboClientesActionPerformed(evt);
            }
        });

        jLabel5.setText("Total");

        joa_jBtnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar.png"))); // NOI18N
        joa_jBtnPesquisar.setText("Pesquisar");
        joa_jBtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joa_jBtnPesquisarActionPerformed(evt);
            }
        });

        joa_jBtnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/incluir.png"))); // NOI18N
        joa_jBtnIncluir.setText("Incluir");
        joa_jBtnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joa_jBtnIncluirActionPerformed(evt);
            }
        });

        joa_jBtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Excluir.png"))); // NOI18N
        joa_jBtnExcluir.setText("Excluir");
        joa_jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joa_jBtnExcluirActionPerformed(evt);
            }
        });

        joa_jBtnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alterar.png"))); // NOI18N
        joa_jBtnAlterar.setText("Alterar");
        joa_jBtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joa_jBtnAlterarActionPerformed(evt);
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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "PRODUTO", "QUANTIDADE", "VALOR UNITARIO", "TOTAL"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        joa_jBtbExcluir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Excluir.png"))); // NOI18N
        joa_jBtbExcluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joa_jBtbExcluir1ActionPerformed(evt);
            }
        });

        joa_jBtnAlterar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alterar.png"))); // NOI18N
        joa_jBtnAlterar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joa_jBtnAlterar1ActionPerformed(evt);
            }
        });

        joa_jBtnIncluir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/incluir.png"))); // NOI18N
        joa_jBtnIncluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joa_jBtnIncluir1ActionPerformed(evt);
            }
        });

        joa_jFmtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joa_jFmtTotalActionPerformed(evt);
            }
        });

        joa_jCboVendedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joa_jCboVendedoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(joa_jBtnIncluir1)
                            .addComponent(joa_jBtbExcluir1)
                            .addComponent(joa_jBtnAlterar1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(joa_jTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel1)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(joa_jFmtData, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(joa_jCboClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(joa_jCboVendedores, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(joa_jFmtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(joa_jBtnIncluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(joa_jBtnAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(joa_jBtnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(joa_jBtnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(joa_jBtnCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(joa_jBtnPesquisar)))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(joa_jCboVendedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(12, 12, 12))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(joa_jTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(joa_jFmtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(joa_jCboClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(joa_jFmtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(joa_jBtnIncluir1)
                        .addGap(18, 18, 18)
                        .addComponent(joa_jBtnAlterar1)
                        .addGap(18, 18, 18)
                        .addComponent(joa_jBtbExcluir1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(joa_jBtnCancelar)
                        .addComponent(joa_jBtnPesquisar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(joa_jBtnIncluir)
                        .addComponent(joa_jBtnExcluir)
                        .addComponent(joa_jBtnAlterar)
                        .addComponent(joa_jBtnConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void joa_jTxtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jTxtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_joa_jTxtCodigoActionPerformed

    private void joa_jBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jBtnPesquisarActionPerformed

        JDlgPesquisaVendas jDlgPesquisaVendas = new JDlgPesquisaVendas(null, true);
        jDlgPesquisaVendas.setTelaAnterior(this);
        jDlgPesquisaVendas.setVisible(true);
    }//GEN-LAST:event_joa_jBtnPesquisarActionPerformed

    private void joa_jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jBtnIncluirActionPerformed
        incluindo = true;
        Util.limparCampos(joa_jTxtCodigo, joa_jFmtData,
                joa_jCboClientes, joa_jCboVendedores, joa_jFmtTotal,
                joa_jBtnIncluir, joa_jBtnExcluir, joa_jBtnAlterar, joa_jBtnPesquisar,
                joa_jBtnConfirmar, joa_jBtnCancelar);
        Util.habilitar(true, joa_jTxtCodigo, joa_jFmtData,
                joa_jCboClientes, joa_jCboVendedores, joa_jFmtTotal, joa_jBtnIncluir,
                joa_jBtnExcluir, joa_jBtnAlterar, joa_jBtnPesquisar,
                joa_jBtnConfirmar, joa_jBtnCancelar);
    }//GEN-LAST:event_joa_jBtnIncluirActionPerformed

    private void joa_jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jBtnExcluirActionPerformed
                int resp = JOptionPane.showConfirmDialog(null, "Deseja excluir o registro?",
                "Exclusão", JOptionPane.YES_NO_OPTION);

        if (resp == JOptionPane.YES_OPTION) {
            JoaVenda vendas = viewBean();
            VendaDAO vendas_DAO = new VendaDAO();
            vendas_DAO.delete(vendas);
        } else {
            JOptionPane.showMessageDialog(null, "Exclusão cancelada");
        }


        if (Util.perguntar("Deseja excluir o usuario?") == true) {
        }
        Util.limparCampos(joa_jTxtCodigo, joa_jFmtData,
                joa_jCboClientes, joa_jCboVendedores, joa_jFmtTotal,
                joa_jBtnIncluir, joa_jBtnExcluir, joa_jBtnAlterar, joa_jBtnPesquisar,
                joa_jBtnConfirmar, joa_jBtnCancelar);
        Util.habilitar(false, joa_jTxtCodigo, joa_jFmtData,
                joa_jCboClientes, joa_jCboVendedores, joa_jFmtTotal,
                joa_jBtnExcluir, joa_jBtnPesquisar,
                joa_jBtnConfirmar, joa_jBtnCancelar);
    }//GEN-LAST:event_joa_jBtnExcluirActionPerformed

    private void joa_jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jBtnAlterarActionPerformed
        // TODO add your handling code here:
                incluindo = false;
        Util.limparCampos(joa_jTxtCodigo, joa_jFmtData,
                joa_jCboClientes, joa_jCboVendedores, joa_jFmtTotal,
                joa_jBtnIncluir, joa_jBtnExcluir, joa_jBtnAlterar, joa_jBtnPesquisar,
                joa_jBtnConfirmar, joa_jBtnCancelar);
        Util.habilitar(true, joa_jTxtCodigo, joa_jFmtData,
                joa_jCboClientes, joa_jCboVendedores, joa_jFmtTotal, joa_jBtnIncluir,
                joa_jBtnExcluir, joa_jBtnAlterar, joa_jBtnPesquisar,
                joa_jBtnConfirmar, joa_jBtnCancelar);
    }//GEN-LAST:event_joa_jBtnAlterarActionPerformed

    private void joa_jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jBtnCancelarActionPerformed
        Util.mensagem("Ação Cancelada");
        Util.limparCampos(joa_jTxtCodigo, joa_jFmtData,
                joa_jCboClientes, joa_jCboVendedores, joa_jFmtTotal,
                joa_jBtnIncluir, joa_jBtnExcluir, joa_jBtnAlterar, joa_jBtnPesquisar,
                joa_jBtnConfirmar, joa_jBtnCancelar);
        Util.habilitar(false, joa_jTxtCodigo, joa_jFmtData,
                joa_jCboClientes, joa_jCboVendedores, joa_jFmtTotal,
                joa_jBtnExcluir, joa_jBtnPesquisar,
                joa_jBtnConfirmar, joa_jBtnCancelar);
    }//GEN-LAST:event_joa_jBtnCancelarActionPerformed

    private void joa_jBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jBtnConfirmarActionPerformed
        // TODO add your handling code here:
        JoaVenda vendas = viewBean();
        VendaDAO vendas_DAO = new VendaDAO();

        if (incluindo == true) {
            vendas_DAO.insert(vendas);
        } else {
            vendas_DAO.update(vendas);
        }
   
        Util.limparCampos(joa_jTxtCodigo, joa_jFmtData,
                joa_jCboClientes, joa_jCboVendedores, joa_jFmtTotal,
                joa_jBtnIncluir, joa_jBtnExcluir, joa_jBtnAlterar, joa_jBtnPesquisar,
                joa_jBtnConfirmar, joa_jBtnCancelar);
        Util.habilitar(true, joa_jTxtCodigo, joa_jFmtData,
                joa_jCboClientes, joa_jCboVendedores, joa_jFmtTotal, joa_jBtnIncluir,
                joa_jBtnExcluir, joa_jBtnAlterar, joa_jBtnPesquisar,
                joa_jBtnConfirmar, joa_jBtnCancelar);
    }//GEN-LAST:event_joa_jBtnConfirmarActionPerformed

    private void joa_jBtbExcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jBtbExcluir1ActionPerformed
        // TODO add your handling code here:
        if (Util.perguntar("Deseja excluir o usuario?") == true) {
        }
    }//GEN-LAST:event_joa_jBtbExcluir1ActionPerformed

    private void joa_jBtnAlterar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jBtnAlterar1ActionPerformed
        // TODO add your handling code here:
        jDlgInclusaoProduto_Vendas.setTitle("Alteração");
        jDlgInclusaoProduto_Vendas.setVisible(true);
    }//GEN-LAST:event_joa_jBtnAlterar1ActionPerformed

    private void joa_jBtnIncluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jBtnIncluir1ActionPerformed
        // TODO add your handling code here:
        jDlgInclusaoProduto_Vendas.setTitle("Inclusão");
        jDlgInclusaoProduto_Vendas.setVisible(true);
    }//GEN-LAST:event_joa_jBtnIncluir1ActionPerformed

    private void joa_jFmtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jFmtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_joa_jFmtDataActionPerformed

    private void joa_jFmtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jFmtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_joa_jFmtTotalActionPerformed

    private void joa_jCboVendedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jCboVendedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_joa_jCboVendedoresActionPerformed

    private void joa_jCboClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jCboClientesActionPerformed
        // TODO add your handling code here:
       

    }//GEN-LAST:event_joa_jCboClientesActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                JDlgVendas dialog = new JDlgVendas(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton joa_jBtbExcluir1;
    private javax.swing.JButton joa_jBtnAlterar;
    private javax.swing.JButton joa_jBtnAlterar1;
    private javax.swing.JButton joa_jBtnCancelar;
    private javax.swing.JButton joa_jBtnConfirmar;
    private javax.swing.JButton joa_jBtnExcluir;
    private javax.swing.JButton joa_jBtnIncluir;
    private javax.swing.JButton joa_jBtnIncluir1;
    private javax.swing.JButton joa_jBtnPesquisar;
    private javax.swing.JComboBox<JoaCliente> joa_jCboClientes;
    private javax.swing.JComboBox<JoaFuncionario> joa_jCboVendedores;
    private javax.swing.JFormattedTextField joa_jFmtData;
    private javax.swing.JFormattedTextField joa_jFmtTotal;
    private javax.swing.JTextField joa_jTxtCodigo;
    // End of variables declaration//GEN-END:variables
}

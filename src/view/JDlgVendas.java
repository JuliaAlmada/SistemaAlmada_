/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.JoaCliente;
import bean.JoaFuncionario;
import bean.JoaVenda;
import bean.JoaVendaProduto;
import dao.ClientesDAO;
import dao.FuncionarioDAO;
import dao.VendaDAO;
import dao.VendaProdutoDAO;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.TableModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import tools.Util;
/**
 *
 * @author u49558987859
 */
public class JDlgVendas extends javax.swing.JDialog {

    JDlgIAProdutoVendas jDlgIAProduto_Vendas;
    private boolean incluindo;
    VendasControle vendasControle;  
    VendasProdutoControle vendasProdutoControle;
    MaskFormatter mascaraData;
    JoaVenda vendas;
    VendaDAO vendaDAO;
    VendaProdutoDAO vendaProdDAO;
    /**
     * Creates new form JDlgVendas
     */
    public JDlgVendas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jDlgIAProduto_Vendas = new JDlgIAProdutoVendas(null, true);
        setTitle("Cadastro de Vendas");
        setLocationRelativeTo(null);
        Util.habilitar(false, joa_jTxtCodigo, joa_jFmtData,
                joa_jCboClientes, joa_jCboVendedores, joa_jFmtTotal,
                joa_jBtnConfirmar, joa_jBtnCancelar, joa_jBtnIncluir1, joa_jBtnAlterar1, joa_jBtnExcluir1);
        try {
            mascaraData = new MaskFormatter("##/##/####");

        } catch (ParseException ex) {
            Logger.getLogger(JDlgClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        joa_jFmtData.setFormatterFactory( new DefaultFormatterFactory(mascaraData));
        vendaDAO = new VendaDAO();
        vendas = new JoaVenda();
        vendaProdDAO  = new VendaProdutoDAO() ;

        //vendasProdutoDAO = new VendaProdutoDAO();
        List lista1 =new ArrayList();
        vendasProdutoControle = new VendasProdutoControle();
        vendasProdutoControle.setList(lista1);
        jTable1.setModel(vendasProdutoControle);

        ClientesDAO clientes_DAO = new ClientesDAO();
        List listaClientes = clientes_DAO.listAll();
        for (int i = 0; i < listaClientes.size(); i++) {
            JoaCliente clientes = (JoaCliente) listaClientes.get(i);
            joa_jCboClientes.addItem(clientes);
        }
        FuncionarioDAO funcionarios_dao = new FuncionarioDAO();
        List listaFunc = funcionarios_dao.listAll();
        for (int i = 0; i < listaFunc.size(); i++) {
            JoaFuncionario funcionario = (JoaFuncionario) listaFunc.get(i);
            joa_jCboVendedores.addItem(funcionario);
        }

    }

    public JoaVenda viewBean() {
         vendas = new JoaVenda();   
        vendas.setIdjoaVenda(Util.strInt(joa_jTxtCodigo.getText()));
        vendas.setJoaData(Util.strDate(joa_jFmtData.getText()));
        vendas.setJoaCliente((JoaCliente) joa_jCboClientes.getSelectedItem());
        vendas.setJoaFuncionario((JoaFuncionario) joa_jCboVendedores.getSelectedItem());
        vendas.setJoaTotal(Util.strDouble(joa_jFmtTotal.getText()));
        return vendas;

    }

    public void beanView(JoaVenda vendas) {
    VendaProdutoDAO vendasProdutoDAO = new VendaProdutoDAO();
        joa_jFmtData.setText(Util.Datestr(vendas.getJoaData()));
        joa_jTxtCodigo.setText(Util.intStr(vendas.getIdjoaVenda()));
        joa_jCboVendedores.setSelectedItem(vendas.getJoaFuncionario());
        joa_jCboClientes.setSelectedItem(vendas.getJoaCliente());
        joa_jFmtTotal.setText(Util.doubleStr(vendas.getJoaTotal()));
        List listProd = (List)vendasProdutoDAO.listProdutos(vendas);
        vendasProdutoControle.setList(listProd);

    }
    
    public int getSelectedRowProd(){
    return jTable1.getSelectedRow();
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
        joa_jBtnExcluir1 = new javax.swing.JButton();
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

        joa_jBtnExcluir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Excluir.png"))); // NOI18N
        joa_jBtnExcluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joa_jBtnExcluir1ActionPerformed(evt);
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
                            .addComponent(joa_jBtnExcluir1)
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
                        .addComponent(joa_jBtnExcluir1)))
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
        Util.habilitar(true,joa_jBtnIncluir, joa_jBtnAlterar, joa_jBtnExcluir );

    }//GEN-LAST:event_joa_jBtnPesquisarActionPerformed

    private void joa_jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jBtnIncluirActionPerformed
        incluindo = true;
        vendasProdutoControle.setList(new ArrayList());
        vendas = new JoaVenda();
        Util.limparCampos(joa_jTxtCodigo, joa_jFmtData,
                joa_jCboClientes, joa_jCboVendedores, joa_jFmtTotal
               );
        Util.habilitar(true, joa_jTxtCodigo, joa_jFmtData,
                joa_jCboClientes, joa_jCboVendedores, joa_jFmtTotal, 
                joa_jBtnConfirmar, joa_jBtnCancelar, 
                joa_jBtnIncluir1, joa_jBtnAlterar1, joa_jBtnExcluir1);
        Util.habilitar(false,joa_jBtnIncluir, joa_jBtnAlterar, joa_jBtnExcluir, joa_jBtnPesquisar );
    }//GEN-LAST:event_joa_jBtnIncluirActionPerformed

    private void joa_jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jBtnExcluirActionPerformed
            if (vendas != null) {
            if (Util.perguntar("Deseja excluir a Venda?") == true) {
                VendaProdutoDAO vendaProdutoDAO = new VendaProdutoDAO();
                JoaVendaProduto vendaProduto;
                for (int linha = 0; linha < jTable1.getRowCount(); linha++) {
                    vendaProduto = vendasProdutoControle.getBean(linha);
                    vendaProdutoDAO.delete(vendaProduto);
                }
                vendaDAO.delete(vendas);
            }
        } else {
            Util.mensagem("Deve ser realizada uma pesquisa antes");
        }
        Util.limparCampos(joa_jTxtCodigo, joa_jFmtData,
                joa_jCboClientes, joa_jCboVendedores, joa_jFmtTotal
                );
        Util.habilitar(false, joa_jTxtCodigo, joa_jFmtData,
                joa_jCboClientes, joa_jCboVendedores, joa_jFmtTotal,
                joa_jBtnConfirmar,  joa_jBtnIncluir1, joa_jBtnAlterar1, joa_jBtnExcluir1);
        Util.habilitar(true,joa_jBtnIncluir, joa_jBtnAlterar, joa_jBtnExcluir, joa_jBtnPesquisar);
        vendasProdutoControle.setList(new ArrayList());

    }//GEN-LAST:event_joa_jBtnExcluirActionPerformed

    private void joa_jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jBtnAlterarActionPerformed
        // TODO add your handling code here:
          if (vendas != null) {
                vendaProdDAO = new VendaProdutoDAO();
                JoaVendaProduto vendaProduto;
                for (int linha = 0; linha < jTable1.getRowCount(); linha++) {
                    vendaProduto = vendasProdutoControle.getBean(linha);
                    vendaProdDAO.delete(vendaProduto);     
            }
        } else {
            Util.mensagem("Deve ser realizada uma pesquisa antes");
        }
        incluindo = false;
       
        Util.habilitar(true, joa_jTxtCodigo, joa_jFmtData,
                joa_jCboClientes, joa_jCboVendedores, joa_jFmtTotal, joa_jBtnIncluir,
                joa_jBtnExcluir, joa_jBtnConfirmar, joa_jBtnCancelar,  joa_jBtnIncluir1, joa_jBtnAlterar1, joa_jBtnExcluir1);
                Util.habilitar(false,joa_jBtnIncluir, joa_jBtnAlterar, joa_jBtnExcluir, joa_jBtnPesquisar );

    }//GEN-LAST:event_joa_jBtnAlterarActionPerformed

    private void joa_jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jBtnCancelarActionPerformed
        Util.mensagem("Ação Cancelada");
        Util.limparCampos(joa_jTxtCodigo, joa_jFmtData,
                joa_jCboClientes, joa_jCboVendedores, joa_jFmtTotal);
               Util.habilitar(false, joa_jTxtCodigo, joa_jFmtData,
                joa_jCboClientes, joa_jCboVendedores, joa_jFmtTotal,
                joa_jBtnConfirmar, joa_jBtnCancelar,  joa_jBtnIncluir1, joa_jBtnAlterar1, joa_jBtnExcluir1);
               Util.habilitar(true, joa_jBtnPesquisar,joa_jBtnExcluir, joa_jBtnAlterar);
                       vendasProdutoControle.setList(new ArrayList());

    }//GEN-LAST:event_joa_jBtnCancelarActionPerformed

    private void joa_jBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jBtnConfirmarActionPerformed
        // TODO add your handling code here:
        vendas = viewBean();
        if (incluindo == true) {
            vendaDAO.insert(vendas);
            VendaProdutoDAO vendasProdutoDAO = new VendaProdutoDAO();
            JoaVendaProduto joaVendaProduto;
            for (int linha = 0; linha < jTable1.getRowCount(); linha++) {
                joaVendaProduto = vendasProdutoControle.getBean(linha);
                joaVendaProduto.setJoaVenda(vendas);
                vendasProdutoDAO.insert(joaVendaProduto);
            }
        } else {
            vendaDAO.update(vendas);
            VendaProdutoDAO vendasProdutoDAO = new VendaProdutoDAO();
            JoaVendaProduto joaVendaProduto;
            for (int linha = 0; linha < jTable1.getRowCount(); linha++) {
                joaVendaProduto = vendasProdutoControle.getBean(linha);
                joaVendaProduto.setJoaVenda(vendas);
                vendasProdutoDAO.insert(joaVendaProduto);
            }
        }

        Util.limparCampos(joa_jTxtCodigo, joa_jFmtData,
                joa_jCboClientes, joa_jCboVendedores, joa_jFmtTotal
               );
       Util.habilitar(false, joa_jBtnExcluir,joa_jTxtCodigo, joa_jFmtData,
                joa_jCboClientes, joa_jCboVendedores, joa_jFmtTotal,
                joa_jBtnConfirmar, joa_jBtnCancelar,joa_jBtnIncluir1,joa_jBtnAlterar1,  joa_jBtnExcluir1);
       Util.habilitar(true,  joa_jBtnIncluir, joa_jBtnAlterar, joa_jBtnExcluir, joa_jBtnPesquisar);
               vendasProdutoControle.setList(new ArrayList(0));
                       

    }//GEN-LAST:event_joa_jBtnConfirmarActionPerformed

    private void joa_jBtnExcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jBtnExcluir1ActionPerformed
        // TODO add your handling code here:
        if (getSelectedRowProd()== -1) {
            Util.mensagem("Nenhuma linha selecionada");
        } else {
            if(Util.perguntar("Deseja excluir o produto?") == true){
                vendasProdutoControle.removeBean(getSelectedRowProd());
            }
        }
    }//GEN-LAST:event_joa_jBtnExcluir1ActionPerformed

    private void joa_jBtnAlterar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jBtnAlterar1ActionPerformed
        // TODO add your handling code here:
        jDlgIAProduto_Vendas.setTitle("Alteração");
        jDlgIAProduto_Vendas.setTelaAnterior(this);
        int linSel = jTable1.getSelectedRow();
        JoaVendaProduto vendasProdutos = (JoaVendaProduto)vendasProdutoControle.getBean(linSel) ;
        jDlgIAProduto_Vendas.beanView(vendasProdutos);
        jDlgIAProduto_Vendas.setVisible(true);
    }//GEN-LAST:event_joa_jBtnAlterar1ActionPerformed

    private void joa_jBtnIncluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joa_jBtnIncluir1ActionPerformed
        // TODO add your handling code here:
        jDlgIAProduto_Vendas.setTitle("Inclusão");
        jDlgIAProduto_Vendas.setTelaAnterior(this);
        jDlgIAProduto_Vendas.setVisible(true);
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
    private javax.swing.JButton joa_jBtnAlterar;
    private javax.swing.JButton joa_jBtnAlterar1;
    private javax.swing.JButton joa_jBtnCancelar;
    private javax.swing.JButton joa_jBtnConfirmar;
    private javax.swing.JButton joa_jBtnExcluir;
    private javax.swing.JButton joa_jBtnExcluir1;
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

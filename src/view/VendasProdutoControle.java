/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.JoaVendaProduto;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u49558987859
 */
public class VendasProdutoControle extends AbstractTableModel{
    private List lista;
    public void setList(List lista){
    this.lista = lista;
    this.fireTableDataChanged();

    }

    public JoaVendaProduto getBean (int row){
    return (JoaVendaProduto) lista.get(row);
    }
    
    public  void  addBean (JoaVendaProduto joaVendaProduto){
    lista.add(joaVendaProduto);
    this.fireTableDataChanged();
    }
    
    public void removeBean (int index){
    lista.remove(index);
    this.fireTableDataChanged();
    }
    
    public  void  updateBean (int index, JoaVendaProduto joaVendaProduto){
    lista.set(index, joaVendaProduto);
    this.fireTableDataChanged();
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        JoaVendaProduto vendas =(JoaVendaProduto) lista.get(rowIndex);
         if (columnIndex == 0 ) {
            return vendas.getIdjoaVendaProduto();
        }
        if (columnIndex == 1 ) {
            return vendas.getJoaProduto();
        }
        if (columnIndex == 2 ) {
            return vendas.getJoaQuantidade();
        }
        if (columnIndex == 3 ) {
            return vendas.getJoaValor();
        }
         return "";
    }
    @Override
    public String getColumnName(int column){
        if (column == 0 ) {
            return "id";
        }
        if (column == 1 ) {
            return "produto";
        }
        if (column == 2 ) {
            return "quantidade";
        }
        if (column == 3 ) {
            return "Valor";
        }
        return "";
    }
}

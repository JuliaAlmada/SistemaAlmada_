/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.JoaProduto;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u49558987859
 */
public class ProdutosControle extends AbstractTableModel {

    private List lista;
  public void setList(List lista){
    this.lista = lista;
    this.fireTableDataChanged();
    }

    public JoaProduto getBean(int row) {
        return (JoaProduto) lista.get(row);
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        JoaProduto produtos = (JoaProduto) lista.get(rowIndex);
        if (columnIndex == 0) {
            return produtos.getIdjoaProduto();
        }
        if (columnIndex == 1) {
            return produtos.getJoaNome();
        }
        if (columnIndex == 2) {
            return produtos.getJoaDescricao();
        }
        if (columnIndex == 3) {
            return produtos.getJoaValorUnitario();
        }
        if (columnIndex == 4) {
            return produtos.getJoaCategoria();
        }
        return "";
    }

    @Override
    public String getColumnName(int column) {
        if (column == 0) {
            return "id";
        }
        if (column == 1) {
            return "joa_nome";
        }
        if (column == 2) {
            return "joa_descricao";
        }
        if (column == 3) {
            return "joa_valorUnitario";
        }
        if (column == 4) {
            return "joa_categoria";
        }
        return "";
    }
}

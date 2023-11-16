/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.JoaVenda;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u49558987859
 */
public class VendasControle extends AbstractTableModel{
    private List lista;
    public void setList(List lista){
    this.lista = lista;
    }

    public JoaVenda getBean (int row){
    return (JoaVenda) lista.get(row);
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
        JoaVenda vendas =(JoaVenda) lista.get(rowIndex);
         if (columnIndex == 0 ) {
            return vendas.getIdjoaVenda();
        }
        if (columnIndex == 3 ) {
            return vendas.getJoaData();
        }
        if (columnIndex == 4 ) {
            return vendas.getJoaTotal();
        }
        if (columnIndex == 1 ) {
            return vendas.getJoaCliente();
        }
        if (columnIndex == 2 ) {
            return vendas.getJoaFuncionario();
        }
         return "";
    }
    @Override
    public String getColumnName(int column){
        if (column == 0 ) {
            return "id";
        }
        if (column == 3 ) {
            return "data";
        }
        if (column == 4 ) {
            return "valor";
        }
        if (column == 1 ) {
            return "cliente";
        }
        if (column == 2 ) {
            return "vendedores";
        }
        return "";
    }
}

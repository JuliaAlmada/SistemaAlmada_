/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.JoaUsuario;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u49558987859
 */
public class UsuariosControle extends AbstractTableModel{
    private List lista;
    public void setList(List lista){
    this.lista = lista;
    }

    public JoaUsuario getBean (int row){
    return (JoaUsuario) lista.get(row);
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        JoaUsuario usuarios =(JoaUsuario) lista.get(rowIndex);
         if (columnIndex == 0 ) {
            return usuarios.getIdjoaUsuario();
        }
        if (columnIndex == 1 ) {
            return usuarios.getJoaNome();
        }
        if (columnIndex == 2 ) {
            return usuarios.getJoaNickname();
        }
        if (columnIndex == 3 ) {
            return usuarios.getJoaCpf();
        }
        if (columnIndex == 4 ) {
            return usuarios.getJoaSenha();
        }
        if (columnIndex == 5 ) {
            return usuarios.getJoaNivel();
        }
        if (columnIndex == 6 ) {
            return usuarios.getJoaAtivo();
        }
         return "";
    }
    @Override
    public String getColumnName(int column){
        if (column == 0 ) {
            return "id";
        }
        if (column == 1 ) {
            return "joa_nome";
        }
        if (column == 2 ) {
            return "joa_apelido";
        }
        if (column == 3 ) {
            return "joa_cpf";
        }
        if (column == 4 ) {
            return "joa_senha";
        }
        if (column == 5 ) {
            return "joa_nivel";
        }
        if (column == 6 ) {
            return "joa_ativo";
        }
        return "";
    }
}

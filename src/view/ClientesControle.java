package view;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import bean.JoaCliente;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u49558987859
 */
public class ClientesControle extends AbstractTableModel {
    private List lista;
    public void setList(List lista){
    this.lista = lista;
    this.fireTableDataChanged();
    
    }

    public JoaCliente getBean(int row) {
        return (JoaCliente) lista.get(row);
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
        JoaCliente cliente = (JoaCliente) lista.get(rowIndex);
        if (columnIndex == 0) {
            return cliente.getIdjoaCliente();
        }
        if (columnIndex == 1) {
            return cliente.getJoaNome();
        }
        if (columnIndex == 2) {
            return cliente.getJoaEmail();
        }
        if (columnIndex == 3) {
            return cliente.getJoaEmailReserva();
        }
        if (columnIndex == 4) {
            return cliente.getJoaCpf();
        }
        if (columnIndex == 5) {
            return cliente.getJoaDataNascimento();
        }
        if (columnIndex == 6) {
            return cliente.getJoaSexo();
  /*      }
        if (columnIndex == 7) {
            return cliente.getJoaCelular();
        }
        if (columnIndex == 8) {
            return cliente.getJoaTelefone();
        }
        if (columnIndex == 9) {
            return cliente.getJoaEndereco();
        }
        if (columnIndex == 10) {
            return cliente.getJoaBairro();
        }
        if (columnIndex == 11) {
            return cliente.getJoaCidade();
        }
        if (columnIndex == 12) {
            return cliente.getJoaPais();
        }
        if (columnIndex == 13) {
            return cliente.getJoaCep();
        }
        if (columnIndex == 14) {
            return cliente.getJoaCartaoFidelidade();*/
        }

        return "";
    }

    @Override
    public String getColumnName(int column) {
        if (column == 0) {
            return "joa_id";
        }
        if (column == 1) {
            return "joa_nome";
        }
        if (column == 2) {
            return "joa_email";
        }
        if (column == 3) {
            return "joa_emailReserva";
        }
        if (column == 4) {
            return "joa_cpf";
        }
        if (column == 5) {
            return "joa_dataNascimento";
        }
        if (column == 6) {
            return "joa_sexo";
        }
       /* if (column == 7 ) {
            return "celular";
        }
        if (column == 8) {
            return "joa_telefone";
        }
        if (column == 9) {
            return "joa_endereco";
        }
        if (column == 10) {
            return "joa_bairro";
        }
        if (column == 11) {
            return "joa_cidade";
        }
        if (column == 12) {
            return "joa_pais";
        }
        if (column == 13) {
            return "joa_cep";
        }
      
        if (column == 14) {
            return "joa_cartaoFidelidade";
        }*/
        return "";
    }
}

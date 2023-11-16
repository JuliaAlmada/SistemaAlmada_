package view;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import bean.JoaFuncionario;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u49558987859
 */
public class FuncionariosControle extends AbstractTableModel {

    private List lista;
  public void setList(List lista){
    this.lista = lista;
    this.fireTableDataChanged();
    }


    public JoaFuncionario getBean(int row) {
        return (JoaFuncionario) lista.get(row);
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 8;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        JoaFuncionario funcionarios = (JoaFuncionario) lista.get(rowIndex);
        if (columnIndex == 0) {
            return funcionarios.getIdjoaFuncionario();
        }
        if (columnIndex == 1) {
            return funcionarios.getJoaNome();
        }
        if (columnIndex == 2) {
            return funcionarios.getJoaEmail();
        }
        if (columnIndex == 3) {
            return funcionarios.getJoaTelefone();
        }
        if (columnIndex == 4) {
            return funcionarios.getJoaCpf();
        }
       /* if (columnIndex == 5) {
            return funcionarios.getJoaEmailReserva();
        }
        if (columnIndex == 6) {
            return funcionarios.getJoaEndereco();
        }
        if (columnIndex == 7) {
            return funcionarios.getJoaBairro();
        }
        if (columnIndex == 8) {
            return funcionarios.getJoaPais();
        }

        if (columnIndex == 9) {
            return funcionarios.getJoaCidade();
        }*/
        if (columnIndex == 5) {
            return funcionarios.getJoaCep();
        }
        if (columnIndex == 6) {
            return funcionarios.getJoaCarteiraTrabalho();
        }
        if (columnIndex == 7) {
            return funcionarios.getJoaDataNascimento();
        }

       /* if (columnIndex == 5) {
            return funcionarios.getJoaSexo();
        }

        if (columnIndex == 6) {
            return funcionarios.getJoaCelular();
        }*/
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
            return "joa_telefone";
        }
        if (column == 4) {
            return "joa_cpf";
        }
       /* if (column == 5) {
            return "joa_emailReserva";
        }
        if (column == 6) {
            return "joa_endereco";
        }
        if (column == 7 ) {
            return "joa_bairro";
        }
        if (column == 8) {
            return "joa_pais";
        }
        if (column == 9) {
            return "joa_cidade";
        }*/
        if (column == 5) {
            return "joa_cep";
        }
        if (column == 6) {
            return "joa_carteiraTrabalho";
        }
        if (column == 7) {
            return "joa_dataNascimento";
        }
       /* if (column == 5) {
            return "joa_sexo";
        }
     
        if (column == 6) {
            return "joa_celular";
        }*/
        return "";
    }
}

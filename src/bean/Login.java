/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import dao.UsuariosDAO;

/**
 *
 * @author User
 */
public class Login {
    
    private int idJoaUsuario;
    private String joa_nickname;
    private String joa_senha;

    /**
     * @return the idUsuario
     */
    public int getidJoaUsuario() {
        return idJoaUsuario;
    }

    /**
     * @param idUsuario the idUsuario to set
     */
    public void setIdJoaUsuario(int idJoaUsuario) {
        this.idJoaUsuario = idJoaUsuario;
    }

    /**
     * @return the apelido
     */
    public String getJoa_nickname() {
        return joa_nickname;
    }

    /**
     * @param joa_nickname the apelido to set
     */
    public void setJoa_nickname(String joa_nickname) {
        this.joa_nickname = joa_nickname;
    }

    /**
     * @return the senha
     */
    public String getJoa_senha() {
        return joa_senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setJoa_senha(String joa_senha) {
        this.joa_senha = joa_senha;
    }

    public boolean fazerLogin() {

        UsuariosDAO usuariosDAO = new UsuariosDAO();
        JoaUsuario usuarios = usuariosDAO.Login(joa_nickname, joa_senha);

        if (usuarios != null) {

            return true;
        } else {

            return false;
        }
    }
}

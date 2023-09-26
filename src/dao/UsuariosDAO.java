/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.JoaProduto;
import bean.JoaUsuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author u10154925179
 */
public class UsuariosDAO extends DAO_Abstract {

    @Override
    public void insert(Object object) {
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
    }

    @Override
    public void update(Object object) {
        session.beginTransaction();
        session.update(object);
        session.getTransaction().commit();
        session.flush();
        session.clear();
    }

    @Override
    public void delete(Object object) {
        session.beginTransaction();
        session.delete(object);
        session.getTransaction().commit();
        session.flush();
        session.clear();
    }

    @Override
    public Object list(int id) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(JoaUsuario.class);
        criteria.add(Restrictions.eq("idjoaUsuario", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(JoaUsuario.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
 public JoaUsuario Login(String joa_nickname, String joa_senha) {
      

    JoaUsuario usuarios = null;

        String url = /*"jdbc:mysql://127.0.0.1:3306/db_juliaalmada"; */ "jdbc:mysql://10.7.51:33062/db_julia_almada";
        String user =/* "root";*/  "julia_almada";
        String password = /*""; */ "julia_almada";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnt = DriverManager.getConnection(url, user, password);
            String sql = "SELECT * FROM joa_usuario WHERE joa_nickname = ? AND joa_senha = ?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setString(1, joa_nickname);
            pstm.setString(2, joa_senha);

            ResultSet rs = pstm.executeQuery();

            if (rs.next()) {
                usuarios = new JoaUsuario();
                usuarios.setJoaNickname(rs.getString("joa_nickname"));
                usuarios.setJoaSenha(rs.getString("joa_senha"));
            }

            rs.close();
            pstm.close();
            cnt.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return usuarios;


    }
}

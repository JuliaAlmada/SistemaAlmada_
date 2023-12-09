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
import org.hibernate.criterion.MatchMode;
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
        session.flush();
        session.clear();
        session.update(object);
        session.getTransaction().commit();
    }

    @Override
    public void delete(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.delete(object);
        session.getTransaction().commit();
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

  

    public List listNome(String nome) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(JoaUsuario.class);
        criteria.add(Restrictions.ilike("joaNome", nome, MatchMode.ANYWHERE));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public List listCpf(String cpf) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(JoaUsuario.class);
        criteria.add(Restrictions.ilike("joaCpf", cpf, MatchMode.ANYWHERE));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    public List listNomeCpf(String cpf, String nome) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(JoaUsuario.class);
        criteria.add(Restrictions.ilike("joaCpf", cpf, MatchMode.ANYWHERE));
        criteria.add(Restrictions.ilike("joaNome", nome, MatchMode.ANYWHERE));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
   
    public JoaUsuario login(String usuarios, String senha){
    session.beginTransaction();
    Criteria criteria = session.createCriteria(JoaUsuario.class);
    criteria.add(Restrictions.eq("joaNome", usuarios));
    criteria.add(Restrictions.eq("joaSenha", senha));
    JoaUsuario usuarioAprovado = (JoaUsuario) criteria.uniqueResult();
    session.getTransaction().commit();
        return usuarioAprovado;
    }

/*public static void main (String[] args){
        UsuariosDAO usuariosDAO = new UsuariosDAO();
        List lista = usuariosDAO.listAll();
       for (Object usuarios : lista){
            System.out.println("joaNome: "+(JoaUsuario)usuarios).getJoaNome();}
        
        
    }*/
}

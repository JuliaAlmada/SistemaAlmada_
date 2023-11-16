/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.JoaCliente;
import java.util.Date;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author User
 */
public class ClientesDAO extends DAO_Abstract {

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
        Criteria criteria = session.createCriteria(JoaCliente.class);
        criteria.add(Restrictions.eq("idjoaCliente", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;

    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(JoaCliente.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public List listNome(String nome) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(JoaCliente.class);
        criteria.add(Restrictions.ilike("joaNome", nome, MatchMode.ANYWHERE));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
        public List listData(Date data) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(JoaCliente.class);
        criteria.add(Restrictions.eq("joaDataNascimento", data));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
     public List listNomeData(Date data, String nome) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(JoaCliente.class);
        criteria.add(Restrictions.eq("joaDataNascimento", data));
        criteria.add(Restrictions.ilike("joaNome", nome, MatchMode.ANYWHERE));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
}

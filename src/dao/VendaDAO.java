/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.JoaCliente;
import bean.JoaVenda;
import java.util.Date;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author User
 */
public class VendaDAO extends DAO_Abstract {

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
        Criteria criteria = session.createCriteria(JoaVenda.class);
        criteria.add(Restrictions.eq("idjoaVenda", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(JoaVenda.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public List listData(Date data) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(JoaVenda.class);
        criteria.add(Restrictions.ge("joaData", data));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public List listValor(double valor) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(JoaVenda.class);
        criteria.add(Restrictions.ge("joaValorVenda", valor));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public List listDataValor(double valor, Date data) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(JoaVenda.class);
        criteria.add(Restrictions.ge("joaValorVenda", valor));
        criteria.add(Restrictions.eq("joaData", data));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
}

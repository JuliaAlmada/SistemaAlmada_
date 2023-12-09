/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.JoaCliente;
import bean.JoaVenda;
import bean.JoaVendaProduto;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author User
 */
public class VendaProdutoDAO extends DAO_Abstract {

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
        Criteria criteria = session.createCriteria(JoaVendaProduto.class);
        criteria.add(Restrictions.eq("idjoaVendaProduto", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(JoaVendaProduto.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public List listProdutos(JoaVenda joaVenda) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(JoaVendaProduto.class);
        criteria.add(Restrictions.eq("joaVenda", joaVenda));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.JoaCliente;
import bean.JoaProduto;
import bean.JoaVenda;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author User
 */
public class ProdutoDAO extends DAO_Abstract {

    @Override
    public void insert(Object object) {
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
    }

    @Override
    public void update(Object object) {
        session.getTransaction();
        session.flush();
        session.clear();
        session.update(object);
        session.beginTransaction().commit();
    }

    @Override
    public void delete(Object object) {
        session.getTransaction();
        session.flush();
        session.clear();
        session.delete(object);
        session.beginTransaction().commit();
    }

    @Override
    public Object list(int id) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(JoaProduto.class);
        criteria.add(Restrictions.eq("idjoaProduto", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(JoaProduto.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public List listNome(String nome) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(JoaProduto.class);
        criteria.add(Restrictions.ilike("joaNome", nome, MatchMode.ANYWHERE));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public List listValor(double valor) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(JoaProduto.class);
        criteria.add(Restrictions.ge("joaValorUnitario", valor));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public List listNomeValor(double valor, String nome) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(JoaProduto.class);
        criteria.add(Restrictions.ge("joaValorUnitario", valor));
        criteria.add(Restrictions.ilike("joaNome", nome, MatchMode.ANYWHERE));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
}

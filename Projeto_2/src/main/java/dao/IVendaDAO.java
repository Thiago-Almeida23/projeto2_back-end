package main.java.dao;

import main.java.Venda;
import main.java.dao.generics.IGenericDAO;
import main.java.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
}

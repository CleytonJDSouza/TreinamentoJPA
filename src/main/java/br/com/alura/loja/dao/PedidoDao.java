package br.com.alura.loja.dao;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.alura.loja.modelo.Pedido;
import br.com.alura.loja.vo.RelatorioDDeVendasVo;


public class PedidoDao {
    
    private EntityManager em;

    public PedidoDao (EntityManager em) {
        this.em = em;
    }

    public void cadastrar (Pedido pedido) {
        this.em.persist(pedido);
    }

    public BigDecimal valorTotalVendido() {
        String jpql = "SELECT SUM(p.valorTotal) FROM Pedido p";
        return em.createQuery(jpql, BigDecimal.class).getSingleResult();
    }

    public List<RelatorioDDeVendasVo> relatorioDeVendas() {
        String jpql = "SELECT new br.com.alura.loja.vo.RelatorioDDeVendasVo(" +
              "p.produto.nome, " + 
              "SUM(p.quantidade), " + 
              "MAX(p.pedido.data)) " + 
              "FROM ItemPedido p " + 
              "GROUP BY p.produto.nome " + 
              "ORDER BY SUM(p.quantidade) DESC";
        return em.createQuery(jpql, RelatorioDDeVendasVo.class).getResultList();
    }
}
   
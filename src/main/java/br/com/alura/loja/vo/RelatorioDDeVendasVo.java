package br.com.alura.loja.vo;

import java.time.LocalDate;

public class RelatorioDDeVendasVo {

    private String nomeProduto;
    private Long quantidadeVendida;
    private LocalDate dataUltimaVenda;

    public RelatorioDDeVendasVo (String nomeProduto, Long quantidadeVendida, LocalDate dataUltimaVenda) {
        this.nomeProduto = nomeProduto;
        this.quantidadeVendida = quantidadeVendida;
        this.dataUltimaVenda = dataUltimaVenda;
    }

    @Override
    public String toString() {
    return "RelatorioDDeVendasVo{" +
            "nomeProduto='" + nomeProduto + '\'' +
            ", quantidadeVendida=" + quantidadeVendida +
            ", dataUltimaVenda=" + dataUltimaVenda +
            '}';
}

    public LocalDate getDataUltimaVenda() {
        return dataUltimaVenda;
    }
    
    public String getNomeProduto() {
        return nomeProduto;
    }
    
    public Long getQuantidadeVendida() {
        return quantidadeVendida;
    }
}

package br.com.alura.loja.testes;

import java.math.BigDecimal;

import br.com.alura.loja.modelo.Produto;

public class CadastroDeProduto {
    
    public static void main(String[] args) {
        Produto celular = new Produto();
        celular.setNome("Xiaomi Redmi");
        celular.setDescricao("Muito legal");
        celular.setPreco(new BigDecimal("800"));
    }
}

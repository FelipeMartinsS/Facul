/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex1Classe.n2;

/**
 *
 * @author felipe
 */
public class Produto {
    
    private Integer codigo;
    private String nome;
    private Integer qydeEstoque;
    private Double valor;

    public Produto(Integer codigo, String nome, Integer qydeEstoque, Double valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.qydeEstoque = qydeEstoque;
        this.valor = valor;
    }

    
    
    
    
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQydeEstoque() {
        return qydeEstoque;
    }

    public void setQydeEstoque(Integer qydeEstoque) {
        this.qydeEstoque = qydeEstoque;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    
    
}

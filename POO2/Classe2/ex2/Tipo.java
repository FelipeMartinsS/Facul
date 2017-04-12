/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex1Classe.n1;

/**
 *
 * @author felipe
 */
public class Tipo {
    
    private Integer codigo;
    private String descricao;
    private String isbn;
    private Integer nsqp;

    public Tipo(Integer codigo, String descricao, String isbn, Integer nsqp) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.isbn = isbn;
        this.nsqp = nsqp;
    }

    
    
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getNsqp() {
        return nsqp;
    }

    public void setNsqp(Integer nsqp) {
        this.nsqp = nsqp;
    }
    
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex1Classe.n1;

import java.util.Date;

/**
 *
 * @author felipe
 */
public class Emprestimo {
    
    private Integer codigo;
    private Date dataEntrega;
    private Item item;
    private Aluno aluno;

    public Emprestimo(Integer codigo, Date dataEntrega, Item item, Aluno aluno) {
        this.codigo = codigo;
        this.dataEntrega = dataEntrega;
        this.item = item;
        this.aluno = aluno;
    }

   
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    
    
    
    
    
}

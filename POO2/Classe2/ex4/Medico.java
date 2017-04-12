/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex1Classe.n3;

/**
 *
 * @author felipe
 */
public class Medico {
    
    private Integer codigo;
    private Integer cpf;
    private String nome;
    private Integer crm;

    public Medico(Integer codigo, Integer cpf, String nome, Integer crm) {
        this.codigo = codigo;
        this.cpf = cpf;
        this.nome = nome;
        this.crm = crm;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCrm() {
        return crm;
    }

    public void setCrm(Integer crm) {
        this.crm = crm;
    }
    
    
    
    
}

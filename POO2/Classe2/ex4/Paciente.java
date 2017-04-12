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
public class Paciente {
    
    private Integer codigo;
    private Integer cpf;
    private String nome;
    private String nroConvenio;

    public Paciente(Integer codigo, Integer cpf, String nome, String nroConvenio) {
        this.codigo = codigo;
        this.cpf = cpf;
        this.nome = nome;
        this.nroConvenio = nroConvenio;
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

    public String getNroConvenio() {
        return nroConvenio;
    }

    public void setNroConvenio(String nroConvenio) {
        this.nroConvenio = nroConvenio;
    }
    
    
    
    
    
}

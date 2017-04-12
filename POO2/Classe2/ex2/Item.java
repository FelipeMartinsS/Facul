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
public class Item {
    
    private Integer codigo;
    private String titulo;
    private Date data;
    private Tipo Tipo;

    public Item(Integer codigo, String titulo, Date data, Tipo Tipo) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.data = data;
        this.Tipo = Tipo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Tipo getTipo() {
        return Tipo;
    }

    public void setTipo(Tipo Tipo) {
        this.Tipo = Tipo;
    }
    
    
    
}

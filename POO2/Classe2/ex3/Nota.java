/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex1Classe.n2;

import javax.xml.crypto.Data;

/**
 *
 * @author felipe
 */
public class Nota {
    
    private Integer codigo;
    private Data date;
    private Double valorTotal;
    private Cliente cliente;
    private Vendedor vendedor;

    //falta mapeamento itemprodfuo
    public Nota(Integer codigo, Data date, Double valorTotal, Cliente cliente, Vendedor vendedor) {
        this.codigo = codigo;
        this.date = date;
        this.valorTotal = valorTotal;
        this.cliente = cliente;
        this.vendedor = vendedor;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Data getDate() {
        return date;
    }

    public void setDate(Data date) {
        this.date = date;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    
    
    
}

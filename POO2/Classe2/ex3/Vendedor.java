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
public class Vendedor extends Pessoa{
    
    private Integer id;
    private Integer comisao;

    public Vendedor(Integer id, Integer comisao, String nome, Integer codigo, String email) {
        super(nome, codigo, email);
        this.id = id;
        this.comisao = comisao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getComisao() {
        return comisao;
    }

    public void setComisao(Integer comisao) {
        this.comisao = comisao;
    }




    
    
}

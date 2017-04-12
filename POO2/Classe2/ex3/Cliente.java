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
public class Cliente extends Pessoa{
    
    private Integer vip;
    private Integer id;

    public Cliente(Integer vip, Integer id, String nome, Integer codigo, String email) {
        super(nome, codigo, email);
        this.vip = vip;
        this.id = id;
    }

    public Integer getVip() {
        return vip;
    }

    public void setVip(Integer vip) {
        this.vip = vip;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }





    
    
}

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
public class Consultorio {
    
    private Integer codigo;
    private Integer sala;
    private Integer andar;

    public Consultorio(Integer codigo, Integer sala, Integer andar) {
        this.codigo = codigo;
        this.sala = sala;
        this.andar = andar;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getSala() {
        return sala;
    }

    public void setSala(Integer sala) {
        this.sala = sala;
    }

    public Integer getAndar() {
        return andar;
    }

    public void setAndar(Integer andar) {
        this.andar = andar;
    }
    
    
}

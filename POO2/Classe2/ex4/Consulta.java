/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex1Classe.n3;

import javax.xml.crypto.Data;

/**
 *
 * @author felipe
 */
public class Consulta {
    
    
    private Integer codigo;
    private Data date;
    private Paciente paciente;
    private Medico medico;
    private Consutorio consultorio;

    public Consulta(Integer codigo, Data date, Paciente paciente, Medico medico, Consutorio consultorio) {
        this.codigo = codigo;
        this.date = date;
        this.paciente = paciente;
        this.medico = medico;
        this.consultorio = consultorio;
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

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Consutorio getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(Consutorio consultorio) {
        this.consultorio = consultorio;
    }

   
    
    
    
            
    
    
}

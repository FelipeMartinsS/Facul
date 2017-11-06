package model;

import java.util.Date;

public class Aluno {
    
    private String nome;
    private String sobreNome;
    private String matricula;
    private String senha;
    private Nota nota;
    private String cpf;
    private String rg;
    private String telefone;
    private String endereco;
    private String descricao;
    private String profissao;
    private Date dataNascimento;
    
	public Aluno(String nome, String sobreNome, String matricula, String senha, Nota nota) {
		
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.matricula = matricula;
		this.senha = senha;
		this.nota = nota;
	}
	
	public Aluno() {
		

	}
	
	
	
	public Aluno(String nome, String sobreNome, String matricula, String senha) {
		
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.matricula = matricula;
		this.senha = senha;
	}
    
    public String getNome() {
         return nome;
    }
    
    public void setNome(String nome) {
         this.nome = nome;
    }
    
    public String getCpf() {
         return cpf;
    }
    
    public void setCpf(String cpf) {
         this.cpf = cpf;
    }
    
    public String getTelefone() {
         return telefone;
    }
    
    public void setTelefone(String telefone) {
         this.telefone = telefone;
    }
    
    public String getEndereco() {
         return endereco;
    }
    
    public void setEndereco(String endereco) {
         this.endereco = endereco;
    }
    
    public String getDescricao() {
         return descricao;
    }
    
    public void setDescricao(String descricao) {
         this.descricao = descricao;
    }

    public String getRg() {
         return rg;
    }

    public void setRg(String rg) {
         this.rg = rg;
    }

    public Date getDataNascimento() {
         return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
         this.dataNascimento = dataNascimento;
    }



    public String getProfissao() {
         return profissao;
    }

    public void setProfissao(String profissao) {
         this.profissao = profissao;
    }

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Nota getNota() {
		return nota;
	}

	public void setNota(Nota nota) {
		this.nota = nota;
	}

    
}
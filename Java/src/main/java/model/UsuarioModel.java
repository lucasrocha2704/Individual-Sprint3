package model;

import dao.UsuarioDao;

public class UsuarioModel {

    private Integer idUsuario;
    private Integer fkEmpresa;
    private Integer fkAdmin;
    private String nome;
    private String senha;
    private String cpf;
    private String email;
    private UsuarioDao usuarioDao;

    public UsuarioModel() {
        this.usuarioDao = new UsuarioDao();
    }

    public Integer cadastrar(Integer empresa, String nome, String senha, String cpf, String email){
        return usuarioDao.inserirUsuario(empresa, nome, cpf, email, senha);
    }
    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getFkEmpresa() {
        return fkEmpresa;
    }

    public void setFkEmpresa(Integer fkEmpresa) {
        this.fkEmpresa = fkEmpresa;
    }

    public Integer getFkAdmin() {
        return fkAdmin;
    }

    public void setFkAdmin(Integer fkAdmin) {
        this.fkAdmin = fkAdmin;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UsuarioDao getUsuarioDao() {
        return usuarioDao;
    }

    public void setUsuarioDao(UsuarioDao usuarioDao) {
        this.usuarioDao = usuarioDao;
    }

    @Override
    public String toString() {
        return "UsuarioModel{" +
                "idUsuario=" + idUsuario +
                ", fkEmpresa=" + fkEmpresa +
                ", fkAdmin=" + fkAdmin +
                ", nome='" + nome + '\'' +
                ", senha='" + senha + '\'' +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                ", usuarioDao=" + usuarioDao +
                '}';
    }
}

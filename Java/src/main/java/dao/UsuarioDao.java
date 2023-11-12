package dao;

import model.EmpresaModel;
import model.UsuarioModel;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UsuarioDao {

    private JdbcTemplate con;
    private Conexao conexao = new Conexao();

    public UsuarioDao() {
        this.con = conexao.getConexaoDoBanco();
    }

    public Integer inserirUsuario(Integer empresa, String nome, String cpf ,String email, String senha){
        String insert = "INSERT INTO Usuario VALUES(NULL, ?, 1, ?, ?, ?, ?)";
        return con.update(insert, empresa, nome, senha, cpf, email);
    }

    public List<EmpresaModel> mostrarEmpresas(){
        String select = "SELECT * FROM Empresa";
        return con.query(select, new BeanPropertyRowMapper<>(EmpresaModel.class));
    }
}

package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import util.Conexao;

public class AdvogadoDao {
	Connection con;
	ResultSet rs;
	
	public void Salvar(Advogado adv) {
		try {
		con = new Conexao().conectar();
		String sql="insert into advogado (oab,nome,telefone) values(?,?,?)";
		
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setInt(1, adv.getOab());
		stmt.setString(2, adv.getNome());
		stmt.setString(3, adv.getTelefone());
	
		stmt.executeUpdate();
		
		stmt.close();
		}
		catch(Exception erro){
			
		}
	    }
		public ArrayList<Advogado>Listar(){
		try {
			con = new Conexao().conectar();
			ArrayList<Advogado> advogados = new ArrayList<>();
			String sql ="select * from advogado";
			PreparedStatement stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			while(rs.next()) {
				int oab = rs.getInt(1);
				String nome = rs.getString(2);
				String telefone = rs.getString(3);
				String tipocausas = rs.getString(4);
				advogados.add(new Advogado(oab,nome,telefone,tipocausas));	
			}
			return advogados;
				
			
		}catch(Exception erro) {
			System.out.println(erro);
			return null;
		}
		}

}

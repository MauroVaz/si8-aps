package com.unip.aps.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.unip.aps.factory.HikariCP3ConnectionFactory;
import com.unip.aps.entity.PessoaEntity;

public class PessoaValoresDAO {
	
	public void insertPessoa(PessoaEntity itemEntity) {
		try (Connection connection = HikariCP3ConnectionFactory.getInstance().getConnection()){
			PreparedStatement pstmt = null;
			
			final String transaction = "INSERT INTO pessoa VALUES (?,?,?,?,?,?)";

			try {
				pstmt = connection.prepareStatement(transaction);
	
				pstmt.setString(1, itemEntity.getUUID());
				pstmt.setBoolean(2,itemEntity.getAtiva());
				pstmt.setString(3,itemEntity.getCpf());
				pstmt.setString(4,itemEntity.getCel());
				pstmt.setString(5,itemEntity.getTel());
				pstmt.setString(6,itemEntity.getNome());
				pstmt.executeUpdate();
				pstmt.getConnection().commit();
			}catch(Exception e){
				e.printStackTrace();
			}finally {
				if (connection != null) {
					connection.close();
					pstmt.close();
				}
			}
		} catch (SQLException e1) {
		e1.printStackTrace();
		}
	}
	
	public int retorno(String id) {
		
		
		try (Connection connection = HikariCP3ConnectionFactory.getInstance().getConnection()){
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			PessoaEntity userEntity = new PessoaEntity();
			
			final String selectUser = "SELECT total FROM valores where UUID = ?";
			try {
				pstmt = connection.prepareStatement(selectUser);
				pstmt.setString(1, id);
				rs = pstmt.executeQuery();
				
				while(rs.next()) {
					userEntity.setTotal(rs.getInt("total"));
				}
			return userEntity.getTotal();
			}catch(Exception e){
				e.printStackTrace();
				return 0;
			}finally {
				if (connection != null) {
					connection.close();
					pstmt.close();
					rs.close();
				}
			}
	} catch (SQLException e1) {
		e1.printStackTrace();
		return 0;
	}
}
	
	

}

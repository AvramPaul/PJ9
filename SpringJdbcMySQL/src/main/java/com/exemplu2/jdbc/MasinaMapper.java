package com.exemplu2.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class MasinaMapper implements RowMapper<Masina>{
	@Override
	public Masina mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new Masina(rs.getString("nr"), rs.getString("marca"), rs.getInt("an"), rs.getString("culoare"), rs.getInt("km"));
	}
}

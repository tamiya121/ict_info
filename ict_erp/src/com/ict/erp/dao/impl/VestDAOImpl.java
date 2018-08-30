package com.ict.erp.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ict.erp.dao.VestDAO;
import com.ict.erp.vo.MenuInfo;

import oracle.net.aso.p;

public class VestDAOImpl extends CommonDAOImpl implements VestDAO {
	

	@Override
	public void setConnection(Connection con) {
		// TODO Auto-generated method stub

	}

	@Override
	public int totalCount(String tableName) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<MenuInfo> selectMenuList(MenuInfo m) throws SQLException {
		String sql = "select * from Menu_info";
		List<MenuInfo> mList = new ArrayList<MenuInfo>();
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				MenuInfo mi = new MenuInfo(rs.getLong("meiNum"), rs.getString("meiName"), rs.getLong("meiPrice"), rs.getString("meiDesc"));
				mList.add(mi);
			}
			return mList;
		}catch(SQLException e) {
			throw e;
		}finally {
			close();
		}
	}

	@Override
	public MenuInfo selectMenu(MenuInfo m) throws SQLException {
		String sql = "select * from Menu_info where meiNum=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setLong(1, m.getMeiNum());
			rs = ps.executeQuery();
			while(rs.next()) {
				MenuInfo mi = new MenuInfo(rs.getLong("meiNum"), rs.getString("meiName"), rs.getLong("meiPrice"), rs.getString("meiDesc"));
				
				return mi;
			}
		}catch(SQLException e) {
			throw e;
		}finally {
			close();
		}
		return null;
	}

	@Override
	public int insertMenu(MenuInfo m) throws SQLException {
		String sql = "insert into Menu_info (meiNum, meiName, meiPrice, meiDesc)";  
		sql += " values(seq_meiNum.nextval,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, m.getMeiName());
			ps.setLong(2, m.getMeiPrice());
			ps.setString(3, m.getMeiDesc());
			return ps.executeUpdate();
			
		}catch(SQLException e) {
			throw e;
		}finally {
			close();
		}
		
	}

	@Override
	public int updateMenu(MenuInfo m) throws SQLException {
		String sql = "update menu_info set \r\n"+
				"MEINAME=?,\r\n" +
				"MEIPRICE=?,\r\n" +
				"MEIDESC=?" +
				" where MEINUM=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setLong(1, m.getMeiNum());
			ps.setString(2, m.getMeiName());
			ps.setLong(3, m.getMeiPrice());
			ps.setString(4, m.getMeiDesc());
			return ps.executeUpdate();
			
			
		}catch(SQLException e) {
			throw e;
		}finally {
			close();
		}
	}

	@Override
	public int deleteMenu(MenuInfo m) throws SQLException {
		String sql = "delete from Menu_info where meiNum=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setLong(1, m.getMeiNum());
			return ps.executeUpdate();
			
			
		}catch(SQLException e) {
			throw e;
		}finally {
			close();
		}
	}

}

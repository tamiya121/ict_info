package com.ict.erp.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.ict.erp.common.DBCon;
import com.ict.erp.dao.VestDAO;
import com.ict.erp.dao.impl.VestDAOImpl;
import com.ict.erp.service.VestService;
import com.ict.erp.vo.MenuInfo;

public class VestServiceImpl implements VestService {
	private VestDAO vdao = new VestDAOImpl();

	@Override
	public List<MenuInfo> selectMenuList(MenuInfo m) throws SQLException {
		vdao.setConnection(DBCon.getCon());
		try {
			return vdao.selectMenuList(m);
		} catch (SQLException e) {
			throw e;
		} finally {
			DBCon.close();
		}
	}

	@Override
	public MenuInfo selectMenu(MenuInfo m) throws SQLException {
		vdao.setConnection(DBCon.getCon());
		try {
			return vdao.selectMenu(m);
			
		}catch(SQLException e) {
			throw e;
		}finally {
			DBCon.close();
		}
	}

	@Override
	public int insertMenu(MenuInfo m) throws SQLException {
		vdao.setConnection(DBCon.getCon());
		try {
			return vdao.insertMenu(m);
			
		}catch(SQLException e) {
			throw e;
		}finally {
			DBCon.close();
		}
	}

	@Override
	public int updateMenu(MenuInfo m) throws SQLException {
		vdao.setConnection(DBCon.getCon());
		try {
			return vdao.updateMenu(m);
			
		}catch(SQLException e) {
			throw e;
		}finally {
			DBCon.close();
		}
	}

	@Override
	public int deleteMenu(MenuInfo m) throws SQLException {
		vdao.setConnection(DBCon.getCon());
		try {
			return vdao.deleteMenu(m);
			
		}catch(SQLException e) {
			throw e;
		}finally {
			DBCon.close();
		}
	}

}

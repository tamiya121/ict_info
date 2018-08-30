package com.ict.erp.dao;

import java.sql.SQLException;
import java.util.List;

import com.ict.erp.vo.MenuInfo;

public interface VestDAO extends CommonDAO {
	public List<MenuInfo> selectMenuList(MenuInfo m) throws SQLException;
	public MenuInfo selectMenu(MenuInfo m) throws SQLException;
	public int insertMenu(MenuInfo m) throws SQLException;
	public int updateMenu(MenuInfo m) throws SQLException;
	public int deleteMenu(MenuInfo m) throws SQLException;
}

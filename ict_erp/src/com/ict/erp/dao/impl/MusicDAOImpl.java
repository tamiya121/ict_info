package com.ict.erp.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ict.erp.dao.MusicDAO;
import com.ict.erp.vo.MusicChart;

public class MusicDAOImpl extends CommonDAOImpl implements MusicDAO {

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
	public List<MusicChart> selectMusicList(MusicChart mc) throws SQLException {
		String sql = "select * from Music_Chart";
		List<MusicChart> mChart = new ArrayList<MusicChart>();
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				MusicChart m = new MusicChart(rs.getInt("mcNum"), rs.getString("mcName"), rs.getString("mcSinger"),
						rs.getString("mcVendor"), rs.getInt("mcLike"), rs.getInt("mcDisLike"), rs.getString("mcCredat"),
						rs.getString("mcDesc"));
				mChart.add(m);
			}
			return mChart;
		} catch (SQLException e) {
			throw e;

		} finally {
		}
	}

	@Override
	public MusicChart selectMusic(MusicChart mc) throws SQLException {
		String sql = "select * from Music_Chart where mcNum=?";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			ps.setInt(1, mc.getMcNum());
			return mc;
			
		}catch(SQLException e) {
			throw e;
		}finally {
			close();
		}
	}

	@Override
	public int insertMusic(MusicChart mc) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateMusic(MusicChart mc) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteMusic(MusicChart mc) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}

import java.sql.SQLException;

import com.ict.erp.common.DBCon;
import com.ict.erp.dao.MenuDAO;
import com.ict.erp.dao.impl.MenuDAOImpl;
import com.ict.erp.vo.MenuInfo;

public class MenuCRUD {
	static private MenuDAO mdao;
	@BeforeAll
	void init() {
		mdao = new MenuDAOImpl();
		mdao.setConnection(DBCon.getCon());
		
	}
	
	@Test
	void insertMenu() throws SQLException{
		System.out.println();
		MenuInfo mi = new MenuInfo(null,"뻬쉐", 200000l, "겁내 얼큰함.");
		assertEquals(1, mdao.insertMenu(mi));
	}
	@AfterAll
	public void finish() {
		DBCon.commit();
		DBCon.close();
	}
	
}

package selfstudy_DAO;

public class DaoExample {
	public static void dbWork(DaOAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {
		dbWork(new OracleDao());
	}
}

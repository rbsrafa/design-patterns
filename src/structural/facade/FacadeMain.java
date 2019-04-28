package structural.facade;

public class FacadeMain {

	public FacadeMain() {
		
		facade();
	}
	
	public void facade() {
		
		String tableName = "dataToReport";
        
        // Not using the facade
        Connection conn = MySqlHelper.getMySqlDBConnection();
        MySqlHelper mySqlHelper = new MySqlHelper();
        mySqlHelper.generateMySqlHTMLReport(tableName, conn);
        
        Connection conn2 = OracleHelper.getOracleDBConnection();
        OracleHelper oracleHelper = new OracleHelper();
        oracleHelper.generateOraclePDFReport(tableName, conn2);
        
        // Using the facade
        HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL, HelperFacade.ReportTypes.HTML, tableName);
        HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE, HelperFacade.ReportTypes.PDF, tableName);
        
	}
	
}

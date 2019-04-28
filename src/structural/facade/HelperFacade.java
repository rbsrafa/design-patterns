/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.facade;

/**
 *
 * @author apont
 */
public class HelperFacade {
    
    public static enum DBTypes{
        MYSQL, 
        ORACLE;
    }
    
    public static enum ReportTypes{
        HTML,
        PDF;
    }
    
    public static void generateReport(DBTypes dbType, ReportTypes reportType, String tableName){
        
        Connection conn = null;
        
        switch(dbType){
            case MYSQL:
                conn = MySqlHelper.getMySqlDBConnection();
                MySqlHelper mySqlHelper = new MySqlHelper();
                
                switch(reportType){
                    case HTML:
                        mySqlHelper.generateMySqlHTMLReport(tableName, conn);
                        break;
                    case PDF:
                        mySqlHelper.generateMySqlPDFReport(tableName, conn);
                        break;
                }
                break;
            case ORACLE:
                conn = OracleHelper.getOracleDBConnection();
                OracleHelper oracleHelper = new OracleHelper();
                
                switch(reportType){
                    case HTML:
                        oracleHelper.generateOracleHTMLReport(tableName, conn);
                        break;
                    case PDF:
                        oracleHelper.generateOraclePDFReport(tableName, conn);
                        break;
                }
                break;
        }
        
        
    }
    
}

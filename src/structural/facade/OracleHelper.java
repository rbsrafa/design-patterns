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
public class OracleHelper {
    
    public static Connection getOracleDBConnection(){
        return new Connection("Oracle");
    }
    
    public void generateOraclePDFReport(String tableName, Connection conn){
    	System.out.println("This is your PDF report for the table: " + tableName);
    }
    
    public void generateOracleHTMLReport(String tableName, Connection conn){
    	System.out.println("This is your HTML report for the table: " + tableName);
    }
    

}

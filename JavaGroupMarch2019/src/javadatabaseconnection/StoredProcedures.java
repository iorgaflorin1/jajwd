/*
 * a-sti.ro
 */
package javadatabaseconnection;

//import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author gheorgheaurelpacurar
 */
public class StoredProcedures {
/**
     *
     * @param sCodJudet
     * @param sDenumireJudet
     * @throws SQLException
     */    
    public static void insertJudet(String sCodJudet, String sDenumireJudet) throws SQLException {
        String user = "test";
        String password = "test";
        String url = "jdbc:derby://localhost:1527/persoane;create=true";
        String driver = "org.apache.derby.jdbc.ClientDriver";
        Connection connection = null;
        ResultSet resultSet = null;
        PreparedStatement pstmnt = null;
        try
        {
            Class driverClass = Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            //statement = connection.createStatement();
            /*
             ***************************** call stored procedure - EXAMPLE ***************************************

            CallableStatement storedProcedureInsertJudet = connection.prepareCall("{call INSERT_JUDET(?,?)}");
            storedProcedureInsertJudet.setShort("codJudet", Short.parseShort(sCodJudet));
            storedProcedureInsertJudet.setString("sDenumire", sDenumireJudet);
            storedProcedureInsertJudet.executeUpdate();
                        */
            /*
             **************************************** call prepared statement - EXAMPLE
            */

            String DML = "INSERT INTO JUDETE VALUES (?, ?)";
            pstmnt = connection.prepareStatement(DML);
            pstmnt.setShort(1, Short.parseShort(sCodJudet));
            pstmnt.setString(2, sDenumireJudet);
            pstmnt.execute();

        }
        catch (ClassNotFoundException | SQLException | NumberFormatException ex)
        {
            System.out.println("SQL exception:"+ex.getMessage());
        }
        finally
        {
            if (resultSet != null)
            {
                try
                {
                    resultSet.close();
                }
                catch (SQLException ex){System.out.println("SQL exception:"+ex.getMessage());}
            }
            if (null != pstmnt )
            {
                try
                {
                    pstmnt.close();
                }
                catch (SQLException ex){System.out.println("SQL exception:"+ex.getMessage());}
            }	
            if (connection != null)
            {
                try
                {
                    connection.close();
                }
                catch (SQLException ex){System.out.println("SQL exception:"+ex.getMessage());}
            }
        }  
    }    
    
}

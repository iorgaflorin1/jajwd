/*
 * a-sti.ro
 */
package javadatabaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Formatter;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author gheorgheaurelpacurar
 */
public class ApelPreparedStatements {
    public static void main (String[] args)
    {
        String user = "test";
        String password = "test";
        String url = "jdbc:derby://localhost:1527/persoane;create=true";
        String driver = "org.apache.derby.jdbc.ClientDriver";
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try
        {
            try {
                Class driverClass = Class.forName(driver);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ApelPreparedStatements.class.getName()).log(Level.SEVERE, null, ex);
            }
            connection = DriverManager.getConnection(url, user, password);
            //start transaction
            connection.setAutoCommit(false); // start transaction in JavaDB
            //insert a new person using prepared statements for persons, localitati and judete.
            // if an exception will occur excetion will be catched. If nor we make commit.
            String cnpTest = "'1930323024511'";
            String cnp = "1930323024511";
            String codLocalitate = "40";
            String codJudet = "40";
            String denumireLocalitate = "BOLINTIN VALE";
            String denumireJudet = "ILFOV";
            statement = connection.createStatement();
            // test if person is not already in table persoane
            String query = "SELECT CNP FROM PERSOANE WHERE CNP="+cnpTest;
            resultSet = null;
            resultSet = statement.executeQuery(query);
            if (!resultSet.next())             
                insertPersoana(cnp, "ADRIAN", "POPESCU", "44", codLocalitate);
            else{
                System.out.println("Persona having cnp="+cnp+" is already in our DB.");
            }
            //check if localitate isn't already in the list of localities and judet in judete
            statement = connection.createStatement();
            query = "SELECT COD FROM LOCALITATI WHERE COD="+codLocalitate;
            resultSet = null;
            resultSet = statement.executeQuery(query);
            if (!resultSet.next())            
                insertLocalitate(codLocalitate, denumireLocalitate, codJudet);
            else{
                System.out.println("Localitate having cod="+codLocalitate+" is already in our DB.");
            } 
            //check if judet is already there
            query = "SELECT COD_JUDET FROM JUDETE WHERE COD_JUDET="+codJudet;
            resultSet = null;
            resultSet = statement.executeQuery(query);
            if (!resultSet.next())            
                StoredProcedures.insertJudet(codJudet, denumireJudet);        
            else{
                System.out.println("Judetul having cod="+codJudet+" is already in our DB.");
            }            
            // commit transaction
            connection.commit();
            //we read persons informations to check our insert
            connection.setAutoCommit(true);  // end transaction in Java DB
            // display the rows in table after insert
            statement = connection.createStatement();
            query = "SELECT PERSOANE.CNP,PERSOANE.NAME,PERSOANE.SURNAME,PERSOANE.AGE, LOCALITATI.DENUMIRE AS LOCALITATE, JUDETE.DENUMIRE AS JUDET \n" +
                            "FROM PERSOANE, LOCALITATI, JUDETE\n" +
                            "WHERE PERSOANE.COD_LOCALITATE=LOCALITATI.COD AND LOCALITATI.COD_JUDET=JUDETE.COD_JUDET";
            resultSet = statement.executeQuery(query);
            if (resultSet!=null)
            {
                // format report header
                StringBuilder sb = new StringBuilder();
                Formatter formatter = new Formatter(sb, Locale.US);
                formatter.format("%1$-13s %2$-25s %3$-25s %4$-6s %5$-15s %6$-15s","CNP", "NUME", "PRENUME", "VARSTA", "LOCALITATE", "JUDET");
                //System.out.println(currentCNP +currentPersoaneNume+currentPersoanePrenume+currentPersoaneVarsta+currentPersoaneDomiciliul+currentLocalitatiDenumire+currentJudeteDenumire);
                System.out.println(sb.toString());
                System.out.println("============="+ "========================="+ "========================="+ "======"+ "==============="+ "==============="+"==================");
                // display the content of table row by row
                while(resultSet.next()){
                    String currentCNP = resultSet.getString(1);
                    String currentPersoaneNume = resultSet.getString(2);
                    String currentPersoanePrenume = resultSet.getString(3);
                    String currentPersoaneVarsta = resultSet.getString(4);
                    String currentLocalitatiDenumire = resultSet.getString(5);
                    String currentJudeteDenumire = resultSet.getString(6);
                    sb = new StringBuilder();
                    formatter = new Formatter(sb, Locale.US);
                    formatter.format("%1$-13s %2$-25s %3$-25s %4$-6s %5$-15s %6$-15s",currentCNP, currentPersoaneNume, currentPersoanePrenume, currentPersoaneVarsta, currentLocalitatiDenumire, currentJudeteDenumire);
                    //System.out.println(currentCNP +currentPersoaneNume+currentPersoanePrenume+currentPersoaneVarsta+currentPersoaneDomiciliul+currentLocalitatiDenumire+currentJudeteDenumire);
                    System.out.println(sb.toString());
                }
            }
            else
            {
                System.out.println("No rows found in ResultSet");
            }
  
        } 
        catch (SQLException ex)
        {
            System.out.println("SQL exception:"+ex.getMessage());
            try {
                if(null != connection)
                    connection.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(ApelPreparedStatements.class.getName()).log(Level.SEVERE, null, ex1);
            }  
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
            if (statement != null)
            {
                try
                {
                    statement.close();
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
    /**
     * Methods call a database stored insert with parameters prepared statement
     * @param sCNP
     * @param sNume
     * @param sPrenume
     * @param sVarsta
     * @param sCodLocalitate
     * @throws SQLException
     */
    public static void insertPersoana(String sCNP, String sNume, String sPrenume, String sVarsta, String sCodLocalitate) throws SQLException {
        String user = "test";
        String password = "test";
        String url = "jdbc:derby://localhost:1527/persoane;create=true";
        String driver = "org.apache.derby.jdbc.ClientDriver";
        Connection connection = null;
        ResultSet resultSet = null;
        String DML;
        PreparedStatement pstmnt = null;
        try
        {
            Class driverClass = Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            //statement = connection.createStatement();
            //call prepared statement to insert a new person
            DML = "INSERT INTO PERSOANE VALUES (?, ?, ?, ?, ?)";
            pstmnt = connection.prepareStatement(DML);
            pstmnt.setString(1, sCNP);
            pstmnt.setString(2, sNume);
            pstmnt.setString(3, sPrenume);
            pstmnt.setShort(4, Short.parseShort(sVarsta));
            pstmnt.setShort(5, Short.parseShort(sCodLocalitate));
            pstmnt.execute();
        }
        catch (ClassNotFoundException | NumberFormatException | SQLException ex)
        {
            throw new SQLException();
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
            if (pstmnt != null)
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
    } // prepared statement call
    /**
     * insertLocalitate inserts a new record to Localitati table
     * @param sCodLocalitate
     * @param sDenumireLocalitate
     * @param sCodJudet
     * @throws SQLException
     */
    public static void insertLocalitate(String sCodLocalitate, String sDenumireLocalitate, String sCodJudet) throws SQLException {
        String user = "test";
        String password = "test";
        String url = "jdbc:derby://localhost:1527/persoane;create=true";
        String driver = "org.apache.derby.jdbc.ClientDriver";
        Connection connection = null;
        ResultSet resultSet = null;
        String DML;
        PreparedStatement pstmnt = null;
        try
        {
            Class driverClass = Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            // call prepared statement to add a new localitate
            DML = "INSERT INTO LOCALITATI VALUES (?, ?, ?)";
            pstmnt = connection.prepareStatement(DML);
            pstmnt.setShort(1, Short.parseShort(sCodLocalitate));
            pstmnt.setString(2, sDenumireLocalitate);
            pstmnt.setShort(3, Short.parseShort(sCodJudet));
            pstmnt.execute();
        }
        catch (ClassNotFoundException | NumberFormatException | SQLException ex)
        {
            System.out.println("Exception:"+ex.getMessage()); 
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
            if (pstmnt != null)
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
    } // prepared statements call 
}

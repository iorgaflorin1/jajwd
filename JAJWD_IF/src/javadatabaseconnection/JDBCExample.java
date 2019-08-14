/*
 * a-sti.ro
 */
package javadatabaseconnection;

import java.sql.*;
/**
 *
 * @author gheorgheaurelpacurar
 */
public class JDBCExample {
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
            Class driverClass = Class.forName(driver); //tests if driver class for Java DB is correct
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT CNP, NAME, SURNAME, AGE FROM PERSOANE");
            // if there is a result
            if (null!=resultSet)
            {
                String currentCNP;
                String currentName;
                String currentSurname;
                int currentAge;
                // print table header
                System.out.printf("%13s"+"    "+"%8s"+"    "+"%8s"+"    "+"%8s"+"\n", "CNP", "NAME", "SURNAME","AGE" );
                System.out.println("=============    ========    ========    ========");
                // print table rows one by one
                while(resultSet.next()){
                    currentCNP = resultSet.getString(1);        // first column from SELECT
                    currentName = resultSet.getString(2);       // second column in SELECT
                    currentSurname = resultSet.getString(3);    // 3rd colum in SELECT
                    currentAge = resultSet.getInt(4);           // 4th column in select
                    System.out.printf("%13s"+"    "+"%8s"+"    "+"%8s"+"    "+"%8s"+"\n", currentCNP, currentName, currentSurname,currentAge );
                }
            }
            else
            {
                System.out.println("No rows found in ResultSet");
            }
        }
        catch (ClassNotFoundException | SQLException ex)
        {
            System.out.println(ex);
        }
        finally
        {
            if (resultSet != null)
            {
                try
                {
                    resultSet.close();
                }
                catch (SQLException ex){System.out.println(ex);}
            }
            if (statement != null)
            {
                try
                {
                    statement.close();
                }
                catch (SQLException ex){System.out.println(ex);}
            }	
            if (connection != null)
            {
                try
                {
                    connection.close();
                }
                catch (SQLException ex){System.out.println(ex);}
            }
        }	
    }
}

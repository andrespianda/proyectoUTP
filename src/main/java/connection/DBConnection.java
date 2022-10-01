/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author andre
 */
public class DBConnection {

    Connection connection;

    /* static String bd = "the_pet_shop";
    static String port = "3306";
    static String login = "root";
    static String password = "admin";*/
    
    static String bd = "railway";
    static String ip = "containers-us-west-88.railway.app" ;
    static String password = "vvGYWp3c4MAwPqKMUv23";
    static String port = "7198";
    static String login = "root";

    /*MYSQL_URL=mysql://${{ MYSQLUSER }}:${{ MYSQLPASSWORD }}@${{ MYSQLHOST }}:${{ MYSQLPORT }}/${{ MYSQLDATABASE }}*/

    public DBConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //String url = "jdbc:mysql://localhost:" + this.port + "/" + this.bd;
            String url = "jdbc:mysql://"+ DBConnection.ip +":" + DBConnection.port + "/" + DBConnection.bd;
            //connection = DriverManager.getConnection(url, this.login, this.password);
            connection = DriverManager.getConnection(url, DBConnection.login, DBConnection.password);
            System.out.println("Listo, conectado!!");
        } catch (Exception e) {
            System.out.println("La cagaste en algo, revisa!!");
        }
    }

    public Connection getConnection() {

        return connection;
    }

    public void desconectar() {
        connection = null;
    }

}


package test;

import beans.ProductoPet;
import connection.DBConnection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author andre
 */
public class OperacionesDB {
    public static void main(String[] args) {
        
        /*listarPelicula();*/
        /*actualizarPelicula(12, "Terror");*/        
    }
    
    
    /**
     * Creacion de CRUD
     */
    
    public static void actualizarProducto(int id_Prpoducto, String producto) {
        DBConnection con = new DBConnection();
        buscarProducto(id_Prpoducto);
        String sql = "UPDATE producto SET tipoProducto = '"+ producto + "' WHERE id = " + id_Prpoducto;
        
        try {
            Statement st = con.getConnection().createStatement();
            
            
            st.executeUpdate(sql);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally{
            con.desconectar();
        }
        
        buscarProducto(id_Prpoducto);
    }
    
    public static void listadoProducto() {
        DBConnection con = new DBConnection();
        String sql = "SELECT * FROM producto";
        
        try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()) {
                int id =  rs.getInt("id_Producto");
                int tipoProducto =  rs.getInt("tipoProducto");
                int cantidad =  rs.getInt("cantidad");
                Date fechaCompra = rs.getDate("fechaCompra");
                int idUsuario =  rs.getInt("idUsuario");
                
                
                ProductoPet productos =  new ProductoPet(id, tipoProducto, cantidad, fechaCompra, idUsuario);
                System.out.println(productos.toString());
            }
            
            st.executeQuery(sql);
            
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally{
            con.desconectar();
        }
    }
    
    public static void buscarProducto(int Nid) {
        DBConnection con = new DBConnection();
        String sql = "SELECT * FROM producto where id=" + Nid;
        
        try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            
             while (rs.next()) {
                int id =  rs.getInt("id_Producto");
                int tipoProducto =  rs.getInt("tipoProducto");
                int cantidad =  rs.getInt("cantidad");
                Date fechaCompra = rs.getDate("fechaCompra");
                int idUsuario =  rs.getInt("idUsuario");
                
                
                ProductoPet productos =  new ProductoPet(id, tipoProducto, cantidad, fechaCompra, idUsuario);
                System.out.println(productos.toString());
            }
            
            st.executeQuery(sql);
            
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally{
            con.desconectar();
        }
        
        
    }
}

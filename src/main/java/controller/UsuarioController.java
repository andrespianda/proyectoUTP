
package controller;

import java.sql.ResultSet;
import java.sql.Statement;
import com.google.gson.Gson;
import beans.Usuario;
import connection.DBConnection;
import java.util.HashMap;
import java.util.Map;

public class UsuarioController implements IUsuarioController{
    
      @Override
    public String login(String username, String contrasena) {

        Gson gson = new Gson();

        DBConnection con = new DBConnection();

        String sql = "SELECT * FROM usuario WHERE username = '" + username + "' and contrasena = '" + contrasena + "'";
        try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String nombreUsuario = rs.getString("nombreUsuario");
                String apellidoUsuario = rs.getString("apellidoUsuario");
                String nombreMascota = rs.getString("nombreMascota");
                String razaMascota = rs.getString("razaMascota");
                String tipoMascota = rs.getString("tipoMascota");
                String correo = rs.getString("correo");
                String celular = rs.getString("celular");
                String direccion = rs.getString("direccion");
                int identificacionUsuario = rs.getInt("identificacionUsuario");
           

                Usuario usuario = new  Usuario(identificacionUsuario, username, nombreUsuario, apellidoUsuario, nombreMascota, razaMascota, tipoMascota, correo, celular, direccion, contrasena);
                return gson.toJson(usuario);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }

        return "false";
    }

    @Override
    public String register(String username, String contrasena, String nombreUsuario, String apellidoUsuario, String nombreMascota, String tipoMascota, String correo, String celular, String direccion, int identificacionUsuario, String razaMascota) {

        Gson gson = new Gson();
        
        
        

        DBConnection con = new DBConnection();
        String sql = "INSERT INTO usuario values('" + identificacionUsuario + "', '" + username + "', '" + nombreUsuario
                + "', '" + apellidoUsuario + "', '" + nombreMascota + "', '" + razaMascota + "', '" + tipoMascota + "', '" + correo +
                 "', '" + celular + "', '" + direccion + "', '" + contrasena +"')";
        
        System.out.println(sql);

        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);

            Usuario usuario = new Usuario( identificacionUsuario,  username, nombreUsuario,  apellidoUsuario,  nombreMascota,  razaMascota,  tipoMascota,  correo,  celular,  direccion,  contrasena);

            st.close();

            return gson.toJson(usuario);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        } finally {
            con.desconectar();
        }

        return "false";

    }
}

package controller;

import java.util.Map;

public interface IUsuarioController {

    public String login(String username, String contrasena);

    public String register(String username, String contrasena, String nombreUsuario, String apellidoUsuario, String nombreMascota, String tipoMascota, String correo, String celular, String direccion, int identificacionUsuario, String razaMascota);
}

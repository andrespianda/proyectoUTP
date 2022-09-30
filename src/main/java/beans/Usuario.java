/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

/**
 *
 * @author andre
 */
public class Usuario {
    private int identificacionUsuario;
    private String username;
    private String nombreUsuario;
    private String apellidoUsuario;
    private String nombreMascota;
    private String razaMascota;
    private String tipoMascota;
    private String correo;
    private String celular;
    private String direccion;
    private String contrasena;

    public Usuario(int identificacionUsuario, String username, String nombreUsuario, String apellidoUsuario, String nombreMascota, String razaMascota, String tipoMascota, String correo, String celular, String direccion, String contrasena) {
        this.identificacionUsuario = identificacionUsuario;
        this.username = username;
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.nombreMascota = nombreMascota;
        this.razaMascota = razaMascota;
        this.tipoMascota = tipoMascota;
        this.correo = correo;
        this.celular = celular;
        this.direccion = direccion;
        this.contrasena = contrasena;
    }

    public int getIdentificacionUsuario() {
        return identificacionUsuario;
    }

    public void setIdentificacionUsuario(int identificacionUsuario) {
        this.identificacionUsuario = identificacionUsuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getRazaMascota() {
        return razaMascota;
    }

    public void setRazaMascota(String razaMascota) {
        this.razaMascota = razaMascota;
    }

    public String getTipoMascota() {
        return tipoMascota;
    }

    public void setTipoMascota(String tipoMascota) {
        this.tipoMascota = tipoMascota;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "Usuario{" + "identificacionUsuario=" + identificacionUsuario + ", username=" + username + ", nombreUsuario=" + nombreUsuario + ", apellidoUsuario=" + apellidoUsuario + ", nombreMascota=" + nombreMascota + ", razaMascota=" + razaMascota + ", tipoMascota=" + tipoMascota + ", correo=" + correo + ", celular=" + celular + ", direccion=" + direccion + ", contrasena=" + contrasena + '}';
    }

    
    
            
}

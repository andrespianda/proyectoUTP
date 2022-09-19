/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

import java.sql.Date;
/* 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*/
/**
 *
 * @author andre
 */
public class ProductoPet {
    
    private int id_Producto;
    private int tipo_Producto;
    private int cantidad;
    private Date FechaCompra;
    private int idUsuario;

    public ProductoPet(int id_Producto, int tipo_Producto, int cantidad, Date FechaCompra, int idUsuario) {
        this.id_Producto = id_Producto;
        this.tipo_Producto = tipo_Producto;
        this.cantidad = cantidad;
        this.FechaCompra = FechaCompra;
        this.idUsuario = idUsuario;
    }

    public int getId_Producto() {
        return id_Producto;
    }

    public void setId_Producto(int id_Producto) {
        this.id_Producto = id_Producto;
    }

    public int getTipo_Producto() {
        return tipo_Producto;
    }

    public void setTipo_Producto(int tipo_Producto) {
        this.tipo_Producto = tipo_Producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFechaCompra() {
        return FechaCompra;
    }

    public void setFechaCompra(Date FechaCompra) {
        this.FechaCompra = FechaCompra;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public String toString() {
        return "ProductoPet{" + "id_Producto=" + id_Producto + ", tipo_Producto=" + tipo_Producto + ", cantidad=" + cantidad + ", FechaCompra=" + FechaCompra + ", idUsuario=" + idUsuario + '}';
    }
    
    
}

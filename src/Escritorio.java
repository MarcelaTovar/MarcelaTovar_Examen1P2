/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marcela
 */
public class Escritorio extends PC{
    private String Ram;
    private String almacenamiento;
    private String tipo;
    private boolean tarjetaGrafica;

    public Escritorio() {
    }

    public Escritorio(String Ram, String almacenamiento, String tipo, boolean tarjetaGrafica, String ip, String mascaraDeRed, String hostName) {
        super(ip, mascaraDeRed, hostName);
        this.Ram = Ram;
        this.almacenamiento = almacenamiento;
        this.tipo = tipo;
        this.tarjetaGrafica = tarjetaGrafica;
    }
    
    

    public String getRam() {
        return Ram;
    }

    public void setRam(String Ram) {
        this.Ram = Ram;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isTarjetaGrafica() {
        return tarjetaGrafica;
    }

    public void setTarjetaGrafica(boolean tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }

    @Override
    public String toString() {
        return super.toString()+"RAM-> "+this.Ram+"\nAlmacenamiento-> "+this.almacenamiento+"\nTipo-> "+this.tipo+"\nTarjeta Grafica->"+this.tarjetaGrafica;
    }
    
    
}

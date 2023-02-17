/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marcela
 */
public class Laptop extends PC{
    private String marca;
    private String definicionPantalla;
    private boolean RGB;

    public Laptop() {
    }

    public Laptop(String marca, String definicionPantalla, boolean RGB, String ip, String mascaraDeRed, String hostName) {
        super(ip, mascaraDeRed, hostName);
        this.marca = marca;
        this.definicionPantalla = definicionPantalla;
        this.RGB = RGB;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDefinicionPantalla() {
        return definicionPantalla;
    }

    public void setDefinicionPantalla(String definicionPantalla) {
        this.definicionPantalla = definicionPantalla;
    }

    public boolean isRGB() {
        return RGB;
    }

    public void setRGB(boolean RGB) {
        this.RGB = RGB;
    }

    @Override
    public String toString() {
        return super.toString()+"\nMarca-> "+this.marca+"\nDefinicion de Pantalla -> "+this.definicionPantalla+"\nRGB-> "+this.RGB;
    }

   
    
    
}

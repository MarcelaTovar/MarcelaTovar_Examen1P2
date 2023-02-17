/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class PC {
    protected String ip;
    protected String mascaraDeRed;
    protected String hostName;

    public PC() {
    }

    public PC(String ip, String mascaraDeRed, String hostName) {
        this.ip = ip;
        this.mascaraDeRed = mascaraDeRed;
        this.hostName = hostName;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMascaraDeRed() {
        return mascaraDeRed;
    }

    public void setMascaraDeRed(String mascaraDeRed) {
        this.mascaraDeRed = mascaraDeRed;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    @Override
    public String toString() {
        return "HostName-> "+this.hostName+"\nIP -> "+this.ip+"\nMascara de red-> "+this.mascaraDeRed;
    }
    
    
}

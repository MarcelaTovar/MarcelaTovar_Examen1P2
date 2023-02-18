
import java.util.ArrayList;
import java.util.Scanner;

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

    public void metodoPing(String IP_temporal, ArrayList<PC> Pcs, PC temp) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la direccion IP: ");
        IP_temporal = leer.next();
        boolean comparar = true;
        String ip_random = temp.getIp();
        String t[] = IP_temporal.split("_");
        String Ip_numeros[] = t[1].split(".");
        String ip_RandomToken[] = ip_random.split(".");
        for (int i = 0; i < Pcs.size(); i++) {
            PC tempo = Pcs.get(i);
            String compIP = tempo.getIp();
            if (t[1].equals(compIP)) {
                comparar = true;
                break;
            } else {
                comparar = false;
            }
        }
        if (comparar) {
            if (Ip_numeros[0].equals(ip_RandomToken[0])||Ip_numeros[1].equals(ip_RandomToken[1])||Ip_numeros[2].equals(ip_RandomToken[2])) {
                boolean part = true;
                int contador_unos = 0;
                String mascara_random = temp.getMascaraDeRed();
                String tokenMascaraRandom[] = mascara_random.split(".");
                int num_pos = Integer.parseInt(tokenMascaraRandom[3]);
                String binary_num = Integer.toBinaryString(num_pos);
                for (int i = 0; i < binary_num.length(); i++) {
                    String to = binary_num.charAt(i)+"";
                    if (to.equals("1")) {
                        contador_unos++;
                    }
                }
                String temporal = Ip_numeros[3];
                int temporal_binary_pos = Integer.parseInt(temporal);
                String binary_temp = Integer.toBinaryString(temporal_binary_pos);
                String IP_us = Ip_numeros[3];
                int us_binary_ = Integer.parseInt(IP_us);
                String binary_us_fin = Integer.toBinaryString(us_binary_);
                
                for (int i = 0; i < contador_unos; i++) {
                    String aux = binary_temp.charAt(i)+"";
                    String aux2 = binary_us_fin.charAt(i)+"";
                    if (aux.equals(aux2)) {
                        part = true;
                    }else{
                        part = false;
                    }
                }
                
                if (part) {
                    System.out.println("Pinging to " + t[1] + "with 32 bits of data");
                    System.out.println("Reply from "+ t[1] +": bytes = 32 time = 37 ms TIL = 46");
                    System.out.println("Reply from "+ t[1] +": bytes = 32 time = 37 ms TIL = 46");
                    System.out.println("Reply from "+ t[1] +": bytes = 32 time = 37 ms TIL = 46");
                    System.out.println("Reply from "+ t[1] +": bytes = 32 time = 37 ms TIL = 46");
                    System.out.println("Ping statistic for "+ t[1]);
                    System.out.println("    Packets: Sent = 4, Recieved = 4, Lost = 0( 0% Lost)");
                    System.out.println(t[0]);
                }else{
                    System.out.println("Pinging to " + t[1] + "with 32 bits of data");
                    System.out.println("Reply from "+ t[1] +": Destination host unrechable");
                    System.out.println("Reply from "+ t[1] +": Destination host unrechable");
                    System.out.println("Reply from "+ t[1] +": Destination host unrechable");
                    System.out.println("Reply from "+ t[1] +": Destination host unrechable");
                    System.out.println("Ping statistic for "+ t[1]);
                    System.out.println("    Packets: Sent = 4, Recieved = 4, Lost = 0( 0% Lost)");
                    System.out.println(t[0]);
                }
            }
        } else {
            System.out.println("Pinging to " + t[1] + "with 32 bits of data");
            System.out.println("Requested time out");
            System.out.println("Requested time out");
            System.out.println("Requested time out");
            System.out.println("Requested time out");
            System.out.println("Ping statistics for " + t[1]);
            System.out.println("    Packets: Sent 4, Recieved = 0, Lost = 4 (100% Lost)");
            System.out.println(t[0]);
        }
    }

    @Override
    public String toString() {
        return "HostName-> " + this.hostName + "\nIP -> " + this.ip + "\nMascara de red-> " + this.mascaraDeRed;
    }

}

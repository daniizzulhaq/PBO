/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package phone;

public class CellphoneMain {
  public static void main(String[] args) {
    Cellphone cp = new Cellphone("Redmi", "12 Lite");
    cp.powerOn();
    cp.volumeUp();
    cp.volumeUp();
    cp.volumeDown();
    cp.powerOff();
    cp.powerOff();
    cp.topUpPulsa(200000);
    int sisaPulsa = cp.getSisaPulsa();
    System.out.println("Sisa pulsa: " + sisaPulsa);
    cp.tambahKontak("Dani", "08123456789");
    cp.tambahKontak("Ahmad", "087654321");
    cp.lihatSemuaKontak();
    cp.cariKontak("Dani");
    cp.cariKontak("Ahmad");
  }
}

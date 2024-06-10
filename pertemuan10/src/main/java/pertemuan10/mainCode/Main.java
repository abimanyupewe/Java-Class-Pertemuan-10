/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan10.mainCode;

import pertemuan10.Mobil;
import pertemuan10.MobilMewah;

/**
 *
 * @author A-11
 */
public class Main {

    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        Mobil mobil2 = new Mobil("Navy", 300000, 300, "Mazda");
        Mobil mobil13 = new Mobil("Navy", "Alya");
        Mobil mobil4 = new MobilMewah("Eropa");
        mobil4.getInfo();
        mobil4.setHarga(600000);
        mobil4.getInfo();

        Mobil mobil1Mewah2 = new MobilMewah(15000000.00, "Ferarry");
        mobil1Mewah2.getInfo();

        mobil4.gasPol();
    }
}

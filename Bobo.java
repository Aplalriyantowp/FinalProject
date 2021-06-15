/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bobo;

/**
 *
 * @author User
 */
public class Bobo {
    String Nomorkursi;
    String Jumlahbeli;
    String Totalbayar;
    String Uangbayar;
    String Uangkembali;
    
    public Bobo(String Nomorkursi, String Jumlahbeli, String Totalbayar, String Uangbayar, String Uangkembali){
        this.Nomorkursi = Nomorkursi;
        this.Jumlahbeli = Jumlahbeli;
        this.Totalbayar = Totalbayar;
        this.Uangbayar = Uangbayar;
        this.Uangkembali = Uangkembali;
              
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Loginn lg = new Loginn();
        lg.setVisible(true);
        lg.pack();
        lg.setLocationRelativeTo(null);
        lg.setDefaultCloseOperation(Loginn.EXIT_ON_CLOSE);
    }
    
}

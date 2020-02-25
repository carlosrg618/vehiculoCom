/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculo;

/**
 *
 * @author Itzel
 */
public class SesionVehiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args, String Volkswagen, String Vocho) {
        Vehiculo carro1 = Vehiculo();
        carro1.setMarca(Volkswagen);
        carro1.setModelo(Vocho);
        carro1.setAño(1984);
        
        carro1.getFuncionamiento().setCilindros(6);
        System.out.println(carro1.getFuncionamiento().getTamanio());
        
        
    }

    private static Vehiculo Vehiculo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

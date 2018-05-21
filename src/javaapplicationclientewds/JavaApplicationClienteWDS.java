/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationclientewds;

/**
 *
 * @author EducaciónIT
 */
public class JavaApplicationClienteWDS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        HolaMundoWebService_Service holaMundoWebService_Service = 
                new HolaMundoWebService_Service();
        
        HolaMundoWebService holaMundoWebService = 
                holaMundoWebService_Service.getHolaMundoWebServicePort();
        
        int total = holaMundoWebService.sumar(10,10);
        
        System.out.println("el total es: " +total);
    }
    
}

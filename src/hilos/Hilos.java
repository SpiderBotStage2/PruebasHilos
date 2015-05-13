/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 *
 * @author Gustavo
 */
public class Hilos {

    /**
     * @param args the command line arguments
     */
    
    
    
    
    public static void main(String[] args) {
            MyThread myThread = new MyThread();
            myThread.start();  
            Thread thread = new Thread(new MyRunnable());
            thread.start();
        
                Arbol_binario carro = new Arbol_binario();
                carro.insert(5);
                carro.insert(30);
                carro.insert(45);
                carro.insert(12);
                carro.print();
                Arbol_binario carro2 = new Arbol_binario();
                carro2.insert(24);
                carro2.insert(30);
                carro2.insert(45);
                carro2.insert(12);
                carro2.print();
                Arbol_binario carro3 = new Arbol_binario();
                carro3.insert(25);
                carro3.insert(30);
                carro3.insert(45);
                carro3.insert(12);
                carro3.print();
                
    }
    
}

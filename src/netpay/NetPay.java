/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package netpay;

/**
 *
 * @author aemal4075
 */
public class NetPay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int h = 40; 
        int i = 2;
        int w = 5; 
        double t = .22;
        double pay = 0.0;
        // algorithm to NetPay
        
        pay = (h*w*i)-t*(h*w*i);
        System.out.println("the Net Pay of an employee is " + pay);
    }
    
}

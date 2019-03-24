/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projet2;

import java.util.Random;

/**
 *
 * @author Téo
 */
public class PassWord {
    int length;
    int cb;
    String password;
    PassWord(){
    
    }

   
    
    public String setPassWord(int length, int cb){
        Random rdm = new Random();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789%ù*µ$£çè#";
        String randomPassword ="";
      
        char[] Password = new char[length]; //password d'une longueur de character :length
        
       for(int u = 0; u < cb; u++){
            for(int i = 0; i < length; i++){ //tant que le mdp ne fait pas la taille length on continuer à prendre des random
                Password[i] = characters.charAt(rdm.nextInt(characters.length())); //au niveau du character x , celui-ci prend un random dans le string characters ABCD....
                randomPassword = new String(Password);
                //this.password = randomPassword;   
            }     
        }
    //Permet à la méthode getPassWord de récupérer les passwords générés
    this.password = randomPassword;
    //A mettre sinon Error NulPointerException
    return randomPassword;
      
    }
      
    public String getPassWord(String password){
        return password;
    }
    
    public void Afficher(){
        System.out.println("Voici le mot de passe : " + getPassWord(password));
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projet2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Téo
 */
public class PassWordGenerator {

       
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        //Demande Utilisateur
           System.out.println("Veuillez entrer le nombre de characteres dont sera composé votre mot de passe : ");
           Scanner sc = new Scanner(System.in);
           int x = sc.nextInt();
           System.out.println("Veuillez entrer le nombre de mot de passe à créer :" );
           int y = sc.nextInt();
        
        //Appel Constructeur afin d'utiliser les méthodes de la classe PassWord
            PassWord p = new PassWord();
        //Création d'un fichier texte "pw.txt"
            File file = new File("pw.txt");
        //Instanciation de File pour pouvoir utiliser l'ecriture et la lecture ?
            FileWriter fw;
            FileReader fr;
            
        //Ecrire dans le fichier les passwords
            System.out.println("Ecriture du fichier ");
            fw = new FileWriter(file);
        //RandomPassword qui sera de type String afin de pouvoir écrire dans le fichier texte (cf PassWord.java)  
            String randomPassword;
        //Création d'un nombre de mots de passes = y qui seront afficher puis ecrit 1 à 1 dans le fichier
            for(int i = 0; i < y; i++){
            randomPassword = p.setPassWord(x,y);
            p.Afficher();
            fw.write(randomPassword);
            fw.write("\n");
            }
        //Fermeture du flux
            fw.close();
            
            
        //Lecture du fichier
            System.out.println("Lecture du fichier ");
            fr = new FileReader(file);
            //Reset de la lecture
            String str ="";
            
            
        //Je ne sais pas pk mais ça marche
            int i = 0;
            while((i = fr.read()) != -1){
                str += (char)i;
            }
          
        //Affichage
            System.out.println(str);
               
            
            
    }
}


//projet consistant à créer des mdp d'une taille définie avec des charactere eux aussi définis
//1- Generation procedurale de mdp
//Enregistrer les mdp dans un fichier
//2- Faire une interface et y afficher les mots de passes
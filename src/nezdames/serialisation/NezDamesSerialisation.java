/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nezdames.serialisation;

import classesMetier.ContratCession;
import java.util.ArrayList;
import classesMetier.Intermittent;
import classesMetier.Lieu;
import classesMetier.PersonneStructure;
import classesMetier.Spectacle;
import classesMetier.Structure;
import classesMetier.User;
import connexion.Authentification;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gaellecastel
 */
public class NezDamesSerialisation {

     // déclaration des collections
    public static ArrayList<Intermittent> lesIntermittents = new ArrayList();
    public static ArrayList<User> lesUsers = new ArrayList();
    public static ArrayList<Spectacle> lesSpectacles = new ArrayList();
    public static ArrayList<ContratCession> lesContratsCession = new ArrayList();
    public static ArrayList<Lieu> lesLieux = new ArrayList();
    public static ArrayList<PersonneStructure> lesPersonnes = new ArrayList();
    public static ArrayList<Structure> lesStructures = new ArrayList();
    
    public static int index =-1 ;
    
    public static Connection conn;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
        try {
            
            Authentification a = new Authentification();
         a.setVisible(true);
        
            String url = "jdbc:Mysql://localhost/NezDames";
            String user = "nezdames";
            String passwd = "1234";
            
            conn = DriverManager.getConnection(url, user, passwd);         
            System.out.println("Connexion effective !");
        } catch (SQLException ex) {
            Logger.getLogger(NezDamesSerialisation.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    } 
    }
    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.ijse.layerd;

import edu.ijse.layerd.db.DBConnection;
import java.sql.SQLException;

/**
 *
 * @author Anjana
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        DBConnection.getInstance().getConnection();
    }
    
}

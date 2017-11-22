/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itesm.kikelonches.manager;
import java.sql.SQLException;
import mx.itesm.kikelonches.dao.UsuarioDAO;
import mx.itesm.kikelonches.vo.UsuarioVO;


/**
 *
 * @author Dell
 */
public class UserManager {
    public void addUser(String Username, String Password, String Correo){
        UsuarioDAO dao = new UsuarioDAO();
        dao.insertUsuario(Username, Password, Correo); 
    }
    
    public void deleteUser(int id){
        UsuarioDAO dao = new UsuarioDAO();
        dao.deleteUsuarioByID(id);
    }
    
    public void updateUser(int id, String Username, String Password, String Correo){
        UsuarioDAO dao = new UsuarioDAO();
        dao.updateUsuarioById(id, Username, Password, Correo);
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itesm.kikelonches.manager;
import java.sql.SQLException;
import java.util.List;
import mx.itesm.kikelonches.dao.OrdenDAO;
import mx.itesm.kikelonches.vo.OrdenVO;
/**
 *
 * @author Dell
 */
public class OrdenManager {
    public void newOrden(int UsuarioID, String Fecha, double PrecioFinal){
        OrdenDAO dao = new OrdenDAO();
        dao.insertOrden(UsuarioID, Fecha, PrecioFinal);
    }
    
    public List<OrdenVO> ordenByDate(String Fecha){
        OrdenDAO dao = new OrdenDAO();
        return dao.getOrdenByDate(Fecha);
    }
    
    public void updateOrden(int ID, int UsuarioID, String Fecha, double PrecioFinal){
        OrdenDAO dao = new OrdenDAO();
        dao.updateOrdenByID(ID, UsuarioID, Fecha, PrecioFinal);
    }
}

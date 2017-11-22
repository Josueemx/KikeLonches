/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itesm.kikelonches.manager;
import java.sql.SQLException;
import mx.itesm.kikelonches.dao.CarritoDAO;
import mx.itesm.kikelonches.vo.CarritoVO;
/**
 *
 * @author Dell
 */
public class CarritoManager {
    public void insertCarrito(int OrdenID, int ProductoID, int Cantidad, double Precio){
        CarritoDAO dao = new CarritoDAO();
        dao.insertCarrito(OrdenID, ProductoID, Cantidad, Precio);
    }
    
    public List<CarritoVO> getFullCarrito(int OrdenID){
        CarritoDAO dao = new CarritoDAO();
        return dao.getFullCarritoByOrdenID(OrdenID)
    }
    
    public void deletItem(int OrdenID, int ItemID){
        CarritoDAO dao = new CarritoDAO();
        dao.deleteCarritoByOrdenIDAndProductoID(OrdenID, OrdenID);
    }
    
    public void updateItem(int OrdenID, int ProductoID, int Cantidad, double Precio){
        CarritoDAO dao = new CarritoDAO();
        dao.updateCarritoByOrdenIDAndProductoID(OrdenID, ProductoID, Cantidad, Precio);
    }
}

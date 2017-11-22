/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itesm.kikelonches.manager;
import java.sql.SQLException;
import java.util.List;
import mx.itesm.kikelonches.dao.ProductoDAO;
import mx.itesm.kikelonches.vo.ProductoVO;
/**
 *
 * @author Dell
 */
public class ProductManager {
    public void addProducto(String Nombre, String Descripcion, double Precio, int Cantidad_Inventario){
        ProductoDAO dao = new ProductoDAO();
        dao.insertProducto(Nombre, Descripcion, Precio, Cantidad_Inventario);
    }
   
    public void updateProducto(int ID, String Nombre, String Descripcion, double Precio, int Cantidad_Inventario){
        ProductoDAO dao = new ProductoDAO();
        dao.updateProductoByID(ID, Nombre, Descripcion, Precio, Cantidad_Inventario);
    }
    
    public List<ProductoVO> getAllProductos(){
        ProductoDAO dao = new ProductoDAO();
        return dao.getAllProductos();
    }
    
}

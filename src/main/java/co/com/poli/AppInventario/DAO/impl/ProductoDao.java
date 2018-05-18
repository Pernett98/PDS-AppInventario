/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.AppInventario.DAO.impl;
import co.com.poli.AppInventario.DAO.IProductoDAO;
import co.com.poli.AppInventario.Model.Producto;
import co.com.poli.AppInventario.Data.ProductoData;
import java.util.ArrayList;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sebastian
 */
@Repository
public class ProductoDao implements IProductoDAO {

  public ProductoDao() {
  }
  
  @Override
  public ArrayList<Producto> listarProductos() {
    return (ArrayList<Producto>) ProductoData.getListaProductos();
  } 
  
}

package mainAPP.service;

import java.util.List;
import mainAPP.dto.Almacen;

public interface IAlmacenService {

	public List<Almacen> listarAlmacen(); //Listar All 
	
	public Almacen guardarAlmacen(Almacen almacen);	//Guarda un almacen CREATE
	
	public Almacen almacenXID(Long id); //Leer datos de un almacen READ
		
	public Almacen actualizarAlmacen(Almacen almacen); //Actualiza datos de un almacen UPDATE
	
	public void eliminarAlmacen(Long id);// Elimina el almacen DELETE
}

package mainAPP.service;

import java.util.List;
import mainAPP.dto.Caja;

public interface ICajaService {

	public List<Caja> listarCaja(); //Listar All 
	
	public Caja guardarCaja(Caja caja);	//Guarda una caja CREATE
	
	public Caja cajaXID(Character id); //Leer datos de una caja READ
		
	public Caja actualizarCaja(Caja caja); //Actualiza datos de una caja UPDATE
	
	public void eliminarCaja(Character id);// Elimina el empleado DELETE
}

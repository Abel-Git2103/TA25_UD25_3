package mainAPP.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import mainAPP.dto.Almacen;

public interface IAlmacenDao extends JpaRepository<Almacen, Long> {

}

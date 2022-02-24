package mainAPP.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import mainAPP.dto.Caja;

public interface ICajaDao extends JpaRepository<Caja, Character> {

}

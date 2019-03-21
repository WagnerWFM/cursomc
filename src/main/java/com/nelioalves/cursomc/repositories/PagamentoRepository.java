package com.nelioalves.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nelioalves.cursomc.domain.Pagamento;

/*O repository da super classe já vale para as classes filhas.*/
@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {

}

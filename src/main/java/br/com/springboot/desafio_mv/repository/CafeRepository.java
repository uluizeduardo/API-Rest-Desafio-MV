package br.com.springboot.desafio_mv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.springboot.desafio_mv.model.Cafe;

@Repository
public interface CafeRepository extends JpaRepository<Cafe, Long> {

}

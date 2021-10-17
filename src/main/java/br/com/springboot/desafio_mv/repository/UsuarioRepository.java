package br.com.springboot.desafio_mv.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.springboot.desafio_mv.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	//Buscar por parte do nome 
	@Query(value = "select user from Usuario user where upper(trim(user.nome)) like %?1%")
	List<Usuario> buscarPorNome(String nome);
}

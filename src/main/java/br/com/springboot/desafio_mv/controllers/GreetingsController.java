package br.com.springboot.desafio_mv.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.springboot.desafio_mv.model.Usuario;
import br.com.springboot.desafio_mv.repository.CafeRepository;
import br.com.springboot.desafio_mv.repository.UsuarioRepository;

/**
 *
 * A sample greetings controller to return greeting text
 */
@RestController
public class GreetingsController {

	@Autowired // Injeção de dependência
	private UsuarioRepository usuarioRepository;

	@Autowired // Injeção de dependência
	private CafeRepository cafeRepository;

	/**
	 *
	 * @param name the name to greet
	 * @return greeting text
	 */
	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public String greetingText(@PathVariable String name) {
		return "Hello " + name + "!";
	}

	// Método para listar todos os usuários do banco de dados
	@GetMapping(value = "/listartodos")
	@ResponseBody // Retorna dados para o corpo da resposta
	public ResponseEntity<List<Usuario>> listarUsuarios() {	

		List<Usuario> usuarios = usuarioRepository.findAll(); // Execulta a consulta no banco de dados

		return new ResponseEntity<List<Usuario>>(usuarios, HttpStatus.OK); // Retorna a lista em JSON
	}

}

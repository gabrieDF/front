package br.com.front.dao;


import org.springframework.data.repository.CrudRepository;

import br.com.front.beans.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario, Integer>{
	public Usuario findByEmailAndSenha(String email, String senha);
}

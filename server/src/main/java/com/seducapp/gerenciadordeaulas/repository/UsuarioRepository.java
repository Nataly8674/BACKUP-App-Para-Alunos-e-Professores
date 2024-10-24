package com.seducapp.gerenciadordeaulas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seducapp.gerenciadordeaulas.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	Usuario findByCpf(String Cpf);
}

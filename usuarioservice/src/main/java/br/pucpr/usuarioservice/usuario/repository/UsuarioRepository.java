package com.netflix.usuarioservice.usuario.repository;

import com.netflix.usuarioservice.usuario.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
    Usuario findByGuidUsuario(Integer guidUsuario);
}

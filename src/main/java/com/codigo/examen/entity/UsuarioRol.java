package com.codigo.examen.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "usuario_rol")
@Entity
@Getter
@Setter
public class UsuarioRol {
    @Id
    @Column(name = "id_usuario_rol")
    private Long idUsuarioRol;
    @Column(name = "id_usuario", nullable = false, unique = true)
    private Integer idUsuario;
    @Column(name = "id_rol", nullable = false)
    private Integer idRol;

}

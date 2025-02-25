package com.ramon.controlador.models;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "usuarios")
@Data
public class UsuariosModel implements Serializable {
    private Long id_usuarios;

    private String nome_usuarios;
    private String cpf_usuarios;
    private String telefone_usuarios;
    private String email_usuarios;
    private String login_usuarios;
    private String senha_usuarios;

    @OneToOne(cascade = CascadeType.ALL)
    private EnderecoModel id_endereco;

    @OneToMany(mappedBy = "usuarios", cascade = CascadeType.ALL)
    private List<ContasModel> contas;

}

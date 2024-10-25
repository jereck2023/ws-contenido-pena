package pe.edu.cibertec.ws_contenido_pena.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "TipoContenido")
public class TipoContenido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idtipo;
    private String tipo;

}
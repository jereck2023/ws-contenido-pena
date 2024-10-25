package pe.edu.cibertec.ws_contenido_pena.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "Contenido")
public class Contenido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idcontenido;
    private String titulo;
    private String descripcion;
    @ManyToOne
    @JoinColumn(name = "idtipo")
    private TipoContenido tipo;
    @ManyToOne
    @JoinColumn(name = "idgenero")
    private Genero genero;
    private Integer duracion;
    private Date fecha_estreno;
    @ManyToOne
    @JoinColumn(name = "idclasificacion")
    private Clasificacion clasificacion;
    private Date actualizacion;
}

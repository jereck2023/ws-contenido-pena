package pe.edu.cibertec.ws_contenido_pena.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Builder
@Data
public class ContenidoDto {
    private Integer idcontenido;
    private String titulo;
    private String descripcion;
    private Integer idtipo;
    private Integer idgenero;
    private Integer duracion;
    private Date fecha_estreno;
    private Integer idclasificacion;
    private Date actualizacion;


}

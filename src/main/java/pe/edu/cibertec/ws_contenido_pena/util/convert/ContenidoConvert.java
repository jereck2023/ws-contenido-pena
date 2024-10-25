package pe.edu.cibertec.ws_contenido_pena.util.convert;

import org.springframework.stereotype.Component;
import pe.edu.cibertec.ws_contenido_pena.dto.ContenidoDto;
import pe.edu.cibertec.ws_contenido_pena.model.Clasificacion;
import pe.edu.cibertec.ws_contenido_pena.model.Contenido;
import pe.edu.cibertec.ws_contenido_pena.model.Genero;
import pe.edu.cibertec.ws_contenido_pena.model.TipoContenido;

@Component
public class ContenidoConvert {

    public ContenidoDto convertirAContenidoDto(Contenido contenido){
        return ContenidoDto.builder().idcontenido(contenido.getIdcontenido())
                .titulo(contenido.getTitulo())
                .descripcion(contenido.getDescripcion())
                .idtipo(contenido.getTipo().getIdtipo())
                .idgenero(contenido.getGenero().getIdgenero())
                .duracion(contenido.getDuracion())
                .fecha_estreno(contenido.getFecha_estreno())
                .idclasificacion(contenido.getClasificacion().getIdclasificacion())
                .build();
    }

    public Contenido convertirAContenido(ContenidoDto contenidoDto){
        Contenido contenido = new Contenido();
        contenido.setIdcontenido(contenidoDto.getIdcontenido());
        contenido.setTitulo(contenidoDto.getTitulo());
        contenido.setDescripcion(contenidoDto.getDescripcion());

        TipoContenido tipo = new TipoContenido();
        contenido.setTipo(tipo);
        tipo.setIdtipo(contenidoDto.getIdtipo());

        Genero genero = new Genero();
        contenido.setGenero(genero);
        genero.setIdgenero(contenidoDto.getIdgenero());

        contenido.setDuracion(contenidoDto.getDuracion());
        contenido.setFecha_estreno(contenidoDto.getFecha_estreno());

        Clasificacion clasificacion = new Clasificacion();
        contenido.setClasificacion(clasificacion);
        clasificacion.setIdclasificacion(contenidoDto.getIdclasificacion());

        return contenido;
    }



}

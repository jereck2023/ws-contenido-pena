package pe.edu.cibertec.ws_contenido_pena.service;

import org.springframework.data.repository.query.Param;
import pe.edu.cibertec.ws_contenido_pena.dto.ContenidoDto;

import java.util.List;

public interface IContenidoService {

    void registrarContenido(ContenidoDto contenidoDto);
    void actualizarContenido(ContenidoDto contenidoDto);
}

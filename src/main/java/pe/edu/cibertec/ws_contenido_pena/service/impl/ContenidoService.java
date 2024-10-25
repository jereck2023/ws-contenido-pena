package pe.edu.cibertec.ws_contenido_pena.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.ws_contenido_pena.dto.ContenidoDto;
import pe.edu.cibertec.ws_contenido_pena.model.Contenido;
import pe.edu.cibertec.ws_contenido_pena.repository.ContenidoRepository;
import pe.edu.cibertec.ws_contenido_pena.service.IContenidoService;
import pe.edu.cibertec.ws_contenido_pena.util.convert.ContenidoConvert;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ContenidoService implements IContenidoService {
    private final ContenidoRepository contenidoRepository;
    private final ContenidoConvert contenidoConvert;


    @Override
    public void registrarContenido(ContenidoDto contenidoDto) {
        Contenido contenido = contenidoConvert.convertirAContenido(contenidoDto);
        contenidoRepository.save(contenido);
    }

    @Override
    public void actualizarContenido(ContenidoDto contenidoDto) {
        contenidoRepository.actualizarContenido(contenidoDto.getIdcontenido(),
                contenidoDto.getTitulo(),
                contenidoDto.getDescripcion(),
                contenidoDto.getIdtipo(),
                contenidoDto.getIdgenero(),
                contenidoDto.getDuracion(),
                contenidoDto.getFecha_estreno(),
                contenidoDto.getIdclasificacion());
    }
}

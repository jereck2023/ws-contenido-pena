package pe.edu.cibertec.ws_contenido_pena.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.ws_contenido_pena.dto.ContenidoDto;
import pe.edu.cibertec.ws_contenido_pena.dto.GenericResponseDto;
import pe.edu.cibertec.ws_contenido_pena.model.Contenido;
import pe.edu.cibertec.ws_contenido_pena.service.IContenidoService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/contenido")
public class ContenidoController {
    private final IContenidoService contenidoService;

    @PostMapping("")
    public ResponseEntity<GenericResponseDto<String>> RegistrarContenido(
            @RequestBody ContenidoDto contenidoDto
    ) {
        try {
            contenidoService.registrarContenido(contenidoDto);
            return new ResponseEntity<>(GenericResponseDto.<String>builder()
                    .correcto(true).mensaje("Contenido registrado correctamente")
                    .build(), HttpStatus.CREATED);
        }catch (Exception ex){
            return new ResponseEntity<>(GenericResponseDto.<String>builder()
                    .correcto(false).mensaje("Contenido no registrado")
                    .build(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("")
    public ResponseEntity<GenericResponseDto<String>> actualizarContenido(
            @RequestBody ContenidoDto contenidoDto
    ) {
        try {
            contenidoService.actualizarContenido(contenidoDto);
            return new ResponseEntity<>(GenericResponseDto.<String>builder()
                    .correcto(true).mensaje("Contenido actualizado correctamente")
                    .build(), HttpStatus.CREATED);
        }catch (Exception ex){
            return new ResponseEntity<>(GenericResponseDto.<String>builder()
                    .correcto(false).mensaje("Contenido no actualizado")
                    .build(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

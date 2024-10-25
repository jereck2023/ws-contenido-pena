package pe.edu.cibertec.ws_contenido_pena.repository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.ws_contenido_pena.model.Contenido;

import java.util.Date;
import java.util.List;

@Repository
public interface ContenidoRepository extends JpaRepository<Contenido,Integer> {

    @Transactional
    @Modifying
    @Procedure(procedureName = "actualizarContenido")
    void actualizarContenido(@Param("p_idcontenido") Integer idcontenido,
                             @Param("p_titulo") String titulo,
                             @Param("p_descripcion") String descripcion,
                             @Param("p_idtipo") Integer idtipo,
                             @Param("p_idgenero") Integer idgenero,
                             @Param("p_duracion") Integer duracion,
                             @Param("p_fecha_estreno") Date fecha_estreno,
                             @Param("p_idclasificacion") Integer idclasificacion
    );

}

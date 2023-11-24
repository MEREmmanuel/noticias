package com.mendozanews.apinews.servicios.interfaces;

import com.mendozanews.apinews.model.dto.request.NoticiaDto;
import com.mendozanews.apinews.model.entidades.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface INoticia {

    String crearNoticia(NoticiaDto noticia, Autor autor, Seccion seccion, List<MultipartFile> imagenes, MultipartFile portada) throws IOException;
    public void actualizarNoticia(Noticia noticia, NoticiaDto noticiaDto, Autor autor, Seccion seccion,
                                  List<MultipartFile> imagenes, MultipartFile portada) throws IOException;

    Noticia buscarNoticiaPorId(String id);

    void eliminarNoticiaPorId(String id);
    Portada buscarPortadaPorId(String portadaId);

    ImagenesNoticia buscarImagenNoticiaPorId(String imagenNoticiaId);

    List<Noticia> buscarNoticiasRecientes(Integer offset, Integer limit);

    List<Noticia> buscarNoticiaPorTitulo(String titulo);

    List<Noticia> buscarNoticiasPorSeccion(String seccion, Integer offset, Integer limit);

    List<Noticia> buscarNoticiasPorAutor(String nombre, String apellido, Integer offset, Integer limit);

    List<Noticia> buscarPopularesPorSeccion(String seccion, Integer offset, Integer limit);

    List<Noticia> buscarNoticiasMasPopulares(Integer offset, Integer limit);
}

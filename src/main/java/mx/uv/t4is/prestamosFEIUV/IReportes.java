package mx.uv.t4is.prestamosFEIUV;

import org.springframework.data.repository.CrudRepository;

public interface IReportes extends CrudRepository<Reportes,Integer>{
    Iterable<Reportes> findByCarrera(String carrera);
    
}
package mx.uv.t4is.prestamosFEIUV;

import org.springframework.data.repository.CrudRepository;

public interface ICubiculos extends CrudRepository<Cubiculos,Integer>{
    Iterable<Cubiculos> findByCarrera(String carrera);
}

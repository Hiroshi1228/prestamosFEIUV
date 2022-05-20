package mx.uv.t4is.prestamosFEIUV;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reportes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String fecha;
    private String hora;
    private String carrera;
    private String descripcion;

    public int getId(){
        return id;
    }

    public String getFecha(){
        return fecha;
    }

    public String getHora(){
        return hora;
    }

    public String getCarrera(){
        return carrera;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setFecha(String fecha){
        this.fecha = fecha;
    }

    public void setHora(String hora){
        this.hora = hora;
    }

    public void setCarrera(String carrera){
        this.carrera = carrera;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
}
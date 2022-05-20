package mx.uv.t4is.prestamosFEIUV;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cubiculos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String matricula;
    private String carrera;
    private String tiempo;
    private String diaS;
    private String diaN;
    private String mes;

    public Cubiculos(){}

    public int getId(){
        return id;
    }

    public String getMatricula(){
        return matricula;
    }

    public String getCarrera(){
        return carrera;
    }

    public String getTiempo(){
        return tiempo;
    }

    public String getDiaS(){
        return diaS;
    }

    public String getDiaN(){
        return diaN;
    }

    public String getMes(){
        return mes;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public void setCarrera(String carrera){
        this.carrera = carrera;
    }

    public void setTiempo(String tiempo){
        this.tiempo = tiempo;
    }

    public void setDiaS(String diaS){
        this.diaS = diaS;
    }

    public void setDiaN(String diaN){
        this.diaN = diaN;
    }

    public void setMes(String mes){
        this.mes = mes;
    }
}

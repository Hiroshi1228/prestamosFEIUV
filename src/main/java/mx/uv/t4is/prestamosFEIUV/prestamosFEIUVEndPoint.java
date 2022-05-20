package mx.uv.t4is.prestamosFEIUV;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import https.t4is_uv_mx.prestamosfeiuv.RegistrarPrestamoRequest;
import https.t4is_uv_mx.prestamosfeiuv.RegistrarPrestamoResponse;
import https.t4is_uv_mx.prestamosfeiuv.ReportarCubiculoRequest;
import https.t4is_uv_mx.prestamosfeiuv.ReportarCubiculoResponse;
import https.t4is_uv_mx.prestamosfeiuv.VerCubiculoRequest;
import https.t4is_uv_mx.prestamosfeiuv.VerCubiculoResponse;
import https.t4is_uv_mx.prestamosfeiuv.VerReportesRequest;
import https.t4is_uv_mx.prestamosfeiuv.VerReportesResponse;


@Endpoint
public class prestamosFEIUVEndPoint {
    Cubiculos ic;
    
    @Autowired
    ICubiculos icubiculos;

    @Autowired
    IReportes ireportes;

    @PayloadRoot(localPart = "RegistrarPrestamoRequest", namespace = "https://t4is.uv.mx/prestamosFEIUV")
    @ResponsePayload
    public RegistrarPrestamoResponse RegistrarC(@RequestPayload RegistrarPrestamoRequest peticion){
        RegistrarPrestamoResponse confirmacion = new RegistrarPrestamoResponse();
        System.out.println("Entra");
        confirmacion.setConfirmacion("Se registro el prestamo a la matrícula " + peticion.getMatricula() + " para el cubículo de " + peticion.getCarrera());
        //Registro del prestamo al horario
        ic = new Cubiculos();
        ic.setMatricula(peticion.getMatricula());
        ic.setCarrera(peticion.getCarrera());
        ic.setTiempo(peticion.getTiempo());
        ic.setDiaS(peticion.getDiaS());
        ic.setDiaN(peticion.getDiaN());
        ic.setMes(peticion.getMes());

        System.out.println(ic.getMatricula());
        icubiculos.save(ic);
        System.out.println("Pasa save");
        return confirmacion;
    }
    /*
    -----------------EJEMPLO PARA EL USO DEL SERVICIO REGISTRAR PRESTAMO DE CUBICULO-----------------
    <Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">
    <Body>
        <RegistrarPrestamoRequest xmlns="https://t4is.uv.mx/prestamosFEIUV">
            <matricula>zS18014524</matricula>
            <carrera>Tecnologías computacionales</carrera>
            <tiempo>14-16</tiempo>
            <diaS>Lunes</diaS>
            <diaN>15</diaN>
            <mes>Junio</mes>
        </RegistrarPrestamoRequest>
    </Body>
    </Envelope>
    */

    @PayloadRoot(localPart = "VerCubiculoRequest", namespace = "https://t4is.uv.mx/prestamosFEIUV")
    @ResponsePayload
    public VerCubiculoResponse verCubiculo(@RequestPayload VerCubiculoRequest peticion){
        VerCubiculoResponse nomCubiculo = new VerCubiculoResponse();

        //Recorrer la lista
        //Iterable<Cubiculos> lista = icubiculos.findByCarrera(peticion.getNomCubiculo());
        Iterable<Cubiculos> lista = icubiculos.findByCarrera(peticion.getNomCubiculo());
        for (Cubiculos o : lista){
            VerCubiculoResponse.Horario e = new VerCubiculoResponse.Horario();
            e.setMatricula(o.getMatricula());
            e.setCarrera(o.getCarrera());
            e.setTiempo(o.getTiempo());
            e.setDiaS(o.getDiaS());
            e.setDiaN(o.getDiaN());
            e.setMes(o.getMes());
            nomCubiculo.getHorario().add(e);
        }
        return nomCubiculo;
    }

    /*
    -----------------EJEMPLO PARA EL USO DEL METODO BUSCAR HORARIOS DEL CUBICULO POR CARRERA-----------------
    <Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">
    <Body>
        <VerCubiculoRequest xmlns="https://t4is.uv.mx/prestamosFEIUV">
            <nomCubiculo>Tecnologías computacionales</nomCubiculo>
        </VerCubiculoRequest>
    </Body>
    </Envelope>
    */

    @PayloadRoot(localPart = "ReportarCubiculoRequest", namespace = "https://t4is.uv.mx/prestamosFEIUV")
    @ResponsePayload
    public ReportarCubiculoResponse ReportarC(@RequestPayload ReportarCubiculoRequest peticion){
        ReportarCubiculoResponse verificacion = new ReportarCubiculoResponse();
        verificacion.setVerificacion("Se realizó el reporte al cubiculo de " + peticion.getCarrera());

        Reportes rep = new Reportes();
        rep.setFecha(peticion.getFecha());
        rep.setHora(peticion.getHora());
        rep.setCarrera(peticion.getCarrera());
        rep.setDescripcion(peticion.getDescripcion());

        ireportes.save(rep);
        return verificacion;
    }

    /*
    -----------------EJEMPLO PARA EL USO DEL METODO REPORTAR UN CUBICULO-----------------
    <Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">
    <Body>
        <ReportarCubiculoRequest xmlns="https://t4is.uv.mx/prestamosFEIUV">
            <fecha>2022-05-20</fecha>
            <hora>12:39:29</hora>
            <carrera>Tecnologías computacionales</carrera>
            <descripcion>Exploto el Frigobar del cubiculo</descripcion>
        </ReportarCubiculoRequest>
    </Body>
    </Envelope>
    */

    @PayloadRoot(localPart = "VerReportesRequest", namespace = "https://t4is.uv.mx/prestamosFEIUV")/////////////////////////////////
    @ResponsePayload
    public VerReportesResponse verReportes(@RequestPayload VerReportesRequest peticion){
        VerReportesResponse reps = new VerReportesResponse();

        //Recorrer la lista
        //Iterable<Reportes> lista = ireportes.findAll();
        Iterable<Reportes> lista = ireportes.findByCarrera(peticion.getCubicNom());
        for (Reportes o : lista){
            VerReportesResponse.ListaReportes et = new VerReportesResponse.ListaReportes();
            et.setFecha(o.getFecha());
            et.setHora(o.getHora());
            et.setCarrera(o.getCarrera());
            et.setDescripcion(o.getDescripcion());
            reps.getListaReportes().add(et);
        }
        return reps;
    }

    /*
    -----------------EJEMPLO PARA EL USO DEL METODO BUSCAR REPORTES DEL CUBICULO POR CARRERA-----------------
    <Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">
    <Body>
        <VerReportesRequest xmlns="https://t4is.uv.mx/prestamosFEIUV">
            <cubicNom>Tecnologías computacionales</cubicNom>
        </VerReportesRequest>
    </Body>
    </Envelope>
    */
}

//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.06.08 a las 12:39:56 AM CDT 
//


package https.t4is_uv_mx.prestamosfeiuv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="matricula" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="carrera" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tiempo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="diaS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="diaN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mes" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "matricula",
    "carrera",
    "tiempo",
    "diaS",
    "diaN",
    "mes"
})
@XmlRootElement(name = "RegistrarPrestamoRequest")
public class RegistrarPrestamoRequest {

    @XmlElement(required = true)
    protected String matricula;
    @XmlElement(required = true)
    protected String carrera;
    @XmlElement(required = true)
    protected String tiempo;
    @XmlElement(required = true)
    protected String diaS;
    @XmlElement(required = true)
    protected String diaN;
    @XmlElement(required = true)
    protected String mes;

    /**
     * Obtiene el valor de la propiedad matricula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Define el valor de la propiedad matricula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatricula(String value) {
        this.matricula = value;
    }

    /**
     * Obtiene el valor de la propiedad carrera.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * Define el valor de la propiedad carrera.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrera(String value) {
        this.carrera = value;
    }

    /**
     * Obtiene el valor de la propiedad tiempo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiempo() {
        return tiempo;
    }

    /**
     * Define el valor de la propiedad tiempo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiempo(String value) {
        this.tiempo = value;
    }

    /**
     * Obtiene el valor de la propiedad diaS.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiaS() {
        return diaS;
    }

    /**
     * Define el valor de la propiedad diaS.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiaS(String value) {
        this.diaS = value;
    }

    /**
     * Obtiene el valor de la propiedad diaN.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiaN() {
        return diaN;
    }

    /**
     * Define el valor de la propiedad diaN.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiaN(String value) {
        this.diaN = value;
    }

    /**
     * Obtiene el valor de la propiedad mes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMes() {
        return mes;
    }

    /**
     * Define el valor de la propiedad mes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMes(String value) {
        this.mes = value;
    }

}

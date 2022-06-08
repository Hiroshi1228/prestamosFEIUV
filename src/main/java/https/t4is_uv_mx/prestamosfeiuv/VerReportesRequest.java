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
 *         &lt;element name="cubicNom" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "cubicNom"
})
@XmlRootElement(name = "VerReportesRequest")
public class VerReportesRequest {

    @XmlElement(required = true)
    protected String cubicNom;

    /**
     * Obtiene el valor de la propiedad cubicNom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubicNom() {
        return cubicNom;
    }

    /**
     * Define el valor de la propiedad cubicNom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubicNom(String value) {
        this.cubicNom = value;
    }

}

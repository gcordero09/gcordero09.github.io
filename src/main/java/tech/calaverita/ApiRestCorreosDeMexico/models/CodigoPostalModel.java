package tech.calaverita.ApiRestCorreosDeMexico.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "codigos_postales")
public class CodigoPostalModel {
    @Column(name = "d_codigo")
    private int dCodigo;
    @Column(name = "d_asenta")
    private String dAsenta;
    @Column(name = "d_tipo_asenta")
    private String dTipoAsenta;
    @Column(name = "d_mnpio")
    private String dMnpio;
    @Column(name = "d_estado")
    private String dEstado;
    @Column(name = "d_ciudad")
    private String dCiudad;
    @Column(name = "d_cp")
    private int dCp;
    @Column(name = "c_estado")
    private int cEstado;
    @Column(name = "c_oficina")
    private int cOficina;
    @Column(name = "c_cp")
    private int cCp;
    @Column(name = "c_tipo_asenta")
    private int cTipoAsenta;
    @Column(name = "c_mnpio")
    private int cMnpio;
    @Id
    @Column(name = "id_asenta_cpcons")
    private int idAsentaCpcons;
    @Column(name = "d_zona")
    private String dZona;
    @Column(name = "c_cve_ciudad")
    private int cCveCiudad;

    public int getDCodigo() {
        return dCodigo;
    }

    public void setDCodigo(int dCodigo) {
        this.dCodigo = dCodigo;
    }

    public String getDAsenta() {
        return dAsenta;
    }

    public void setDAsenta(String dAsenta) {
        this.dAsenta = dAsenta;
    }

    public String getDTipoAsenta() {
        return dTipoAsenta;
    }

    public void setDTipoAsenta(String dTipoAsenta) {
        this.dTipoAsenta = dTipoAsenta;
    }

    public String getDMnpio() {
        return dMnpio;
    }

    public void setDMnpio(String dMnpio) {
        this.dMnpio = dMnpio;
    }

    public String getDEstado() {
        return dEstado;
    }

    public void setDEstado(String dEstado) {
        this.dEstado = dEstado;
    }

    public String getDCiudad() {
        return dCiudad;
    }

    public void setDCiudad(String dCiudad) {
        this.dCiudad = dCiudad;
    }

    public int getDCp() {
        return dCp;
    }

    public void setDCp(int dCp) {
        this.dCp = dCp;
    }

    public int getCEstado() {
        return cEstado;
    }

    public void setCEstado(int cEstado) {
        this.cEstado = cEstado;
    }

    public int getCOficina() {
        return cOficina;
    }

    public void setCOficina(int cOficina) {
        this.cOficina = cOficina;
    }

    public int getCCp() {
        return cCp;
    }

    public void setCCp(int cCp) {
        this.cCp = cCp;
    }

    public int getCTipoAsenta() {
        return cTipoAsenta;
    }

    public void setCTipoAsenta(int cTipoAsenta) {
        this.cTipoAsenta = cTipoAsenta;
    }

    public int getCMnpio() {
        return cMnpio;
    }

    public void setCMnpio(int cMnpio) {
        this.cMnpio = cMnpio;
    }

    public int getIdAsentaCpcons() {
        return idAsentaCpcons;
    }

    public void setIdAsentaCpcons(int idAsentaCpcons) {
        this.idAsentaCpcons = idAsentaCpcons;
    }

    public String getDZona() {
        return dZona;
    }

    public void setDZona(String dZona) {
        this.dZona = dZona;
    }

    public int getCCveCiudad() {
        return cCveCiudad;
    }

    public void setCCveCiudad(int cCveCiudad) {
        this.cCveCiudad = cCveCiudad;
    }

    @Override
    public String toString() {
        return "CodigoPostal{" +
                "dCodigo=" + dCodigo +
                ", dAsenta='" + dAsenta + '\'' +
                ", dTipoAsenta='" + dTipoAsenta + '\'' +
                ", dMnpio='" + dMnpio + '\'' +
                ", dEstado='" + dEstado + '\'' +
                ", dCiudad='" + dCiudad + '\'' +
                ", dCp=" + dCp +
                ", cEstado=" + cEstado +
                ", cOficina=" + cOficina +
                ", cCp=" + cCp +
                ", cTipoAsenta=" + cTipoAsenta +
                ", cMnpio=" + cMnpio +
                ", idAsentaCpcons=" + idAsentaCpcons +
                ", dZona='" + dZona + '\'' +
                ", cCveCiudad=" + cCveCiudad +
                '}';
    }
}

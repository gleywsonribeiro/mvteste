/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapeamento.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author gleywson
 */
@Entity
@Table(name = "ITSOLICITACAO_EXT")
@NamedQueries({
    @NamedQuery(name = "ItsolicitacaoExt.findAll", query = "SELECT i FROM ItsolicitacaoExt i"),
    @NamedQuery(name = "ItsolicitacaoExt.findByDtFimGarantia", query = "SELECT i FROM ItsolicitacaoExt i WHERE i.dtFimGarantia = :dtFimGarantia"),
    @NamedQuery(name = "ItsolicitacaoExt.findByCdOsExt", query = "SELECT i FROM ItsolicitacaoExt i WHERE i.cdOsExt = :cdOsExt"),
    @NamedQuery(name = "ItsolicitacaoExt.findByNrNotaFiscal", query = "SELECT i FROM ItsolicitacaoExt i WHERE i.nrNotaFiscal = :nrNotaFiscal"),
    @NamedQuery(name = "ItsolicitacaoExt.findByVlTotal", query = "SELECT i FROM ItsolicitacaoExt i WHERE i.vlTotal = :vlTotal"),
    @NamedQuery(name = "ItsolicitacaoExt.findByVlMaoObra", query = "SELECT i FROM ItsolicitacaoExt i WHERE i.vlMaoObra = :vlMaoObra"),
    @NamedQuery(name = "ItsolicitacaoExt.findByDtRecebeNota", query = "SELECT i FROM ItsolicitacaoExt i WHERE i.dtRecebeNota = :dtRecebeNota"),
    @NamedQuery(name = "ItsolicitacaoExt.findByVlTempoHora", query = "SELECT i FROM ItsolicitacaoExt i WHERE i.vlTempoHora = :vlTempoHora"),
    @NamedQuery(name = "ItsolicitacaoExt.findByVlTempoMin", query = "SELECT i FROM ItsolicitacaoExt i WHERE i.vlTempoMin = :vlTempoMin"),
    @NamedQuery(name = "ItsolicitacaoExt.findByDtEnvio", query = "SELECT i FROM ItsolicitacaoExt i WHERE i.dtEnvio = :dtEnvio"),
    @NamedQuery(name = "ItsolicitacaoExt.findByCdOsExtIntegra", query = "SELECT i FROM ItsolicitacaoExt i WHERE i.cdOsExtIntegra = :cdOsExtIntegra"),
    @NamedQuery(name = "ItsolicitacaoExt.findByCdSeqIntegra", query = "SELECT i FROM ItsolicitacaoExt i WHERE i.cdSeqIntegra = :cdSeqIntegra"),
    @NamedQuery(name = "ItsolicitacaoExt.findByDtIntegra", query = "SELECT i FROM ItsolicitacaoExt i WHERE i.dtIntegra = :dtIntegra")})
public class ItsolicitacaoExt implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "DT_FIM_GARANTIA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtFimGarantia;
    @Id
    @Basic(optional = false)
    @Column(name = "CD_OS_EXT")
    private Integer cdOsExt;
    @Basic(optional = false)
    @Column(name = "NR_NOTA_FISCAL")
    private int nrNotaFiscal;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VL_TOTAL")
    private BigDecimal vlTotal;
    @Column(name = "VL_MAO_OBRA")
    private BigDecimal vlMaoObra;
    @Column(name = "DT_RECEBE_NOTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtRecebeNota;
    @Column(name = "VL_TEMPO_HORA")
    private Integer vlTempoHora;
    @Column(name = "VL_TEMPO_MIN")
    private Integer vlTempoMin;
    @Column(name = "DT_ENVIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtEnvio;
    @Column(name = "CD_OS_EXT_INTEGRA")
    private String cdOsExtIntegra;
    @Column(name = "CD_SEQ_INTEGRA")
    private BigInteger cdSeqIntegra;
    @Column(name = "DT_INTEGRA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtIntegra;
    @JoinColumn(name = "CD_OS", referencedColumnName = "CD_OS")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private SolicitacaoOs solicitacaoOs;

    public ItsolicitacaoExt() {
    }

    public ItsolicitacaoExt(Integer cdOsExt) {
        this.cdOsExt = cdOsExt;
    }

    public ItsolicitacaoExt(Integer cdOsExt, int nrNotaFiscal) {
        this.cdOsExt = cdOsExt;
        this.nrNotaFiscal = nrNotaFiscal;
    }

    public Date getDtFimGarantia() {
        return dtFimGarantia;
    }

    public void setDtFimGarantia(Date dtFimGarantia) {
        this.dtFimGarantia = dtFimGarantia;
    }

    public Integer getCdOsExt() {
        return cdOsExt;
    }

    public void setCdOsExt(Integer cdOsExt) {
        this.cdOsExt = cdOsExt;
    }

    public int getNrNotaFiscal() {
        return nrNotaFiscal;
    }

    public void setNrNotaFiscal(int nrNotaFiscal) {
        this.nrNotaFiscal = nrNotaFiscal;
    }

    public BigDecimal getVlTotal() {
        return vlTotal;
    }

    public void setVlTotal(BigDecimal vlTotal) {
        this.vlTotal = vlTotal;
    }

    public BigDecimal getVlMaoObra() {
        return vlMaoObra;
    }

    public void setVlMaoObra(BigDecimal vlMaoObra) {
        this.vlMaoObra = vlMaoObra;
    }

    public Date getDtRecebeNota() {
        return dtRecebeNota;
    }

    public void setDtRecebeNota(Date dtRecebeNota) {
        this.dtRecebeNota = dtRecebeNota;
    }

    public Integer getVlTempoHora() {
        return vlTempoHora;
    }

    public void setVlTempoHora(Integer vlTempoHora) {
        this.vlTempoHora = vlTempoHora;
    }

    public Integer getVlTempoMin() {
        return vlTempoMin;
    }

    public void setVlTempoMin(Integer vlTempoMin) {
        this.vlTempoMin = vlTempoMin;
    }

    public Date getDtEnvio() {
        return dtEnvio;
    }

    public void setDtEnvio(Date dtEnvio) {
        this.dtEnvio = dtEnvio;
    }

    public String getCdOsExtIntegra() {
        return cdOsExtIntegra;
    }

    public void setCdOsExtIntegra(String cdOsExtIntegra) {
        this.cdOsExtIntegra = cdOsExtIntegra;
    }

    public BigInteger getCdSeqIntegra() {
        return cdSeqIntegra;
    }

    public void setCdSeqIntegra(BigInteger cdSeqIntegra) {
        this.cdSeqIntegra = cdSeqIntegra;
    }

    public Date getDtIntegra() {
        return dtIntegra;
    }

    public void setDtIntegra(Date dtIntegra) {
        this.dtIntegra = dtIntegra;
    }

    public SolicitacaoOs getSolicitacaoOs() {
        return solicitacaoOs;
    }

    public void setSolicitacaoOs(SolicitacaoOs solicitacaoOs) {
        this.solicitacaoOs = solicitacaoOs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cdOsExt != null ? cdOsExt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItsolicitacaoExt)) {
            return false;
        }
        ItsolicitacaoExt other = (ItsolicitacaoExt) object;
        if ((this.cdOsExt == null && other.cdOsExt != null) || (this.cdOsExt != null && !this.cdOsExt.equals(other.cdOsExt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mapeamento.model.ItsolicitacaoExt[ cdOsExt=" + cdOsExt + " ]";
    }
    
}

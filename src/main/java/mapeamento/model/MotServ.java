/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapeamento.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author gleywson
 */
@Entity
@Table(name = "MOT_SERV")
@NamedQueries({
    @NamedQuery(name = "MotServ.findAll", query = "SELECT m FROM MotServ m"),
    @NamedQuery(name = "MotServ.findByCdMotServ", query = "SELECT m FROM MotServ m WHERE m.cdMotServ = :cdMotServ"),
    @NamedQuery(name = "MotServ.findByDsMotServ", query = "SELECT m FROM MotServ m WHERE m.dsMotServ = :dsMotServ"),
    @NamedQuery(name = "MotServ.findByTpMotCorret", query = "SELECT m FROM MotServ m WHERE m.tpMotCorret = :tpMotCorret"),
    @NamedQuery(name = "MotServ.findByCdMotServIntegra", query = "SELECT m FROM MotServ m WHERE m.cdMotServIntegra = :cdMotServIntegra"),
    @NamedQuery(name = "MotServ.findByCdSeqIntegra", query = "SELECT m FROM MotServ m WHERE m.cdSeqIntegra = :cdSeqIntegra"),
    @NamedQuery(name = "MotServ.findByDtIntegra", query = "SELECT m FROM MotServ m WHERE m.dtIntegra = :dtIntegra")})
public class MotServ implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CD_MOT_SERV")
    private Short cdMotServ;
    @Basic(optional = false)
    @Column(name = "DS_MOT_SERV")
    private String dsMotServ;
    @Column(name = "TP_MOT_CORRET")
    private String tpMotCorret;
    @Column(name = "CD_MOT_SERV_INTEGRA")
    private String cdMotServIntegra;
    @Column(name = "CD_SEQ_INTEGRA")
    private BigInteger cdSeqIntegra;
    @Column(name = "DT_INTEGRA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtIntegra;
    @OneToMany(mappedBy = "motServ", fetch = FetchType.LAZY)
    private List<SolicitacaoOs> solicitacaoOsList;
    @JoinColumn(name = "CD_TIPO_OS", referencedColumnName = "CD_TIPO_OS")
    @ManyToOne(fetch = FetchType.LAZY)
    private TipoOs tipoOs;

    public MotServ() {
    }

    public MotServ(Short cdMotServ) {
        this.cdMotServ = cdMotServ;
    }

    public MotServ(Short cdMotServ, String dsMotServ) {
        this.cdMotServ = cdMotServ;
        this.dsMotServ = dsMotServ;
    }

    public Short getCdMotServ() {
        return cdMotServ;
    }

    public void setCdMotServ(Short cdMotServ) {
        this.cdMotServ = cdMotServ;
    }

    public String getDsMotServ() {
        return dsMotServ;
    }

    public void setDsMotServ(String dsMotServ) {
        this.dsMotServ = dsMotServ;
    }

    public String getTpMotCorret() {
        return tpMotCorret;
    }

    public void setTpMotCorret(String tpMotCorret) {
        this.tpMotCorret = tpMotCorret;
    }

    public String getCdMotServIntegra() {
        return cdMotServIntegra;
    }

    public void setCdMotServIntegra(String cdMotServIntegra) {
        this.cdMotServIntegra = cdMotServIntegra;
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

    public List<SolicitacaoOs> getSolicitacaoOsList() {
        return solicitacaoOsList;
    }

    public void setSolicitacaoOsList(List<SolicitacaoOs> solicitacaoOsList) {
        this.solicitacaoOsList = solicitacaoOsList;
    }

    public TipoOs getTipoOs() {
        return tipoOs;
    }

    public void setTipoOs(TipoOs tipoOs) {
        this.tipoOs = tipoOs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cdMotServ != null ? cdMotServ.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MotServ)) {
            return false;
        }
        MotServ other = (MotServ) object;
        if ((this.cdMotServ == null && other.cdMotServ != null) || (this.cdMotServ != null && !this.cdMotServ.equals(other.cdMotServ))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mapeamento.model.MotServ[ cdMotServ=" + cdMotServ + " ]";
    }
    
}

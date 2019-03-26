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
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
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
@Table(name = "TIPO_OS")
@NamedQueries({
    @NamedQuery(name = "TipoOs.findAll", query = "SELECT t FROM TipoOs t"),
    @NamedQuery(name = "TipoOs.findByCdTipoOs", query = "SELECT t FROM TipoOs t WHERE t.cdTipoOs = :cdTipoOs"),
    @NamedQuery(name = "TipoOs.findByDsTipoOs", query = "SELECT t FROM TipoOs t WHERE t.dsTipoOs = :dsTipoOs"),
    @NamedQuery(name = "TipoOs.findByTpPreliminar", query = "SELECT t FROM TipoOs t WHERE t.tpPreliminar = :tpPreliminar"),
    @NamedQuery(name = "TipoOs.findByCdTipoOsIntegra", query = "SELECT t FROM TipoOs t WHERE t.cdTipoOsIntegra = :cdTipoOsIntegra"),
    @NamedQuery(name = "TipoOs.findByCdSeqIntegra", query = "SELECT t FROM TipoOs t WHERE t.cdSeqIntegra = :cdSeqIntegra"),
    @NamedQuery(name = "TipoOs.findByDtIntegra", query = "SELECT t FROM TipoOs t WHERE t.dtIntegra = :dtIntegra"),
    @NamedQuery(name = "TipoOs.findBySnBemObrigatorio", query = "SELECT t FROM TipoOs t WHERE t.snBemObrigatorio = :snBemObrigatorio"),
    @NamedQuery(name = "TipoOs.findByQtPrazoEntrega", query = "SELECT t FROM TipoOs t WHERE t.qtPrazoEntrega = :qtPrazoEntrega")})
public class TipoOs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CD_TIPO_OS")
    private Short cdTipoOs;
    @Basic(optional = false)
    @Column(name = "DS_TIPO_OS")
    private String dsTipoOs;
    @Column(name = "TP_PRELIMINAR")
    private String tpPreliminar;
    @Column(name = "CD_TIPO_OS_INTEGRA")
    private String cdTipoOsIntegra;
    @Column(name = "CD_SEQ_INTEGRA")
    private BigInteger cdSeqIntegra;
    @Column(name = "DT_INTEGRA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtIntegra;
    @Basic(optional = false)
    @Column(name = "SN_BEM_OBRIGATORIO")
    private String snBemObrigatorio;
    @Basic(optional = false)
    @Column(name = "QT_PRAZO_ENTREGA")
    private int qtPrazoEntrega;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoOs", fetch = FetchType.LAZY)
    private List<ProgramacaoPlano> programacaoPlanoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoOs", fetch = FetchType.LAZY)
    private List<SolicitacaoOs> solicitacaoOsList;
    @OneToMany(mappedBy = "tipoOs", fetch = FetchType.LAZY)
    private List<MotServ> motServList;

    public TipoOs() {
    }

    public TipoOs(Short cdTipoOs) {
        this.cdTipoOs = cdTipoOs;
    }

    public TipoOs(Short cdTipoOs, String dsTipoOs, String snBemObrigatorio, int qtPrazoEntrega) {
        this.cdTipoOs = cdTipoOs;
        this.dsTipoOs = dsTipoOs;
        this.snBemObrigatorio = snBemObrigatorio;
        this.qtPrazoEntrega = qtPrazoEntrega;
    }

    public Short getCdTipoOs() {
        return cdTipoOs;
    }

    public void setCdTipoOs(Short cdTipoOs) {
        this.cdTipoOs = cdTipoOs;
    }

    public String getDsTipoOs() {
        return dsTipoOs;
    }

    public void setDsTipoOs(String dsTipoOs) {
        this.dsTipoOs = dsTipoOs;
    }

    public String getTpPreliminar() {
        return tpPreliminar;
    }

    public void setTpPreliminar(String tpPreliminar) {
        this.tpPreliminar = tpPreliminar;
    }

    public String getCdTipoOsIntegra() {
        return cdTipoOsIntegra;
    }

    public void setCdTipoOsIntegra(String cdTipoOsIntegra) {
        this.cdTipoOsIntegra = cdTipoOsIntegra;
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

    public String getSnBemObrigatorio() {
        return snBemObrigatorio;
    }

    public void setSnBemObrigatorio(String snBemObrigatorio) {
        this.snBemObrigatorio = snBemObrigatorio;
    }

    public int getQtPrazoEntrega() {
        return qtPrazoEntrega;
    }

    public void setQtPrazoEntrega(int qtPrazoEntrega) {
        this.qtPrazoEntrega = qtPrazoEntrega;
    }

    public List<ProgramacaoPlano> getProgramacaoPlanoList() {
        return programacaoPlanoList;
    }

    public void setProgramacaoPlanoList(List<ProgramacaoPlano> programacaoPlanoList) {
        this.programacaoPlanoList = programacaoPlanoList;
    }

    public List<SolicitacaoOs> getSolicitacaoOsList() {
        return solicitacaoOsList;
    }

    public void setSolicitacaoOsList(List<SolicitacaoOs> solicitacaoOsList) {
        this.solicitacaoOsList = solicitacaoOsList;
    }

    public List<MotServ> getMotServList() {
        return motServList;
    }

    public void setMotServList(List<MotServ> motServList) {
        this.motServList = motServList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cdTipoOs != null ? cdTipoOs.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoOs)) {
            return false;
        }
        TipoOs other = (TipoOs) object;
        if ((this.cdTipoOs == null && other.cdTipoOs != null) || (this.cdTipoOs != null && !this.cdTipoOs.equals(other.cdTipoOs))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mapeamento.model.TipoOs[ cdTipoOs=" + cdTipoOs + " ]";
    }
    
}

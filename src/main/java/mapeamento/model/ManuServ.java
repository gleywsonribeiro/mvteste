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
import java.util.List;
import javax.persistence.Basic;
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
@Table(name = "MANU_SERV")
@NamedQueries({
    @NamedQuery(name = "ManuServ.findAll", query = "SELECT m FROM ManuServ m"),
    @NamedQuery(name = "ManuServ.findByCdServico", query = "SELECT m FROM ManuServ m WHERE m.cdServico = :cdServico"),
    @NamedQuery(name = "ManuServ.findByNmServico", query = "SELECT m FROM ManuServ m WHERE m.nmServico = :nmServico"),
    @NamedQuery(name = "ManuServ.findByPeso", query = "SELECT m FROM ManuServ m WHERE m.peso = :peso"),
    @NamedQuery(name = "ManuServ.findByQtdHoraMin", query = "SELECT m FROM ManuServ m WHERE m.qtdHoraMin = :qtdHoraMin"),
    @NamedQuery(name = "ManuServ.findByQtdHoraMax", query = "SELECT m FROM ManuServ m WHERE m.qtdHoraMax = :qtdHoraMax"),
    @NamedQuery(name = "ManuServ.findByQtMinutoMin", query = "SELECT m FROM ManuServ m WHERE m.qtMinutoMin = :qtMinutoMin"),
    @NamedQuery(name = "ManuServ.findByQtMinutoMax", query = "SELECT m FROM ManuServ m WHERE m.qtMinutoMax = :qtMinutoMax"),
    @NamedQuery(name = "ManuServ.findByTpCategoria", query = "SELECT m FROM ManuServ m WHERE m.tpCategoria = :tpCategoria"),
    @NamedQuery(name = "ManuServ.findByDsUnidadeMedida", query = "SELECT m FROM ManuServ m WHERE m.dsUnidadeMedida = :dsUnidadeMedida"),
    @NamedQuery(name = "ManuServ.findByCdServDms", query = "SELECT m FROM ManuServ m WHERE m.cdServDms = :cdServDms"),
    @NamedQuery(name = "ManuServ.findBySnTributa", query = "SELECT m FROM ManuServ m WHERE m.snTributa = :snTributa"),
    @NamedQuery(name = "ManuServ.findByCdServicoIntegra", query = "SELECT m FROM ManuServ m WHERE m.cdServicoIntegra = :cdServicoIntegra"),
    @NamedQuery(name = "ManuServ.findByCdSeqIntegra", query = "SELECT m FROM ManuServ m WHERE m.cdSeqIntegra = :cdSeqIntegra"),
    @NamedQuery(name = "ManuServ.findByDtIntegra", query = "SELECT m FROM ManuServ m WHERE m.dtIntegra = :dtIntegra")})
public class ManuServ implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CD_SERVICO")
    private Integer cdServico;
    @Basic(optional = false)
    @Column(name = "NM_SERVICO")
    private String nmServico;
    @Column(name = "PESO")
    private Integer peso;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QTD_HORA_MIN")
    private BigDecimal qtdHoraMin;
    @Column(name = "QTD_HORA_MAX")
    private BigDecimal qtdHoraMax;
    @Column(name = "QT_MINUTO_MIN")
    private Short qtMinutoMin;
    @Column(name = "QT_MINUTO_MAX")
    private Short qtMinutoMax;
    @Column(name = "TP_CATEGORIA")
    private String tpCategoria;
    @Column(name = "DS_UNIDADE_MEDIDA")
    private String dsUnidadeMedida;
    @Column(name = "CD_SERV_DMS")
    private Short cdServDms;
    @Column(name = "SN_TRIBUTA")
    private String snTributa;
    @Column(name = "CD_SERVICO_INTEGRA")
    private String cdServicoIntegra;
    @Column(name = "CD_SEQ_INTEGRA")
    private BigInteger cdSeqIntegra;
    @Column(name = "DT_INTEGRA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtIntegra;
    @OneToMany(mappedBy = "manuServ", fetch = FetchType.LAZY)
    private List<ItsolicitacaoOs> itsolicitacaoOsList;

    public ManuServ() {
    }

    public ManuServ(Integer cdServico) {
        this.cdServico = cdServico;
    }

    public ManuServ(Integer cdServico, String nmServico) {
        this.cdServico = cdServico;
        this.nmServico = nmServico;
    }

    public Integer getCdServico() {
        return cdServico;
    }

    public void setCdServico(Integer cdServico) {
        this.cdServico = cdServico;
    }

    public String getNmServico() {
        return nmServico;
    }

    public void setNmServico(String nmServico) {
        this.nmServico = nmServico;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public BigDecimal getQtdHoraMin() {
        return qtdHoraMin;
    }

    public void setQtdHoraMin(BigDecimal qtdHoraMin) {
        this.qtdHoraMin = qtdHoraMin;
    }

    public BigDecimal getQtdHoraMax() {
        return qtdHoraMax;
    }

    public void setQtdHoraMax(BigDecimal qtdHoraMax) {
        this.qtdHoraMax = qtdHoraMax;
    }

    public Short getQtMinutoMin() {
        return qtMinutoMin;
    }

    public void setQtMinutoMin(Short qtMinutoMin) {
        this.qtMinutoMin = qtMinutoMin;
    }

    public Short getQtMinutoMax() {
        return qtMinutoMax;
    }

    public void setQtMinutoMax(Short qtMinutoMax) {
        this.qtMinutoMax = qtMinutoMax;
    }

    public String getTpCategoria() {
        return tpCategoria;
    }

    public void setTpCategoria(String tpCategoria) {
        this.tpCategoria = tpCategoria;
    }

    public String getDsUnidadeMedida() {
        return dsUnidadeMedida;
    }

    public void setDsUnidadeMedida(String dsUnidadeMedida) {
        this.dsUnidadeMedida = dsUnidadeMedida;
    }

    public Short getCdServDms() {
        return cdServDms;
    }

    public void setCdServDms(Short cdServDms) {
        this.cdServDms = cdServDms;
    }

    public String getSnTributa() {
        return snTributa;
    }

    public void setSnTributa(String snTributa) {
        this.snTributa = snTributa;
    }

    public String getCdServicoIntegra() {
        return cdServicoIntegra;
    }

    public void setCdServicoIntegra(String cdServicoIntegra) {
        this.cdServicoIntegra = cdServicoIntegra;
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

    public List<ItsolicitacaoOs> getItsolicitacaoOsList() {
        return itsolicitacaoOsList;
    }

    public void setItsolicitacaoOsList(List<ItsolicitacaoOs> itsolicitacaoOsList) {
        this.itsolicitacaoOsList = itsolicitacaoOsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cdServico != null ? cdServico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ManuServ)) {
            return false;
        }
        ManuServ other = (ManuServ) object;
        if ((this.cdServico == null && other.cdServico != null) || (this.cdServico != null && !this.cdServico.equals(other.cdServico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mapeamento.model.ManuServ[ cdServico=" + cdServico + " ]";
    }
    
}

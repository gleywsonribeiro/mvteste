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
@Table(name = "MANU_ESPEC")
@NamedQueries({
    @NamedQuery(name = "ManuEspec.findAll", query = "SELECT m FROM ManuEspec m"),
    @NamedQuery(name = "ManuEspec.findByCdEspec", query = "SELECT m FROM ManuEspec m WHERE m.cdEspec = :cdEspec"),
    @NamedQuery(name = "ManuEspec.findByDsEspec", query = "SELECT m FROM ManuEspec m WHERE m.dsEspec = :dsEspec"),
    @NamedQuery(name = "ManuEspec.findBySnZeladoria", query = "SELECT m FROM ManuEspec m WHERE m.snZeladoria = :snZeladoria"),
    @NamedQuery(name = "ManuEspec.findByCdEspecIntegra", query = "SELECT m FROM ManuEspec m WHERE m.cdEspecIntegra = :cdEspecIntegra"),
    @NamedQuery(name = "ManuEspec.findByCdSeqIntegra", query = "SELECT m FROM ManuEspec m WHERE m.cdSeqIntegra = :cdSeqIntegra"),
    @NamedQuery(name = "ManuEspec.findByDtIntegra", query = "SELECT m FROM ManuEspec m WHERE m.dtIntegra = :dtIntegra"),
    @NamedQuery(name = "ManuEspec.findByTpValidaUso", query = "SELECT m FROM ManuEspec m WHERE m.tpValidaUso = :tpValidaUso")})
public class ManuEspec implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CD_ESPEC")
    private Integer cdEspec;
    @Basic(optional = false)
    @Column(name = "DS_ESPEC")
    private String dsEspec;
    @Basic(optional = false)
    @Column(name = "SN_ZELADORIA")
    private String snZeladoria;
    @Column(name = "CD_ESPEC_INTEGRA")
    private String cdEspecIntegra;
    @Column(name = "CD_SEQ_INTEGRA")
    private BigInteger cdSeqIntegra;
    @Column(name = "DT_INTEGRA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtIntegra;
    @Basic(optional = false)
    @Column(name = "TP_VALIDA_USO")
    private String tpValidaUso;
    @OneToMany(mappedBy = "manuEspec", fetch = FetchType.LAZY)
    private List<ProgramacaoPlano> programacaoPlanoList;
    @OneToMany(mappedBy = "manuEspec", fetch = FetchType.LAZY)
    private List<SolicitacaoOs> solicitacaoOsList;

    public ManuEspec() {
    }

    public ManuEspec(Integer cdEspec) {
        this.cdEspec = cdEspec;
    }

    public ManuEspec(Integer cdEspec, String dsEspec, String snZeladoria, String tpValidaUso) {
        this.cdEspec = cdEspec;
        this.dsEspec = dsEspec;
        this.snZeladoria = snZeladoria;
        this.tpValidaUso = tpValidaUso;
    }

    public Integer getCdEspec() {
        return cdEspec;
    }

    public void setCdEspec(Integer cdEspec) {
        this.cdEspec = cdEspec;
    }

    public String getDsEspec() {
        return dsEspec;
    }

    public void setDsEspec(String dsEspec) {
        this.dsEspec = dsEspec;
    }

    public String getSnZeladoria() {
        return snZeladoria;
    }

    public void setSnZeladoria(String snZeladoria) {
        this.snZeladoria = snZeladoria;
    }

    public String getCdEspecIntegra() {
        return cdEspecIntegra;
    }

    public void setCdEspecIntegra(String cdEspecIntegra) {
        this.cdEspecIntegra = cdEspecIntegra;
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

    public String getTpValidaUso() {
        return tpValidaUso;
    }

    public void setTpValidaUso(String tpValidaUso) {
        this.tpValidaUso = tpValidaUso;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cdEspec != null ? cdEspec.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ManuEspec)) {
            return false;
        }
        ManuEspec other = (ManuEspec) object;
        if ((this.cdEspec == null && other.cdEspec != null) || (this.cdEspec != null && !this.cdEspec.equals(other.cdEspec))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mapeamento.model.ManuEspec[ cdEspec=" + cdEspec + " ]";
    }
    
}

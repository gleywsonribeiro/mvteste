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
@Table(name = "LOCALIDADE")
@NamedQueries({
    @NamedQuery(name = "Localidade.findAll", query = "SELECT l FROM Localidade l"),
    @NamedQuery(name = "Localidade.findByCdLocalidade", query = "SELECT l FROM Localidade l WHERE l.cdLocalidade = :cdLocalidade"),
    @NamedQuery(name = "Localidade.findByDsLocalidade", query = "SELECT l FROM Localidade l WHERE l.dsLocalidade = :dsLocalidade"),
    @NamedQuery(name = "Localidade.findByNmResponsavel", query = "SELECT l FROM Localidade l WHERE l.nmResponsavel = :nmResponsavel"),
    @NamedQuery(name = "Localidade.findByCdLocalidadeIntegra", query = "SELECT l FROM Localidade l WHERE l.cdLocalidadeIntegra = :cdLocalidadeIntegra"),
    @NamedQuery(name = "Localidade.findByCdSeqIntegra", query = "SELECT l FROM Localidade l WHERE l.cdSeqIntegra = :cdSeqIntegra"),
    @NamedQuery(name = "Localidade.findByDtIntegra", query = "SELECT l FROM Localidade l WHERE l.dtIntegra = :dtIntegra")})
public class Localidade implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CD_LOCALIDADE")
    private Long cdLocalidade;
    @Basic(optional = false)
    @Column(name = "DS_LOCALIDADE")
    private String dsLocalidade;
    @Column(name = "NM_RESPONSAVEL")
    private String nmResponsavel;
    @Column(name = "CD_LOCALIDADE_INTEGRA")
    private String cdLocalidadeIntegra;
    @Column(name = "CD_SEQ_INTEGRA")
    private BigInteger cdSeqIntegra;
    @Column(name = "DT_INTEGRA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtIntegra;
    @OneToMany(mappedBy = "localidade", fetch = FetchType.LAZY)
    private List<ProgramacaoPlano> programacaoPlanoList;
    @OneToMany(mappedBy = "localidade", fetch = FetchType.LAZY)
    private List<SolicitacaoOs> solicitacaoOsList;
    @JoinColumn(name = "CD_SETOR", referencedColumnName = "CD_SETOR")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Setor setor;

    public Localidade() {
    }

    public Localidade(Long cdLocalidade) {
        this.cdLocalidade = cdLocalidade;
    }

    public Localidade(Long cdLocalidade, String dsLocalidade) {
        this.cdLocalidade = cdLocalidade;
        this.dsLocalidade = dsLocalidade;
    }

    public Long getCdLocalidade() {
        return cdLocalidade;
    }

    public void setCdLocalidade(Long cdLocalidade) {
        this.cdLocalidade = cdLocalidade;
    }

    public String getDsLocalidade() {
        return dsLocalidade;
    }

    public void setDsLocalidade(String dsLocalidade) {
        this.dsLocalidade = dsLocalidade;
    }

    public String getNmResponsavel() {
        return nmResponsavel;
    }

    public void setNmResponsavel(String nmResponsavel) {
        this.nmResponsavel = nmResponsavel;
    }

    public String getCdLocalidadeIntegra() {
        return cdLocalidadeIntegra;
    }

    public void setCdLocalidadeIntegra(String cdLocalidadeIntegra) {
        this.cdLocalidadeIntegra = cdLocalidadeIntegra;
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

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cdLocalidade != null ? cdLocalidade.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Localidade)) {
            return false;
        }
        Localidade other = (Localidade) object;
        if ((this.cdLocalidade == null && other.cdLocalidade != null) || (this.cdLocalidade != null && !this.cdLocalidade.equals(other.cdLocalidade))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mapeamento.model.Localidade[ cdLocalidade=" + cdLocalidade + " ]";
    }
    
}

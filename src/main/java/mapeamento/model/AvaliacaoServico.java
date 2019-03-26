/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapeamento.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author gleywson
 */
@Entity
@Table(name = "AVALIACAO_SERVICO")
@NamedQueries({
    @NamedQuery(name = "AvaliacaoServico.findAll", query = "SELECT a FROM AvaliacaoServico a"),
    @NamedQuery(name = "AvaliacaoServico.findByCdSolicitacaoOrdemSrv", query = "SELECT a FROM AvaliacaoServico a WHERE a.cdSolicitacaoOrdemSrv = :cdSolicitacaoOrdemSrv"),
    @NamedQuery(name = "AvaliacaoServico.findByTpStatus", query = "SELECT a FROM AvaliacaoServico a WHERE a.tpStatus = :tpStatus"),
    @NamedQuery(name = "AvaliacaoServico.findByDsObservacao", query = "SELECT a FROM AvaliacaoServico a WHERE a.dsObservacao = :dsObservacao"),
    @NamedQuery(name = "AvaliacaoServico.findByTpAvaliacao", query = "SELECT a FROM AvaliacaoServico a WHERE a.tpAvaliacao = :tpAvaliacao"),
    @NamedQuery(name = "AvaliacaoServico.findByCdUsuario", query = "SELECT a FROM AvaliacaoServico a WHERE a.cdUsuario = :cdUsuario"),
    @NamedQuery(name = "AvaliacaoServico.findByDtUltimaAtualizacao", query = "SELECT a FROM AvaliacaoServico a WHERE a.dtUltimaAtualizacao = :dtUltimaAtualizacao")})
public class AvaliacaoServico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CD_SOLICITACAO_ORDEM_SRV")
    private Long cdSolicitacaoOrdemSrv;
    @Basic(optional = false)
    @Column(name = "TP_STATUS")
    private String tpStatus;
    @Column(name = "DS_OBSERVACAO")
    private String dsObservacao;
    @Basic(optional = false)
    @Column(name = "TP_AVALIACAO")
    private String tpAvaliacao;
    @Column(name = "CD_USUARIO")
    private String cdUsuario;
    @Column(name = "DT_ULTIMA_ATUALIZACAO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtUltimaAtualizacao;
    @JoinColumn(name = "CD_SOLICITACAO_ORDEM_SRV", referencedColumnName = "CD_OS", insertable = false, updatable = false)
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    private SolicitacaoOs solicitacaoOs;

    public AvaliacaoServico() {
    }

    public AvaliacaoServico(Long cdSolicitacaoOrdemSrv) {
        this.cdSolicitacaoOrdemSrv = cdSolicitacaoOrdemSrv;
    }

    public AvaliacaoServico(Long cdSolicitacaoOrdemSrv, String tpStatus, String tpAvaliacao) {
        this.cdSolicitacaoOrdemSrv = cdSolicitacaoOrdemSrv;
        this.tpStatus = tpStatus;
        this.tpAvaliacao = tpAvaliacao;
    }

    public Long getCdSolicitacaoOrdemSrv() {
        return cdSolicitacaoOrdemSrv;
    }

    public void setCdSolicitacaoOrdemSrv(Long cdSolicitacaoOrdemSrv) {
        this.cdSolicitacaoOrdemSrv = cdSolicitacaoOrdemSrv;
    }

    public String getTpStatus() {
        return tpStatus;
    }

    public void setTpStatus(String tpStatus) {
        this.tpStatus = tpStatus;
    }

    public String getDsObservacao() {
        return dsObservacao;
    }

    public void setDsObservacao(String dsObservacao) {
        this.dsObservacao = dsObservacao;
    }

    public String getTpAvaliacao() {
        return tpAvaliacao;
    }

    public void setTpAvaliacao(String tpAvaliacao) {
        this.tpAvaliacao = tpAvaliacao;
    }

    public String getCdUsuario() {
        return cdUsuario;
    }

    public void setCdUsuario(String cdUsuario) {
        this.cdUsuario = cdUsuario;
    }

    public Date getDtUltimaAtualizacao() {
        return dtUltimaAtualizacao;
    }

    public void setDtUltimaAtualizacao(Date dtUltimaAtualizacao) {
        this.dtUltimaAtualizacao = dtUltimaAtualizacao;
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
        hash += (cdSolicitacaoOrdemSrv != null ? cdSolicitacaoOrdemSrv.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AvaliacaoServico)) {
            return false;
        }
        AvaliacaoServico other = (AvaliacaoServico) object;
        if ((this.cdSolicitacaoOrdemSrv == null && other.cdSolicitacaoOrdemSrv != null) || (this.cdSolicitacaoOrdemSrv != null && !this.cdSolicitacaoOrdemSrv.equals(other.cdSolicitacaoOrdemSrv))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mapeamento.model.AvaliacaoServico[ cdSolicitacaoOrdemSrv=" + cdSolicitacaoOrdemSrv + " ]";
    }
    
}

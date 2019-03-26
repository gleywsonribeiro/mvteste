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
@Table(name = "HISTORICO_TRANSFERENCIA_OFIC")
@NamedQueries({
    @NamedQuery(name = "HistoricoTransferenciaOfic.findAll", query = "SELECT h FROM HistoricoTransferenciaOfic h"),
    @NamedQuery(name = "HistoricoTransferenciaOfic.findByCdHistorico", query = "SELECT h FROM HistoricoTransferenciaOfic h WHERE h.cdHistorico = :cdHistorico"),
    @NamedQuery(name = "HistoricoTransferenciaOfic.findByCdUsuario", query = "SELECT h FROM HistoricoTransferenciaOfic h WHERE h.cdUsuario = :cdUsuario"),
    @NamedQuery(name = "HistoricoTransferenciaOfic.findByDhTransferencia", query = "SELECT h FROM HistoricoTransferenciaOfic h WHERE h.dhTransferencia = :dhTransferencia"),
    @NamedQuery(name = "HistoricoTransferenciaOfic.findByDsTransferencia", query = "SELECT h FROM HistoricoTransferenciaOfic h WHERE h.dsTransferencia = :dsTransferencia")})
public class HistoricoTransferenciaOfic implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CD_HISTORICO")
    private Long cdHistorico;
    @Basic(optional = false)
    @Column(name = "CD_USUARIO")
    private String cdUsuario;
    @Basic(optional = false)
    @Column(name = "DH_TRANSFERENCIA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dhTransferencia;
    @Basic(optional = false)
    @Column(name = "DS_TRANSFERENCIA")
    private String dsTransferencia;
    @JoinColumn(name = "CD_OS", referencedColumnName = "CD_OS")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private SolicitacaoOs solicitacaoOs;

    public HistoricoTransferenciaOfic() {
    }

    public HistoricoTransferenciaOfic(Long cdHistorico) {
        this.cdHistorico = cdHistorico;
    }

    public HistoricoTransferenciaOfic(Long cdHistorico, String cdUsuario, Date dhTransferencia, String dsTransferencia) {
        this.cdHistorico = cdHistorico;
        this.cdUsuario = cdUsuario;
        this.dhTransferencia = dhTransferencia;
        this.dsTransferencia = dsTransferencia;
    }

    public Long getCdHistorico() {
        return cdHistorico;
    }

    public void setCdHistorico(Long cdHistorico) {
        this.cdHistorico = cdHistorico;
    }

    public String getCdUsuario() {
        return cdUsuario;
    }

    public void setCdUsuario(String cdUsuario) {
        this.cdUsuario = cdUsuario;
    }

    public Date getDhTransferencia() {
        return dhTransferencia;
    }

    public void setDhTransferencia(Date dhTransferencia) {
        this.dhTransferencia = dhTransferencia;
    }

    public String getDsTransferencia() {
        return dsTransferencia;
    }

    public void setDsTransferencia(String dsTransferencia) {
        this.dsTransferencia = dsTransferencia;
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
        hash += (cdHistorico != null ? cdHistorico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistoricoTransferenciaOfic)) {
            return false;
        }
        HistoricoTransferenciaOfic other = (HistoricoTransferenciaOfic) object;
        if ((this.cdHistorico == null && other.cdHistorico != null) || (this.cdHistorico != null && !this.cdHistorico.equals(other.cdHistorico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mapeamento.model.HistoricoTransferenciaOfic[ cdHistorico=" + cdHistorico + " ]";
    }
    
}

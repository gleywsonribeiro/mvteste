/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapeamento.model;

import java.io.Serializable;
import java.math.BigInteger;
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

/**
 *
 * @author gleywson
 */
@Entity
@Table(name = "MANU_PROD")
@NamedQueries({
    @NamedQuery(name = "ManuProd.findAll", query = "SELECT m FROM ManuProd m"),
    @NamedQuery(name = "ManuProd.findByQtdUsada", query = "SELECT m FROM ManuProd m WHERE m.qtdUsada = :qtdUsada"),
    @NamedQuery(name = "ManuProd.findBySolicitOsCdOs", query = "SELECT m FROM ManuProd m WHERE m.solicitOsCdOs = :solicitOsCdOs")})
public class ManuProd implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "QTD_USADA")
    private BigInteger qtdUsada;
    @Id
    @Basic(optional = false)
    @Column(name = "SOLICIT_OS_CD_OS")
    private Long solicitOsCdOs;
    @JoinColumn(name = "SOLICIT_OS_CD_OS", referencedColumnName = "CD_OS", insertable = false, updatable = false)
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    private SolicitacaoOs solicitacaoOs;

    public ManuProd() {
    }

    public ManuProd(Long solicitOsCdOs) {
        this.solicitOsCdOs = solicitOsCdOs;
    }

    public BigInteger getQtdUsada() {
        return qtdUsada;
    }

    public void setQtdUsada(BigInteger qtdUsada) {
        this.qtdUsada = qtdUsada;
    }

    public Long getSolicitOsCdOs() {
        return solicitOsCdOs;
    }

    public void setSolicitOsCdOs(Long solicitOsCdOs) {
        this.solicitOsCdOs = solicitOsCdOs;
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
        hash += (solicitOsCdOs != null ? solicitOsCdOs.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ManuProd)) {
            return false;
        }
        ManuProd other = (ManuProd) object;
        if ((this.solicitOsCdOs == null && other.solicitOsCdOs != null) || (this.solicitOsCdOs != null && !this.solicitOsCdOs.equals(other.solicitOsCdOs))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mapeamento.model.ManuProd[ solicitOsCdOs=" + solicitOsCdOs + " ]";
    }
    
}

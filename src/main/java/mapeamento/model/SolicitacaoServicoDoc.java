/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapeamento.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author gleywson
 */
@Entity
@Table(name = "SOLICITACAO_SERVICO_DOC")
@NamedQueries({
    @NamedQuery(name = "SolicitacaoServicoDoc.findAll", query = "SELECT s FROM SolicitacaoServicoDoc s"),
    @NamedQuery(name = "SolicitacaoServicoDoc.findByCdSolicitacaoOs", query = "SELECT s FROM SolicitacaoServicoDoc s WHERE s.solicitacaoServicoDocPK.cdSolicitacaoOs = :cdSolicitacaoOs"),
    @NamedQuery(name = "SolicitacaoServicoDoc.findByCdSolicitacaoDoc", query = "SELECT s FROM SolicitacaoServicoDoc s WHERE s.solicitacaoServicoDocPK.cdSolicitacaoDoc = :cdSolicitacaoDoc"),
    @NamedQuery(name = "SolicitacaoServicoDoc.findByDsSolicitacaoDoc", query = "SELECT s FROM SolicitacaoServicoDoc s WHERE s.dsSolicitacaoDoc = :dsSolicitacaoDoc")})
public class SolicitacaoServicoDoc implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SolicitacaoServicoDocPK solicitacaoServicoDocPK;
    @Column(name = "DS_SOLICITACAO_DOC")
    private String dsSolicitacaoDoc;
    @Lob
    @Column(name = "DS_ANEXO_SOLICITACAO")
    private byte[] dsAnexoSolicitacao;
    @Lob
    @Column(name = "LO_ANEXO_SOLICITACAO")
    private Serializable loAnexoSolicitacao;
    @JoinColumn(name = "CD_SOLICITACAO_OS", referencedColumnName = "CD_OS", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private SolicitacaoOs solicitacaoOs;

    public SolicitacaoServicoDoc() {
    }

    public SolicitacaoServicoDoc(SolicitacaoServicoDocPK solicitacaoServicoDocPK) {
        this.solicitacaoServicoDocPK = solicitacaoServicoDocPK;
    }

    public SolicitacaoServicoDoc(long cdSolicitacaoOs, long cdSolicitacaoDoc) {
        this.solicitacaoServicoDocPK = new SolicitacaoServicoDocPK(cdSolicitacaoOs, cdSolicitacaoDoc);
    }

    public SolicitacaoServicoDocPK getSolicitacaoServicoDocPK() {
        return solicitacaoServicoDocPK;
    }

    public void setSolicitacaoServicoDocPK(SolicitacaoServicoDocPK solicitacaoServicoDocPK) {
        this.solicitacaoServicoDocPK = solicitacaoServicoDocPK;
    }

    public String getDsSolicitacaoDoc() {
        return dsSolicitacaoDoc;
    }

    public void setDsSolicitacaoDoc(String dsSolicitacaoDoc) {
        this.dsSolicitacaoDoc = dsSolicitacaoDoc;
    }

    public byte[] getDsAnexoSolicitacao() {
        return dsAnexoSolicitacao;
    }

    public void setDsAnexoSolicitacao(byte[] dsAnexoSolicitacao) {
        this.dsAnexoSolicitacao = dsAnexoSolicitacao;
    }

    public Serializable getLoAnexoSolicitacao() {
        return loAnexoSolicitacao;
    }

    public void setLoAnexoSolicitacao(Serializable loAnexoSolicitacao) {
        this.loAnexoSolicitacao = loAnexoSolicitacao;
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
        hash += (solicitacaoServicoDocPK != null ? solicitacaoServicoDocPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SolicitacaoServicoDoc)) {
            return false;
        }
        SolicitacaoServicoDoc other = (SolicitacaoServicoDoc) object;
        if ((this.solicitacaoServicoDocPK == null && other.solicitacaoServicoDocPK != null) || (this.solicitacaoServicoDocPK != null && !this.solicitacaoServicoDocPK.equals(other.solicitacaoServicoDocPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mapeamento.model.SolicitacaoServicoDoc[ solicitacaoServicoDocPK=" + solicitacaoServicoDocPK + " ]";
    }
    
}

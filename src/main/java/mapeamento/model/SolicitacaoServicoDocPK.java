/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapeamento.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author gleywson
 */
@Embeddable
public class SolicitacaoServicoDocPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CD_SOLICITACAO_OS")
    private long cdSolicitacaoOs;
    @Basic(optional = false)
    @Column(name = "CD_SOLICITACAO_DOC")
    private long cdSolicitacaoDoc;

    public SolicitacaoServicoDocPK() {
    }

    public SolicitacaoServicoDocPK(long cdSolicitacaoOs, long cdSolicitacaoDoc) {
        this.cdSolicitacaoOs = cdSolicitacaoOs;
        this.cdSolicitacaoDoc = cdSolicitacaoDoc;
    }

    public long getCdSolicitacaoOs() {
        return cdSolicitacaoOs;
    }

    public void setCdSolicitacaoOs(long cdSolicitacaoOs) {
        this.cdSolicitacaoOs = cdSolicitacaoOs;
    }

    public long getCdSolicitacaoDoc() {
        return cdSolicitacaoDoc;
    }

    public void setCdSolicitacaoDoc(long cdSolicitacaoDoc) {
        this.cdSolicitacaoDoc = cdSolicitacaoDoc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) cdSolicitacaoOs;
        hash += (int) cdSolicitacaoDoc;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SolicitacaoServicoDocPK)) {
            return false;
        }
        SolicitacaoServicoDocPK other = (SolicitacaoServicoDocPK) object;
        if (this.cdSolicitacaoOs != other.cdSolicitacaoOs) {
            return false;
        }
        if (this.cdSolicitacaoDoc != other.cdSolicitacaoDoc) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mapeamento.model.SolicitacaoServicoDocPK[ cdSolicitacaoOs=" + cdSolicitacaoOs + ", cdSolicitacaoDoc=" + cdSolicitacaoDoc + " ]";
    }
    
}

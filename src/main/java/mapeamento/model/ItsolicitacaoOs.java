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
@Table(name = "ITSOLICITACAO_OS")
@NamedQueries({
    @NamedQuery(name = "ItsolicitacaoOs.findAll", query = "SELECT i FROM ItsolicitacaoOs i"),
    @NamedQuery(name = "ItsolicitacaoOs.findByCdItsolicitacaoOs", query = "SELECT i FROM ItsolicitacaoOs i WHERE i.cdItsolicitacaoOs = :cdItsolicitacaoOs"),
    @NamedQuery(name = "ItsolicitacaoOs.findByHrFinal", query = "SELECT i FROM ItsolicitacaoOs i WHERE i.hrFinal = :hrFinal"),
    @NamedQuery(name = "ItsolicitacaoOs.findByHrInicio", query = "SELECT i FROM ItsolicitacaoOs i WHERE i.hrInicio = :hrInicio"),
    @NamedQuery(name = "ItsolicitacaoOs.findByVlTempoGasto", query = "SELECT i FROM ItsolicitacaoOs i WHERE i.vlTempoGasto = :vlTempoGasto"),
    @NamedQuery(name = "ItsolicitacaoOs.findByDsServico", query = "SELECT i FROM ItsolicitacaoOs i WHERE i.dsServico = :dsServico"),
    @NamedQuery(name = "ItsolicitacaoOs.findByVlTempoGastoMin", query = "SELECT i FROM ItsolicitacaoOs i WHERE i.vlTempoGastoMin = :vlTempoGastoMin"),
    @NamedQuery(name = "ItsolicitacaoOs.findBySnCheckList", query = "SELECT i FROM ItsolicitacaoOs i WHERE i.snCheckList = :snCheckList"),
    @NamedQuery(name = "ItsolicitacaoOs.findByVlReal", query = "SELECT i FROM ItsolicitacaoOs i WHERE i.vlReal = :vlReal"),
    @NamedQuery(name = "ItsolicitacaoOs.findByCdBem", query = "SELECT i FROM ItsolicitacaoOs i WHERE i.cdBem = :cdBem"),
    @NamedQuery(name = "ItsolicitacaoOs.findByVlReferencia", query = "SELECT i FROM ItsolicitacaoOs i WHERE i.vlReferencia = :vlReferencia"),
    @NamedQuery(name = "ItsolicitacaoOs.findByCdLeitura", query = "SELECT i FROM ItsolicitacaoOs i WHERE i.cdLeitura = :cdLeitura"),
    @NamedQuery(name = "ItsolicitacaoOs.findByVlHora", query = "SELECT i FROM ItsolicitacaoOs i WHERE i.vlHora = :vlHora"),
    @NamedQuery(name = "ItsolicitacaoOs.findByVlHoraExtra", query = "SELECT i FROM ItsolicitacaoOs i WHERE i.vlHoraExtra = :vlHoraExtra"),
    @NamedQuery(name = "ItsolicitacaoOs.findByVlExtra", query = "SELECT i FROM ItsolicitacaoOs i WHERE i.vlExtra = :vlExtra"),
    @NamedQuery(name = "ItsolicitacaoOs.findByVlExtraMin", query = "SELECT i FROM ItsolicitacaoOs i WHERE i.vlExtraMin = :vlExtraMin"),
    @NamedQuery(name = "ItsolicitacaoOs.findByDsFuncionario", query = "SELECT i FROM ItsolicitacaoOs i WHERE i.dsFuncionario = :dsFuncionario"),
    @NamedQuery(name = "ItsolicitacaoOs.findByCdItsolicitacaoOsIntegra", query = "SELECT i FROM ItsolicitacaoOs i WHERE i.cdItsolicitacaoOsIntegra = :cdItsolicitacaoOsIntegra"),
    @NamedQuery(name = "ItsolicitacaoOs.findByCdSeqIntegra", query = "SELECT i FROM ItsolicitacaoOs i WHERE i.cdSeqIntegra = :cdSeqIntegra"),
    @NamedQuery(name = "ItsolicitacaoOs.findByDtIntegra", query = "SELECT i FROM ItsolicitacaoOs i WHERE i.dtIntegra = :dtIntegra")})
public class ItsolicitacaoOs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CD_ITSOLICITACAO_OS")
    private Long cdItsolicitacaoOs;
    @Column(name = "HR_FINAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date hrFinal;
    @Column(name = "HR_INICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date hrInicio;
    @Column(name = "VL_TEMPO_GASTO")
    private Short vlTempoGasto;
    @Column(name = "DS_SERVICO")
    private String dsServico;
    @Column(name = "VL_TEMPO_GASTO_MIN")
    private Short vlTempoGastoMin;
    @Basic(optional = false)
    @Column(name = "SN_CHECK_LIST")
    private String snCheckList;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VL_REAL")
    private BigDecimal vlReal;
    @Column(name = "CD_BEM")
    private Integer cdBem;
    @Column(name = "VL_REFERENCIA")
    private BigDecimal vlReferencia;
    @Column(name = "CD_LEITURA")
    private Short cdLeitura;
    @Column(name = "VL_HORA")
    private BigDecimal vlHora;
    @Column(name = "VL_HORA_EXTRA")
    private BigDecimal vlHoraExtra;
    @Column(name = "VL_EXTRA")
    private Integer vlExtra;
    @Column(name = "VL_EXTRA_MIN")
    private Integer vlExtraMin;
    @Column(name = "DS_FUNCIONARIO")
    private String dsFuncionario;
    @Column(name = "CD_ITSOLICITACAO_OS_INTEGRA")
    private String cdItsolicitacaoOsIntegra;
    @Column(name = "CD_SEQ_INTEGRA")
    private BigInteger cdSeqIntegra;
    @Column(name = "DT_INTEGRA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtIntegra;
    @JoinColumn(name = "CD_FUNC", referencedColumnName = "CD_FUNC")
    @ManyToOne(fetch = FetchType.LAZY)
    private Funcionario funcionario;
    @OneToMany(mappedBy = "itsolicitacaoOs", fetch = FetchType.LAZY)
    private List<ItsolicitacaoOs> itsolicitacaoOsList;
    @JoinColumn(name = "CD_ITSOLICITACAO_OS_FILHA", referencedColumnName = "CD_ITSOLICITACAO_OS")
    @ManyToOne(fetch = FetchType.LAZY)
    private ItsolicitacaoOs itsolicitacaoOs;
    @JoinColumn(name = "CD_SERVICO", referencedColumnName = "CD_SERVICO")
    @ManyToOne(fetch = FetchType.LAZY)
    private ManuServ manuServ;
    @JoinColumn(name = "CD_OS", referencedColumnName = "CD_OS")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private SolicitacaoOs solicitacaoOs;

    public ItsolicitacaoOs() {
    }

    public ItsolicitacaoOs(Long cdItsolicitacaoOs) {
        this.cdItsolicitacaoOs = cdItsolicitacaoOs;
    }

    public ItsolicitacaoOs(Long cdItsolicitacaoOs, String snCheckList) {
        this.cdItsolicitacaoOs = cdItsolicitacaoOs;
        this.snCheckList = snCheckList;
    }

    public Long getCdItsolicitacaoOs() {
        return cdItsolicitacaoOs;
    }

    public void setCdItsolicitacaoOs(Long cdItsolicitacaoOs) {
        this.cdItsolicitacaoOs = cdItsolicitacaoOs;
    }

    public Date getHrFinal() {
        return hrFinal;
    }

    public void setHrFinal(Date hrFinal) {
        this.hrFinal = hrFinal;
    }

    public Date getHrInicio() {
        return hrInicio;
    }

    public void setHrInicio(Date hrInicio) {
        this.hrInicio = hrInicio;
    }

    public Short getVlTempoGasto() {
        return vlTempoGasto;
    }

    public void setVlTempoGasto(Short vlTempoGasto) {
        this.vlTempoGasto = vlTempoGasto;
    }

    public String getDsServico() {
        return dsServico;
    }

    public void setDsServico(String dsServico) {
        this.dsServico = dsServico;
    }

    public Short getVlTempoGastoMin() {
        return vlTempoGastoMin;
    }

    public void setVlTempoGastoMin(Short vlTempoGastoMin) {
        this.vlTempoGastoMin = vlTempoGastoMin;
    }

    public String getSnCheckList() {
        return snCheckList;
    }

    public void setSnCheckList(String snCheckList) {
        this.snCheckList = snCheckList;
    }

    public BigDecimal getVlReal() {
        return vlReal;
    }

    public void setVlReal(BigDecimal vlReal) {
        this.vlReal = vlReal;
    }

    public Integer getCdBem() {
        return cdBem;
    }

    public void setCdBem(Integer cdBem) {
        this.cdBem = cdBem;
    }

    public BigDecimal getVlReferencia() {
        return vlReferencia;
    }

    public void setVlReferencia(BigDecimal vlReferencia) {
        this.vlReferencia = vlReferencia;
    }

    public Short getCdLeitura() {
        return cdLeitura;
    }

    public void setCdLeitura(Short cdLeitura) {
        this.cdLeitura = cdLeitura;
    }

    public BigDecimal getVlHora() {
        return vlHora;
    }

    public void setVlHora(BigDecimal vlHora) {
        this.vlHora = vlHora;
    }

    public BigDecimal getVlHoraExtra() {
        return vlHoraExtra;
    }

    public void setVlHoraExtra(BigDecimal vlHoraExtra) {
        this.vlHoraExtra = vlHoraExtra;
    }

    public Integer getVlExtra() {
        return vlExtra;
    }

    public void setVlExtra(Integer vlExtra) {
        this.vlExtra = vlExtra;
    }

    public Integer getVlExtraMin() {
        return vlExtraMin;
    }

    public void setVlExtraMin(Integer vlExtraMin) {
        this.vlExtraMin = vlExtraMin;
    }

    public String getDsFuncionario() {
        return dsFuncionario;
    }

    public void setDsFuncionario(String dsFuncionario) {
        this.dsFuncionario = dsFuncionario;
    }

    public String getCdItsolicitacaoOsIntegra() {
        return cdItsolicitacaoOsIntegra;
    }

    public void setCdItsolicitacaoOsIntegra(String cdItsolicitacaoOsIntegra) {
        this.cdItsolicitacaoOsIntegra = cdItsolicitacaoOsIntegra;
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

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public List<ItsolicitacaoOs> getItsolicitacaoOsList() {
        return itsolicitacaoOsList;
    }

    public void setItsolicitacaoOsList(List<ItsolicitacaoOs> itsolicitacaoOsList) {
        this.itsolicitacaoOsList = itsolicitacaoOsList;
    }

    public ItsolicitacaoOs getItsolicitacaoOs() {
        return itsolicitacaoOs;
    }

    public void setItsolicitacaoOs(ItsolicitacaoOs itsolicitacaoOs) {
        this.itsolicitacaoOs = itsolicitacaoOs;
    }

    public ManuServ getManuServ() {
        return manuServ;
    }

    public void setManuServ(ManuServ manuServ) {
        this.manuServ = manuServ;
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
        hash += (cdItsolicitacaoOs != null ? cdItsolicitacaoOs.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItsolicitacaoOs)) {
            return false;
        }
        ItsolicitacaoOs other = (ItsolicitacaoOs) object;
        if ((this.cdItsolicitacaoOs == null && other.cdItsolicitacaoOs != null) || (this.cdItsolicitacaoOs != null && !this.cdItsolicitacaoOs.equals(other.cdItsolicitacaoOs))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mapeamento.model.ItsolicitacaoOs[ cdItsolicitacaoOs=" + cdItsolicitacaoOs + " ]";
    }
    
}

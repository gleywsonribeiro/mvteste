/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapeamento.model;

import java.io.Serializable;
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
@Table(name = "PROGRAMACAO_PLANO")
@NamedQueries({
    @NamedQuery(name = "ProgramacaoPlano.findAll", query = "SELECT p FROM ProgramacaoPlano p"),
    @NamedQuery(name = "ProgramacaoPlano.findByCdProgramacaoPlano", query = "SELECT p FROM ProgramacaoPlano p WHERE p.cdProgramacaoPlano = :cdProgramacaoPlano"),
    @NamedQuery(name = "ProgramacaoPlano.findByCdDia", query = "SELECT p FROM ProgramacaoPlano p WHERE p.cdDia = :cdDia"),
    @NamedQuery(name = "ProgramacaoPlano.findByCdMes", query = "SELECT p FROM ProgramacaoPlano p WHERE p.cdMes = :cdMes"),
    @NamedQuery(name = "ProgramacaoPlano.findByCdAno", query = "SELECT p FROM ProgramacaoPlano p WHERE p.cdAno = :cdAno"),
    @NamedQuery(name = "ProgramacaoPlano.findByDsDiaDaSemana", query = "SELECT p FROM ProgramacaoPlano p WHERE p.dsDiaDaSemana = :dsDiaDaSemana"),
    @NamedQuery(name = "ProgramacaoPlano.findByCdSemanaDoAno", query = "SELECT p FROM ProgramacaoPlano p WHERE p.cdSemanaDoAno = :cdSemanaDoAno"),
    @NamedQuery(name = "ProgramacaoPlano.findByCdSemanaDoMes", query = "SELECT p FROM ProgramacaoPlano p WHERE p.cdSemanaDoMes = :cdSemanaDoMes"),
    @NamedQuery(name = "ProgramacaoPlano.findByQtDias", query = "SELECT p FROM ProgramacaoPlano p WHERE p.qtDias = :qtDias"),
    @NamedQuery(name = "ProgramacaoPlano.findBySnAtivo", query = "SELECT p FROM ProgramacaoPlano p WHERE p.snAtivo = :snAtivo"),
    @NamedQuery(name = "ProgramacaoPlano.findBySnManterCiclo", query = "SELECT p FROM ProgramacaoPlano p WHERE p.snManterCiclo = :snManterCiclo"),
    @NamedQuery(name = "ProgramacaoPlano.findBySnPriorizar", query = "SELECT p FROM ProgramacaoPlano p WHERE p.snPriorizar = :snPriorizar"),
    @NamedQuery(name = "ProgramacaoPlano.findByDtProximaManutencao", query = "SELECT p FROM ProgramacaoPlano p WHERE p.dtProximaManutencao = :dtProximaManutencao"),
    @NamedQuery(name = "ProgramacaoPlano.findByDtUltimaManutencao", query = "SELECT p FROM ProgramacaoPlano p WHERE p.dtUltimaManutencao = :dtUltimaManutencao"),
    @NamedQuery(name = "ProgramacaoPlano.findByTpProgramacao", query = "SELECT p FROM ProgramacaoPlano p WHERE p.tpProgramacao = :tpProgramacao"),
    @NamedQuery(name = "ProgramacaoPlano.findByCdFuncionarioPlano", query = "SELECT p FROM ProgramacaoPlano p WHERE p.cdFuncionarioPlano = :cdFuncionarioPlano"),
    @NamedQuery(name = "ProgramacaoPlano.findByDtUltimaGeracao", query = "SELECT p FROM ProgramacaoPlano p WHERE p.dtUltimaGeracao = :dtUltimaGeracao")})
public class ProgramacaoPlano implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CD_PROGRAMACAO_PLANO")
    private Long cdProgramacaoPlano;
    @Column(name = "CD_DIA")
    private Short cdDia;
    @Column(name = "CD_MES")
    private Short cdMes;
    @Column(name = "CD_ANO")
    private Integer cdAno;
    @Column(name = "DS_DIA_DA_SEMANA")
    private String dsDiaDaSemana;
    @Column(name = "CD_SEMANA_DO_ANO")
    private Short cdSemanaDoAno;
    @Column(name = "CD_SEMANA_DO_MES")
    private Short cdSemanaDoMes;
    @Basic(optional = false)
    @Column(name = "QT_DIAS")
    private int qtDias;
    @Basic(optional = false)
    @Column(name = "SN_ATIVO")
    private String snAtivo;
    @Basic(optional = false)
    @Column(name = "SN_MANTER_CICLO")
    private String snManterCiclo;
    @Basic(optional = false)
    @Column(name = "SN_PRIORIZAR")
    private String snPriorizar;
    @Column(name = "DT_PROXIMA_MANUTENCAO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtProximaManutencao;
    @Column(name = "DT_ULTIMA_MANUTENCAO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtUltimaManutencao;
    @Basic(optional = false)
    @Column(name = "TP_PROGRAMACAO")
    private String tpProgramacao;
    @Column(name = "CD_FUNCIONARIO_PLANO")
    private String cdFuncionarioPlano;
    @Column(name = "DT_ULTIMA_GERACAO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtUltimaGeracao;
    @JoinColumn(name = "CD_LOCALIDADE", referencedColumnName = "CD_LOCALIDADE")
    @ManyToOne(fetch = FetchType.LAZY)
    private Localidade localidade;
    @JoinColumn(name = "CD_ESPEC", referencedColumnName = "CD_ESPEC")
    @ManyToOne(fetch = FetchType.LAZY)
    private ManuEspec manuEspec;
    @JoinColumn(name = "CD_TIPO_OS", referencedColumnName = "CD_TIPO_OS")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private TipoOs tipoOs;
    @OneToMany(mappedBy = "programacaoPlano", fetch = FetchType.LAZY)
    private List<SolicitacaoOs> solicitacaoOsList;

    public ProgramacaoPlano() {
    }

    public ProgramacaoPlano(Long cdProgramacaoPlano) {
        this.cdProgramacaoPlano = cdProgramacaoPlano;
    }

    public ProgramacaoPlano(Long cdProgramacaoPlano, int qtDias, String snAtivo, String snManterCiclo, String snPriorizar, String tpProgramacao) {
        this.cdProgramacaoPlano = cdProgramacaoPlano;
        this.qtDias = qtDias;
        this.snAtivo = snAtivo;
        this.snManterCiclo = snManterCiclo;
        this.snPriorizar = snPriorizar;
        this.tpProgramacao = tpProgramacao;
    }

    public Long getCdProgramacaoPlano() {
        return cdProgramacaoPlano;
    }

    public void setCdProgramacaoPlano(Long cdProgramacaoPlano) {
        this.cdProgramacaoPlano = cdProgramacaoPlano;
    }

    public Short getCdDia() {
        return cdDia;
    }

    public void setCdDia(Short cdDia) {
        this.cdDia = cdDia;
    }

    public Short getCdMes() {
        return cdMes;
    }

    public void setCdMes(Short cdMes) {
        this.cdMes = cdMes;
    }

    public Integer getCdAno() {
        return cdAno;
    }

    public void setCdAno(Integer cdAno) {
        this.cdAno = cdAno;
    }

    public String getDsDiaDaSemana() {
        return dsDiaDaSemana;
    }

    public void setDsDiaDaSemana(String dsDiaDaSemana) {
        this.dsDiaDaSemana = dsDiaDaSemana;
    }

    public Short getCdSemanaDoAno() {
        return cdSemanaDoAno;
    }

    public void setCdSemanaDoAno(Short cdSemanaDoAno) {
        this.cdSemanaDoAno = cdSemanaDoAno;
    }

    public Short getCdSemanaDoMes() {
        return cdSemanaDoMes;
    }

    public void setCdSemanaDoMes(Short cdSemanaDoMes) {
        this.cdSemanaDoMes = cdSemanaDoMes;
    }

    public int getQtDias() {
        return qtDias;
    }

    public void setQtDias(int qtDias) {
        this.qtDias = qtDias;
    }

    public String getSnAtivo() {
        return snAtivo;
    }

    public void setSnAtivo(String snAtivo) {
        this.snAtivo = snAtivo;
    }

    public String getSnManterCiclo() {
        return snManterCiclo;
    }

    public void setSnManterCiclo(String snManterCiclo) {
        this.snManterCiclo = snManterCiclo;
    }

    public String getSnPriorizar() {
        return snPriorizar;
    }

    public void setSnPriorizar(String snPriorizar) {
        this.snPriorizar = snPriorizar;
    }

    public Date getDtProximaManutencao() {
        return dtProximaManutencao;
    }

    public void setDtProximaManutencao(Date dtProximaManutencao) {
        this.dtProximaManutencao = dtProximaManutencao;
    }

    public Date getDtUltimaManutencao() {
        return dtUltimaManutencao;
    }

    public void setDtUltimaManutencao(Date dtUltimaManutencao) {
        this.dtUltimaManutencao = dtUltimaManutencao;
    }

    public String getTpProgramacao() {
        return tpProgramacao;
    }

    public void setTpProgramacao(String tpProgramacao) {
        this.tpProgramacao = tpProgramacao;
    }

    public String getCdFuncionarioPlano() {
        return cdFuncionarioPlano;
    }

    public void setCdFuncionarioPlano(String cdFuncionarioPlano) {
        this.cdFuncionarioPlano = cdFuncionarioPlano;
    }

    public Date getDtUltimaGeracao() {
        return dtUltimaGeracao;
    }

    public void setDtUltimaGeracao(Date dtUltimaGeracao) {
        this.dtUltimaGeracao = dtUltimaGeracao;
    }

    public Localidade getLocalidade() {
        return localidade;
    }

    public void setLocalidade(Localidade localidade) {
        this.localidade = localidade;
    }

    public ManuEspec getManuEspec() {
        return manuEspec;
    }

    public void setManuEspec(ManuEspec manuEspec) {
        this.manuEspec = manuEspec;
    }

    public TipoOs getTipoOs() {
        return tipoOs;
    }

    public void setTipoOs(TipoOs tipoOs) {
        this.tipoOs = tipoOs;
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
        hash += (cdProgramacaoPlano != null ? cdProgramacaoPlano.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProgramacaoPlano)) {
            return false;
        }
        ProgramacaoPlano other = (ProgramacaoPlano) object;
        if ((this.cdProgramacaoPlano == null && other.cdProgramacaoPlano != null) || (this.cdProgramacaoPlano != null && !this.cdProgramacaoPlano.equals(other.cdProgramacaoPlano))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mapeamento.model.ProgramacaoPlano[ cdProgramacaoPlano=" + cdProgramacaoPlano + " ]";
    }
    
}

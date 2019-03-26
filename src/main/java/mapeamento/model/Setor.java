/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapeamento.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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

/**
 *
 * @author gleywson
 */
@Entity
@Table(name = "SETOR")
@NamedQueries({
    @NamedQuery(name = "Setor.findAll", query = "SELECT s FROM Setor s"),
    @NamedQuery(name = "Setor.findByCdSetor", query = "SELECT s FROM Setor s WHERE s.cdSetor = :cdSetor"),
    @NamedQuery(name = "Setor.findByNmSetor", query = "SELECT s FROM Setor s WHERE s.nmSetor = :nmSetor"),
    @NamedQuery(name = "Setor.findByCdCenCus", query = "SELECT s FROM Setor s WHERE s.cdCenCus = :cdCenCus"),
    @NamedQuery(name = "Setor.findBySnPodeSolicitarExames", query = "SELECT s FROM Setor s WHERE s.snPodeSolicitarExames = :snPodeSolicitarExames"),
    @NamedQuery(name = "Setor.findByCdFator", query = "SELECT s FROM Setor s WHERE s.cdFator = :cdFator"),
    @NamedQuery(name = "Setor.findByNrOrdemRateio", query = "SELECT s FROM Setor s WHERE s.nrOrdemRateio = :nrOrdemRateio"),
    @NamedQuery(name = "Setor.findBySnCentroDeCusto", query = "SELECT s FROM Setor s WHERE s.snCentroDeCusto = :snCentroDeCusto"),
    @NamedQuery(name = "Setor.findByClassificacao", query = "SELECT s FROM Setor s WHERE s.classificacao = :classificacao"),
    @NamedQuery(name = "Setor.findByTpRatMatDiretos", query = "SELECT s FROM Setor s WHERE s.tpRatMatDiretos = :tpRatMatDiretos"),
    @NamedQuery(name = "Setor.findBySnAceitaLancamento", query = "SELECT s FROM Setor s WHERE s.snAceitaLancamento = :snAceitaLancamento"),
    @NamedQuery(name = "Setor.findBySnProducaoFaturada", query = "SELECT s FROM Setor s WHERE s.snProducaoFaturada = :snProducaoFaturada"),
    @NamedQuery(name = "Setor.findBySnCalculoEvento", query = "SELECT s FROM Setor s WHERE s.snCalculoEvento = :snCalculoEvento"),
    @NamedQuery(name = "Setor.findByTpComposicaoCalculo", query = "SELECT s FROM Setor s WHERE s.tpComposicaoCalculo = :tpComposicaoCalculo"),
    @NamedQuery(name = "Setor.findByCdSeqResumo", query = "SELECT s FROM Setor s WHERE s.cdSeqResumo = :cdSeqResumo"),
    @NamedQuery(name = "Setor.findByCdSeqDetalhe", query = "SELECT s FROM Setor s WHERE s.cdSeqDetalhe = :cdSeqDetalhe"),
    @NamedQuery(name = "Setor.findBySnDeducaoHonorario", query = "SELECT s FROM Setor s WHERE s.snDeducaoHonorario = :snDeducaoHonorario"),
    @NamedQuery(name = "Setor.findBySnExportaFfis", query = "SELECT s FROM Setor s WHERE s.snExportaFfis = :snExportaFfis"),
    @NamedQuery(name = "Setor.findBySnAtivo", query = "SELECT s FROM Setor s WHERE s.snAtivo = :snAtivo"),
    @NamedQuery(name = "Setor.findByDsCaminhoImpressora", query = "SELECT s FROM Setor s WHERE s.dsCaminhoImpressora = :dsCaminhoImpressora"),
    @NamedQuery(name = "Setor.findByCdSetorExportacao", query = "SELECT s FROM Setor s WHERE s.cdSetorExportacao = :cdSetorExportacao"),
    @NamedQuery(name = "Setor.findByTpCalculoHonorario", query = "SELECT s FROM Setor s WHERE s.tpCalculoHonorario = :tpCalculoHonorario"),
    @NamedQuery(name = "Setor.findBySnImprimeLaudoLocal", query = "SELECT s FROM Setor s WHERE s.snImprimeLaudoLocal = :snImprimeLaudoLocal"),
    @NamedQuery(name = "Setor.findByDsImpressoraEtiqColeta", query = "SELECT s FROM Setor s WHERE s.dsImpressoraEtiqColeta = :dsImpressoraEtiqColeta"),
    @NamedQuery(name = "Setor.findByTpSetor", query = "SELECT s FROM Setor s WHERE s.tpSetor = :tpSetor"),
    @NamedQuery(name = "Setor.findByCdMultiEmpresaOrigem", query = "SELECT s FROM Setor s WHERE s.cdMultiEmpresaOrigem = :cdMultiEmpresaOrigem"),
    @NamedQuery(name = "Setor.findBySnVerExameNLiberado", query = "SELECT s FROM Setor s WHERE s.snVerExameNLiberado = :snVerExameNLiberado"),
    @NamedQuery(name = "Setor.findByCdSetorIntegra", query = "SELECT s FROM Setor s WHERE s.cdSetorIntegra = :cdSetorIntegra"),
    @NamedQuery(name = "Setor.findByDsSiglaAgendamento", query = "SELECT s FROM Setor s WHERE s.dsSiglaAgendamento = :dsSiglaAgendamento"),
    @NamedQuery(name = "Setor.findByTpGrupoSetor", query = "SELECT s FROM Setor s WHERE s.tpGrupoSetor = :tpGrupoSetor"),
    @NamedQuery(name = "Setor.findByTpOripedidoFfch", query = "SELECT s FROM Setor s WHERE s.tpOripedidoFfch = :tpOripedidoFfch"),
    @NamedQuery(name = "Setor.findBySnVerExameImgNLib", query = "SELECT s FROM Setor s WHERE s.snVerExameImgNLib = :snVerExameImgNLib"),
    @NamedQuery(name = "Setor.findBySnObrigaPrestador", query = "SELECT s FROM Setor s WHERE s.snObrigaPrestador = :snObrigaPrestador"),
    @NamedQuery(name = "Setor.findBySnObrigaRecurso", query = "SELECT s FROM Setor s WHERE s.snObrigaRecurso = :snObrigaRecurso"),
    @NamedQuery(name = "Setor.findBySnObrigaUnidade", query = "SELECT s FROM Setor s WHERE s.snObrigaUnidade = :snObrigaUnidade"),
    @NamedQuery(name = "Setor.findByDsObservacaoAgendamento", query = "SELECT s FROM Setor s WHERE s.dsObservacaoAgendamento = :dsObservacaoAgendamento"),
    @NamedQuery(name = "Setor.findBySnExibeTipoHorario", query = "SELECT s FROM Setor s WHERE s.snExibeTipoHorario = :snExibeTipoHorario")})
public class Setor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CD_SETOR")
    private Short cdSetor;
    @Basic(optional = false)
    @Column(name = "NM_SETOR")
    private String nmSetor;
    @Column(name = "CD_CEN_CUS")
    private String cdCenCus;
    @Basic(optional = false)
    @Column(name = "SN_PODE_SOLICITAR_EXAMES")
    private String snPodeSolicitarExames;
    @Column(name = "CD_FATOR")
    private Short cdFator;
    @Column(name = "NR_ORDEM_RATEIO")
    private Short nrOrdemRateio;
    @Basic(optional = false)
    @Column(name = "SN_CENTRO_DE_CUSTO")
    private String snCentroDeCusto;
    @Column(name = "CLASSIFICACAO")
    private String classificacao;
    @Column(name = "TP_RAT_MAT_DIRETOS")
    private String tpRatMatDiretos;
    @Basic(optional = false)
    @Column(name = "SN_ACEITA_LANCAMENTO")
    private String snAceitaLancamento;
    @Column(name = "SN_PRODUCAO_FATURADA")
    private String snProducaoFaturada;
    @Basic(optional = false)
    @Column(name = "SN_CALCULO_EVENTO")
    private String snCalculoEvento;
    @Column(name = "TP_COMPOSICAO_CALCULO")
    private String tpComposicaoCalculo;
    @Column(name = "CD_SEQ_RESUMO")
    private Short cdSeqResumo;
    @Column(name = "CD_SEQ_DETALHE")
    private Short cdSeqDetalhe;
    @Column(name = "SN_DEDUCAO_HONORARIO")
    private String snDeducaoHonorario;
    @Column(name = "SN_EXPORTA_FFIS")
    private String snExportaFfis;
    @Basic(optional = false)
    @Column(name = "SN_ATIVO")
    private String snAtivo;
    @Column(name = "DS_CAMINHO_IMPRESSORA")
    private String dsCaminhoImpressora;
    @Column(name = "CD_SETOR_EXPORTACAO")
    private Long cdSetorExportacao;
    @Column(name = "TP_CALCULO_HONORARIO")
    private String tpCalculoHonorario;
    @Basic(optional = false)
    @Column(name = "SN_IMPRIME_LAUDO_LOCAL")
    private String snImprimeLaudoLocal;
    @Column(name = "DS_IMPRESSORA_ETIQ_COLETA")
    private String dsImpressoraEtiqColeta;
    @Column(name = "TP_SETOR")
    private String tpSetor;
    @Column(name = "CD_MULTI_EMPRESA_ORIGEM")
    private Short cdMultiEmpresaOrigem;
    @Basic(optional = false)
    @Column(name = "SN_VER_EXAME_N_LIBERADO")
    private String snVerExameNLiberado;
    @Column(name = "CD_SETOR_INTEGRA")
    private String cdSetorIntegra;
    @Column(name = "DS_SIGLA_AGENDAMENTO")
    private String dsSiglaAgendamento;
    @Column(name = "TP_GRUPO_SETOR")
    private String tpGrupoSetor;
    @Column(name = "TP_ORIPEDIDO_FFCH")
    private String tpOripedidoFfch;
    @Basic(optional = false)
    @Column(name = "SN_VER_EXAME_IMG_N_LIB")
    private String snVerExameImgNLib;
    @Basic(optional = false)
    @Column(name = "SN_OBRIGA_PRESTADOR")
    private String snObrigaPrestador;
    @Basic(optional = false)
    @Column(name = "SN_OBRIGA_RECURSO")
    private String snObrigaRecurso;
    @Basic(optional = false)
    @Column(name = "SN_OBRIGA_UNIDADE")
    private String snObrigaUnidade;
    @Column(name = "DS_OBSERVACAO_AGENDAMENTO")
    private String dsObservacaoAgendamento;
    @Column(name = "SN_EXIBE_TIPO_HORARIO")
    private String snExibeTipoHorario;
    @OneToMany(mappedBy = "setor", fetch = FetchType.LAZY)
    private List<Funcionario> funcionarioList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "setor", fetch = FetchType.LAZY)
    private List<SolicitacaoOs> solicitacaoOsList;
    @OneToMany(mappedBy = "setor", fetch = FetchType.LAZY)
    private List<Setor> setorList;
    @JoinColumn(name = "CD_SETOR_CUSTO", referencedColumnName = "CD_SETOR")
    @ManyToOne(fetch = FetchType.LAZY)
    private Setor setor;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "setor", fetch = FetchType.LAZY)
    private List<Localidade> localidadeList;

    public Setor() {
    }

    public Setor(Short cdSetor) {
        this.cdSetor = cdSetor;
    }

    public Setor(Short cdSetor, String nmSetor, String snPodeSolicitarExames, String snCentroDeCusto, String snAceitaLancamento, String snCalculoEvento, String snAtivo, String snImprimeLaudoLocal, String snVerExameNLiberado, String snVerExameImgNLib, String snObrigaPrestador, String snObrigaRecurso, String snObrigaUnidade) {
        this.cdSetor = cdSetor;
        this.nmSetor = nmSetor;
        this.snPodeSolicitarExames = snPodeSolicitarExames;
        this.snCentroDeCusto = snCentroDeCusto;
        this.snAceitaLancamento = snAceitaLancamento;
        this.snCalculoEvento = snCalculoEvento;
        this.snAtivo = snAtivo;
        this.snImprimeLaudoLocal = snImprimeLaudoLocal;
        this.snVerExameNLiberado = snVerExameNLiberado;
        this.snVerExameImgNLib = snVerExameImgNLib;
        this.snObrigaPrestador = snObrigaPrestador;
        this.snObrigaRecurso = snObrigaRecurso;
        this.snObrigaUnidade = snObrigaUnidade;
    }

    public Short getCdSetor() {
        return cdSetor;
    }

    public void setCdSetor(Short cdSetor) {
        this.cdSetor = cdSetor;
    }

    public String getNmSetor() {
        return nmSetor;
    }

    public void setNmSetor(String nmSetor) {
        this.nmSetor = nmSetor;
    }

    public String getCdCenCus() {
        return cdCenCus;
    }

    public void setCdCenCus(String cdCenCus) {
        this.cdCenCus = cdCenCus;
    }

    public String getSnPodeSolicitarExames() {
        return snPodeSolicitarExames;
    }

    public void setSnPodeSolicitarExames(String snPodeSolicitarExames) {
        this.snPodeSolicitarExames = snPodeSolicitarExames;
    }

    public Short getCdFator() {
        return cdFator;
    }

    public void setCdFator(Short cdFator) {
        this.cdFator = cdFator;
    }

    public Short getNrOrdemRateio() {
        return nrOrdemRateio;
    }

    public void setNrOrdemRateio(Short nrOrdemRateio) {
        this.nrOrdemRateio = nrOrdemRateio;
    }

    public String getSnCentroDeCusto() {
        return snCentroDeCusto;
    }

    public void setSnCentroDeCusto(String snCentroDeCusto) {
        this.snCentroDeCusto = snCentroDeCusto;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getTpRatMatDiretos() {
        return tpRatMatDiretos;
    }

    public void setTpRatMatDiretos(String tpRatMatDiretos) {
        this.tpRatMatDiretos = tpRatMatDiretos;
    }

    public String getSnAceitaLancamento() {
        return snAceitaLancamento;
    }

    public void setSnAceitaLancamento(String snAceitaLancamento) {
        this.snAceitaLancamento = snAceitaLancamento;
    }

    public String getSnProducaoFaturada() {
        return snProducaoFaturada;
    }

    public void setSnProducaoFaturada(String snProducaoFaturada) {
        this.snProducaoFaturada = snProducaoFaturada;
    }

    public String getSnCalculoEvento() {
        return snCalculoEvento;
    }

    public void setSnCalculoEvento(String snCalculoEvento) {
        this.snCalculoEvento = snCalculoEvento;
    }

    public String getTpComposicaoCalculo() {
        return tpComposicaoCalculo;
    }

    public void setTpComposicaoCalculo(String tpComposicaoCalculo) {
        this.tpComposicaoCalculo = tpComposicaoCalculo;
    }

    public Short getCdSeqResumo() {
        return cdSeqResumo;
    }

    public void setCdSeqResumo(Short cdSeqResumo) {
        this.cdSeqResumo = cdSeqResumo;
    }

    public Short getCdSeqDetalhe() {
        return cdSeqDetalhe;
    }

    public void setCdSeqDetalhe(Short cdSeqDetalhe) {
        this.cdSeqDetalhe = cdSeqDetalhe;
    }

    public String getSnDeducaoHonorario() {
        return snDeducaoHonorario;
    }

    public void setSnDeducaoHonorario(String snDeducaoHonorario) {
        this.snDeducaoHonorario = snDeducaoHonorario;
    }

    public String getSnExportaFfis() {
        return snExportaFfis;
    }

    public void setSnExportaFfis(String snExportaFfis) {
        this.snExportaFfis = snExportaFfis;
    }

    public String getSnAtivo() {
        return snAtivo;
    }

    public void setSnAtivo(String snAtivo) {
        this.snAtivo = snAtivo;
    }

    public String getDsCaminhoImpressora() {
        return dsCaminhoImpressora;
    }

    public void setDsCaminhoImpressora(String dsCaminhoImpressora) {
        this.dsCaminhoImpressora = dsCaminhoImpressora;
    }

    public Long getCdSetorExportacao() {
        return cdSetorExportacao;
    }

    public void setCdSetorExportacao(Long cdSetorExportacao) {
        this.cdSetorExportacao = cdSetorExportacao;
    }

    public String getTpCalculoHonorario() {
        return tpCalculoHonorario;
    }

    public void setTpCalculoHonorario(String tpCalculoHonorario) {
        this.tpCalculoHonorario = tpCalculoHonorario;
    }

    public String getSnImprimeLaudoLocal() {
        return snImprimeLaudoLocal;
    }

    public void setSnImprimeLaudoLocal(String snImprimeLaudoLocal) {
        this.snImprimeLaudoLocal = snImprimeLaudoLocal;
    }

    public String getDsImpressoraEtiqColeta() {
        return dsImpressoraEtiqColeta;
    }

    public void setDsImpressoraEtiqColeta(String dsImpressoraEtiqColeta) {
        this.dsImpressoraEtiqColeta = dsImpressoraEtiqColeta;
    }

    public String getTpSetor() {
        return tpSetor;
    }

    public void setTpSetor(String tpSetor) {
        this.tpSetor = tpSetor;
    }

    public Short getCdMultiEmpresaOrigem() {
        return cdMultiEmpresaOrigem;
    }

    public void setCdMultiEmpresaOrigem(Short cdMultiEmpresaOrigem) {
        this.cdMultiEmpresaOrigem = cdMultiEmpresaOrigem;
    }

    public String getSnVerExameNLiberado() {
        return snVerExameNLiberado;
    }

    public void setSnVerExameNLiberado(String snVerExameNLiberado) {
        this.snVerExameNLiberado = snVerExameNLiberado;
    }

    public String getCdSetorIntegra() {
        return cdSetorIntegra;
    }

    public void setCdSetorIntegra(String cdSetorIntegra) {
        this.cdSetorIntegra = cdSetorIntegra;
    }

    public String getDsSiglaAgendamento() {
        return dsSiglaAgendamento;
    }

    public void setDsSiglaAgendamento(String dsSiglaAgendamento) {
        this.dsSiglaAgendamento = dsSiglaAgendamento;
    }

    public String getTpGrupoSetor() {
        return tpGrupoSetor;
    }

    public void setTpGrupoSetor(String tpGrupoSetor) {
        this.tpGrupoSetor = tpGrupoSetor;
    }

    public String getTpOripedidoFfch() {
        return tpOripedidoFfch;
    }

    public void setTpOripedidoFfch(String tpOripedidoFfch) {
        this.tpOripedidoFfch = tpOripedidoFfch;
    }

    public String getSnVerExameImgNLib() {
        return snVerExameImgNLib;
    }

    public void setSnVerExameImgNLib(String snVerExameImgNLib) {
        this.snVerExameImgNLib = snVerExameImgNLib;
    }

    public String getSnObrigaPrestador() {
        return snObrigaPrestador;
    }

    public void setSnObrigaPrestador(String snObrigaPrestador) {
        this.snObrigaPrestador = snObrigaPrestador;
    }

    public String getSnObrigaRecurso() {
        return snObrigaRecurso;
    }

    public void setSnObrigaRecurso(String snObrigaRecurso) {
        this.snObrigaRecurso = snObrigaRecurso;
    }

    public String getSnObrigaUnidade() {
        return snObrigaUnidade;
    }

    public void setSnObrigaUnidade(String snObrigaUnidade) {
        this.snObrigaUnidade = snObrigaUnidade;
    }

    public String getDsObservacaoAgendamento() {
        return dsObservacaoAgendamento;
    }

    public void setDsObservacaoAgendamento(String dsObservacaoAgendamento) {
        this.dsObservacaoAgendamento = dsObservacaoAgendamento;
    }

    public String getSnExibeTipoHorario() {
        return snExibeTipoHorario;
    }

    public void setSnExibeTipoHorario(String snExibeTipoHorario) {
        this.snExibeTipoHorario = snExibeTipoHorario;
    }

    public List<Funcionario> getFuncionarioList() {
        return funcionarioList;
    }

    public void setFuncionarioList(List<Funcionario> funcionarioList) {
        this.funcionarioList = funcionarioList;
    }

    public List<SolicitacaoOs> getSolicitacaoOsList() {
        return solicitacaoOsList;
    }

    public void setSolicitacaoOsList(List<SolicitacaoOs> solicitacaoOsList) {
        this.solicitacaoOsList = solicitacaoOsList;
    }

    public List<Setor> getSetorList() {
        return setorList;
    }

    public void setSetorList(List<Setor> setorList) {
        this.setorList = setorList;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public List<Localidade> getLocalidadeList() {
        return localidadeList;
    }

    public void setLocalidadeList(List<Localidade> localidadeList) {
        this.localidadeList = localidadeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cdSetor != null ? cdSetor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Setor)) {
            return false;
        }
        Setor other = (Setor) object;
        if ((this.cdSetor == null && other.cdSetor != null) || (this.cdSetor != null && !this.cdSetor.equals(other.cdSetor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mapeamento.model.Setor[ cdSetor=" + cdSetor + " ]";
    }
    
}

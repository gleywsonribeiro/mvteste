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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author gleywson
 */
@Entity
@Table(name = "SOLICITACAO_OS")
@NamedQueries({
    @NamedQuery(name = "SolicitacaoOs.findAll", query = "SELECT s FROM SolicitacaoOs s"),
    @NamedQuery(name = "SolicitacaoOs.findByCdOs", query = "SELECT s FROM SolicitacaoOs s WHERE s.cdOs = :cdOs"),
    @NamedQuery(name = "SolicitacaoOs.findByDtPedido", query = "SELECT s FROM SolicitacaoOs s WHERE s.dtPedido = :dtPedido"),
    @NamedQuery(name = "SolicitacaoOs.findByDsServico", query = "SELECT s FROM SolicitacaoOs s WHERE s.dsServico = :dsServico"),
    @NamedQuery(name = "SolicitacaoOs.findByDsObservacao", query = "SELECT s FROM SolicitacaoOs s WHERE s.dsObservacao = :dsObservacao"),
    @NamedQuery(name = "SolicitacaoOs.findByDtExecucao", query = "SELECT s FROM SolicitacaoOs s WHERE s.dtExecucao = :dtExecucao"),
    @NamedQuery(name = "SolicitacaoOs.findByDtPrevExec", query = "SELECT s FROM SolicitacaoOs s WHERE s.dtPrevExec = :dtPrevExec"),
    @NamedQuery(name = "SolicitacaoOs.findByNmSolicitante", query = "SELECT s FROM SolicitacaoOs s WHERE s.nmSolicitante = :nmSolicitante"),
    @NamedQuery(name = "SolicitacaoOs.findByTpSituacao", query = "SELECT s FROM SolicitacaoOs s WHERE s.tpSituacao = :tpSituacao"),
    @NamedQuery(name = "SolicitacaoOs.findByNmUsuario", query = "SELECT s FROM SolicitacaoOs s WHERE s.nmUsuario = :nmUsuario"),
    @NamedQuery(name = "SolicitacaoOs.findByDtUltimaAtualizacao", query = "SELECT s FROM SolicitacaoOs s WHERE s.dtUltimaAtualizacao = :dtUltimaAtualizacao"),
    @NamedQuery(name = "SolicitacaoOs.findByTpLocal", query = "SELECT s FROM SolicitacaoOs s WHERE s.tpLocal = :tpLocal"),
    @NamedQuery(name = "SolicitacaoOs.findByCdBem", query = "SELECT s FROM SolicitacaoOs s WHERE s.cdBem = :cdBem"),
    @NamedQuery(name = "SolicitacaoOs.findByTpMotCorret", query = "SELECT s FROM SolicitacaoOs s WHERE s.tpMotCorret = :tpMotCorret"),
    @NamedQuery(name = "SolicitacaoOs.findBySnSolExterna", query = "SELECT s FROM SolicitacaoOs s WHERE s.snSolExterna = :snSolExterna"),
    @NamedQuery(name = "SolicitacaoOs.findByCdFornecedor", query = "SELECT s FROM SolicitacaoOs s WHERE s.cdFornecedor = :cdFornecedor"),
    @NamedQuery(name = "SolicitacaoOs.findByCdOficina", query = "SELECT s FROM SolicitacaoOs s WHERE s.cdOficina = :cdOficina"),
    @NamedQuery(name = "SolicitacaoOs.findBySnOrdemServicoPrincipal", query = "SELECT s FROM SolicitacaoOs s WHERE s.snOrdemServicoPrincipal = :snOrdemServicoPrincipal"),
    @NamedQuery(name = "SolicitacaoOs.findBySnOsImpressa", query = "SELECT s FROM SolicitacaoOs s WHERE s.snOsImpressa = :snOsImpressa"),
    @NamedQuery(name = "SolicitacaoOs.findByDtHoraImpressao", query = "SELECT s FROM SolicitacaoOs s WHERE s.dtHoraImpressao = :dtHoraImpressao"),
    @NamedQuery(name = "SolicitacaoOs.findByCdOsIntegra", query = "SELECT s FROM SolicitacaoOs s WHERE s.cdOsIntegra = :cdOsIntegra"),
    @NamedQuery(name = "SolicitacaoOs.findByCdOrdemServicoPrincIntegra", query = "SELECT s FROM SolicitacaoOs s WHERE s.cdOrdemServicoPrincIntegra = :cdOrdemServicoPrincIntegra"),
    @NamedQuery(name = "SolicitacaoOs.findByCdSeqIntegra", query = "SELECT s FROM SolicitacaoOs s WHERE s.cdSeqIntegra = :cdSeqIntegra"),
    @NamedQuery(name = "SolicitacaoOs.findByDtIntegra", query = "SELECT s FROM SolicitacaoOs s WHERE s.dtIntegra = :dtIntegra"),
    @NamedQuery(name = "SolicitacaoOs.findBySnPaciente", query = "SELECT s FROM SolicitacaoOs s WHERE s.snPaciente = :snPaciente"),
    @NamedQuery(name = "SolicitacaoOs.findByDtEntrega", query = "SELECT s FROM SolicitacaoOs s WHERE s.dtEntrega = :dtEntrega"),
    @NamedQuery(name = "SolicitacaoOs.findByDsEmailAlternativo", query = "SELECT s FROM SolicitacaoOs s WHERE s.dsEmailAlternativo = :dsEmailAlternativo"),
    @NamedQuery(name = "SolicitacaoOs.findByDsRamal", query = "SELECT s FROM SolicitacaoOs s WHERE s.dsRamal = :dsRamal"),
    @NamedQuery(name = "SolicitacaoOs.findByTpPrioridade", query = "SELECT s FROM SolicitacaoOs s WHERE s.tpPrioridade = :tpPrioridade"),
    @NamedQuery(name = "SolicitacaoOs.findByQtProntuarios", query = "SELECT s FROM SolicitacaoOs s WHERE s.qtProntuarios = :qtProntuarios"),
    @NamedQuery(name = "SolicitacaoOs.findBySnRecebida", query = "SELECT s FROM SolicitacaoOs s WHERE s.snRecebida = :snRecebida"),
    @NamedQuery(name = "SolicitacaoOs.findByCdResponsavel", query = "SELECT s FROM SolicitacaoOs s WHERE s.cdResponsavel = :cdResponsavel"),
    @NamedQuery(name = "SolicitacaoOs.findBySnEtiquetaImpressa", query = "SELECT s FROM SolicitacaoOs s WHERE s.snEtiquetaImpressa = :snEtiquetaImpressa"),
    @NamedQuery(name = "SolicitacaoOs.findBySnEmailEnviado", query = "SELECT s FROM SolicitacaoOs s WHERE s.snEmailEnviado = :snEmailEnviado"),
    @NamedQuery(name = "SolicitacaoOs.findByCdPlano", query = "SELECT s FROM SolicitacaoOs s WHERE s.cdPlano = :cdPlano"),
    @NamedQuery(name = "SolicitacaoOs.findByTpClassificacao", query = "SELECT s FROM SolicitacaoOs s WHERE s.tpClassificacao = :tpClassificacao"),
    @NamedQuery(name = "SolicitacaoOs.findByDsServicoGeral", query = "SELECT s FROM SolicitacaoOs s WHERE s.dsServicoGeral = :dsServicoGeral"),
    @NamedQuery(name = "SolicitacaoOs.findByCdUsuarioCadastroSs", query = "SELECT s FROM SolicitacaoOs s WHERE s.cdUsuarioCadastroSs = :cdUsuarioCadastroSs"),
    @NamedQuery(name = "SolicitacaoOs.findByDtUsuarioCadastroSs", query = "SELECT s FROM SolicitacaoOs s WHERE s.dtUsuarioCadastroSs = :dtUsuarioCadastroSs"),
    @NamedQuery(name = "SolicitacaoOs.findByCdUsuarioCadastroOs", query = "SELECT s FROM SolicitacaoOs s WHERE s.cdUsuarioCadastroOs = :cdUsuarioCadastroOs"),
    @NamedQuery(name = "SolicitacaoOs.findByDtUsuarioCadastroOs", query = "SELECT s FROM SolicitacaoOs s WHERE s.dtUsuarioCadastroOs = :dtUsuarioCadastroOs"),
    @NamedQuery(name = "SolicitacaoOs.findByCdUsuarioUltimaModificacao", query = "SELECT s FROM SolicitacaoOs s WHERE s.cdUsuarioUltimaModificacao = :cdUsuarioUltimaModificacao"),
    @NamedQuery(name = "SolicitacaoOs.findByDtUsuarioUltimaModificacao", query = "SELECT s FROM SolicitacaoOs s WHERE s.dtUsuarioUltimaModificacao = :dtUsuarioUltimaModificacao"),
    @NamedQuery(name = "SolicitacaoOs.findByCdUsuarioRecebeSs", query = "SELECT s FROM SolicitacaoOs s WHERE s.cdUsuarioRecebeSs = :cdUsuarioRecebeSs"),
    @NamedQuery(name = "SolicitacaoOs.findByDtUsuarioRecebeSs", query = "SELECT s FROM SolicitacaoOs s WHERE s.dtUsuarioRecebeSs = :dtUsuarioRecebeSs"),
    @NamedQuery(name = "SolicitacaoOs.findByCdUsuarioFechaOs", query = "SELECT s FROM SolicitacaoOs s WHERE s.cdUsuarioFechaOs = :cdUsuarioFechaOs"),
    @NamedQuery(name = "SolicitacaoOs.findByDtUsuarioFechaOs", query = "SELECT s FROM SolicitacaoOs s WHERE s.dtUsuarioFechaOs = :dtUsuarioFechaOs"),
    @NamedQuery(name = "SolicitacaoOs.findByCdUsuarioGeraOs", query = "SELECT s FROM SolicitacaoOs s WHERE s.cdUsuarioGeraOs = :cdUsuarioGeraOs"),
    @NamedQuery(name = "SolicitacaoOs.findByDtUsuarioGeraOs", query = "SELECT s FROM SolicitacaoOs s WHERE s.dtUsuarioGeraOs = :dtUsuarioGeraOs"),
    @NamedQuery(name = "SolicitacaoOs.findByDsConcluido", query = "SELECT s FROM SolicitacaoOs s WHERE s.dsConcluido = :dsConcluido"),
    @NamedQuery(name = "SolicitacaoOs.findByCdUsuarioReprovaOs", query = "SELECT s FROM SolicitacaoOs s WHERE s.cdUsuarioReprovaOs = :cdUsuarioReprovaOs"),
    @NamedQuery(name = "SolicitacaoOs.findByDtUsuarioReprovaOs", query = "SELECT s FROM SolicitacaoOs s WHERE s.dtUsuarioReprovaOs = :dtUsuarioReprovaOs"),
    @NamedQuery(name = "SolicitacaoOs.findByCdUsuarioCadastroSolServ", query = "SELECT s FROM SolicitacaoOs s WHERE s.cdUsuarioCadastroSolServ = :cdUsuarioCadastroSolServ"),
    @NamedQuery(name = "SolicitacaoOs.findByDtUsuarioCadastroSolServ", query = "SELECT s FROM SolicitacaoOs s WHERE s.dtUsuarioCadastroSolServ = :dtUsuarioCadastroSolServ"),
    @NamedQuery(name = "SolicitacaoOs.findByCdUsuarioRecebeSolServ", query = "SELECT s FROM SolicitacaoOs s WHERE s.cdUsuarioRecebeSolServ = :cdUsuarioRecebeSolServ"),
    @NamedQuery(name = "SolicitacaoOs.findByDtUsuarioRecebeSolServ", query = "SELECT s FROM SolicitacaoOs s WHERE s.dtUsuarioRecebeSolServ = :dtUsuarioRecebeSolServ")})
public class SolicitacaoOs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CD_OS")
    private Long cdOs;
    @Basic(optional = false)
    @Column(name = "DT_PEDIDO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtPedido;
    @Basic(optional = false)
    @Column(name = "DS_SERVICO")
    private String dsServico;
    @Column(name = "DS_OBSERVACAO")
    private String dsObservacao;
    @Column(name = "DT_EXECUCAO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtExecucao;
    @Column(name = "DT_PREV_EXEC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtPrevExec;
    @Basic(optional = false)
    @Column(name = "NM_SOLICITANTE")
    private String nmSolicitante;
    @Basic(optional = false)
    @Column(name = "TP_SITUACAO")
    private String tpSituacao;
    @Basic(optional = false)
    @Column(name = "NM_USUARIO")
    private String nmUsuario;
    @Basic(optional = false)
    @Column(name = "DT_ULTIMA_ATUALIZACAO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtUltimaAtualizacao;
    @Column(name = "TP_LOCAL")
    private String tpLocal;
    @Column(name = "CD_BEM")
    private Integer cdBem;
    @Column(name = "TP_MOT_CORRET")
    private String tpMotCorret;
    @Column(name = "SN_SOL_EXTERNA")
    private String snSolExterna;
    @Column(name = "CD_FORNECEDOR")
    private Integer cdFornecedor;
    @Column(name = "CD_OFICINA")
    private BigInteger cdOficina;
    @Basic(optional = false)
    @Column(name = "SN_ORDEM_SERVICO_PRINCIPAL")
    private String snOrdemServicoPrincipal;
    @Column(name = "SN_OS_IMPRESSA")
    private String snOsImpressa;
    @Column(name = "DT_HORA_IMPRESSAO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtHoraImpressao;
    @Column(name = "CD_OS_INTEGRA")
    private String cdOsIntegra;
    @Column(name = "CD_ORDEM_SERVICO_PRINC_INTEGRA")
    private String cdOrdemServicoPrincIntegra;
    @Column(name = "CD_SEQ_INTEGRA")
    private BigInteger cdSeqIntegra;
    @Column(name = "DT_INTEGRA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtIntegra;
    @Column(name = "SN_PACIENTE")
    private String snPaciente;
    @Column(name = "DT_ENTREGA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtEntrega;
    @Column(name = "DS_EMAIL_ALTERNATIVO")
    private String dsEmailAlternativo;
    @Column(name = "DS_RAMAL")
    private String dsRamal;
    @Basic(optional = false)
    @Column(name = "TP_PRIORIDADE")
    private String tpPrioridade;
    @Column(name = "QT_PRONTUARIOS")
    private Integer qtProntuarios;
    @Column(name = "SN_RECEBIDA")
    private String snRecebida;
    @Column(name = "CD_RESPONSAVEL")
    private String cdResponsavel;
    @Basic(optional = false)
    @Column(name = "SN_ETIQUETA_IMPRESSA")
    private String snEtiquetaImpressa;
    @Column(name = "SN_EMAIL_ENVIADO")
    private String snEmailEnviado;
    @Column(name = "CD_PLANO")
    private Long cdPlano;
    @Basic(optional = false)
    @Column(name = "TP_CLASSIFICACAO")
    private String tpClassificacao;
    @Column(name = "DS_SERVICO_GERAL")
    private String dsServicoGeral;
    @Column(name = "CD_USUARIO_CADASTRO_SS")
    private String cdUsuarioCadastroSs;
    @Column(name = "DT_USUARIO_CADASTRO_SS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtUsuarioCadastroSs;
    @Column(name = "CD_USUARIO_CADASTRO_OS")
    private String cdUsuarioCadastroOs;
    @Column(name = "DT_USUARIO_CADASTRO_OS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtUsuarioCadastroOs;
    @Column(name = "CD_USUARIO_ULTIMA_MODIFICACAO")
    private String cdUsuarioUltimaModificacao;
    @Column(name = "DT_USUARIO_ULTIMA_MODIFICACAO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtUsuarioUltimaModificacao;
    @Column(name = "CD_USUARIO_RECEBE_SS")
    private String cdUsuarioRecebeSs;
    @Column(name = "DT_USUARIO_RECEBE_SS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtUsuarioRecebeSs;
    @Column(name = "CD_USUARIO_FECHA_OS")
    private String cdUsuarioFechaOs;
    @Column(name = "DT_USUARIO_FECHA_OS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtUsuarioFechaOs;
    @Column(name = "CD_USUARIO_GERA_OS")
    private String cdUsuarioGeraOs;
    @Column(name = "DT_USUARIO_GERA_OS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtUsuarioGeraOs;
    @Column(name = "DS_CONCLUIDO")
    private String dsConcluido;
    @Column(name = "CD_USUARIO_REPROVA_OS")
    private String cdUsuarioReprovaOs;
    @Column(name = "DT_USUARIO_REPROVA_OS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtUsuarioReprovaOs;
    @Column(name = "CD_USUARIO_CADASTRO_SOL_SERV")
    private String cdUsuarioCadastroSolServ;
    @Column(name = "DT_USUARIO_CADASTRO_SOL_SERV")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtUsuarioCadastroSolServ;
    @Column(name = "CD_USUARIO_RECEBE_SOL_SERV")
    private String cdUsuarioRecebeSolServ;
    @Column(name = "DT_USUARIO_RECEBE_SOL_SERV")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtUsuarioRecebeSolServ;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "solicitacaoOs", fetch = FetchType.LAZY)
    private List<HistoricoTransferenciaOfic> historicoTransferenciaOficList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "solicitacaoOs", fetch = FetchType.LAZY)
    private List<SolicitacaoServicoDoc> solicitacaoServicoDocList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "solicitacaoOs", fetch = FetchType.LAZY)
    private List<ItsolicitacaoOs> itsolicitacaoOsList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "solicitacaoOs", fetch = FetchType.LAZY)
    private ManuProd manuProd;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "solicitacaoOs", fetch = FetchType.LAZY)
    private List<ItsolicitacaoExt> itsolicitacaoExtList;
    @JoinColumn(name = "CD_LOCALIDADE", referencedColumnName = "CD_LOCALIDADE")
    @ManyToOne(fetch = FetchType.LAZY)
    private Localidade localidade;
    @JoinColumn(name = "CD_ESPEC", referencedColumnName = "CD_ESPEC")
    @ManyToOne(fetch = FetchType.LAZY)
    private ManuEspec manuEspec;
    @JoinColumn(name = "CD_MOT_SERV", referencedColumnName = "CD_MOT_SERV")
    @ManyToOne(fetch = FetchType.LAZY)
    private MotServ motServ;
    @JoinColumn(name = "CD_PROGRAMACAO_PLANO", referencedColumnName = "CD_PROGRAMACAO_PLANO")
    @ManyToOne(fetch = FetchType.LAZY)
    private ProgramacaoPlano programacaoPlano;
    @JoinColumn(name = "CD_SETOR", referencedColumnName = "CD_SETOR")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Setor setor;
    @OneToMany(mappedBy = "solicitacaoOs", fetch = FetchType.LAZY)
    private List<SolicitacaoOs> solicitacaoOsList;
    @JoinColumn(name = "CD_ORDEM_SERVICO_PRINCIPAL", referencedColumnName = "CD_OS")
    @ManyToOne(fetch = FetchType.LAZY)
    private SolicitacaoOs solicitacaoOs;
    @JoinColumn(name = "CD_TIPO_OS", referencedColumnName = "CD_TIPO_OS")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private TipoOs tipoOs;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "solicitacaoOs", fetch = FetchType.LAZY)
    private AvaliacaoServico avaliacaoServico;

    public SolicitacaoOs() {
    }

    public SolicitacaoOs(Long cdOs) {
        this.cdOs = cdOs;
    }

    public SolicitacaoOs(Long cdOs, Date dtPedido, String dsServico, String nmSolicitante, String tpSituacao, String nmUsuario, Date dtUltimaAtualizacao, String snOrdemServicoPrincipal, String tpPrioridade, String snEtiquetaImpressa, String tpClassificacao) {
        this.cdOs = cdOs;
        this.dtPedido = dtPedido;
        this.dsServico = dsServico;
        this.nmSolicitante = nmSolicitante;
        this.tpSituacao = tpSituacao;
        this.nmUsuario = nmUsuario;
        this.dtUltimaAtualizacao = dtUltimaAtualizacao;
        this.snOrdemServicoPrincipal = snOrdemServicoPrincipal;
        this.tpPrioridade = tpPrioridade;
        this.snEtiquetaImpressa = snEtiquetaImpressa;
        this.tpClassificacao = tpClassificacao;
    }

    public Long getCdOs() {
        return cdOs;
    }

    public void setCdOs(Long cdOs) {
        this.cdOs = cdOs;
    }

    public Date getDtPedido() {
        return dtPedido;
    }

    public void setDtPedido(Date dtPedido) {
        this.dtPedido = dtPedido;
    }

    public String getDsServico() {
        return dsServico;
    }

    public void setDsServico(String dsServico) {
        this.dsServico = dsServico;
    }

    public String getDsObservacao() {
        return dsObservacao;
    }

    public void setDsObservacao(String dsObservacao) {
        this.dsObservacao = dsObservacao;
    }

    public Date getDtExecucao() {
        return dtExecucao;
    }

    public void setDtExecucao(Date dtExecucao) {
        this.dtExecucao = dtExecucao;
    }

    public Date getDtPrevExec() {
        return dtPrevExec;
    }

    public void setDtPrevExec(Date dtPrevExec) {
        this.dtPrevExec = dtPrevExec;
    }

    public String getNmSolicitante() {
        return nmSolicitante;
    }

    public void setNmSolicitante(String nmSolicitante) {
        this.nmSolicitante = nmSolicitante;
    }

    public String getTpSituacao() {
        return tpSituacao;
    }

    public void setTpSituacao(String tpSituacao) {
        this.tpSituacao = tpSituacao;
    }

    public String getNmUsuario() {
        return nmUsuario;
    }

    public void setNmUsuario(String nmUsuario) {
        this.nmUsuario = nmUsuario;
    }

    public Date getDtUltimaAtualizacao() {
        return dtUltimaAtualizacao;
    }

    public void setDtUltimaAtualizacao(Date dtUltimaAtualizacao) {
        this.dtUltimaAtualizacao = dtUltimaAtualizacao;
    }

    public String getTpLocal() {
        return tpLocal;
    }

    public void setTpLocal(String tpLocal) {
        this.tpLocal = tpLocal;
    }

    public Integer getCdBem() {
        return cdBem;
    }

    public void setCdBem(Integer cdBem) {
        this.cdBem = cdBem;
    }

    public String getTpMotCorret() {
        return tpMotCorret;
    }

    public void setTpMotCorret(String tpMotCorret) {
        this.tpMotCorret = tpMotCorret;
    }

    public String getSnSolExterna() {
        return snSolExterna;
    }

    public void setSnSolExterna(String snSolExterna) {
        this.snSolExterna = snSolExterna;
    }

    public Integer getCdFornecedor() {
        return cdFornecedor;
    }

    public void setCdFornecedor(Integer cdFornecedor) {
        this.cdFornecedor = cdFornecedor;
    }

    public BigInteger getCdOficina() {
        return cdOficina;
    }

    public void setCdOficina(BigInteger cdOficina) {
        this.cdOficina = cdOficina;
    }

    public String getSnOrdemServicoPrincipal() {
        return snOrdemServicoPrincipal;
    }

    public void setSnOrdemServicoPrincipal(String snOrdemServicoPrincipal) {
        this.snOrdemServicoPrincipal = snOrdemServicoPrincipal;
    }

    public String getSnOsImpressa() {
        return snOsImpressa;
    }

    public void setSnOsImpressa(String snOsImpressa) {
        this.snOsImpressa = snOsImpressa;
    }

    public Date getDtHoraImpressao() {
        return dtHoraImpressao;
    }

    public void setDtHoraImpressao(Date dtHoraImpressao) {
        this.dtHoraImpressao = dtHoraImpressao;
    }

    public String getCdOsIntegra() {
        return cdOsIntegra;
    }

    public void setCdOsIntegra(String cdOsIntegra) {
        this.cdOsIntegra = cdOsIntegra;
    }

    public String getCdOrdemServicoPrincIntegra() {
        return cdOrdemServicoPrincIntegra;
    }

    public void setCdOrdemServicoPrincIntegra(String cdOrdemServicoPrincIntegra) {
        this.cdOrdemServicoPrincIntegra = cdOrdemServicoPrincIntegra;
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

    public String getSnPaciente() {
        return snPaciente;
    }

    public void setSnPaciente(String snPaciente) {
        this.snPaciente = snPaciente;
    }

    public Date getDtEntrega() {
        return dtEntrega;
    }

    public void setDtEntrega(Date dtEntrega) {
        this.dtEntrega = dtEntrega;
    }

    public String getDsEmailAlternativo() {
        return dsEmailAlternativo;
    }

    public void setDsEmailAlternativo(String dsEmailAlternativo) {
        this.dsEmailAlternativo = dsEmailAlternativo;
    }

    public String getDsRamal() {
        return dsRamal;
    }

    public void setDsRamal(String dsRamal) {
        this.dsRamal = dsRamal;
    }

    public String getTpPrioridade() {
        return tpPrioridade;
    }

    public void setTpPrioridade(String tpPrioridade) {
        this.tpPrioridade = tpPrioridade;
    }

    public Integer getQtProntuarios() {
        return qtProntuarios;
    }

    public void setQtProntuarios(Integer qtProntuarios) {
        this.qtProntuarios = qtProntuarios;
    }

    public String getSnRecebida() {
        return snRecebida;
    }

    public void setSnRecebida(String snRecebida) {
        this.snRecebida = snRecebida;
    }

    public String getCdResponsavel() {
        return cdResponsavel;
    }

    public void setCdResponsavel(String cdResponsavel) {
        this.cdResponsavel = cdResponsavel;
    }

    public String getSnEtiquetaImpressa() {
        return snEtiquetaImpressa;
    }

    public void setSnEtiquetaImpressa(String snEtiquetaImpressa) {
        this.snEtiquetaImpressa = snEtiquetaImpressa;
    }

    public String getSnEmailEnviado() {
        return snEmailEnviado;
    }

    public void setSnEmailEnviado(String snEmailEnviado) {
        this.snEmailEnviado = snEmailEnviado;
    }

    public Long getCdPlano() {
        return cdPlano;
    }

    public void setCdPlano(Long cdPlano) {
        this.cdPlano = cdPlano;
    }

    public String getTpClassificacao() {
        return tpClassificacao;
    }

    public void setTpClassificacao(String tpClassificacao) {
        this.tpClassificacao = tpClassificacao;
    }

    public String getDsServicoGeral() {
        return dsServicoGeral;
    }

    public void setDsServicoGeral(String dsServicoGeral) {
        this.dsServicoGeral = dsServicoGeral;
    }

    public String getCdUsuarioCadastroSs() {
        return cdUsuarioCadastroSs;
    }

    public void setCdUsuarioCadastroSs(String cdUsuarioCadastroSs) {
        this.cdUsuarioCadastroSs = cdUsuarioCadastroSs;
    }

    public Date getDtUsuarioCadastroSs() {
        return dtUsuarioCadastroSs;
    }

    public void setDtUsuarioCadastroSs(Date dtUsuarioCadastroSs) {
        this.dtUsuarioCadastroSs = dtUsuarioCadastroSs;
    }

    public String getCdUsuarioCadastroOs() {
        return cdUsuarioCadastroOs;
    }

    public void setCdUsuarioCadastroOs(String cdUsuarioCadastroOs) {
        this.cdUsuarioCadastroOs = cdUsuarioCadastroOs;
    }

    public Date getDtUsuarioCadastroOs() {
        return dtUsuarioCadastroOs;
    }

    public void setDtUsuarioCadastroOs(Date dtUsuarioCadastroOs) {
        this.dtUsuarioCadastroOs = dtUsuarioCadastroOs;
    }

    public String getCdUsuarioUltimaModificacao() {
        return cdUsuarioUltimaModificacao;
    }

    public void setCdUsuarioUltimaModificacao(String cdUsuarioUltimaModificacao) {
        this.cdUsuarioUltimaModificacao = cdUsuarioUltimaModificacao;
    }

    public Date getDtUsuarioUltimaModificacao() {
        return dtUsuarioUltimaModificacao;
    }

    public void setDtUsuarioUltimaModificacao(Date dtUsuarioUltimaModificacao) {
        this.dtUsuarioUltimaModificacao = dtUsuarioUltimaModificacao;
    }

    public String getCdUsuarioRecebeSs() {
        return cdUsuarioRecebeSs;
    }

    public void setCdUsuarioRecebeSs(String cdUsuarioRecebeSs) {
        this.cdUsuarioRecebeSs = cdUsuarioRecebeSs;
    }

    public Date getDtUsuarioRecebeSs() {
        return dtUsuarioRecebeSs;
    }

    public void setDtUsuarioRecebeSs(Date dtUsuarioRecebeSs) {
        this.dtUsuarioRecebeSs = dtUsuarioRecebeSs;
    }

    public String getCdUsuarioFechaOs() {
        return cdUsuarioFechaOs;
    }

    public void setCdUsuarioFechaOs(String cdUsuarioFechaOs) {
        this.cdUsuarioFechaOs = cdUsuarioFechaOs;
    }

    public Date getDtUsuarioFechaOs() {
        return dtUsuarioFechaOs;
    }

    public void setDtUsuarioFechaOs(Date dtUsuarioFechaOs) {
        this.dtUsuarioFechaOs = dtUsuarioFechaOs;
    }

    public String getCdUsuarioGeraOs() {
        return cdUsuarioGeraOs;
    }

    public void setCdUsuarioGeraOs(String cdUsuarioGeraOs) {
        this.cdUsuarioGeraOs = cdUsuarioGeraOs;
    }

    public Date getDtUsuarioGeraOs() {
        return dtUsuarioGeraOs;
    }

    public void setDtUsuarioGeraOs(Date dtUsuarioGeraOs) {
        this.dtUsuarioGeraOs = dtUsuarioGeraOs;
    }

    public String getDsConcluido() {
        return dsConcluido;
    }

    public void setDsConcluido(String dsConcluido) {
        this.dsConcluido = dsConcluido;
    }

    public String getCdUsuarioReprovaOs() {
        return cdUsuarioReprovaOs;
    }

    public void setCdUsuarioReprovaOs(String cdUsuarioReprovaOs) {
        this.cdUsuarioReprovaOs = cdUsuarioReprovaOs;
    }

    public Date getDtUsuarioReprovaOs() {
        return dtUsuarioReprovaOs;
    }

    public void setDtUsuarioReprovaOs(Date dtUsuarioReprovaOs) {
        this.dtUsuarioReprovaOs = dtUsuarioReprovaOs;
    }

    public String getCdUsuarioCadastroSolServ() {
        return cdUsuarioCadastroSolServ;
    }

    public void setCdUsuarioCadastroSolServ(String cdUsuarioCadastroSolServ) {
        this.cdUsuarioCadastroSolServ = cdUsuarioCadastroSolServ;
    }

    public Date getDtUsuarioCadastroSolServ() {
        return dtUsuarioCadastroSolServ;
    }

    public void setDtUsuarioCadastroSolServ(Date dtUsuarioCadastroSolServ) {
        this.dtUsuarioCadastroSolServ = dtUsuarioCadastroSolServ;
    }

    public String getCdUsuarioRecebeSolServ() {
        return cdUsuarioRecebeSolServ;
    }

    public void setCdUsuarioRecebeSolServ(String cdUsuarioRecebeSolServ) {
        this.cdUsuarioRecebeSolServ = cdUsuarioRecebeSolServ;
    }

    public Date getDtUsuarioRecebeSolServ() {
        return dtUsuarioRecebeSolServ;
    }

    public void setDtUsuarioRecebeSolServ(Date dtUsuarioRecebeSolServ) {
        this.dtUsuarioRecebeSolServ = dtUsuarioRecebeSolServ;
    }

    public List<HistoricoTransferenciaOfic> getHistoricoTransferenciaOficList() {
        return historicoTransferenciaOficList;
    }

    public void setHistoricoTransferenciaOficList(List<HistoricoTransferenciaOfic> historicoTransferenciaOficList) {
        this.historicoTransferenciaOficList = historicoTransferenciaOficList;
    }

    public List<SolicitacaoServicoDoc> getSolicitacaoServicoDocList() {
        return solicitacaoServicoDocList;
    }

    public void setSolicitacaoServicoDocList(List<SolicitacaoServicoDoc> solicitacaoServicoDocList) {
        this.solicitacaoServicoDocList = solicitacaoServicoDocList;
    }

    public List<ItsolicitacaoOs> getItsolicitacaoOsList() {
        return itsolicitacaoOsList;
    }

    public void setItsolicitacaoOsList(List<ItsolicitacaoOs> itsolicitacaoOsList) {
        this.itsolicitacaoOsList = itsolicitacaoOsList;
    }

    public ManuProd getManuProd() {
        return manuProd;
    }

    public void setManuProd(ManuProd manuProd) {
        this.manuProd = manuProd;
    }

    public List<ItsolicitacaoExt> getItsolicitacaoExtList() {
        return itsolicitacaoExtList;
    }

    public void setItsolicitacaoExtList(List<ItsolicitacaoExt> itsolicitacaoExtList) {
        this.itsolicitacaoExtList = itsolicitacaoExtList;
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

    public MotServ getMotServ() {
        return motServ;
    }

    public void setMotServ(MotServ motServ) {
        this.motServ = motServ;
    }

    public ProgramacaoPlano getProgramacaoPlano() {
        return programacaoPlano;
    }

    public void setProgramacaoPlano(ProgramacaoPlano programacaoPlano) {
        this.programacaoPlano = programacaoPlano;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public List<SolicitacaoOs> getSolicitacaoOsList() {
        return solicitacaoOsList;
    }

    public void setSolicitacaoOsList(List<SolicitacaoOs> solicitacaoOsList) {
        this.solicitacaoOsList = solicitacaoOsList;
    }

    public SolicitacaoOs getSolicitacaoOs() {
        return solicitacaoOs;
    }

    public void setSolicitacaoOs(SolicitacaoOs solicitacaoOs) {
        this.solicitacaoOs = solicitacaoOs;
    }

    public TipoOs getTipoOs() {
        return tipoOs;
    }

    public void setTipoOs(TipoOs tipoOs) {
        this.tipoOs = tipoOs;
    }

    public AvaliacaoServico getAvaliacaoServico() {
        return avaliacaoServico;
    }

    public void setAvaliacaoServico(AvaliacaoServico avaliacaoServico) {
        this.avaliacaoServico = avaliacaoServico;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cdOs != null ? cdOs.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SolicitacaoOs)) {
            return false;
        }
        SolicitacaoOs other = (SolicitacaoOs) object;
        if ((this.cdOs == null && other.cdOs != null) || (this.cdOs != null && !this.cdOs.equals(other.cdOs))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mapeamento.model.SolicitacaoOs[ cdOs=" + cdOs + " ]";
    }
    
}

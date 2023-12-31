package bean;
// Generated 22/09/2023 23:07:42 by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * JoaFuncionario generated by hbm2java
 */
@Entity
@Table(name = "joa_funcionario",
         catalog = "db_julia_almada"
)
public class JoaFuncionario implements java.io.Serializable {

    private int idjoaFuncionario;
    private String joaNome;
    private String joaEmail;
    private String joaTelefone;
    private String joaCpf;
    private String joaEmailReserva;
    private String joaEndereco;
    private String joaBairro;
    private String joaPais;
    private String joaCidade;
    private String joaCep;
    private String joaCarteiraTrabalho;
    private Date joaDataNascimento;
    private int joaSexo;
    private String joaCelular;
    private String joaAtivo;

    public JoaFuncionario() {
    }

    public JoaFuncionario(int idjoaFuncionario, String joaNome, String joaEmail, String joaTelefone, String joaCpf, String joaEmailReserva, String joaEndereco, String joaBairro, String joaPais, String joaCidade, String joaCep, String joaCarteiraTrabalho, Date joaDataNascimento, int joaSexo, String joaAtivo) {
        this.idjoaFuncionario = idjoaFuncionario;
        this.joaNome = joaNome;
        this.joaEmail = joaEmail;
        this.joaTelefone = joaTelefone;
        this.joaCpf = joaCpf;
        this.joaEmailReserva = joaEmailReserva;
        this.joaEndereco = joaEndereco;
        this.joaBairro = joaBairro;
        this.joaPais = joaPais;
        this.joaCidade = joaCidade;
        this.joaCep = joaCep;
        this.joaCarteiraTrabalho = joaCarteiraTrabalho;
        this.joaDataNascimento = joaDataNascimento;
        this.joaSexo = joaSexo;
        this.joaAtivo = joaAtivo;
    }

    public JoaFuncionario(int idjoaFuncionario, String joaNome, String joaEmail, String joaTelefone, String joaCpf, String joaEmailReserva, String joaEndereco, String joaBairro, String joaPais, String joaCidade, String joaCep, String joaCarteiraTrabalho, Date joaDataNascimento, int joaSexo, String joaCelular, Set joaVendas) {
        this.idjoaFuncionario = idjoaFuncionario;
        this.joaNome = joaNome;
        this.joaEmail = joaEmail;
        this.joaTelefone = joaTelefone;
        this.joaCpf = joaCpf;
        this.joaEmailReserva = joaEmailReserva;
        this.joaEndereco = joaEndereco;
        this.joaBairro = joaBairro;
        this.joaPais = joaPais;
        this.joaCidade = joaCidade;
        this.joaCep = joaCep;
        this.joaCarteiraTrabalho = joaCarteiraTrabalho;
        this.joaDataNascimento = joaDataNascimento;
        this.joaSexo = joaSexo;
        this.joaCelular = joaCelular;

    }

    @Id

    @Column(name = "idjoa_funcionario", unique = true, nullable = false)
    public int getIdjoaFuncionario() {
        return this.idjoaFuncionario;
    }

    public void setIdjoaFuncionario(int idjoaFuncionario) {
        this.idjoaFuncionario = idjoaFuncionario;
    }

    @Column(name = "joa_nome", nullable = false, length = 45)
    public String getJoaNome() {
        return this.joaNome;
    }

    public void setJoaNome(String joaNome) {
        this.joaNome = joaNome;
    }

    @Column(name = "joa_email", nullable = false, length = 45)
    public String getJoaEmail() {
        return this.joaEmail;
    }

    public void setJoaEmail(String joaEmail) {
        this.joaEmail = joaEmail;
    }

    @Column(name = "joa_telefone", nullable = false, length = 45)
    public String getJoaTelefone() {
        return this.joaTelefone;
    }

    public void setJoaTelefone(String joaTelefone) {
        this.joaTelefone = joaTelefone;
    }

    @Column(name = "joa_cpf", nullable = false, length = 45)
    public String getJoaCpf() {
        return this.joaCpf;
    }

    public void setJoaCpf(String joaCpf) {
        this.joaCpf = joaCpf;
    }

    @Column(name = "joa_emailReserva", nullable = false, length = 45)
    public String getJoaEmailReserva() {
        return this.joaEmailReserva;
    }

    public void setJoaEmailReserva(String joaEmailReserva) {
        this.joaEmailReserva = joaEmailReserva;
    }

    @Column(name = "joa_endereco", nullable = false, length = 45)
    public String getJoaEndereco() {
        return this.joaEndereco;
    }

    public void setJoaEndereco(String joaEndereco) {
        this.joaEndereco = joaEndereco;
    }

    @Column(name = "joa_bairro", nullable = false, length = 45)
    public String getJoaBairro() {
        return this.joaBairro;
    }

    public void setJoaBairro(String joaBairro) {
        this.joaBairro = joaBairro;
    }

    @Column(name = "joa_pais", nullable = false, length = 45)
    public String getJoaPais() {
        return this.joaPais;
    }

    public void setJoaPais(String joaPais) {
        this.joaPais = joaPais;
    }

    @Column(name = "joa_cidade", nullable = false, length = 45)
    public String getJoaCidade() {
        return this.joaCidade;
    }

    public void setJoaCidade(String joaCidade) {
        this.joaCidade = joaCidade;
    }

    @Column(name = "joa_cep", nullable = false, length = 15)
    public String getJoaCep() {
        return this.joaCep;
    }

    public void setJoaCep(String joaCep) {
        this.joaCep = joaCep;
    }

    @Column(name = "joa_carteiraTrabalho", nullable = false, length = 45)
    public String getJoaCarteiraTrabalho() {
        return this.joaCarteiraTrabalho;
    }

    public void setJoaCarteiraTrabalho(String joaCarteiraTrabalho) {
        this.joaCarteiraTrabalho = joaCarteiraTrabalho;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "joa_dataNascimento", nullable = false, length = 10)
    public Date getJoaDataNascimento() {
        return this.joaDataNascimento;
    }

    public void setJoaDataNascimento(Date joaDataNascimento) {
        this.joaDataNascimento = joaDataNascimento;
    }

    @Column(name = "joa_sexo", nullable = false)
    public int getJoaSexo() {
        return this.joaSexo;
    }

    public void setJoaSexo(int joaSexo) {
        this.joaSexo = joaSexo;
    }

    @Column(name = "joa_celular", nullable = false, length = 15)
    public String getJoaCelular() {
        return this.joaCelular;
    }

    public void setJoaCelular(String joaCelular) {
        this.joaCelular = joaCelular;
    }

    @Column(name = "joa_ativo", nullable = false, length = 1)
    public String getJoaAtivo() {
        return this.joaAtivo;
    }

    public void setJoaAtivo(String joaAtivo) {
        this.joaAtivo = joaAtivo;

    }
 @Override
    public String toString(){
    return this.getJoaNome();
    }
    @Override
    public boolean equals (Object object){
    if(object instanceof JoaFuncionario){
        JoaFuncionario joaFuncionario = (JoaFuncionario) object;
    if(this.getIdjoaFuncionario()==joaFuncionario.getIdjoaFuncionario()){
    return true;
    } }
    return false;
}
 
}

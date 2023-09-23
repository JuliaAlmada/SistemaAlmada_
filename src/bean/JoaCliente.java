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
 * JoaCliente generated by hbm2java
 */
@Entity
@Table(name="joa_cliente"
    ,catalog="db_juliaalmada"
)
public class JoaCliente  implements java.io.Serializable {


     private int idjoaCliente;
     private String joaNome;
     private String joaEmail;
     private String joaEmailReserva;
     private String joaCpf;
     private Date joaDataNascimento;
     private int joaSexo;
     private String joaCelular;
     private String joaTelefone;
     private String joaEndereco;
     private String joaBairro;
     private String joaCidade;
     private String joaPais;
     private String joaCep;
     private String joaCartaoFidelidade;

    public JoaCliente() {
    }

	
    public JoaCliente(int idjoaCliente, String joaNome, String joaEmail, String joaCpf, Date joaDataNascimento, String joaCelular, String joaEndereco, String joaBairro, String joaCidade, String joaPais, String joaCep) {
        this.idjoaCliente = idjoaCliente;
        this.joaNome = joaNome;
        this.joaEmail = joaEmail;
        this.joaCpf = joaCpf;
        this.joaDataNascimento = joaDataNascimento;
        this.joaCelular = joaCelular;
        this.joaEndereco = joaEndereco;
        this.joaBairro = joaBairro;
        this.joaCidade = joaCidade;
        this.joaPais = joaPais;
        this.joaCep = joaCep;
    }
    public JoaCliente(int idjoaCliente, String joaNome, String joaEmail, String joaEmailReserva, String joaCpf, Date joaDataNascimento, int joaSexo, String joaCelular, String joaTelefone, String joaEndereco, String joaBairro, String joaCidade, String joaPais, String joaCep, String joaCartaoFidelidade) {
       this.idjoaCliente = idjoaCliente;
       this.joaNome = joaNome;
       this.joaEmail = joaEmail;
       this.joaEmailReserva = joaEmailReserva;
       this.joaCpf = joaCpf;
       this.joaDataNascimento = joaDataNascimento;
       this.joaSexo = joaSexo;
       this.joaCelular = joaCelular;
       this.joaTelefone = joaTelefone;
       this.joaEndereco = joaEndereco;
       this.joaBairro = joaBairro;
       this.joaCidade = joaCidade;
       this.joaPais = joaPais;
       this.joaCep = joaCep;
       this.joaCartaoFidelidade = joaCartaoFidelidade;
    }
   
     @Id 

    
    @Column(name="idjoa_cliente", unique=true, nullable=false)
    public int getIdjoaCliente() {
        return this.idjoaCliente;
    }
    
    public void setIdjoaCliente(int idjoaCliente) {
        this.idjoaCliente = idjoaCliente;
    }

    
    @Column(name="joa_nome", nullable=false, length=45)
    public String getJoaNome() {
        return this.joaNome;
    }
    
    public void setJoaNome(String joaNome) {
        this.joaNome = joaNome;
    }

    
    @Column(name="joa_email", nullable=false, length=45)
    public String getJoaEmail() {
        return this.joaEmail;
    }
    
    public void setJoaEmail(String joaEmail) {
        this.joaEmail = joaEmail;
    }

    
    @Column(name="joa_emailReserva", length=45)
    public String getJoaEmailReserva() {
        return this.joaEmailReserva;
    }
    
    public void setJoaEmailReserva(String joaEmailReserva) {
        this.joaEmailReserva = joaEmailReserva;
    }

    
    @Column(name="joa_cpf", nullable=false, length=14)
    public String getJoaCpf() {
        return this.joaCpf;
    }
    
    public void setJoaCpf(String joaCpf) {
        this.joaCpf = joaCpf;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="joa_dataNascimento", nullable=false, length=10)
    public Date getJoaDataNascimento() {
        return this.joaDataNascimento;
    }
    
    public void setJoaDataNascimento(Date joaDataNascimento) {
        this.joaDataNascimento = joaDataNascimento;
    }

    
    @Column(name="joa_sexo")
    public int getJoaSexo() {
        return this.joaSexo;
    }
    
    public void setJoaSexo(int joaSexo) {
        this.joaSexo = joaSexo;
    }

    
    @Column(name="joa_celular", nullable=false, length=15)
    public String getJoaCelular() {
        return this.joaCelular;
    }
    
    public void setJoaCelular(String joaCelular) {
        this.joaCelular = joaCelular;
    }

    
    @Column(name="joa_telefone", length=15)
    public String getJoaTelefone() {
        return this.joaTelefone;
    }
    
    public void setJoaTelefone(String joaTelefone) {
        this.joaTelefone = joaTelefone;
    }

    
    @Column(name="joa_endereco", nullable=false, length=45)
    public String getJoaEndereco() {
        return this.joaEndereco;
    }
    
    public void setJoaEndereco(String joaEndereco) {
        this.joaEndereco = joaEndereco;
    }

    
    @Column(name="joa_bairro", nullable=false, length=45)
    public String getJoaBairro() {
        return this.joaBairro;
    }
    
    public void setJoaBairro(String joaBairro) {
        this.joaBairro = joaBairro;
    }

    
    @Column(name="joa_cidade", nullable=false, length=45)
    public String getJoaCidade() {
        return this.joaCidade;
    }
    
    public void setJoaCidade(String joaCidade) {
        this.joaCidade = joaCidade;
    }

    
    @Column(name="joa_pais", nullable=false, length=45)
    public String getJoaPais() {
        return this.joaPais;
    }
    
    public void setJoaPais(String joaPais) {
        this.joaPais = joaPais;
    }

    
    @Column(name="joa_cep", nullable=false, length=45)
    public String getJoaCep() {
        return this.joaCep;
    }
    
    public void setJoaCep(String joaCep) {
        this.joaCep = joaCep;
    }

    
    @Column(name="joa_cartaoFidelidade", length=13)
    public String getJoaCartaoFidelidade() {
        return this.joaCartaoFidelidade;
    }
    
    public void setJoaCartaoFidelidade(String joaCartaoFidelidade) {
        this.joaCartaoFidelidade = joaCartaoFidelidade;
    }



}



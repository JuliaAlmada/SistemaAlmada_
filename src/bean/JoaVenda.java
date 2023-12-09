package bean;
// Generated 22/09/2023 23:07:42 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * JoaVenda generated by hbm2java
 */
@Entity
@Table(name="joa_venda"
    ,catalog="db_julia_almada"
)
public class JoaVenda  implements java.io.Serializable {


     private int idjoaVenda;
     private JoaCliente joaCliente;
     private JoaFuncionario joaFuncionario;
     private Date joaData;
     private double joaTotal;
    

    public JoaVenda() {
    }

	
    public JoaVenda(int idjoaVenda, JoaCliente joaCliente, JoaFuncionario joaFuncionario, Date joaData, double joaTotal) {
        this.idjoaVenda = idjoaVenda;
        this.joaCliente = joaCliente;
        this.joaFuncionario = joaFuncionario;
        this.joaData = joaData;
        this.joaTotal = joaTotal;
    }
  
   
     @Id 

    
    @Column(name="idjoa_venda", unique=true, nullable=false)
    public int getIdjoaVenda() {
        return this.idjoaVenda;
    }
    
    public void setIdjoaVenda(int idjoaVenda) {
        this.idjoaVenda = idjoaVenda;
    }

@ManyToOne(fetch=FetchType.EAGER)   
    @JoinColumn(name="joa_cliente", nullable=false)
    public JoaCliente getJoaCliente() {
        return this.joaCliente;
    }
    
    public void setJoaCliente(JoaCliente joaCliente) {
        this.joaCliente = joaCliente;
    }

@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="joa_funcionario", nullable=false)
    public JoaFuncionario getJoaFuncionario() {
        return this.joaFuncionario;
    }
    
    public void setJoaFuncionario(JoaFuncionario joaFuncionario) {
        this.joaFuncionario = joaFuncionario;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="joa_data", nullable=false, length=10)
    public Date getJoaData() {
        return this.joaData;
    }
    
    public void setJoaData(Date joaData) {
        this.joaData = joaData;
    }

    
    @Column(name="joa_total", nullable=false, precision=10)
    public double getJoaTotal() {
        return this.joaTotal;
    }
    
    public void setJoaTotal(double joaTotal) {
        this.joaTotal = joaTotal;
    }

    public int toInt(){
    return this.getIdjoaVenda();
    }
    @Override
    public boolean equals (Object object){
    if(object instanceof JoaVenda){
        JoaVenda joaVenda = (JoaVenda) object;
    if(this.getIdjoaVenda()==joaVenda.getIdjoaVenda()){
    return true;
    } }
    return false;
}
  

}



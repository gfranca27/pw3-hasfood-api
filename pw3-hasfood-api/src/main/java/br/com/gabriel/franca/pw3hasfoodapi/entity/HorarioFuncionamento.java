package br.com.gabriel.franca.pw3hasfoodapi.entity;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "TBL_HORARIO_FUNCIONAMENTO")
public class HorarioFuncionamento {
	@Getter
	@Setter
	

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ID_HORARIO_FUNCIONAMENTO")
	private Long id;
	
	@Column(name = "TX_DIA_SEMANA")
	private String TX_DIASEMANA;
	
	@Column(name = "HR_ABERTURA")
	private Time HR_ABERTURA;
	
	@Column(name = "HR_FECHAMENTO")
	private Time HR_FECHAMENTO;
	
    @Column(name="ID_RESTAURANTE")
    public Long id_restaurante;
}

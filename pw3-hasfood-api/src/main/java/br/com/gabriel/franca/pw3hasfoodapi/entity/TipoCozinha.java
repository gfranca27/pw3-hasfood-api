package br.com.gabriel.franca.pw3hasfoodapi.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TBL_TIPO_COZINHA")
public class TipoCozinha {
	@Getter
	@Setter
	
	@Column(name = "ID_TIPO_COZINHA")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;
	
	@Column(name = "TX_NOME")
	private String TX_NOME;
	
	@Column(name = "DT_EXCLUSAO")
	private Date DT_EXCLUSAO;
}

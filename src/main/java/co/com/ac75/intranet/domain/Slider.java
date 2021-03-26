package co.com.ac75.intranet.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="slider")
public class Slider implements Serializable{

	/**
	 * Allows you to verify that a loaded class and the serialized object are compatible
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idslider")
	private Long idSlider;
	
	@Column(name = "status")
	private int status;
	
	@Column(name = "description", length = 100, nullable = false)
	private String description;
	
	@Column(name = "urlimagen", length = 100, nullable = false)
	private String urlImagen;
	
	@Column(name = "urlexterna", length = 100)
	private String urlExternal;

	public Long getIdSlider() {
		return idSlider;
	}

	public void setIdSlider(Long idSlider) {
		this.idSlider = idSlider;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrlImagen() {
		return urlImagen;
	}

	public void setUrlImagen(String urlImagen) {
		this.urlImagen = urlImagen;
	}

	public String getUrlExternal() {
		return urlExternal;
	}

	public void setUrlExternal(String urlExternal) {
		this.urlExternal = urlExternal;
	}

	public Slider() {
		super();
	}	
	
		
}

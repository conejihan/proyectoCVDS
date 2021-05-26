package edu.eci.cvds.beans;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.google.inject.Inject;
import edu.eci.cvds.servicios.serviciosSolidaridad;
import edu.eci.cvds.entities.Categoria;
@SuppressWarnings("deprecation")
@ManagedBean(name = "CategoryBean")
@ViewScoped

public class CategoryBean extends BasePageBean {




	public CategoryBean() {

	}

}
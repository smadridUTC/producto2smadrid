package models;

import java.util.*;
import javax.persistence.*;

import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

@Entity
public class menu extends Model {


	private static final long serialVersionUID = 1L;

	@Id
	public Long id;

	@Constraints.Required
	public String nombre;

	@Constraints.Required
	public String ingredientes;

	@Constraints.Required
	public String descripcion;
	
	@Constraints.Required
	public String precio;
	
	public static Find<Long, menu> find = new Find<Long, menu>() {
	};



}


package models;

import java.util.*;

import javax.persistence.*;

import play.db.ebean.*;
import play.data.validation.*;

@Entity
public class Entry {

	@Id
	public Long Id;
	
	@Constraints.Required
	public String name;
	
	public static Model.Finder<Long, Entry> find = new Model.Finder<Long,Entry>(Long.class, Entry.class);
	
}

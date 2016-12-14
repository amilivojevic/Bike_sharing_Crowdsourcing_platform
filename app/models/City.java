package models;

import com.avaje.ebean.Model;
import play.data.format.Formats;
import play.data.validation.Constraints;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Korisnik on 12/13/2016.
 *
 * CITY
 -city_id
 -name: string
 -zip_code: string
 -contry: COUNTRY
 */
@Entity
public class City  extends Model {
    @Id
    public Long id;

    @Constraints.Required
    @Formats.NonEmpty
    @Column(unique = true)
    public String name;

    @Constraints.Required
    @Formats.NonEmpty
    @Column(unique = true)
    public String zip_code;

    @Constraints.Required
    @Formats.NonEmpty
    @Column
    public Country country;


}

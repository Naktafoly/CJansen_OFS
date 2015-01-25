/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dal;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author School
 */
@Entity
@Table(name = "appointments")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Appointments.findAll", query = "SELECT a FROM Appointments a"),
    @NamedQuery(name = "Appointments.findByAfspraakId", query = "SELECT a FROM Appointments a WHERE a.afspraakId = :afspraakId"),
    @NamedQuery(name = "Appointments.findByDatum", query = "SELECT a FROM Appointments a WHERE a.datum = :datum")})
public class Appointments implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "AfspraakId")
    private Integer afspraakId;
    @Basic(optional = false)
    @Column(name = "Datum")
    @Temporal(TemporalType.DATE)
    private Date datum;
    @Basic(optional = false)
    @Lob
    @Column(name = "Note")
    private String note;
    @JoinColumn(name = "Naam", referencedColumnName = "NaamId")
    @ManyToOne(optional = false)
    private Addressbook naam;

    public Appointments() {
    }

    public Appointments(Integer afspraakId) {
        this.afspraakId = afspraakId;
    }

    public Appointments(Integer afspraakId, Date datum, String note) {
        this.afspraakId = afspraakId;
        this.datum = datum;
        this.note = note;
    }

    public Integer getAfspraakId() {
        return afspraakId;
    }

    public void setAfspraakId(Integer afspraakId) {
        this.afspraakId = afspraakId;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Addressbook getNaam() {
        return naam;
    }

    public void setNaam(Addressbook naam) {
        this.naam = naam;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (afspraakId != null ? afspraakId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Appointments)) {
            return false;
        }
        Appointments other = (Appointments) object;
        if ((this.afspraakId == null && other.afspraakId != null) || (this.afspraakId != null && !this.afspraakId.equals(other.afspraakId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Dal.Appointments[ afspraakId=" + afspraakId + " ]";
    }
    
}

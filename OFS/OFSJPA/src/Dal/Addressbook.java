/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dal;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author School
 */
@Entity
@Table(name = "addressbook")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Addressbook.findAll", query = "SELECT a FROM Addressbook a"),
    @NamedQuery(name = "Addressbook.findByNaamId", query = "SELECT a FROM Addressbook a WHERE a.naamId = :naamId"),
    @NamedQuery(name = "Addressbook.findByNaam", query = "SELECT a FROM Addressbook a WHERE a.naam = :naam"),
    @NamedQuery(name = "Addressbook.findByAdres", query = "SELECT a FROM Addressbook a WHERE a.adres = :adres"),
    @NamedQuery(name = "Addressbook.findByTelefoon", query = "SELECT a FROM Addressbook a WHERE a.telefoon = :telefoon"),
    @NamedQuery(name = "Addressbook.findByEmail", query = "SELECT a FROM Addressbook a WHERE a.email = :email")})
public class Addressbook implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "NaamId")
    private Integer naamId;
    @Basic(optional = false)
    @Column(name = "Naam")
    private String naam;
    @Basic(optional = false)
    @Column(name = "Adres")
    private String adres;
    @Basic(optional = false)
    @Column(name = "Telefoon")
    private int telefoon;
    @Basic(optional = false)
    @Column(name = "E-mail")
    private String email;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "naam")
    private Collection<Appointments> appointmentsCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "naam")
    private Collection<Invoices> invoicesCollection;

    public Addressbook() {
    }

    public Addressbook(Integer naamId) {
        this.naamId = naamId;
    }

    public Addressbook(Integer naamId, String naam, String adres, int telefoon, String email) {
        this.naamId = naamId;
        this.naam = naam;
        this.adres = adres;
        this.telefoon = telefoon;
        this.email = email;
    }

    public Integer getNaamId() {
        return naamId;
    }

    public void setNaamId(Integer naamId) {
        this.naamId = naamId;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public int getTelefoon() {
        return telefoon;
    }

    public void setTelefoon(int telefoon) {
        this.telefoon = telefoon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @XmlTransient
    public Collection<Appointments> getAppointmentsCollection() {
        return appointmentsCollection;
    }

    public void setAppointmentsCollection(Collection<Appointments> appointmentsCollection) {
        this.appointmentsCollection = appointmentsCollection;
    }

    @XmlTransient
    public Collection<Invoices> getInvoicesCollection() {
        return invoicesCollection;
    }

    public void setInvoicesCollection(Collection<Invoices> invoicesCollection) {
        this.invoicesCollection = invoicesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (naamId != null ? naamId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Addressbook)) {
            return false;
        }
        Addressbook other = (Addressbook) object;
        if ((this.naamId == null && other.naamId != null) || (this.naamId != null && !this.naamId.equals(other.naamId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Dal.Addressbook[ naamId=" + naamId + " ]";
    }
    
}

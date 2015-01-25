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
@Table(name = "invoices")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Invoices.findAll", query = "SELECT i FROM Invoices i"),
    @NamedQuery(name = "Invoices.findByFactuurId", query = "SELECT i FROM Invoices i WHERE i.factuurId = :factuurId"),
    @NamedQuery(name = "Invoices.findByOntvangen", query = "SELECT i FROM Invoices i WHERE i.ontvangen = :ontvangen"),
    @NamedQuery(name = "Invoices.findByVervaldatum", query = "SELECT i FROM Invoices i WHERE i.vervaldatum = :vervaldatum"),
    @NamedQuery(name = "Invoices.findByBetaald", query = "SELECT i FROM Invoices i WHERE i.betaald = :betaald"),
    @NamedQuery(name = "Invoices.findByPrijs", query = "SELECT i FROM Invoices i WHERE i.prijs = :prijs")})
public class Invoices implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "FactuurId")
    private Integer factuurId;
    @Basic(optional = false)
    @Column(name = "Ontvangen")
    @Temporal(TemporalType.DATE)
    private Date ontvangen;
    @Basic(optional = false)
    @Column(name = "Vervaldatum")
    @Temporal(TemporalType.DATE)
    private Date vervaldatum;
    @Basic(optional = false)
    @Column(name = "Betaald")
    private boolean betaald;
    @Basic(optional = false)
    @Column(name = "Prijs")
    private double prijs;
    @Basic(optional = false)
    @Lob
    @Column(name = "Formulier")
    private byte[] formulier;
    @JoinColumn(name = "Naam", referencedColumnName = "NaamId")
    @ManyToOne(optional = false)
    private Addressbook naam;

    public Invoices() {
    }

    public Invoices(Integer factuurId) {
        this.factuurId = factuurId;
    }

    public Invoices(Integer factuurId, Date ontvangen, Date vervaldatum, boolean betaald, double prijs, byte[] formulier) {
        this.factuurId = factuurId;
        this.ontvangen = ontvangen;
        this.vervaldatum = vervaldatum;
        this.betaald = betaald;
        this.prijs = prijs;
        this.formulier = formulier;
    }

    public Integer getFactuurId() {
        return factuurId;
    }

    public void setFactuurId(Integer factuurId) {
        this.factuurId = factuurId;
    }

    public Date getOntvangen() {
        return ontvangen;
    }

    public void setOntvangen(Date ontvangen) {
        this.ontvangen = ontvangen;
    }

    public Date getVervaldatum() {
        return vervaldatum;
    }

    public void setVervaldatum(Date vervaldatum) {
        this.vervaldatum = vervaldatum;
    }

    public boolean getBetaald() {
        return betaald;
    }

    public void setBetaald(boolean betaald) {
        this.betaald = betaald;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    public byte[] getFormulier() {
        return formulier;
    }

    public void setFormulier(byte[] formulier) {
        this.formulier = formulier;
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
        hash += (factuurId != null ? factuurId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Invoices)) {
            return false;
        }
        Invoices other = (Invoices) object;
        if ((this.factuurId == null && other.factuurId != null) || (this.factuurId != null && !this.factuurId.equals(other.factuurId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Dal.Invoices[ factuurId=" + factuurId + " ]";
    }
    
}

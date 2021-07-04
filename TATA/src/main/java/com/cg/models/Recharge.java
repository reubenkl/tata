package com.cg.models;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Recharge {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
	
	@ManyToOne
    private Account account;
    
    private Double amount;
    private Integer daysValidity;
    private String planDescription;
    private String planName;
    private LocalDate purchasedDate;
    
    @OneToMany(mappedBy = "recharge")
    private List<Channel> channels;
    
//    private Pack pack;
    

    private boolean active;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getDaysValidity() {
        return daysValidity;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public void setDaysValidity(Integer daysValidity) {
        this.daysValidity = daysValidity;
    }

    public String getPlanDescription() {
        return planDescription;
    }

    public void setPlanDescription(String planDescription) {
        this.planDescription = planDescription;
    }

    public LocalDate getPurchasedDate() {
        return purchasedDate;
    }

    public void setPurchasedDate(LocalDate purchasedDate) {
        this.purchasedDate = purchasedDate;
    }

    public List<Channel> getChannels() {
        return channels;
    }

    public void setChannels(List<Channel> channels) {
        this.channels = channels;
    }

//    public Pack getPack() {
//        return pack;
//    }
//
//    public void setPack(Pack pack) {
//        this.pack = pack;
//    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

	@Override
	public String toString() {
		return "Recharge [id=" + id + ", account=" + account + ", amount=" + amount + ", daysValidity=" + daysValidity
				+ ", planDescription=" + planDescription + ", planName=" + planName + ", purchasedDate=" + purchasedDate
				+ ", channels=" + channels + ", active=" + active + "]";
	}
    
    
    
}

package com.cg.models;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;




@Entity
public class Account {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long accountId;
	

	@OneToOne
	private User user;
	
	@OneToMany(mappedBy = "account", cascade = CascadeType.ALL)
    private List<Recharge>recharges;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate registeredDate;
    
    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL)
    private List<ServiceRequest>requests;
    
    @ManyToOne
    private Pack currentPack;

    //================================================//
  	//===============CONSTRUCTORS=====================//
  	//================================================//
    
    public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

    
	public Account(User user, LocalDate registeredDate, Pack currentPack) {
		super();
		this.user = user;
		this.registeredDate = registeredDate;
		this.currentPack = currentPack;
	}


	//===========================================================================//
	//==========================SETTERS AND GETTERS==============================//
	//===========================================================================//
	
	public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Recharge> getRecharges() {
        return recharges;
    }

    public void setRecharges(List<Recharge> recharges) {
        this.recharges = recharges;
    }
    public LocalDate getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(LocalDate registeredDate) {
        this.registeredDate = registeredDate;
    }

    public List<ServiceRequest> getRequests() {
        return requests;
    }

    public void setRequests(List<ServiceRequest> requests) {
        this.requests = requests;
    }

    public Pack getCurrentPack() {
        return currentPack;
    }

    public void setCurrentPack(Pack currentPack) {
        this.currentPack = currentPack;
    }
    
    
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", user=" + user + ", recharges=" + recharges + ", registeredDate="
				+ registeredDate + ", requests=" + requests + ", currentPack=" + currentPack + "]";
	}
    
    
}


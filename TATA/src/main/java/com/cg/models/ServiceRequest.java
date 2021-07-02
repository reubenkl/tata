package com.cg.models;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ServiceRequest {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long id;
	
    private LocalDate requestedDate;
    
    @ManyToOne
    @JoinColumn
    private Account account;
    
    private String message;

    // make it true when request is created, false when user has created a recharge
    private Boolean statusOpened;
    
    
    //================================================//	
  	//===============CONSTRUCTORS=====================//
  	//================================================//

    public ServiceRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
   
	public ServiceRequest(LocalDate requestedDate, Account account, String message) {
		super();
		this.requestedDate = requestedDate;
		this.account = account;
		this.message = message;
	}

	
	//===========================================================================//
	//==========================SETTERS AND GETTERS==============================//
	//===========================================================================//

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public LocalDate getRequestedDate() {
        return requestedDate;
    }

    public void setRequestedDate(LocalDate requestedDate) {
        this.requestedDate = requestedDate;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean isStatusOpened() {
        return statusOpened;
    }

    public void setStatusOpened(Boolean statusOpened) {
        this.statusOpened = statusOpened;
    }

	@Override
	public String toString() {
		return "ServiceRequest [id=" + id + ", requestedDate=" + requestedDate + ", account=" + account + ", message="
				+ message + ", statusOpened=" + statusOpened + "]";
	}
}

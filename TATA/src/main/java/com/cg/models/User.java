package com.cg.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class User {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long id;

    private String username;

    private String firstName;

    private String lastName;

    private String password;

    private String role;

    @OneToOne
    @JoinColumn
    private Account account;
    
    
    //================================================//	
  	//===============CONSTRUCTORS=====================//
	//================================================//
    
    public User() {
    	super();
    	// TODO Auto-generated constructor stub
    }
    
    public User(String username, String firstName, String lastName, String password, String role,
			Account account) {
		super();
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.role = role;
		this.account = account;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", password=" + password + ", role=" + role + ", account=" + account + "]";
	}
    
    

}

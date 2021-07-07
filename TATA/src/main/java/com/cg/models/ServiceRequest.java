package com.cg.models;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;


import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class ServiceRequest {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Long serviceRequestId;
		
//		@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME, pattern = "yyyy-MM-dd")
//	    private LocalDate requestedDate;
	    
	    @ManyToOne(cascade = CascadeType.ALL)
	    @JsonBackReference
	    @JoinColumn(name = "account_id")
	    private Account account;
	    
	    @NotNull
	    private String message;

		public Long getServiceRequestId() {
			return serviceRequestId;
		}

		public void setServiceRequestId(Long serviceRequestId) {
			this.serviceRequestId = serviceRequestId;
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

		@Override
		public String toString() {
			return "ServiceRequest [serviceRequestid=" + serviceRequestId + ", account=" + account + ", message="
					+ message + "]";
		}
	    
	    

}

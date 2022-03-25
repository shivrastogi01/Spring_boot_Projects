package in.ashokit.bindings;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

	@JsonProperty("cid")
	private Integer customerId;

	@JsonProperty("cname")
	private String customerName;

	@JsonProperty("cemail")
	private String customerEmail;

	@JsonProperty("cage")
	private Integer customerAge;

	private InsurancePolicy policy;

	private Address address;

}

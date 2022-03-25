package in.ashokit.bindings;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InsurancePolicy {

	private String policyName;
	private String startDate;
	private String endDate;
	private Double premiumAmt;

}

package in.ashokit.response;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Ticket {

	private String pnr;
	private String ticketStatus;
	private String ticketPrice;
}
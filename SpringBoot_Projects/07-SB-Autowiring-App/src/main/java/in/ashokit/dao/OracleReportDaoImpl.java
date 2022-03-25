package in.ashokit.dao;

import org.springframework.stereotype.Repository;

@Repository("oracle")
public class OracleReportDaoImpl implements ReportDao {

	@Override
	public String getReportData() {
		String msg = "getting report data from ORCL db....";
		return msg;
	}

}

package in.ashokit.dao;

import org.springframework.stereotype.Repository;

@Repository("mysql")
public class MysqlReportDaoImpl implements ReportDao {

	@Override
	public String getReportData() {
		String msg = "Getting data from MySql DB...";
		return msg;
	}
}

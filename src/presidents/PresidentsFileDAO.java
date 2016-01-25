package presidents;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;

public class PresidentsFileDAO implements PresidentsDAO
{
	private ServletContext servletContext;
	private static final String FILENAME = "WEB-INF/presidents.csv";
	private ArrayList<PresidentBean> presidents = new ArrayList<>();

	public PresidentsFileDAO(ServletContext context)
	{
		servletContext = context;
		loadPresidentsFromFile();

	}

	public PresidentsFileDAO()
	{
	}

	public void loadPresidentsFromFile()
	{
		InputStream is = servletContext.getResourceAsStream(FILENAME);	
		try (BufferedReader buf = new BufferedReader(new InputStreamReader(is)))
		{
			String line;
			while ((line = buf.readLine()) != null)
			{
		
				String[] names = line.split(",");
				String termNumber = (names[0].trim());

				PresidentBean president = new PresidentBean();
//				String a =names[0].trim();
//				String b = names[1].trim();
//				String c =names[3].trim();
				president.setTermNumber(termNumber);
				president.setFirstName(names[1].trim());
				president.setMiddleName(names[2].trim());
				president.setLastName(names[3].trim());
				president.setParty(names[5].trim());
				presidents.add(president);
				
			}

		} catch (Exception e)
		{
			System.out.println(e);
		}
	}

	@Override
	public PresidentBean getPresident(String termNumber)
	{
		for (PresidentBean presidentBean : presidents)
		{
			if (presidentBean.getTermNumber().equals(termNumber))
			{
				return presidentBean;
			}
		
		}
		return null;
	}

	public ArrayList<PresidentBean> getPresidents()
	{
		
		return presidents;
	}

	@Override
	public String getName(String termNumber)
	{
		// TODO Auto-generated method stub
		return null;
	}

}

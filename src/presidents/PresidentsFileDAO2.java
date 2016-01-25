package presidents;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;

public class PresidentsFileDAO2 
{
	private ServletContext servletContext;
	private static final String FILENAME = "WEB-INF/presidents3.csv";
	private ArrayList<PresidentBean2> presidents2 = new ArrayList<>();

	public PresidentsFileDAO2(ServletContext context)
	{
		servletContext = context;
		loadPresidentsFromFile();

	}

	public PresidentsFileDAO2()
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

				PresidentBean2 president = new PresidentBean2(names[0].trim(), names[1].trim(), names[2].trim(), names[3].trim(), names[4].trim(), names[5].trim(), names[6].trim(), names[7].trim());

				presidents2.add(president);
				
			}

		} catch (Exception e)
		{
			System.out.println(e);
		}
	}


	public PresidentBean2 getPresident(String termNumber)
	{
		for (PresidentBean2 presidentBean2 : presidents2)
		{
			if (presidentBean2.getTermNumber().equals(termNumber))
			{
				return presidentBean2;
			}
		
		}
		return null;
	}

	public ArrayList<PresidentBean2> getPresidents()
	{
		
		return presidents2;
	}

	
	public String getName(String termNumber)
	{
		// TODO Auto-generated method stub
		return null;
	}

}

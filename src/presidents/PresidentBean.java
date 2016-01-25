package presidents;

public class PresidentBean
{
	
		private String termNumber;
		private String firstName;
		private String middleName;
		private String lastName;
		private int startYear;
		private int endYear;
		private String party;
		
		public PresidentBean() {
		}
		
		public PresidentBean(String firstName, String lastName)
		{
			super();
			this.firstName = firstName;
			this.lastName = lastName;
		}
		
		public PresidentBean(String firstName, String lastName, String termNumber)
		{
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.termNumber =termNumber;
		}

		public String getTermNumber()
		{
			return termNumber;
		}

		public void setTermNumber(String termNumber)
		{
			this.termNumber = termNumber;
		}

		public String getFirstName()
		{
			return firstName;
		}

		public void setFirstName(String firstName)
		{
			this.firstName = firstName;
		}

		public String getMiddleName()
		{
			return middleName;
		}

		public void setMiddleName(String middleName)
		{
			this.middleName = middleName;
		}

		public String getLastName()
		{
			return lastName;
		}

		public void setLastName(String lastName)
		{
			this.lastName = lastName;
		}

		public int getStartYear()
		{
			return startYear;
		}

		public void setStartYear(int startYear)
		{
			this.startYear = startYear;
		}

		public int getEndYear()
		{
			return endYear;
		}

		public void setEndYear(int endYear)
		{
			this.endYear = endYear;
		}

		public String getParty()
		{
			return party;
		}

		public void setParty(String party)
		{
			this.party = party;
		}

		@Override
		public String toString()
		{
			return "President [termNumber=" + termNumber + ", firstName=" + firstName + ", middleName=" + middleName
					+ ", lastName=" + lastName + ", startYear=" + startYear + ", endYear=" + endYear + ", party=" + party
					+ "]";
		}


		@Override
		public boolean equals(Object obj)
		{
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			PresidentBean other = (PresidentBean) obj;
			if (endYear != other.endYear)
				return false;
			if (firstName == null)
			{
				if (other.firstName != null)
					return false;
			} else if (!firstName.equals(other.firstName))
				return false;
			if (lastName == null)
			{
				if (other.lastName != null)
					return false;
			} else if (!lastName.equals(other.lastName))
				return false;
			if (middleName == null)
			{
				if (other.middleName != null)
					return false;
			} else if (!middleName.equals(other.middleName))
				return false;
			if (party == null)
			{
				if (other.party != null)
					return false;
			} else if (!party.equals(other.party))
				return false;
			if (startYear != other.startYear)
				return false;
			if (termNumber != other.termNumber)
				return false;
			return true;
		}
		
	}
	

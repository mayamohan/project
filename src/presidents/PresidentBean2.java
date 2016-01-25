package presidents;

public class PresidentBean2
{
	
		private String termNumber;
		private String link;
		private String portrait;
		private String Name;
		private String State;
	private String termYears;
		private String vicePresidents;
		private String trivia;
		
		public PresidentBean2() {
		}

		
		public PresidentBean2(String termNumber, String link, String portrait, String name, String state,
				String termYears, String vicePresidents, String trivia)
		{
			super();
			this.termNumber = termNumber;
			this.link = link;
			this.portrait = portrait;
			Name = name;
			State = state;
			this.termYears = termYears;
			this.vicePresidents = vicePresidents;
			this.trivia = trivia;
		}
		
		
		
		/**
		 * @return the termNumber
		 */
		public String getTermNumber()
		{
			return termNumber;
		}

		/**
		 * @return the link
		 */
		public String getLink()
		{
			return link;
		}

		/**
		 * @return the portrait
		 */
		public String getPortrait()
		{
			return portrait;
		}

		/**
		 * @return the name
		 */
		public String getName()
		{
			return Name;
		}

		/**
		 * @return the state
		 */
		public String getState()
		{
			return State;
		}

		/**
		 * @return the termYears
		 */
		public String getTermYears()
		{
			return termYears;
		}

		/**
		 * @return the vicePresidents
		 */
		public String getVicePresidents()
		{
			return vicePresidents;
		}

		/**
		 * @return the trivia
		 */
		public String getTrivia()
		{
			return trivia;
		}

		/**
		 * @param termNumber the termNumber to set
		 */
		public void setTermNumber(String termNumber)
		{
			this.termNumber = termNumber;
		}

		/**
		 * @param link the link to set
		 */
		public void setLink(String link)
		{
			this.link = link;
		}

		/**
		 * @param portrait the portrait to set
		 */
		public void setPortrait(String portrait)
		{
			this.portrait = portrait;
		}

		/**
		 * @param name the name to set
		 */
		public void setName(String name)
		{
			Name = name;
		}

		/**
		 * @param state the state to set
		 */
		public void setState(String state)
		{
			State = state;
		}

		/**
		 * @param termYears the termYears to set
		 */
		public void setTermYears(String termYears)
		{
			this.termYears = termYears;
		}

		/**
		 * @param vicePresidents the vicePresidents to set
		 */
		public void setVicePresidents(String vicePresidents)
		{
			this.vicePresidents = vicePresidents;
		}

		/**
		 * @param trivia the trivia to set
		 */
		public void setTrivia(String trivia)
		{
			this.trivia = trivia;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#hashCode()
		 */
		@Override
		public int hashCode()
		{
			final int prime = 31;
			int result = 1;
			result = prime * result + ((Name == null) ? 0 : Name.hashCode());
			result = prime * result + ((State == null) ? 0 : State.hashCode());
			result = prime * result + ((link == null) ? 0 : link.hashCode());
			result = prime * result + ((portrait == null) ? 0 : portrait.hashCode());
			result = prime * result + ((termNumber == null) ? 0 : termNumber.hashCode());
			result = prime * result + ((termYears == null) ? 0 : termYears.hashCode());
			result = prime * result + ((trivia == null) ? 0 : trivia.hashCode());
			result = prime * result + ((vicePresidents == null) ? 0 : vicePresidents.hashCode());
			return result;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#equals(java.lang.Object)
		 */
		
		
		@Override
		public boolean equals(Object obj)
		{
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			PresidentBean2 other = (PresidentBean2) obj;
			if (Name == null)
			{
				if (other.Name != null)
					return false;
			} else if (!Name.equals(other.Name))
				return false;
			if (State == null)
			{
				if (other.State != null)
					return false;
			} else if (!State.equals(other.State))
				return false;
			if (link == null)
			{
				if (other.link != null)
					return false;
			} else if (!link.equals(other.link))
				return false;
			if (portrait == null)
			{
				if (other.portrait != null)
					return false;
			} else if (!portrait.equals(other.portrait))
				return false;
			if (termNumber == null)
			{
				if (other.termNumber != null)
					return false;
			} else if (!termNumber.equals(other.termNumber))
				return false;
			if (termYears == null)
			{
				if (other.termYears != null)
					return false;
			} else if (!termYears.equals(other.termYears))
				return false;
			if (trivia == null)
			{
				if (other.trivia != null)
					return false;
			} else if (!trivia.equals(other.trivia))
				return false;
			if (vicePresidents == null)
			{
				if (other.vicePresidents != null)
					return false;
			} else if (!vicePresidents.equals(other.vicePresidents))
				return false;
			return true;
		}


		

		
		
	}
	

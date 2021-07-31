package org.metuchenmomentum.attendance.values;

import com.google.common.base.MoreObjects;

/**
 * Contains complete information about a person -- a team member or a
 * mentor -- contained in its members. Please see the members.
 * 
 * <p>Note that:
 * <ol>
 *   <li>{@code PersonInfo} instances are immutable, i.e. their values cannot be
 *       changed.
 *   <li>Invoke getter methods (e.g. {@link #getId() getId()} to retrieve values.
 *   <li>Use the {@link Builder} class defined below to create {@code PersonInfo}
 *       instances. See {@link PersonInfoTest}, the unit test for this class, for
 *       examples of use.
 * </ol>
 * 
 * @author Metuchen Momentum Attendance Task Force
 * @see PersonInfoTest
 */
public class PersonInfo {
	
	private final String id;
	private final String firstName;
	private final String middleName;
	private final String lastName;
	private final String email;
	private final int graduationYear;

	private PersonInfo(
			String id,
			String firstName,
			String middleName,
			String lastName,
			String email,
			int graduationYear) {
		this.id = id;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.email = email;
		this.graduationYear = graduationYear;
	}
	
	public String getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public int getGraduationYear() {
		return graduationYear;
	}
	
	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this)
				.add("id", id)
				.add("firstName", firstName)
				.add("middleName", middleName)
				.add("lastName", lastName)
				.add("email", email)
				.add("graduationYear", graduationYear)
				.toString();
	}

	public Builder toBuilder() {
		return builder()
				.setId(id)
				.setFirstName(firstName)
				.setMiddleName(middleName)
				.setLastName(lastName)
				.setEmail(email)
				.setGraduationYear(graduationYear);
	}
	
	public static Builder builder() {
		return new Builder();
	}
	
	/**
	 * Builds {@link PersonInfo} instances. To do so:
	 * 
	 * <ol>
	 * 	<li>Invoke {@link PersonInfo#builder() PersonInfo.builder()} to create a {@link Builder}.
	 *  <li>Invoke the setters (e.g., {@link Builder#setId(String) setId()} to set values.
	 * </ol>
	 * 
	 * Note that builder member invocations can be chained. See {@link PersonInfoTest} for
	 * examples of use.
	 * 
	 * @author Metuchen Momentum Attendance Task Force
	 * @see PersonInfoTest
	 *
	 */
	public static class Builder {
		
		private String id;
		private String firstName;
		private String middleName;
		private String lastName;
		private String email;
		private int graduationYear;		
		
		private Builder() {
			id = null;
			firstName = null;
			middleName = null;
			lastName = null;
			email = null;
			graduationYear = 0;
		}
		
		public Builder setId(String id) {
			this.id = id;
			return this;
		}
		
		public Builder setFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}
		
		public Builder setMiddleName(String middleName) {
			this.middleName = middleName;
			return this;
		}
		
		public Builder setLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}
		
		public Builder setEmail(String email) {
			this.email = email;
			return this;
		}
		
		public Builder setGraduationYear(int graduationYear) {
			this.graduationYear = graduationYear;
			return this;
		}
		
		@Override
		public String toString() {
			return MoreObjects.toStringHelper(this)
					.add("id", id)
					.add("firstName", firstName)
					.add("middleName", middleName)
					.add("lastName", lastName)
					.add("email", email)
					.add("graduationYear", graduationYear)
					.toString();
		}
		
		public PersonInfo build() {
			return new PersonInfo(
					id,
					firstName,
					middleName,
					lastName,
					email,
					graduationYear);
		}
	}
}
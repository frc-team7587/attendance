package org.metuchenmomentum.attendance.values;

import static com.google.common.truth.Truth.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Validates the {@link PersonInfo} value class and provides an example 
 * JUnit test. Since the test, in addition to validating the {@link PersonInfo}
 * class, serves as a study piece, it is extensively documented. Most tests will
 * have far fewer comments.
 * 
 * <p>Note that the Task Force has elected to test exclusively with
 * <a href="https://junit.org/junit4/">JUnit4</a>. Please test with
 * it throughout the project
 * 
 * @author Metuchen Momentum Attendance Task Force
 */
@RunWith(JUnit4.class)  // Use the standard JUnit 4 test runner.
public class PersonInfoTest {
	
	private PersonInfo.Builder builder;

	/**
	 * The {@code @Before} annotation causes {@code setUp()} to run before 
	 * each test, which ensures that each test receives a newly constructed
	 * {@link PersonInfo.Builder Builder}.
	 */
	@Before
	public void setUp() {
		builder = PersonInfo.builder();
	}

	/**
	 * The most basic possible test that creates and populates a 
	 * {@link PersonInfo.Builder Builder}, populates it, instantiates
	 * a {@link PersonInfo}, and verifies that its fields contain their
	 * expected values.
	 */
	@Test
	public void testBasicBuild() {
		PersonInfo info = builder
				.setId("12345")
				.setFirstName("Rocket")
				.setMiddleName("J")
				.setLastName("Squirrel")
				.setEmail("RocketJSquirrel@frostbitefalls.com")
				.setGraduationYear(2022)
				.build();
		assertThat(info.getId()).isEqualTo("12345");
		assertThat(info.getFirstName()).isEqualTo("Rocket");
		assertThat(info.getMiddleName()).isEqualTo("J");
		assertThat(info.getLastName()).isEqualTo("Squirrel");
		assertThat(info.getEmail()).isEqualTo("RocketJSquirrel@frostbitefalls.com");
		assertThat(info.getGraduationYear()).isEqualTo(2022);
		
		String expectedBuilderString = 
				"Builder{id=12345, firstName=Rocket, "
				+ "middleName=J, "
				+ "lastName=Squirrel, "
				+ "email=RocketJSquirrel@frostbitefalls.com, "
				+ "graduationYear=2022}";
		String expectedInfoString =
				"PersonInfo{id=12345, firstName=Rocket, "
				+ "middleName=J, "
				+ "lastName=Squirrel, "
				+ "email=RocketJSquirrel@frostbitefalls.com, "
				+ "graduationYear=2022}";
		
		assertThat(builder.toString()).isEqualTo(expectedBuilderString);
		assertThat(info.toString()).isEqualTo(expectedInfoString);
	}
	
	/**
	 * Validates {@link PersonInfo#toBuilder() toBuilder} by, in effect, copying
	 * a {@link PersonInfo} and checking the new instance's contents.
	 */
	@Test
	public void testToBuilder() {
		PersonInfo originalInfo = builder
				.setId("12345")
				.setFirstName("Rocket")
				.setMiddleName("J")
				.setLastName("Squirrel")
				.setEmail("RocketJSquirrel@frostbitefalls.com")
				.setGraduationYear(2022)
				.build();
		PersonInfo info = originalInfo.toBuilder().build();
		assertThat(info.getId()).isEqualTo("12345");
		assertThat(info.getFirstName()).isEqualTo("Rocket");
		assertThat(info.getMiddleName()).isEqualTo("J");
		assertThat(info.getLastName()).isEqualTo("Squirrel");
		assertThat(info.getEmail()).isEqualTo("RocketJSquirrel@frostbitefalls.com");
		assertThat(info.getGraduationYear()).isEqualTo(2022);
	}
	
	/**
	 * Further validates {@link PersonInfo#toBuilder() toBuilder} by changing
	 * values in the new copy and checking that the changes took effect.
	 */
	@Test
	public void testToBuilderWithChanges() {
		PersonInfo originalInfo = builder
				.setId("12345")
				.setFirstName("Rocket")
				.setMiddleName("J")
				.setLastName("Squirrel")
				.setEmail("RocketJSquirrel@frostbitefalls.com")
				.setGraduationYear(2022)
				.build();
		PersonInfo info = originalInfo.toBuilder()
				.setFirstName("Bullwinkle")
				.setLastName("Moose")
				.setEmail("BullwinkleJMoose@frostbitefalls.com")
				.build();
		assertThat(info.getId()).isEqualTo("12345");
		assertThat(info.getFirstName()).isEqualTo("Bullwinkle");
		assertThat(info.getMiddleName()).isEqualTo("J");
		assertThat(info.getLastName()).isEqualTo("Moose");
		assertThat(info.getEmail()).isEqualTo("BullwinkleJMoose@frostbitefalls.com");
		assertThat(info.getGraduationYear()).isEqualTo(2022);
	}
}
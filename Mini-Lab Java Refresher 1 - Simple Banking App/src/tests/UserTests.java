package tests;

import model.User;

public class UserTests {

	public static void main(String[] args) {
		
		//OLD manual testing
		//User testUser = new User("mike", "myPasswd", "Mike", "Smith", "07771234567");
		//System.out.println(testUser);
		
		//automated testing
		
		//1-Setup the object and test data, initialise
		//See the four steps in:
		String testUsername = "mike";
		String testPassword = "myPasswd";
		String testFirstName = "Mike";
		String testLastName = "Smith";
		String testMobileNumber = "07771234567";
		
		//2-Exercise, run the object under test
		User testUser = new User(testUsername, testPassword, testFirstName, testLastName, testMobileNumber);
		
		//3-Verify (Assert)
		Boolean passed = true;
		
		if(testUser.getUsername() != testUsername) {
			System.out.println("TC1 failed: username did not match");
			passed = false;
		}
		
		if(testUser.getPassword() != testPassword) {
			System.out.println("TC2 failed: password did not match");
			passed = false;
		}
		
		//TODO: add three other if-code blocks just like the above two,
		//to verify the other three fields of the class
		
		if(passed)
			System.out.println("All TC's passed.");
		
		if(testUser.getFirstName() != testFirstName) {
			System.out.println("TC3 failed: firstName did not match");
			passed = false;
		}
		
		if(testUser.getLastName() != testLastName) {
			System.out.println("TC4 failed: lastName did not match");
			passed = false;
		}
		
		if(testUser.getMobileNumber() != testMobileNumber) {
			System.out.println("TC5 failed: mobileNumber did not match");
			passed = false;
		}
		
		//using assert's
		
		assert testUser.getUsername() == testUsername;
		//assert 1==2
		//TODO: add the other assertions like the above one,
		//to verify the other four fields of the class
		
		assert testUser.getPassword() == testPassword;
		assert testUser.getFirstName() == testFirstName;
		assert testUser.getLastName()== testLastName;
		assert testUser.getMobileNumber() == testMobileNumber;
		
		System.out.println("All Java assertions in the test suite passed (none failed).");

	}

}

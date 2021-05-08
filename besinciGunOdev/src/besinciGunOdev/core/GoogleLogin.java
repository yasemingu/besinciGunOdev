package besinciGunOdev.core;

import besinciGunOdev.loginWithGoogle.withGoogle;

public class GoogleLogin implements loginWithDifferentServices{

	@Override
	public void loginWith(String message) {
		withGoogle google = new withGoogle();
		google.googleLogin(message);
	}

}

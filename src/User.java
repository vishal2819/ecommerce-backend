
public abstract class User {
  String UserId ="";
  String password ="";
  String loginStatus ="";
  
abstract Boolean verifyUser();

public String getUserId() {
	return UserId;
}

public void setUserId(String userId) {
	this.UserId = userId;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getLoginStatus() {
	return loginStatus;
}

public void setLoginStatus(String loginStatus) {
	this.loginStatus = loginStatus;
}
  
}

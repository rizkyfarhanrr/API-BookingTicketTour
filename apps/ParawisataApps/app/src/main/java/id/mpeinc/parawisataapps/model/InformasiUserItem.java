package id.mpeinc.parawisataapps.model;

import com.google.gson.annotations.SerializedName;

public class InformasiUserItem{

	@SerializedName("kode_user")
	private String kodeUser;

	@SerializedName("jeniskelamin_user")
	private String jeniskelaminUser;

	@SerializedName("password_user")
	private String passwordUser;

	@SerializedName("email_user")
	private String emailUser;

	@SerializedName("namalengkap_user")
	private String namalengkapUser;

	@SerializedName("user_craeted")
	private String userCraeted;

	@SerializedName("username_user")
	private String usernameUser;

	@SerializedName("picture")
	private Object picture;

	public void setKodeUser(String kodeUser){
		this.kodeUser = kodeUser;
	}

	public String getKodeUser(){
		return kodeUser;
	}

	public void setJeniskelaminUser(String jeniskelaminUser){
		this.jeniskelaminUser = jeniskelaminUser;
	}

	public String getJeniskelaminUser(){
		return jeniskelaminUser;
	}

	public void setPasswordUser(String passwordUser){
		this.passwordUser = passwordUser;
	}

	public String getPasswordUser(){
		return passwordUser;
	}

	public void setEmailUser(String emailUser){
		this.emailUser = emailUser;
	}

	public String getEmailUser(){
		return emailUser;
	}

	public void setNamalengkapUser(String namalengkapUser){
		this.namalengkapUser = namalengkapUser;
	}

	public String getNamalengkapUser(){
		return namalengkapUser;
	}

	public void setUserCraeted(String userCraeted){
		this.userCraeted = userCraeted;
	}

	public String getUserCraeted(){
		return userCraeted;
	}

	public void setUsernameUser(String usernameUser){
		this.usernameUser = usernameUser;
	}

	public String getUsernameUser(){
		return usernameUser;
	}

	public void setPicture(Object picture){
		this.picture = picture;
	}

	public Object getPicture(){
		return picture;
	}

	@Override
 	public String toString(){
		return 
			"InformasiUserItem{" + 
			"kode_user = '" + kodeUser + '\'' + 
			",jeniskelamin_user = '" + jeniskelaminUser + '\'' + 
			",password_user = '" + passwordUser + '\'' + 
			",email_user = '" + emailUser + '\'' + 
			",namalengkap_user = '" + namalengkapUser + '\'' + 
			",user_craeted = '" + userCraeted + '\'' + 
			",username_user = '" + usernameUser + '\'' + 
			",picture = '" + picture + '\'' + 
			"}";
		}
}
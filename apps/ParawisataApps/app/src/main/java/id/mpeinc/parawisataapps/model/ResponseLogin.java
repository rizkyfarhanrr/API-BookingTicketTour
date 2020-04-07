package id.mpeinc.parawisataapps.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResponseLogin{

	@SerializedName("code")
	private int code;

	@SerializedName("informasi_user")
	private List<InformasiUserItem> informasiUser;

	@SerializedName("message")
	private String message;

	@SerializedName("status")
	private boolean status;

	public void setCode(int code){
		this.code = code;
	}

	public int getCode(){
		return code;
	}

	public void setInformasiUser(List<InformasiUserItem> informasiUser){
		this.informasiUser = informasiUser;
	}

	public List<InformasiUserItem> getInformasiUser(){
		return informasiUser;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public void setStatus(boolean status){
		this.status = status;
	}

	public boolean isStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"ResponseLogin{" + 
			"code = '" + code + '\'' + 
			",informasi_user = '" + informasiUser + '\'' + 
			",message = '" + message + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}
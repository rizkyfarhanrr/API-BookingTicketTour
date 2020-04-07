package id.mpeinc.parawisataapps.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResponseRegister{

	@SerializedName("code")
	private int code;

	@SerializedName("data_user")
	private List<DataUserItem> dataUser;

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

	public void setDataUser(List<DataUserItem> dataUser){
		this.dataUser = dataUser;
	}

	public List<DataUserItem> getDataUser(){
		return dataUser;
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
			"ResponseRegister{" + 
			"code = '" + code + '\'' + 
			",data_user = '" + dataUser + '\'' + 
			",message = '" + message + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}
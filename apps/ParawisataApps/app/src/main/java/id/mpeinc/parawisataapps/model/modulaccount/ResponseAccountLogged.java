package id.mpeinc.parawisataapps.model.modulaccount;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResponseAccountLogged{

	@SerializedName("result")
	private List<ResultItem> result;

	@SerializedName("code")
	private int code;

	@SerializedName("message")
	private String message;

	@SerializedName("status")
	private boolean status;

	public void setResult(List<ResultItem> result){
		this.result = result;
	}

	public List<ResultItem> getResult(){
		return result;
	}

	public void setCode(int code){
		this.code = code;
	}

	public int getCode(){
		return code;
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
			"ResponseAccountLogged{" + 
			"result = '" + result + '\'' + 
			",code = '" + code + '\'' + 
			",message = '" + message + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}
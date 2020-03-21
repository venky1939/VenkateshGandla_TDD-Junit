package app.epam.TDD;

public class RemoveACharacters {

	public String remove(String string) {
		String result = string;
		int stringLength = string.length();
		
		if(string.charAt(0)!= 'A'  && string.charAt(1)!= 'A') {
			result=string;
		}
		else if(string.charAt(0) == 'A' && string.charAt(1)!= 'A') {
			result = string.substring(1,stringLength);
		}
		else if(string.charAt(1)== 'A' && string.charAt(0)!= 'A') {
			result = string.charAt(0) + string.substring(2,stringLength);
		}
		else if(string.charAt(0)== 'A'  && string.charAt(1)== 'A') {
			result=string.substring(2,stringLength);
		}
	
		return result;
	}

}

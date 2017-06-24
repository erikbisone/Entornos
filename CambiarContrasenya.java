
public class CambiarContrasenya {
	private String pass1;
	private String pass2;
	private String nueva;
	private String confirma;
public CambiarContrasenya(String nueva, String confirma){
	this.nueva=nueva;
	this.confirma=confirma;
}
	public boolean validarNuevoPassword(){

        if(pass1.length() < 1 || pass2.length() < 1 )
        	{
        		// Empty fields
        		return false;
        	}
        	

        if (pass1 != null && pass2 != null) {

            if (pass1.equals(pass2)) {

                pass1 = pass2;
                boolean hasUppercase = !pass1.equals(pass1.toLowerCase());
                boolean hasLowercase = !pass1.equals(pass1.toUpperCase());
                boolean hasNumber = pass1.matches(".*\\d.*");
                boolean noSpecialChar = pass1.matches("[a-zA-Z0-9 ]*");

                if (pass1.length() < 11) {
                	//
                	return false;
                	
                }

                if (!hasUppercase) {
                    //
                	return false;
                }

                if (!hasLowercase) {
                	//
                	return false;
                }

                if (!hasNumber) {
                    //
                	return false;                	
                }

                if(noSpecialChar){
                    // Password needs a special character i.e. !,@,#, etc.
                	return false;
                }
            } else {
                //
            	return false;
            }
        } else {
            //
        	return false;
        }
        
        return true;

    }

	public static void main(String[] args) {
		CambiarContrasenya cc  = new CambiarContrasenya("entornos","entornos");

	}

}

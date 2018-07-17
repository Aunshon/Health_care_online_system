
package health_care;


public class dataClass {
    
    private String username;
    private String password;

    public dataClass(String username, String password) {
        this.username = username;
        this.password = password;
    }

    dataClass() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
    
    
}

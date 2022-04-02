 
package za.ac.tut.admin;

 
public class Admin {
    private int password;
    private int userId;
    
    public Admin(){}

    public Admin(int userId,int password ) {
        this.password = password;
        this.userId = userId;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getUseId() {
        return userId;
    }

    public void setUsernmae(int userId) {
        this.userId = userId;
    }
    
    
}

public class User implements Serializable{ //calvin's
    private static final long serialVersionUID = 12351313554L; ///???
    private String firstName;
    private String lastName;
    private String userName;
    private String id; //user id
    private String passNum;
    private Role role;
    ///need role class

    
    public User(String id){
        this.id = id;
    }
    public User(String firstName, String lastName, String userName, String passNum) { //need role and or id
        this.firstName = firstName;
        this.lastName = lastName; 
        this.userName = userName;
        this.passNum = passNum;
        //this.role = role;
    }

    public User() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    public double getUserName() {
        return userName;
    }

    public void setUserName(double userName) {
        this.userName = userName;
    }

    public double getPassNum() {
        return passNum;
    }

    public void setPassNum(double passNum) {
        this.passNum = passNum;
    }
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
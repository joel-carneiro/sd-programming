package Account;

public class Client {
    private String name;
    private String cpf;

    // Constructor 

    public Client(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }

    // Methods 

    @Override
    public String toString() {
        return this.name + " : " + this.cpf;
    }

    // Getters and Setters
    
    public String getCpf() {
        return cpf;
    }
    
    public String getName() {
        return name;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setName(String name) {
        this.name = name;
    }

}

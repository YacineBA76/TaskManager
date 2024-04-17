package models.client;

public class Client {

    private String nameClient;
    private Client instance;

    private Client(String name){
        this.nameClient = name;
    }

    public Object getInstance(){
        if(instance == null){

            instance = new Client("Mr Client");
            return instance;
        }
        return instance;
    }
}

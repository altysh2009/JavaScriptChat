/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Altysh
 */
class Message {
    private String massge;
    private String user;
    private  int id;

    public Message(String massge, String user, int id) {
        this.massge = massge;
        this.user = user;
        this.id = id;
    }

   
    

    public String getMassge() {
        return massge;
    }

    public void setMassge(String massge) {
        this.massge = massge;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

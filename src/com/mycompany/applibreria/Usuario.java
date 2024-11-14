package com.mycompany.applibreria;

public abstract class Usuario {
    private String RUN;

    public Usuario(String RUN) {
        this.RUN = RUN;
    }

    /**
     * @return the RUN
     */
    public String getRUN() {
        return RUN;
    }

    /**
     * @param RUN the RUN to set
     */
    public void setRUN(String RUN) {
        this.RUN = RUN;
    }

}
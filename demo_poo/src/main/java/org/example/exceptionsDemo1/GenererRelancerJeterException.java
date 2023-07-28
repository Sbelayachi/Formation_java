package org.example.exceptionsDemo1;

public class GenererRelancerJeterException {
    public static void main(String[] args) {

    }
    private int code;
    private float solde;
    public void verser(float mt){
        solde=solde+mt;
    }
    public void retirer(float mt)throws Exception{
        if(mt>solde) throw new Exception("Solde Insuffisant");
        solde=solde-mt;
    }
    public float getSolde(){
        return solde;
    }
}
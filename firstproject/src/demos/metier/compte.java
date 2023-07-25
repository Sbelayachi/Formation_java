package demos.metier;

public class compte {
    // Attributs
    private    int code;
    protected    float            solde;
    // Constructeur
    public compte (int c, float s)
    { code=c; solde=s; }

    // Méthode pour verser un montant
    public void verser (float mt)
    { solde+=mt; }
    // Méthode pour retirer un montant
    public    void    retirer    (float mt)
    { solde-=mt; }
    // Une méthode qui retourne l'état du compte
    public    String    toString    ()    {
        return
                (" Code = " +code+ " Solde = "  +solde)
    }}
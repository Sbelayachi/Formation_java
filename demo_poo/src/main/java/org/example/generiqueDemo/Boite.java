// boite avec contenu

package org.example.generiqueDemo;

public class Boite<T> { // au lieu de mettre le type String le pricise entre <> le type T (possibilité de mettre pls type)
    //je ne sais pas ce que je mets dans cet boite = attribut contenu (String)
private T  contenu;

public Boite(T contenu){
    this.contenu = contenu;
        }
public T getContenu() {
    return contenu;}

    public T setContenu() {
        return contenu;}

}



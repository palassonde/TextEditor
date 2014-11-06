package controlleur;

import vues.InterfaceEditeur;
import model.Document;

public class Controlleur {

	private Document document;
	private InterfaceEditeur vue;

	public Controlleur(Document model, InterfaceEditeur vue) {
		this.document = model;
		this.vue = vue;
	}
	
	public void creerNouveauDocument(){
		
		
	}

	public void setTitreDocument(String titre) {
		document.setTitre(titre);
	}
	
	public void setTitreSection(String titre) {
		document.getSectionCourante().setTitre(titre);
	}

	public void updateView() {
		vue.update();
	}

	public void afficherVue() {
		vue.setSize(725, 460);
		vue.setVisible(true);
		
	}

}

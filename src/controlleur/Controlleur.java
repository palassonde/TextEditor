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

	public void setTitreDocument(String titre) {
		document.setTitre(titre);
	}

	public void updateView() {
		vue.update();
	}

}

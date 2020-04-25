package com.bborkovic.sah.figure;

import com.bborkovic.sah.Ploca.Pozicija;
import com.bborkovic.sah.igra.Boja;

abstract class Figura {

	private Pozicija poz;
	private Boja boja;

	public Figura(Pozicija p, Boja b) {
		this.poz = p;
		this.boja = b;
	}

	public boolean pomakniNa( Pozicija p ) {
		this.poz = p;
		return true;
	}
	
}

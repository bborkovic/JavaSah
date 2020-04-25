package com.bborkovic.sah.Ploca;

public class Pozicija {

	private int x;
	private int y;

	private Pozicija(int x, int y ) {
		this.x = x;
		this.y = y;
	}
	
	private boolean dobra() {
		if ( x >= 1 && x <= 8 && y >= 1 && y <= 8 ) return true;
		return false;
	}
	
	public static boolean dobraPozicija(Pozicija poz) {
		if ( poz.dobra() ) return true;
		return false;
	}
	
	public static Pozicija KreirajNovu( int x, int y ) {
		return new Pozicija(x,y);
	}
	
}

package org.inheritance;

public class HierarchicalInh extends Hierarch {
	public void stun() {
		System.out.println("Stun");
	}
	public static void main(String[] args) {
		HierarchicalInh h = new HierarchicalInh();
		h.stun();
		h.acestothree();
	}

}

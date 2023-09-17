package controller;

public class PilhaString {

	public PilhaString() {
		super();
	}
	
	public void StringPilha(String[]vetor) throws Exception {
		model.PilhaString ps = new model.PilhaString();
		model.PilhaString ps2 = new model.PilhaString();
		String saida;
		for(int i = 0; i < 7; i++) {
			ps.push(vetor[i]);
		}
		
		while(!ps.isEmpty()) {
			if(ps.top() == "R" || ps.top() == "W") {
				saida = ps.pop();
				System.out.println("Saida "+saida);
			}else {
				if(ps.top() == "J" || ps.top() == "H") {
					ps.pop();
				}else {
					ps2.push(ps.pop());
				}
			}
		}
		
		while(!ps2.isEmpty()) {
			if(ps.size() == 2 || ps.size() == 4) {
					ps.push("M");
			}else {
				ps.push(ps2.pop());
			}
		}
			ps.push("K");
	}

}

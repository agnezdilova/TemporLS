package su.nsk.iae.tempor.generator;

public class EDTLUtils {
	
	static String impl = "->";
	static String and = "&&";
	static String or = "||";
	static char not = '!';
	
	static public String EDTLtupleToLTL(EDTLtuple t) {
		/*0-False,1-True,2-Exists*/
		int flag =0;
		
		String trig = t.getTrigger();
		String inv = t.getInvariant();
		String rel = t.getRelease();
		String rea = t.getReaction();
		String del = t.getDelay();
		String fin = t.getFinale();
		
		if(trig.equals("True")) {
			flag+=1;
		}else {
			flag+=2;
		}
		flag = flag*10;
		if(inv.equals("True")) {
			flag+=1;
		} else if (!inv.equals("False")) {
			flag+=2;
		}
		flag = flag*10;
		if(rel.equals("True")) {
			flag+=1;
		} else if (!rel.equals("False")) {
			flag+=2;
		}
		flag = flag*10;
		if(rea.equals("True")) {
			flag+=1;
		} else if (!rea.equals("False")) {
			flag+=2;
		}
		flag = flag*10;
		if(del.equals("True")) {
			flag+=1;
		} else if (!del.equals("False")) {
			flag+=2;
		}
		flag = flag*10;
		if(fin.equals("True")) {
			flag+=1;
		} else if (!fin.equals("False")) {
			flag+=2;
		}
		
		switch (flag){
		case 200102: return "G ("+trig+impl+"(("+inv+and+" ("+not+fin+")) W ("+rel+or+"("+fin+and+"("+inv+and+rea+")))))";
		case 212221: return "G ("+trig+impl+" (("+not+del+") W ("+rel+or+rea+")))";
		case 112221: return "G (("+not+del+") W ("+rel+or+rea+")) = (G "+not+del+")"+or+"G("+not+del+or+rel+or+rea+")";
		case 210221: return "G ("+trig+impl+" (("+not+del+") W "+rea+"))";
		case 110221: return "G (("+not+del+") W "+rea+")";
		case 210222: return "G ("+trig+impl+" (("+not+fin+") W ("+fin+and+" (("+not+del+") W "+rea+"))))";
		case 110222: return "G (("+not+fin+") W ("+fin+and+" (("+not+del+") W "+rea+")))";
		case 210212: return "G ("+trig+impl+" (("+not+fin+") W ("+fin+and+rea+")))";
		case 110212: return "G (("+not+fin+") W ("+fin+and+rea+"))";
		case 212212: return "G ("+trig+impl+" (("+not+fin+") W ("+rel+or+"("+fin+and+rea+"))))";
		case 112212: return "G (("+not+fin+") W ("+rel+or+"("+fin+and+rea+")))";
		case 220221: return "G ("+trig+impl+" (("+inv+and+" ("+not+del+")) W ("+inv+and+rea+")))";
		case 120221: return "G (("+inv+and+" ("+not+del+")) W ("+inv+and+rea+"))";
		case 222221: return "G ("+trig+impl+" (("+inv+and+" ("+not+del+")) W ("+rel+or+"("+inv+and+rea+"))))";
		case 122221: return "G (("+inv+and+" ("+not+del+")) W ("+rel+or+"("+inv+and+rea+")))";
		case 220222: return "G ("+trig+impl+" (("+inv+and+" ("+not+fin+")) W ("+fin+and+" (("+inv+and+" ("+not+del+")) W ("+inv+and+rea+")))))";
		case 120222: return "G (("+inv+and+" ("+not+fin+")) W ("+fin+and+" (("+inv+and+" ("+not+del+")) W ("+inv+and+rea+"))))";
		case 220212: return "G ("+trig+impl+" (("+inv+and+" ("+not+fin+")) W ("+fin+and+" ("+inv+and+rea+"))))";
		case 120212: return "G (("+inv+and+" ("+not+fin+")) W ("+fin+and+" ("+inv+and+rea+")))";
		case 220202: return "G ("+trig+impl+" (("+inv+and+" ("+not+fin+")) W ("+fin+and+" ("+inv+" W ("+inv+and+rea+")))))";
		case 120202: return "G (("+inv+and+" ("+not+fin+")) W ("+fin+and+" ("+inv+" W ("+inv+and+rea+"))))";
		case 122212: return "G (("+inv+and+" ("+not+fin+")) W ("+rel+or+"("+fin+and+" ("+inv+and+rea+"))))";
		case 220211: return "G ("+trig+impl+" ("+inv+and+rea+"))";
		case 120211: return "G ("+inv+and+rea+")";
		case 220201: return "G ("+trig+impl+" ("+inv+" W ("+inv+and+rea+")))";
		case 120201: return "G ("+inv+" W ("+inv+and+rea+")) = (G "+inv+") "+and+" G("+inv+or+rea+")";
		case 222201: return "G ("+trig+impl+" ("+inv+" W ("+rel+or+"("+inv+and+rea+"))))";
		case 122201: return "G ("+inv+" W ("+rel+or+"("+inv+and+rea+")))";
		case 222001: return "G ("+trig+impl+" ("+inv+" W "+rel+"))";
		case 122001: return "G ("+inv+" W "+rel+") = G( (G "+inv+")"+or+"("+inv+" U "+rel+")) = (G "+inv+")"+or+"G("+inv+or+rel+")";
		case 212222: return "G (("+trig+and+" ("+not+rel+")) "+impl+" (("+not+fin+") W ("+fin+and+" (("+not+del+") W ("+rel+or+rea+")))))";
		case 112222: return "G (("+not+rel+") "+impl+" (("+not+fin+") W ("+fin+and+" (("+not+del+") W ("+rel+or+rea+")))))";
		case 222222: return "G (("+trig+and+" ("+not+rel+")) "+impl+" (("+inv+and+" ("+not+fin+")) W ("+fin+and+" (("+inv+and+" ("+not+del+")) W ("+rel+or+"("+inv+and+rea+"))))))";
		case 122222: return "G (("+not+rel+") "+impl+" (("+inv+and+" ("+not+fin+")) W ("+fin+and+" (("+inv+and+" ("+not+del+")) W ("+rel+or+"("+inv+and+rea+"))))))";
		case 222202: return "G (("+trig+and+" ("+not+rel+")) "+impl+" (("+inv+and+" ("+not+fin+")) W ("+fin+and+" ("+inv+" W ("+rel+or+"("+inv+and+rea+"))))))";
		case 122202: return "G (("+not+rel+") "+impl+" (("+inv+and+" ("+not+fin+")) W ("+fin+and+" ("+inv+" W ("+rel+or+"("+inv+and+rea+"))))))";
		case 222211: return "G ("+trig+impl+" ("+rel+or+"("+inv+and+rea+")))";
		case 122211: return "G ("+rel+or+"("+inv+and+rea+"))";
		case 212211: return "G ("+trig+impl+" ("+rel+or+rea+"))";
		case 112211: return "G ("+rel+or+rea+")";
		case 220112: return "G ("+trig+impl+" (("+inv+and+" ("+not+fin+")) W ("+fin+and+inv+")))";
		case 220001: return "G ("+trig+impl+" (G "+inv+"))";
		case 220111: return "G ("+trig+impl+inv+")";
		case 120111: return "G "+inv+"";
		case 210211: return "G ("+trig+impl+rea+")";
		case 110211: return "G "+rea+"";
		default: return "G (("+trig+and+" ("+not+rel+")) "+impl+" (("+inv+and+" ("+not+fin+")) W ("+fin+and+" (("+inv+and+" ("+not+del+")) W ("+rel+or+"("+inv+and+rea+"))))))";
		}
		
	}
}

/*
 * return
 * */

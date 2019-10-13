package aula08.exercicio3;

public enum Prize {
	twFive(25), fifty(50), hundTwFive(125), twoHundFifty(250), fiveHund(500), sevenHund(750), oneThousFiveHund(1500),
	twoThousFiveHund(2500), fiveThous(5000), tenThous(10000), sixteenThous(16000), thirtyTwoThous(32000), sixtyFourThous(64000),
	hundTwFiveThous(125000), twoHundFiftyThous(250000);
	
	private int num;
	
	Prize(int num) {
		this.num = num;
	}
	
	public int getNum(){
		return num;
	}
	
	public static Prize nextPrize(Prize p) {
		
		Prize p2 = null;
		
		switch(p.getNum()){
		case 25:
			p2 = fifty;
			break;
		case 50:
			p2 = hundTwFive;
			break;
		case 125:
			p2 = twoHundFifty;
			break;
		case 250:
			p2 = fiveHund;
			break;
		case 500:
			p2 = sevenHund;
			break;
		case 750:
			p2 = oneThousFiveHund;
			break;
		case 1500:
			p2 = twoThousFiveHund;
			break;
		case 2500:
			p2 = fiveThous;
			break;
		case 5000:
			p2 = tenThous;
			break;
		case 10000:
			p2 = sixteenThous;
			break;
		case 16000:
			p2 = thirtyTwoThous;
			break;
		case 32000:
			p2 = sixtyFourThous;
			break;
		case 64000:
			p2 = hundTwFiveThous;
			break;
		case 125000:
			p2 = twoHundFiftyThous;
			break;
		case 250000:
			break;
		
		}
		return p2;
	}
}
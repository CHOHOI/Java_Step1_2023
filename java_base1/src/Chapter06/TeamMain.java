package Chapter06;

public class TeamMain {

	public static void main(String[] args) {
		
		TeamGroup team=new TeamGroup();
		TeamMember t=new TeamMember();
		//∏ﬁº“µÂ∏¶ ≈Î«ÿº≠ ∆¿∏Ì¿ª √ ±‚»≠
		t.setTeamName("IT«¡∑ª¡Ó");
		System.out.println("∆¿∏Ì : "+t.getTeamName());
		System.out.println("------[∆¿ø¯ ∏Ì¥‹]-----");
		team.init();
		team.Disp();
		
		System.out.println();
		t.setmName("±Ë∫¥»ø");
	    System.out.println("∆¿¿Â¿Ã∏ß : " + t.getmName());
	    t.setMPhone("0102223333");
	    System.out.println("∆¿¿Âπ¯»£ : " + t.getMPhone());
	    t.setsName("¿Ã√§¿±");
	    System.out.println("∫Œ∆¿¿Â¿Ã∏ß : " + t.getsName());
	    
	    
		
		
		
		
		

	}

}

package test06_7;

public class Score {
	static int extra = 500;
	    public static int changeScore(int score, Boolean bonus, int extra) {
	    if (bonus == true) {
		    //System.out.println(bonus);
	        score += extra;
	    }
	    //System.out.println(score);
	    return score;
	}
	    
	public static void main(String[] args) {
		Boolean bonus = true;
	    int score = 10;
	    int newScore = changeScore(score, bonus, 100);
	    System.out.println(score);
	    System.out.println(newScore);
    }
}


package org.techHub.hackerRank;

public class DeveloperSkillLevelOne {

    public static void main(String[] args) {
	System.out.println(result(4));
    }

    private static int result(int i) {
	if(i == 0) { 
	    return 0;
	}else if(i == 1) {
	    return 1;
	}else {
	    return result(i - 1) + result(i - 2);
	}
    }
}

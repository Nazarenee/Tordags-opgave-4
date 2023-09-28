class Team{
private String teamname;
private int rank;
private String playername;



public Team(String teamname, String playername){
this.teamname = teamname;
this.playername = playername;
}


public void setRank(int rank){
this.rank = rank;
}


public String getTeamname(){
return teamname;
}

public int getRank(){
	return rank;
}

public String getPlayername(){
	return playername;
}



public String toString(){
String s = ("Hold : " + teamname + " " + "rank" + " " + rank + " spillere" + " " + playername);
return s;
  }


public static void main (String[]args){

Team t1 = new Team("De seje", "Jonas, Morten, Hans og Knud");
Team t2 = new Team("De rå", "Mikkel, Anders, Jon og Knud");
Team t3 = new Team("De stærke", "Hans, Mathias, Andreas og Knud");
Team t4 = new Team("De små", "Lukas, Chris, Axel og Knud");
Team t5 = new Team("De store", "Frank, Kurt, Mogens og Knud");
t1.setRank(100);
t2.setRank(200);
t3.setRank(300);
t4.setRank(400);
t5.setRank(500);

System.out.println(t1);
System.out.println(t2);
System.out.println(t3);
System.out.println(t4);
System.out.println(t5);
}
}












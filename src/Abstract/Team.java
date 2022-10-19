package Abstract;

import java.util.ArrayList;
import java.util.ListIterator;

public class Team<T extends Player> {  //player sınıfından türeyen tür T
    private String name;
    int played =0;
    int won=0;
    int lost=0;
    int tied=0;


    private ArrayList<T> members = new ArrayList<>(); //Dizi listesi T türünden oluşarak takım üzerinde bulunan oyuncyların türüne göre belirlenir

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public boolean addPlayer(T player){
        if(members.contains(player)){
            System.out.println(player.getName() + "is already on this team");
            return false;
        }else{
            members.add(player);
            System.out.println(player.getName() +" picked for team " +this.name);
            return true;
        }
    }
    public int numPlayers(){
        return this.members.size();
    }
    public void matchResult(Team<T> opponent,int ourScore,int theirScore){  //rakip ve takım aynı tipte olmalı
        String message;
        if(ourScore > theirScore){
            won++;
            message = " beat ";
        }else if(ourScore == theirScore){
            tied++;
            message = " drew with ";
        }else {
            lost++;
            message = " lost to ";
        }
        played++;
        if(opponent!=null){
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null,theirScore,ourScore);
        }
    }

}

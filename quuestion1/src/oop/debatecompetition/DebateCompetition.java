package oop.debatecompetition;

import java.util.ArrayList;
import oop.debater.Debater;
import oop.judge.Judge;

public class DebateCompetition {
    
    private String topic;
    private Debater debater1;
    private Debater debater2;
    private ArrayList<Judge>panel;

    public DebateCompetition(String topic,String name1,String name2,String[] nameOfJudges) {
        this.topic = topic;
        this.debater1=new Debater(name1);
        this.debater2=new Debater(name2);
        panel=new ArrayList<Judge>();
        for(int i=0;i<panel.size();i++){
            Judge judge= new Judge(nameOfJudges[i]);
            panel.add(judge);
        }
        
        
        
    }

    public Debater getDebater1() {
        return debater1;
    }

    public Debater getDebater2() {
        return debater2;
    }

    public ArrayList<Judge> getPanel() {
        return panel;
    }
    
    public void scoreOfJudge(String name, int score){
        
        for(int i=0;i<name.length();i++){
           
            String name2=panel.get(i).getName();
            if(name.equalsIgnoreCase(name2)){
                panel.get(i).setScore(score);
            }
        }
    }
    public void judgeDebater(Debater debater1, String[]nameOfJugdes, int[] scoresOfJudges){
        int total=0;
        for (int i=0;i<nameOfJugdes.length;i++) {
             scoreOfJudge( nameOfJugdes[i],  scoresOfJudges[i]);
             total+=panel.get(i).getScore();
             
        }
        int avgScore=total/panel.size();
        
    }
}
    
    


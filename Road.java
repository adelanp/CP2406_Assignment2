import javax.swing.*;
import java.awt.*;

public class Road extends JPanel {
    private TrafficLight light;
    private int numOfSegments; //length of road
    private final int roadWidth = 70;
    final int roadYPos;
    final int endRoadYPos;
    final int roadXPos;
    final int endRoadXPos;
    private Color lightColor = Color.green;
    private String orientation;
    String trafficDirection;

   
  
    public String getOrientation(){ return orientation;}
    public TrafficLight getTrafficLight(){
        return light;
    }
    public int getRoadLength(){
        return numOfSegments;
    }
    public int getRoadYPos(){
        return roadYPos;
    }
    public int getRoadXPos(){
        return roadXPos;
    }
    public int getEndRoadYPos(){
        return endRoadYPos;
    }
    public int getEndRoadXPos(){
        return endRoadXPos;
    }
    public String getTrafficDirection(){ return trafficDirection; }
    public void setLightColor(Color c){
        lightColor = c;
    }

}

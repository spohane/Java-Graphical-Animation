
//public class Movie extends JPanel implements ActionListener

public class Movie {

    public static void main(String[] args) {
    	
    	Sprite warning= new Sprite("warning.png");
    	Sprite hit=new Sprite("hit.png");
    	Sprite levelup=new Sprite("level.png");
        // TODO Auto-generated method stub
        Animation background = new Animation (878,644);
        background.setBackgroundImage("Background.png"); 
        //background.frameFinished();
    
        int map_x=18,map_y=9,i,j;
//        int map[10][19];
      int level=0;
      int goodguyx=0;
      int badguyx=575, baadguyaddval=20, badguymult=-1;
        int[][] map= new int[10][19]; 
        map = new int[][]{  
            {1,1,1,-1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,-2,1,0,0,0,0,0},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0},
            {1,0,0,0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0},
            {1,0,0,0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0},
            {1,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0},
            {1,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0},
            {1,0,0,0,0,0,0,0,0,1,1,1,1,1,0,0,0,0,0},
            {1,0,0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0,0},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0}
            };
        
        for(j=0;j<=map_y;j++) 
            {for (i=0;i<=map_x;i++)
                {
                          if (map[j][i]>0)
                          {
                                      Sprite row3=new Sprite("Row1.png");
                                      row3.setPosition((i)*64,(j)*64);
                                            background.addSprite(row3);

                          }
   
                
                          if (map[j][i]==-1)
                          {
                                      Sprite row4=new Sprite("fire.png");
//                                    row3.setPosition((i)*64,(j)*32);
                                    row4.setPosition((i)*64,(j)*32);
                                            background.addSprite(row4);
                        }     
                          if (map[j][i]==-2)
                          {
                                      Sprite door=new Sprite("door.png");
//                                    row3.setPosition((i)*64,(j)*32);
                                    door.setPosition((i)*64,(j)*64);
                                            background.addSprite(door);
...........

...........

...........
...........

...........

	
        	if(goodguy.getXposition()>491 && goodguy.getXposition()<619){
        		hit.setPosition(439, 322);
            	background.addSprite(hit);
            	background.frameFinished();
        	}
        	else
            	background.removeSprite(hit);
        	
        	if(goodguy.getXposition()>730){
            	
            	levelup.setPosition(439, 322);
            	background.addSprite(levelup);
            }
        	
        }
    	}	
    }
      
      
    }
}

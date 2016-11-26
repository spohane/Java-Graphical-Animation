
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
                        }     
                        	  

                
                }}; 
    

        Sprite goodguy= new Sprite("GoodGuy.png");
        goodguy.setPosition(0,64);
        background.addSprite(goodguy);
        //background.frameFinished();
        
       Sprite badguy= new Sprite("badguy.png");
       badguy.setPosition(500,64);
       background.addSprite(badguy);
       
       
       
       int input=0; //IO.readInt();
       int newpos=0;
      while(input!=-1)
      {	  newpos=goodguyx;
    	  String command=IO.readString();
          int space=command.indexOf(' ');
          String move=command.substring(0, space);
   //       System.out.println(move);
 		 System.out.println(goodguyx);
          String in=command.substring(space+1);
         
           input= Integer.parseInt(in);
          //System.out.println(input);
    	//input=IO.readInt(); 
    	if(move.equals("jump")==true&&input==1)
    	{	
    		 System.out.println("jumping");
    		 goodguyx+=136;
    		 goodguy.setPosition(goodguyx,64);
    		 background.frameFinished();
    		 System.out.println(goodguyx+" and "+(goodguyx+64)/64+" and "+(goodguyx)/64+ "and "+ map[(65/64-1)][(goodguyx+64)/64]+"and "+map[(65/64-1)][(goodguyx)/64]);

	       //System.out.println("bad guy position "+Newposition+"I val "+i1+" I val / 64:"+i1/64+" MAP val:"+map[(64/64-1)][(i1+63)/64]);         
	 //           if(map[(65/64-1)][(goodguyx+124)/64]==-1||map[(65/64-1)][(goodguyx+24)/64]==-1){
    		// if(map[(65/64-1)][(goodguyx+14)/64]==-1||map[(65/64-1)][(goodguyx+84)/64]==-1){
      if(map[(65/64-1)][(goodguyx+64)/64]==-1||map[(65/64-1)][(goodguyx)/64]==-1){
    		 //if(goodguyx>128&&goodguyx<256){
        			System.out.println("warn");    	           	
	            	warning.setPosition(439, 322);
	            	background.addSprite(warning);
	            	background.frameFinished();
	            }
	   if(goodguyx>256){ 
	            	background.removeSprite(warning);
	            	background.frameFinished();}
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
    	
    	if(move.equals("l")==true)
    	{	
    	for( goodguyx=newpos;goodguyx<newpos+input;goodguyx+=20){
            goodguy.setPosition(goodguyx,64);
   		 System.out.println(goodguyx);   
            	 /*for(int i2=500;i2<650;i2+=75){
                 	badguy.setPosition(i2,64);
                 	background.frameFinished();
            	 }*/
          
            baadguyaddval=baadguyaddval*badguymult;
            int Newposition=badguyx+baadguyaddval;
            badguy.setPosition(Newposition,64);
            
           background.frameFinished();
    	// 260 out of fire
       //System.out.println("bad guy position "+Newposition+"I val "+i1+" I val / 64:"+i1/64+" MAP val:"+map[(64/64-1)][(i1+63)/64]);         
            if(map[(65/64-1)][(goodguyx+84)/64]==-1||map[(65/64-1)][(goodguyx+24)/64]==-1){
            	
            	warning.setPosition(439, 322);
            	background.addSprite(warning);
            	//background.frameFinished();
            }
            else
             	background.removeSprite(warning);
            
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
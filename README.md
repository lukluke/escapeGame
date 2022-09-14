# escapeGame
This is escapeGame using Java

A mouse is trying to escape from a maze where it starts moving from the top-left corner 
(0,0)  to  the  exit  in  the  bottom-right  corner  (6,6).  It  moves  according  to  the  following 
rules: 
 
o The mouse has 40% chance to go forward along the same direction. 
o The mouse has 30% chance to turn left and 30% chance to turn right.  
o The  initial  moving  direction  is  indicated  by  the  pointer.  So,  if  the  mouse 
chooses to go forward, it will reach (1,0) in the next step. 
o The new position must be within the boundaries of the maze. 
o The new position must not have been visited previously. 
o If the new position does not fulfil the criteria above, the mouse will try another 
move again. Every decision is independent of the others. 
o If the mouse reaches a dead-end - all directions are not enterable, it fails to 
leave the maze. 
o The mouse continues to move until it reaches the exit. 


the Monte Carlo method to estimate the probability 
(P) of the mouse successfully escaping from the maze. The simulation should run one 
million times. Your program should print out the simulation results clearly and round 
the success rate P to 3 digits after the decimal point as follow: 
 
  The Monte Carlo simulation result of one million runs: 
No. of successful escape: 279451 
Success Rate P: 0.279 
 
The  acceptable  range  of  the  success  rate  is  0.278  -  0.281  and  the  execution  time 
should be less than 5 seconds. 

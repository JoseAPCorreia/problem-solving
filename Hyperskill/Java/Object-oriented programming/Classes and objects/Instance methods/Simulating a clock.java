//https://hyperskill.org/learn/step/2989

class Clock {

    int hours = 12;
    int minutes = 0;

    public void next(){
        if(minutes == 59){
            minutes = 0;
            if(hours == 12){
                hours = 1;
            }else{
                hours +=1;
            }
            
        }else{
            minutes += 1;
        }
    }
}
public class Project19 {

    public int solution(){
        int daycounter = 1;
        int ret = 0;
        for(int year=1900;year<=2000;year++){
            for(int month=1;month<=12;month++){
                if(daycounter%7==0 && year!=1900){
                    ret++;
                    System.out.println(month + " " + year);
                }
                if(month==9 || month==4 || month==6 || month==11){
                    for(int day=1;day<=30;day++){
                        daycounter++;
                    }
                }else if(month==2){
                    for(int day=1;day<=28;day++){
                        daycounter++;
                    }
                    if(year%100==0 && year%400==0){
                        daycounter++;
                    }
                    if(year%4==0 && year%100!=0){
                        daycounter++;
                    }
                }else{
                    for(int day=1;day<=31;day++){
                        daycounter++;
                    }
                }
            }
        }
        return ret;
    }
}

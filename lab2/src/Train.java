import java.util.Date;

    public class Train {
        private String arr_point, num;
        private Date time;
        private int seats;

        String getArrPoint(){
            return arr_point;
        }

        String getNum(){
            return num;
        }

        Date getTime(){
            return time;
        }

        int getSeats(){
            return seats;
        }

        void setArrPoint(String a_p){
            this.arr_point = a_p;
        }

        void setNum(String num){
            this.num = num;
        }
        void setTime(int time){
            this.time.setTime(time);
        }

        void setSeats(int seats){
            this.seats = seats;
        }

        public Train(String arr_point,String num , int time, int seats){
            this.arr_point = arr_point;
            this.num = num;
            this.time = new Date(time);
            this.seats = seats;
        }

        @Override
        public String toString(){
        return  "\n------------------------------------------\n"+
                "Arrival point: " + this.arr_point +
                "Train number: " + this.num + "\n" +
                "Departure time: " + this.time + "\n"+
                "Num of seats: " + this.seats+ "\n" +
                "------------------------------------------\n";
        }


    }


